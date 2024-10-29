/**
 * InnerDsa
 */

// brute force for moving all zeroes in the End

// optimal soltuion for moving all zeroes to End

// Union of two sorted array using set data stucture

// optimal solution for union
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static List<Integer> union1(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>(); // Use a set to store unique elements
        List<Integer> result = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (set.add(arr1[i])) { // Add to set and check if it was already present
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (set.add(arr2[j])) {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n1) {
            if (set.add(arr1[i])) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < n2) {
            if (set.add(arr2[j])) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }

    }

    public static void main(String args[]) {
        int arr1[] = { 1, 1, 1, 0, 2, 0, 0, 3, 3 };
        int arr2[] = { 2, 3, 4, 5, 6, 7, 8 };
        List<Integer> res = union1(arr1, arr2);

        System.out.println(res);
    }
}
