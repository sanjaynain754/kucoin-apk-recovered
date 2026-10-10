package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebResourceRequest;
import androidx.webkit.WebResourceRequestCompat;
import androidx.webkit.WebViewFeature;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class WebResourceRequestExt {
    private boolean hasGesture;
    private Map<String, String> headers;
    private boolean isForMainFrame;
    private boolean isRedirect;
    private String method;
    private String url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WebResourceRequestExt webResourceRequestExt = (WebResourceRequestExt) obj;
            if (this.isRedirect != webResourceRequestExt.isRedirect || this.hasGesture != webResourceRequestExt.hasGesture || this.isForMainFrame != webResourceRequestExt.isForMainFrame || !this.url.equals(webResourceRequestExt.url)) {
                return false;
            }
            Map<String, String> map = this.headers;
            if (map == null ? webResourceRequestExt.headers != null : !map.equals(webResourceRequestExt.headers)) {
                return false;
            }
            String str = this.method;
            String str2 = webResourceRequestExt.method;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public static WebResourceRequestExt fromWebResourceRequest(WebResourceRequest webResourceRequest) {
        return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT) ? WebResourceRequestCompat.isRedirect(webResourceRequest) : webResourceRequest.isRedirect(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
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
        int iHashCode = this.url.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (((((((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + (this.isRedirect ? 1 : 0)) * 31) + (this.hasGesture ? 1 : 0)) * 31) + (this.isForMainFrame ? 1 : 0)) * 31;
        String str = this.method;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public boolean isForMainFrame() {
        return this.isForMainFrame;
    }

    public boolean isHasGesture() {
        return this.hasGesture;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public void setForMainFrame(boolean z11) {
        this.isForMainFrame = z11;
    }

    public void setHasGesture(boolean z11) {
        this.hasGesture = z11;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRedirect(boolean z11) {
        this.isRedirect = z11;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("url", this.url);
        map.put("headers", this.headers);
        map.put("isRedirect", Boolean.valueOf(this.isRedirect));
        map.put("hasGesture", Boolean.valueOf(this.hasGesture));
        map.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
        map.put(FirebaseAnalytics.Param.METHOD, this.method);
        return map;
    }

    public String toString() {
        return "WebResourceRequestExt{url=" + this.url + ", headers=" + this.headers + ", isRedirect=" + this.isRedirect + ", hasGesture=" + this.hasGesture + ", isForMainFrame=" + this.isForMainFrame + ", method='" + this.method + "'}";
    }

    public WebResourceRequestExt(String str, Map<String, String> map, boolean z11, boolean z12, boolean z13, String str2) {
        this.url = str;
        this.headers = map;
        this.isRedirect = z11;
        this.hasGesture = z12;
        this.isForMainFrame = z13;
        this.method = str2;
    }
}
