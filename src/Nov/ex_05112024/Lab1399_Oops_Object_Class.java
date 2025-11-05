package Nov.ex_05112024;

public class Lab1399_Oops_Object_Class {
    public static void main()
    {
        StudentsATB s1 = new StudentsATB();
        //StudentATB is a Class Loading
        //s1 is a object reference
        // new StudentATB() -> Object Creation

        Person p1;
        //Person - Class loader - load the Class
        //p1 -> ref -> null -> Default value of non primitive data type is null

        StudentsATB S2 = new StudentsATB();
        S2.name = "Alex";

    }
}
