import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test void appHasAGreeting(){
        App classUnderTest = new App();
        String greeting = new String();
        assertNotNull(classUnderTest.getGreeting(greeting), "app should have a greeting");
    }

    @Test void getPersonalizedGreeting(){
        App app = new App();
        String message = "I am a personalized message";
        assertNotNull(app.getGreeting(message));
    }
}
