package com.tencentcloudapi.cls.android.producer.http.comm;

/* JADX INFO: loaded from: classes2.dex */
public enum HttpMethod {
    DELETE("DELETE"),
    GET("GET"),
    HEAD("HEAD"),
    POST("POST"),
    PUT("PUT"),
    OPTIONS("OPTIONS");

    private final String text;

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }

    HttpMethod(String str) {
        this.text = str;
    }

    public static HttpMethod fromString(String str) {
        for (HttpMethod httpMethod : values()) {
            if (httpMethod.text.equals(str)) {
                return httpMethod;
            }
        }
        throw new IllegalArgumentException("Illegal http method: " + str);
    }
}
