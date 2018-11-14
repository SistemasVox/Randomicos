import java.util.Random;

public class Rand {
	static Random random = new Random();
	static int vetor[] = new int[8];

	public static void main(String[] args) {
		for (int i = 0; i < vetor.length; i++) {
			do {
				vetor[i] = numeroRandomico();
			} while (verificaRepeticao(i, vetor[i]));
		}
		imprimir(vetor);
	}

	private static void imprimir(int[] vetorParametro) {
		for (int i = 0; i < vetorParametro.length; i++) {
			System.out.println(vetorParametro[i]);
		}

	}

	static boolean verificaRepeticao(int p, int n) {
		for (int i = 0; i < vetor.length; i++) {
			if (i != p) {
				if (vetor[i] == n) {
					return true;
				}
			}
		}
		return false;

	}

	static int numeroRandomico() {
		return random.nextInt(8);
	}

}
