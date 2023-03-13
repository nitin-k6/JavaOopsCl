class One{
    public void printName(){
        System.out.println("printing");
    }
    int a=44;
}

class Two extends One{
     public void printname2(){
        System.out.println("eeeee");
     }
}


public class Singleinh{
    public static void main(String[] args){
        Two obj = new Two();
    obj.printName();
    obj.printname2();
    System.out.println(obj.a);
    }
}




// class Animal{  
//     void eat(){System.out.println("eating...");}  
//     }  
//     class Dog extends Animal{  
//     void bark(){System.out.println("barking...");}  
//     }  
//     class Singleinh{  
//     public static void main(String args[]){  
//     Dog d=new Dog();  
//     d.bark();  
//     d.eat();  
//     }}  