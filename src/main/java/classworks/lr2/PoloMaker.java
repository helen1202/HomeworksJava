package classworks.lr2;

public class PoloMaker extends PizzaMaker {

    @Override
    protected Pizza createPizza() {
        return new Pizza("Polo");
    }

    @Override
    protected void bake() {
        System.out.println("Baking for 20 minutes...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

    }

    @Override
    protected void addIngredients() {
        System.out.println("Added ckined, cheese, tomatoes");

    }
}
