import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by v_kazankov on 09.08.2016.
 */
public class Authorization extends TestBase{

    @Test(description = "Login to home page of moduls")
    public void testLoginUser() throws FindFailed {
        String login = "lena";
        String password = "1q2w3e4r";
        new TranslateCyrillic(login);
        new TranslateCyrillic(password);
        Assert.assertTrue(app.getLoginElements().CorrectLoginAndPassvord(login, password));

    }

}
