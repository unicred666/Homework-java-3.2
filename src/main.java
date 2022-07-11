public class main {
    public static void main(String[] args) {
        IbM service = new IbM();
        float m = 84.5F;
        float h = (float) Math.pow(1.79,2);
        float ibm = service.calculate(m,h);
        System.out.printf("%.3f",ibm);
    }
}