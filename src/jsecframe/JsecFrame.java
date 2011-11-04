package jsecframe;

import com.org.jsec.core.Dom;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsecFrame {

    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://www.fayerwayer.cl").get();
            Elements forms = Dom.getForms(doc);
            System.out.println("Formularios:");
           // System.out.println(forms);
            for(Element fields : forms){
                System.out.println("ACTIONS: " +fields.attr("action"));
                System.out.println(Dom.getFieldsForm(fields));                
            }
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}
