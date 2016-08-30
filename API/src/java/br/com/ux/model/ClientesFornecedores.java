/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ux.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author charles
 */
@Entity
@Table(name = "clientes_fornecedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientesFornecedores.findAll", query = "SELECT c FROM ClientesFornecedores c"),
    @NamedQuery(name = "ClientesFornecedores.findByIdClienteFornecedor", query = "SELECT c FROM ClientesFornecedores c WHERE c.idClienteFornecedor = :idClienteFornecedor"),
    @NamedQuery(name = "ClientesFornecedores.findByTipo", query = "SELECT c FROM ClientesFornecedores c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "ClientesFornecedores.findByNomeFantasia", query = "SELECT c FROM ClientesFornecedores c WHERE c.nomeFantasia = :nomeFantasia"),
    @NamedQuery(name = "ClientesFornecedores.findByRazaoSocial", query = "SELECT c FROM ClientesFornecedores c WHERE c.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "ClientesFornecedores.findByCpf", query = "SELECT c FROM ClientesFornecedores c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "ClientesFornecedores.findByCnpj", query = "SELECT c FROM ClientesFornecedores c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "ClientesFornecedores.findByAtividadePrincipal", query = "SELECT c FROM ClientesFornecedores c WHERE c.atividadePrincipal = :atividadePrincipal"),
    @NamedQuery(name = "ClientesFornecedores.findByAtivo", query = "SELECT c FROM ClientesFornecedores c WHERE c.ativo = :ativo"),
    @NamedQuery(name = "ClientesFornecedores.findByEmail", query = "SELECT c FROM ClientesFornecedores c WHERE c.email = :email"),
    @NamedQuery(name = "ClientesFornecedores.findByTelefone", query = "SELECT c FROM ClientesFornecedores c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "ClientesFornecedores.findByCep", query = "SELECT c FROM ClientesFornecedores c WHERE c.cep = :cep"),
    @NamedQuery(name = "ClientesFornecedores.findByEndereco", query = "SELECT c FROM ClientesFornecedores c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "ClientesFornecedores.findByComplemento", query = "SELECT c FROM ClientesFornecedores c WHERE c.complemento = :complemento"),
    @NamedQuery(name = "ClientesFornecedores.findByCidade", query = "SELECT c FROM ClientesFornecedores c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "ClientesFornecedores.findByEstado", query = "SELECT c FROM ClientesFornecedores c WHERE c.estado = :estado"),
    @NamedQuery(name = "ClientesFornecedores.findByDtCadastro", query = "SELECT c FROM ClientesFornecedores c WHERE c.dtCadastro = :dtCadastro"),
    @NamedQuery(name = "ClientesFornecedores.findByDtUltimaAlteracao", query = "SELECT c FROM ClientesFornecedores c WHERE c.dtUltimaAlteracao = :dtUltimaAlteracao"),
    @NamedQuery(name = "ClientesFornecedores.findByPalavrasChave", query = "SELECT c FROM ClientesFornecedores c WHERE c.palavrasChave = :palavrasChave")})
public class ClientesFornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente_fornecedor")
    private Integer idClienteFornecedor;
    @Size(max = 100)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 250)
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Size(max = 500)
    @Column(name = "razao_social")
    private String razaoSocial;
    @Size(max = 20)
    @Column(name = "cpf")
    private String cpf;
    @Size(max = 30)
    @Column(name = "cnpj")
    private String cnpj;
    @Size(max = 200)
    @Column(name = "atividade_principal")
    private String atividadePrincipal;
    @Column(name = "ativo")
    private Boolean ativo;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 100)
    @Column(name = "telefone")
    private String telefone;
    @Size(max = 100)
    @Column(name = "cep")
    private String cep;
    @Size(max = 500)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 500)
    @Column(name = "complemento")
    private String complemento;
    @Size(max = 250)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 100)
    @Column(name = "estado")
    private String estado;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;
    @Column(name = "dt_ultima_alteracao")
    @Temporal(TemporalType.DATE)
    private Date dtUltimaAlteracao;
    @Lob
    @Size(max = 65535)
    @Column(name = "observacoes")
    private String observacoes;
    @Size(max = 500)
    @Column(name = "palavras_chave")
    private String palavrasChave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClienteFornecedor")
    private List<LancamentosFinanceiros> lancamentosFinanceirosList;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios idUsuario;

    public ClientesFornecedores() {
    }

    public ClientesFornecedores(Integer idClienteFornecedor) {
        this.idClienteFornecedor = idClienteFornecedor;
    }

    public Integer getIdClienteFornecedor() {
        return idClienteFornecedor;
    }

    public void setIdClienteFornecedor(Integer idClienteFornecedor) {
        this.idClienteFornecedor = idClienteFornecedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public void setAtividadePrincipal(String atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Date getDtUltimaAlteracao() {
        return dtUltimaAlteracao;
    }

    public void setDtUltimaAlteracao(Date dtUltimaAlteracao) {
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    @XmlTransient
    public List<LancamentosFinanceiros> getLancamentosFinanceirosList() {
        return lancamentosFinanceirosList;
    }

    public void setLancamentosFinanceirosList(List<LancamentosFinanceiros> lancamentosFinanceirosList) {
        this.lancamentosFinanceirosList = lancamentosFinanceirosList;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClienteFornecedor != null ? idClienteFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientesFornecedores)) {
            return false;
        }
        ClientesFornecedores other = (ClientesFornecedores) object;
        if ((this.idClienteFornecedor == null && other.idClienteFornecedor != null) || (this.idClienteFornecedor != null && !this.idClienteFornecedor.equals(other.idClienteFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ux.model.ClientesFornecedores[ idClienteFornecedor=" + idClienteFornecedor + " ]";
    }
    
}
