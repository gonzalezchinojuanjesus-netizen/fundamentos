package Parcial3;

public class bebidascuriosas {
    double porcentaje = 5.0;
    String tipo;
    private String marca;
    double precio;
    String sabor;
    boolean envase;
    double mililitros;

    public bebidascuriosas(double por, String tipo, String marca, double precio, String sabor, boolean envase, double mililitros) {
        this.porcentaje = por;
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
        this.sabor = sabor;
        this.envase = envase;
        this.mililitros = mililitros;

    }
    @Override
    public String toString() {
        return "bebidascuriosas{" +
                "porcentaje=" + porcentaje +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", sabor='" + sabor + '\'' +
                ", envase='" + envase + '\'' +
                ", mililitros=" + mililitros +
                '}';
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isEnvase() {
        return envase;
    }

    public void setEnvase(boolean envase) {
        this.envase = envase;
    }

    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }
}
