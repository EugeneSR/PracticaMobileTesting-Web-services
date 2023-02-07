import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static jdk.nashorn.internal.objects.Global.undefined;

public class ioSampleTest {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;
    public static String mobileElement;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        /***********Configuración del dispositivo y del Apk Viki ************************/
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 6 Pro API 30");
        caps.setCapability("udid","emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.viki.android");
        caps.setCapability("appActivity","com.viki.android.SplashActivity");
        caps.setCapability("noReset","false");
        /*********************************************************************************/

        try {
            /****************************Conexión al Servicio*****************************/
             driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
            wait = new WebDriverWait(driver, 20);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        /*********************************************************************************/
    }


    @Test
    public void basicTest () throws InterruptedException {
        //***************Código para hacer el proceso de Login **********************//
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout"))).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"))).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))).sendKeys("CandyN12342@outlook.");
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))).sendKeys("Candy123456..");
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))).sendKeys("CandyN12342@outlook.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))).sendKeys("Candy123456");

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.widget.TextView[@content-desc=\"authentication_alert_invalid_password_error\"]"))).isDisplayed();

        mobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.widget.TextView[@content-desc=\"authentication_alert_invalid_password_error\"]"))).getText();

        Assert.assertTrue(mobileElement.contains("The email or password you entered did not match our records. Please double-check and try again."));

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"))).click();

       wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))).sendKeys("CandyN12342@outlook.com");
       wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))).sendKeys("Candy123456..");
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//hierarchy/android.widget.FrameLayout"))).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.widget.FrameLayout[@content-desc=\"Me\"]/android.view.ViewGroup/android.widget.TextView"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout"))).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.widget.Button[@content-desc=\"Settings\"]"))).click();
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Log out\"))"));

        System.out.println(element.getLocation());
        element.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat"))).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//android.widget.Button[@content-desc=\"logout_confirmation_popup_ok\"]"))).click();

    }

    @AfterMethod
    public void teardown(){

       driver.quit();
    }
}

