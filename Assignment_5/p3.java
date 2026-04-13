import  java.util.Scanner;
class GCD_BF{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();
        int gcd=0;
        for (int i = 1; i <Math.min(a,b); i++) {
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.print("Greatest Common Divisor : "+gcd);

    }
}
