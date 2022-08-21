import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    Figura quadrado;
    Figura circulo;

    @BeforeEach
    void doBefore() {
        circulo = new Circulo(2);

        quadrado = new Quadrado(2);
    }

    @Test
    void getPerimetroCirculo() {
        assertEquals(12.566370614359172, circulo.calcularPerimetro());
    }

    @Test
    void getPerimetroQuadrado() {
        assertEquals(8, quadrado.calcularPerimetro());
    }
}