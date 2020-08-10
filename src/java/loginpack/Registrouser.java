/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpack;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pc-4
 */
@Entity
@Table(name = "registrouser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registrouser.findAll", query = "SELECT r FROM Registrouser r")
    , @NamedQuery(name = "Registrouser.findByCedula", query = "SELECT r FROM Registrouser r WHERE r.cedula = :cedula")
    , @NamedQuery(name = "Registrouser.findByNombres", query = "SELECT r FROM Registrouser r WHERE r.nombres = :nombres")
    , @NamedQuery(name = "Registrouser.findByApellidos", query = "SELECT r FROM Registrouser r WHERE r.apellidos = :apellidos")
    , @NamedQuery(name = "Registrouser.findByTelefono", query = "SELECT r FROM Registrouser r WHERE r.telefono = :telefono")
    , @NamedQuery(name = "Registrouser.findByDireccion", query = "SELECT r FROM Registrouser r WHERE r.direccion = :direccion")
    , @NamedQuery(name = "Registrouser.findByCorre", query = "SELECT r FROM Registrouser r WHERE r.corre = :corre")
    , @NamedQuery(name = "Registrouser.findByUsuario", query = "SELECT r FROM Registrouser r WHERE r.usuario = :usuario")
    , @NamedQuery(name = "Registrouser.findByClave", query = "SELECT r FROM Registrouser r WHERE r.clave = :clave")})
public class Registrouser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "Cedula")
    private String cedula;
    @Size(max = 50)
    @Column(name = "Nombres")
    private String nombres;
    @Size(max = 150)
    @Column(name = "Apellidos")
    private String apellidos;
    @Size(max = 10)
    @Column(name = "Telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "Direccion")
    private String direccion;
    @Size(max = 50)
    @Column(name = "Corre")
    private String corre;
    @Size(max = 70)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 8)
    @Column(name = "clave")
    private String clave;

    public Registrouser() {
    }

    public Registrouser(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registrouser)) {
            return false;
        }
        Registrouser other = (Registrouser) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "loginpack.Registrouser[ cedula=" + cedula + " ]";
    }
    
}
