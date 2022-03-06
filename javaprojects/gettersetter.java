package __pycache__;


public class gettersetter {
   static class hello{
        private int x;
        private String red;
    
    int getX(int y){
    this.x = y;
    System.out.println(y);
    return y;
  } // This code shows how to use a private variable (in this case 'x' and 'red') from another class using a get method.
}       

    public static void main(String[] args) {
        hello object1 = new hello();
        object1.getX(10);
        object1.x =11;
        object1.red="hello my name is sanketh";
        System.out.println(object1.x);
        System.out.println(object1.red);
    }
    
}

