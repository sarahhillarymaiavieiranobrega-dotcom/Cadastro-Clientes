/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarah62076366
 */

public class CadstroPessoaFisica {

    private String codigo;
    private String nomeCompleto;
    private String contato;
    private boolean ativo;
    private String cpf;
    private String dataNascimento;
    private String identidade;
    private String cnpj;
    private String inscricaoEstadual;

    private String endereco;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    private String sexo;
    private String telefone;
    private String fax;
    private String celular;
    private String email;
    private String preferencia;
    private String observacoes;

    private String usuario;
    private String senha;
    private String confirmarSenha;
    private boolean aceitaTermos;

    public CadstroPessoaFisica(
            String codigo,
            String nomeCompleto,
            String contato,
            boolean ativo,
            String cpf,
            String dataNascimento,
            String identidade,
            String cnpj,
            String inscricaoEstadual,
            String endereco,
            String numero,
            String complemento,
            String cep,
            String bairro,
            String cidade,
            String estado,
            String sexo,
            String telefone,
            String fax,
            String celular,
            String email,
            String preferencia,
            String observacoes,
            String usuario,
            String senha,
            String confirmarSenha,
            boolean aceitaTermos) {

        this.codigo = codigo;
        this.nomeCompleto = nomeCompleto;
        this.contato = contato;
        this.ativo = ativo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.identidade = identidade;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.sexo = sexo;
        this.telefone = telefone;
        this.fax = fax;
        this.celular = celular;
        this.email = email;
        this.preferencia = preferencia;
        this.observacoes = observacoes;
        this.usuario = usuario;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.aceitaTermos = aceitaTermos;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getIdentidade() { return identidade; }
    public void setIdentidade(String identidade) { this.identidade = identidade; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getInscricaoEstadual() { return inscricaoEstadual; }
    public void setInscricaoEstadual(String inscricaoEstadual) { this.inscricaoEstadual = inscricaoEstadual; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getFax() { return fax; }
    public void setFax(String fax) { this.fax = fax; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPreferencia() { return preferencia; }
    public void setPreferencia(String preferencia) { this.preferencia = preferencia; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getConfirmarSenha() { return confirmarSenha; }
    public void setConfirmarSenha(String confirmarSenha) { this.confirmarSenha = confirmarSenha; }

    public boolean isAceitaTermos() { return aceitaTermos; }
    public void setAceitaTermos(boolean aceitaTermos) { this.aceitaTermos = aceitaTermos; }
}

