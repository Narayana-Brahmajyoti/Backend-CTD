import java.util.ArrayList;

public class Estagiario extends Vendedor {

    public Estagiario(String nome){
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }

    /*implementação do método abstrato*/
    @Override
    public int calcularPontos() {
        return 5 * vendas;
    }

    @Override
    public String mostrarCategoria() {
        if (calcularPontos() < 50) {
            return "Estagiária(o) " + this.nome + " tem um total de " + calcularPontos() + " pontos e categoriza como estagiária(o) novata(o).";
        } else {
            return "Estagiária(o) " + this.nome + " tem um total de " + calcularPontos() + " pontos e categoriza como estagiária(o) experiente.";
        }
    }
}