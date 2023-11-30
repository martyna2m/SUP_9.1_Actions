package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
@Setter
public class DragAndDropPage {

    WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".dropZone>.ditem")
    private List<WebElement> boxes;

    @FindBy(xpath = "//p[contains(text(), 'drop')]/parent::div")
    private WebElement dropZone;


    public void dragAndDropBoxes(Actions actions) {
        for (WebElement box : boxes) {
            holdAndMove(box, dropZone, actions);
        }

    }

    private void holdAndMove(WebElement draggableElement, WebElement dropZone, Actions actions) {
        actions.clickAndHold(draggableElement)
                .moveByOffset(10, 10)
                .moveToElement(dropZone)
                .pause(5)
                .release()
                .build()
                .perform();
    }

}



