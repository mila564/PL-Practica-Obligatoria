package especificacion;

public class Lcond {
    private boolean negacion;
    private Cond condicion;
    private LcondPrima condicionRecursiva;

    public Lcond(boolean negacion, Cond condicion, LcondPrima condicionRecursiva) {
        this.negacion = negacion;
        this.condicion = condicion;
        this.condicionRecursiva = condicionRecursiva;
    }

    public boolean isNegacion() {
        return negacion;
    }

    public void setNegacion(boolean negacion) {
        this.negacion = negacion;
    }

    public Cond getCondicion() {
        return condicion;
    }

    public void setCondicion(Cond condicion) {
        this.condicion = condicion;
    }

    public LcondPrima getCondicionRecursiva() {
        return condicionRecursiva;
    }

    public void setCondicionRecursiva(LcondPrima condicionRecursiva) {
        this.condicionRecursiva = condicionRecursiva;
    }

    @Override
    public String toString() {
        String lista = "";
        if (negacion){
            lista += "no";
        }
        lista += this.getCondicion().toString() + this.getCondicionRecursiva().toString();
        return lista;
    }
}
