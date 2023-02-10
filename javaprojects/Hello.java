public class Hello {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int re1 = calc.add(5, 6);
        System.out.println(re1);
    }
}

    class Calculator{
    public int add(int n1, int n2) {
        return n1 + n2;

    }
}
