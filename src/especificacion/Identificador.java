package especificacion;

public class Identificador {
    private String texto;

    public Identificador(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "<SPAN CLASS=\"ident\">"+ this.getTexto() +"</SPAN>";
    }
}
