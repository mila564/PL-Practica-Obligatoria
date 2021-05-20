package especificacion;

public class Return {
    private Exp expresion;

    public Return(Exp expresion) {
        this.expresion = expresion;
    }

    public Exp getExpresion() {
        return expresion;
    }

    public void setExpresion(Exp expresion) {
        this.expresion = expresion;
    }

    @Override
    public String toString() {
        return "<div style=\"text-indent: 0.5cm>" + "<SPAN CLASS=\"palres\">return</SPAN>" + this.getExpresion().toString() + ";</div>";
    }
}
