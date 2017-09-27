package br.com.institutoivoti;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteFuncionario {

    @Test
    public void test1() {
        Gerente gerente = new Gerente();
        assertEquals(gerente.Getsalario(1200), 1200,0);
    }
   
    @Test
    public void test2() {
        Gerente gerente = new Gerente();
        gerente.Senha(1234);
        assertEquals(gerente.autentica(1234), true);
    }

}
