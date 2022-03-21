package loda;

import java.util.Scanner;

public class drivers{
    public static void main(String[] args) {
        int max = 0;
        int race = 0;
        for(int leclerc= 26;leclerc>max;race++){
            max = max + 25;
            leclerc = leclerc + 18;
        }
        System.out.println(race+" wins needed for Max to take the lead");
    }
    }

