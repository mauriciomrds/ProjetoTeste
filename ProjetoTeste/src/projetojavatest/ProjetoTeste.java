
package projetojavatest;
import java.util.Scanner;
public class ProjetoTeste {

	public static void main(String[]args) {
	System.out.println("=================== SISTEMA DE LOGIN ==========");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	//teste de atualização//

	String login,senha;
	
	System.out.print("Digite o seu Login: ");
	login=sc.nextLine();
	
	System.out.print("Digite a sua Senha: ");
	senha=sc.nextLine();
	//Teste//
	if(login.equals("Mauricio")&& senha.equals("405060")) {
		System.out.println("Usuário e senha correta");
	}else {
		System.out.println("Usuário ou senha incorreta");
			}
	    System.out.println("FIM ====>");
	    System.out.println();
	
	    
	}
}