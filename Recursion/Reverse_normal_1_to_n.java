import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        pdi(n);
    }
    
    public static void pdi(int n){
        if(n==0){
            return;
        }
       
       System.out.print(n+" ");
       pdi(n-1);
       System.out.print(n+" ");
    }
}
