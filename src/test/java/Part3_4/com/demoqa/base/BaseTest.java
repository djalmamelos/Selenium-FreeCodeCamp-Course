package Part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private static WebDriver driver;
    protected static BasePage basePage;
    protected static HomePage homePage;
    private static String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @BeforeMethod
    public static void loadApplication() {
        driver.get(DEMOQA_URL); // 1
        basePage = new BasePage(); // 2
        basePage.setDriver(driver); // 3
        setUtilityDriver(); // 4
        homePage = new HomePage(); // 5
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
           File source =  screenshot.getScreenshotAs(OutputType.FILE);
           File destination = new File((System.getProperty("user.dir")) +
                   "/resources/screenshot/(" +
                   LocalDate.now() +
                   testResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            }   catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At" + destination);
        }


    }


    @AfterClass
    public static void tearDown() {
        delay(3000);
        driver.quit();
    }
}
