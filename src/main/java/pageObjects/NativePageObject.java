package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pageObjects.nativePoageObjects.BudgetPageObject;
import pageObjects.nativePoageObjects.LogInPageObject;
import pageObjects.nativePoageObjects.RegistrationPageObject;

public class NativePageObject {

    private RegistrationPageObject registrationPage;
    private LogInPageObject logInPage;
    private BudgetPageObject budgetPage;

    public NativePageObject(AppiumDriver appiumDriver) {
        logInPage = new LogInPageObject(appiumDriver);
        registrationPage = new RegistrationPageObject(appiumDriver);
        budgetPage = new BudgetPageObject(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public BudgetPageObject getBudgetPage() {
        return budgetPage;
    }

    public LogInPageObject getLogInPage() {
        return logInPage;
    }

    public RegistrationPageObject getRegistrationPage() {
        return registrationPage;
    }
}
