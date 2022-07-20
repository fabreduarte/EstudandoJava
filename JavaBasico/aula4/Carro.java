package aula4;

import java.lang.Math;

public class Carro {
    // #region atributos    
    String marca;
    String modelo;
    String tipoCombustivel;

    int numPassageiro;
    double capCombustivel;
    double consCombustivel;
    // #endregion


    // #region Regras de Negócios da Classe (métodos)
    public double calculaAutonomia(){
        return Math.round((this.capCombustivel * this.consCombustivel));
    }

    public double avaliaTipoCombustivel(String combustivel){
        if(combustivel == "diesel"){
            return 1.6;
        }else if (combustivel == "etanol"){
            return 0.7;
        }else{
            return 1;
        }
        
    }


    public double verificarEcoDesempenho(){
        double eco = (this.calculaAutonomia()/this.numPassageiro) * this.avaliaTipoCombustivel(this.tipoCombustivel);
        return Math.round(eco);
    }

    public boolean validaEcoDesempenho(double indice){
        if(this.verificarEcoDesempenho()>indice){
            return true;
        }else{
            return false;
        }
    }



    // #endregion
}