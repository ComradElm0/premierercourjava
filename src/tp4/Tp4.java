package tp4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tp4 {
	
	public static void main(String[] args){
		Tp4 demo = new Tp4();
		demo.run();
	}
	private void run(){
		FileWriter mywriter =null;
		try {
			File myfile = new File("test.txt");
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
		Scanner myReader = null;
		try {
			File myfile = new File("test.txt");
			myReader = new Scanner(myfile);
			
			while (myReader.hasNextLine()){
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} finally {
			if (myReader != null){
				myReader.close();
			}
		}
	}
}

