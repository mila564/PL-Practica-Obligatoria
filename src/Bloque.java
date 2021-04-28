import java.util.List;

public class Bloque {
    private List<Sent> sentencias;

    public Bloque(List<Sent> sentencias) {
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
        String s = new String();
        for (Sent sent: sentencias){
            s += sent.toString();
        }
        return s;
    }
}
