import java.util.Scanner;
class primeNo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
        int value=0;
        for (int i = 2; i <=n; i++) {
            if(n%i==0){
                value=i;
                break;
            }

        }
        if(value==n){
            System.out.println("Prime Number ");
        }
        else{
            System.out.println("Not Prime Number ");
        }
    }
}
