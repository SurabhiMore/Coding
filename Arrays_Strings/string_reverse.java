package Arrays_Strings;

// reversing with extra variable
import java.util.Scanner;
public class string_reverse {
    
    static String reverseString(String str){
        String s = "";
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            s = s+str.charAt(i);
        }
        return s;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(reverseString(str));
    }
}
