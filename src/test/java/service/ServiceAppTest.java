package service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dependency.Dependency;


public class ServiceAppTest {
    private ServiceApp serviceApp;
    private Dependency dependency;

    @BeforeEach
    Void setUp(){
        dependency = mock(classToMock:Dependency.class);
        serviceApp = new ServiceApp(dependency);
    }

    @Test
    void testServiceMethod(){
        when (dependency.someMethod()).thenReturn("someValue");
        var result = serviceApp.serviceMethod();
        assertEquals("someValue",result);
        verify(dependency).someMethod();
    }
}
