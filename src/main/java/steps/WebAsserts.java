package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ExoElement;

import static util.Utility.getDriver;

public class WebAsserts {

    public static final Wait<WebDriver> WAIT = new WebDriverWait(getDriver(), 10);

    public static void waitForElement(ExoElement awaitedElement) {
        WAIT.until(ExpectedConditions.visibilityOfElementLocated(awaitedElement.getLocator()));
    }
}
