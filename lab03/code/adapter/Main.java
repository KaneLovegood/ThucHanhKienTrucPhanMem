package adapter;

public class Main {

    public static void main(String[] args) {

        XmlService xmlService = new XmlService();

        JsonService adapter = new XmlToJsonAdapter(xmlService);

        String jsonData = adapter.getJsonData();

        System.out.println("JSON Data: " + jsonData);
    }
}