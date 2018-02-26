package classworks.lr2;

public class PepperoniMaker extends PizzaMaker {

    @Override
    protected Pizza createPizza() {
        return new Pizza("Pepperoni");
    }

    @Override
    protected void bake() {
        System.out.println("baking for 15 min...");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    protected void addIngredients() {
        System.out.println("Added pepperoni, paprika, cheese, tomatoes.");
    }
}
