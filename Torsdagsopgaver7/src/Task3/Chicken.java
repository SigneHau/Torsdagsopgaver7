package Task3;

public class Chicken extends Animal implements Edible  {

    @Override
    public String sound() {
        return "Cluk Cluk";

    }

    @Override
    public String howToEat() {
        return "prepare the chicken in the owen and eat it";

    }
}
