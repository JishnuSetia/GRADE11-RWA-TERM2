import java.util.*;
public class Pendulum{
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int[] penArray = new int[array.length];
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        int left=array.length/2-2,right=array.length/2,middle=(array.length/2)-1;
        if(array.length%2!=0){
            left=(array.length/2)-1;
            right=(array.length/2)+1;
            middle = array.length/2;
        }
        boolean lr=false;
        for(int i = 0;i<array.length;i++){
            if(i==0){
                penArray[middle]=array[i];
                continue;
            }
            if(!lr){
                penArray[right] = array[i];
                right++;
                lr = true;
            }else{
                penArray[left] = array[i];
                left--;
                lr = false;
            }
        }
        System.out.println(Arrays.toString(penArray));
    }
}