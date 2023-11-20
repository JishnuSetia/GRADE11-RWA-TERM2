import java.util.*;
public class Marks {
    String[] name;
    int[] mark;
    int high;
    public Marks(int N){
        name = new String[N];
        mark = new int[N];
    }
    public void accept(){
        Scanner sc=new Scanner (System.in);
        Scanner in=new Scanner (System.in);
        for(int i=0;i<name.length;i++){
            System.out.println("Enter the Name of Student:");
            name[i]=sc.nextLine();
            System.out.println("Enter marks of Student:");
            mark[i] = in.nextInt();
        }
    }
    public void high(int p){
        if(p<mark.length){
            high=mark[p]>high?mark[p]:high;
            high(p+1);
        }else{
            System.out.println("Highest marks is "+high);
        }
    }
    public void toppers(int p){
        if(p<mark.length){
            if(p==0){
                System.out.println("Toppers:");
            }
            if(mark[p]==high){
                System.out.print("\t"+name[p]);
                toppers(p+1);
            }
        }
    }
    public static void main(String[] args) {
        Marks m = new Marks(10);
        m.accept();
        m.high(0);
        m.toppers(0);
    }
}
