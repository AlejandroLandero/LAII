import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaginaWeb {
    public static void main(String[] args) {
        String texto = "Este es un www.texto.com de ejemplo que contiene algunas direcciones de paginas web. "
                + "Puedes encontrar URLs como https://www.ejemplo.com, http://www.otra-url.com, o incluso www.sitio-web.org."
                + " Asegúrate de buscar todas las URLs, independientemente de si comienzan con ”https://”, ”http://”, o simplemente ”www.”. "
                + "Recuerda que las URLs pueden contener letras, números y caracteres especiales como guiones y puntos. También pueden "
                + "tener extensiones como ”.html” o ”.php”. ¡Buena suerte en tu búsqueda!";

        Pattern pattern = Pattern.compile("\\b(?:https?://|www\\.)\\S+\\b");
        Matcher matcher = pattern.matcher(texto);

        List<String> urls = new ArrayList<>();

        while (matcher.find()) {
            urls.add(matcher.group());
        }

        for (String url : urls) {
            System.out.println(url);
        }
    }
}


