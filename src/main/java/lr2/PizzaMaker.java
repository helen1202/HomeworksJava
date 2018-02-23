package lr2;

public abstract class PizzaMaker {

    public Pizza cook() {
        prepareBase();
        addIngredients();
        bake();
        cut();
        pack();
        return createPizza();
    }

    protected abstract Pizza createPizza();

    protected abstract void bake();

    protected abstract void addIngredients();

    protected void pack() {
        System.out.println("Pizza is packed");
    }

    protected void cut() {
        System.out.println("Pizza is cut");
    }

    protected void prepareBase() {
        System.out.println("Base is prepared");
    }

}
