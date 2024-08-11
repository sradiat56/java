package recurtion;

public class move_all_x {
    public static void moveallx(String str,int idx,int count, String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char ch=str.charAt(idx);
        if(ch =='x'){
            count++;
            moveallx(str, idx+1, count, newString);
        } else {
            newString+=ch;
            moveallx(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveallx(str, 0, 0,"");
    }
}
