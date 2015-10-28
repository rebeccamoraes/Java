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
public class PesquisarRelatorioBean {
    private long idRelatorio;
    private String nome;
    private String assunto;

    public long getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(long idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    
}
