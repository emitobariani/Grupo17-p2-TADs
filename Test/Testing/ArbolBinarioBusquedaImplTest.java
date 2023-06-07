package Testing;

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.TADs.ArbolBinario.ArbolBinarioBusquedaImpl;


import static org.junit.jupiter.api.Assertions.*;

class ArbolBinarioBusquedaImplTest {

    @Test
    void insertar() {

        ArbolBinarioBusquedaImpl arbol = new ArbolBinarioBusquedaImpl();
        arbol.insertar(2);
        arbol.insertar(5);
        arbol.insertar(8);
        arbol.insertar(-4);

        assertTrue(arbol.buscar(2));
        assertTrue(arbol.buscar(5));
        assertTrue(arbol.buscar(8));
        assertTrue(arbol.buscar(-4));
    }

    @Test
    void buscar() {



    }

    @Test
    void eliminar() {
    }

    @Test
    void imprimirEnOrden() {
    }
}