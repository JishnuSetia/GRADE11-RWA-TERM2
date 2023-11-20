import java.util.*;
public class AdmissionBinary {
    int[] Adno;
    public AdmissionBinary(){
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
    public int binarySearch(int srch_element, int upr, int lwr){
        return lwr>upr?-1:(Adno[(lwr+upr)/2]==srch_element?((lwr+upr)/2):(Adno[(lwr+upr)/2]>srch_element?binarySearch(srch_element, ((lwr+upr)/2)-1, lwr):binarySearch(srch_element, upr, ((lwr+upr)/2)+1)));
    }
    public static void main(String[] args) {
        AdmissionBinary obj = new AdmissionBinary();
        obj.fillArray();
        obj.binarySearch(234, 0, 99);
    }
}
