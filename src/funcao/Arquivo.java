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
 * Algortimo idealizado para equipe 216 Desenvolvimento Web
 * Prof.: Edir Pereira
 */
public class Arquivo {
	
	List<Product> list = new ArrayList<>();
	public void readFile1(String arquivo) {
//		File path = new File("/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		File path = new File("/home/edir/Documents/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		Scanner read = null;
		try {
			read = new Scanner(path);
			while(read.hasNextLine()) {
				System.out.println(read.nextLine());			
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(read != null) {
				read.close();
			}
		}
	}

	public void readFile2(String arquivo) {
//		String path = "/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo;
		File path = new File("/home/edir/Documents/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
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
		File path = new File("/home/edir/Documents/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			line = br.readLine();
			while(line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
				Product prod = new Product(name, price, qte);
				list.add(prod);
				line = br.readLine();
			}
			System.out.println("Produtos");
			for(Product p : list) {
				System.out.println(p);
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void writeFile(String arquivo) throws IOException{
//		String path = "/home/fennder/Documents/Workspace/eclipse-workspace/JavaProject/src/tmp/" + arquivo;
		File path = new File("/home/edir/Documents/eclipse-workspace/JavaProject/src/tmp/" + arquivo);
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

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
