package recurtion;

public class keypad_combination {
    public static String[] keypad={"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypad_comb(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char ch=str.charAt(idx);
        String mapping=keypad[ch-'0'];
        for(int i=0;i<mapping.length();i++){
            keypad_comb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s="23";
        keypad_comb(s, 0, "");
    }
}
