package especificacion;

public class PalabraReservada {
    private String texto;

    public PalabraReservada(String texto) {
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
        return "<SPAN CLASS=\"palres\">"+ this.getTexto() +"</SPAN>";
    }
}
