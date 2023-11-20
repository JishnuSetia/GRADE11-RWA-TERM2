public class code {
    public static int high(int[] arr, int indx, int high){
        return indx==arr.length?high:(arr[indx]>high?high(arr, indx+1, arr[indx]):high(arr, indx+1, high));
    }
    public static int low(int[] arr, int indx, int low){
        return indx==arr.length?low:(arr[indx]<low?low(arr, indx+1, arr[indx]):low(arr, indx+1, low));
    }
    public static int sum(int[] arr, int index) {
        return index==arr.length?0:arr[index]+sum(arr, index+1);
    }
    public static int linearSearch(int[] a, int srch_element, int indx){
        return indx==a.length?-1:(a[indx]==srch_element?indx:linearSearch(a, srch_element, indx+1));
    }
    public static int binarySearch(int a[ ], int srch_element, int upr, int lwr){
        return lwr>upr?-1:(a[(lwr+upr)/2]==srch_element?((lwr+upr)/2):(a[(lwr+upr)/2]>srch_element?binarySearch(a, srch_element, ((lwr+upr)/2)-1, lwr):binarySearch(a, srch_element, upr, ((lwr+upr)/2)+1)));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(binarySearch(array, 2,2,0));
    }
}
