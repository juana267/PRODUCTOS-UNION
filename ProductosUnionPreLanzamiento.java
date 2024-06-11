import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class compras_union {
    double total, precioPan = 0;
    private String correo, contraseña, correo_Comp, contraseña_Comp, nombre, apellido, codigoU, union_m, opc_variedad;
    private int opcion, cantidad, op_pdt = 0;

    public String fdatos() {
        Scanner datos = new Scanner(System.in);
        String opcion;
        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("Si/No");
        opcion = datos.nextLine();
        switch (opcion) {
            case "Si":
                System.out.println("Ingrese sus nombres: ");
                nombre = datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido = datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo = datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña = datos.nextLine();
                System.out.println("Ingrese su codigo univercitario univercitario: ");
                codigoU = datos.nextLine();
                this.fcomprobarDatos();
                break;
            case "No":
                System.out.println("Ingrese sus nombres: ");
                nombre = datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido = datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo = datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña = datos.nextLine();
                this.fcomprobarDatos();
                break;
        }
        return null;
    }
    public String fcomprobarDatos() {
        Scanner comprueba = new Scanner(System.in);
        System.out.println("INICIE SESION PARA REALIZAR SU COMPRA");
        System.out.println("Ingrese su correo: ");
        correo_Comp = comprueba.nextLine();
        System.out.println("Ingrese su cotraseña: ");
        contraseña_Comp = comprueba.nextLine();
        if (correo_Comp.equals(correo) && contraseña_Comp.equals(contraseña)) {

            System.out.println("Bienvenido a PRODUCTOS UNION");
            System.out.println("Sr(a): " + nombre + " " + apellido);
            System.out.println(" " + correo + "@gmail.com");
        }
        this.pregunta();
        return null;
    }
    public String pregunta(){
        Scanner union = new Scanner(System.in);
        boolean salir = false;
        System.out.print("\033[31m");
        System.out.println(" _    _  ._   _.  _    ___   ._   _.");
        System.out.println("|  |  |  | |  \\ |  | |  |  /  __  \\  |  \\ |  |");
        System.out.println("|  |  |  | |   \\|  | |  | |  |  |  | |   \\|  |");
        System.out.println("|  |  |  | |  . `   | |  | |  |  |  | |  . `  |");
        System.out.println("|  `--'  | |  |\\   | |  | |  `--'  | |  |\\   |");
        System.out.println(" \\__/  |_| \\| ||  \\__/  || \\_|");
        do {
            System.out.println("┌────────────┬─────────────────┬───────────┬─────────────────────┬─────┐");
            System.out.println("│  PRODUCTOS │ PUNTOS DE VENTA │  DELIVERY │ ELIJO SER SALUDABLE │  x  │");
            System.out.println("└────────────┴─────────────────┴───────────┴─────────────────────┴─────┘");
            System.out.println("Ingrese el nombre de la seccion");
            String respuesta = union.next();
            switch (respuesta) {
                case "PRODUCTOS":
                    fproductos();
                    break;
                case "PUNTOS DE VENTA":
                    puntosdeventa();
                    break;
                case "DELIVERY":
                    delivery();
                    break;
                case " ELIJO SER SALUDABLE":
                    //felijosersaludable();
                case "x":
                    salir = true;
                    break;
                default:
                    System.out.println("\033[93m");
                    System.out.println("Sección no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (!salir);
        union.close(); // Importante cerrar el scanner después de su uso.
        return null;
    }
    public String fproductos() {
        Scanner union = new Scanner(System.in);
        int opcion;

        boolean salir;
        do {
            System.out.println("\033[96m");
            System.out.println("┌─────────────────────────────────────────────────────────┐");
            System.out.println("│                         PRODUCTOS                       │");
            System.out.println("├──────────────┼──────────────┼──────────────┼────────────┤");
            System.out.println("│     PANES    │  BOLLERIA    │    CEREALES  │ BEBIDAS    │");
            System.out.println("├──────────────┼──────────────┼──────────────┼────────────┤");
            System.out.println("│   GALLETAS   │     SNACK    │    UNTABLES  │ PANETONES  │");
            System.out.println("└──────────────┴──────────────┴──────────────┴────────────┘");

            System.out.println("Ingrese el nombre de la seccion de productos");
            String respuesta = union.next();
            salir = false;

            switch (respuesta) {
                case "PANES":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────┐");
                        System.out.println("│                          PANES                                                     │");
                        System.out.println("├──────────────────────┼────────────────────┼───────────────┼────────────────────────┤");
                        System.out.println("│ 1. Pan multisemillas │ 2. Pan con granos  │  3.Pan Fibra  │ 4. Pan multisemillas   │");
                        System.out.println("│       con avena      │       semillas     │    Integral   │      miel de abeja     │");
                        System.out.println("├──────────────────────┼────────────────────┼───────────────┼────────────────────────┤");
                        System.out.println("│ 5. Pan Americano     │ 6. Pan Blanco      │  7.  Pan      │ 8.       Pan Integral  │");
                        System.out.println("│  Sándwich Clásico    │ Superbom Familiar  │      Fuente   │    Sándwich Clásico    │");
                        System.out.println("└──────────────────────┴────────────────────┴───────────────┴────────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        union.nextLine();
                        switch (opcion) {
                            case 1:
                                System.out.println("S/. 10");
                                System.out.println("Pan multisemillas con avena");
                                System.out.println("   Peso   │  Proteinas  │  Fibra  │ Hierro   ");
                                System.out.println("   540g   │     11g     │   6G    │   13g    ");
                                System.out.println("Delicioso y saludable pan, libre de bromato. Con una nutritiva");
                                System.out.println("mezcla en base a harina fortificada con hierro y vitaminas del complejo B,");
                                System.out.println("hojuelas de avena. Así mismo contiene semillas altamente nutritivas por");
                                System.out.println("su valor funcional para el organismo humano como el girasol, chía y linaza");
                                System.out.println(" Pan fortificado con alto en Hierro, contiene fuente de fibra y fuente de");
                                System.out.println(" proteínas del organismo.");
                                System.out.println("DESEA COMPRAR");
                                System.out.println("1. SI");
                                System.out.println("2. NO");
                                System.out.println("Seleccione una opción");
                                opcion = union.nextInt();
                                union.nextLine();
                                switch (opcion) {
                                    case 1:
                                        fcosto(union);

                                        break;
                                    case 2:
                                        System.out.println("gracias");
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                                        break;

                                }
                            case 0:
                                salir = true;

                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    } while (!salir);
                    break;
                case "SALIR":
                    salir = true;
                    break;
                default:
                    System.out.println("\033[93m");
                    System.out.println("Sección no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (!salir);
        union.close(); // Importante cerrar el scanner después de su uso.
        return null;
    }
    public String fcosto(Scanner union) {
        System.out.println("ingresa opcion");
        int opcion = union.nextInt();

        switch (opcion) {
            case 1:
                precioPan = 7.80;
                break;
            case 2:
                precioPan = 7.80;
                break;
            case 3:
                precioPan = 7.80;
                break;
            case 4:
                precioPan = 7.80;
                break;
            case 5:
                precioPan = 7.80;
                break;
            case 6:
                precioPan = 7.80;
                break;
            case 7:
                precioPan = 7.80;
                break;
            case 8:
                precioPan = 7.80;
                break;
            default:
                System.out.println("Opción que selecciono no es valida");
                System.out.println("intente de nuevo");
        }

        System.out.println("¿Cuántos panes  desea comprar?");
        int panes = union.nextInt();
        double totalpan = precioPan * panes;

        System.out.println("El total a pagar es: S/. " + totalpan);
        System.out.println("Gracias por su comprar");
        System.out.println("vuelva pronto");
        fcomprobarDatos();
        return null;
    }
    public String puntosdeventa() {
        Scanner direc = new Scanner(System.in);
        String opcionPV, opcionU;

        System.out.println("PUNTOS DE VENTA");
        System.out.println("Conoce las ubicaciones donde puedes encontrar nuestros productos");
        System.out.println("\uD83D\uDED2Supermercados");
        System.out.println("⛟Bodegas y distribuidores");
        System.out.println("1. Conoce más");
        System.out.println("2. Delivery");
        opcionPV = direc.nextLine();
        switch (opcionPV) {
            case "1":
                System.out.println("Ingrese su ubicación");
                System.out.println("Lima");
                System.out.println("Arequipa");
                System.out.println("Juliaca");
                System.out.println("Huanuco");
                System.out.println("Pucallpa");
                System.out.println("Chimbote");
                System.out.println("Trujillo");
                System.out.println("Piura");
                System.out.println("Jaèn");
                System.out.println("Tarapoto");
                System.out.println("Iquitos");
                opcionU = direc.nextLine();
                switch (opcionU) {
                    case "Lima":
                        System.out.println("Salida | Universidad de la Unión Peruana");
                        System.out.println("Carretera Central Km 19.5 Hermana\n" +
                                "Chosica, Lima");
                        break;
                    case "Arequipa":
                        System.out.println("Av. La Marina 123, Cayma, Arequipa");
                        break;
                    case "Juliaca":
                        System.out.println("Jr. San Román 345, Juliaca, Puno");
                        break;
                    case "Huanuco":
                        System.out.println("Jr. 2 de Mayo 456, Huanuco");
                        break;
                    case "Pucallpa":
                        System.out.println("Av. Centenario 123, Pucallpa, Ucayali");
                        break;
                    case "Chimbote":
                        System.out.println("Av. José Gálvez 345, Chimbote, Ancash");
                        break;
                    case "Trujillo":
                        System.out.println("Jr. Independencia 456, Trujillo, La Libertad");
                        break;
                    case "Piura":
                        System.out.println("Av. Sullana 123, Piura");
                        break;
                    case "Jaèn":
                        System.out.println("Jr. Amazonas 345, Jaèn, Cajamarquilla");
                        break;
                    case "Tarapoto":
                        System.out.println("Av. Tarapoto 456, Tarapoto, San Martín");
                        break;
                    case "Iquitos":
                        System.out.println("Av. La Marina 123, Iquitos, Loreto");
                        break;
                    default:
                        System.out.println("sin ubicacion");

                }
            default:
                System.out.println("opcion no valida");
        }
        return null;
    }
    public String delivery() {
        Scanner union = new Scanner(System.in);
        String opcionEn;
        System.out.println("DELIVERY");
        System.out.println("Visita la tienda virtual y conoce las ofertas\n" +
                "que tenemos para ti");
        System.out.println("¿Deseas ingresar a WEB DELIVERY?");
        System.out.println("SI | NO");
        opcionEn = union.nextLine();
        switch (opcionEn) {
            case "SI":
                System.out.println("\033[38;5;203m");
                System.out.println("Productos disponibles:");
                System.out.println("┌──────────────────────────────────────────────────────────┐");
                System.out.println("│ Nº │ Producto                        │ Precio │ Cantidad │");
                System.out.println("├────┼─────────────────────────────────┼────────┼──────────┤");
                System.out.println("│ 1  | Pionono                         | 19.00  | 7        │");//19
                System.out.println("│ 2  | Cereal Premium                  | 21.50  | 350g     │");//21.50
                System.out.println("│ 3  | Mantequilla de Mani Sachet      | 10.50  | 200g     │");//10.50
                System.out.println("│ 4  | Mant. de Mani 1 Kg.             | 36.00  | 1000g    │");//36
                System.out.println("│ 5  | Mermelada de Uva Frasco         | 8.40   | 1        │");//8.40
                System.out.println("│ 6  | Palitos con Especias            | 2.30   | 65g      │");//+
                System.out.println("│ 7  | Palitos con ajonjoli y linaza   | 2.30   | 65g      │");//+
                System.out.println("│ 8  | Tostada Integral X 10           | 5.30   | 10       │");//P
                System.out.println("│ 9  | Tostada Blanca X 10             | 5.30   | 10       │    ┌──────────────────────────────────────────────────────────┐");//P
                System.out.println("│ 10 | Paneton Diet T/L 500 gr         | 24.40  | 500g     │    │                                                        X │ ");//24.40
                System.out.println("│ 11 | Paneton Integral T/C 900 gr     | 24.00  | 900g     │    │                           AVISO                          │");//24
                System.out.println("│ 12 | Pan pita integral granos andinos| 7.60   | 1        │    │      Días de entrega                  Monto Mínimo       │");//--
                System.out.println("│ 13 | Pan pita semillas chia y linaza | 7.60   | 1        │    │   El día de entrega es          El monto mínimo para las │");//--
                System.out.println("│ 14 | Pan Integral Sandwich           | 8.50   | 1        │    │          jueves                    compras es de S/. 58  │");//8.50
                System.out.println("│ 15 | Pan Integral Mediano Union      | 4.70   | 1        │    │                                       incluye Delivery   │");//4.70
                System.out.println("│ 16 | Pan Blanco Familiar Superbom    | 6.40   | 1        │    │                                                          │");//6.40
                System.out.println("│ 17 | Pan Fuente                      | 9.50   | 1        │    │                           Además                         │");//9.50
                System.out.println("│ 18 | Pan Integral Familiar Superbom  | 6.50   | 1        │    │      Recuerda usar la aplicación para encontrar muchas   │");//6.50
                System.out.println("│ 19 | Mega Galleta Integral de Naranja| 5.10   | 1        │    │      promociones y ofertas                               │");//
                System.out.println("│ 20 | Mega Galleta Integral de Coco   | 5.10   | 1        │    │                                                          │");//
                System.out.println("│ 21 | Mega Galleta de Naranja         | 5.10   | 1        │    │                                                          │");//
                System.out.println("│ 22 | Mega Galleta de Kiwicha         | 5.10   | 1        │    │      App: Tienda Unión                                   │");//
                System.out.println("│ 23 | Mega Galleta de Coco            | 5.10   | 1        │    └──────────────────────────────────────────────────────────┘");//
                System.out.println("└──────────────────────────────────────────────────────────┘    ");//===============16
                op_pdt = union.nextInt();
                this.cobrar();
                break;
            case "NO":
                System.out.println("\033[38;5;226m");
                System.out.println("¡DESCARGA NUESTRA APP!");
                System.out.println("┌─────────────────┐        ┌─────────────────┐");
                System.out.println("│  descargalo en  │        │  DISPONIBLE EN  │");
                System.out.println("│   App STORE     │        │   Google play   │");
                System.out.println("└─────────────────┘        └─────────────────┘");
                break;
            default:
                System.out.println("opcion no valida");
        }
        return null;
    }

    public String cobrar() {
        Scanner union = new Scanner(System.in);
        double cantidad, total = 0;
        System.out.println("cuantos va a querer");
        cantidad = union.nextDouble();
        union.nextLine();
        switch (op_pdt) {
            case 1:
                total=19.00;
                break;
            case 2:
                total = 21.50;
                break;
            case 3:
                total = 10.50;
                break;
            case 4:
                total=36.00;
                break;
            case 5:
                total=8.40;
                break;
            case 6:
                total=2.30;
                break;
            case 7:
                total=2.30;
                break;
            case 8:
                total=5.30;
                break;
            case 9:
                total=5.30;
                break;
            case 10:
                total=24.40;
                break;
            case 11:
                total=24.00;
                break;
            case 12:
                total=7.60;
                break;
            case 13:
                total=7.60;
                break;
            case 14:
                total=8.50;
                break;
            case 15:
                total=4.70;
                break;
            case 16:
                total=6.40;
                break;
            case 17:
                total=9.50;
                break;
            case 18:
                total=6.50;
                break;
            case 19:
                total=5.10;
                break;
            case 20:
                total=5.10;
                break;
            case 21:
                total=5.10;
                break;
            case 22:
                total=5.10;
                break;
            case 23:
                total=5.10;
                break;
            default:
                System.out.println("opcion no valida");
        }
        precioPan=total*cantidad;
        cantidad();
        return null;
    }
    public String cantidad(){
        if (total>=58) {
            precioPan=total+8;
            System.out.println(precioPan);
            //fTipoDePago();
        }
        else if (total<58){
            System.out.println("Todavia no supera el monto mínimo");
            delivery();
        }
        return null;
    }
    public static void main(String[]args){
        compras_union todo= new compras_union();
        todo.fdatos();

    }
}
