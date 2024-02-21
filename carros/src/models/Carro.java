package carros.src.models;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public Integer ano;
    public Integer velocidade;
    public String marcha;

    public Carro(String marca, String modelo, String cor, Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marcha = "N";
        this.velocidade = 0;
    }

    public void ligar(){
        System.out.println("Ligando carro...");
        System.out.println("Carro ligado!");
    }

    public void desligar(){
        if(this.marcha != "N"){
            System.out.println("Troque a marcha para neutro para desligar o carro.");
            System.out.println("Marcha atual: " + this.marcha);
        }else{
            System.out.println("Desligando carro...");
            System.out.println("Carro desligado!");
        }
    }

    public void trocarMarcha(String marcha){
        System.out.println("Trocando marcha: " + this.marcha + " --> " + marcha);
        this.marcha = marcha;
    }

    public void acelerar(int forca){
        this.velocidade += forca;
    }

    public void desacelerar(int forca){
        this.velocidade -= forca;
    }

    public void verCarro(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.velocidade + " KM/H");
        System.out.println("Marcha atual: " + this.marcha);
    }
}
