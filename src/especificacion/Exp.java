package especificacion;

import java.util.List;

public class Exp {
    private ExpBasico expresionSimple;
    private List<ExpRecursivo> expresionCompleja;

    public Exp(ExpBasico expresionSimple, List<ExpRecursivo> expresionCompleja) {
        this.expresionSimple = expresionSimple;
        this.expresionCompleja = expresionCompleja;
    }

    public ExpBasico getExpresionSimple() {
        return expresionSimple;
    }

    public void setExpresionSimple(ExpBasico expresionSimple) {
        this.expresionSimple = expresionSimple;
    }

    public List<ExpRecursivo> getExpresionCompleja() {
        return expresionCompleja;
    }

    public void setExpresionCompleja(List<ExpRecursivo> expresionCompleja) {
        this.expresionCompleja = expresionCompleja;
    }

    @Override
    public String toString() {
        String lista = "";
        lista +=  this.getExpresionSimple().toString();
        for (ExpRecursivo e : this.getExpresionCompleja()){
            lista += e.toString();
        }
        return lista;
    }
}
