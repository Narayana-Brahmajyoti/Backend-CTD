package Pizzaria.src;

public class CozinheiroNoVeggie extends Cozinheiro{

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando fatias de carne, queijo e presunto...");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionado os ingredientes");
    }
}
