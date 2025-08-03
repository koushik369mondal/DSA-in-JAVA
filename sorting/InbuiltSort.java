import java.util.*;  

public class InbuiltSort {
    public static void main(String[] args) {
        // Ascending Order Sort (Full Array)
        int arr[] = {5, 3, 8, 1, 2};
        Arrays.sort(arr); // Default ascending sort
        System.out.println("Ascending Sort: " + Arrays.toString(arr));

        //Sort Specific Range in Ascending Order
        int arr2[] = {5, 3, 8, 1, 2};
        Arrays.sort(arr2, 1, 4); // Sort from index 1 to 3
        System.out.println("Ascending Sort (Range 1-4): " + Arrays.toString(arr2));

        // Descending Order Sort (Full Array)
        // NOTE: Collections.reverseOrder() only works with wrapper classes, not primitives
        Integer arr3[] = {5, 3, 8, 1, 2};
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println("Descending Sort: " + Arrays.toString(arr3));

        // Sort Specific Range in Descending Order
        Integer arr4[] = {5, 3, 8, 1, 2};
        Arrays.sort(arr4, 1, 4, Collections.reverseOrder());
        System.out.println("Descending Sort (Range 1-4): " + Arrays.toString(arr4));
    }
}
