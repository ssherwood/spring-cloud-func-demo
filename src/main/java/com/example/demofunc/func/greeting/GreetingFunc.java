package com.example.demofunc.func.greeting;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.function.Function;

/**
 * Generic Java "Function"
 *
 * Notice - there is no Spring code here, just a pure Java implementation
 *
 */
public class GreetingFunc implements Function<GreetingRequest, GreetingResponse> {
    @Override
    public GreetingResponse apply(GreetingRequest request) {
        return new GreetingResponse("Hola " + request.getName(), Instant.now());
    }
}