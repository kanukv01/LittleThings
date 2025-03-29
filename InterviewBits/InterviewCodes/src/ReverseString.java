public class ReverseString {

    public static void reverse(String str){

    //    str.
      char[] a=str.toCharArray();
     // System.out.println(a[a.length-1]);
      
     StringBuilder sb=new StringBuilder();
      for(int i=a.length-1;i>=0;i--){      
       sb.append(a[i]);
      }
      System.out.println(sb);
    }

    public static void main(String[] args) {
        ReverseString.reverse("Vinay");
    }

}
