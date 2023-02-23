public class Math implements MathInterface { // La interface es un contrato que obliga a implementar los métodos que tiene
    public static double pi() { // Al ser un método estático, se puede llamar sin instanciar la clase
        return 3.14159;
    }

    public double sum(double number1, double number2) {
        return number1 + number2;
    }
}
