// Реализуйте простой калькулятор
// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) 
// над двумя числами и возвращать результат. В классе должен быть метод calculate, который 
// оператор и значения аргументов и возвращает результат вычислений.
// При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

class Calculator {
    public int calculate(char op, int a, int b) {
        int otvet = 0;
        if (b != 0) {
            switch (op) {
                case '+':
                    otvet = a + b;
                    break;
                case '-':
                    otvet = a - b;
                    break;
                case '*':
                    otvet = a * b;
                    break;
                case '/':
                    otvet = a / b;
                    break;
                default:
                    System.out.println("Некорректный оператор: 'оператор'");
                    otvet = 0;
            }
        }
        return otvet;
    }
}

public class Printer3 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}