public class Espresso implements Coffee{
    @Override
    public void grindCoffee() {
        System.out.println("Grinding espresso!");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Make espresso!");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Pour espresso!");
    }
}
