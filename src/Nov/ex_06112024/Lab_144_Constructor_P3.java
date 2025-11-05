package Nov.ex_06112024;

public class Lab_144_Constructor_P3 {
    public static void main(String args[]) {
        car3 t1 = new car3("Tesla",2024);
        System.out.println(t1.model);
        System.out.println(t1.year);
    }
    }

    class car3{
        String model;
        int year;

//Parametrized constructor
    car3(String model_name,int year_created){
    System.out.println("PC");
    this.model = model_name;
    this.year = year_created;


}
}

