package especificacion;

import java.util.LinkedList;

public class LcondPrima {
    private LinkedList<LcondRecursivo> lcondprima;

    public LcondPrima(LinkedList<LcondRecursivo> lcondprima) {
        this.lcondprima = lcondprima;
    }

    public LinkedList<LcondRecursivo> getLcondprima() {
        return lcondprima;
    }

    public void setLcondprima(LinkedList<LcondRecursivo> lcondprima) {
        this.lcondprima = lcondprima;
    }

    @Override
    public String toString() {
        String lista = "";
        for (LcondRecursivo condRec : this.getLcondprima()){
            lista += condRec.toString();
        }
        return lista;
    }
}
