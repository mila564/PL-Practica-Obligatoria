package especificacion;

public class Buclepara extends Sent{
    private Identificador idInicializacion;
    private String asigInicializacion;
    private Exp expInicializacion;

    private Lcond condicion;

    private Identificador idIncremento;
    private String asigIncremento;
    private Exp expIncremento;

    private Blq cuerpo;

    public Buclepara(Identificador idInicializacion, String asigInicializacion, Exp expInicializacion, Lcond condicion, Identificador idIncremento, String asigIncremento, Exp expIncremento, Blq cuerpo) {
        this.idInicializacion = idInicializacion;
        this.asigInicializacion = asigInicializacion;
        this.expInicializacion = expInicializacion;
        this.condicion = condicion;
        this.idIncremento = idIncremento;
        this.asigIncremento = asigIncremento;
        this.expIncremento = expIncremento;
        this.cuerpo = cuerpo;
    }

    public Identificador getIdInicializacion() {
        return idInicializacion;
    }

    public void setIdInicializacion(Identificador idInicializacion) {
        this.idInicializacion = idInicializacion;
    }

    public String getAsigInicializacion() {
        return asigInicializacion;
    }

    public void setAsigInicializacion(String asigInicializacion) {
        this.asigInicializacion = asigInicializacion;
    }

    public Exp getExpInicializacion() {
        return expInicializacion;
    }

    public void setExpInicializacion(Exp expInicializacion) {
        this.expInicializacion = expInicializacion;
    }

    public Lcond getCondicion() {
        return condicion;
    }

    public void setCondicion(Lcond condicion) {
        this.condicion = condicion;
    }

    public Identificador getIdIncremento() {
        return idIncremento;
    }

    public void setIdIncremento(Identificador idIncremento) {
        this.idIncremento = idIncremento;
    }

    public String getAsigIncremento() {
        return asigIncremento;
    }

    public void setAsigIncremento(String asigIncremento) {
        this.asigIncremento = asigIncremento;
    }

    public Exp getExpIncremento() {
        return expIncremento;
    }

    public void setExpIncremento(Exp expIncremento) {
        this.expIncremento = expIncremento;
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
        lista += "<SPAN CLASS=\"palres\">buclepara</SPAN>";
        lista += "(";
        lista += this.getIdInicializacion().toString();
        lista += this.asigInicializacion.toString();
        lista += this.getExpInicializacion().toString();
        lista += ";";
        lista += this.getCondicion().toString();
        lista += ";";
        lista += this.getIdIncremento().toString();
        lista += this.getAsigIncremento().toString();
        lista += this.getExpIncremento().toString();
        lista += ")";
        lista += "</DIV>";
        lista += this.getCuerpo().toString();
        return lista;
    }
}
