package tp4;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tp4 {
	
	public static void main(String[] args){
		Tp4 demo = new Tp4();
		demo.run();
	}
	private void run(){
		FileWriter mywriter =null;
		try {
			File myfile = new File("C:\\Users\\ecorb\\Documents");
			if (!myfile.exists()){
				myfile.createNewFile();
			}
			mywriter = new FileWriter(myfile);
			mywriter.write(("Hello from code!"));
			mywriter.flush();
		}catch (IOException e){
			System.out.println(e.getMessage());
		} finally {
			if (mywriter != null){
				try{
					mywriter.close();
				}catch (IOException e){
					System.out.println(e.getMessage());
				}
			}
			
		}
	}
}

