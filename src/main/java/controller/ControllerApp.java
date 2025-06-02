package controller;


import service.ServiceApp;

public class ControllerApp {
    private final ServiceApp serviceApp;

    public ControllerApp(ServiceApp serviceApp){
        this.serviceApp = serviceApp;
    }
    public String someControllerMEthod() {
        return serviceApp.someServiceMethod();
    }
}
