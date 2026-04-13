import java.util.Scanner;
class SUmofNo {
        public static void main(String[] args) {
        int sum=0;    
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       while(n!=0){
        int digit=n%10;
        n=n/10;
        sum=sum+digit;
       }
       System.out.println("Sum of digits  : "+sum);
    }
}
    