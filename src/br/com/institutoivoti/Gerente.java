package br.com.institutoivoti;

public class Gerente extends Funcionario{
    String nome;
    int senha;
    int numeroDeFuncionariosGerenciados;
   
    public String Getnome(String nomee) {
        return nome = nomee;
    }

    public int Senha(int senhaa) {
        return senha = senhaa;
    }
   
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
