package com.mikelynchgames;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by mike on 5/2/15.
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration helloWorldConfiguration, Environment environment) throws Exception {

    }

}

