package aula4;

public class Programa {
    // public static void main(String[] args) {

    //     Carro van = new Carro();
    //     van.marca = "Kombosa";
    //     van.modelo = "Kombi";
    //     van.numPassageiro = 10;
    //     van.capCombustivel = 76;        
    //     van.consCombustivel = 10.2;
    //     van.tipoCombustivel = "diesel";

    //     Carro fusca = new Carro();
    //     fusca.marca = "VW";
    //     fusca.modelo = "Fusca";
    //     fusca.numPassageiro = 4;
    //     fusca.capCombustivel = 42;        
    //     fusca.consCombustivel = 8;
    //     fusca.tipoCombustivel = "etanol";
        
    //     System.out.println("---- IMPRESSAO DO OBJETO [Fisico] ----");
    //     System.out.println(van);
    //     System.out.println("Modelo: "+van.modelo+" | Autonomia: "+van.calculaAutonomia());
    //     System.out.println(van.
    //     avaliaTipoCombustivel("diesel"));
    //     System.out.println(van.
    //     avaliaTipoCombustivel("etanol"));
    //     System.out.println("Eco taxa: "+van.verificarEcoDesempenho());
    //     if(van.validaEcoDesempenho(105) == true){
    //         System.out.println("Eco Eficiente.");
    //     }else{
    //         System.out.println("Não é Eco Efciente");
    //     };
    //     System.out.println(fusca);
    //     System.out.println("Modelo: "+fusca.modelo+" | Autonomia: "+fusca.calculaAutonomia());
    //     System.out.println("Eco taxa: "+fusca.verificarEcoDesempenho());
    //     if(fusca.validaEcoDesempenho(105) == true){
    //         System.out.println("Eco Eficiente.");
    //     }else{
    //         System.out.println("Não é Eco Efciente");
    //     }

    //     System.out.println("----[Exercicio de Aeronave]----");
    // }

    public static void main(String[] args) {
        Aeronave boeing = new Aeronave();
        boeing.marca = "Boeing";
        boeing.modelo = "747";
        boeing.tripulacao = 12;
        boeing.passageiros = 382;
        boeing.capCombustivel = 238.000;        
        boeing.consCombustivel = 15.000;

        System.out.println("---- VIAAAAAÃO ----");
        System.out.println(boeing);
        System.out.println("Modelo: "+boeing.modelo+" | Autonomia: "+boeing.autonomia());
        System.out.println("Gasto de combustivel por pessoa dentro da aeronave: "+boeing.verificarDesempenho());

    }
}
