package com.example.demofunc.func.greeting;

import java.time.Instant;
import java.time.LocalDateTime;

public class GreetingResponse {
    private String value;
    private Long timestamp;
    private LocalDateTime localDateTime;

    public GreetingResponse(String value, Instant timestamp) {
        this.value = value;
        this.timestamp = timestamp.toEpochMilli();
        this.localDateTime = LocalDateTime.now();
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
