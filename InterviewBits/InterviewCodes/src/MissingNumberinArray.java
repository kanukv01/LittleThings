import java.util.HashSet;

public class MissingNumberinArray {

    public static void main(String[] args) {
        int[] inn={1,2,4,5,6};
        HashSet set=new HashSet<>();
        for (int  n : inn) {
            set.add(n);
        }
     //   System.out.println(set.size());
        for (int i=0;i<=set.size()+1;i++) {
           
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
        }
    }
