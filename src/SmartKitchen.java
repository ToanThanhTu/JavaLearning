public class SmartKitchen {

    private CoffeeMaker brewMaster = new CoffeeMaker();
    private DishWasher dishWasher = new DishWasher();
    private Refrigerator iceBox = new Refrigerator();

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean hasRefrigeratorWork, boolean hasDishWasherWork,
                                 boolean hasCoffeeMakerWork) {
        brewMaster.setHasWorkToDo(hasRefrigeratorWork);
        iceBox.setHasWorkToDo(hasDishWasherWork);
        dishWasher.setHasWorkToDo(hasCoffeeMakerWork);
    }

    public void doKitchenWork() {
        System.out.println("Doing kitchen work");

        dishWasher.doDishes();
        iceBox.orderFood();
        brewMaster.brewCoffee();
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
