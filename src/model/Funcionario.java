package model;

import java.time.LocalDate;

/**
 * A classe <b>Funcionario</b> modela a entidade <b>Funcionario</b> do domínio da aplicação
 * A classe <b>Funcionario</b> é uma especializacao
 * @author RaulRomulo
 * @since 1.0
 * @version 1.0
 */

public class Funcionario extends Pessoa {
    public enum Setor{ATENDIMENTO, COZINHA, CAIXA, GERENTE };
    private Setor tipo;


    /**
     * Atributos da entidade especializada <b>Funcionário</b>
     * @param nome atributo herdado da superclasse pessoa que indica o nome do usuário
     * @param cpf atributo herdado da superclasse pessoa que indica o cpf do usuário
     * @param nascimento atributo herdado da superclasse pessoa que indica a date de nascimento do usuário
     * @param email atributo herdado da superclasse pessoa que indica o email do usuário
     * @param telefone atributo herdado da superclasse pessoa que indica o numero do telefone  do usuário
     * @param tipo atributo herdado da superclasse pessoa que indica o tipo de setor do usuário
     */

    public Funcionario(String nome, String cpf, LocalDate nascimento, String email, String senha, String telefone, Setor tipo) {
        super(nome, cpf, nascimento, email, senha, telefone);
        this.tipo = tipo;
    }

    /**
     * Metodos get e set da classe <b>Funcionario</b>
     * @return aponta e retorna os atributos da classse
     */

    public Setor getTipo() {
        return tipo;
    }

    public void setTipo(Setor tipo) {
        this.tipo = tipo;
    }


    /**
     * Metodo toString que é uma representação textual da classe
     *
     */
    @Override
    public String toString() {
        return "Funcionario{" + getNome()+ ", Tipo =" + tipo + ", Email = "+ getEmail() + ", Telefone = "+ getTelefone() + '}';
    }

}
