package especificacion;

import java.util.List;

public abstract class Part {
    protected Identificador identificador;
    protected List<Param> listParam;
    protected Blq cuerpo;

    public Part(Identificador identificador, List<Param> listParam, Blq cuerpo) {
        this.identificador = identificador;
        this.listParam = listParam;
        this.cuerpo = cuerpo;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }

    public List<Param> getListParam() {
        return listParam;
    }

    public void setListParam(List<Param> listParam) {
        this.listParam = listParam;
    }

    public Blq getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Blq cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public abstract String toString();
}
