package com.example.demofunc.aws;

import com.example.demofunc.func.greeting.GreetingFunc;
import com.example.demofunc.func.greeting.GreetingRequest;
import com.example.demofunc.func.greeting.GreetingResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Function;

/**
 * Specialized Function variant that takes a Message wrapped input and output.
 * Spring adapts this from the source request/response for you; this is useful
 * if you need to interact with the headers...
 */
public class GreetingMessageFunc implements Function<Message<GreetingRequest>, Message<GreetingResponse>> {

    private static Logger logger = LoggerFactory.getLogger(GreetingMessageFunc.class);

    @Override
    public Message<GreetingResponse> apply(Message<GreetingRequest> request) {
        // you can get the HTTP headers...
        request.getHeaders()
                .forEach((k,v) -> logger.info(" Header: " + k + "=" + v));

        return MessageBuilder
                .withPayload(new GreetingFunc().apply(request.getPayload()))
                .setHeaderIfAbsent("FOO", "BAR")
                .build();
    }
}