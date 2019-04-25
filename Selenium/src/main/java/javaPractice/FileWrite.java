package javaPractice;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import cucumber.api.cli.Main;

public class FileWrite{
	String fileName ="MyFile2.txt";
	
	public void usingFileWriter() throws FileNotFoundException {
		 try {
			            FileWriter writer = new FileWriter("./data/"+fileName, true);
			            writer.write("Hello World");
			            writer.write("\r\n");   // write new line
			            writer.write("Good Bye!");
			            writer.close();
			        } catch (IOException e) {
			            e.printStackTrace();
			        } 
		 }

	/*public void usingBufferWriter() {
		FileWriter fw;
		try {
			fw = new FileWriter("./data/"+fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Amazon Indis Private Limited");
			bw.newLine();
			bw.write("TestLeaf Solutions Private Limited");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}*/
	public static void main(String[] args) throws FileNotFoundException {
		FileWrite ww = new FileWrite();
		//ww.usingBufferWriter();
		ww.usingFileWriter();
	}
}
