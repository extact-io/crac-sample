package io.extact.sample.crac;

import java.util.Set;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Application;

import io.extact.sample.crac.resource.PersonResource;

@ApplicationScoped
public class PersonApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(PersonResource.class);
    }
}
