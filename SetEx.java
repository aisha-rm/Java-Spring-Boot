import java.util.*;

public class SetEx {
    //find duplicate characters in a string
    public static String findDuplicates(String input){
        Set<Character> seen = new TreeSet<Character>();
        ArrayList<Character> duplicates = new ArrayList<Character>(); 
        for (int i = 0; i < input.length(); i++){
            if (seen.contains(input.charAt(i))){
                duplicates.add(input.charAt(i));
            }else{
                seen.add(input.charAt(i));
            }
        }
        //System.out.print(seen);
        //System.out.println(duplicates);
        System.out.println(duplicates.toString(duplicates));
        return "";
    }

    public static void main(String[] args){
        findDuplicates("aeiouesea");
    }
}

