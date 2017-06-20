package LabRepo;

import java.io.Serializable;

public class Persona implements Serializable{
    
    static final long SerialVersionUID = 666L;
    
    String nombre;
    int edad;
    char sexo;
    String lugarNacimiento;
    String lugarResidencia;
    boolean vivo;

    public Persona(String nombre, int edad, char sexo, String lugarNacimiento, String lugarResidencia, boolean vivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.lugarNacimiento = lugarNacimiento;
        this.lugarResidencia = lugarResidencia;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    
}


class Hijo extends Persona{
    Padre padre;
    String nombrePadre;
    int edadPadre;
    int hermanos;
    int hermanas;
    int hermanosTotal;

    public Hijo(Padre padre, String nombre, int edad, char sexo, String lugarNacimiento, String lugarResidencia, boolean vivo) {
        super(nombre, edad, sexo, lugarNacimiento, lugarResidencia, vivo);
        this.padre = padre;
        
        if (padre != null) {
            this.nombrePadre = padre.getNombre();
            this.edadPadre = padre.getEdad();
            this.hermanos = padre.getCantidadHijos();
            this.hermanas = padre.getCantidadHijas();
            this.hermanosTotal = padre.getCantidadHijosTotal();
        }
        
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
    }

    public int getHermanos() {
        return hermanos;
    }

    public void setHermanos(int hermanos) {
        this.hermanos = hermanos;
    }

    public int getHermanas() {
        return hermanas;
    }

    public void setHermanas(int hermanas) {
        this.hermanas = hermanas;
    }

    public int getHermanosTotal() {
        return hermanosTotal;
    }

    public void setHermanosTotal(int hermanosTotal) {
        this.hermanosTotal = hermanosTotal;
    }
    
    
}

class Padre extends Hijo{
    int cantidadHijos;
    int cantidadHijas;
    int cantidadHijosTotal;
    String trabajo;
    int añosPadre;
    String primerHijo;

    public Padre(int cantidadHijos, int cantidadHijas, int cantidadHijosTotal, String trabajo, int añosPadre, String primerHijo, Padre padre, String nombrePadre, int edadPadre, int hermanos, int hermanas, int hermanosTotal, String nombre, int edad, char sexo, String lugarNacimiento, String lugarResidencia, boolean vivo) {
        super(padre, nombrePadre, edadPadre, hermanos, hermanas, hermanosTotal, nombre, edad, sexo, lugarNacimiento, lugarResidencia, vivo);
        this.cantidadHijos = cantidadHijos;
        this.cantidadHijas = cantidadHijas;
        this.cantidadHijosTotal = cantidadHijosTotal;
        this.trabajo = trabajo;
        this.añosPadre = añosPadre;
        this.primerHijo = primerHijo;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public int getCantidadHijas() {
        return cantidadHijas;
    }

    public void setCantidadHijas(int cantidadHijas) {
        this.cantidadHijas = cantidadHijas;
    }

    public int getCantidadHijosTotal() {
        return cantidadHijosTotal;
    }

    public void setCantidadHijosTotal(int cantidadHijosTotal) {
        this.cantidadHijosTotal = cantidadHijosTotal;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getAñosPadre() {
        return añosPadre;
    }

    public void setAñosPadre(int añosPadre) {
        this.añosPadre = añosPadre;
    }

    public String getPrimerHijo() {
        return primerHijo;
    }

    public void setPrimerHijo(String primerHijo) {
        this.primerHijo = primerHijo;
    }
    
    
}
