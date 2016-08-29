import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

/**
 * Created by v_kazankov on 10.08.2016.
 */
public class LoginElements extends HelperWithDriverBase{

    private Pattern nameUserField;
    private Pattern passwordUserField;
    private Pattern loginButton;

    public LoginElements(ElementsManager manager) throws FindFailed{
        super(manager);
        //homePageTM = new Pattern("loginPanel.png").similar(0.1f);
        nameUserField = new Pattern("nameUserField.png");
        passwordUserField = new Pattern("passwordUserField.png");
        loginButton = new Pattern("loginButton.png");

    }


    public boolean CorrectLoginAndPassvord(String login, String password) throws FindFailed {
        try{click(nameUserField);
            typeToField(nameUserField,login);
            click(passwordUserField);
            typeToField(passwordUserField,password);
            click(loginButton);
            return true;
        }catch (FindFailed e){
            return false;
        }



    }
}
