public class Vector {
    public Object[] datos;
    private int numElements;

    public Vector(int longitud){
        //Constructor que crea un vector con el tamaño especificado.
        datos = new Object[longitud];

    }
    public int getNumElements(){
        //Devuelve el nº de elementos del vector.
        int numElements =0;
        for(Object dato : datos){
            if (dato != null) numElements++;
        }
        return numElements;
    }
    public void agregar(Object dato){
        //Agrega un nuevo elemento al final del vector.
        try{
            datos[getNumElements()] = dato;
            numElements++;
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("-----[ERROR] Ya nopuedes agregar más elementos");
        }
    }
    public Object getElemento(int indice){
        //Devuelve el elemento en la posición indicada del vector.
        try {
            return datos[indice];
        }catch (Exception ex){
            System.out.println("-----[ERROR] Indice fuera de rango");
            return null;
        }
    }
    public void setElemento(int indice, Object dato){
        //Modifica el elemento en la posición indicada del vector.
        datos[indice] = dato;
    }
    public String toString(){
        //Devuelve una representación textual del vector.
        String vector ="[";
        for (int i =0; i<numElements;i++){
            vector += datos[i] + (i== numElements-1? "]":", ");
        }
        return vector;
    }
    public void eliminar(int posi){
        // Elimina la posición del vector reordenando las posiciones afectadas (Pensar todos los casos)
        Object[] aux = new Object[numElements - 1];


        for(int i =0; i<aux.length; i++){
            if(i<posi) aux[i] = datos[i];
            else{
                aux[i] = datos[i+1];
            }
            //[4,5,6,7,8] --> 6
            //[4,5,7,8]
        }
        numElements--;
        datos = aux;

    }
}
