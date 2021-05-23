package especificacion;

public class Asignacion extends Sent{

    private Identificador id;
    private String asig;
    private Exp expresion;

    public Asignacion(Identificador id, String asig, Exp expresion) {
        this.id = id;
        this.asig = asig;
        this.expresion = expresion;
    }

    public Identificador getId() {
        return id;
    }

    public void setId(Identificador id) {
        this.id = id;
    }

    public String getAsig() {
        return asig;
    }

    public void setAsig(String asig) {
        this.asig = asig;
    }

    public Exp getExpresion() {
        return expresion;
    }

    public void setExpresion(Exp expresion) {
        this.expresion = expresion;
    }

    @Override
    public String toString() {
        return "<div style=\"text-indent: 0.5cm\">" + this.getId().toString() + this.getAsig().toString() + this.getExpresion().toString() + ";</div>" ;
    }
}
