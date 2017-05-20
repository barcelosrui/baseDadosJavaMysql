/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Convite
 */
@Entity
@Table(name = "tbuser", catalog = "testar", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tbuser.findAll", query = "SELECT t FROM Tbuser t"),
    @NamedQuery(name = "Tbuser.findById", query = "SELECT t FROM Tbuser t WHERE t.id = :id"),
    @NamedQuery(name = "Tbuser.findByNome", query = "SELECT t FROM Tbuser t WHERE t.nome = :nome"),
    @NamedQuery(name = "Tbuser.findByContacto", query = "SELECT t FROM Tbuser t WHERE t.contacto = :contacto"),
    @NamedQuery(name = "Tbuser.findByIdade", query = "SELECT t FROM Tbuser t WHERE t.idade = :idade")})
public class Tbuser implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "contacto")
    private int contacto;
    @Basic(optional = false)
    @Column(name = "idade")
    private int idade;

    public Tbuser() {
    }

    public Tbuser(Integer id) {
        this.id = id;
    }

    public Tbuser(Integer id, String nome, int contacto, int idade) {
        this.id = id;
        this.nome = nome;
        this.contacto = contacto;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        int oldContacto = this.contacto;
        this.contacto = contacto;
        changeSupport.firePropertyChange("contacto", oldContacto, contacto);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        int oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbuser)) {
            return false;
        }
        Tbuser other = (Tbuser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basededos.Tbuser[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
