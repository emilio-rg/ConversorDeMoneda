import java.util.Scanner;

public class Conversiones extends BusquedaAPI {


    public void cambio(){
        var menu = true;
        while(menu){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Seleccione una de las opciones del menu");
            System.out.println("1. Cambio de divisas");
            System.out.println("2. Lista de divisas disponibles");
            System.out.println("3. Salir");
            var opcionDeMenu = lectura.nextLine();
        try {
            switch (opcionDeMenu) {
                case "1":
                    System.out.println("Escriba la divisa a saber el tipo de cambio: (Ejemplo: 'USD'(Dolar Estadounidense) ");
                    var divisaACambiar = lectura.nextLine();
                    BusquedaAPI busqueda = new BusquedaAPI();
                    Moneda moneda = busqueda.buscarTipoDeCambio(divisaACambiar);
               System.out.println("Tipo de cambio en distintas monedas:");
//                //System.out.println(moneda.conversion_rates());
                System.out.println("Peso Argentino: " + moneda.conversion_rates().get("ARS"));
                System.out.println("Real Brasileño: " + moneda.conversion_rates().get("BRL"));
                System.out.println("Boliviano Boliviano: " + moneda.conversion_rates().get("BOB"));
                System.out.println("Peso Chileno: " + moneda.conversion_rates().get("CLP"));
                System.out.println("Peso Colombiano: " + moneda.conversion_rates().get("COP"));
                System.out.println("Dolar estadounidense: " + moneda.conversion_rates().get("USD"));
                System.out.println("Peso Mexicano: " + moneda.conversion_rates().get("MXN"));
                break;

                case "2":
                    System.out.println("Peso Argentino - ARS");
                    System.out.println("Real Brasileño - BLR");
                    System.out.println("Boliviano Boliviano - BOB");
                    System.out.println("Peso Chileno - CLP");
                    System.out.println("Peso Colombiano - COP");
                    System.out.println("Dolar Estadounidense - USD");
                    System.out.println("Peso Mexicano - MXN");
                    break;
                case "3":
                    System.out.println("Saliendo del programa");
                    menu = false;
                    break;
                default:
                    System.out.println("Opcion Invalida");

            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


     }
    }
}
