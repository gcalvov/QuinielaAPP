package cl;

import java.time.LocalDate;
import java.util.Objects;

public class Liga {

    private String nombre;
    private LocalDate FechaCreacion;
    private boolean estatus;
    private boolean privada;

    public Liga() {
    }

    public Liga(String nombre, LocalDate FechaCreacion, boolean estatus, boolean privada) {
        this.nombre = nombre;
        this.FechaCreacion = FechaCreacion;
        this.estatus = estatus;
        this.privada = privada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(LocalDate FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public void setPrivada(boolean privada) {
        this.privada = privada;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public boolean isPrivada() {
        return privada;
    }  

    @Override
    public String toString() {
        return "Liga{" + "nombre=" + nombre + ", FechaCreacion=" + FechaCreacion + ", estatus=" + estatus + ", privada=" + privada + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Liga other = (Liga) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    

}
