package ordenamientoporarreglo;

/**
 *
 * @author felipe_2
 */
public class OrdamientoObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Estudiante[] arrayEstudiantes = new Estudiante[5];
        arrayEstudiantes[0] = new Estudiante("Andres", "Caca", "123", 5, 5.0);
        arrayEstudiantes[1] = new Estudiante("Felipe", "Mala", "143242", 4, 4.5);
        arrayEstudiantes[2] = new Estudiante("Camila", "Buena", "7853", 3, 4.8);
        arrayEstudiantes[3] = new Estudiante("Andrea", "Castaño", "8343", 2, 4.2);
        arrayEstudiantes[4] = new Estudiante("Samuel", "Cabrera", "2910", 1, 2.0);
        arrayEstudiantes[5] = new Estudiante("Julio", "Cartago", "9052", 6, 3.5);

        int temp;

        for (int i = 1; i < arrayEstudiantes.length; i++) {
            for (int j = 0; j < arrayEstudiantes.length - 1; j++) {
                if (arrayEstudiantes[j].getNota() < arrayEstudiantes[j + 1].getNota()) {
                    temp = arrayEstudiantes[j].getPuesto();
                    arrayEstudiantes[j].setPuesto(arrayEstudiantes[j + 1].getPuesto());
                    arrayEstudiantes[j + 1].setPuesto(temp);
                }
            }
        }
        for (int i = 0; i < arrayEstudiantes.length; i++) {

            System.out.println(arrayEstudiantes[i]);

        }
    }
}


    
    

