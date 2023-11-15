public class Cappuccino implements Coffee{
    @Override
    public void grindCoffee() {
        System.out.println("Grinding cappuccino!");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Make cappuccino!");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Pour cappuccino!");
    }
}
