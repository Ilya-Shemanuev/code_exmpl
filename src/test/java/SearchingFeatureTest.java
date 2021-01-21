import data.FilterList;
import data.XMLParser;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

import static pages.yandexmarket.Filters.*;
import static pages.yandexmarket.MainPage.LOGO;
import static pages.yandexmarket.MainPage.TAB_PC_PARTS;
import static pages.yandexmarket.tabs.TabPCParts.LINK_LAPTOPS;
import static pages.yandexmarket.tabs.TabPCParts.LOGO_PC_PARTS;
import static steps.WebAsserts.waitForElement;
import static steps.WebSteps.*;
import static util.Utility.getProperty;


@Story("Поиск по фильтрам в Yandex.Market")
public class SearchingFeatureTest extends ExoTest {

    private FilterList filters;
    private int maxPrice;

    public SearchingFeatureTest() {
        this.filters = new XMLParser().getFilters();
        this.maxPrice = this.filters.getGlobal().getPrice().getMax();
    }

    @DataProvider(name = "vendor")
    public Iterator<Object[]> dataProviderTest() {
        return this.filters.getManufacturerDataSet();
    }

    @BeforeMethod
    public void goToMarket() {
        openPage(getProperty("testing.stand.url"));
        waitForElement(LOGO);

        waitForElement(LOGO);
        click(TAB_PC_PARTS);

        waitForElement(LOGO_PC_PARTS);
        click(LINK_LAPTOPS);
    }

    @Test(testName = "Check filter", dataProvider = "vendor")
    public void ieTry(String vendorName, String product, int minPrice, int maxPrice) {
        if(maxPrice > this.maxPrice) {
            maxPrice = this.maxPrice;
        }

        enterText(MIN_PRICE, minPrice);
        enterText(MAX_PRICE, maxPrice);

        click(BUTTON_SHOW_VENDORS);
        click(CHECKBOX_VENDOR.setLocator(vendorName));

        click(BUTTON_SORT_BY_PRICE);
    }
}
