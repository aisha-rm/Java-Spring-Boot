package basics;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class MapXample {

    //count the frequency of occurence of a string in a list of strings

    public static void calculateWordFrequency(List<String> input){
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();  //to hold each string in the input and number of occurence
        //now iterating through the list of strings 
        for (String str : input){
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        System.out.println("The map: " + frequencyMap);
        System.out.println("The set: " + frequencyMap.keySet());

        for (String word : frequencyMap.keySet()){
            System.out.println(word + "|" + frequencyMap.get(word));
        }
    }
    
    public static void main(String[] args){
        calculateWordFrequency(Arrays.asList("Amina", "Aisha", "Mohammed","Amina", "Amina", "Mustapha", "Aisha"));
    }
}
