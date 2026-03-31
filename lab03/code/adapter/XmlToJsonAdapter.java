package adapter;

public class XmlToJsonAdapter implements JsonService {

    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getJsonData() {

        String xml = xmlService.getXmlData();

        // Chuyển XML -> JSON (demo đơn giản)
        String json = "{ \"name\": \"John\" }";

        return json;
    }
}