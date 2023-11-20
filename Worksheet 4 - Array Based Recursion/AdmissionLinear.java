import java.util.*;
public class AdmissionLinear {
    int[] Adno;
    public AdmissionLinear(){
        Adno = new int[100];
    }
    public void fillArray(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<Adno.length;i++){
            System.out.println("Enter the admission number of student: ");
            Adno[i] = sc.nextInt();
        }
        for(int i=0;i<Adno.length;i++){
            for(int j=0;j<Adno.length-1-i;j++){
                if(Adno[j]>Adno[j+1]){
                    int temp = Adno[j];
                    Adno[j]=Adno[j+1];
                    Adno[j+1]=temp;
                }
            }
        }
    }
    public int linearSearch(int srch_element, int indx){
        return indx==Adno.length?-1:(Adno[indx]==srch_element?indx:linearSearch(srch_element, indx+1));
    }
    public static void main(String[] args) {
        AdmissionLinear obj = new AdmissionLinear();
        obj.fillArray();
        obj.linearSearch(234, 0);
    }
}
