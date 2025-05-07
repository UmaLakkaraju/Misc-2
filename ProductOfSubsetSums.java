//TC O(N)   SC O(1)
public class ProductOfSubsetSums {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int setval = 1;
        for(int i=0; i< arr.length;i++){
            setval *= (1+arr[i]);
        }
        System.out.println(setval-1);
    }
}
