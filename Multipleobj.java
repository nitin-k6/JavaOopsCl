public class Multipleobj{
    int x=5;

    public static void main(String[] args){
        Multipleobj obj1= new Multipleobj();
        Multipleobj obj2= new Multipleobj();
        obj2.x=10;
        System.out.println(obj1.x); // 5
        System.out.println(obj2.x); // 10

   //If we create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other
    }
}