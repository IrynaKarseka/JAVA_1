// Напишите функцию printPrimeNums, которая выведет на экран 
// все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.

// Пример

// 1
// 2
// 3
// 5
// 7
// 11
// ...

class Answer {
    public void printPrimeNums() {
        System.out.println(1);
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= 1000; j++) {
                int num = i % j;
                if (num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}

public class Printer2 {
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}