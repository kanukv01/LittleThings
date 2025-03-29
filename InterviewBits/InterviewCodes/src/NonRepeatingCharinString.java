import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharinString {

    public static char NonRepeating(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
          //  map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
        System.out.println("hi");
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
              if(entry.getValue()==1){

                return entry.getKey();
              }
        }
            return 0;        
    }
    
    public static void main(String[] args) {
        String str="swiss";
     // NonRepeatingCharinString n=new NonRepeatingCharinString();
      char result=NonRepeatingCharinString.NonRepeating(str);
        System.out.println(result);
}
}