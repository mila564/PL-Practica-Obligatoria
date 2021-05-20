package especificacion;

public class ExpConParentesis extends ExpBasico{
    private Exp expParentesis;

    public ExpConParentesis(Exp listaExp) {
        this.expParentesis = listaExp;
    }

    public Exp getExpParentesis() {
        return expParentesis;
    }

    public void setExpParentesis(Exp expParentesis) {
        this.expParentesis = expParentesis;
    }

    @Override
    public String toString() {
        return "(" + this.getExpParentesis() + ")";
    }
}
