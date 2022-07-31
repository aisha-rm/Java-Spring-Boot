import java.util.ArrayList;

public class ListExamples {

    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(500);
        myList.add(2000);

        ArrayList<String> myList2 = new ArrayList<String>();
        myList2.add("Aisha");
        myList2.add("Hadiza");
        myList2.add("Amina");

        int[] numbs = {12, 35, 100, 15};

        String[] names = new String[5];
        names[1] = "Bashir";
        names[3] = "Muhammad";
       

        System.out.println(numbs.length);
        System.out.println(names.length);
        System.out.println(myList.size());
        System.out.println(myList2.size());
        System.out.println(numbs[0]);
        System.out.println(names[0]);
        System.out.println(myList2.get(1));

        ArrayList myList3 = new ArrayList();
        myList3.add(35);
        myList3.add("Mummy");
        myList3.add(3.142);
        myList3.add("Daddy");

        System.out.println(myList3.size());
        System.out.println(myList3.get(2));
        
       
    }
    
}
