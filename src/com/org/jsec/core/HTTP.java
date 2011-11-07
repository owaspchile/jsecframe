
package com.org.jsec.core;

import com.org.jsec.utils.HttpUtils;
import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTTP {
     private Connection.Response response = null;
  public  Document sendRequest(HashMap<String,String> args) throws IOException, NullPointerException,Exception{
      try {                                            
          Document doc = null;
          Connection con = Jsoup.connect(HttpUtils.urlFormat(args.get(Enviroment.url).toString()));          
          if(args.get(Enviroment.method).toString().equalsIgnoreCase("get"))
              con.method(Connection.Method.GET);
          else if(args.get(Enviroment.method).toString().equalsIgnoreCase("post"))
                  con.method(Connection.Method.POST);                              
          response = con.execute();
          doc = response.parse();          
          return doc;
      }catch(IOException io){
        throw  io;
      }
      catch(NullPointerException n){
          throw n;
      } 
      catch (Exception e) {
          throw e;
      }      
  }

    public Response getResponse() {
        return response;
    }

}
