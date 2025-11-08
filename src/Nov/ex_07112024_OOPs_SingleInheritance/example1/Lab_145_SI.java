package Nov.ex_07112024_OOPs_SingleInheritance.example1;

public class Lab_145_SI {
    public static void main(String[] args) {
        /*
        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();//Son has extended
        s1.bhk3();

        Father f1 = new Father(); */

        //f1.bhk3(); //Father has not extended

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();
    }
}
