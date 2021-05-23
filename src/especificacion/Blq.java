package especificacion;

import java.util.List;

public class Blq extends Sent{
    private List<Sent> sentencias;
    private int nivelIndentacion;

    public Blq(List<Sent> sentencias, int nivelIndentacion) {
        this.sentencias = sentencias;
        this.nivelIndentacion = nivelIndentacion;
    }

    public List<Sent> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<Sent> sentencias) {
        this.sentencias = sentencias;
    }

    public int getNivelIndentacion() {
        return nivelIndentacion;
    }

    public void setNivelIndentacion(int nivelIndentacion) {
        this.nivelIndentacion = nivelIndentacion;
    }

    @Override
    public String toString() {
        String lista = "";
        for (Sent s : this.getSentencias()){
            lista += s.toString();
        }
        return "<DIV>" +
                "<DIV>" +"<SPAN CLASS=\"palres\">inicio</SPAN>" + "</DIV>"
                + "<DIV STYLE=\"text-indent:" + this.getNivelIndentacion()* 0.5 + "cm\">" + lista + "</DIV>" +
                "<DIV>" + "<SPAN CLASS=\"palres\">fin</SPAN>" + "</DIV>" +
                "</DIV>";
    }
}
