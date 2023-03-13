abstract class Animal{  // abstract is just a concept or blueprint .it  actually cannot be created
     abstract void  walk(); 
     public void eats(){
        System.out.println("can eats");
     }
     Animal(){
        System.out.println("You are creating a Animal");
     }
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse can walk");
    }
    Horse(){
        System.out.println("Created a Horse");
    }
}

class Dog extends Animal{
    void walk(){
        System.out.println("Dog can walk");
}
Dog(){
System.out.println("Created a Dog");
}
}


/* --------------------------Important Concept--------------------------- */
// Whenever we cteate a object of derved class so firtsly base class constructor gets called and then derived class.Thi is called constructor chaining.Chain of construtors run whenever we trying to create an object in inheritance
public class Abstractionja {
    public static void main(String[] args){
  Dog d = new Dog();
  d.walk();
  Horse h =new Horse();
  h.walk();
  h.eats();

  Animal a = new Horse();  // will work (works for the Horse .That means  horse object has been created)
  a.walk(); 


  /*Animal a2 =new Animal() ;  // will provide error -->error: Animal is abstract; cannot be instantiated
a2.walk(); Cannot be instantiated means we cannot craete its object

*/ 
  
}
}
