import java.util.Scanner;
 class Count_no{
        public static void main(String[] args) {
        int count=0;    
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       while(n!=0){
        n=n/10;
        count++;
       }
       System.out.println("Total Digits in Number : "+count);
    }
}