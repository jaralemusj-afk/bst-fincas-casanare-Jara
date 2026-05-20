

public class NodoBST {

    private int codigo;
    private String nombreFinca;
    private String municipio;
    private NodoBST izquierdo;
    private NodoBST derecho;

    public NodoBST(int codigo, String nombreFinca, String municipio) {
        this.codigo = codigo;
        this.nombreFinca = nombreFinca;
        this.municipio = municipio;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreFinca() {
        return nombreFinca;
    }

    public void setNombreFinca(String nombreFinca) {
        this.nombreFinca = nombreFinca;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public NodoBST getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoBST izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoBST getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBST derecho) {
        this.derecho = derecho;
    }

    public boolean esHoja() {
        return izquierdo == null && derecho == null;
    }

    @Override
    public String toString() {
        return "NodoBST{" +
                "codigo=" + codigo +
                ", nombreFinca='" + nombreFinca + '\'' +
                ", municipio='" + municipio + '\'' +
                '}';
    }
}