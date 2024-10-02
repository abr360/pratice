class ScCalc extends AdvCalc {
    public int pow(int a, int b) {
        return (int)Math.pow(a, b);
    }
    public int sqrt(int a) {
        return (int)Math.sqrt(a);
    }
}

class AdvCalc extends Calc {
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
}

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}
public class Demo {
    public static void main(String[] args) {

        ScCalc sc = new ScCalc();
        System.out.println(sc.add(10, 20));
        System.out.println(sc.sub(10, 20));
        System.out.println(sc.mul(10, 20));
        System.out.println(sc.div(10, 20));
        System.out.println(sc.pow(10, 20));
        System.out.println(sc.sqrt(10));
        
    }
}
