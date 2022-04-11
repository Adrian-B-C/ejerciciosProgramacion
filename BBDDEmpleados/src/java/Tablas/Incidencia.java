/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adria
 */
@Entity
@Table(name = "incidencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Incidencia.findAll", query = "SELECT i FROM Incidencia i"),
    @NamedQuery(name = "Incidencia.findByIdincidencia", query = "SELECT i FROM Incidencia i WHERE i.idincidencia = :idincidencia"),
    @NamedQuery(name = "Incidencia.findByFechahora", query = "SELECT i FROM Incidencia i WHERE i.fechahora = :fechahora"),
    @NamedQuery(name = "Incidencia.findByTipo", query = "SELECT i FROM Incidencia i WHERE i.tipo = :tipo")})
public class Incidencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idincidencia")
    private Integer idincidencia;
    @Basic(optional = false)
    @Column(name = "fechahora")
    private String fechahora;
    @Basic(optional = false)
    @Lob
    @Column(name = "detalle")
    private String detalle;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "origen", referencedColumnName = "nombreusuario")
    @ManyToOne(optional = false)
    private Empleado origen;
    @JoinColumn(name = "destino", referencedColumnName = "nombreusuario")
    @ManyToOne(optional = false)
    private Empleado destino;

    public Incidencia() {
    }

    public Incidencia(Integer idincidencia) {
        this.idincidencia = idincidencia;
    }

    public Incidencia(Integer idincidencia, String fechahora, String detalle, String tipo) {
        this.idincidencia = idincidencia;
        this.fechahora = fechahora;
        this.detalle = detalle;
        this.tipo = tipo;
    }

    public Integer getIdincidencia() {
        return idincidencia;
    }

    public void setIdincidencia(Integer idincidencia) {
        this.idincidencia = idincidencia;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idincidencia != null ? idincidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Incidencia)) {
            return false;
        }
        Incidencia other = (Incidencia) object;
        if ((this.idincidencia == null && other.idincidencia != null) || (this.idincidencia != null && !this.idincidencia.equals(other.idincidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tablas.Incidencia[ idincidencia=" + idincidencia + " ]";
    }
    
}
