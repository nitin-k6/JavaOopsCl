
// When two or more classes inherits a single class, it is known as hierarchical inheritance.

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}

public class Hierarchicalj {
    public static void main(String[] args){
    Cat c = new Cat();
    c.eat();
    c.meow();
    // c.bark(); // give errors

    Dog d = new Dog();
    d.eat();
    d.bark();
    }
    
}
