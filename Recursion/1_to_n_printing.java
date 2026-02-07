import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        ac(n);
    }
    
    public static void ac(int n){
        if(n==0){
            return;
        }
       
       ac(n-1);
       System.out.print(n+" ");
    }
}
