package com.example.demofunc;

import com.example.demofunc.aws.GreetingMessageFunc;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionType;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class DemoFuncApplication implements ApplicationContextInitializer<GenericApplicationContext> {

    public static void main(String[] args) {
        // notice this is not a "SpringApplication" runner
        FunctionalSpringApplication.run(DemoFuncApplication.class, args);
    }

    // functional registration of "beans" improves startup times
    @Override
    public void initialize(GenericApplicationContext context) {
        context.registerBean(FunctionRegistration.class,
                () -> new FunctionRegistration<>(new GreetingMessageFunc())
                        .name("greeting-func")
                        .type(FunctionType.of(GreetingMessageFunc.class))
        );
    }
}
