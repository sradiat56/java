package codeForce;

public class valid_abbreviation {
    public static boolean validword(String word, String abbr){
        int i=0;
        int j=0;
        
        while(i< word.length() && j<abbr.length()){
        char x=word.charAt(i);
        char y=abbr.charAt(j);
        if(x==y){
            i++;
            j++;
            continue;
        }
        if(y >'9' || y<='0'){
            return false;
        }
        int numindex=j;
        while(j<abbr.length() && abbr.charAt(j) >='0' && abbr.charAt(j)<='9'){
            j++;
        }
        int len=Integer.valueOf(abbr.substring(numindex, j));
        i+=len;
    }
    return i==word.length() &j == abbr.length();
    }
    public static void main(String[] args) {
        String s="internationlization";
        String w="i12iz4n";
        System.out.println(validword(s,w));
    }
}
