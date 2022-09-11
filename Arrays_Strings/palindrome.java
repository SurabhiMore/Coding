package Arrays_Strings;
import java.util.Scanner;
public class palindrome {
    // iteratively checking for palindrome
    static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start+=1;
            end-=1;
        }
        return true; 
    }

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
