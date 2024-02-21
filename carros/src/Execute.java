package carros.src;
import carros.src.models.Carro;

public class Execute {
    public static void main(String args[]){
        Carro camaro = new Carro("Chevrolet", "Camaro", "Vermelho", 2024);
        camaro.ligar();
        camaro.trocarMarcha("1");
        camaro.desligar();
        camaro.trocarMarcha("N");
        camaro.desligar();
        camaro.verCarro();
    }
}
