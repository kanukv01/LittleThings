import java.util.HashSet;

public class DuplicateinArray {

    public static void findDuplicate(int[] arr){

    
        HashSet<Integer>  hash=new HashSet<>();
        for (int num : arr) {
            if(!hash.add(num)){ 
                //Hashset  stores only unique values
                // If add() returns false, it means num is a duplicate
                System.out.println(num);
            };
        }
      
      

    }

    public static void findUnique(int[] arr){

    
        HashSet<Integer>  hash=new HashSet<>();
        for (int num : arr) {
            hash.add(num);
        }
        System.out.println(hash);
      

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5};
        findUnique(arr);
        findDuplicate(arr);
    }
}
