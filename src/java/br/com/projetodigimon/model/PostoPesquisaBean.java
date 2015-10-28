
package br.com.projetodigimon.model;

public class PostoPesquisaBean {
    
    private long idPosto;
    private String uf;

    public void setIdPosto(long idPosto) {
        this.idPosto = idPosto;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public long getIdPosto() {
        return idPosto;
    }

    public String getUf() {
        return uf;
    }
    
}
