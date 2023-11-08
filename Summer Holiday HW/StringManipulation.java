import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        sc.close();
        System.out.println();
        String strUpper = str.toUpperCase();
        String[] wrds = strUpper.split(" ");
        int aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;
        for(int i =0 ;i<wrds.length;i++){
            for(int j=0;j<wrds[i].length();j++){
                aCount+=wrds[i].charAt(j)=='A'?1:0;
                eCount+=wrds[i].charAt(j)=='E'?1:0;
                iCount+=wrds[i].charAt(j)=='I'?1:0;
                oCount+=wrds[i].charAt(j)=='O'?1:0;
                uCount+=wrds[i].charAt(j)=='U'?1:0;
            }
        }
        System.out.println("No of Vowels");
        System.out.println("A:".concat(Integer.toString(aCount)));
        System.out.println("E:".concat(Integer.toString(eCount)));
        System.out.println("I:".concat(Integer.toString(iCount)));
        System.out.println("O:".concat(Integer.toString(oCount)));
        System.out.println("U:".concat(Integer.toString(uCount)));
        System.out.println();

        System.out.println("No of Words: ".concat(Integer.toString(wrds.length)));
        System.out.println();

        String[] wrdsAsc = wrds.clone();
        String[] wrdsDsc = wrds.clone();
        String[] wrdsFlip = wrds.clone();

        for(int i = 0;i<wrdsAsc.length-1;i++){
            for(int j=0;j<wrdsAsc.length-1-i;j++){
                if(wrdsAsc[j].compareTo(wrdsAsc[j+1])>0){
                    String tmp = wrdsAsc[j];
                    wrdsAsc[j] = wrdsAsc[j+1];
                    wrdsAsc[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(wrdsAsc).replace('[', ' ').replace(']', ' ').replace(',', ' '));
        System.out.println();

        for(int i = 0;i<wrdsDsc.length-1;i++){
            for(int j=0;j<wrdsDsc.length-1-i;j++){
                if(wrdsDsc[j].length()<wrdsDsc[j+1].length()){
                    String tmp = wrdsDsc[j];
                    wrdsDsc[j] = wrdsDsc[j+1];
                    wrdsDsc[j+1] = tmp;
                }else if(wrdsDsc[j].length()==wrdsDsc[j+1].length() && wrdsDsc[j].compareTo(wrdsDsc[j+1])<0){
                    String tmp = wrdsDsc[j];
                    wrdsDsc[j] = wrdsDsc[j+1];
                    wrdsDsc[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(wrdsDsc).replace('[', ' ').replace(']', ' ').replace(',', ' '));
        System.out.println();

        for(int i = 0;i<wrdsFlip.length;i++){
            if(wrdsFlip[i].length()>2){
                String nString = Character.toString(wrdsFlip[i].charAt(wrdsFlip[i].length()-1)).concat(wrdsFlip[i].substring(1, wrdsFlip[i].length()-1)).concat(Character.toString(wrdsFlip[i].charAt(0)));
                wrdsFlip[i] = nString;
            }
            else{
                if(wrdsFlip[i].length()==2){
                    String nString = Character.toString(wrdsFlip[i].charAt(1)).concat(Character.toString(wrdsFlip[i].charAt(0)));
                    wrdsFlip[i] = nString;
                }
            }
        }

        System.out.println(Arrays.toString(wrdsFlip).replace('[', ' ').replace(']', ' ').replace(',', ' '));
        System.out.println();
    }
}