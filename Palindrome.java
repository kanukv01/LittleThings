public class Palindrome {
    public static void main(String[] args) {
        String s="MAAM";
        char[] s1=s.toCharArray();
        String s2="";
     //   int i=s1.length;
        for(int i=s1.length-1;i>=0;i--){
          
           s2=s2+Character.toString(s1[i]); 
         
        }
       // s2.trim();
        System.out.println(s2);
        if(s.equals(s2)){
            System.out.println("Palindrome");  
        }else{
            System.out.println("Not Palindrome");  
        }
    }
}
