package com.mikelynchgames;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by mike on 5/2/15.
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration helloWorldConfiguration,
                    Environment environment) throws Exception {

        final HelloWorldResource helloWorldResource = new HelloWorldResource(
                helloWorldConfiguration.getTemplate(),
                helloWorldConfiguration.getDefaultName()
        );

        // Healthcheck
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(helloWorldConfiguration.getTemplate());

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(helloWorldResource);

    }

}

