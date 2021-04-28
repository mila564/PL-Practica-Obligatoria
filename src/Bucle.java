public class Bucle {
    private Bloque blq;
    private SentSimple lcond;

    public Bucle(Bloque blq, SentSimple lcond) {
        this.blq = blq;
        this.lcond = lcond;
    }

    public Bloque getBlq() {
        return blq;
    }

    public void setBlq(Bloque blq) {
        this.blq = blq;
    }

    public SentSimple getLcond() {
        return lcond;
    }

    public void setLcond(SentSimple lcond) {
        this.lcond = lcond;
    }

    @Override
    public String toString() {
        return "bucle "+blq.toString()+" hasta ("+ lcond.toString() + ")";
    }
}
