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
	public void testecpf() {
		Pessoa pessoa = new Pessoa();
		pessoa.Cpf("36942578029");
		assertEquals(pessoa.GetCpf(), "36942578029");
	}

	@Test
	public void testenome() {
		Pessoa pessoa = new Pessoa();
		pessoa.Nome("Ody");
		assertEquals(pessoa.GetNome(), "Ody");
	}

	@Test
	public void testSalario() {
		Funcionario funcionario = new Funcionario();
		funcionario.Salario(2000);
		assertEquals(funcionario.GetSalario(), 2000, 0);
	}

}
