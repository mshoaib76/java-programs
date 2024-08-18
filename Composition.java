 class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine; // Composition
    
    public Car() {
        this.engine = new Engine();
    }
    
    public void start() {
        engine.start();
        System.out.println("Car started");
    }
}

public class Composition{
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Engine started \n Car started
    }
}
