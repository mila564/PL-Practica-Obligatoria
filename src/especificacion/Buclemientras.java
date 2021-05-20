package especificacion;

public class Buclemientras extends Sent{
    private Lcond condicion;
    private Blq cuerpo;

    public Buclemientras(Lcond condicion, Blq cuerpo) {
        this.condicion = condicion;
        this.cuerpo = cuerpo;
    }

    public Lcond getCondicion() {
        return condicion;
    }

    public void setCondicion(Lcond condicion) {
        this.condicion = condicion;
    }

    public Blq getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Blq cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        String lista = "";
        lista += "<DIV STYLE=\"text-indent: 0.5cm\">";
        lista += "<SPAN CLASS=\"palres\"> buclemientras </SPAN>";
        lista += "(";
        lista += this.getCondicion().toString();
        lista += ")";
        lista += "</DIV>";
        lista += this.getCuerpo().toString();
        return lista;
    }
}
