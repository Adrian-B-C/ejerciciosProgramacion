/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package beans;

import Tablas.Empleado;
import Tablas.Incidencia;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import jakarta.persistence.Query;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author adria
 */
@Stateless
public class IncidenciasEJB {

 @PersistenceUnit
 EntityManagerFactory emf;
   
 // Manejo de empleados
 public List findAll(){
 
     return emf.createEntityManager().createNamedQuery("Empleado.findAll").getResultList();
 
 }
 public void insertarEmpleado(Empleado a){
EntityManager em =emf.createEntityManager();
em.persist(a);
em.close();
 }
  public void updateEmpleado(Empleado a) {
        EntityManager em = emf.createEntityManager();
        Empleado aux = em.find(Empleado.class, a.getNombreusuario());
        if (aux != null) {
            aux.setNombrecompleto(a.getNombrecompleto());
            aux.setPassword(a.getPassword());
            em.persist(aux);
            em.close();
        }
    }
  public void updatePassword(Empleado a) {
        EntityManager em = emf.createEntityManager();
        Empleado aux = em.find(Empleado.class, a.getNombreusuario());
        if (aux != null) {
            aux.setPassword(a.getPassword());
            em.persist(aux);
            em.close();
        }
    }
  public boolean eliminarEmpleado(Empleado s) {
        EntityManager em = emf.createEntityManager();
        Empleado aux = em.find(Empleado.class, s.getNombreusuario());
        if (aux != null) {
           List <Empleado> empleados = (List <Empleado>) findEmpleadoByNombreUsuario(aux.getNombreusuario());
            if (empleados != null) {
                for (int i = 0; i < empleados.size(); i++) {
                    Empleado m = empleados.get(i);
                    eliminarEmpleado(m);
                }
            }
            em.remove(aux);
            em.close();
            return true;
        }
        return false;
    }
  public Empleado findEmpleadoByNombreUsuario(String NombreUsuario) {
        Query q = emf.createEntityManager().createNamedQuery("Empleado.findByNombreUsuario");
        q.setParameter("nombreUsuario", NombreUsuario);
        List<Empleado> result = q.getResultList();
        Iterator iter = result.iterator();
        Empleado a = (Empleado) iter.next();
        return a;
    }
    public List findEmpleadoByUsuario(String NombreUsuario) {
        Empleado s = (Empleado) findEmpleadoByNombreUsuario(NombreUsuario);
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT m FROM Empleado m WHERE m.empleado = :empleado");
        q.setParameter("empleado", s);
        List matriculas = q.getResultList();
        return matriculas;
    }
    //Manejar incidencias
    
     public Incidencia findIncidenciaById(int id) {
        Query q = emf.createEntityManager().createNamedQuery("Incidencia.findByIdIncidencia");
        q.setParameter("idincidencia", id);
        List<Empleado> result = q.getResultList();
        Iterator iter = result.iterator();
        Incidencia a = (Incidencia) iter.next();
        return a;
     }
       public List findIncidencia(int id) {
        Incidencia i = findIncidenciaById(id);
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT m FROM Incidencia m WHERE m.incidencia = :incidencia");
        q.setParameter("incidencia", i);
        List incidencias = q.getResultList();
        return incidencias;
    }
    public List findIncidencia(){
 
    return emf.createEntityManager().createNamedQuery("Incidencia.findAll").getResultList();
 
 }
}
