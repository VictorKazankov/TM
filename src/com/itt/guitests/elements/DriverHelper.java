import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.Screen;

/**
 * Created by v_kazankov on 10.08.2016.
 */
public class DriverHelper {
    private static WebDriver driver;
    private static Screen screen;

    public DriverHelper(){
        driver = new InternetExplorerDriver();
        //driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://192.168.17.81/TM/TM.jsp");
    }

    public void stop() {
        driver.close();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public synchronized static Screen getInstance() {
        if (screen == null){
            screen = new Screen();
        }
        return screen;
    }
}
