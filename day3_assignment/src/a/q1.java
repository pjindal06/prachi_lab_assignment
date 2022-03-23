package a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class q1 {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		try {
		FileInputStream fr = new 
					 FileInputStream("/users/himan/Desktop/photo/bar.png");
			FileOutputStream fw = 
					new FileOutputStream("/users/himan/Desktop/photo/bar2.png ");
		
			BufferedInputStream fr1 = new 
					BufferedInputStream(new FileInputStream("/users/himan/Desktop/photo/bar.png"));
			BufferedOutputStream fw1 = new BufferedOutputStream(
					new FileOutputStream("/users/himan/Desktop/photo/bar2.png"));
			int i = 0;
			while ((i = fr1.read()) != -1) {
				fw1.write(i);
			}
		fw1.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	long end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start) + " ms");
		try {
			FileReader fr=new FileReader("/users/himan/Desktop/photo/bar.png");
			FileWriter fw=new FileWriter("/users/himan/Desktop/photo/bar2.png");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}			
		System.out.println("file is written");
	}
}
