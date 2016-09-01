package string2camel;

public class string2camel {
	public static void main(String[] args) 
	{
	    String start = "manJu dEepu";
	    StringBuffer sb = new StringBuffer();
	    String[] s=start.split(" ");
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
