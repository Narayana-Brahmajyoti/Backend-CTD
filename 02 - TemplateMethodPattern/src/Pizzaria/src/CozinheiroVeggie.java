package Pizzaria.src;

public class CozinheiroVeggie extends Cozinheiro {
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate e brócolis");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adcionando ingredientes");
    }


}
