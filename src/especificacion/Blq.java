package especificacion;

import java.util.List;

public class Blq extends Sent{
    private List<Sent> sentencias;

    public Blq(List<Sent> sentencias) {
        this.sentencias = sentencias;
    }

    public List<Sent> getSentencias() {
        return sentencias;
    }

    public void setSentencias(List<Sent> sentencias) {
        this.sentencias = sentencias;
    }

    @Override
    public String toString() {
        String lista = "";
        for (Sent s : this.getSentencias()){
            lista += s.toString();
        }
        return "<DIV STYLE=\"text-indent: 0.5cm>" +
                "<SPAN CLASS=\"palres\">inicio</SPAN>" + "<BR>"
                + lista +
                "<SPAN CLASS=\"palres\">fin</SPAN>" +
                "<BR>" + "</DIV>";
    }
}
