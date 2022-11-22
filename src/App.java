public class App {
    
    public static String contadorVocal(String texto){
        int timesA = 0;
        int timesE = 0;
        int timesI = 0;
        int timesO = 0;
        int timesU = 0;

        // Eliminamos las tildes y los acentos en mayusculas
        texto = texto.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u').toLowerCase();

        // Bucle que cuente las letras del texto y las añada a las variables de las letras declaradas al inicio del programa
        for(int i =0; i < texto.length(); i++){
            if(texto.charAt(i) == 'a') timesA++;
            if(texto.charAt(i) == 'e') timesE++;
            if(texto.charAt(i) == 'i') timesI++;
            if(texto.charAt(i) == 'o') timesO++;
            if(texto.charAt(i) == 'u') timesU++;
        }

        // Establecemos las condiciones que dictaminan que vocal se repite más veces en base a las variables establecidas previamente
        if(timesA ==0 && timesE == 0 && timesI == 0 && timesO == 0 && timesU == 0 ) return ("Lo sentimos. No hay vocales en tu texto.");
        else if(timesA > timesE && timesA > timesI && timesA > timesO && timesA > timesU) return("La vocal que más veces se repite es la letra A.");
        else if(timesE > timesA && timesE > timesI && timesE > timesO && timesE > timesU) return("La vocal que más veces se repite es la letra E.");
        else if(timesI > timesA && timesI > timesE && timesI > timesO && timesI > timesU) return("La vocal que más veces se repite es la letra I.");
        else if(timesO > timesA && timesO > timesE && timesO > timesI && timesO > timesU) return("La vocal que más veces se repite es la letra O.");
        else if(timesU > timesA && timesU > timesE && timesU > timesI && timesU > timesO) return("La vocal que más veces se repite es la letra U.");

        // En caso de empate a vocales mostrara el siguiente mensaje
        else return("Existe un empate entre ciertas vocales.");
        }

        // Método Main que ejecuta el programa.
        public static void main(String[] args) {

            // Texto sin vocales
            System.out.println(contadorVocal("hdhhdhdhdhdhdhhdhdhdhdhd"));
            // Letra A
            System.out.println(contadorVocal("El ala de pata de pava."));
            // Letra E
            System.out.println(contadorVocal("El nene del tete pepe."));
            // Letra I
            System.out.println(contadorVocal("La tia trini."));
            // Letra O
            System.out.println(contadorVocal("¡GOOOL!."));
            // Letra U
            System.out.println(contadorVocal("Umut Bulut es un jugador turco."));

        }

    }

