package maratonajavadevdojo.assossiacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest56 {
    public static void main(String[] args) {
        int [] newArray = {1,2,3,4};

        int x =  newArray[newArray.length / 2];
        int y =  newArray[(newArray.length / 2) - 1];
        double r = (double) (x + y) / 2;
        System.out.println(r);;
    }

}

