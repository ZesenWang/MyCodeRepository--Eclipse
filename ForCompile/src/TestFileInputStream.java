import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TestFileInputStream {
	public static void main(String[] args) throws IOException{
		FileInputStream in=new FileInputStream("");
		int n=5;
		byte buffer[]=new byte[n];
		while(in.read(buffer)!=-1&&(n>0)){
			System.out.println(new String(buffer));
		}
	}
}
