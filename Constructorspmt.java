// public class Constructorspmt{
//     int x;
//     public Constructorspmt(int y){
//         x=y;
//     }
//     public static void main(String[] args){
//     Constructorspmt obj = new Constructorspmt(5);
//     System.out.println(obj.x);
     
//     }
// }

public class Constructorspmt{
    int x; 
    String name;

  public Constructorspmt(int year, String name2 ){
    x=year;
    name =name2;

  }  
    public static void main(String[] args){
    Constructorspmt obj =new Constructorspmt(6 ,"2001");
    System.out.println(obj.x);
    System.out.println(obj.name);

    }
}

