public class CoffeeFactory {

    public static Coffee createCooffee(String typeCoffee){
        if (typeCoffee.toLowerCase().equals("espresso")) {
            return new Espresso();
        } else if (typeCoffee.toLowerCase().equals("cappuccino")) {
            return new Cappuccino();
        }
        else if (typeCoffee.toLowerCase().equals("americano")) {
            return new Americano();
        }
        else {
                throw new IllegalArgumentException("Coffee does not exist!");
        }

    }
}
