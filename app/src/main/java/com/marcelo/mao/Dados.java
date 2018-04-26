package com.marcelo.mao;

/**
 * Created by Marcelo on 07/04/2018.
 */

public class Dados {

    // Acelerometro
    private float aclX;
    private float aclY;
    private float aclZ;

    // GIROSCOPIO
    private float girX;
    private float girY;
    private float girZ;

    private float temperatura;

    public Dados(String dados) throws Exception {
        if(!dados.trim().isEmpty()){
            String[] partes = dados.split(" ");
            if(partes.length < 7)throw new Exception("Dados do braço inválido!");
            this.aclX = Float.parseFloat(partes[0]);
            this.aclY = Float.parseFloat(partes[1]);
            this.aclZ = Float.parseFloat(partes[2]);

        }else{
            throw new Exception("Dados recebido inválido");
        }
    }

    public float getAclX() {
        return aclX;
    }

    public float getAclY() {
        return aclY;
    }

    public float getAclZ() {
        return aclZ;
    }

    public float getGirX() {
        return girX;
    }

    public float getGirY() {
        return girY;
    }

    public float getGirZ() {
        return girZ;
    }

    public float getTemperatura() {
        return temperatura;
    }
}
