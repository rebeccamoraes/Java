package br.com.projetodigimon.model;

public class Transportador {
    
    private String tipo;
    private String rntrc;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private Contato contato;
    private Endereco endereco;

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRntrc(String rntrc) {
        this.rntrc = rntrc;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getRntrc() {
        return rntrc;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

       
        
    
}