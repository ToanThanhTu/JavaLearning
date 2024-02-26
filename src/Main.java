public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("Ferrari GTS",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("Tesla Model 3",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("Ferrari SF90",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}
