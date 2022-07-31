public class VowelOnly {
    //create a method that returns only the vowels in a given string

    public static String vowels(String input){

        String vowel = "aeiou";
        StringBuilder builder = new StringBuilder();

        for (char c: input.toCharArray()){
            if (vowel.contains(String.valueOf(c).toLowerCase())){
                builder.append(c);
            }
        }
        return builder.toString();
    }
    
    public static void main(String[] args){
        System.out.print(vowels("Aisha Mohammed MUSTAPHA"));
    }
    
}
    
    
