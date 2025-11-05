package Nov.ex_06112024;

import java.util.Scanner;

public class Lab143_Constructor_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car2 t1 = new Car2("Tesla",2015);
        System.out.println(t1.model);
        System.out.print(t1.year);

        Car2 t2 = new Car2("Nano",2013);
        System.out.println(t2.model);
        System.out.println(t2.year);

        System.out.println("Enter the model name");
        String model_name_input = sc.next();
        System.out.println("Enter the year");
        int year_input = sc.nextInt();

    }
}
    class Car2{
    String model;
    int year ;

    //Parametrized constructor
        Car2(String model_name,int year_created)
        {
            System.out.println("Parametrized constructor");
            this.model = model_name;
            this.year = year_created;
        }
        }
