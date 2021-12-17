import java.util.Scanner;
import java.util.Random;

public class JogoAcerto {

	public static void main(String[] args) {
		Random aleatorio = new Random();

		int valoraleatorio = aleatorio.nextInt(11);

		Scanner input = new Scanner(System.in);

		System.out.println("Jogo de acerto !!!");

		System.out.println("Escolha um numero de 0 a 10");

		int escolha = input.nextInt();

		System.out.println("O numero escolhido foi " + escolha);

		while (escolha > 10 || escolha < 0) {
			System.out.println("Escolha errada !!!");
			System.out.println("Escolha um numero de 0 a 10");
			escolha = input.nextInt();
		}

		if (escolha == valoraleatorio) {
			System.out.println("Você Acertou !!!");
			System.out.println("       ___________      ");
			System.out.println("      '._==_==_=_.'     ");
			System.out.println("      .-\\:      /-.    ");
			System.out.println("     | (|:.     |) |    ");
			System.out.println("      '-|:.     |-'     ");
			System.out.println("        \\::.    /      ");
			System.out.println("         '::. .'        ");
			System.out.println("           ) (          ");
			System.out.println("         _.' '._        ");
			System.out.println("        '-------'       ");
		} else {
			System.out.println("O numero sortiado é :" + valoraleatorio);
			System.out.println("Você errou !!!");
			System.out.println("    _______________         ");
			System.out.println("   /               `      ");
			System.out.println("  /                 `      ");
			System.out.println("//                   `/`  ");
			System.out.println("`|   XXXX     XXXX   | /   ");
			System.out.println(" |   XXXX     XXXX   |/     ");
			System.out.println(" |   XXX       XXX   |      ");
			System.out.println(" |                   |      ");
			System.out.println(" `__      XXX      __/     ");
			System.out.println("   |`     XXX     /|       ");
			System.out.println("   | |           | |        ");
			System.out.println("   | I I I I I I I |        ");
			System.out.println("   |  I I I I I I  |        ");
			System.out.println("   `_             _/       ");
			System.out.println("     `_         _/         ");
			System.out.println("       `_______/           ");

		}

	}

}
