package especificacion;

public class CondBooleanaCompleja extends Cond{
    private Exp expresion1;
    private String opr;
    private Exp expresion2;

    public CondBooleanaCompleja(Exp expresion1, String opr, Exp expresion2) {
        this.expresion1 = expresion1;
        this.opr = opr;
        this.expresion2 = expresion2;
    }

    public Exp getExpresion1() {
        return expresion1;
    }

    public void setExpresion1(Exp expresion1) {
        this.expresion1 = expresion1;
    }

    public String getOpr() {
        return opr;
    }

    public void setOpr(String opr) {
        this.opr = opr;
    }

    public Exp getExpresion2() {
        return expresion2;
    }

    public void setExpresion2(Exp expresion2) {
        this.expresion2 = expresion2;
    }

    @Override
    public String toString() {
        return this.getExpresion1().toString() + this.getOpr().toString() + this.getExpresion2().toString();
    }
}
