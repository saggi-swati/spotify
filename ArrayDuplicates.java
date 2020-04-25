// Remove duplicates from array of integer maintaining original order.
public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {6, 8,1,4, 1,7 ,1, 7,2,5,4,9,6};
        System.out.println(Arrays.toString(removeDuplicates(arr[])));
        
    }
    
    private static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : arr) {
            set.add(value);
        }
        int[] a = new int[set.size()];
        int i = 0;
        for (int val : set)
            a[i++] = val;

        return a;

    }
}