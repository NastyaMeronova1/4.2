public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = (short) a;
        System.out.println("Преобразование из byte в short "+b);
        int c = (int) b;
        System.out.println("Преобразование из short в int "+c);
        long d = (long) c;
        System.out.println("Преобразование из int в long "+d);
        double e = (double) d;
        System.out.println("Преобразование из long в double "+e);

        char f = 1;
        int g = (int) f;
        System.out.println("Преобразование из char в int "+g);
        float h = (float) g;
        System.out.println("Преобразование из int в float "+h);
        double i = (double) h;
        System.out.println("Преобразование из float в double "+i);

        int j = 1;
        double k = (double) j;
        System.out.println("Преобразование из int в double "+k);

        long l = 1;
        float m = (float) l;
        System.out.println("Преобразование из long в float "+m);
    }
}
