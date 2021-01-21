package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ExoElement;

import java.util.logging.Logger;

import static java.lang.String.valueOf;
import static java.lang.Thread.sleep;
import static util.Utility.getDriver;

public class WebSteps {

    private static final Logger LOGGER = Logger.getLogger("Web steps logger");

    private static final byte TIMEOUT = 1;

    @Step(value = "Открытие страницы \"{url}\"")
    public static void openPage(String url) {
        getDriver().get(url);
        sysWait();
    }

    @Step(value = "Клин по элементу \"{element.name}\"")
    public static void click(ExoElement element) {
        sysWait();
        find(element.getLocator()).click();
        sysWait();
    }

    @Step(value = "Ввод текста в элемент \"{text}\" в \"{element.name}\"")
    public static void enterText(ExoElement element, String text) {
        sysWait();
        find(element.getLocator()).sendKeys(text);
        sysWait();
    }

    @Step(value = "Ввод текста в элемент \"{number}\" в \"{element.name}\"")
    public static void enterText(ExoElement element, int number) {
        enterText(element, valueOf(number));
    }

    private static WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    private static void sysWait() {
        try {
            sleep(TIMEOUT);
        } catch (InterruptedException e) {
            LOGGER.warning(e.getLocalizedMessage());
        }
    }
}
