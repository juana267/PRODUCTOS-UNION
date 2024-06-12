import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class compras_union {
    private double total = 0, precioPan = 0, tproducto = 0,igv,subtotal=0;
    private String correo, dni,contraseña, correoComp, contraseñaComp, nombre, apellido, opc_variedad;
    private int opcion, cantidad, op_pdt = 0;
    private float peso,talla,rpt_imc;
    Scanner union_m= new Scanner(System.in);
    private static int contador_factura = 0;
    String codigoU,nombre_vende,contra_vende,contra_vende_com;//*
    String numero_factura,opcion_ubicacion;
    private int total_final, pago_inicial;

    public String fdatos() {
        Scanner datos = new Scanner(System.in);
        String  codigoU, dni, opcion;
        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("Si/No");
        opcion=datos.nextLine();
        switch (opcion){
            case "Si":
                System.out.println("Ingrese sus nombres: ");
                nombre=datos.nextLine();
                System.out.println("Ingrese sus apellidos: ");
                apellido=datos.nextLine();
                System.out.println("Ingrese su DNI");
                dni= datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo=datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña=datos.nextLine();
                System.out.println("Ingrese su codigo univercitario univercitario: ");
                codigoU=datos.nextLine();
                break;
            case "No":
                System.out.println("Ingrese sus nombres: ");
                nombre=datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido=datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo=datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña=datos.nextLine();
                break;
        }
        System.out.println("INICIE SESION EN PRODUCTOS UNION");
        System.out.println("INGRESE SU CORREO");
        correoComp=datos.nextLine();
        System.out.println("INGRESE SU COTRASEÑA");
        contraseñaComp=datos.nextLine();
        if(correoComp.equals(correo)&&contraseñaComp.equals(contraseña)){
            System.out.println("BIENVENIDO A PRODUCTOS UNION");
            System.out.println("Sr(a): "+nombre+" "+apellido);
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
                    this.fproductos();
                    break;
                case "PUNTOSDEVENTA":
                    this.puntosdeventa();
                    break;
                case "DELIVERY":
                    this.delivery();
                    break;
                case "ELIJOSERSALUDABLE":
                    this.IMC();
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
    public void fproductos() {
        Scanner union = new Scanner(System.in);
        int opcion;

        boolean salir;
        do {
            System.out.println("\033[96m");
            System.out.println("┌─────────────────────────────────────────────────────────┐");
            System.out.println("│                         PRODUCTOS                       │");
            System.out.println("├──────────────┼──────────────┼──────────────┼────────────┤");
            System.out.println("│     PANES    │  BOLLERIA    │    CEREALES  │  BEBIDAS   │");
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
                        System.out.println("│ 1. Pan Americano     │ 2.  Pan  Blanco    │  3.Pan Fibra  │ 4. Pan multisemillas   │");
                        System.out.println("│       Sandwich       │ Familiar Superbom  │    Integral   │      miel de abeja     │");
                        System.out.println("│        S/7.80        │       S/6.40       │     S/8.90    │         S/9.30         │");
                        System.out.println("├──────────────────────┼────────────────────┼───────────────┼────────────────────────┤");
                        System.out.println("│ 5.  Pan Integral     │ 6. Pan Granos y    │  7.  Pan      │ 8.     Pan Integral    │");
                        System.out.println("│  Familiar Superbom   │      Semillas      │    Fuente     │    Sándwich Clásico    │");
                        System.out.println("│        S/6.50        │       S/8.90       │    S/8.90     │         S/9.30         │");
                        System.out.println("└──────────────────────┴────────────────────┴───────────────┴────────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 7.80;
                                System.out.println("S/7.80 ");
                                System.out.println("Pan Americano  Sandwich");
                                System.out.println("Energético y delicioso pan, elaborado en base");
                                System.out.println("de harina fortificada con hierro y vitaminas del");
                                System.out.println("complejo B. Libre de bromato. Fundamental");
                                System.out.println("para el desarrollo y fortalecimiento de los");
                                System.out.println("músculos, ideal para complementar tus");
                                System.out.println("desayunos. Consumido en las cantidades");
                                System.out.println("adecuadas no altera el peso ideal.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 6.40;
                                System.out.println("S/6.40 ");
                                System.out.println("Pan Blanco Familiar Superbom");
                                System.out.println("Delicioso pan, elaborado en base de harina fortificada");
                                System.out.println("con hierro y vitaminas del complejo B. Libre de bromato,");
                                System.out.println("bajo en grasa saturada y colesterol. El pan es un alimento");
                                System.out.println("fuente de hidratos de carbono complejos, principal fuente ");
                                System.out.println("de energía del organismo. Consumido en las cantidades");
                                System.out.println("adecuadas no altera el peso ideal.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 8.90;
                                System.out.println("S/8.90 ");
                                System.out.println("Pan Fibra Integral");
                                System.out.println("Delicioso y saludable pan, Libre de bromato y colesterol.");
                                System.out.println("Elaborado en base de harina integral fortificada y granos");
                                System.out.println("como la Quinua y la Cañihua. Así mismo, contiene una ");
                                System.out.println("semilla altamente nutritiva y saludable como el ajonjolí.");
                                System.out.println("El pan es alto en Hierro, contiene fuente de fibra");
                                System.out.println(" y fuente de proteínas del organismo.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 9.30;
                                System.out.println("S/9.30 ");
                                System.out.println(" Pan Multisemillas con Avena");
                                System.out.println("Delicioso y saludable pan, libre de bromato. Con una");
                                System.out.println("nutritiva mezcla en base a harina fortificada con hierro y");
                                System.out.println("semillas altamente nutritivas por su valor funcional");
                                System.out.println("para el organismo humano como el girasol, chía y linaza. ");
                                System.out.println("El pan es alto en Hierro, contiene fuente de fibra y ");
                                System.out.println("  fuente de proteínas del organismo.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 5:
                                precio = 6.50;
                                System.out.println("S/6.50 ");
                                System.out.println(" Pan Integral Familiar Superbom");
                                System.out.println("Delicioso pan, elaborado en base de harina integral");
                                System.out.println("fortificada con hierro y vitaminas del complejo B.");
                                System.out.println("El pan es un alimento fuente de hidratos de carbono");
                                System.out.println("complejos, principal fuente de energía del organismo. ");
                                System.out.println(" Consumido en las cantidades adecuadas no altera el peso ideal.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 6:
                                precio = 8.90;
                                System.out.println("S/8.90 ");
                                System.out.println("Pan Granos y Semillas");
                                System.out.println("Pan delicioso y saludable, elaborado a base de harina");
                                System.out.println("fortificada con hierro y vitaminas del complejo B.");
                                System.out.println("Así mismo, contiene semillas altamente nutritivas por");
                                System.out.println("su valor funcional para el organismo humano como el girasol,");
                                System.out.println("ajonjolí y linaza. El pan es alto en Hierro,");
                                System.out.println("contiene fuente de fibra y fuente de proteínas del organismo.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 7:
                                precio = 9.50;
                                System.out.println("S/9.50 ");
                                System.out.println("Pan Fuente");
                                System.out.println("Energético y delicioso pan, elaborado en base ");
                                System.out.println("de harina fortificada con hierro y vitaminas del complejo B.");
                                System.out.println("Libre de bromato, bajo en grasa saturada y colesterol. El pan ");
                                System.out.println("es un alimento fuente de hidratos de carbono complejos, ");
                                System.out.println("principal fuente de energía del organismo. Consumido en");
                                System.out.println("las cantidades adecuadas no altera el peso ideal.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 8:
                                precio = 8.50;
                                System.out.println("S/8.50 ");
                                System.out.println("Pan Integral Sándwich Clásico");
                                System.out.println("Delicioso pan, elaborado en base de harina integral");
                                System.out.println("fortificada con hierro y vitaminas del complejo B. ");
                                System.out.println("Libre de colesterol. El pan integral es un alimento ");
                                System.out.println("fuente de hidratos de carbono complejos, principal ");
                                System.out.println("fuente de fibra del organismo. Consumido en las ");
                                System.out.println("cantidades adecuadas no altera el peso ideal.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 0:
                                salir = true;
                                break;
                            default:
                                System.out.println("\033[93m");
                                System.out.println("Sección no válida. Inténtalo de nuevo.");
                                break;
                        }

                    } while (!salir);
                    break;
                case "BOLLERIA":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌──────────────────────────────────────────────────────────────┐");
                        System.out.println("│                            BOLLERIA                          │");
                        System.out.println("├──────────────────────┼───────────────────────┼───────────────┤");
                        System.out.println("│ 1. Pan pita integral │ 2.  Pan pita semillas │  3.Pre Pizza  │");
                        System.out.println("│      granos andinos  │       chia y linaza   │       Union   │");
                        System.out.println("│          S/7.60      │          S/7.60       │     S/8.90    │");
                        System.out.println("├──────────────────────┼───────────────────────┼───────────────┘");
                        System.out.println("│ 4. Rollo de Canela   │  5.  Pionono x 7      │ ");
                        System.out.println("│        S/11.10       │        S/19.00        │ ");
                        System.out.println("└──────────────────────┴───────────────────────┘ ");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 7.60;
                                System.out.println("S/7.60 ");
                                System.out.println("Delicioso pan pita integral elaborado con semillas ");
                                System.out.println("de linaza, kiwicha y quinua. Bajo en Colesterol.");
                                System.out.println("Contiene Omega 9 y Omega 3.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 7.60;
                                System.out.println("S/7.60 ");
                                System.out.println("Pan pita semillas chia y linaza");
                                System.out.println("Delicioso pan pita elaborado con semillas de chía,");
                                System.out.println("linaza y quinua. Libre de grasas trans y colesterol.");
                                System.out.println("Contiene Omega 9 y Omega 3.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 8.50;
                                System.out.println("S/8.50 ");
                                System.out.println("Pre Pizza Union");
                                System.out.println("Deliciosa masa, elaborada en base de harina fortificada");
                                System.out.println("con hierro y vitaminas del complejo B, y una cobertura");
                                System.out.println(" de pasta de tomate. Libre de bromato, grasas trans y colesterol. ");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 11.10;
                                System.out.println("S/11.10 ");
                                System.out.println(" Rollo de Canela");
                                System.out.println("Delicioso pan relleno de una mezcla de maní y canela ");
                                System.out.println("molida. Elaborado en base a harina fortificada con hierro ");
                                System.out.println("y vitaminas del complejo B. Libre de bromato. Este producto es ");
                                System.out.println("un alimento fuente de hidratos de carbono complejos, principal");
                                System.out.println("fuente de energíafuente de proteínas del organismo. del organismo.");
                                System.out.println("Consumido en las cantidades adecuadas no altera el peso ideal.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 5:
                                precio = 19.00;
                                System.out.println("S/ 19.00 ");
                                System.out.println("Pionono x 7");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panes va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;

                            case 0:
                                salir = true;
                                break;
                            default:
                                System.out.println("\033[93m");
                                System.out.println("Sección no válida. Inténtalo de nuevo.");
                                break;
                        }

                    } while (!salir);
                    break;
                case "CEREALES":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌──────────────────────────────────────────────────────────────────┐");
                        System.out.println("│                          CEREALES                                │");
                        System.out.println("├──────────────────────┼────────────────────┼──────────────────────┤");
                        System.out.println("│ 1. Cereal Premium    │ 2.   Germen de     │  3.  Granola  con    │");
                        System.out.println("│        x 350 g       │        Trigo       │     Granos Andinos   │");
                        System.out.println("│       S/21.50        │       S/9.99       │         S/14.50      │");
                        System.out.println("├──────────────────────┼────────────────────┼──────────────────────┤");
                        System.out.println("│ 4.  Granola con      │ 5.Granola Lonchera │  6.    Salvado       │");
                        System.out.println("│  Pasas y Almendras   │      x 400 gr.     │       de Trigo       │");
                        System.out.println("│        S/15.20       │       S/13.30      │        S/5.99        │");
                        System.out.println("└──────────────────────┴────────────────────┴──────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 21.50;
                                System.out.println("S/21.50 ");
                                System.out.println("Cereal Premium x 350 g");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos cereales va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 9.99;
                                System.out.println("S/9.99 ");
                                System.out.println("Germen de Trigo");
                                System.out.println("El Germen de trigo es rico en fibra insoluble ideal para el ");
                                System.out.println("control de la glucosa en sangre, reducción del colesterol y ");
                                System.out.println("protección del corazón. Así también para promover el movimiento ");
                                System.out.println("intestinal, protección del cáncer de colon y control del peso ideal.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos cereales va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 14.50;
                                System.out.println("S/ 14.50 ");
                                System.out.println("Granola con Granos Andinos");
                                System.out.println("Energético y delicioso preparado, elaborado a base  ");
                                System.out.println("de una mezcla de frutos secos, semillas y cereales ");
                                System.out.println("altamente nutritivos. Contiene ajonjolí, linaza, maní,");
                                System.out.println("almendras, quinua y kañihua. Fortificada con Zinc y Magnesio.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos cereales va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 15.20;
                                System.out.println("S/15.20 ");
                                System.out.println("Granola con Pasas y Almendras");
                                System.out.println("Energético y delicioso preparado, elaborado a base de ");
                                System.out.println("una mezcla de cereales y frutos secos nutritivos. Contiene  ");
                                System.out.println("hojuelas de avena, ajonjolí, pasas y almendras. Fortificada ");
                                System.out.println("con Zinc y Magnesio. Fuente de Fibra.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos cereales va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 5:
                                precio = 13.30;
                                System.out.println("S/13.30 ");
                                System.out.println("Granola Lonchera x 400 gr.");
                                System.out.println("Energético y delicioso preparado, elaborado a base ");
                                System.out.println("Energético y delicioso preparado, elaborado a base ");
                                System.out.println("Contiene hojuelas de avena, maní, ajonjolí y miel de abeja. ");
                                System.out.println("Fortificada con Zinc y Magnesio. Fuente de Fibra y de proteínas.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos cereales va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 6:
                                precio = 5.99;
                                System.out.println("S/5.99");
                                System.out.println("Salvado de Trigo");
                                System.out.println("El Salvado de trigo es rico en fibra insoluble ideal");
                                System.out.println("para el control de la glucosa en sangre, reducción");
                                System.out.println("del colesterol y protección del corazón. Así también ");
                                System.out.println("para promover el movimiento intestinal, protección ");
                                System.out.println("del cáncer de colon y control del peso ideal.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos cereales va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                        }

                    } while (!salir);
                    break;
                case "BEBIDAS":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌──────────────────────────────────────────────────────────────────┐");
                        System.out.println("│                          BEBIDAS                                 │");
                        System.out.println("├──────────────────────┼────────────────────┼──────────────────────┤");
                        System.out.println("│ 1. Bebida con pulpa  │ 2.Bebida con pulpa │  3. Bebida con pulpa │");
                        System.out.println("│   de durazno 475 ml  │   de mango 475 ml  │    de manzana 475 ml │");
                        System.out.println("│        S/5.50        │       S/5.50       │          S/5.50      │");
                        System.out.println("├──────────────────────┼────────────────────┼──────────────────────┤");
                        System.out.println("│ 4. Bebida con pulpa  │ 5.    Duo Pack     │  6.    Zumo de       │");
                        System.out.println("│    de piña 475 ml    │        D Vine      │       Uva 295 ml     │");
                        System.out.println("│        S/5.50        │       S/73.50      │        S/7.20        │");
                        System.out.println("└──────────────────────┴────────────────────┴──────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 5.50;
                                System.out.println("S/5.50");
                                System.out.println("Bebida con pulpa de durazno 475 ml");
                                System.out.println("Bebida refrescante e hidratante, elaborada con seleccionada  ");
                                System.out.println("y deliciosa pulpa de Durazno de 475 ml. Así mismo, ");
                                System.out.println("esta bebida contiene ingredientes saludables los cuales  ");
                                System.out.println("nos brindan vitaminas, minerales y fibra prebiótica.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos bebidas  va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 5.50;
                                System.out.println("S/5.50");
                                System.out.println("Bebida con pulpa de mango 475 ml");
                                System.out.println("Bebida refrescante e hidratante, elaborada con seleccionada y ");
                                System.out.println("deliciosa pulpa de Mango de 475 ml. Así mismo,esta bebida ");
                                System.out.println("contiene ingredientes saludables los cuales nos brindan  ");
                                System.out.println("vitaminas, minerales y fibra prebiótica.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos bebidas  va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 5.50;
                                System.out.println("S/5.50");
                                System.out.println("Bebida con pulpa de manzana 475 ml");
                                System.out.println("Bebida refrescante e hidratante, elaborada con seleccionada y ");
                                System.out.println("deliciosa pulpa de Manzana de 475 ml. Así mismo, esta bebida ");
                                System.out.println("contiene ingredientes saludables los cuales nos brindan ");
                                System.out.println("vitaminas, minerales y fibra prebiótica.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos bebidas  va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 5.50;
                                System.out.println("S/5.50");
                                System.out.println("Bebida con pulpa de piña 475 ml");
                                System.out.println("Bebida refrescante e hidratante, elaborada con seleccionada y  ");
                                System.out.println("deliciosa pulpa de piña de 475 ml. Así mismo, esta bebida contiene ");
                                System.out.println("ingredientes saludables los cuales nos brindan vitaminas, minerales  ");
                                System.out.println("y fibra prebiótica.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos bebidas  va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 5:
                                precio = 73.50;
                                System.out.println("S/73.50");
                                System.out.println("Duo Pack D Vine");
                                System.out.println("La uva borgoña posee propiedades nutricionales valiosas  ");
                                System.out.println("por su contenido de fitoquímicos o fitoprotectores, como");
                                System.out.println("lo son los antioxidantes. En este caso nos brinda polifenoles, ");
                                System.out.println("ideales para prevenir el cáncer y fortalecer el sistema inmunológico.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos bebidas  va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 6:
                                precio = 7.20;
                                System.out.println("S/7.20");
                                System.out.println("Zumo de Uva 295 ml");
                                System.out.println("Delicioso zumo, concentrado de uva borgoña. Contiene antioxidantes");
                                System.out.println("que contribuye con el fortalecimiento del sistema inmunológico.");
                                System.out.println("Libre de azúcar agregada, así también de colorantes y saborizantes artificiales. ");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos bebidas  va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                        }

                    } while (!salir);
                    break;
                case "GALLETAS":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌──────────────────────────────────────────────────────────────────┐");
                        System.out.println("│                          GALLETAS                                │");
                        System.out.println("├──────────────────────┼────────────────────┼──────────────────────┤");
                        System.out.println("│ 1. Galleta Lonchera  │ 2.Galleta Lonchera │  3. Galleta Lonchera │");
                        System.out.println("│    de Coco x 42 gr   │ de Kiwicha x 42 gr │   de Naranja x 42 gr │");
                        System.out.println("│        S/2.50        │       S/2.50       │          S/2.50      │");
                        System.out.println("├──────────────────────┼────────────────────┼──────────────────────┤");
                        System.out.println("│ 4.   Mega Galleta    │ 5. Mega Galleta    │  6.   Mega Galleta   │");
                        System.out.println("│       de Kiwicha     │     de Naranja     │   Integral de Coco   │");
                        System.out.println("│        S/5.10        │        S/5.10      │         S/5.10       │");
                        System.out.println("└──────────────────────┴────────────────────┴──────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 2.50;
                                System.out.println("S/2.50");
                                System.out.println("Galleta Lonchera de Coco x 42 gr");
                                System.out.println("Energética y deliciosa galleta, elaborada en base a  ");
                                System.out.println("la mezcla de harina especial fortificada con hierro y ");
                                System.out.println("vitaminas del complejo B y coco rallado.");
                                System.out.println("Libre de colorantes artificiales");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos galletas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 2.50;
                                System.out.println("S/2.50");
                                System.out.println("Galleta Lonchera de Kiwicha x 42 gr");
                                System.out.println("Energética y deliciosa galleta, elaborada en base  ");
                                System.out.println("a la mezcla de harina integral de Kiwicha especial fortificada con hierro. ");
                                System.out.println("Libre de colorantes artificiales");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos galletas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 2.50;
                                System.out.println("S/2.50");
                                System.out.println("Galleta Lonchera de Naranja x 42 gr");
                                System.out.println("Deliciosa galleta sabor a Naranja, elaborada con ");
                                System.out.println("harina especial fortificada con hierro y vitaminas   ");
                                System.out.println("del complejo B. Deliciosa al paladar por su textura y sabor tradicional.  ");
                                System.out.println("Libre de colorantes artificiales");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos galletas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 5.10;
                                System.out.println("S/5.10");
                                System.out.println("Mega Galleta de Kiwicha");
                                System.out.println("Energética y deliciosa galleta, elaborada en base a la mezcla de ");
                                System.out.println(" harina integral de Kiwicha especial fortificada con hierro.");
                                System.out.println("Libre de colorantes artificiales");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos galletas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 5:
                                precio = 5.10;
                                System.out.println("S/5.10");
                                System.out.println("Mega Galleta de Naranja");
                                System.out.println("Energética y deliciosa galleta, elaborada en base a la mezcla ");
                                System.out.println("de Deliciosa galleta sabor a Naranja, elaborada con harina ");
                                System.out.println("especial fortificada con hierro y vitaminas del complejo B. ");
                                System.out.println("Deliciosa al paladar por su textura y sabor tradicional.");
                                System.out.println("Libre de colorantes artificiales");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos galletas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 6:
                                precio = 5.10;
                                System.out.println("S/5.10");
                                System.out.println("Mega Galleta Integral de Coco");
                                System.out.println("Energética y deliciosa galleta, elaborada en base a la mezcla  ");
                                System.out.println(" de harina integral especial fortificada con hierro y vitaminas");
                                System.out.println("del complejo B y coco rallado.");
                                System.out.println("Libre de colorantes artificiales");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos galletas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                        }

                    } while (!salir);
                    break;
                case "SNACK":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌─────────────────────────────────────────────────────┐");
                        System.out.println("│                   SNACK                             │");
                        System.out.println("├───────────────────────────┼─────────────────────────┤");
                        System.out.println("│ 1.  Palitos con ajonjoli  │ 2.Palitos con Especias  │");
                        System.out.println("│        y linaza 65 g      │          x 65 gr        │");
                        System.out.println("│           S/2.30          │          S/2.30         │");
                        System.out.println("├───────────────────────────┼─────────────────────────┤");
                        System.out.println("│ 3.   Tostada Blanca X 10  │ 4.Tostada Integral X 10 │");
                        System.out.println("│          S/5.30           │        S/5.30           │");
                        System.out.println("└───────────────────────────┴─────────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 2.30;
                                System.out.println("S/2.30");
                                System.out.println("Palitos con ajonjoli y linaza 65 g");
                                System.out.println("Estos deliciosos palitos, están elaborados en base a ");
                                System.out.println("harina fortificada con hierro. Libre de bromato y colesterol. ");
                                System.out.println(" Este producto es un alimento fuente de hidratos de carbono ");
                                System.out.println("complejos, principal fuente de energía del organismo. Contiene Omega 9, 6 y 3.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos Palitos con ajonjoli y linaza va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 2.30;
                                System.out.println("S/2.30");
                                System.out.println("Palitos con Especias x 65 gr");
                                System.out.println("Estos deliciosos palitos con ajonjolí, chía, kión y ajo, están");
                                System.out.println("elaborados en base a harina fortificada con hierro y vitaminas B12.");
                                System.out.println("Libre de bromato y colesterol. Este producto es un alimento fuente ");
                                System.out.println("de hidratos de carbono complejos, principal fuente de energía del ");
                                System.out.println("organismo. Contiene Omega 9, 6 y 3.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos Palitos con Especias x 65 gr va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 5.30;
                                System.out.println("S/5.30");
                                System.out.println("Tostada Blanca X 10");
                                System.out.println("Deliciosas y clásicas tostadas, elaboradas en base a harina fortificada ");
                                System.out.println("con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa ");
                                System.out.println("saturada y libre de colesterol. Las tostadas son fuente de hidratos de ");
                                System.out.println("carbono complejos, principal fuente de energía del organismo. Consumido ");
                                System.out.println("en las cantidades adecuadas no altera el peso ideal.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos Tostadas Blancas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 5.30;
                                System.out.println("S/5.30");
                                System.out.println("Tostada Integral X 10");
                                System.out.println("Deliciosas y clásicas tostadas, elaboradas en base a harina integral fortificada ");
                                System.out.println(" con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa saturada y ");
                                System.out.println("libre de colesterol. Las tostadas son fuente de hidratos de carbono complejos,");
                                System.out.println(" principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos Palitos con ajonjoli y linaza va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                        }

                    } while (!salir);
                    break;
                case "UNTABLES":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌─────────────────────────────────────────────────────┐");
                        System.out.println("│                     UNTABLES                        │");
                        System.out.println("├───────────────────────────┼─────────────────────────┤");
                        System.out.println("│ 1.  Mant. de Mani 1 Kg.   │2.Mermelada de Uva Frasco│");
                        System.out.println("│          S/36.00          │          S/8.40         │");
                        System.out.println("├───────────────────────────┼─────────────────────────┤");
                        System.out.println("│ 3. Mantequilla de Mani    │ 4.Mant. de Mani Frasco  │");
                        System.out.println("│       Sachet 200 gr       │         410 gr.         │");
                        System.out.println("│          S/10.50          │        S/19.90          │");
                        System.out.println("└───────────────────────────┴─────────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 36.00;
                                System.out.println("S/36.00");
                                System.out.println("Mant. de Mani 1 Kg.");
                                System.out.println("Elaborado en base a puro maní, fruto seco rico en proteínas.  ");
                                System.out.println("Dos cucharas de este producto aportan el 10% del requerimiento  ");
                                System.out.println("diario de este nutriente. Contiene Omega 6 y 9.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántas Mantequillas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 8.40;
                                System.out.println("S/8.40");
                                System.out.println("Mermelada de Uva Frasco");
                                System.out.println("Fuente de antioxidantes, mermelada clásica. Fuente de energía. ");
                                System.out.println("Elaborado con uva borgoña.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos frascos de Mermelada va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 10.50;
                                System.out.println("S/10.50");
                                System.out.println("Mantequilla de Mani Sachet 200 gr.");
                                System.out.println("Elaborado en base a puro maní, fruto seco rico en proteínas. Dos ");
                                System.out.println("cucharas de este producto aportan el 10% del requerimiento diario . ");
                                System.out.println("de este nutriente. Contiene Omega 6 y 9. ");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántas Mantequillas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 19.90;
                                System.out.println("S/19.90");
                                System.out.println("Mant. de Mani Frasco 410 gr.");
                                System.out.println("Deliciosas y clásicas tostadas, elaboradas en base a harina integral fortificada ");
                                System.out.println(" con hierro y vitaminas del complejo B. Libre de bromato, bajo en grasa saturada y ");
                                System.out.println("libre de colesterol. Las tostadas son fuente de hidratos de carbono complejos,");
                                System.out.println(" principal fuente de energía del organismo. Consumido en las cantidades adecuadas no altera el peso ideal.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántas Mantequillas va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                        }

                    } while (!salir);
                    break;
                case "PANETONES":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌────────────────────────────────────────────────────────────────────┐");
                        System.out.println("│                            BOLLERIA                                │");
                        System.out.println("├──────────────────────┼────────────────────────┼────────────────────┤");
                        System.out.println("│ 1. Paneton Diet T/L  │  2.Paneton Integral    │ 3.Paneton Integral │");
                        System.out.println("│          500 gr      │       T/B 900 g        │      T/C 900 gr    │");
                        System.out.println("│         S/24.40      │        S/23.00         │       S/24.00      │");
                        System.out.println("├──────────────────────┼────────────────────────┼────────────────────┘");
                        System.out.println("│ 4.  Paneton Union    │  5.Paneton Vita Rey    │ ");
                        System.out.println("│        T/L 1kg       │con Arádanos T/C 900 gr │ ");
                        System.out.println("│        S/32.40       │        S/26.00         │ ");
                        System.out.println("└──────────────────────┴────────────────────────┘ ");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        double precio = 0;
                        switch (opcion) {
                            case 1:
                                precio = 24.40;
                                System.out.println("S/24.40");
                                System.out.println(" Paneton Diet T/L 500 gr");
                                System.out.println("Deliciosa y nutritiva receta elaborada a partir de la selección ");
                                System.out.println("de los mejores ingredientes, como harina integral fortificada con ");
                                System.out.println("nutrientes a la cual se adiciona higos deshidratados y pecanas. ");
                                System.out.println("Atractivo al paladar por su miga suave y crujientes, frescas pecanas. ");
                                System.out.println("Contiene Omega 9. Fuente de proteínas, libre de colorantes artificiales.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panetones va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 2:
                                precio = 23.00;
                                System.out.println("S/23.00 ");
                                System.out.println("Paneton Integral T/B 900 g");
                                System.out.println("Deliciosa y nutritiva receta elaborada a partir de la ");
                                System.out.println("selección de los mejores ingredientes, como harina integral");
                                System.out.println(" fortificada con nutrientes a la cual se adiciona pasas y ");
                                System.out.println("castañas. Atractivo al paladar por su miga suave y crujientes ");
                                System.out.println("frescas castañas. Fortificado con Hierro, contiene fuente de ");
                                System.out.println("fibra y fuente de proteínas. Contiene Omega 6 y 9.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panetones va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 3:
                                precio = 24.00;
                                System.out.println("S/24.00 ");
                                System.out.println("Paneton Integral T/C 900 gr");
                                System.out.println("Deliciosa y nutritiva receta elaborada a partir de la selección ");
                                System.out.println("de los mejores ingredientes, como harina integral fortificada con ");
                                System.out.println(" nutrientes a la cual se adiciona pasas y castañas. Atractivo al ");
                                System.out.println("paladar por su miga suave y crujientes frescas castañas. Fortificado ");
                                System.out.println("con Hierro, contiene fuente de fibra y fuente de proteínas. Contiene Omega 6 y 9. ");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panetones va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 4:
                                precio = 32.40;
                                System.out.println("S/32.40 ");
                                System.out.println(" Paneton Union T/L 1kg");
                                System.out.println("Receta tradicional elaborada a partir de la selección de los mejores");
                                System.out.println(" ingredientes, como harina fortificada con nutrientes a la cual se ");
                                System.out.println("adiciona pasas, frutas confitadas y almendras. Atractivo al paladar  ");
                                System.out.println("por su característica miga suave y fresca.");

                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panetones va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;
                            case 5:
                                precio = 26.00;
                                System.out.println("S/ 26.00 ");
                                System.out.println(" Paneton Vita Rey con Arádanos T/C 900 gr");
                                System.out.println("Deliciosa y nutritiva receta elaborada a partir de la selección de los ");
                                System.out.println("mejores ingredientes, como harina integral fortificada con nutrientes a ");
                                System.out.println("la cual se adiciona arándanos deshidratados y castañas. Atractivo al ");
                                System.out.println("paladar por su miga suave y crujientes, frescas Castañas.");
                                do {
                                    System.out.println("Seleccione una opción");
                                    System.out.println("1. AÑADIR A CARRITO");
                                    System.out.println("2. salir");
                                    opcion = union.nextInt();
                                    union.nextLine();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("¿Cuántos panetones va comprar?");
                                            int cantidad = union.nextInt();
                                            double total = precio * cantidad;
                                            System.out.println("El total a pagar es: S/. " + total);
                                            System.out.println("vaya a caja a pagar");
                                            fTipoDePago();
                                            break;
                                        case 2:
                                            salir = true;
                                            System.out.println("vuelva pronto");
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }

                                }while (!salir);
                                break;

                            case 0:
                                salir = true;
                                break;
                            default:
                                System.out.println("\033[93m");
                                System.out.println("Sección no válida. Inténtalo de nuevo.");
                                break;
                        }

                    } while (!salir);
                    break;
            }

        } while (!salir);
        union.close(); // Importante cerrar el scanner después de su uso.
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
                        System.out.println("Carretera Salida a Arequipa Km. 6 Chullunquiani,\n" +
                                " Av. Héroes de la Guerra del Pacífico");
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
        int opcion;
        System.out.println("DELIVERY");
        System.out.println("Visita la tienda virtual y conoce las ofertas\n" +
                "que tenemos para ti");
        System.out.println("¿Deseas ingresar a WEB DELIVERY?");
        System.out.println("SI | NO");
        String respuesta = union.nextLine();
        switch (respuesta) {
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
                System.out.println("selecione opcion");
                opcion = union.nextInt();
                double precio = 0;
                switch (opcion) {
                    case 1:
                        precio = 19.00;
                        break;
                    case 2:
                        precio = 21.50;
                        break;
                    case 3:
                        precio = 10.50;
                        break;
                    case 4:
                        precio = 36.00;
                        break;
                    case 5:
                        precio = 8.40;
                        break;
                    case 6:
                        precio = 2.30;
                        break;
                    case 7:
                        precio = 2.30;
                        break;
                    case 8:
                        precio = 5.30;
                        break;
                    case 9:
                        precio = 5.30;
                        break;
                    case 10:
                        precio = 24.40;
                        break;
                    case 11:
                        precio = 24.00;
                        break;
                    case 12:
                        precio = 7.60;
                        break;
                    case 13:
                        precio = 7.60;
                        break;
                    case 14:
                        precio = 8.50;
                        break;
                    case 15:
                        precio = 4.70;
                        break;
                    case 16:
                        precio = 6.40;
                        break;
                    case 17:
                        precio = 9.50;
                        break;
                    case 18:
                        precio = 6.50;
                        break;
                    case 19:
                        precio = 5.10;
                        break;
                    case 20:
                        precio = 5.10;
                        break;
                    case 21:
                        precio = 5.10;
                        break;
                    case 22:
                        precio = 5.10;
                        break;
                    case 23:
                        precio = 5.10;
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
                System.out.println("¿Cuántos desea comprar?");
                int cantidad = union.nextInt();
                double subtotal = precio * cantidad;
                System.out.println("El total a pagar es: S/. " + subtotal);
                if (subtotal >= 58.00) {
                    System.out.println(" se le sumara S/. 8.00 soles por el delivery");
                    double total = subtotal + 8;
                    System.out.println("El monto total a pagar es: S/. " + total);
                    System.out.println("vaya a caja a pagar");
                    fTipoDePago();
                } else if (subtotal <= 58) {
                    System.out.println("Todavia no supera el monto mínimo");
                    this.delivery();
                }

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

    public void IMC(){
        Scanner imc =new Scanner(System.in);
        System.out.println("\033[38;5;226m----------BIENVENIDO ESTAS SON LAS RECOMENDACIONES DE UNIÓN----------");
        System.out.println("Por favor ingrese su peso en Kg. por favor: ");
        peso=imc.nextFloat();
        System.out.println("Por favor ingrese su talla en metros. por favor: ");
        talla=imc.nextFloat();
        rpt_imc=peso/(talla*talla);
        if (rpt_imc<18.5){
            System.out.println("Ud. cuenta con bajo peso con un peso de: " +rpt_imc+ " 👀");
            System.out.println("Unión recomienda los siguientes productos: ");
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│ Producto                        │ Informe Nutricional recomendaciones nutricional  │");
            System.out.println("├─────────────────────────────────┼──────────────────────────────────────────────────┤");
            System.out.println("│ Mega Galleta de Coco            |    Producto saludable contra la anemia           │");
            System.out.println("│ Mega Galleta de Kiwicha         |    Producto saludable contra la anemia           │");
            System.out.println("│ Mega Galleta de Naranja         |    Producto saludable contra la anemia           │");
            System.out.println("│ Mega Galleta Integral de Coco   |    Producto saludable contra la anemia           │");
            System.out.println("│ Mega Galleta Integral de Naranja|    Producto saludable contra la anemia           │");
            System.out.println("│ Mega Galleta Integral de Coco   |    Producto saludable contra la anemia           │");
            System.out.println("│ Palitos con Especias            |    Producto saludable contra la anemia           │");
            System.out.println("│ Palitos con ajonjoli y linaza   |    Producto saludable contra la anemia           │");
            System.out.println("│ Paneton Integral T/C 900 gr     |    Producto saludable contra la anemia           │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println(" ----------------------------AQUI LOS PUEDES COMPRAR:--------------------------------");
            this.fproductos();
        }
        else if (rpt_imc>=18.5&&rpt_imc<=24.9) {
            System.out.println("Ud. cuenta con peso normal con un peso de: " +rpt_imc);
            System.out.println("Unión recomienda los siguientes productos: ");
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│ Producto                     │ Informe Nutricional recomendaciones nutricional         │");
            System.out.println("├──────────────────────────────┼─────────────────────────────────────────────────────────┤");
            System.out.println("│ Palitos con Especias         |Producto veganos con ingesta de hierro y vitamina de b12.│");
            System.out.println("│ Palitos con ajonjoli y linaza|Producto veganos con ingesta de hierro y vitamina de b12.│");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println(" --------------------------------AQUI LOS PUEDES COMPRAR:--------------------------------");
            this.fproductos();
        }
        else if (rpt_imc>=25&&rpt_imc<=29.9) {
            System.out.println("Ud. cuenta con exceso de depeso con un peso de: " +rpt_imc);
            System.out.println("Unión recomienda los siguientes productos: ");
            System.out.println("┌─────────────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│ Producto                    │ Informe Nutricional recomendaciones nutricional       │");
            System.out.println("├─────────────────────────────┼───────────────────────────────────────────────────────┤");
            System.out.println("│Palitos con Especias         |  Producto que considera los antioxidantes             │");
            System.out.println("│Palitos con ajonjoli y linaza|  Producto que considera los antioxidantes             │");
            System.out.println("└─────────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println(" ----------------------------AQUI LOS PUEDES COMPRAR:--------------------------------");
            this.fproductos();
        }
        else if (rpt_imc>=30&&rpt_imc<=34.9) {
            System.out.println("Ud. esta obeso o ebesa con un peso de: " +rpt_imc);
            System.out.println("Unión recomienda los siguientes productos: ");
            System.out.println("┌─────────────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│ Producto                    │ Informe Nutricional recomendaciones nutricional       │");
            System.out.println("├─────────────────────────────┼───────────────────────────────────────────────────────┤");
            System.out.println("│Paneton Integral T/C 900 gr  |  Variedad de producto sin azucar añadida              │");
            System.out.println("│Paneton Diet T/L 500 gr      |  Variedad de producto sin azucar añadida              │");
            System.out.println("└─────────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println(" -----------------------------AQUI LOS PUEDES COMPRAR:--------------------------------");
            this.fproductos();
        }
        else if  (rpt_imc>35&&rpt_imc<=100){
            System.out.println("Ud. es un obeso/a extremo/a con un peso de: " +rpt_imc);
            System.out.println("Unión recomienda los siguientes productos: ");
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│ Producto                        │ Informe Nutricional recomendaciones nutricional  │");
            System.out.println("├─────────────────────────────────┼──────────────────────────────────────────────────┤");
            System.out.println("│ Mega Galleta de Coco            |  Producto sin presencia de octógonos de alerta   │");
            System.out.println("│ Mega Galleta de Kiwicha         |  Producto sin presencia de octógonos de alerta   │");
            System.out.println("│ Mermelada de Uva Frasco         |  Producto sin presencia de octógonos de alerta   │");
            System.out.println("│ Mantequilla de Mani Sachet      |  Producto sin presencia de octógonos de alerta   │");
            System.out.println("│ Tostada Integral X 10           |  Producto sin presencia de octógonos de alerta   │");
            System.out.println("│ Tostada Blanca X 10             |  Producto sin presencia de octógonos de alerta   │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println(" -----------------------------AQUI LOS PUEDES COMPRAR:--------------------------------");
            this.fproductos();
        }
    }

    private String fTipoDePago() {
        Scanner tpago = new Scanner(System.in);
        int opcion;

        System.out.println("ingrese el tipo de pago?");
        System.out.println("1: tarjeta");
        System.out.println("2: efectivo");
        opcion=tpago.nextInt();
        switch (opcion){
            case 1:
                this.ftarjeta();
                break;
            case 2:
                this.fefectivo();
        }
        return  null;
    }

    public String ftarjeta() {
        Scanner tar= new Scanner(System.in);
        int tarjeta, fechacaducidad, cvv;
        System.out.println("ingrese el nombre completo del titular de la tarjeta");
        String titulartarjeta=tar.nextLine();
        System.out.println("ingrese el numero de tarjeta");
        tarjeta=tar.nextInt();
        System.out.println("ingrese la fecha de caducidad de la tarjeta");
        fechacaducidad=tar.nextInt();
        System.out.println("ingrese el CVV");
        cvv=tar.nextInt();
        System.out.println("pago realizado exitosamente con su tarjeta");
        System.out.println("PRODUCTOS UNION");
        return null;
    }

    public String fefectivo() {
        Scanner efect = new Scanner(System.in);
        double costo, totalPagado;
        System.out.println("Ingrese el costo:");
        costo = efect.nextDouble();
        System.out.println("El monto a pagar es de: " + costo);
        System.out.println("Ingrese el pago de los productos:");
        totalPagado = efect.nextDouble();
        while (totalPagado < costo) {
            System.out.println("Monto insuficiente. Faltan " + (costo - totalPagado) + " para completar el pago.");
            System.out.println("Ingrese el monto adicional que va a pagar:");
            double pagoAdicional = efect.nextDouble();
            if (pagoAdicional <= 0) {
                System.out.println("Ingrese un monto válido, por favor. No puede consumir los productos gratis.");
            } else {
                totalPagado += pagoAdicional;
            }
        }
        if (totalPagado > costo) {
            double vuelto = totalPagado - costo;
            System.out.println("Pago recibido. Su vuelto es de: " + vuelto);
        } else {
            System.out.println("Pago completado. Gracias por su compra.");
        }
        return null;
    }
    public void calculando(){ //ojo con este codigo falta completar
        double total_pagar, sub_total,costo = 0;
        System.out.println("ingrese la cantidad: ");
        cantidad=union_m.nextInt();

        igv= (cantidad*costo)*0.18;
        sub_total=(cantidad*costo)-igv;
        total_pagar = sub_total + igv;

        System.out.println("SUBTOTAL " + sub_total);
        System.out.println("IGV " + igv);
        System.out.println("TOTAL A PAGAR " + total_pagar);

    }
    public void función_de_impresion_de_cobro(){
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        do {
            System.out.println("Ingrese nombre del vendedor: ");
            nombre_vende = union_m.nextLine();
            System.out.println("Ingrese nsu contraseña: ");
            contra_vende = union_m.nextLine();
            System.out.println("--------INICIANDO SESIÓN--------");
            System.out.println("Ingrese nuevamente su contraseña: ");
            contra_vende_com = union_m.nextLine();
            if (contra_vende_com.equals(contra_vende)) {
                System.out.println("Bienvenido a PRODUCTOS UNION"+" Srta.:  "+nombre_vende+" 🌟 ");
                System.out.println("Seleccione si desea boleta o factura :");
                System.out.println("1. PARA BOLETA");
                System.out.println("2. PARA FACTURA");
                System.out.println("0. PARA SALIR");
                opcion = union_m.nextInt();
                union_m.nextLine();
                switch (opcion) {
                    case 1:
                        numero_factura= "BROE - 00000" + (++contador_factura);
                        System.out.println("\033[38;5;226m|--------------------------------------------------------------|");
                        System.out.println("|---------------------------- UNIÓN ---------------------------|");
                        System.out.println("|-------------------- Saludable por naturaleza ----------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|");
                        System.out.println("|--------- Centro de prod. de Bienes  Productos union ---------|");
                        System.out.println("|---------------- C. central Km. 19 Villa union ---------------|");
                        System.out.println("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|");
                        System.out.println("|------------------ Telef. 618-6309 - 618-6310 ----------------|");
                        System.out.println("|------------------------ RUC 20138122256 ---------------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|===================== BOLETA ELECTRONICA =====================|");
                        System.out.println("|=-- Numero: -----------------------------------  "+numero_factura+"|");
                        System.out.println("|=-- Cliente: -----------------  "+nombre+" "+apellido+"|");
                        System.out.println("|=-- Doc. ident: ------------------------------  "+dni+"|");
                        System.out.println("|=-- Fecha: ------------------  "+ fechaActual+"   "+horaActual+"|");
                        System.out.println("|=-- Dirección: ------------------- -----"+opcion_ubicacion+"|");
                        System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                        System.out.println("|N°|CANTIDAD|  |ARTICULO|                         |MONTO|      |");
                        System.out.println("|=== Op. Gratuitas: ============================== S/.         |");
                        System.out.println("|=== Op. Exoneradas: ============================= S/.         |");
                        System.out.println("|=== Op. Gravadas: =============================== S/.         |");
                        System.out.println("|=== Total de descuento: ========================= S/.         |");
                        System.out.println("|=== Sub-Total: ================================== S/.         |");
                        System.out.println("|=== IGV: ======================================== S/."+igv+"|");
                        System.out.println("|=== ICBPER: ===================================== S/.         |");
                        System.out.println("|=== Importe total: ============================== S/."+total_final+" |");
                        System.out.println("|=== Detracción: ================================= S/.     0.00|");
                        System.out.println("|=== Importe neto: =============================== S/."+total_final+" |");
                        System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                        System.out.println("|==============================================================|");
                        System.out.println("|=== Medio de Pago: ==============================          |");
                        System.out.println("|=== Vendedor(a) :================================  "+nombre_vende+"    |");
                        System.out.println("|==============================================================|");
                        System.out.println("|==== Representación Impresa de documento, el cual puede ser ==|");
                        System.out.println("|==========  descargado de la pagina WWW.upeu.pe   ============|");
                        System.out.println("|==============================================================|");
                        System.out.println("|==============================================================|");
                        break;
                    case 2:
                        System.out.println("\u001B[36m|--------------------------------------------------------------|");
                        System.out.println("|---------------------------- UNIÓN ---------------------------|");
                        System.out.println("|-------------------- Saludable por naturaleza ----------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|");
                        System.out.println("|--------- Centro de prod. de Bienes  Productos union ---------|");
                        System.out.println("|---------------- C. central Km. 19 Villa union ---------------|");
                        System.out.println("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|");
                        System.out.println("|------------------ Telef. 618-6309 - 618-6310 ----------------|");
                        System.out.println("|------------------------ RUC 20138122256 ---------------------|");
                        System.out.println("|--------------------------------------------------------------|");
                        System.out.println("|======================= FACTURA DE UNIÓN =====================|");
                        System.out.println("|=-- Facturado a Cliente: "+nombre+" "+apellido+"-----------|");
                        System.out.println("|=-- DNI: "+dni+"-------------------------------------------|");
                        System.out.println("|=-- Correo: "+correo+"--------------------------------------------------|");
                        System.out.println("|=-- Contraseña: "+contraseña+"----------------------------------------------|");
                        System.out.println("|=-- codigo universitario: "+codigoU+"------------------------------------|");
                        System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                        System.out.println("|N°|CANTIDAD|  |ARTICULO|                        |MONTO|       |");
                        System.out.println("|==============================================================|");
                        System.out.println("|=== Op. Gratuitas: ===========================================|");
                        System.out.println("|=== Op. Exoneradas: ==========================================|");
                        System.out.println("|=== Op. Gravadas: ============================================|");
                        System.out.println("|=== Total de descuento: ======================================|");
                        System.out.println("|=== Sub-Total: ===============================================|");
                        System.out.println("|=== IGV: =====================================================|");
                        System.out.println("|=== ICBPER: ==================================================|");
                        System.out.println("|=== Importe total: ===========================================|");
                        System.out.println("|=== Detracción: ==============================================|");
                        System.out.println("|=== Importe neto: ============================================|");
                        System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                        System.out.println("|==============================================================|");
                        System.out.println("|=== Medio de Pago: =================================          |");
                        System.out.println("|=== Vendedor(a) :===================================          |");
                        System.out.println("|==============================================================|");
                        System.out.println("|==== Representación Impresa de documento, el cual puede ser ==|");
                        System.out.println("|==========  descargado de la pagina WWW.upeu.pe   ============|");
                        System.out.println("|==============================================================|");
                        System.out.println("|==============================================================|");
                        break;
                    case 0:
                        System.out.println("\u001B[31m🌟✨ Gracias por usar nuestro servicio. ✨🌟");
                        break;
                    default:
                        System.out.println("\u001B[31m😒❌SOLO TIENES QUE ELEGIR ENTRE EL NUMERO 1 O 2 ❌😒");
                }
            }
        } while (opcion != 0);
    }

    public static void main(String[]args){
        compras_union todo= new compras_union();
        todo.fdatos();

    }
}
