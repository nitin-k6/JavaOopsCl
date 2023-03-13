
class One{
    public void print() {
        System.out.println("Printing");
    }
    int a;
}


class Two extends One{
   int b=66;
   public void write(){
    System.out.println("Writing");
   }

}

class Three extends Two{
int c=44;
public void listen(){
    System.out.println("Listening");
}
}


public class Multilevelinh {
    public static void main(String[] args){
        Three obj = new Three();
        obj.print();
        obj.write();
        obj.listen();
        obj.a=25;
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);


    
    }
}



// class Animal{  
//     void eat(){System.out.println("eating...");}  
//     }  
//     class Dog extends Animal{  
//     void bark(){System.out.println("barking...");}  
//     }  
//     class BabyDog extends Dog{  
//     void weep(){System.out.println("weeping...");}  
//     }  
//     class Multilevelinh{  
//     public static void main(String args[]){  
//     BabyDog d=new BabyDog();  
//     d.weep();  
//     d.bark();  
//     d.eat();  
//     }}  
