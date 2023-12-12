import java.util.*;
public class recurssion{
    public static int calcfactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int factnm1=calcfactorial(n-1);
        int factn=n*factnm1;
        return factn;
    }
    public static void main(String args[]){
        int n=5;
        int ans= calcfactorial(n);
        System.out.println(ans);
    }
}