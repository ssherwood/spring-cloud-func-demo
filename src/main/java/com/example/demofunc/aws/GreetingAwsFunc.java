package com.example.demofunc.aws;

import com.example.demofunc.func.greeting.GreetingFunc;
import com.example.demofunc.func.greeting.GreetingRequest;
import com.example.demofunc.func.greeting.GreetingResponse;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Function;

/**
 *
 */
public class GreetingAwsFunc implements Function<Message<GreetingRequest>, Message<GreetingResponse>> {
    private GreetingFunc greetingFunc = new GreetingFunc();

    @Override
    public Message<GreetingResponse> apply(Message<GreetingRequest> request) {
        return MessageBuilder
                .withPayload(greetingFunc.apply(request.getPayload()))
                .build();
    }
}