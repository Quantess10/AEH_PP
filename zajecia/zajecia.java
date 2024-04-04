class excercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
    }

    // 1) Wyświetl wynik dodawania, odejmowania, mnożenia oraz dzielenia 2 wartości.
    public static void exercise1() {
        int x = 5;
        int y = 3;

        int suma = x + y;
        int roznica = x - y;
        int iloczyn = x * y;
        double iloraz = x / y;

        System.out.println(x + " + " + y + " = " + suma);
        System.out.println(x + " - " + y + " = " + roznica);
        System.out.println(x + " * " + y + " = " + iloczyn);
        System.out.println(x + " / " + y + " = " + iloraz);
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

    public static double roundTo2DecimalPlace(double bmi) {
        return Math.round(bmi * 100.0) / 100.0;
    }

    // 4) Napisz program obliczający wskaźnik masy ciała (BMI).
    public static void exercise4() {
        double waga = 83;
        double wzrost = 1.78;

        double bmi = waga / (wzrost * wzrost);

        System.out.println("Twoje BMI wynosi: " + roundTo2DecimalPlace(bmi));

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
        int[] oceny = { 4, 5, 2, 5, 2 };

        double sumaOcen = 0;
        for (int ocena : oceny) {
            sumaOcen += ocena;
        }

        double sredniaOcen = sumaOcen / oceny.length;

        String stopienZaliczenia;
        if (sredniaOcen >= 4.75) {
            stopienZaliczenia = "A";
        } else if (sredniaOcen >= 4.5) {
            stopienZaliczenia = "A-";
        } else if (sredniaOcen >= 4) {
            stopienZaliczenia = "B+";
        } else if (sredniaOcen >= 3.5) {
            stopienZaliczenia = "B";
        } else if (sredniaOcen >= 3) {
            stopienZaliczenia = "B-";
        } else if (sredniaOcen >= 2) {
            stopienZaliczenia = "C";
        } else {
            stopienZaliczenia = "Nie zaliczono";
        }

        System.out.println("Średnia ocen: " + sredniaOcen);
        System.out.println("Stopień zaliczenia: " + stopienZaliczenia);
    }

    // 6) Napisz program, który sprawdza, czy dane słowo jest palindromem. Link:
    // https://pl.wikipedia.org/wiki/Palindrom
    public static void exercise6() {
        String slowo = "kajak";

        if (czyPalindrom(slowo)) {
            System.out.println("Słowo " + slowo + " jest palindromem.");
        } else {
            System.out.println("Słowo " + slowo + " nie jest palindromem.");
        }
    }

    public static boolean czyPalindrom(String slowo) {
        int dlugosc = slowo.length();
        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}