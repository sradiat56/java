package recurtion;

public class permutation {
    public static void permutation(String str,String permutaString){
        if(str.length()==0){
            System.out.println(permutaString);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            String nString=str.substring(0, i)+str.substring(i+1);
            permutation(nString,permutaString+ch);
            
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permutation(s, "");
    }
}
