package p16_nonrepeater_number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p16_nonrepeater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa={1,2,1,2,16,16,29,13,13};
		int[] bb=new int[a.length];
		int[] cc=new int[a.length];
		int vv=0;
		int pp=0;
		int cnt=0;
		
		for(int i=0;i<aa.length;i++)
		{
			cnt=0;
			for(int j=0;j<aa.length;j++)
			{
				if(i!=j)
				{
					if(aa[i]==aa[j])
					{
						cnt++;
					}
				}
			}
			if(cnt==0)
			{
				System.out.println(aa[i]);
			}
		}
		

}
}
