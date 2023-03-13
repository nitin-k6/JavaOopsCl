public class Constructorsja{
    int x;


    public Constructorsja(){
     x=5;   // if we put int before x here the op will be 0.
    }
    public static void main(String[] args){
        Constructorsja obj =new Constructorsja();
        System.out.println(obj.x);

    }
}