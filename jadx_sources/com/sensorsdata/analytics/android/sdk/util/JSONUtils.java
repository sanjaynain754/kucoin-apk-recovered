package com.sensorsdata.analytics.android.sdk.util;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class JSONUtils {
    private static void addIndentBlank(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                sb2.append('\t');
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:18:0x0033, B:19:0x0036, B:35:0x006d, B:23:0x003e, B:24:0x0046, B:25:0x004a, B:27:0x004f, B:28:0x0058, B:31:0x005f, B:33:0x0068, B:34:0x006a, B:36:0x0071), top: B:40:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:18:0x0033, B:19:0x0036, B:35:0x006d, B:23:0x003e, B:24:0x0046, B:25:0x004a, B:27:0x004f, B:28:0x0058, B:31:0x005f, B:33:0x0068, B:34:0x006a, B:36:0x0071), top: B:40:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:18:0x0033, B:19:0x0036, B:35:0x006d, B:23:0x003e, B:24:0x0046, B:25:0x004a, B:27:0x004f, B:28:0x0058, B:31:0x005f, B:33:0x0068, B:34:0x006a, B:36:0x0071), top: B:40:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x006d A[SYNTHETIC] */
    public static String formatJson(String str) {
        if (str != null) {
            try {
                if (!"".equals(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    char c11 = 0;
                    boolean z11 = false;
                    int i12 = 0;
                    while (i11 < str.length()) {
                        char cCharAt = str.charAt(i11);
                        if (cCharAt == '\"') {
                            if (c11 != '\\') {
                                z11 = !z11;
                            }
                            sb2.append(cCharAt);
                        } else if (cCharAt == ',') {
                            sb2.append(cCharAt);
                            if (c11 != '\\' && !z11) {
                                sb2.append('\n');
                                addIndentBlank(sb2, i12);
                            }
                        } else if (cCharAt == '{') {
                            sb2.append(cCharAt);
                            if (!z11) {
                                sb2.append('\n');
                                i12++;
                                addIndentBlank(sb2, i12);
                            }
                        } else if (cCharAt != '}') {
                            switch (cCharAt) {
                                case '[':
                                    sb2.append(cCharAt);
                                    if (!z11) {
                                        sb2.append('\n');
                                        i12++;
                                        addIndentBlank(sb2, i12);
                                    }
                                    break;
                                case '\\':
                                    break;
                                case ']':
                                    if (!z11) {
                                        sb2.append('\n');
                                        i12--;
                                        addIndentBlank(sb2, i12);
                                    }
                                    sb2.append(cCharAt);
                                    break;
                                default:
                                    sb2.append(cCharAt);
                                    break;
                            }
                        } else {
                            if (!z11) {
                                sb2.append('\n');
                                i12--;
                                addIndentBlank(sb2, i12);
                            }
                            sb2.append(cCharAt);
                        }
                        i11++;
                        c11 = cCharAt;
                    }
                    return sb2.toString();
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
        return "";
    }

    public static Map<String, String> json2Map(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    public static void mergeDistinctProperty(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    Object obj = jSONObject.get(next);
                    if ((obj instanceof Date) && !"$time".equals(next)) {
                        jSONObject2.put(next, TimeUtils.formatDate((Date) obj, Locale.CHINA));
                    } else {
                        jSONObject2.put(next, obj);
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static String optionalStringKey(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
