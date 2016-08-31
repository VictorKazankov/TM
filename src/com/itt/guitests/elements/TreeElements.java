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
    private Pattern mediaTabLabel;
    private Pattern addMediaButton;
    private Pattern newMediaString;
    private Pattern addImageLink;
    private Pattern fileNameField;
    private Pattern openButton;
    private Pattern addedStringMedia;
    private Pattern saveButton;
    private Pattern deleteButton;

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
        fileNameField = new Pattern("fileNameField.png");
        openButton = new Pattern("openButton.png");
        addedStringMedia = new Pattern("addedItemMedia.png");
        saveButton = new Pattern("saveButton.png");
        deleteButton = new Pattern("deleteButton.png");
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
            //click(newMediaString);
            return true;
        }catch (FindFailed e){
            return false;
        }
    }

    public boolean AddImage(String pathFile1) {
        try{click(addImageLink);
            typeToField(fileNameField,pathFile1);
            click(openButton);
            click(saveButton);
            waitLocator(addedStringMedia);
            return true;
        }catch (FindFailed e){
            return false;
        }

    }

    public boolean DeleteElementFromTable() throws FindFailed {
        try{click(addedStringMedia);
            click(deleteButton);
            return true;
        }catch (FindFailed e){
            return false;
        }

    }
}
