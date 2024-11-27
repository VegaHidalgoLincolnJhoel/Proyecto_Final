/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Alumnos {
    private String colegio;
    private String colegioDepa;
    private String colegioProv;
    private String colegioDist;
    private String colegioPais;
    private int colegioAnioEgreso;
    private String especialidad;
    private int anioPostula;
    private int cicloPostula;
    private String domicilioDepa;
    private String domicilioProv;
    private String domicilioDist;
    private int anioNacimiento;
    private String nacimientoPais;
    private String nacimientoDepa;
    private String nacimientoProv;
    private String nacimientoDist;
    private String sexo;
    private float caliFinal;
    private String ingreso;
    private String modoIngreso;

    public Alumnos(String colegio, String colegioDepa, String colegioProv, String colegioDist, String colegioPais, int colegioAnioEgreso, String especialidad, int anioPostula, int cicloPostula, String domicilioDepa, String domicilioProv, String domicilioDist, int anioNacimiento, String nacimientoPais, String nacimientoDepa, String nacimientoProv, String nacimientoDist, String sexo, float caliFinal, String ingreso, String modoIngreso) {
        this.colegio = colegio;
        this.colegioDepa = colegioDepa;
        this.colegioProv = colegioProv;
        this.colegioDist = colegioDist;
        this.colegioPais = colegioPais;
        this.colegioAnioEgreso = colegioAnioEgreso;
        this.especialidad = especialidad;
        this.anioPostula = anioPostula;
        this.cicloPostula = cicloPostula;
        this.domicilioDepa = domicilioDepa;
        this.domicilioProv = domicilioProv;
        this.domicilioDist = domicilioDist;
        this.anioNacimiento = anioNacimiento;
        this.nacimientoPais = nacimientoPais;
        this.nacimientoDepa = nacimientoDepa;
        this.nacimientoProv = nacimientoProv;
        this.nacimientoDist = nacimientoDist;
        this.sexo = sexo;
        this.caliFinal = caliFinal;
        this.ingreso = ingreso;
        this.modoIngreso = modoIngreso;
        
        
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getColegioDepa() {
        return colegioDepa;
    }

    public void setColegioDepa(String colegioDepa) {
        this.colegioDepa = colegioDepa;
    }

    public String getColegioProv() {
        return colegioProv;
    }

    public void setColegioProv(String colegioProv) {
        this.colegioProv = colegioProv;
    }

    public String getColegioDist() {
        return colegioDist;
    }

    public void setColegioDist(String colegioDist) {
        this.colegioDist = colegioDist;
    }

    public String getColegioPais() {
        return colegioPais;
    }

    public void setColegioPais(String colegioPais) {
        this.colegioPais = colegioPais;
    }

    public int getColegioAnioEgreso() {
        return colegioAnioEgreso;
    }

    public void setColegioAnioEgreso(int colegioAnioEgreso) {
        this.colegioAnioEgreso = colegioAnioEgreso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnioPostula() {
        return anioPostula;
    }

    public void setAnioPostula(int anioPostula) {
        this.anioPostula = anioPostula;
    }

    public int getCicloPostula() {
        return cicloPostula;
    }

    public void setCicloPostula(int cicloPostula) {
        this.cicloPostula = cicloPostula;
    }

    public String getDomicilioDepa() {
        return domicilioDepa;
    }

    public void setDomicilioDepa(String domicilioDepa) {
        this.domicilioDepa = domicilioDepa;
    }

    public String getDomicilioProv() {
        return domicilioProv;
    }

    public void setDomicilioProv(String domicilioProv) {
        this.domicilioProv = domicilioProv;
    }

    public String getDomicilioDist() {
        return domicilioDist;
    }

    public void setDomicilioDist(String domicilioDist) {
        this.domicilioDist = domicilioDist;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getNacimientoPais() {
        return nacimientoPais;
    }

    public void setNacimientoPais(String nacimientoPais) {
        this.nacimientoPais = nacimientoPais;
    }

    public String getNacimientoDepa() {
        return nacimientoDepa;
    }

    public void setNacimientoDepa(String nacimientoDepa) {
        this.nacimientoDepa = nacimientoDepa;
    }

    public String getNacimientoProv() {
        return nacimientoProv;
    }

    public void setNacimientoProv(String nacimientoProv) {
        this.nacimientoProv = nacimientoProv;
    }

    public String getNacimientoDist() {
        return nacimientoDist;
    }

    public void setNacimientoDist(String nacimientoDist) {
        this.nacimientoDist = nacimientoDist;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getCaliFinal() {
        return caliFinal;
    }

    public void setCaliFinal(float caliFinal) {
        this.caliFinal = caliFinal;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getModoIngreso() {
        return modoIngreso;
    }

    public void setModoIngreso(String modoIngreso) {
        this.modoIngreso = modoIngreso;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "colegio=" + colegio + ", colegioDepa=" + colegioDepa + ", colegioProv=" + 
                colegioProv + ", colegioDist=" + colegioDist + ", colegioPais=" + colegioPais + ", colegioAnioEgreso=" + 
                colegioAnioEgreso + ", especialidad=" + especialidad + ", anioPostula=" + anioPostula + ", cicloPostula=" + 
                cicloPostula + ", domicilioDepa=" + domicilioDepa + ", domicilioProv=" + domicilioProv + ", domicilioDist=" + 
                domicilioDist + ", anioNacimiento=" + anioNacimiento + ", nacimientoPais=" + nacimientoPais + ", nacimientoDepa=" 
                + nacimientoDepa + ", nacimientoProv=" + nacimientoProv + ", nacimientoDist=" + nacimientoDist + ", sexo=" + sexo 
                + ", caliFinal=" + caliFinal + ", ingreso=" + ingreso + ", modoIngreso=" + modoIngreso + '}';
    }
   
    
    
           
}
