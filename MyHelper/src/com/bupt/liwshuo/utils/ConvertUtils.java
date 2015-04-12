package com.bupt.liwshuo.utils;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shuo on 2015/4/10.
 */
public class ConvertUtils {

    /**
     *
     * @param person
     * @return
     */
    public Map<String,String> convertStringArryMapToStringMap(Map<String, String[]> person) {
        Map<String, String> map = new HashMap<String, String>();
        for (String keyName : person.keySet()) {
            map.put(keyName, person.get(keyName)[0]);
        }
        return map;
    }

    /**
     *
     * @param jsonObject
     * @return
     */
    public Map<String, String> convertJsonToMap(JSONObject jsonObject) {
        Map<String,String> map = new HashMap<String,String>();
        for (Object keyName : jsonObject.keySet()) {
            map.put(keyName.toString(), jsonObject.getString(keyName.toString()));
        }
        return map;
    }
}
