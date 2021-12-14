package Usuarios_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Livros {
public String n;


	
	public static void main(String[] args) {
	/*	ArrayList<String> n = new ArrayList<>();
 Livros titulos = new Livros();
 
 titulos.n = "orgulho e preconceito | 20.00 R$";
 n.add(titulos.n);
 
 titulos.n = "Eleanor e Park | 30.00 R$";
 n.add(titulos.n);
 		*/
 regTitulo();
 
 

}
	public static void regTitulo() {
		ArrayList<String> n = new ArrayList<>();
 Livros titulos = new Livros();
 
 titulos.n = "orgulho e preconceito | 20.00 R$";
 n.add(titulos.n);
 
 titulos.n = "Eleanor e Nicolas | 30.00 R$";
 n.add(titulos.n);
 System.out.println("Titulo 1 eh: " + n.get(0));
 System.out.println("Titulo 2 eh: " + n.get(1));
	}
}
