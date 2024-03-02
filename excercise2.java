// 2) Stwórz tablicę liczb całkowitych a następnie oblicz średnią wartość.

class excercise2 {
    public static void main(String[] args) {
        int[] tablica = { 1, 5, 8, 22, 6 };

        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }

        double srednia = (double) suma / tablica.length;

        System.out.println("Średnia: " + srednia);

    }
}