public class q4 {
    public static void main(String[] args){
        long[] a = new long[10];
        for (int i = 0; i<a.length; i++){
            a[i] = Math.round(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        min(a);
        max(a);
        average(a);
    }
    public static void min(long[] array){
        long min = 32767;
        for (int i = 0; i<array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Минимальное значение = "+min);
    }
    public static void max(long[] array){
        long max = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Максимальное значение = "+max);
    }
    public static void average(long[] array){
        long sum = 0;
        for (int i = 0; i<array.length; i++){
            sum+=array[i];
        }
        System.out.println("Среднее значение = "+Math.round(sum/array.length));
    }
}
