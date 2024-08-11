package codeForce;

public class lucky_number {
    public static void main(String[] args) {
        String n="7447447";
        int count=0;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c=='4' || c=='7'){
                count++;
            }

        }
        if(count==4 || count==7){
            System.out.println("yes");
        }
    }
}
