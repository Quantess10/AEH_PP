
class hello_world {

    public static void main(String[] args) {
        String x = "Hello world in Java! :) :) :)";
        String y;

        final String Z = "Stała - ten tekst nie może być zmieniony.";

        int integerValue = 6;
        double doubleValue = 3.14;

        // enum Colors{RED,GREEN,BLUE};
        // Colors myFavouriteColors = Colors.RED;

        y = "Tekst dla drugiej zmiennej";
        y = "Zmieniona wartość y";

        // int[] numbers = { 1, 2, 3 };
        // String[] letters = { "a", "b", "c" };

        // int firstNumbers = numbers[0];

        if (integerValue > 5) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(Z);
            helloWorld();
            System.out.println("---------");
            System.out.println(integerValue);
            System.out.println(doubleValue);
        }

    }

    public static void helloWorld() {
        System.out.println("Hello World z metody :)");
    }
}
