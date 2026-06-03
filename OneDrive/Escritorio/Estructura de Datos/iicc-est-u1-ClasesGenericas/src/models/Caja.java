package models;

public class Caja<T> {
    private T objeto;

    public Caja() {
    }

    public Caja(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return objeto;
    }

    @Override
    public String toString() {
        return "Caja [objeto=" + objeto + "]";
    }
}