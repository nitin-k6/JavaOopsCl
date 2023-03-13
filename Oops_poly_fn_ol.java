//This is polymorphism --> Multiple forms(A single named fn called info is performing many tasks)
// This is function(method) overloading which is also called compile-time polymorphism coz durimg compiling it detects whether we had implemented polymorphism right or not.
// in runtime compiler is not able to detetct errors during compiling 
// compile-time is better than run-time coz we get to know aboout the errors durimg compilation but let's take a case in run-time but even for once if that apploication gets in the production and has reached users and now we are getting errors in run time the ot would be problem for everyone.It will be a big problem

class Student{
    String name = "Nitin";
    int age = 21;


    public void info(String name){
        System.out.println(name);
    }

    public void info(int age){
        System.out.println(age);
    }


    //  public void info(String name , int age ){
    //     System.out.println(name + " " + age);
    // }
}

public class Oops_poly_fn_ol{
    public static void main(String[] args){
        Student s1 = new Student();
        // s1.name="Nitin";
        // s1.age=20;
        // s1.info(s1.name, s1.age);
        s1.info(s1.name);
        s1.info(s1.age);
    }
}





