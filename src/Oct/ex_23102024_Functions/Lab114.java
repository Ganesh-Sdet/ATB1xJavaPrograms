package Oct.ex_23102024_Functions;

public class Lab114 {
    public static void main(String[] args) {
        //User Defined Function

        //1.Without Parameter and without Return type.
        //2.Without Parameter but with Return Type
        //3.With Parameters and without Return type
        //4.With Parameter and with Return Type

        // public static void main() - Main is also a function, which is called by JVM
        //1.Without Parameter and without Return type.
        greet();

        //2.Without Parameter but with Return Type
        String return_value = greet_with_hello();
        System.out.println(return_value);

        int  voting_age =  age_of_vote();
        System.out.println(voting_age);
        if(voting_age == 18){
            System.out.println("You are allowed to vote");
        }
        else {
            System.out.println("Not Allowed");
        }

        //3.With Parameters and without Return type
        greet_with_your_name("Pramod");
        greet_with_your_name("Amit");
        greet_with_your_name("Ganesh");

        greet_with_first_name_last_name("Ganesh","Suryawanshi");

        //4.With Parameter and with Return Type
        int Result = sum_of_two_numbers(10,20);
        System.out.println(Result);


    }
    //1.Without Parameter and without Return type.
    static void greet(){
        System.out.println("How are you?");
    }

    //2.Without Parameter but with Return Type
    static String greet_with_hello(){
        //write the code
        System.out.println("Hi, how are you?");
        return  "Hi, you are awesome;";
    }

    static int age_of_vote(){
        System.out.println("Vote age Returned");
        return 18;
    }

    //3.With Parameters and without Return type
    static void greet_with_your_name(String name)
    {
        System.out.println("Hi, your name is "+ name);
    }

    static void greet_with_first_name_last_name(String firstname,String lastname){
        System.out.println("Hi your name is " + firstname +" "+ lastname);
    }

    //4.With Parameter and with Return Type
    static int sum_of_two_numbers(int a, int b) {
        return a + b;
    }
}
