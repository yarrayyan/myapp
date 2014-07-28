/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqms.utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author yarrayya
 */
public class Utils {
    

    public static JSONArray getLinksArray(String role) {
        JSONArray array = null;
        try {
            array = new JSONArray();
            JSONObject json1 = new JSONObject();
            json1.put("name", "Home");
            json1.put("value", "home");
            JSONObject json2 = new JSONObject();
            json2.put("name", "Administration");
            json2.put("value", "admin");
            JSONObject json3 = new JSONObject();
            json3.put("name", "Patches");
            json3.put("value", "patch");
            JSONObject json4 = new JSONObject();
            json4.put("name", "IQ Panels");
            json4.put("value", "panel");
            
            array.add(json1);
            array.add(json2);
            array.add(json3);
            array.add(json4);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }
    
}
