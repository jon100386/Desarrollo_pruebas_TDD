package service;

import dependency.Dependency;

public class ServiceApp {
    private final Dependency dependency;

    public ServiceApp(Dependency dependency){
        this.dependency = dependency;
    }

    public String someServiceMethod(){
        return dependency.someMethod();
    }

    public String serviceMethod(){
        return dependency.someMethod();
    }
}
