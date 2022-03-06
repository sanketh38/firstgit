package __pycache__;

public class inheritance {
   static class Vehicle{
        protected String brand = "Ford";
        public void honk(){
            System.out.println("toooott tooottt");
        }
    }
   static class car extends Vehicle{
        private String model = "Mustang GT";
        public static void main(String[] args) {
            car obj = new car();
            obj.honk();
            System.out.println(obj.brand+" "+obj.model);

        }
    }
}
