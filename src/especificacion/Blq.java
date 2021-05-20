package especificacion;

import java.util.List;

public class Blq {
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
        return "<DIV STYLE=\"text-indent: 0.5cm>"
                + "<SPAN CLASS=\"palres\">inicio</SPAN>" + "/<DIV>"
                + "<DIV STYLE=\"text-indent: 1cm>"
                + lista +
                "/<DIV>" + "<DIV STYLE=\"text-indent: 0.5cm>"
                + "<SPAN CLASS=\"palres\">fin</SPAN>" +
                "/<DIV>";
    }
}
