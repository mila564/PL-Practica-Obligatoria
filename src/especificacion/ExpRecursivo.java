package especificacion;

public class ExpRecursivo {
    private String operador;
    private Exp expresion;

    public ExpRecursivo(String operador, Exp expresion) {
        this.operador = operador;
        this.expresion = expresion;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Exp getExpresion() {
        return expresion;
    }

    public void setExpresion(Exp expresion) {
        this.expresion = expresion;
    }

    @Override
    public String toString() {
        return this.getOperador().toString() + this.getExpresion().toString();
    }
}
