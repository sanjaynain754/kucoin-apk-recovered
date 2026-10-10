package com.google.api.client.googleapis.util;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.Beta;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public final class Utils {

    public static class JsonFactoryInstanceHolder {
        static final JsonFactory INSTANCE = new GsonFactory();

        private JsonFactoryInstanceHolder() {
        }
    }

    public static class TransportInstanceHolder {
        static final HttpTransport INSTANCE = new NetHttpTransport();

        private TransportInstanceHolder() {
        }
    }

    public static JsonFactory getDefaultJsonFactory() {
        return JsonFactoryInstanceHolder.INSTANCE;
    }

    public static HttpTransport getDefaultTransport() {
        return TransportInstanceHolder.INSTANCE;
    }

    private Utils() {
    }
}
