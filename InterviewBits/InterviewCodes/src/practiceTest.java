import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class practiceTest {

    public static void DuplicateinArray(int[] arr){
          HashSet<Integer> hash=new HashSet<>();
          for (int i=0 ;i<arr.length;i++) {
            if(!hash.add(arr[i])){ // 3 not added since set can't take duplicates , hence duplicate value is printed
            System.out.println(arr[i]);
            }
          }
       // System.out.println(hash);
    }
    public static void MissingNumberinArray(int[] arr1){
        HashSet<Integer> hash=new HashSet<>();
        for (int i=0 ;i<arr1.length;i++) {
         hash.add(arr1[i]); //just add all numbers and check if number is missing by below for loop
            }
            for (int i=0 ;i<hash.size();i++) {
                if(!hash.contains(i)){
                    System.out.println(i);
                }
            }
          }

      public static void FirstNonRepeatingChar(String str){
           Map<Character,Integer> map=new LinkedHashMap<>();
           char[] c=str.toCharArray();
           for (char d : c) {           
            if(map.containsKey(d)){
              //  System.out.println(d);
            map.put(d, map.getOrDefault(d, 0)+1);
            }else{
                map.put(d, 1);
           }
          
        }
        for (char d : c) {           
            if(map.containsKey(d)){
                    if(map.get(d)==1){
                        System.out.println(d);
                        return;
                    }
           }         
        }
       // System.out.println(map);
      }    

    public static void main(String[] args) {
        int[] arr={1,3,3,4,5};
        int[] arr1={1,3,3,4,5};
        practiceTest.DuplicateinArray(arr);
        practiceTest.MissingNumberinArray(arr1);
        practiceTest.FirstNonRepeatingChar("vinayvay");

      
    }

}
