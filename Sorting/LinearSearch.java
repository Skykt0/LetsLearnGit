package Sorting;

public class LinearSearch {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        int target = 4;
        int ans = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]==target){
                ans = i;
                break;
            }
        }
        System.out.println("target element found at "+ans+" index");
    }
}
