package recurtion;
import java.util.HashSet;
public class unice_subSequence {
    public static void subSequence(String str,int idx,String newStr,HashSet<String> set){
        if(idx==str.length()){
           if(set.contains(newStr)){
            return;
           }
           else{
            System.out.println(newStr);
            set.add(newStr);
            return;
           }
        }
        char ch=str.charAt(idx);
        
        //to be in string
        subSequence(str, idx+1, newStr+ch, set);

        //not to be in string 
        subSequence(str, idx+1, newStr,set);
    }
    public static void main(String[] args) {
        String s="aaa";
        HashSet<String> set=new HashSet<>();
        subSequence(s, 0, "",set);
    }
}
