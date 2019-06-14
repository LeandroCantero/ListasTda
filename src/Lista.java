public class Lista {
    NodoLista primero;
    int tamanio = 0;
    public Lista() {
        this.primero = null;
    }

    public void imprimir() {
        NodoLista actual = this.primero;
        while(actual != null){
            System.out.print("["+actual.dato+"]--->");
            actual = actual.siguiente;
        }
    }

    public void imprimirElemento(int elemento){
        NodoLista actual = this.primero;
        for(int i = 0; i < elemento; i++){
            actual = actual.siguiente;
        }
        System.out.println("[" + actual.dato + "]");
    }

    //EJ 1
    public void agregar (int a) {
        NodoLista nodo = new NodoLista();
        nodo.dato = a;

        if (this.primero == null) {
            this.primero = nodo;
        }
        else {
            NodoLista actual = this.primero;
            while(actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nodo;
        }
    }

    public void recorrer (int a) {
        NodoLista actual = this.primero;
        for(int i = 0; i < a; i++) {
            actual = actual.siguiente;
        }
    }

    public NodoLista obtenerElemento(int a) {
        NodoLista actual = this.primero;
        for(int i = 0; i < a; i++) {
            actual = actual.siguiente;
        }
        return actual;
    }

    public int tamanio() {
        NodoLista actual = this.primero;
        if(actual != null) {
            tamanio ++;
            while(actual.siguiente != null) {
                actual = actual.siguiente;
                tamanio ++;
            }
        }
        return tamanio;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public boolean estaLlena() {
        NodoLista actual = this.primero;
        if(this.tamanio > 0) {
            while(actual.siguiente != null) {
                actual = actual.siguiente;
            }
        }
        return actual.siguiente == null;
    }

    public void eliminarLista() {
        this.primero = null;
    }

    public void insertarElemento(int pos, int d) {
        NodoLista nodo = new NodoLista();
        NodoLista actual = this.primero;
        nodo.dato = d;

        if(pos >= this.tamanio) {
            this.agregar(d);
        }
        else if (pos == 0) {
            nodo.siguiente = this.primero;
            this.primero = nodo;
        }
        else {
            for(int i = 0; i < pos-1; i++) {
                actual = actual.siguiente;
            }

            nodo.siguiente = actual.siguiente;
            actual.siguiente = nodo;
        }
    }

    public void eliminarElemento(int pos) {
        if(!this.estaVacia()){
            NodoLista actual = this.primero;
            for (int i = 0; i < pos-1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = (actual.siguiente).siguiente;
        }
    }

    public void reemplazarElemento(int pos, int d) {
        NodoLista nuevo = new NodoLista();
        NodoLista actual = this.primero;
        nuevo.dato = d;
        if(pos > 0 && pos < this.tamanio()) {
            for(int i = 0; i < pos-1; i++) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = (actual.siguiente).siguiente;
            actual.siguiente = nuevo;
        }
        else if(pos == 0) {
            nuevo.siguiente = (actual.siguiente).siguiente;
            actual.siguiente = nuevo;
        }
    }

    //EJ 2
        public void intercambiarDosPrimeros() {
        if(!this.estaVacia()) {
            NodoLista aux = this.primero.siguiente;
            this.primero.siguiente = aux.siguiente;
            aux.siguiente = this.primero;
            this.primero = aux;
        }
    }

    //Ej 3
    public void intercambiar(int a, int b) {
    }

    //EJ 4

    public void expandirLista(Lista lista) {
        NodoLista nodo = new NodoLista();
        NodoLista actual = this.primero;
        int i = 0;
        if(actual == null) {
            actual = lista.obtenerElemento(i);
        }
        else {
            while(i < this.tamanio) {
                actual = actual.siguiente;
                i++;
            }
        }
    }
}
