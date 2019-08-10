package com.example.demofunc.func.greeting;

import java.time.Instant;

public class GreetingResponse {
    private String value;
    private Long timestamp;

    public GreetingResponse(String value) {
        this.value = value;
        this.timestamp = Instant.now().toEpochMilli();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
