public class App {
    public String getGreeting(String message) {
        return message == null || message.isEmpty() "Hello, World!": message;
    }

    public  static  void  main (String[] args){
        System.out.println(new App().getGreeting("215"));
    }
}
