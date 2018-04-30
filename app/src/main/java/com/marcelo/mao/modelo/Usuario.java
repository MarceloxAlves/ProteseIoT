package com.marcelo.mao.modelo;

/**
 * Created by micaelleal on 30/04/18.
 */

public abstract class Usuario {

    private String nomeDeusuario;
    private String email;
    private String senha;

    public Usuario(String nomeDeusuario, String email, String senha) {
        this.nomeDeusuario = nomeDeusuario;
        this.email = email;
        this.senha = senha;
    }

    public boolean verificarSenha(String senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public abstract int getTipoDeUsuario();

}
