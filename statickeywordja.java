import javax.xml.stream.events.StartDocument;

class Student{
    String name;
    static String  school; // using static keyword multiple copies for the objects will be made 
}

public class statickeywordja {
    public static void main(String[] args){
     Student.school="APSK"; // static keyword can be accessed using class_name
     Student student1 = new Student();
     student1.name="Nitin";
     System.out.println(student1.name);
     System.out.println(student1.school); 
    }
}
 