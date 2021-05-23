package especificacion;

public class Bifurcacion extends Sent{
    private Lcond condicion;
    private Blq bloqueEntonces;
    private Blq bloqueSino;

    public Bifurcacion(Lcond condicion, Blq bloqueEntonces, Blq bloqueSino) {
        this.condicion = condicion;
        this.bloqueEntonces = bloqueEntonces;
        this.bloqueSino = bloqueSino;
    }

    public Lcond getCondicion() {
        return condicion;
    }

    public void setCondicion(Lcond condicion) {
        this.condicion = condicion;
    }

    public Blq getBloqueEntonces() {
        return bloqueEntonces;
    }

    public void setBloqueEntonces(Blq bloqueEntonces) {
        this.bloqueEntonces = bloqueEntonces;
    }

    public Blq getBloqueSino() {
        return bloqueSino;
    }

    public void setBloqueSino(Blq bloqueSino) {
        this.bloqueSino = bloqueSino;
    }

    @Override
    public String toString() {
        String lista = "";
        lista += "<DIV>";
        lista += "<SPAN CLASS=\"palres\">bifurcacion</SPAN>";
        lista += "(";
        lista += this.getCondicion().toString();
        lista += ")";
        lista += "</DIV>";
        lista += "<DIV>";
        lista += "<SPAN CLASS=\"palres\">entonces</SPAN>";
        lista += "</DIV>";
        lista += this.getBloqueEntonces().toString();
        lista += "<DIV>";
        lista += "<SPAN CLASS=\"palres\">sino</SPAN>";
        lista += "</DIV>";
        lista += this.getBloqueSino().toString();
        return lista;
    }
}
