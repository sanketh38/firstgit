public class objects {
    public static void main(String[] args) {
        villian obj = new villian();
        obj.name = "joker";
        obj.evil = 10;
        obj.printstate();
    }
    static class villian{
           int evil;
           String name;
         void printstate(){
             System.out.println("This villian is "+ name+" and the level of evil is "+evil);
         }
    }
}
