package com.krish.web;

import com.krish.web.controller.Developers;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by krishna on 6/20/17.
 */
@ApplicationPath("/*")
public class CustomApplication extends Application {


    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(Developers.class);
        return resources;
    }
}
