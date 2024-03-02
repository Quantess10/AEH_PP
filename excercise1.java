//1) Wyświetl wynik dodawania, odejmowania, mnożenia oraz dzielenia 2 wartości.

class excercise1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        int suma = x + y;
        int roznica = x - y;
        int iloczyn = x * y;
        double iloraz = x / y;

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
    }
}