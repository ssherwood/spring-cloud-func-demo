package com.example.demofunc.func;

import java.util.function.Consumer;

public class ConsoleConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Input: " + s);
    }
}
