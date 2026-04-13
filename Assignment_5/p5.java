import  java.util.Scanner;
class Coprime_No{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();
        int gcd=1;
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            gcd=b;
        }
        else{
            gcd=a;
        }
        System.out.print("Greatest Common Divisor : "+gcd);

        if(gcd==1){
            System.out.print("Coprime Number ");
        }
        else{
            System.out.print("not a Coprime Number ");
        }
    }
}
