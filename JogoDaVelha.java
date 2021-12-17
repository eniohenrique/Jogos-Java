import java.util.Scanner;

import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("JOGO DA VELHA");
		int i = 0;
		for (char[] m : jogoVelha) {
			i++;
			int j = 0;
			for (char n : m) {
				System.out.print(n);
				j++;
				if (j < 3) {
					System.out.print(" | ");
				}
				if (j == 3 && i < 3) {
					System.out.println();
					System.out.print("---------");
				}
			}
			System.out.println();
		}
		double jogada = 1;
		while (jogada < 10) {
			if (jogada % 2 == 1) {
				System.out.println("E a vez do X");
			} else {
				System.out.println("E a vez do O");
			}
			System.out.println("Digite a LINHA que vc vai jogar entre 1-3");
			int jogaday = scan.nextInt();
			while (jogaday < 1 || jogaday > 3) {
				JOptionPane.showMessageDialog(null, "Escolha entre 1 a 3", "Mensagem", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Digite a LINHA que vc vai jogar entre 1-3", "Mensagem",
						JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println("Escolha entre 1 a 3");
				System.out.println("Digite a LINHA que vc vai jogar entre 1-3");
				jogaday = scan.nextInt();
			}
			System.out.println("Digite a COLUNA que vc vai jogar entre 1-3");
			int jogadax = scan.nextInt();
			while (jogadax < 1 || jogadax > 3) {
				JOptionPane.showMessageDialog(null, "Escolha entre 1 a 3", "Mensagem", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Digite a COLUNA que vc vai jogar entre 1-3", "Mensagem",
						JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println("Escolha entre 1 a 3");
				System.out.println("Digite a COLUNA que vc vai jogar entre 1-3");
				jogadax = scan.nextInt();
			}

			if (jogoVelha[jogaday - 1][jogadax - 1] == 'X' || jogoVelha[jogaday - 1][jogadax - 1] == 'O') {
				JOptionPane.showMessageDialog(null, "Ja existe uma jogada nessa casa", "Mensagem",
						JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Jogue novamente", "Mensagem", JOptionPane.YES_NO_CANCEL_OPTION);

			} else {
				if (jogada % 2 == 1) {
					jogoVelha[jogaday - 1][jogadax - 1] = 'X';
				} else {
					jogoVelha[jogaday - 1][jogadax - 1] = 'O';
				}
				jogada += 1;

			}
			i = 0;
			for (char[] m : jogoVelha) {
				i++;
				int j = 0;
				for (char n : m) {
					System.out.print(n);
					j++;
					if (j < 3) {
						System.out.print(" | ");
					}
					if (j == 3 && i < 3) {
						System.out.println();
						System.out.print("---------");
					}
				}
				System.out.println();
			}
			System.out.println();
			if (jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X'
					|| jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X'
					|| jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X'
					|| jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X'
					|| jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X'
					|| jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X'
					|| jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X'
					|| jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X'
					|| jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') {
				JOptionPane.showMessageDialog(null, "Jogador X, GANHOUUU ", "Mensagem",
						JOptionPane.INFORMATION_MESSAGE);
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
				break;
			}
			if (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O'
					|| jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O'
					|| jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O'
					|| jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O'
					|| jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O'
					|| jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O'
					|| jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O'
					|| jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O'
					|| jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') {
				JOptionPane.showMessageDialog(null, "Jogador O, GANHOUUU ", "Mensagem",
						JOptionPane.INFORMATION_MESSAGE);
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
				break;
			}

		}
		if (jogada > 9) {
			JOptionPane.showMessageDialog(null, "EMPATOOUUUU !!!", "Mensagem", JOptionPane.WARNING_MESSAGE);
		}

	}

}
