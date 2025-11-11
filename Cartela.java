import java.util.Arrays;

public class Cartela {

    private int[] numeros;

    public Cartela(int[] numeros) {
        this.numeros = Arrays.copyOf(numeros, numeros.length);
    }

    public int[] getNumeros() {
        return Arrays.copyOf(numeros, numeros.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(numeros);
    }
}
