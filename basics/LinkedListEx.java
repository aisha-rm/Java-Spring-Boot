import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args){
        
        LinkedList<Integer> newList = new LinkedList<Integer>();
        newList.add(500);
        newList.add(250);
        newList.add(125);

        System.out.println(newList.size());
        System.out.println(newList.get(2));
    }
    
}
