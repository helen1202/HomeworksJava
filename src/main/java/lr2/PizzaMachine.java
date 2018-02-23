package lr2;

public class PizzaMachine {
    public Pizza order(Button button) {
        PizzaMaker pizzaMaker = null;
        switch (button) {
            case ONE:
                pizzaMaker = new PoloMaker();
                break;
            case TWO:
                pizzaMaker = new PepperoniMaker();
            case THREE:
                pizzaMaker = new CarbonaraMaker();
            case FOUR:
                pizzaMaker = new FourCheeseMaker();
                break;
        }
        return pizzaMaker.cook();
    }
}
