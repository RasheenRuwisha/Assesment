import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Assesment{


    // For example passing in [1, 1, 2, 4, 4, 5, 5, 5, 6, 7, 9] the following results should occur:
 
    // 1) output all pairs would output: [1,9], [1,9], [4,6], [4,6], [5,5], [5,5], [5,5], [5,5], [5,5], [5,5], [6,4], [6,4] [9,1] , [9,1] 
    // 2) output unique pairs only once would output: [1,9], [4,6], [5,5], [6,4], [9,1] 
    // 3) output the same combo pair only once would output: [1,9], [4,6], [5,5]   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the numbers (separated by space): ");
        String  input = sc.nextLine();
        String[] inputArr = input.split(" ");
        Integer[] arr  = new Integer[inputArr.length];
        for(int i = 0; i < inputArr.length; i++){
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println("All Pairs:");
        System.out.println(getAllPairs(arr , 10));

        System.out.println("Unique Pairs:");
        System.out.println(getPairsOnce(arr , 10));

        System.out.println("Unique Pairs Once:");
        System.out.println(getUniquePairs(arr , 10));
    }


    public static List<List<Integer>> getAllPairs(Integer[] array, int sum){

        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i<array.length;i++){
            for(int j = 0; j<array.length;j++){
                if(array[i] + array[j] == sum){
                    List<Integer> pair = new ArrayList<>();
                    pair.add(array[i]);
                    pair.add(array[j]);
                    result.add(pair);
                }
            }
        }
        return result;
    }

    public static Set<List<Integer>> getPairsOnce(Integer[] array, int sum){
        Set<List<Integer>> set = new LinkedHashSet<List<Integer>>();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] + array[j] == sum){
                    List<Integer> pairs = new ArrayList<>();
                    pairs.add(array[i]);
                    pairs.add(array[j]);
                    set.add (pairs);
                }
            }
        }
        return set;
    }

    public static Set<String> getUniquePairs(Integer[] array, int sum){
        Set<Integer> set = new HashSet<>(Arrays.asList(array));

        // this set will keep track of the unique pairs.
        Set<String> uniquePairs = new HashSet<String>();
    
        for (int i : array) {
            int x = sum - i;
            if (set.contains(x)) {
                int[] y = new int[] { x, i };
                Arrays.sort(y);
                uniquePairs.add(y[0] + "," + y[1]);
            }
        }
        return uniquePairs;
    }

}