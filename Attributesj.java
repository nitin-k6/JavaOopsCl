//Modifying attributes
public class Attributesj{
int x=56;
final int y=65;
    public static void main(String[] args){
        Attributesj attr =new Attributesj();
        attr.x=6;
        System.out.println(attr.x); // will override it
        // attr.y=9; // giving error coz we can't change the value of y 
        System.out.println(attr.y); // final keyword won't let it override
    }
}