package org.tyaa.ticketbookerproto;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.tyaa.ticketbookerproto.modules.JsonFetcher;
import org.tyaa.ticketbookerproto.modules.JsonInquirer;
import org.tyaa.ticketbookerproto.modules.JsonParser;
import org.tyaa.ticketbookerproto.modules.exception.FailJsonFetchException;

public class MainApp /*extends Application*/ {

    public static void main(String[] args) throws FailJsonFetchException
    {
        //launch(args);
        //System.out.println("Id = " + JsonInquirer.getCityIdByName("Москва"));
        //System.out.println("Id = " + JsonInquirer.getCityIdByName("Петербург"));
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        System.out.println(dateFormat.format(d));
    }
    
    /*@Override
    public void start(Stage _primaryStage){}*/

}
