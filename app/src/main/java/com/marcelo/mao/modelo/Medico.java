package com.marcelo.mao.modelo;

import java.util.List;

/**
 * Created by micaelleal on 30/04/18.
 */

public class Medico extends Usuario {

    private String nome;
    private String especialidade;
    private List<Paciente> pacientes;

    public Medico(String nomeDeusuario, String email, String senha) {
        super(nomeDeusuario, email, senha);
    }

    @Override
    public int getTipoDeUsuario() {
        return TipoDeUsuario.USUARIO_MEDICO;
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
