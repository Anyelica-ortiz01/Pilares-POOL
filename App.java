public class App {
    public static void main(String[] args) throws Exception {
    }

    empleado[] empleado = new empleado[2];

    empleado[0] = new empleadoTiempocompleto("Alex mejia", "0012201006", "6000, 0");
    empleado[2] = new empleadoMediotiempo( "Maria Cardeñal",  "0012024109", "200", 2);

    for (Empleado empleado :empleado) {
        System.out.println("empleado: " + empleado.getnombre() + "salario mensual: $" + empleado.CalcularSalario());

    }

    for(int i = 0; i < empleado.length;)
}
