package com.org.jsec.core;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Dom {
    //Extrae todos los formularios del documento

    public static Elements getForms(Document doc) throws Exception {
        try {
            Elements forms = doc.getElementsByTag("form");
            return forms;
        } catch (Exception e) {
            throw e;
        }
    }
    /* Retorna un string con todos los formularios y sus campos
     */

    public static String getFieldsForm(Elements forms) throws Exception {
        try {
            String data = "";
            for (Element fields : forms) {
                data = data + fields.toString();
            }

            return data;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String getAllLinks(Document doc) throws Exception {
        try {
            String outlinks = "";
            Elements links = doc.getElementsByTag("a");
            Elements media = doc.getElementsByTag("img");
            Elements imports = doc.getElementsByTag("link");
            
            outlinks = outlinks.concat("Links: ................")+ "\n\n";
            for(Element lnk : links){
                outlinks = outlinks.concat(lnk.attr("href").toString()) + "\n";
                
            }
            outlinks = outlinks.concat("\n\nImages: ................")+ "\n\n";
            for(Element image : media){
                outlinks = outlinks.concat(image.attr("src").toString()) + "\n";
            }
            outlinks = outlinks.concat("\n\nImports: ................")+ "\n\n";
            for(Element imp : imports){
                outlinks = outlinks.concat(imp.attr("href").toString()) + "\n";
            }            
            return outlinks;
        } catch (Exception e) {
            throw e;
        }
    }
        
}
