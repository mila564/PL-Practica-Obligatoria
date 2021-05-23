package especificacion;

import java.util.List;

public class Procedimiento extends Part{
    public Procedimiento(Identificador identificador, List<Param> listParam, Blq cuerpo) {
        super(identificador, listParam, cuerpo);
    }
    public Procedimiento(){
        super();
    }

    @Override
    public String toString() {
        String linea = "<HR/>";
        linea += "<A NAME=\""+getIdentificador().getTexto()+"\">";
        linea += "<SPAN CLASS=\"palres\">procedimiento</SPAN>";
        linea += " ";
        linea += identificador.toString();
        linea += " ";
        linea += "(";
        List<Param> sublista = this.getListParam();
        if (sublista.size() != 0){
            sublista = this.getListParam().subList(0, this.getListParam().size() - 1);
            for (Param param: sublista) {
                linea += param.toString();
                linea += ", ";
            }
            linea += getListParam().get(getListParam().size()-1).toString();
        }
        linea += ")";
        linea += "</A>";
        linea += "<BR>";
        linea += this.getCuerpo().toString();
        linea += "<A HREF=\"#" + this.getIdentificador().getTexto() + "\">Inicio de rutina</A>";
        linea += "<BR>";
        linea += "<A HREF=\"#inicio\">Inicio de programa</A>";
        linea += "<BR>";
        return linea;
    }
    public String getCabecera(){
        String cabecera ="";
        cabecera += this.getIdentificador().getTexto() + " ";
        cabecera += "(";
        List<Param> sublista = this.getListParam();
        if (sublista.size() != 0){
            sublista = this.getListParam().subList(0, this.getListParam().size() - 1);
            for (Param param: sublista) {
                cabecera += param.getType().getTexto() + " " + param.getId().getTexto();
                cabecera += ", ";
            }
            cabecera += getListParam().get(getListParam().size()-1).toString();
        }
        cabecera += ")";
        return cabecera;
    }
}
