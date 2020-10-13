package com.mydfmax.my.AbsenQR.system;

public class URLS {
    //Root URL
    private static final String URL_ROOT = "https://my.mydfmax.com/";
    //System URL
    private static final String URL_CORE = URL_ROOT + "core/";
    //Ajax component URL
    public static final String URL_AJAX = URL_CORE + "export_data.php";
    //Api component URL
    private static final String URL_API = URL_CORE + "Api.php?action=";
    public static final String URL_REGISTER = URL_API + "signup";
    public static final String URL_LOGIN= URL_API + "login";
}
