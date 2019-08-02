package com.example.demofunc.aws;

import com.example.demofunc.func.greeting.GreetingRequest;
import com.example.demofunc.func.greeting.GreetingResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class GreetingRequestHandler extends SpringBootRequestHandler<GreetingRequest, GreetingResponse> {
}