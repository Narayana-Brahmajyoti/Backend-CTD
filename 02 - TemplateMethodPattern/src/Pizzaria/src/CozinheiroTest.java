package Pizzaria.src;


import org.junit.jupiter.api.Test;

class CozinheiroTest {

    @Test
    void fazerPizzas() {
        Cozinheiro cozinheiroVeggie = new CozinheiroVeggie();
        Cozinheiro cozinheiroNoVeggie = new CozinheiroNoVeggie();

        System.out.println("PIZZA VEGANA:");
        cozinheiroVeggie.fazerPizza();
        System.out.println("PIZZA TRADICIONAL:");
        cozinheiroNoVeggie.fazerPizza();
    }

}