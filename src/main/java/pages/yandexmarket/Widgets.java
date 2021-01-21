package pages.yandexmarket;

import org.openqa.selenium.By;
import pages.ExoElement;
import pages.PatternElement;

public class Widgets {

    public static final ExoElement FIELD_CITY = new ExoElement("Поле вводу города",
            By.xpath("//form[contains(@class, 'region-select')]//input[@placeholder]"));

    public static final PatternElement CITY_PICKER = new PatternElement("Выбор города \"%s\"",
            "//div[contains(@class, 'suggestick-list')]//div[span[contains(text(), '%s')]]");
}
