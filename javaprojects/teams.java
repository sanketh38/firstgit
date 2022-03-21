package loda;

public class teams {
    public static void main(String[] args) {
        int race = 0;
        int redbull = 0;
        int perez=0;
        int verstappen=0;
        int charles = 26;
        int sainz = 18;
        for(int ferrari =44;ferrari>redbull;race++){
            redbull = perez + verstappen;
            ferrari = charles + sainz;
            verstappen = verstappen + 25;
            perez = perez + 12;
            charles = charles + 18;
            sainz = sainz + 15;
        }
        System.out.println(race+" wins needed for Red Bull to beat Ferrari.");
    }
}
             // This is assuming red bull finishes p1 and p4 while ferrari finishes p2 and p3.
