package pages;

import org.openqa.selenium.By;

public class ExoElement {

    protected String name;

    protected By locator;

    public ExoElement(String name, By locator) {
        this.name = name;
        this.locator = locator;
    }

    public String getName() {
        return name;
    }

    public By getLocator() {
        return locator;
    }
}
