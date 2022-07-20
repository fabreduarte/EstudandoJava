package aula4;

import java.lang.Math;

public class Aeronave {
    String marca;
    String modelo;
    String tipoCombustivel;

    int passagem;
    int passageiros;
    int tripulacao;
    double capCombustivel;
    double consCombustivel;
    
    public double autonomia(){
        return Math.round((this.capCombustivel * this.consCombustivel));
    }

    public double verificarDesempenho(){
        double autonomiaPassageiro = (this.autonomia() / (this.passageiros + this.tripulacao));
        return Math.round(autonomiaPassageiro);
    }
    

}



/*  criar classe chamada aeronave 
[tripulação, combustível, consumo, passageiros, passagem, tanque]

Criar os métodos da classe aeronave
1 - calcular a autonomia da aeronave.
2 - calcular o indice por passageiros.
3 - media de valor por autonomia de voo. 

depois usar a classe programa para mostrar estes dados em 4 objetos e seu loca físico de armazenamento
*/