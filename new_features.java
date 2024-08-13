import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class new_features{
    public static void main(String[] args) {
      //  Welcom i=()-> { System.out.println("i am Lambda");
      //  Welcom i=(name)-> { System.out.println("i am Lambda "+name);
      Welcom i=(a,b)-> a+b;
    System.out.println(i.hello(5, 7));

    Welcom i1=(a,b)->{ System.out.println("Adding");
    return a+b;
    };
    System.out.println(i1.hello(4, 7));

    ArrayList a=new ArrayList<>();
    a.add(4);
    a.add(10);
    a.add(5);

   a.forEach(b->System.out.println(b));

   Predicate<Integer> p=(age)->age>18;
   System.out.println(p.test(19));
   Predicate<String> p1=(s)->s.length()<5;
   System.out.println(p1.test("vinay"));
   Function<String,Integer> f=(s)->s.length();
   System.out.println(f.apply("Vinay"));
   Consumer<String> c=(s)-> System.out.println("consumed "+s);
   c.accept("Vinay");
}
}