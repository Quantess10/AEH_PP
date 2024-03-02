//3) Wyświetl, czy dana liczba jest parzysta czy nieparzysta.

class excercise3 {
    public static void main(String[] args) {
        int liczba = 7;

        if (liczba % 2 == 0) {
            System.out.println("Liczba " + liczba + " jest parzysta.");
        } else {
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }
    }
}