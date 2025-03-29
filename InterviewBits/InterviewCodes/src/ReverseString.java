public class ReverseString {

    public static void reverse(String str){

    //    str.
      char[] a=str.toCharArray();
     // System.out.println(a[a.length-1]);
      
     StringBuilder sb=new StringBuilder();
      for(int i=a.length-1;i>=0;i--){      
       sb.append(a[i]);
      }
      String palin= "HiiH";
     // System.out.println(sb.toString());
      System.out.println(palin);
      System.out.println(sb.toString().equals(palin)); // palindrome check
    }

    public static void main(String[] args) {
      
      //  ReverseString.reverse("Vinay");
      ReverseString.reverse("HiiH");
    }

}
