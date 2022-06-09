package com.test.platform;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RESTConfig extends Application{
    
    private final Set<Class<?>> classes;

    public RESTConfig() {
        HashSet<Class<?>> c = new HashSet<>();
        c.add(REResource.class);
        c.add(REV2Resource.class);
        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
    
}