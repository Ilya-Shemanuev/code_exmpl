package data.vendors;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import data.FilterList;

public class Manufacturer {

    @JacksonXmlProperty(localName = "Name")
    private String name;

    @JacksonXmlProperty(localName = "products", isAttribute = true)
    private String products;

    @JacksonXmlProperty(localName = "PriceLimit")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Price priceLimit;

    public String getName() {
        return name;
    }

    public String getProducts() {
        return products;
    }

    public Price getPriceLimit() {
        return priceLimit;
    }

    public Object[] getDataSet() {
        return new Object[]{this.name, this.products, this.priceLimit.getMin(), this.priceLimit.getMax()};
    }
}
