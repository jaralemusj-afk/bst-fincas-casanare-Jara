public class ArbolBST {

    private NodoBST raiz;

  
    public ArbolBST() {
        this.raiz = null;
    }

    public void insertar(int codigo, String nombre, String municipio) {
        raiz = insertarRec(raiz, codigo, nombre, municipio);
    }

    private NodoBST insertarRec(NodoBST nodo, int codigo,
                                String nombre, String municipio) {

        if (nodo == null) {
            return new NodoBST(codigo, nombre, municipio);
        }

        if (codigo < nodo.getCodigo()) {
            nodo.setIzquierdo(
                    insertarRec(nodo.getIzquierdo(),
                            codigo, nombre, municipio)
            );

        } else if (codigo > nodo.getCodigo()) {

            nodo.setDerecho(
                    insertarRec(nodo.getDerecho(),
                            codigo, nombre, municipio)
            );
        }

        return nodo;
    }


    public NodoBST buscar(int codigo) {
        return buscarRec(raiz, codigo);
    }

    private NodoBST buscarRec(NodoBST nodo, int codigo) {

        if (nodo == null || nodo.getCodigo() == codigo) {
            return nodo;
        }

        if (codigo < nodo.getCodigo()) {
            return buscarRec(nodo.getIzquierdo(), codigo);
        } else {
            return buscarRec(nodo.getDerecho(), codigo);
        }
    }


    public void preOrden() {
        System.out.println("Recorrido PreOrden:");
        preOrdenRec(raiz);
    }

    private void preOrdenRec(NodoBST nodo) {

        if (nodo != null) {

            System.out.println(
                    "Codigo: " + nodo.getCodigo()
                    + " | Finca: " + nodo.getNombreFinca()
                    + " | Municipio: " + nodo.getMunicipio()
            );

            preOrdenRec(nodo.getIzquierdo());
            preOrdenRec(nodo.getDerecho());
        }
    }


    public void inOrden() {
        System.out.println("Recorrido InOrden:");
        inOrdenRec(raiz);
    }

    private void inOrdenRec(NodoBST nodo) {

        if (nodo != null) {

            inOrdenRec(nodo.getIzquierdo());

            System.out.println(
                    "Codigo: " + nodo.getCodigo()
                    + " | Finca: " + nodo.getNombreFinca()
                    + " | Municipio: " + nodo.getMunicipio()
            );

            inOrdenRec(nodo.getDerecho());
        }
    }


    public void postOrden() {
        System.out.println("Recorrido PostOrden:");
        postOrdenRec(raiz);
    }

    private void postOrdenRec(NodoBST nodo) {

        if (nodo != null) {

            postOrdenRec(nodo.getIzquierdo());
            postOrdenRec(nodo.getDerecho());

            System.out.println(
                    "Codigo: " + nodo.getCodigo()
                    + " | Finca: " + nodo.getNombreFinca()
                    + " | Municipio: " + nodo.getMunicipio()
            );
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }


    public NodoBST getRaiz() {
        return raiz;
    }
}