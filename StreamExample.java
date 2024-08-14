import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamExample{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,3,5,2,9,10);
        List<Integer> evenList=list.stream().filter(i->i%2==0);
        System.out.println(evenList);

    }
}