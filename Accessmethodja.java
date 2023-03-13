//----------------------Access Methods--------------------//
//----------------------4 Cases---------------------------//
/*public class Accessmethodja {
 
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  static int speed(int maxSpeed) {
    return maxSpeed;
  }

  public static void main(String[] args) {
    Accessmethodja myCar = new Accessmethodja();     
    myCar.fullThrottle();     
    speed(200);          
    System.out.println(speed(200));
  }
}*/

/*
public class Accessmethodja {
 
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

   public void speed(int maxSpeed) {
     System.out.println("Max speed is: " + maxSpeed);
   }


  public static void main(String[] args) {
    Accessmethodja myCar = new Accessmethodja();     
    myCar.fullThrottle();     
    myCar.speed(200);          
  }
}
*/


/*
public class Accessmethodja{
 
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  
  static void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed); //logical *
  }

  public static void main(String[] args) {
    Accessmethodja myCar = new Accessmethodja();    
    myCar.fullThrottle();      
    speed(200);          
  }
}
*/

public class Accessmethodja{
 
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  
  public int speed(int maxSpeed) {
    return maxSpeed;
  }

  public static void main(String[] args) {
    Accessmethodja myCar = new Accessmethodja();    
    myCar.fullThrottle();      
    myCar.speed(200);       
    System.out.println(myCar.speed(200)); //logical *

  }
}
