//package es.curso.java.sala.cine;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // 1) Crear un usuario (cliente)
//        Usuario cliente = new Usuario("Paco", "74221784L", 22, 12.00);
//        System.out.println("Cliente: " + cliente.getNombre() + " - Dinero: " + cliente.getDinero());
//
//        // 2) Crear el cine usando el método abrirCine()
//        Main app = new Main();
//        Cine cine = app.abrirCine();
//
//        // 3) Mostrar cartelera
//        System.out.println("\nBienvenido al " + cine.getNombre());
//        System.out.println("Cartelera:");
//        for (int i = 0; i < cine.getSalas().length; i++) {
//            SalaDeCine sala = cine.getSalas()[i];
//            Pelicula p = sala.getPelicula();
//            System.out.printf("- %s: %s (%d+, %d min). Precio: %.2f. Capacidad nominal: %d%n",
//                              sala.getNombre(),
//                              p.getTitulo(),
//                              p.getClasificacionPorEdad(),
//                              p.getDuracion(),
//                              p.getPrecio(),
//                              sala.getCapacidad());
//
//            // Mostrar tamaño del array de butacas (filas x columnas)
//            if (sala.getButacas() != null && sala.getButacas().length > 0) {
//                System.out.println("  Butacas: " + sala.getButacas().length + " filas x " +
//                                   sala.getButacas()[0].length + " columnas");
//            }
//        }
//    }
//
//    public Cine abrirCine() {
//        Pelicula p1 = new Pelicula("Titanic", 130, 14, 12.50, 123);
//        Pelicula p2 = new Pelicula("La naranja mecánica", 105, 18, 12.50, 124);
//        Pelicula p3 = new Pelicula("Tiburón", 95, 14, 12.50, 125);
//
//        SalaDeCine s1 = new SalaDeCine("Sala 1", 500, p1);
//        SalaDeCine s2 = new SalaDeCine("Sala 2", 300, p2);
//        SalaDeCine s3 = new SalaDeCine("Sala 3", 300, p3);
//
//        Cine cine = new Cine("Cine Plaza", 3);
//        cine.getSalas()[0] = s1;
//        cine.getSalas()[1] = s2;
//        cine.getSalas()[2] = s3;
//
//        return cine;
//    }
//}


	


