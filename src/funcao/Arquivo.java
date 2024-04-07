/**
 * 
 */
package funcao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Arquivo {
	
	public void readFile1(String arquivo) {
		
		File file = new File("/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		Scanner read = null;
		try {
			read = new Scanner(file);
			while(read.hasNextLine()) {
				JOptionPane.showMessageDialog(null, read.nextLine());				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//	e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			if(read != null) {
				read.close();
			}
		}
	}

	public void readFile2(String arquivo) {
		// Variável
		String path = "/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				JOptionPane.showMessageDialog(null, line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
		finally{
			try {
				br.close();
				fr.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void readFile3(String arquivo) {
		String path = "/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				JOptionPane.showMessageDialog(null, line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}

}
