import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bingo implements IBingo {
    boolean[] numeros = new boolean[60];
    Random random = new Random();

    @Override
    public Cartela gerarCartela(int quantidadeNumeros) {
        int[] cartela = new int[quantidadeNumeros];
        ArrayList<Integer> disponiveis = new ArrayList<>();
        for (int i = 1; i <= 60; i++) {
            disponiveis.add(i);
        }
        Collections.shuffle(disponiveis);
        for (int i = 0; i < quantidadeNumeros; i++) {
            cartela[i] = disponiveis.get(i);
        }
        return new Cartela(cartela);
    }

    @Override
    public int sortearNumero() {
        int numero;
        do {
            numero = random.nextInt(60) + 1; 
        } while (numeros[numero - 1]); 

        numeros[numero - 1] = true;
        return numero;
    }

    @Override
    public void exibirBolasSorteadas() {
        ArrayList<Integer> sorteados = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]) {
                sorteados.add(i + 1);
            }
        }

        if (sorteados.isEmpty()) {
            System.out.println("Nenhum número sorteado ainda.");
        } else {
            Collections.sort(sorteados);
            System.out.println("Números sorteados: " + sorteados);
        }
    }

    @Override
    public int contarNumerosSorteados() {
        int total = 0;
        for (boolean b : numeros) {
            if (b) total++;
        }
        return total;
    }

    @Override
    public boolean checarSeUmNumeroJaFoiSorteado(int numero) {
        if (numero < 1 || numero > 60) return false;
        return numeros[numero - 1];
    }
}
