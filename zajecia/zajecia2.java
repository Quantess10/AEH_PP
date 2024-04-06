import java.util.ArrayList;

public class zajecia2 {
    public static void main(String[] args) {
        ex1_1();
        ex1_2();
        ex1_3();
        ex1_4();
    }

    // 1.1) Napisz funkcję, która przyjmuje tablicę i liczbę do znalezienia, a
    // następnie zwraca indeks tej liczby w tablicy (lub -1, jeśli nie znaleziono).
    public static void ex1_1() {
        int[] liczby = { 1, 21, 9, 7, 10, 8, 12, 6, 15, 2 };
        int liczbaDoZnalezienia = 21;
        int indeksSzukanej = znajdzLiczbe(liczby, liczbaDoZnalezienia);

        if (indeksSzukanej != -1) {
            System.out.println("Znaleziono liczbę " + liczbaDoZnalezienia + " w tablicy o indeksie: " + indeksSzukanej);
        } else {
            System.out.println("Liczba nie została znaleziona w tablicy.");
        }
    }

    public static int znajdzLiczbe(int[] tablica, int liczbaDoZnalezienia) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == liczbaDoZnalezienia) {
                return i + 1;
            }
        }
        return -1;
    }

    // 1.2) Napisz funkcję, która przyjmuje zakres liczb i zwraca tablicę liczb
    // pierwszych w tym zakresie.
    public static void ex1_2() {
        // zakreś liczb:
        int start = 4;
        int koniec = 39;
        ArrayList<Integer> pierwsze = znajdzPierwsza(start, koniec);
        System.out.println("Liczby pierwsze w zakresie od " + start + " do " + koniec + ": " + pierwsze);
    }

    public static ArrayList<Integer> znajdzPierwsza(int start, int koniec) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int j = start; j <= koniec; j++) {
            if (czyPierwsza(j)) {
                primeNumbers.add(j);
            }
        }

        return primeNumbers;
    }

    public static boolean czyPierwsza(int liczba) {
        if (liczba < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 1.3) Napisz funkcję, która przyjmuje tablicę i liczbę, a następnie zlicza ile
    // razy ta liczba występuje w tablicy.
    public static void ex1_3() {
        int[] tab = { 1, 2, 3, 4, 5, 3, 2, 1, 3, 5, 4, 1, 3, 7, 9, 5, 3, 2, 1, 3, 3 };
        int num = 3;
        int zlicz = zliczPowtorzenia(tab, num);
        System.out.println("Liczba " + num + " występuje " + zlicz + " razy w tablicy.");
    }

    public static int zliczPowtorzenia(int[] tab, int num) {
        int zlicz = 0; // Inicjalizacja licznika
        for (int element : tab) {
            if (element == num) {
                zlicz++;
            }
        }
        return zlicz;
    }

    // 1.4) Napisz funkcję rekurencyjną, która oblicza sumę liczby całkowitej,
    // dodając do niej wszystkie liczby od 1 do tej liczby. Link:
    // https://pl.wikipedia.org/wiki/Rekurencja
    public static void ex1_4() {
        int n = 5;
        System.out.println("Suma liczb od 1 do " + n + " wynosi: " + sum(n));
    }

    public static int sum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }

}