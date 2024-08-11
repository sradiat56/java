package recurtion;

public class removeDuplicate {
    public static boolean[] map =new boolean[26];
    public static void removeDuplicate(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(idx);
        if(map[ch-'a']){
            removeDuplicate(str, idx+1, newStr);
        }
        else{
            newStr+=ch;
            map[ch-'a']=true;
            removeDuplicate(str, idx+1, newStr);

        }
    }
    public static void main(String[] args) {
        String s="aabbcddd";
        removeDuplicate(s, 0, "");
    }
}
