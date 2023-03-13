// final class Car{   // If you don't want other classes to inherit from a class, use the final keyword 
class Car{
 public String name;
 protected int age;
 public String shape;
 


 public void honk(){
    System.out.println("Tutuututut");   
 }
}


public class Oopsinheritancej extends Car{  // without extends Car it's still working.
    public static void main(String[] args){
      Car mycar = new Car();

      mycar.honk();
      mycar.name="Ford";
      mycar.shape="Normal";
      mycar.age=1;
      System.out.println(mycar.name);
      System.out.println(mycar.shape);
      System.out.println(mycar.age);
      
    
       
    }

}





 