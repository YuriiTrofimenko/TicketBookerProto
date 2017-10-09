/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.ticketbookerproto.modules;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.tyaa.ticketbookerproto.MainApp;
import org.tyaa.ticketbookerproto.modules.exception.FailJsonFetchException;

/**
 *
 * @author yurii
 */
public class JsonInquirer {
    
    public static Integer getCityIdByName(String _cityName)
        throws FailJsonFetchException {
    
        String cityString = null;
        String jsonString = null;
        Integer cityInteger = null;
        
        try {
            cityString = URLEncoder.encode(_cityName, "utf-8");
            if (cityString != null) {
                jsonString =
                    JsonFetcher.fetchByUrl(
                        "https://www.onetwotrip.com/_api/rzd/suggestStations?searchText="
                        + cityString
                        + "&type=station");

                if (jsonString != null) {

                    cityInteger = JsonParser.parseCity(jsonString);
                }

            }
        } catch (UnsupportedEncodingException ex) {}
        return cityInteger;
    }
}
