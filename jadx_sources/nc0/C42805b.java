package nc0;

import androidx.webkit.ProxyConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: renamed from: nc0.b */
/* JADX INFO: compiled from: HttpUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class C42805b {
    /* JADX INFO: renamed from: a */
    public static String m93832a(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!z11) {
                sb2.append("&");
            }
            sb2.append(m93833b(key, str));
            if (value != null) {
                sb2.append("=");
                sb2.append(m93833b(value, str));
            }
            z11 = false;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m93833b(String str, String str2) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, str2).replace("+", "%20").replace(ProxyConfig.MATCH_ALL_SCHEMES, "%2A").replace("~", "%7E").replace("/", "%2F");
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalArgumentException("FailedToEncodeUri", e11);
        }
    }
}
