public class App {
    
    public static String vocal(String texto){
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
        else if(timesA > timesE && timesA> timesI && timesA> timesO && timesA> timesU) return("La vocal que más veces se repite es la letra A");
        

        }

    }


}
