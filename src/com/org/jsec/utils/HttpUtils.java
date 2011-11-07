
package com.org.jsec.utils;

public class HttpUtils {

    public static String urlFormat(String url) throws Exception {
        try {
            if (url == null) {
                return "";
            }
            if (!url.contains("http://")) {
                url = "http://" + url;
            }
            return url;

        } catch (Exception e) {
            throw e;
        }
    }
}
