/**
 * Created by v_kazankov on 11.08.2016.
 */

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;


public class HelperWithDriverBase {

    protected final ElementsManager manager;
    private WebDriver driver;
    private Region page;
    protected Pattern homePageTM;

    public HelperWithDriverBase(ElementsManager manager) throws FindFailed {
        this.manager = manager;
        driver = manager.getDriverHelper().getDriver();
        homePageTM = new Pattern("homePageTM.png").similar(0.1f);
        page = manager.getDriverHelper().getInstance().wait(homePageTM);
    }

    protected void click(Pattern pattern) throws FindFailed {
        page.click(pattern);
    }

    protected void typeToField(Pattern pattern, String value) throws FindFailed {
        page.type(pattern, value);
    }

    protected void waitAndDoubleClick(Pattern pattern) throws FindFailed {
        page.wait(pattern, 10);
        page.doubleClick(pattern);
    }

    protected void waitLocator(Pattern label) throws FindFailed {
        page.wait(label, 10);
    }

    protected boolean waitVanishLocator(Pattern pattern) {
        return page.waitVanish(pattern);
    }

    protected Match existLocator(Pattern pattern) {
        return page.exists(pattern);
    }
}
