package pages.yandexmarket;

import org.openqa.selenium.By;
import pages.ExoElement;
import pages.PatternElement;

public class Filters {

    public static final ExoElement MIN_PRICE = new ExoElement("Фильтр max цена",
            By.xpath("//input[@id=\"glpricefrom\"]"));

    public static final ExoElement MAX_PRICE = new ExoElement("Фильтр max цена",
            By.xpath("//input[@id=\"glpriceto\"]"));

    public static final ExoElement BUTTON_SHOW_VENDORS = new ExoElement("Кнопка \"Показать всех производителей\"",
            By.xpath("//fieldset[legend/text()='Производитель']//button[text()='Показать всё']"));

    public static final ExoElement BUTTON_SORT_BY_PRICE = new ExoElement("Кнопка сортировки по цене",
            By.xpath("//a[contains(@class, 'sorter__link ') and text()='по цене']"));

    public static final PatternElement CHECKBOX_VENDOR = new PatternElement("Чекбокс вендора \"%s\"",
            "//input[@type='checkbox' and contains(translate(@name,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), '%s')]");
}
