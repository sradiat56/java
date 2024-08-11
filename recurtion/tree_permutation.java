package recurtion;

public class tree_permutation {
    public static void tree_permutation(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            tree_permutation(newstr, perm+ch, idx+1);

        }
    }
    public static void main(String[] args) {
        String str="ABC";
        tree_permutation(str, "", 0);
    }
}
