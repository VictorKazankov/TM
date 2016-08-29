import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

/**
 * Created by v_kazankov on 29.08.2016.
 */
public class TreeElements extends HelperWithDriverBase {

    private Pattern nameKS;
    private Pattern nameKC;
    private Pattern rootFolderGPA;
    private Pattern pathGPAfolder;

    public TreeElements(ElementsManager manager) throws FindFailed {
        super(manager);
        nameKS = new Pattern("nameKS.png");
        nameKC = new Pattern("nameKC.png");
        rootFolderGPA = new Pattern("rootFolderGPA.png");
        pathGPAfolder = new Pattern("pathGPAfolder");

    }


    public boolean OpenGPAfolder() throws FindFailed {
        try{waitAndDoubleClick(nameKS);
            waitAndDoubleClick(nameKC);
            click(rootFolderGPA);
            waitLocator(pathGPAfolder);
            return true;
        }catch (FindFailed e){
            return false;
        }



    }
}
