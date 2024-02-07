package com.jesusmelero;

import java.util.Objects;

public class Paciente {
    private final String sip;
    private final String nombre;
    private final boolean sexo;
    private final String edad;
    private final String sintomatologia;

    private final String temperatura;
    private final String pulsaciones;
    private final String tensionArterialSistolica;
    private final String tensionArterialDiastolica;


    public Paciente(String sip, String nombre, boolean sexo, String edad, String sintomatologia, String temperatura, String pulsaciones, String tensionArterialSistolica, String tensionArterialDiastolica) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.sintomatologia = sintomatologia;
        this.temperatura = temperatura;
        this.pulsaciones = pulsaciones;
        this.tensionArterialSistolica = tensionArterialSistolica;
        this.tensionArterialDiastolica = tensionArterialDiastolica;
    }

    public String getSip() {
        return sip;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public String getEdad() {
        return edad;
    }

    public String getSintomatologia() {
        return sintomatologia;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getPulsaciones() {
        return pulsaciones;
    }

    public String getTensionArterialSistolica() {
        return tensionArterialSistolica;
    }

    public String getTensionArterialDiastolica() {
        return tensionArterialDiastolica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        if (sexo != paciente.sexo) return false;
        if (!Objects.equals(sip, paciente.sip)) return false;
        if (!Objects.equals(nombre, paciente.nombre)) return false;
        if (!Objects.equals(edad, paciente.edad)) return false;
        if (!Objects.equals(sintomatologia, paciente.sintomatologia))
            return false;
        if (!Objects.equals(temperatura, paciente.temperatura))
            return false;
        if (!Objects.equals(pulsaciones, paciente.pulsaciones))
            return false;
        if (!Objects.equals(tensionArterialSistolica, paciente.tensionArterialSistolica))
            return false;
        return Objects.equals(tensionArterialDiastolica, paciente.tensionArterialDiastolica);
    }

    @Override
    public int hashCode() {
        int result = sip != null ? sip.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (sexo ? 1 : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (sintomatologia != null ? sintomatologia.hashCode() : 0);
        result = 31 * result + (temperatura != null ? temperatura.hashCode() : 0);
        result = 31 * result + (pulsaciones != null ? pulsaciones.hashCode() : 0);
        result = 31 * result + (tensionArterialSistolica != null ? tensionArterialSistolica.hashCode() : 0);
        result = 31 * result + (tensionArterialDiastolica != null ? tensionArterialDiastolica.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", edad='" + edad + '\'' +
                ", sintomatologia='" + sintomatologia + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", pulsaciones='" + pulsaciones + '\'' +
                ", tensionArterialSistolica='" + tensionArterialSistolica + '\'' +
                ", tensionArterialDiastolica='" + tensionArterialDiastolica + '\'' +
                '}';
    }
}
