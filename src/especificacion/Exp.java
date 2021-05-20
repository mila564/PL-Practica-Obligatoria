package especificacion;

import java.util.List;

public class Exp {
    private ExpBasico expresionSimple;
    private ExpRecursivo expresionCompleja;

    public Exp(ExpBasico expresionSimple, ExpRecursivo expresionCompleja) {
        this.expresionSimple = expresionSimple;
        this.expresionCompleja = expresionCompleja;
    }

    public ExpBasico getExpresionSimple() {
        return expresionSimple;
    }

    public void setExpresionSimple(ExpBasico expresionSimple) {
        this.expresionSimple = expresionSimple;
    }

    public ExpRecursivo getExpresionCompleja() {
        return expresionCompleja;
    }

    public void setExpresionCompleja(ExpRecursivo expresionCompleja) {
        this.expresionCompleja = expresionCompleja;
    }

    @Override
    public String toString() {
        return this.getExpresionSimple().toString() + this.getExpresionCompleja().toString();
    }
}
