import io.qameta.allure.Epic;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static pages.yandexmarket.MainPage.CITY_CHANGER;
import static pages.yandexmarket.MainPage.LOGO;
import static pages.yandexmarket.Widgets.CITY_PICKER;
import static pages.yandexmarket.Widgets.FIELD_CITY;
import static steps.WebAsserts.waitForElement;
import static steps.WebSteps.*;
import static util.Utility.getDriver;
import static util.Utility.getProperty;

@Epic("Конкурс Сбербанк")
public class ExoTest {

    @BeforeSuite
    public void initDriver() {
        System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
        openPage(getProperty("testing.stand.url"));
        waitForElement(LOGO);
        click(CITY_CHANGER);
        enterText(FIELD_CITY,"Сан");
        click(CITY_PICKER.setLocator("Санкт-Петербург"));
    }

    @AfterClass
    public void stopDriver() {
        getDriver().quit();
    }
}
