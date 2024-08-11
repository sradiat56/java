package recurtion;

public class subSequence {
    public static void subSequence(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(idx);
        
        //to be in string
        subSequence(str, idx+1, newStr+ch);

        //not to be in string 
        subSequence(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String s="aaa";
        subSequence(s, 0, "");
    }
}
