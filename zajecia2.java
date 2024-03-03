//1.1) Napisz funkcję, która przyjmuje tablicę i liczbę do znalezienia, a następnie zwraca indeks tej liczby w tablicy (lub -1, jeśli nie znaleziono).
//1.2) Napisz funkcję, która przyjmuje zakres liczb i zwraca tablicę liczb pierwszych w tym zakresie.
//1.3) Napisz funkcję, która przyjmuje tablicę i liczbę, a następnie zlicza ile razy ta liczba występuje w tablicy.
//1.4) Napisz funkcję rekurencyjną, która oblicza sumę liczby całkowitej, dodając do niej wszystkie liczby od 1 do tej liczby. Link: https://pl.wikipedia.org/wiki/Rekurencja

public class zajecia2 {
    public static void main(String[] args) {
        final int SUM = add(5, 3);
        System.out.println(add(2, 24));
        System.out.println(SUM);
    }

    private static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }
}
