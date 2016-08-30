import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.openqa.selenium.

/**
 * Created by v_kazankov on 29.08.2016.
 */
public class TreeElements extends HelperWithDriverBase {

    private Pattern nameKS;
    private Pattern nameKC;
    private Pattern rootFolderGPA;
    private Pattern pathGPAfolder;
    private Pattern mediaTabLabel;
    private Pattern addMediaButton;
    private Pattern newMediaString;
    private Pattern addImageLink;

    public TreeElements(ElementsManager manager) throws FindFailed {
        super(manager);
        nameKS = new Pattern("nameKS.png");
        nameKC = new Pattern("nameKC.png");
        rootFolderGPA = new Pattern("rootFolderGPA.png");
        pathGPAfolder = new Pattern("pathGPAfolder").similar(0.99f);
        mediaTabLabel = new Pattern("mediaTabLabel.png").similar(0.9f);
        addMediaButton = new Pattern("addMediaButton.png");
        newMediaString = new Pattern("newMediaString.png");
        addImageLink = new Pattern("addImageLink.png");
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

    public boolean AddElementToTable() throws FindFailed{
        try{click(mediaTabLabel);
            click(addMediaButton);
            waitLocator(newMediaString);
            click(newMediaString);
            return true;
        }catch (FindFailed e){
            return false;
        }
    }

    public boolean AddImage() {
        try{click(addImageLink);
            FileDownloader fileDownloader = new FileDownloader(getDriverObject());
            fileDownloader.setURI(secretFilesPage.getSecretFileHREF());
            File secretFile = fileDownloader.downloadFile();
            int httpStatusCode = fileDownloader.getLastDownloadHTTPStatus();
            assertEquals(httpStatusCode, 200);
            assertEquals(getFileHash(secretFile, SHA1), ("781811ab9052fc61e109012acf5f22da89f2a5be"));
            return true;
        }catch (FindFailed e){

        }
        return false;
    }
}
