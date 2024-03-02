class excercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // 1) Wyświetl wynik dodawania, odejmowania, mnożenia oraz dzielenia 2 wartości.
    public static void exercise1() {
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

    // 2) Stwórz tablicę liczb całkowitych a następnie oblicz średnią wartość.
    public static void exercise2() {
        int[] tablica = { 1, 5, 8, 22, 6 };

        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }

        double srednia = (double) suma / tablica.length;

        System.out.println("Średnia: " + srednia);
    }

    // 3) Wyświetl, czy dana liczba jest parzysta czy nieparzysta.
    public static void exercise3() {
        int liczba = 7;

        if (liczba % 2 == 0) {
            System.out.println("Liczba " + liczba + " jest parzysta.");
        } else {
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }
    }

    // 4) Napisz program obliczający wskaźnik masy ciała (BMI).
    public static void exercise4() {
        double waga = 83;
        double wzrost = 1.78;

        double bmi = waga / (wzrost * wzrost);

        System.out.println("Twoje BMI wynosi: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Masz niedowagę :(");
        } else if (bmi < 25) {
            System.out.println("Masz prawidłową wagę :)");
        } else if (bmi < 30) {
            System.out.println("Masz nadwagę :/");
        } else {
            System.out.println("Jesteś otyły :(");
        }
    }

    // 5) Napisz program, który dla tablicy wyników z kilkoma ocenami obliczy
    // średnią ocen i określi odpowiedni stopień zaliczenia (np. "A", "B", "C"
    // itp.).
    public static void exercise5() {
        int[] oceny = { 3, 5, 2, 4, 4, 3, 4 };

        int suma = 0;
        for (int liczba : oceny) {
            suma += liczba;
        }

        double srednia = (double) suma / oceny.length;
        System.out.println("Średnia: " + srednia);
    }

    // 6) Napisz program, który sprawdza, czy dane słowo jest palindromem. Link:
    // https://pl.wikipedia.org/wiki/Palindrom
    public static void exercise6() {

    }
}