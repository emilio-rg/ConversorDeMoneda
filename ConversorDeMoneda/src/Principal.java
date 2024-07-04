import java.io.IOException;
import java.util.Scanner;

public class Principal extends BusquedaAPI{
    public static void main (String[] args) {
//        Scanner lectura = new Scanner(System.in);
//        System.out.println("Escriba una divisa");
//        try {
//
//            var divisa = lectura.nextLine();
//            BusquedaAPI busqueda = new BusquedaAPI();
//            Moneda moneda = busqueda.buscarTipoDeCambio(divisa);
//            System.out.println(moneda.conversion_rates());
//            System.out.println(moneda.conversion_rates().get("ARS"));
//            System.out.println(moneda.conversion_rates().get("BRL"));
//            System.out.println(moneda.conversion_rates().get("BOB"));
//            System.out.println(moneda.conversion_rates().get("CLP"));
//            System.out.println(moneda.conversion_rates().get("COP"));
//            System.out.println(moneda.conversion_rates().get("USD"));
//            System.out.println(moneda.conversion_rates().get("MXN"));
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
        Conversiones conversor = new Conversiones();
        conversor.cambio();

    }
}
