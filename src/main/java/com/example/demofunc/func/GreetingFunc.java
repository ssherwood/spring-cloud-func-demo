package com.example.demofunc.func;

import java.util.function.Function;

/**
 * Generic Java "Function"
 *
 * Notice - there is no Spring code here, just a pure Java implementation
 *
 */
public class GreetingFunc implements Function<String, String> {
    @Override
    public String apply(String name) {
        return "Hello " + name;
    }
}