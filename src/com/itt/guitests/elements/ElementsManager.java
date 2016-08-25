import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;

/**
 * Created by v_kazankov on 10.08.2016.
 */
public class ElementsManager {

    private DriverHelper driverHelper;
    public LoginElements loginElements;

    public ElementsManager(){
        driverHelper = new DriverHelper();
        //формируюм ссылку на картинки используемые в качестве локаторов
        String pathProject = ImagePath.getBundlePath();
        String pathScreen = pathProject + "//resourses";
        ImagePath.setBundlePath(pathScreen);

    }

    public void stop() {
        driverHelper.stop();
    }

    public DriverHelper getDriverHelper() {
        return driverHelper;
    }

    public LoginElements getLoginElements() throws FindFailed {

        if (loginElements == null){
            loginElements = new LoginElements(this);
        }
        return loginElements;
    }
}
