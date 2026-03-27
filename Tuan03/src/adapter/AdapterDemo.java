package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        XmlSystem xmlSystem = new XmlSystem();
        JsonService jsonAdapter = new JsonToXmlAdapter(xmlSystem);

        String json = "{\"name\":\"An\",\"age\":\"21\"}";
        jsonAdapter.sendJson(json);

        JsonSystem jsonSystem = new JsonSystem();
        XmlService xmlAdapter = new XmlToJsonAdapter(jsonSystem);

        String xml = "<data><name>Binh</name></data>";
        xmlAdapter.sendXml(xml);
    }
}