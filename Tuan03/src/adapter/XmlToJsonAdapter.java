package adapter;

public class XmlToJsonAdapter implements XmlService {
    private JsonSystem jsonSystem;

    public XmlToJsonAdapter(JsonSystem jsonSystem) {
        this.jsonSystem = jsonSystem;
    }

    @Override
    public void sendXml(String xml) {
        String json = convertXmlToJson(xml);
        jsonSystem.sendJson(json);
    }

    private String convertXmlToJson(String xml) {
        // Demo đơn giản cho 1 cặp tag
        String cleaned = xml.replace("<data>", "").replace("</data>", "").trim();

        if (cleaned.contains("<") && cleaned.contains(">")) {
            int startTagOpen = cleaned.indexOf("<");
            int startTagClose = cleaned.indexOf(">");
            String key = cleaned.substring(startTagOpen + 1, startTagClose);

            String endTag = "</" + key + ">";
            int endTagIndex = cleaned.indexOf(endTag);

            String value = cleaned.substring(startTagClose + 1, endTagIndex);

            return "{\"" + key + "\":\"" + value + "\"}";
        }

        return "{}";
    }
}