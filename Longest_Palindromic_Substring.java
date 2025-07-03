//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str="baba";
        System.out.println(Longest_Palindromic_Substring(str));
    }

    public static String Longest_Palindromic_Substring(String str){
        int l;
        String s="";
        int left;
        int right;
        for(int i=0; i<str.length(); i++){
             left=i;
             right=i;
            while (left>=0 && right <str.length() && str.charAt(left)==str.charAt(right)){
                if(right-left>=s.length()){
                 s=str.substring(left,right +1);
                }
                left --;
                right ++;
            }
            left=i;
            right=i+1;
            while (left>=0 && right < str.length() && str.charAt(left)==str.charAt(right)){
                if(right -left >=s.length()){
                    s=str.substring(left, right +1);

                }
                left --;
                right ++;
            }

        }

        return s;
    }

    
}