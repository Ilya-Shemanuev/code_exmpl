package data;


import java.io.IOException;

import static util.Utility.getParametersFile;
import static util.Utility.getXMLMapper;

public class XMLParser extends Parser {

    public XMLParser() {
        try {
            this.filters = getXMLMapper().readValue(getParametersFile(), FilterList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
