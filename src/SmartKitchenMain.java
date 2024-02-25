public class SmartKitchenMain {

    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

//        smartKitchen.getBrewMaster().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//        smartKitchen.getIceBox().setHasWorkToDo(true);
//        smartKitchen.getIceBox().orderFood();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getBrewMaster().brewCoffee();

        smartKitchen.setKitchenState(true, true,
                true);
        smartKitchen.doKitchenWork();
    }

}
