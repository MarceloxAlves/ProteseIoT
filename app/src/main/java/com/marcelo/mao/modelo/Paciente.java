package com.marcelo.mao.modelo;

import java.util.List;

/**
 * Created by micaelleal on 30/04/18.
 */

public class Paciente extends Usuario {

    private String nome;
    private List<Medico> medicos;

    public Paciente(String nomeDeusuario, String email, String senha) {
        super(nomeDeusuario, email, senha);
    }

    @Override
    public int getTipoDeUsuario() {
        return TipoDeUsuario.USUARIO_PACIENTE;
    }

    public void addMedico(Medico medico) {
        this.medicos.add(medico);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
