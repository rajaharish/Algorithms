package Practice;

import java.util.Scanner;


public class gemstones {

	public static int[] checkstones(String input,int[] in_ar,int n)
	{

		for (int i = 0; i < input.length(); i++) {
			if(in_ar[input.charAt(i)-'a']==n)
				in_ar[input.charAt(i)-'a']+=1;
		}

		return in_ar;
	}
	
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int tc=in.nextInt();
		String in_comp=in.next();
		int[] in_cnt_ar=new int[26];
		
		for (int i = 0; i < 26; i++) {
			in_cnt_ar[i]=0;
		}
		
		for (int i = 0; i < in_comp.length(); i++) {
			if(in_cnt_ar[in_comp.charAt(i)-'a']==0)
				in_cnt_ar[in_comp.charAt(i)-'a']=1;
		}
		int res=0;
		if(tc>1)
		{
		for (int i = 1; i <tc; i++) {
			String comp=in.next();
			in_cnt_ar=checkstones(comp,in_cnt_ar,i);
		}
		for (int i = 0; i < 26; i++) {
			if(in_cnt_ar[i]==tc)
				res=res+1;
		}
		}
		else
		{
			for (int i = 0; i < 26; i++) {
				if(in_cnt_ar[i]>0)
					res=res+1;
			}
		}
		System.out.println(res);
	}

}
