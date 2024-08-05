package maratonajavadevdojo.exerciciod;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println(sla());
    }

    public static int sla(){
        String s = "jjjjjjjj";
        ArrayList<String> arrayList = new ArrayList<>();
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {

                Character n = s.charAt(i);
                Character m = s.charAt(j);


                if (n.equals(m) && i < j) {
                    arrayList.add(s.substring(i, j));
                } else if(n.equals(m)){
                    arrayList.add(s.substring(j, i));
                }

            }
        }
        for (String parts : arrayList) {
            if (parts.length() > length) {
                length = parts.length();
                System.out.println(parts);

            }

        }
        return length;
    }
}


