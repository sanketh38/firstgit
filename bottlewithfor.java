public class bottlewithfor {
    public static void main(String[] args) {
        
        for(int x =100;x>0;x--){
            String word = "bottles";
            if(x==1){
                word = "bottle";
                System.out.println(x+" "+word+" on the wall");
            }else{
                System.out.println(x+" "+word+" on the wall");
            }
        }
    }
    
}
