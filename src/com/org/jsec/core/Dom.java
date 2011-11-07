
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
    /* Retorna un string con todos los formularios y sus campos
     */
    public static String getFieldsForm(Elements forms) throws Exception{
        try {
            String data ="";
            for (Element fields : forms) {                
                data = data + fields.toString();                                                           
            }   
            
            return data;
        } catch (Exception e) {
            throw e;
        }
    }
}
