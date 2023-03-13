class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void setColor(){
        System.out.println(this.color);  // this here tells us which object has called this function.
    }                       // any object who has called setColor() fn this will provide color to it because it written after dot(.)
}

class Student{
    // String name = "Nitin";
    // int age =21 ;

    String name ;
    int age ;


    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    

    }

    Student( String subject, int age2 ){
        this.name= subject;
        this.age= age2;
    }


    // for copy constructor we would have done this
    Student( Student s2){
        this.name= s2.name;
        this.age =s2.age;
    }
}

public class Oopsj{
    public static void main(String[] args){
    Pen  pen1 = new Pen();
    Pen pen2 = new Pen();
    pen1.color="blue";
    pen1.type="gel";
    pen2.color="black";
    pen2.type="ballpoint";

    System.out.println(pen1.color);
    System.out.println(pen1.type);
    pen1.write();
    System.out.println(pen2.color);
    System.out.println(pen2.type);

    pen1.setColor();
    pen2.setColor();

    Student s1 =new Student( "Maths", 23);   // will call constructor .ALSO if we hadn't mentioned it then  java provides default constructor.
     s1.name="Nitin";
    s1.age =21;   //coz Nitin and 21 are already mentioned in class Student.
    s1.info(); // without oonstructor Nitin and 21 willl be printed


    Student s2 =new Student(s1);  // for copy constructor
    s2.info();

    }
}

