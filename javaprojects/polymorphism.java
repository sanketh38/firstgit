package __pycache__;

public class polymorphism {
   static class animals{
        public void animalsounds(){
            System.out.println("animals make sounds");
        }
    }
 static class dog extends animals{
     public void animalsounds() {
         System.out.println("Dogs say: bow wow");
     }
 }
 static class cat extends animals{
     public void animalsounds() {
         System.out.println("Cats say: meow meow");
     }
 }
 public static void main(String[] args) {
     animals allanims = new animals();
     dog doggo = new dog();
     cat pussy = new cat();
     allanims.animalsounds();
     doggo.animalsounds();
     pussy.animalsounds();

 }
}

