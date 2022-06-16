
public class Calculadora {
    // Operaciones
    public static Integer suma(Integer a, Integer b ) {
        return a+b;
    }
    // funcion principal
    public static void main(String[] args) {
        if ("suma".equals(args[0])){
            Integer a = new Integer(args[1]);
            Integer b = Integer.parseInt(args[2]);
            System.out.println("La suma es :"+suma(a,b));
        }
        
    }

}