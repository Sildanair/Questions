import java.util.Arrays;

public class q5 {
    public static void main(String[] args){
    boolean [] a = new boolean[100];
    Arrays.fill(a,2,99,true);
    for (int i = 2; i*i<100; i++){
        for (int j=2*i;j<100; j+=i){
            a[j]=false;
        }
    }
    for (int i = 0; i<100;i++){
        if (a[i]==true){
            System.out.print(i+" ");
        }
    }
    }
}
