package com.example.demofunc.func.greeting;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.ZonedDateTime;

public class GreetingResponse {
    private String value;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZZ", timezone = "UTC")
    private ZonedDateTime timestamp;

    public GreetingResponse(String value, ZonedDateTime timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
