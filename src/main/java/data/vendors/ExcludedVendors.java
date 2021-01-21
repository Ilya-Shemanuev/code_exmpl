package data.vendors;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ExcludedVendors {

    @JacksonXmlProperty(isAttribute = true)
    @JacksonXmlElementWrapper(useWrapping = false)
    private byte rating;

    @JacksonXmlProperty(localName = "Vendor")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> vendors;

    public byte getRating() {
        return rating;
    }

    public List<String> getVendors() {
        return vendors;
    }
}
