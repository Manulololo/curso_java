package Mapas;

import java.util.HashMap;//interfaz que usamos para el objeto map
import java.util.Map;
import java.util.Scanner;

public class Mapa {
    
    public static void main(String[] args) {
        // Mapas con palabras de colores en tres idiomas
        Map<String, String> ingles = new HashMap<>();
        ingles.put("rojo", "red");
        ingles.put("azul", "blue");
        ingles.put("amarillo", "yellow");
        
        Map<String, String> frances = new HashMap<>();
        frances.put("rojo", "rouge");
        frances.put("azul", "bleu");
        frances.put("amarillo", "jaune");
        
        Map<String, String> italiano = new HashMap<>();
        italiano.put("rojo", "rosso");
        italiano.put("azul", "blu");
        italiano.put("amarillo", "giallo");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un idioma (ingles, frances, italiano): ");
        String idioma = sc.nextLine().toLowerCase();
        
        Map<String, String> mapaSeleccionado;
        
        switch (idioma) {
            case "ingles":
                mapaSeleccionado = ingles;
                break;
            case "frances":
                mapaSeleccionado = frances;
                break;
            case "italiano":
                mapaSeleccionado = italiano;
                break;
            default:
                System.out.println("Idioma no reconocido.");
                sc.close();
                return;
        }
        
        System.out.println("Traducciones para las palabras en " + idioma + ":");
        System.out.println("Rojo: " + mapaSeleccionado.get("rojo"));
        System.out.println("Azul: " + mapaSeleccionado.get("azul"));
        System.out.println("Amarillo: " + mapaSeleccionado.get("amarillo"));
        
        // Además, mostramos las palabras en los otros dos idiomas
        System.out.println("\nTambién en los otros idiomas:");
        
        if (!idioma.equals("ingles")) {
            System.out.println("Inglés -> Rojo: " + ingles.get("rojo") + ", Azul: " + ingles.get("azul") + ", Amarillo: " + ingles.get("amarillo"));
        }
        if (!idioma.equals("frances")) {
            System.out.println("Francés -> Rojo: " + frances.get("rojo") + ", Azul: " + frances.get("azul") + ", Amarillo: " + frances.get("amarillo"));
        }
        if (!idioma.equals("italiano")) {
            System.out.println("Italiano -> Rojo: " + italiano.get("rojo") + ", Azul: " + italiano.get("azul") + ", Amarillo: " + italiano.get("amarillo"));
        }
        
        sc.close();
    }
}