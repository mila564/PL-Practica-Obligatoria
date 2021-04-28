public class SentSimple extends Sent{

    private String elementoSimple;

    public SentSimple(String elementoSimple) {
        this.elementoSimple = elementoSimple;
    }

    public String getElementoSimple() {
        return elementoSimple;
    }

    public void setElementoSimple(String elementoSimple) {
        this.elementoSimple = elementoSimple;
    }

    @Override
    public String toString() {
        return elementoSimple;
    }
}
