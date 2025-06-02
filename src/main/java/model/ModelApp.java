package model;

public class ModelApp {
    private String someValue = "defaultValue";

    public void setSomeValue(){
        someValue = "expectedValue";
    }
    public String getSomeValue(){
        return someValue;
    }
}
