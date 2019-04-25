package javaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FileReading {
	String fileName = "MyFile.txt";

	public void fileRead() {
		String line =null;
		try {
			FileReader fr = new FileReader("./data/"+fileName);
			BufferedReader br = new BufferedReader(fr);
			try {
				while((line = br.readLine())!= null) {
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}} catch (FileNotFoundException e) {
				e.printStackTrace();

			}
	}

	public void read() throws FileNotFoundException {
		try {
			File file =  new File("./data/"+fileName);
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		FileReading read = new FileReading();
		read.fileRead();
		read.read();

	}

}