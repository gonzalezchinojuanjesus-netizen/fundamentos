package Parcial3;

public class carroavion {
        String modelo;
        String color;
        String [] marca;
        String [] categoria;
        String [] llastas;
        String [] serie;
        int anio;
        int capacidad;
        double kilometrage;
        double precio;

        public carroavion(String modelo, String color, String [] marca,String [] categoria,String[] llastas, String[] serie,int capacidad, int anio,double kilometrage,double precio){
         this.marca=marca;
         this.modelo=modelo;
         this.color=color;
         this.categoria=categoria;
         this.llastas=llastas;
         this.anio=anio;
         this.capacidad=capacidad;
         this.kilometrage=kilometrage;
         this.precio=precio;
         this.serie=serie;
        }
        public carroavion(){

        }


    }


