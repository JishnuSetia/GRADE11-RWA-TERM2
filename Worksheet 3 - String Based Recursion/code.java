public class code {
    public static int countVowel(String S){
        return S.isEmpty() ? 0 : "aeiou".indexOf(S.charAt(0)) != -1 ? 1 + countVowel(S.substring(1)) : countVowel(S.substring(1));
    }
    public static int countWord(String S) {
        return S.isEmpty() ? 0 : (S.indexOf(' ') != -1 ? 1 + countWord(S.substring(S.indexOf(' ') + 1)) : 1);
    }    
    public static int countSentence(String S) {
        return S.isEmpty() ? 0 : (S.indexOf('.') != -1 ? 1 + countSentence(S.substring(S.indexOf('.') + 1)) : 1);
    }
    public static boolean palin(String S, int start, int end){
        return start>=end?true:(S.charAt(end)==S.charAt(start)?palin(S, start+1, end-1):false);
    }
    public static String reverse(String S){
        return S.isEmpty()?"":Character.toString(S.charAt(S.length()-1))+reverse(S.substring(0, S.length()-1));
    }
    public static String toggleCase(String S){
        return S.isEmpty()?"":toggleCase(S.substring(0,S.length()-1))+Character.toString(Character.isUpperCase(S.charAt(S.length()-1))?Character.toLowerCase(S.charAt(S.length()-1)):Character.toUpperCase(S.charAt(S.length()-1)));
    }
    public static String extraspace(String S) {
        return S.isEmpty()?"":S.indexOf(' ')==-1?S:extraspace(S.substring(0, S.indexOf(' ')))+extraspace(S.substring(S.indexOf(' ')+1));
    }
    public static void pattern1(String S){
        if(S.isEmpty()){
            return;
        }
        System.out.println(S);
        pattern1(S.substring(1));
    }
    public static void pattern2(String S){
        if(S.isEmpty()){
            return;
        }
        System.out.println(S.charAt(0));
        pattern2(S.substring(1));
    }
    public static void pattern3(String S){
        if(S.isEmpty()){
            return;
        }
        pattern3(S.substring(1));
        System.out.println(S);
    }
    public static void pattern4(String S){
        if(S.isEmpty()){
            return;
        }
        pattern4(S.substring(0,S.length()-1));
        System.out.println(S);
    }
    public static void pattern5(String S){
        if(S.isEmpty()){
            return;
        }
        System.out.println(S);
        pattern5(S.substring(0,S.length()-1));
    }
}
