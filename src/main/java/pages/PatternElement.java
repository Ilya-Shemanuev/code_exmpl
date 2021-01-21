package pages;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class PatternElement extends ExoElement {

    private String pattern;
    private String namePattern;

    public PatternElement(String namePattern, String pattern) {
        super(null, null);
        this.namePattern = namePattern;
        this.pattern = pattern;
    }

    public PatternElement setLocator(String... text) {
        this.name = format(this.namePattern, (Object[]) text);
        this.locator = By.xpath(format(this.pattern, (Object[]) text));
        return this;
    }

    @Override
    public By getLocator() {
        return super.getLocator();
    }
}
