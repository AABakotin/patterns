package poisonPill.message.simple.impl;

import poisonPill.message.simple.Message;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleMessage implements Message {
    private final Map<Headers, String> headers = new HashMap<>();
    private String body;


    @Override
    public Map<Headers, String> getHeaders() {
        return Collections.unmodifiableMap(headers);
    }

    @Override
    public void addHeader(Headers header, String value) {
        headers.put(header, value);
    }

    @Override
    public String getHeader(Headers header) {
        return headers.get(header);
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }
}
