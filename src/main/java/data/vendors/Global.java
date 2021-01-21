package data.vendors;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Global {

    @JacksonXmlProperty(localName = "Price")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Price price;

    @JacksonXmlProperty(localName = "Excluded_vendors")
    @JacksonXmlElementWrapper(useWrapping = false)
    private ExcludedVendors excludedVendors;

    public Price getPrice() {
        return this.price;
    }

    public ExcludedVendors getExcludedVendors() {
        return this.excludedVendors;
    }
}
