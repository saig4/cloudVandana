import java.util.Arrays;
import java.util.Scanner;

public class pangram {
//pangram means a word that contains all alphabets from a to z
	public static void main (String[]args)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter a word");
		String str=sc.nextLine();
		String s1=str.replace(" ","");
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str1.indexOf(ch)==-1) {
				str1+=ch;
			}
		}
		String s2=str1.toLowerCase();
		char ch1[]=s2.toCharArray();
       Arrays.sort(ch1);
       String s=new String(ch1);
       System.out.println("A pangram is a sentence that contains all the alphabets from a to z");
      System.out.println(s);
      
       }
	}