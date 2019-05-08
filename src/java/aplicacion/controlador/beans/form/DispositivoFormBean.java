/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Dispositivo;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Yesica
 */
@ManagedBean
@ViewScoped
public class DispositivoFormBean implements Serializable {

    private Dispositivo dispositivo = new Dispositivo();
    private ArrayList<Integer> tabla = new ArrayList();
    private ArrayList<Integer> divisores = new ArrayList();
    private ArrayList<Integer> pares = new ArrayList();

    public ArrayList<Integer> getDivisores() {
        return divisores;
    }

    public void setDivisores(ArrayList<Integer> divisores) {
        this.divisores = divisores;
    }

    private int valorParaCalcularLaTabla;
    private int valorParaCalcularDivisor;
    private int valorCoseno;
    private int valorCotaInferior;
    private int valorCotaSuperior;
    private double resultadoCoseno;

    public double getResultadoCoseno() {
        return resultadoCoseno;
    }

    public void setResultadoCoseno(double resultadoCoseno) {
        this.resultadoCoseno = resultadoCoseno;
    }


    public int getValorCoseno() {
        return valorCoseno;
    }

    public void setValorCoseno(int valorCoseno) {
        this.valorCoseno = valorCoseno;
    }

    public DispositivoFormBean(int valorParaCalcularLaTabla, int valorParaCalcularDivisor) {
        this.valorParaCalcularLaTabla = valorParaCalcularLaTabla;
        this.valorParaCalcularDivisor = valorParaCalcularDivisor;
    }

    public int getValorParaCalcularLaTabla() {
        return valorParaCalcularLaTabla;
    }

    public void setValorParaCalcularLaTabla(int valorParaCalcularLaTabla) {
        this.valorParaCalcularLaTabla = valorParaCalcularLaTabla;
    }

    public void cargarTabla() {
        this.setTabla((ArrayList<Integer>) this.getDispositivo().tablaMultiplicar(this.getValorParaCalcularLaTabla()));
    }

    public void cargarLista() {
        this.setDivisores((ArrayList<Integer>) this.getDispositivo().divisor(this.getValorParaCalcularDivisor()));
    }

    public void cargarGrid() {
        this.setPares((ArrayList<Integer>) this.getDispositivo().calcularNumerosPares(this.getValorCotaInferior(), this.getValorCotaSuperior()));
    }

    public void cargarResulatdo() {
   //     System.out.println("asdf");
        this.getDispositivo().calcularCoseno(this.valorCoseno);
        this.setResultadoCoseno(this.dispositivo.calcularCoseno(valorCoseno));
  //      System.out.println(this.valorCoseno);
  //    System.out.println("qwerty");
    }

    public ArrayList<Integer> getTabla() {
        return tabla;
    }

    public void setTabla(ArrayList<Integer> tabla) {
        this.tabla = tabla;
    }

    /**
     * Creates a new instance of DispositivoFormBean
     */
    public DispositivoFormBean() {

    }

    /**
     * @return the dispositivo
     */
    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    /**
     * @param dispositivo the dispositivo to set
     */
    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    /**
     * @return the valorParaCalcularDivisor
     */
    public int getValorParaCalcularDivisor() {
        return valorParaCalcularDivisor;
    }

    /**
     * @param valorParaCalcularDivisor the valorParaCalcularDivisor to set
     */
    public void setValorParaCalcularDivisor(int valorParaCalcularDivisor) {
        this.valorParaCalcularDivisor = valorParaCalcularDivisor;
    }

    /**
     * @return the valorCotaInferior
     */
    public int getValorCotaInferior() {
        return valorCotaInferior;
    }

    /**
     * @param valorCotaInferior the valorCotaInferior to set
     */
    public void setValorCotaInferior(int valorCotaInferior) {
        this.valorCotaInferior = valorCotaInferior;
    }

    /**
     * @return the valorCotaSuperior
     */
    public int getValorCotaSuperior() {
        return valorCotaSuperior;
    }

    /**
     * @param valorCotaSuperior the valorCotaSuperior to set
     */
    public void setValorCotaSuperior(int valorCotaSuperior) {
        this.valorCotaSuperior = valorCotaSuperior;
    }

    /**
     * @return the pares
     */
    public ArrayList<Integer> getPares() {
        return pares;
    }

    /**
     * @param pares the pares to set
     */
    public void setPares(ArrayList<Integer> pares) {
        this.pares = pares;
    }

}
