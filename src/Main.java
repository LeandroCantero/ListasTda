public class Main {
    public static void main (String [] args) {
        Lista lista  = new Lista();

        lista.agregar(3);
        lista.agregar(5);
        lista.agregar(7);
        lista.agregar(8);
        lista.agregar(10);

        lista.imprimir();
        System.out.println();
        System.out.println();
        lista.tamanio();
        lista.estaVacia();
        //lista.insertarElemento(3, 3);
        //lista.eliminarElemento(2);
        lista.reemplazarElemento(4, 4);
        //lista.intercambiarDosPrimeros();

        lista.imprimir();
    }
}
