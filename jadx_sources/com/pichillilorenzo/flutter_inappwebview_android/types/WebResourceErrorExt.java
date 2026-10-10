package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewFeature;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class WebResourceErrorExt {
    private String description;
    private int type;

    public static WebResourceErrorExt fromWebResourceError(WebResourceError webResourceError) {
        return new WebResourceErrorExt(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
    }

    public static WebResourceErrorExt fromWebResourceError(WebResourceErrorCompat webResourceErrorCompat) {
        return new WebResourceErrorExt(WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE) ? webResourceErrorCompat.getErrorCode() : -1, WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION) ? webResourceErrorCompat.getDescription().toString() : "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceErrorExt webResourceErrorExt = (WebResourceErrorExt) obj;
        if (this.type != webResourceErrorExt.type) {
            return false;
        }
        return this.description.equals(webResourceErrorExt.description);
    }

    public String getDescription() {
        return this.description;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.description.hashCode();
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(getType()));
        map.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, getDescription());
        return map;
    }

    public String toString() {
        return "WebResourceErrorExt{type=" + this.type + ", description='" + this.description + "'}";
    }

    public WebResourceErrorExt(int i11, String str) {
        this.type = i11;
        this.description = str;
    }
}
