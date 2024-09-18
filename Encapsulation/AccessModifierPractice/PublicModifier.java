package AccessModifierPractice;
import AccessModifierPractice.DefaultModifier;

import javax.crypto.spec.PSource;

public class PublicModifier {
    static DefaultModifier obj = new DefaultModifier();
    static public int a = 10;
    static int b = obj.b;

    public static void main(String[] args) {
        PrivateModifier obj3 = new PrivateModifier();
//        int d = obj3.c;
        DefaultModifier obj2 = new DefaultModifier();
        System.out.println(obj2.b);

        System.out.println(a+b);
    }


}
