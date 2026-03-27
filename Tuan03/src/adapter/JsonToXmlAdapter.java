package adapter;

public class JsonToXmlAdapter implements JsonService {
    private XmlSystem xmlSystem;

    public JsonToXmlAdapter(XmlSystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public void sendJson(String json) {
        String xml = convertJsonToXml(json);
        xmlSystem.sendXml(xml);
    }

    private String convertJsonToXml(String json) {
        String cleaned = json.replace("{", "")
                .replace("}", "")
                .replace("\"", "");
        String[] parts = cleaned.split(",");
        StringBuilder xml = new StringBuilder("<data>");

        for (String part : parts) {
            String[] keyValue = part.split(":");
            if (keyValue.length == 2) {
                xml.append("<").append(keyValue[0].trim()).append(">")
                        .append(keyValue[1].trim())
                        .append("</").append(keyValue[0].trim()).append(">");
            }
        }

        xml.append("</data>");
        return xml.toString();
    }
}