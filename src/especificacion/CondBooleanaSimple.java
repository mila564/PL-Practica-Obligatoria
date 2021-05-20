package especificacion;

public class CondBooleanaSimple extends Cond{
    private String booleano;

    public CondBooleanaSimple(String booleano) {
        this.booleano = booleano;
    }

    public String getBooleano() {
        return booleano;
    }

    public void setBooleano(String booleano) {
        this.booleano = booleano;
    }

    @Override
    public String toString() {
        return "<SPAN CLASS=\"palres\">"+ this.getBooleano().toString() +"</SPAN>";
    }
}
