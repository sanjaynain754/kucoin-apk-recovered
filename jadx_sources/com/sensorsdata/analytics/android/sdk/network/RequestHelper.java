package com.sensorsdata.analytics.android.sdk.network;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class RequestHelper {
    private boolean isRedirected;

    public static class Builder {
        private HttpCallback callBack;
        private Map<String, String> headerMap;
        private HttpMethod httpMethod;
        private String httpUrl;
        private String jsonData;
        private Map<String, String> paramsMap;
        private int retryCount = 1;

        public Builder callback(HttpCallback httpCallback) {
            this.callBack = httpCallback;
            return this;
        }

        public void execute() {
            HttpMethod httpMethod = this.httpMethod;
            if (httpMethod == HttpMethod.POST && this.paramsMap == null) {
                new RequestHelper(this.httpUrl, this.jsonData, this.headerMap, this.retryCount, this.callBack);
            } else {
                new RequestHelper(httpMethod, this.httpUrl, this.paramsMap, this.headerMap, this.retryCount, this.callBack);
            }
        }

        public Builder header(Map<String, String> map) {
            this.headerMap = map;
            return this;
        }

        public Builder jsonData(String str) {
            this.jsonData = str;
            return this;
        }

        public Builder params(Map<String, String> map) {
            this.paramsMap = map;
            return this;
        }

        public Builder retryCount(int i11) {
            this.retryCount = i11;
            return this;
        }

        public Builder(HttpMethod httpMethod, String str) {
            this.httpMethod = httpMethod;
            this.httpUrl = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPostBodyType(Map<String, String> map, String str) {
        if (map == null && !TextUtils.isEmpty(str)) {
            return "application/json;charset=utf-8";
        }
        return null;
    }

    /* JADX INFO: renamed from: com.sensorsdata.analytics.android.sdk.network.RequestHelper$3 */
    /* JADX INFO: loaded from: classes59.dex */
    public static /* synthetic */ class C277423 {

        /* JADX INFO: renamed from: $SwitchMap$com$sensorsdata$analytics$android$sdk$network$HttpMethod */
        static final /* synthetic */ int[] f56491x35ec91c0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            f56491x35ec91c0 = iArr;
            try {
                iArr[HttpMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56491x35ec91c0[HttpMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPostBody(Map<String, String> map, String str) {
        if (map != null) {
            return getPostBodyFormParamsMap(map);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    private String getPostBodyFormParamsMap(Map<String, String> map) {
        if (map != null) {
            StringBuilder sb2 = new StringBuilder();
            try {
                boolean z11 = true;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (z11) {
                        z11 = false;
                    } else {
                        sb2.append("&");
                    }
                    sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    sb2.append("=");
                    sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                }
                return sb2.toString();
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUrl(String str, Map<String, String> map) {
        if (str == null || map == null) {
            return str;
        }
        String str2 = str.contains("?") ? str + "&" : str + "?";
        for (String str3 : map.keySet()) {
            str2 = str2 + str3 + "=" + map.get(str3) + "&";
        }
        return str2.substring(0, str2.length() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void urlHttpGet(final String str, final Map<String, String> map, final Map<String, String> map2, final int i11, final HttpCallback httpCallback) {
        final int i12 = i11 - 1;
        HttpTaskManager.execute(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.network.RequestHelper.1
            @Override // java.lang.Runnable
            public void run() {
                RealResponse data = new RealRequest().getData(RequestHelper.this.getUrl(str, map), map2);
                int i13 = data.code;
                if (i13 == 200 || i13 == 204) {
                    HttpCallback httpCallback2 = httpCallback;
                    if (httpCallback2 != null) {
                        httpCallback2.onSuccess(data);
                        return;
                    }
                    return;
                }
                if (!RequestHelper.this.isRedirected && HttpUtils.needRedirects(data.code)) {
                    RequestHelper.this.isRedirected = true;
                    RequestHelper.this.urlHttpGet(data.location, map, map2, i11, httpCallback);
                    return;
                }
                int i14 = i12;
                if (i14 != 0) {
                    RequestHelper.this.urlHttpGet(str, map, map2, i14, httpCallback);
                    return;
                }
                HttpCallback httpCallback3 = httpCallback;
                if (httpCallback3 != null) {
                    httpCallback3.onError(data);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void urlHttpPost(final String str, final Map<String, String> map, final String str2, final Map<String, String> map2, final int i11, final HttpCallback httpCallback) {
        final int i12 = i11 - 1;
        HttpTaskManager.execute(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.network.RequestHelper.2
            @Override // java.lang.Runnable
            public void run() {
                RealResponse realResponsePostData = new RealRequest().postData(str, RequestHelper.this.getPostBody(map, str2), RequestHelper.this.getPostBodyType(map, str2), map2);
                int i13 = realResponsePostData.code;
                if (i13 == 200 || i13 == 204) {
                    HttpCallback httpCallback2 = httpCallback;
                    if (httpCallback2 != null) {
                        httpCallback2.onSuccess(realResponsePostData);
                        return;
                    }
                    return;
                }
                if (!RequestHelper.this.isRedirected && HttpUtils.needRedirects(realResponsePostData.code)) {
                    RequestHelper.this.isRedirected = true;
                    RequestHelper.this.urlHttpPost(realResponsePostData.location, map, str2, map2, i11, httpCallback);
                    return;
                }
                int i14 = i12;
                if (i14 != 0) {
                    RequestHelper.this.urlHttpPost(str, map, str2, map2, i14, httpCallback);
                    return;
                }
                HttpCallback httpCallback3 = httpCallback;
                if (httpCallback3 != null) {
                    httpCallback3.onError(realResponsePostData);
                }
            }
        });
    }

    private RequestHelper(HttpMethod httpMethod, String str, Map<String, String> map, Map<String, String> map2, int i11, HttpCallback httpCallback) {
        this.isRedirected = false;
        int i12 = C277423.f56491x35ec91c0[httpMethod.ordinal()];
        if (i12 == 1) {
            urlHttpGet(str, map, map2, i11, httpCallback);
        } else {
            if (i12 != 2) {
                return;
            }
            urlHttpPost(str, map, "", map2, i11, httpCallback);
        }
    }

    private RequestHelper(String str, String str2, Map<String, String> map, int i11, HttpCallback httpCallback) {
        this.isRedirected = false;
        urlHttpPost(str, null, str2, map, i11, httpCallback);
    }
}
