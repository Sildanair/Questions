public class Main {
    public static void main(String[]args){
        int[] a = new int[] {5,17,8,211,198,59,99,71,15,26,19,17,99};
        output(a);
        sort(a,0,a.length-1);
        output(a);
    }
    public static void sort(int[] array,int from,int to){
        if (from<to) {
            int rootindex = partition(array,from,to);
            sort(array,from,rootindex-1);
            sort(array,rootindex,to);
        }
    }
    public static int partition(int[] array, int left, int right){
        int root = left + (right - left) / 2;
        int middle = array[root];
        while (left<=right) {
            while (array[left] <middle) {
                left++;
            }
            while (array[right]>middle){
                right--;
            }
            if (left<=right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }
    public static void swap(int[]array, int first, int second){
    int temp = array[first];
    array[first]=array[second];
    array[second]=temp;
    }
    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
