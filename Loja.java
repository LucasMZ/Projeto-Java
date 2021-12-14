package Usuarios_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
 public ArrayList<Usuario> usuarios = new ArrayList<>();
 public ArrayList<Menu> menu = new ArrayList<>();
 public ArrayList<Compra> vendas = new ArrayList<>();
 public ArrayList<Livros> n = new ArrayList<>();
 public Double valor;
 public String name_title;
 public static String name_section;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("digite qual genero vc deseja comprar");
		 Scanner leitura = new Scanner(System.in);	
	// criacao de objetos
	Loja nLoja = new Loja();
	
	Usuario user = new Usuario();
	
	Menu menu = new Menu();
	
	Livros titulos = new Livros();
	
	
	
	@SuppressWarnings("unused")
	Compra select = new Compra();
	// criacao de objetos.fim
	
	
	menu.menu();
	user.fazCadastro();
	
	
	 // imprime usuarios
	
	nLoja.usuarios.add(user);
	nLoja.usuarios.get(0).imprime();
	System.out.println("_____________________________________");
	System.out.println("|informe qual seção vc deseja ver:");
	System.out.println("| 1 - Seção Clássicos");
	System.out.println("| 2 - Seção Fantasia");
	System.out.println("| 3 - Seção Romance");
	System.out.println("|Seção Ficção");
	name_section = leitura.nextLine();
	switch(name_section) {
	case "Romance":
	 titulos.regTitulo();
	 
	break;
	
	case "Classicos":
	menu.exibirClassicobr();
	break;
	
	case "Fantasia":
	menu.exibirFantasia();
	break;
	}
	
	
	
	//select.escolheProduto();
	}

}
