import java.util.Scanner;
class Count_divisors{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int count=0;
        int n= sc.nextInt();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                // System.out.print(" "+i);
                count++;
            }
            if(i!=n/i){
                // System.out.print(" "+(n/i));
                count++;
            }

        }
        System.out.println(count);
    }
}
