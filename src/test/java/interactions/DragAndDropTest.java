package interactions;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import pages.DragAndDropPage;
import testbase.TestBase;
import utils.Screenshot;

public class DragAndDropTest extends TestBase {

    @RepeatedTest(1)
    @Tag("interactions")
    public void dragAndDropBlocks() {
        openWebsite("https://demo.aspnetawesome.com/DragAndDropDemo");
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        Screenshot screenshot = new Screenshot(driver);

        dragAndDropPage.dragAndDropBoxes(actions);
        screenshot.takeScreenShot();

    }

}
