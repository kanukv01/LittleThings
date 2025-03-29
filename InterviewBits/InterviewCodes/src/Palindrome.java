public class Palindrome {


    public static void main(String[] args) {
        int originalNum=121;
        int num= 121;
        int reverse=0;

        while(num>0){
            int digit=num%10; // 
        reverse=reverse*10 +digit;
        num = num/ 10;
        System.out.println(num);
        }
      //  System.out.println(num);
        System.out.println(reverse==originalNum);
    }
}
