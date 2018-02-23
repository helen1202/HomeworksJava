package lr2;

public class FourCheeseMaker extends PizzaMaker {
    protected Pizza createPizza() {
        return new Pizza("Four Cheeses");
    }

    protected void bake() {
        System.out.println("baking for 10 minutes...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
    }

    protected void addIngredients() {
        System.out.println("Dor blue, parmejano, mozarella, gauda cheeses.");
    }
}
