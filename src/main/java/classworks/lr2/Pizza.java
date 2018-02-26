package classworks.lr2;

public class Pizza {
    private String name;
    private boolean eaten = false;

    public Pizza(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void eat() {
        if (eaten) {
            return;
        }
        eaten = true;
        System.out.printf("pizza &s is omnomom", name);
    }
}
