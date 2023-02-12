import javax.sound.midi.Sequencer.SyncMode;

// try following in "jshell"
// System.out.println("Gokul.....");
class Hello {
    public static void main(String args[]) {
        // System.out.println("Gokul....");
        // System.out.println(a);


        // // Variables
        // byte by = 127;
        // System.out.println(by);

        // int inte = 199999999;
        // System.out.println(inte);

        // short sh = 128;
        // System.out.println(sh);

        // long lo = 199999999312_321_321l;
        // System.out.println(lo);

        // float flo = 1.2f;
        // System.out.println(flo);

        // double dou = 1.4;
        // System.out.println(dou);

        // char d = 'c';
        // System.out.println(d);

        // boolean e = true;
        // System.out.println(e);      
        
        // int int_f = by;
        // System.out.println(int_f);

        // int int_g = (int) flo;
        // System.out.println(int_g);

        // Logical operators
        int x = 5;
        int y = 6;
        int a = 4;
        int b = 9;
        boolean gre = x < y & a < b;
        System.out.println("True and true.........");
        System.out.println(true | true);
        System.out.println(true || true);
        System.out.println(true & true);
        System.out.println(true && true);

        System.out.println("False and true.........");        
        System.out.println(false | true);
        System.out.println(false || true);
        System.out.println(false & true);
        System.out.println(false && true);

        System.out.println("true and false.........");        
        System.out.println(true | false);
        System.out.println(true || false);
        System.out.println(true & false);
        System.out.println(true && false);
        

        System.out.println("False and false.........");      
        System.out.println(false | false);
        System.out.println(false || false);
        System.out.println(false & false);
        System.out.println(false && false);

    }
}