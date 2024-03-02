// 4) Napisz program obliczający wskaźnik masy ciała (BMI).

class excercise4 {
    public static void main(String[] args) {
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
}