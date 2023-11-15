import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What coffee do you want/espresso, cappuccino, americano/?");
        String type = scanner.nextLine();
        Coffee coffee = CoffeeFactory.createCooffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
    }
}