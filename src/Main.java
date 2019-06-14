public class Main {
    public static void main (String [] args) {
        Lista lista  = new Lista();

        lista.agregar(3);
        lista.agregar(5);
        lista.agregar(7);
        lista.agregar(8);
        lista.agregar(10);

        lista.imprimir();
        System.out.println(lista.tamanio());
        System.out.println(lista.estaVacia());
        System.out.println(lista.estaLlena());
    }
}
