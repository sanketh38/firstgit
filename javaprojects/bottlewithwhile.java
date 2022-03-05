public class bottlewithwhile {
   public static void main(String[] args) {
    int x = 100;
    while(x>0){
        String word = "bottles";
        if (x==1){
            word = "bottle";
            System.out.println(x + " " + word + " on the wall");
        }else {
            System.out.println(x+" "+ word+ " on the wall");
        } x--;
   }
   }
}

