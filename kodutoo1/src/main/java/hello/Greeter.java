package hello;

public class Greeter {
    public String sayHello() {
        return "Hello world!";
    }

    Counter counter = new Counter();

    public String sayNice(String name){
        return "Nice to see you, " + name + ". I see that your name length is " +
                counter.nameLength(name) + " letters." ;
    }
}