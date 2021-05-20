package especificacion;

public class Constante {
    private String texto;

    public Constante(String texto) {
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
        return "<SPAN CLASS=\"cte\">"+ this.getTexto() +"</SPAN>";
    }
}
