package model;

public class ModelAppTest {
    @Test
    void testModelBehavior(){
        ModelApp model = new ModelApp();
        model.someMethod();
        assertEquals("expectedValue", model.getSomeValue());
    }
}
