package com.example.demofunc.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootApiGatewayRequestHandler;

/**
 * Specialized AWS Request Handler that implicitly understands AWS API Gateway
 * Request/Response structure and maps to internal Function<Message<T>, Message<S>>.
 *
 */
public class GreetingApiGatewayHandler extends SpringBootApiGatewayRequestHandler {
}