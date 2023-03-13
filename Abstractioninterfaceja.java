interface Animal{
  void walk();  // This method is by default static and public
    // this is abstract function  // INSIDE interface we just define not implement
//   void eat(){} // Inside interface there shouldn't  be any non-abstract fn and neither it's implementation
// Animal(){}  // Constructors are not allowed in interface
    int eyes=2; // All the fields in interface are public, static and final by default. It means no of eyes for all inheriting(animals) are 2 only.We can't change it
 }

 interface Herbivores{

 }

class Horse implements Animal, Herbivores{ //  Now this is Multiple Inheriatnce which is only possible through interface 
     public void walk(){
        System.out.println("Horse walks on 4 legs");  //Here we are implementing it.
    }
}



public class Abstractioninterfaceja {
 public static void main(String[] args)   
}
