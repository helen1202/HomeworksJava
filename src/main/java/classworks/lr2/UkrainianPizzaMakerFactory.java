package classworks.lr2;

public class UkrainianPizzaMakerFactory implements PizzaMakerFactory {

    public PizzaMaker getPizzaMaker(Button button) {
        PizzaMaker pizzaMaker = null;
        switch (button) {
            case ONE:
                pizzaMaker = new PoloMaker();
                break;
            case TWO:
                pizzaMaker = new FourCheeseMaker();
                break;
            case THREE:
                pizzaMaker = new CarbonaraMaker();
                break;
            case FOUR:
                pizzaMaker = new PepperoniMaker();
        }
        return pizzaMaker;
    }
}
