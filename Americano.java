public class Americano implements Coffee{
    @Override
    public void grindCoffee() {
        System.out.println("Grinding americano!");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Make americano!");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Pour americano!");
    }
        }
