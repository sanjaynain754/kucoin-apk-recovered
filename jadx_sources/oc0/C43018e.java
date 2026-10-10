package oc0;

import androidx.webkit.ProxyConfig;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: oc0.e */
/* JADX INFO: compiled from: QcloudClsSignature.java */
/* JADX INFO: loaded from: classes2.dex */
public class C43018e {
    /* JADX INFO: renamed from: a */
    public static Map<String, String> m94489a(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.equalsIgnoreCase("content-type") || key.equalsIgnoreCase("content-md5") || key.equalsIgnoreCase("host") || key.startsWith("x") || key.startsWith("X")) {
                map2.put(key.toLowerCase(), entry.getValue());
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: b */
    public static String m94490b(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        for (String str : map.keySet()) {
            if (z11) {
                sb2.append(";");
            } else {
                z11 = true;
            }
            sb2.append(str.toLowerCase());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m94492d(long j11) {
        StringBuilder sb2 = new StringBuilder();
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - 60;
        long jCurrentTimeMillis2 = (System.currentTimeMillis() + j11) / 1000;
        sb2.append(jCurrentTimeMillis);
        sb2.append(";");
        sb2.append(jCurrentTimeMillis2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m94493e(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String strReplace = URLEncoder.encode(key.toLowerCase(), "UTF-8").replace("+", "%20").replace(ProxyConfig.MATCH_ALL_SCHEMES, "%2A").replace("%7E", "~");
            String strReplace2 = value != null ? URLEncoder.encode(value, "UTF-8").replace("+", "%20").replace(ProxyConfig.MATCH_ALL_SCHEMES, "%2A").replace("%7E", "~") : "";
            if (z11) {
                sb2.append("&");
            } else {
                z11 = true;
            }
            sb2.append(strReplace);
            sb2.append("=");
            sb2.append(strReplace2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m94491c(String str, String str2, String str3, String str4, Map<String, String> map, Map<String, String> map2, long j11) throws UnsupportedEncodingException {
        Map<String, String> mapM94489a = m94489a(map2);
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        treeMap.putAll(mapM94489a);
        treeMap2.putAll(map);
        String strM94490b = m94490b(treeMap);
        String strM94490b2 = m94490b(treeMap2);
        String strM94492d = m94492d(j11);
        String strM94484b = C43015b.m94484b(strM94492d.getBytes(), str2.getBytes());
        String strM94485c = C43015b.m94485c(str3.toLowerCase() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str4 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m94493e(treeMap2) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m94493e(treeMap) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sha1\n");
        sb2.append(strM94492d);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append(strM94485c);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        return "q-sign-algorithm=sha1&q-ak=" + str + "&q-sign-time=" + strM94492d + "&q-key-time=" + strM94492d + "&q-header-list=" + strM94490b + "&q-url-param-list=" + strM94490b2 + "&q-signature=" + C43015b.m94484b(sb2.toString().getBytes(), strM94484b.getBytes());
    }
}
