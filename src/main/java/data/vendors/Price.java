package data.vendors;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Price {

    @JacksonXmlProperty(localName = "Min")
    private int min;

    @JacksonXmlProperty(localName = "Max")
    private int max;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}