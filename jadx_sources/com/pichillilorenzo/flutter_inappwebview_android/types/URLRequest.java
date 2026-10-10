package com.pichillilorenzo.flutter_inappwebview_android.types;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class URLRequest {
    private byte[] body;
    private Map<String, String> headers;
    private String method;
    private String url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            URLRequest uRLRequest = (URLRequest) obj;
            String str = this.url;
            if (str == null ? uRLRequest.url != null : !str.equals(uRLRequest.url)) {
                return false;
            }
            String str2 = this.method;
            if (str2 == null ? uRLRequest.method != null : !str2.equals(uRLRequest.method)) {
                return false;
            }
            if (!Arrays.equals(this.body, uRLRequest.body)) {
                return false;
            }
            Map<String, String> map = this.headers;
            Map<String, String> map2 = uRLRequest.headers;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public static URLRequest fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get("url");
        if (str == null) {
            str = "about:blank";
        }
        return new URLRequest(str, (String) map.get(FirebaseAnalytics.Param.METHOD), (byte[]) map.get(TtmlNode.TAG_BODY), (Map) map.get("headers"));
    }

    public byte[] getBody() {
        return this.body;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.method;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.body)) * 31;
        Map<String, String> map = this.headers;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("url", this.url);
        map.put(FirebaseAnalytics.Param.METHOD, this.method);
        map.put("headers", this.headers);
        map.put(TtmlNode.TAG_BODY, this.body);
        map.put("allowsCellularAccess", null);
        map.put("allowsConstrainedNetworkAccess", null);
        map.put("allowsExpensiveNetworkAccess", null);
        map.put("cachePolicy", null);
        map.put("httpShouldHandleCookies", null);
        map.put("httpShouldUsePipelining", null);
        map.put("networkServiceType", null);
        map.put("timeoutInterval", null);
        map.put("mainDocumentURL", null);
        map.put("assumesHTTP3Capable", null);
        map.put("attribution", null);
        return map;
    }

    public String toString() {
        return "URLRequest{url='" + this.url + "', method='" + this.method + "', body=" + Arrays.toString(this.body) + ", headers=" + this.headers + '}';
    }

    public URLRequest(String str, String str2, byte[] bArr, Map<String, String> map) {
        this.url = str;
        this.method = str2;
        this.body = bArr;
        this.headers = map;
    }
}
