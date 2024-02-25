public class Refrigerator {

    private boolean hasWorkToDo;

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
