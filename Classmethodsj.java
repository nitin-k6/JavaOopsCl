     // --------------- Static vs Public------------------//
     /*we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects*/

     public class Classmethodsj{

        static void myStaticMethod(){
            System.out.println("Hi I am Static Method");
        }

        public void myPublicMethod(){
            System.out.println("Hi I am Public Method");
        }

        public static void main(String[] args)
        {
            myStaticMethod();
            // myPublicMethod(); // give error  because it is non static so gotta access through object of the class
            Classmethodsj obj =new Classmethodsj();
            obj.myPublicMethod();
            
        }
     }
       