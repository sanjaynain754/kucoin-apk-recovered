package com.sensorsdata.analytics.android.sdk.util;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.exceptions.InvalidDataException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SADataHelper {
    private static final Pattern KEY_PATTERN = Pattern.compile("^((?!^distinct_id$|^original_id$|^time$|^properties$|^id$|^first_id$|^second_id$|^users$|^events$|^event$|^user_id$|^date$|^datetime$)[a-zA-Z_$][a-zA-Z\\d_$]{0,99})$", 2);
    private static final String TAG = "SA.SADataHelper";

    public static JSONObject appendLibMethodAutoTrack(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("$lib_method", "autoTrack");
            return jSONObject;
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
            return jSONObject;
        }
    }

    public static void assertKey(String str) throws InvalidDataException {
        if (str == null || str.length() < 1) {
            throw new InvalidDataException("The key is empty.");
        }
        if (KEY_PATTERN.matcher(str).matches()) {
            return;
        }
        throw new InvalidDataException("The key '" + str + "' is invalid.");
    }

    public static String assertPropertyLength(String str) {
        if (str == null || str.length() <= 8191) {
            return str;
        }
        String str2 = str.substring(0, 8191) + "$";
        SALog.m68587d(TAG, "The property value is too long. property=" + str2);
        return str2;
    }

    public static void assertPropertyTypes(JSONObject jSONObject) throws InvalidDataException {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            assertKey(next);
            try {
                Object obj = jSONObject.get(next);
                if (obj == JSONObject.NULL) {
                    itKeys.remove();
                } else {
                    if (obj instanceof List) {
                        List list = (List) obj;
                        int size = list.size();
                        JSONArray jSONArray = new JSONArray();
                        for (int i11 = 0; i11 < size; i11++) {
                            jSONArray.put(list.get(i11));
                        }
                        jSONObject.put(next, jSONArray);
                        obj = jSONArray;
                    }
                    if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof JSONArray) && !(obj instanceof Boolean) && !(obj instanceof Date)) {
                        throw new InvalidDataException("The property value must be an instance of CharSequence/Number/Boolean/JSONArray/Date/List<String>. [key='" + next + "', value='" + obj.toString() + "', class='" + obj.getClass().getCanonicalName() + "']");
                    }
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        int length = jSONArray2.length();
                        for (int i12 = 0; i12 < length; i12++) {
                            if (!(jSONArray2.get(i12) instanceof CharSequence)) {
                                throw new InvalidDataException("The array property value must be an instance of List<String> or JSONArray only contains String. [key='" + next + "', value='" + obj.toString() + "']");
                            }
                        }
                    } else if ("app_crashed_reason".equals(next)) {
                        if ((obj instanceof String) && ((String) obj).length() > 16382) {
                            jSONObject.put(next, ((String) obj).substring(0, 16382) + "$");
                            SALog.m68587d(TAG, "The property value is too long. [key='" + next + "', value='" + obj.toString() + "']");
                        }
                    } else if ((obj instanceof String) && ((String) obj).length() > 8191) {
                        jSONObject.put(next, ((String) obj).substring(0, 8191) + "$");
                        SALog.m68587d(TAG, "The property value is too long. [key='" + next + "', value='" + obj.toString() + "']");
                    }
                }
            } catch (JSONException unused) {
                throw new InvalidDataException("Unexpected property key. [key='" + next + "']");
            }
        }
    }

    public static void assertValue(String str) throws InvalidDataException {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 255) {
                return;
            }
            throw new InvalidDataException("The " + str + " is too long, max length is 255.");
        }
        throw new InvalidDataException("The value is empty.");
    }
}
