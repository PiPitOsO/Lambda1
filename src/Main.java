public class Main {
    public static void main(String[] args) throws ArithmeticException {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); // будет 0
        try {
        int c = calc.devide.apply(a, b); // мы не любим делить на 0 = будет ошибка
            calc.println.accept(c);
        } catch (ArithmeticException m) {
            System.out.println("И тут мы, так не красиво, упали с ошибкой."); // а я говорил
        }
    }
}