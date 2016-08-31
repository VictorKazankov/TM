import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by v_kazankov on 09.08.2016.
 */
public class AddNewMedia extends TestBase{

    @Test(description = "Login to home page of moduls",priority = 0)
    public void testLoginUser() throws FindFailed {
        String login = "lena";
        String password = "1q2w3e4r";
        new TranslateCyrillic(login);
        new TranslateCyrillic(password);
        Assert.assertTrue(app.getLoginElements().CorrectLoginAndPassvord(login, password));

    }

    @Test(description = "Open GPA directory in Tree",priority = 1)
    public void testOpenTree() throws FindFailed {
        Assert.assertTrue(app.getTreeElements().OpenGPAfolder());
    }

    @Test(description = "Add and Save new media",priority = 2)
    public void testAddAndSaveNewMediaElement() throws FindFailed {
        String pathFile1 = "D:\\ProjectInfo\\TM\\resourses\\ImageTest1.jpg";
        //String pathFile2 = "D:\\ProjectInfo\\TM\\resourses\\ImageTest2.jpg";
        new TranslateCyrillic(pathFile1);
        Assert.assertTrue(app.getTreeElements().AddElementToTable());
        Assert.assertTrue(app.getTreeElements().AddImage(pathFile1));
    }

    @Test(description = "Delete media", priority = 3)
    public void testDeleteMediaElement() throws FindFailed{
        Assert.assertTrue(app.getTreeElements().DeleteElementFromTable());
    }


}
