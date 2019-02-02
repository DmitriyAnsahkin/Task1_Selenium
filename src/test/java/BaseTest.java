//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//
//public class BaseTest {
//    protected static WebDriver driver;
//    protected static String baseUrl;
//    public static Properties properties = TestProperties.getInstance().getProperties();
//
//
//    @BeforeClass
//    public static void setUp() throws Exception {
//        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
//        driver = new ChromeDriver();
//        baseUrl = properties.getProperty("app.url");
//        driver.get(baseUrl);
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @AfterClass
//    public static void tearDown() throws Exception {
//        driver.quit();
//    }
//    protected void fillField(By locator, String value) {
//        driver.findElement(locator).clear();
//        driver.findElement(locator).sendKeys(value);
//    }
//}

import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import other.Init;
        import steps.MainPageSberbankSteps;

public class BaseTest{

    @Before
    public void begin(){
        Init.begin(true);
    }

    @After
    public void after(){
        Init.end(true);
    }

    @Test
    public void test(){
        MainPageSberbankSteps mainPageSberbankSteps = new MainPageSberbankSteps();

        // Step 2. Кликнуть по кнопке "Страхование"
        mainPageSberbankSteps.clickTopMenuItem("Страхование");
        // Step 3. Выбрать "Путешествия и покупки"
        mainPageSberbankSteps.chooseSubItemTopMenu("Путешествия и покупки");

        // mainPageSberbankSteps.chooseSubItemTopMenu("Страхование", "Путешествия и покупки");


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("fefs");
    }
}