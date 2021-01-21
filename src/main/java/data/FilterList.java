package data;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import data.vendors.Global;
import data.vendors.Manufacturer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

@JacksonXmlRootElement(localName = "Parameters")
public class FilterList {

    @JacksonXmlProperty(localName = "Global")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Global global;

    @JacksonXmlProperty(localName = "Manufacturers")
    private Queue<Manufacturer> manufacturerList;

    public Global getGlobal() {
        return this.global;
    }

    public Queue<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public Iterator<Object[]> getManufacturerDataSet() {
        List<Object[]> dataSet = new ArrayList<>();
        while(!this.manufacturerList.isEmpty()) {
            Manufacturer vendor = this.manufacturerList.poll();
            if(this.global.getExcludedVendors().getVendors().contains(vendor.getName())) {
                continue;
            }
            dataSet.add(vendor.getDataSet());
        }
        return dataSet.iterator();
    }
}







