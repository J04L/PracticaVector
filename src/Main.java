public class Main {
    public static void main(String[]args){
        Vector vector = new Vector(5);



        vector.agregar(10);

        vector.agregar(20);

        vector.agregar(30);

        vector.agregar(40);

        vector.agregar(50);



        System.out.println("Elementos en el vector: " + vector.getNumElements());

        System.out.println("Elemento en la posicion 2: " + vector.getElemento(2));



        vector.setElemento(1, 15);



        System.out.println(vector.toString());

        System.out.println("Vamos a eliminar el elemento:" + vector.getElemento(2));

        vector.eliminar(0);

        System.out.println(vector.toString());
    }
}
