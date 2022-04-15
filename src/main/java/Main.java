public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double add = calculator.addition(37, 11);
        System.out.println("Сложение: 37 + 11 = " + add);

        double sub = calculator.subtraction(37, 11);
        System.out.println("Вычитание: 37 - 11 = " + sub);

        double mult = calculator.multiplication(37, 11);
        System.out.println("Умножение: 37 * 11 = " + mult);

        int div = calculator.division(37, 11);
        System.out.println("Деление: 37 / 11 = " + div);
    }
}