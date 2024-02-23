public class Dog extends Animal {
    private String earShape;
    private String trailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String trailShape) {
        super(type,
                (weight < 15) ? "small" : (weight < 35) ? "medium" : "large",
                weight);
        this.earShape = earShape;
        this.trailShape = trailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", trailShape='" + trailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Ow Woooooooo! ");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }

        System.out.println();
    }

    public void bark() {
        System.out.println("Woof! ");
    }

    public void run() {
        System.out.println("Dog running ");
    }

    public void walk() {
        System.out.println("Dog walking ");
    }

    public void wagTail() {
        System.out.println("Tail wagging ");
    }
}
