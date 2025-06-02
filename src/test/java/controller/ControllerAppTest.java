package controller;

import service.ServiceApp;

public class ControllerAppTest {
    private ServiceApp serviceApp;
    private ControllerApp controllerApp;

    @BeforeEach
    void serUp(){
        serviceApp = mock(classToMock:ServiceApp.class);
        controllerApp = new ControllerApp(serviceApp);
    }

    @Test
    void testSomeControllerMethod(){
        when (serviceApp.someServiceMethod()).thenReturn("expectedValue");
        String result = controllerApp.someControllerMEthod();
        assertEquals("expectedValue", result);
        verify(serviceApp).someServiceMethod();
    }

}
