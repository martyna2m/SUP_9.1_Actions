package tests;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import pages.DragAndDropPage;
import testbase.TestBase;
import utils.ScreenshotMaker;

public class DragAndDropTest extends TestBase {

    @RepeatedTest(1)
    @Tag("tests")
    public void dragAndDropBlocks() {
        openWebsite("https://demo.aspnetawesome.com/DragAndDropDemo");
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        ScreenshotMaker screenshotMaker = new ScreenshotMaker(driver);

        dragAndDropPage.dragAndDropBoxes(actions);
        screenshotMaker.takeScreenShot();

    }

}
