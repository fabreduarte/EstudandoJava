package aula6;

public class Trapezio implements FormaGeometrica{
    private int altura;
    private int baseA;
    private int baseB;    
    private int ladoA;
    private int ladoB;


    //#region getters and setters
    
    public int getBaseA() {
        return baseA;
    }
    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }
    public int getBaseB() {
        return baseB;
    }
    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLadoA() {
        return ladoA;
    }
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    public int getLadoB() {
        return ladoB;
    }
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    //#endregion

    //#region regras    
    @Override 
    public int getArea(){
        int area = 0;
        area = ((baseA + baseB) * altura)/2;
        return area;
    }

    @Override 
    public int getPerimetro(){
        int perimetro = 0;
        perimetro = (baseA + baseB + ladoA + ladoB);
        return perimetro;
    }

    @Override 
    public String getNomeFigura(){
        return "trapezio";
    }      
    //#endregion
}
