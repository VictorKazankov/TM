import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class TranslateCyrillic {
    public TranslateCyrillic(String name) {
        StringSelection ss = new StringSelection(name);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }
}
