package pages.yandexmarket.tabs;

import org.openqa.selenium.By;
import pages.ExoElement;

public class TabPCParts {

    public static final ExoElement LOGO_PC_PARTS = new ExoElement("Лого вкладки \"Компьютерная техника\"",
            By.xpath("//h1[text()='Компьютерная техника']"));

    public static final ExoElement LINK_LAPTOPS = new ExoElement("Ссылка на каталог \"Ноутбуки\"",
            By.xpath("//a[text()='Ноутбуки']"));


}
