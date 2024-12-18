package flows;

public class FlowControl5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c ='a';

if(c>=48&&c<=57)
{
	System.out.println("Digit");
}
else if(c>=65&&c<=90||c>=97&&c<=122)
{
	System.out.println("Alphabet");
}
else
{
	System.out.println("Special Character");
}
	}

}
