public class PseudoArithmeticSequence {
    public static void main(String[] args) {
        int[] array = {2,5,6,8,9,12};
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        int left=1,right=array.length-2;
            boolean chk=true;
            while(left<=right){
                if(array[left-1]+array[right+1]!=array[left]+array[right]){
                    chk=false;
                    break;
                }
                left++;
                right--;
            }
            if(chk){
                System.out.println("PAS");
                System.out.println((array[left-1]+array[right+1])*3);
            }
    }
}