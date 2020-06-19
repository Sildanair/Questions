public class q7 {
    public static void main(String[] args){
        int[] a = new int[11];
        a[0] = 1;
        a[1] = 1;
        System.out.print(a[0]+" " + a[1] + " ");
        for(int i = 2;i<11;i++){
            a[i] = a[i-2]+a[i-1];
            System.out.print(a[i] + " ");
        }
    }
}
