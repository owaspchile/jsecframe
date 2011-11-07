package com.org.jsec.utils;

public class BrowserUtils {

    public static void openBrowserByUrl(String url) throws Exception {

        try {
            if (!java.awt.Desktop.isDesktopSupported()) {
                throw new Exception("browser is not support");
            }
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (!desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                throw new Exception("browser is not support");
            }
            java.net.URI uri = new java.net.URI(url);
            desktop.browse(uri);         
        } catch (Exception e) {
            throw e;
        }

    }
}
