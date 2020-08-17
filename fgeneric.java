
class SException extends Exception {
    public SException(String str) {
        super(str);
    }
}

class genericOut {

    public <S> void genericMethod(S value) {
        try {
            if (value instanceof String) throw new SException("String not allowed");
            double res = Double.parseDouble(String.valueOf(value));
            System.out.println((res * 2) / 3);
        } catch (SException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class fgeneric {
    public static void main(String[] args) {
        genericOut obj = new genericOut();
        obj.genericMethod(5);
        obj.genericMethod("False");
        obj.genericMethod(12.3f);
        obj.genericMethod(85.4d);
        
    }
}