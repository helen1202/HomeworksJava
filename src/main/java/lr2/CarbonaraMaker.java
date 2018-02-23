package lr2;

public class CarbonaraMaker extends PizzaMaker{
    @Override
    protected Pizza createPizza() {
        return new Pizza("Carbonara");
    }
@Override
    protected void bake() {
    System.out.println("baking for 18 minutes");
    try {
        Thread.sleep(1300);
    } catch (InterruptedException e) {
    }

}
@Override
    protected void addIngredients() {
    System.out.println("Added cheese, bacon, eggs, parmejano.");
    }
}
