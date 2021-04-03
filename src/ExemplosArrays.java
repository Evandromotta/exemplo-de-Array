import java.net.SocketOption;
import java.sql.SQLOutput;

public class ExemplosArrays {

    public int procuraNome(String[] nomes, String nome) {
        // para encontrar o nome no array usa-se o for
        for (int i = 0; i < nomes.length; i++)
            if (nomes[i].equalsIgnoreCase(nome))
                return i;
        // ese for está varrendo todo o array procurando a variável nome
        return -1;
    }

    public double calcuMedia(double[] valores) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++)
            soma += valores[i]; // += representa o (soma = soma + valores[i];)
        return soma / valores.length;
    }

    public static void main(String[] args) {
        String[] nomes = {"João", "Théo", "Marina", "Ana"};
        String nome = "Théo";
        ExemplosArrays e = new ExemplosArrays();
        int posicao = e.procuraNome(nomes, nome);
        System.out.println("Posição encontrada: " + posicao);
    }

}
