package interfaces;


interface GPS {
 default void Ligar() {
     System.out.println("GPS está ligado");
 }

 static void definirVersao() {
     System.out.println("GPS é da versao 2.0");
 }
}

interface Radio {
 default void tocarMusica() {
     System.out.println("rádio tocando música");
 }

 static void sintonizarFrequencia() {
     System.out.println("frequência sintonizada");
 }
}

abstract class Veiculo {
 abstract void dirigir();
}

class Main extends Veiculo implements GPS, Radio {
 @Override
 void dirigir() {
     System.out.println("O carro está sendo dirigido");
 }
}
public class Main {
    static void navegarComGps(GPS gps) {
        gps.navegar();  
    }

    public static void main(String[] args) {
    	Carro carro = new Carro();
        carro.Ligar();       
        carro.tocarMusica();    
        carro.dirigir();       
        GPS.definirVersao();    
        Radio.sintonizarFrequencia();  

        
        GPS gpsInterface = new Carro();
        navegarComGps(gpsInterface);
        
    }
}
