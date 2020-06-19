public class BubbleSort {
    public static void main(String[]args){
        int[] a = new int[] {5,17,8,211,198,59,99,71};
        output(a);
        for(int i =0; i< a.length; i++){
            for (int j=0; j<a.length-1; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        output(a);
    }
    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Окончание вывода массива");
    }
}


