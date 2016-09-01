package string2camel;

public class string2camel {
	public static void main(String[] args) 
	{
	    String sa = "menaga priya";
	    StringBuffer sb = new StringBuffer();
	    String[] s=sa.split(" ");
	    for(int i=0;i<s.length;i++)
	    {
	    sb.append(Character.toUpperCase(s[i].charAt(0)));
	   
	     if (s[i].length() > 1) {
	         sb.append(s[i].substring(1, s[i].length()).toLowerCase());
	        
	      }
	    }
	  
	   System.out.println(sb);

	}
}
