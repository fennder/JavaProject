/**
 * 
 */
package funcao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Product;

/**
 * 
 */
public class Arquivo {
	
	List<Product> list = new ArrayList<>();
	public void readFile1(String arquivo) {
//		File path = new File("/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		File path = new File("/home/edir/Documentos/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		Scanner read = null;
		try {
			read = new Scanner(path);
			while(read.hasNextLine()) {
				System.out.println(read.nextLine());
//				JOptionPareadFile3ne.showMessageDialog(null, read.nextLine());				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//	e.printStackTrace();
			System.out.println(e.getMessage());
//			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			if(read != null) {
				read.close();
			}
		}
	}

	public void readFile2(String arquivo) {
//		String path = "/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo;
		File path = new File("/home/edir/Documentos/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
//				JOptionPane.showMessageDialog(null, line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
//			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
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
//		String path = "/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo;//Simplificado
		File path = new File("/home/edir/Documentos/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		try (BufferedReader br = new BufferedReader(new FileReader(path))){ //Simplificado
			String line = br.readLine(); //Simplificado
			line = br.readLine();
			while(line != null) { //Simplificado
//				JOptionPane.showMessageDialog(null, line); //Simplificado
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
//				Double total = Double.parseDouble(vect[3]);
				Product prod = new Product(name, price, qte);
				list.add(prod);
				line = br.readLine(); //Simplificado
			}
			//			JOptionPane.showMessageDialog(null, "Produtos");
			System.out.println("Produtos");
			for(Product p : list) {
//				JOptionPane.showMessageDialog(null, p);
				System.out.println(p);
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
//			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());//Simplificado
		}
	}
	
	public void writeFile(String arquivo) throws IOException{
//		String path = "/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo;
		File path = new File("/home/edir/Documentos/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		
//		List<Product> list = new ArrayList<>();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)); //incrementou

			bw.write(JOptionPane.showInputDialog(null, "Digite o produto, Descrição: "));
			bw.write(",");
			bw.write(JOptionPane.showInputDialog(null, "Digite o produto, Valor: "));
			bw.write(",");
			bw.write(JOptionPane.showInputDialog(null, "Digite o produto, Quantidade: "));
			bw.write("\n");
			bw.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
