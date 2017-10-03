package br.com.institutoivoti;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteFuncionario {

	@Test
	public void test2() {
		Gerente gerente = new Gerente();
		gerente.Senha(1234);
		assertEquals(gerente.autentica(1234), true);
	}
	@Test 
	public void teste(){
		Funcionario funcionario = new Funcionario();
		funcionario.Cpf("36942578029");
		assertEquals(funcionario.GetCpf(), "36942578029");
	}
}
