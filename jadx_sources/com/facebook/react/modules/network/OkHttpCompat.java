package com.facebook.react.modules.network;

import java.util.Collections;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes45.dex */
public class OkHttpCompat {
    public static Headers getHeadersFromMap(Map<String, String> map) {
        return map == null ? Headers.m94722of((Map<String, String>) Collections.EMPTY_MAP) : Headers.m94722of(map);
    }

    public static CookieJarContainer getCookieJarContainer(OkHttpClient okHttpClient) {
        return (CookieJarContainer) okHttpClient.cookieJar();
    }
}
