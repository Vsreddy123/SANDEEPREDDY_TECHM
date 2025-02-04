package exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile=new File("src//exception//input.data");
		FileInputStream fis=null;
        try
        {
        	fis=new FileInputStream(inFile);
        	System.out.println("read done");
        }
        catch(IOException e)
        {
        	System.out.println("file not exist");
        }
	}

}