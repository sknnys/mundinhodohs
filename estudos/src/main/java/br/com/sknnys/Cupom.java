package br.com.sknnys;

public class Cupom {
    private int idCupom;
    private String nomeCupom;
    private double percentual;

    public Cupom(int idCupom){
        this.idCupom = idCupom;
        this.nomeCupom = nomeCupom;
        this.percentual = percentual;

    }

    public int getIdcupom(){
        return idCupom;
    }
    public String getNomeCupom(){
        return nomeCupom;
    }
    public double getValorDesconto(){
        return percentual;
    }

    public double calculaDesconto(double valor){
        return valor *(percentual / 100);
        }
}
