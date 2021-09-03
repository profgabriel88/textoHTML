import org.jsoup.*;
import org.jsoup.nodes.Document;
import java.io.IOException;
import javax.swing.*;

public class ExtraiTexto {

    private String noticia;
    private int fSize = 16;

    public void getNoticia(String url, JEditorPane ta) {
        try {
            Document doc = Jsoup.connect(url).get();

            noticia = String.valueOf(doc.select("p"));

            ta.setContentType("text/html");
            ta.setText("<b style=\"font-size:"+fSize+"\">"+noticia+"</b>");
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setSizeMais (JEditorPane ta) {
        this.fSize++;
        ta.setText("");
        ta.setText("<b style=\"font-size:"+fSize+"\">"+noticia+"</b>");
        //System.out.println(fSize);
    }

    public void setSizeMenos (JEditorPane ta) {
        this.fSize--;
        ta.setText("");
        ta.setText("<b style=\"font-size:"+fSize+"\">"+noticia+"</b>");
    }
}