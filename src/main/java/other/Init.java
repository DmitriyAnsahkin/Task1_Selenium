package other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Init{

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void begin(boolean maximaze){
        String os = get_os();
        if (os.equals("Mac")){
            System.setProperty("webdriver.chrome.driver", "drv/chromedriver");
        }
        else if (os.equals("Windows")){
            System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
            if (maximaze) driver.manage().window().maximize();
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get((String) SingletonForProperties.getInstance().getProperties().get("base.url"));
        // driver.get("https://yandex.ru");
    }

    public static void end(boolean close){
        if (close) driver.close();
    }

    private static String get_os(){
        String OS = System.getProperty("os.name").toLowerCase();
        if (OS.contains("mac")){
            return "Mac";
        }
        else if (OS.contains("win")){
            return "Windows";
        }
        else if (OS.contains("nix"))
            return "Linux";
        return "UnknownOS";
    }
}