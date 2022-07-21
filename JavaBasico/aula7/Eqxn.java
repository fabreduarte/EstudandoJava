package aula7;

public class Eqxn extends Equacao{
    private double xn;
    private double xp;
    public Eqxn(double a, double b, double c){
        super.setA(a);
        super.setB(b);
        super.setC(c);
    }

    //#region getters setters
    public double getXn() {
        return xn;
    }
    public void setXn(double xn) {
        this.xn = xn;
    }
    public double getXp() {
        return xp;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
    //#endregion

    public double calculaXp(double delta){
        setXp((-getB()+Math.sqrt(delta))/(2*getA()));
        return getXp();
    }
    public double calculaXn(double delta){
        setXn((-getB()-Math.sqrt(delta))/(2*getA()));
        return getXn();
    }

    // public double calculaXn(Delta d){
    //     xn=(-d.getB()-Math.sqrt(d.getDelta()))/(2*d.getA());
    //     return xn;
    // }

    // public double calculaXp(Delta d){
    //     xp=(-d.getB()+Math.sqrt(d.getDelta()))/(2*d.getA());
    //     return xp;
    // }

}
