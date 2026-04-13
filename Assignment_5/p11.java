import java.util.Scanner;
 class p6 {
        public static void main(String[] args) {
        int count=0;  
           
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : "); 
       int n =sc.nextInt();
       int original=n; 
       int n2=n;
       while(n!=0){
        n=n/10;
        count++;
       }
       double sum=0; 
        while(n2!=0){
        int digit=n2%10;
        n2=n2/10;
       sum =sum+(Math.pow(digit,count));
       }
       if(original==sum){
        System.out.println("Amstrong Number ");
       }
       else{
        System.out.println("not Amstrong Number ");

       }
    }
}
    