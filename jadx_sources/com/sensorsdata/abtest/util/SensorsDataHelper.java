package com.sensorsdata.abtest.util;

import android.text.TextUtils;
import android.util.Pair;
import com.sensorsdata.abtest.exception.DataInvalidException;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes59.dex */
public class SensorsDataHelper {
    private static final Pattern KEY_PATTERN = Pattern.compile("^((?!^distinct_id$|^original_id$|^time$|^properties$|^id$|^first_id$|^second_id$|^users$|^events$|^event$|^user_id$|^date$|^datetime$)[a-zA-Z_][a-zA-Z\\d_]{0,100})$", 2);
    private static final int PROPERTY_VALUE_MAX_LENGTH = 8191;

    public static Map<String, String> checkPropertiesAndToString(Map<String, Object> map) throws DataInvalidException {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            checkProperty(entry);
            Pair<String, String> pairPropertiesToString = propertiesToString(entry);
            map2.put(pairPropertiesToString.first, pairPropertiesToString.second);
        }
        return map2;
    }

    private static String createKeyInvalidMsg(String str) {
        return "property name [ " + str + " ] is not valid";
    }

    private static String createStringValueInvalidMsg(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("property [ ");
        sb2.append(str);
        sb2.append(" ] of value [ ");
        sb2.append(obj == null ? "null" : obj.toString());
        sb2.append(" ] is not valid");
        return sb2.toString();
    }

    private static String createValueInvalidMsg(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("property values must be String, Number, List<String>, Boolean or Date. property [ ");
        sb2.append(str);
        sb2.append(" ] of value [ ");
        sb2.append(obj == null ? "null" : obj.toString());
        sb2.append(" ] is not valid");
        return sb2.toString();
    }

    private static void checkProperty(Map.Entry<String, Object> entry) throws DataInvalidException {
        String key = entry.getKey();
        Object value = entry.getValue();
        if (!TextUtils.isEmpty(key)) {
            if (key.length() <= 100) {
                if (KEY_PATTERN.matcher(key).matches()) {
                    if (value != null) {
                        if (!(value instanceof CharSequence) && !(value instanceof Number) && !(value instanceof List) && !(value instanceof Boolean) && !(value instanceof Date)) {
                            throw new DataInvalidException(createValueInvalidMsg(key, value));
                        }
                        if (value instanceof List) {
                            Iterator it = ((List) value).iterator();
                            while (it.hasNext()) {
                                if (!(it.next() instanceof String)) {
                                    throw new DataInvalidException(createValueInvalidMsg(key, value));
                                }
                            }
                            return;
                        }
                        return;
                    }
                    throw new DataInvalidException(createValueInvalidMsg(key, null));
                }
                throw new DataInvalidException(createKeyInvalidMsg(key));
            }
            throw new DataInvalidException(createKeyInvalidMsg(key));
        }
        throw new DataInvalidException(createKeyInvalidMsg(key));
    }

    private static Pair<String, String> propertiesToString(Map.Entry<String, Object> entry) throws DataInvalidException {
        String string;
        Object value = entry.getValue();
        if (value instanceof Date) {
            string = TimeUtils.formatDate((Date) value);
        } else if (value instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
            string = jSONArray.toString();
        } else {
            string = value.toString();
        }
        if (string.length() <= PROPERTY_VALUE_MAX_LENGTH) {
            return new Pair<>(entry.getKey(), string);
        }
        throw new DataInvalidException(createStringValueInvalidMsg(entry.getKey(), string));
    }
}
