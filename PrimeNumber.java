
public class PrimeNumber {
public static void main(String[] args) {
    int i,m=0,Flag=0;
    int n=4;
    m=n/2;
    if(n==0 | n ==1){
        System.out.println("Not prime");
    }
    for(i=2;i<=m;i++){
      if(n%i==0){
        System.out.println("Not prime");
        Flag=1;
        break;
      }
    }
    if(Flag==0){
        System.out.println(" prime");
    }
}
}
