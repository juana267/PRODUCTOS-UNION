import java.util.Scanner;
public class union {
    private int op_pdt=0;
    Scanner union = new Scanner(System.in);
    public String opciones() {
        String opcionPV, opcionU;

        System.out.println("PUNTOS DE VENTA");
        System.out.println("Conoce las ubicaciones donde puedes encontrar nuestros productos");
        System.out.println("\uD83D\uDED2Supermercados");
        System.out.println("⛟Bodegas y distribuidores");
        System.out.println("1. Conoce más");
        System.out.println("2. Delivery");
        opcionPV = union.nextLine();
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
                opcionU = union.nextLine();
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
    public String delivery (){
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
                System.out.println("│ 9  | Tostada Blanca X 10             | 5.30   | 10       │");//P
                System.out.println("│ 10 | Paneton Diet T/L 500 gr         | 24.40  | 500g     │");//24.40
                System.out.println("│ 11 | Paneton Integral T/C 900 gr     | 24.00  | 900g     │");//24
                System.out.println("│ 12 | Pan pita integral granos andinos| 7.60   | 1        │");//--
                System.out.println("│ 13 | Pan pita semillas chia y linaza | 7.60   | 1        │");//--
                System.out.println("│ 14 | Pan Integral Sandwich           | 8.50   | 1        │");//8.50
                System.out.println("│ 15 | Pan Integral Mediano Union      | 4.70   | 1        │");//4.70
                System.out.println("│ 16 | Pan Blanco Familiar Superbom    | 6.40   | 1        │");//6.40
                System.out.println("│ 17 | Pan Fuente                      | 9.50   | 1        │");//9.50
                System.out.println("│ 18 | Pan Integral Familiar Superbom  | 6.50   | 1        │");//6.50
                System.out.println("│ 19 | Mega Galleta Integral de Naranja| 5.10   | 1        │");//
                System.out.println("│ 20 | Mega Galleta Integral de Coco   | 5.10   | 1        │");//
                System.out.println("│ 21 | Mega Galleta de Naranja         | 5.10   | 1        │");//
                System.out.println("│ 22 | Mega Galleta de Kiwicha         | 5.10   | 1        │");//
                System.out.println("│ 23 | Mega Galleta de Coco            | 5.10   | 1        │");//
                System.out.println("└──────────────────────────────────────────────────────────┘");//===============16
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
    public void cobrar (){
        double cantidad,total;
        switch (op_pdt){
            case 1:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*19.00;
                break;
            case 2:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*21.50;
                break;
            case 3:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*10.50;
                break;
            case 4:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*36.00;
            case 5:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*8.40;
                break;
            case 6:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*2.30;
                break;
            case 7:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*2.30;
                break;
            case 8:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*5.30;
            case 9:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*5.30;
                break;
            case 10:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*24.40;
                break;
            case 11:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*24.00;
                break;
            case 12:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*7.60;
                break;
            case 13:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*7.60;
                break;
            case 14:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*8.50;
                break;
            case 15:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*4.70;
                break;
            case 16:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*6.40;
                break;
            case 17:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*9.50;
                break;
            case 18:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*6.50;
                break;
            case 19:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*5.10;
                break;
            case 20:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*5.10;
                break;
            case 21:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*5.10;
                break;
            case 22:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*5.10;
                break;
            case 23:
                System.out.println("cuantos va a querer");
                cantidad = union.nextDouble();
                total=cantidad*5.10;
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
    public static void main(String[] args) {
        union union = new union();
        union.opciones();
        union.delivery();
    }
}