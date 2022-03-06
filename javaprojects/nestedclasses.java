package __pycache__;

public class nestedclasses {
    static class outerclass{
        int x = 10;

        class innerclass{
             int function(){
                return x;
            }
        } // This code shows how one class can be made inside another and how the objects for the inner class(nested class) be created and called.
        public static void main(String[] args) {
            outerclass object = new outerclass();
            outerclass.innerclass object2 = object.new innerclass();
            System.out.println(object2.function()); 
        }
    }
    
}
