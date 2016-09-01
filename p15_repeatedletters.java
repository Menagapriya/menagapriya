package p15_repeatedletters;

import java.util.Arrays;

public class p15_repeatedletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is a samaple sentence example";
		String[] ss=s.split(" ");
		int count=0;
		int[] aa=new int[ss.length];
		int p=0;
		int[] b=new int[aa.length];
		
		for(int i=0;i<ss.length;i++)
		{
			count=0;
			for(int j=0;j<ss[i].length();j++)
			{
				
					for(int m=j+1;m<ss[i].length();m++)
					{
						if(ss[i].charAt(j)==ss[i].charAt(m))
						{
							count++;
						}
					}
				
			}
			aa[p]=count;
			p++;
		}
		
			
			for(int i=0;i<b.length;i++)
			{
				b[i]=aa[i];
				System.out.println(b[i]);
			}
			Arrays.sort(b);
			for(int i=0;i<aa.length;i++)
			{
				if(b[b.length-1]==a[i])
				{
					System.out.println(ss[i]);
				}
			}
			

	}

}
