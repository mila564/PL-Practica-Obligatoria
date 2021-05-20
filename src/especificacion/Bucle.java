package especificacion;

public class Bucle extends Sent{
    private Blq cuerpo;
    private Lcond condicion;

    public Bucle(Blq cuerpo, Lcond condicion) {
        this.cuerpo = cuerpo;
        this.condicion = condicion;
    }

    public Blq getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Blq cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Lcond getCondicion() {
        return condicion;
    }

    public void setCondicion(Lcond condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        String lista = "";
        lista += "<DIV STYLE=\"text-indent: 0.5cm>";
        lista += "<SPAN CLASS=\"palres\">bucle</SPAN>";
        lista += "</DIV>";
        lista += this.getCuerpo().toString();
        lista += "<DIV STYLE=\"text-indent: 0.5cm>";
        lista += "<SPAN CLASS=\"palres\">hasta</SPAN>";
        lista += "(";
        lista += this.getCondicion().toString();
        lista += ")";
        lista += "</DIV>";
        return lista;
    }
}
