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
public class Pesagem {
    private long idPesagem;
    private String dataHora;
    private float pbt;
    private float pesoEixo;
    private PostoPesagem postoPesagem;
    private Veiculo veiculo;
    private char transbordo;
    private char remanejamento;

    public long getIdPesagem() {
        return idPesagem;
    }

    public void setIdPesagem(long idPesagem) {
        this.idPesagem = idPesagem;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public float getPbt() {
        return pbt;
    }

    public void setPbt(float pbt) {
        this.pbt = pbt;
    }

    public float getPesoEixo() {
        return pesoEixo;
    }

    public void setPesoEixo(float pesoEixo) {
        this.pesoEixo = pesoEixo;
    }

    public PostoPesagem getPostoPesagem() {
        return postoPesagem;
    }

    public void setPostoPesagem(PostoPesagem postoPesagem) {
        this.postoPesagem = postoPesagem;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public char getTransbordo() {
        return transbordo;
    }

    public void setTransbordo(char transbordo) {
        this.transbordo = transbordo;
    }

    public char getRemanejamento() {
        return remanejamento;
    }

    public void setRemanejamento(char remanejamento) {
        this.remanejamento = remanejamento;
    }
        
}
