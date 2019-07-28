package com.example.demofunc;

import com.example.demofunc.func.ConsoleConsumer;
import com.example.demofunc.func.GreetingFunc;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionType;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootConfiguration
public class DemoFuncApplication implements ApplicationContextInitializer<GenericApplicationContext> {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(DemoFuncApplication.class, args);
    }

    // functional registration of "beans" improves startup times
    @Override
    public void initialize(GenericApplicationContext context) {
        /*
        context.registerBean(FunctionRegistration.class,
                () -> new FunctionRegistration<>(new GreetingFunc()).name("greeting")
                        .type(FunctionType.from(String.class).to(String.class)));
        */

        /*
        context.registerBean(FunctionRegistration.class,
                () -> new FunctionRegistration<>(new NotificationSupplier())
                        .name("notification")
                        .type(FunctionType.supplier(String.class)));
        */

        context.registerBean(FunctionRegistration.class,
                () -> new FunctionRegistration<>(new GreetingFunc())
                        .name("greeting")
                        .type(FunctionType.from(String.class).to(String.class)));

        context.registerBean(FunctionRegistration.class,
                () -> new FunctionRegistration<>(new ConsoleConsumer())
                        .name("console")
                        .type(FunctionType.consumer(String.class)));
    }
}
