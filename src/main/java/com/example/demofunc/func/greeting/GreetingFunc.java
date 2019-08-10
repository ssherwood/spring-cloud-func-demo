package com.example.demofunc.func.greeting;

import java.util.function.Function;

/**
 * Generic Java "Function"
 * Notice - there is no Spring code here, just a pure Java implementation
 * Pros: Easy to test and compose
 */
public class GreetingFunc implements Function<GreetingRequest, GreetingResponse> {
    @Override
    public GreetingResponse apply(GreetingRequest request) {
        return new GreetingResponse("Hello, " + request.getName());
    }
}