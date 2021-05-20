package especificacion;

public class LcondRecursivo {
    private String opl;
    private Lcond condicion;

    public LcondRecursivo(String opl, Lcond condicion) {
        this.opl = opl;
        this.condicion = condicion;
    }

    public String getOpl() {
        return opl;
    }

    public void setOpl(String opl) {
        this.opl = opl;
    }

    public Lcond getCondicion() {
        return condicion;
    }

    public void setCondicion(Lcond condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return this.getOpl().toString() + this.getCondicion().toString();
    }
}
