/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.model;

/**
 *
 * @author Javapos
 */
public class Rodovia {
    private long idRodovia;
    private String nome;
    private int extensaoKM;
    private String cidadeInicial;
    private String ufInicial;
    private String cidadeFinal;
    private String ufFinal;

    public long getIdRodovia() {
        return idRodovia;
    }

    public void setIdRodovia(long idRodovia) {
        this.idRodovia = idRodovia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExtensaoKM() {
        return extensaoKM;
    }

    public void setExtensaoKM(int extensaoKM) {
        this.extensaoKM = extensaoKM;
    }

    public String getCidadeInicial() {
        return cidadeInicial;
    }

    public void setCidadeInicial(String cidadeInicial) {
        this.cidadeInicial = cidadeInicial;
    }

    public String getUfInicial() {
        return ufInicial;
    }

    public void setUfInicial(String ufInicial) {
        this.ufInicial = ufInicial;
    }

    public String getCidadeFinal() {
        return cidadeFinal;
    }

    public void setCidadeFinal(String cidadeFinal) {
        this.cidadeFinal = cidadeFinal;
    }

    public String getUfFinal() {
        return ufFinal;
    }

    public void setUfFinal(String ufFinal) {
        this.ufFinal = ufFinal;
    }
    
    
}
