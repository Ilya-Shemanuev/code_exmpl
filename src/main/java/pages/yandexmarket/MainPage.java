package pages.yandexmarket;

import org.openqa.selenium.By;
import pages.ExoElement;

public class MainPage {

    public static final ExoElement LOGO = new ExoElement("Логотип Yandex.Market",
            By.xpath("//div[contains(@class, 'logo') and //span/text()='Яндекс' and //span/text()='Маркет']"));

    public static final ExoElement CITY_CHANGER = new ExoElement("Выбрать город",
            By.xpath("//span[contains(@class, 'item_type_region')]"));

    public static final ExoElement TAB_PC_PARTS = new ExoElement("Вкладка \"Компьютерная техника\"",
            By.xpath("//a[contains(@data-bem, '\"name\":\"Компьютерная техника\"')]"));
}
