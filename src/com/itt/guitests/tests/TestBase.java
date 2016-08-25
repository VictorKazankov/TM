import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by v_kazankov on 10.08.2016.
 */
public class TestBase {

    protected ElementsManager app;



    @BeforeClass
    public void setUp() throws FindFailed {
        app = new ElementsManager();

    }

    @AfterClass
    public void tearDown() {
        app.stop();

    }
}
