
package com.org.jsec.core;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Dom {
    //Extrae todos los formularios del documento
    public static Elements getForms(Document doc) throws Exception{
        try {
            Elements forms =  doc.getElementsByTag("form");
            return forms;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static Elements getFieldsForm(Element form) throws Exception{
        try {
            return form.getAllElements();
        } catch (Exception e) {
            throw e;
        }
    }
}
