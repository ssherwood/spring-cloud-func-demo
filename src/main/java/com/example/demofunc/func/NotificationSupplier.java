package com.example.demofunc.func;

import java.time.Instant;
import java.util.function.Supplier;

public class NotificationSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "Notification @ " + Instant.now();
    }
}
