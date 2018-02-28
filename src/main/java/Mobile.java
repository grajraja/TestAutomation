import java.io.DataInputStream;
import java.io.IOException;

public class Mobile {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Mobile mobile = new Mobile();
		
		DataInputStream in = new DataInputStream(System.in);
		   int x = Integer.parseInt(in.readLine());
		   int y = in.readInt();
			mobile.apple(x, y);
			mobile.htc();
	}
	
	public int apple(int a, int b)
	{
		
		System.out.println("This is apple mobile");
//		a=1;
//		b=1;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public void htc()
	{
		System.out.println("This is HTC mobile");
	}
	
	}

