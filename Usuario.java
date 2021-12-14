package Usuarios_1;
import java.util.Scanner;
public class Usuario {
	
	public String nome;
	public String email;
	public String senha;

	@SuppressWarnings("resource")
	public void fazCadastro(){
		@SuppressWarnings("unused")
		Usuario user = new Usuario();
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		nome = ler.nextLine();
		System.out.println("Informe seu email:");
		email = ler.nextLine();
		System.out.println("Informe sua senha: ");
		senha = ler.nextLine();
		
		
	}
	public void imprime() {
		System.out.println("O Nome: " + this.nome);
		System.out.println("O Email: " + this.email);
		System.out.println("A Senha: " + this.senha);
		
	}
	
	
	
	
}
