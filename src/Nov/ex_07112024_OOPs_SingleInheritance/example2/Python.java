package Nov.ex_07112024_OOPs_SingleInheritance.example2;

public class Python extends Programming {
    //Extend -> Is a relationship
    //Python is a programming

    void  Print(){
        System.out.println(author);
        System.out.println(version);
    }

    Python(){
        System.out.println("DC");
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);
       // System.out.println(p1.version);
    }


}
