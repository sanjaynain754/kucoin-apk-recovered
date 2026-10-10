package com.facebook.react.modules.network;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes45.dex */
public class OkHttpClientProvider {

    @Nullable
    private static OkHttpClient sClient;

    @Nullable
    private static OkHttpClientFactory sFactory;

    public static OkHttpClient createClient() {
        OkHttpClientFactory okHttpClientFactory = sFactory;
        return okHttpClientFactory != null ? okHttpClientFactory.createNewNetworkModuleClient() : createClientBuilder().build();
    }

    public static OkHttpClient.Builder createClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(0L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).cookieJar(new ReactCookieJarContainer());
    }

    public static OkHttpClient getOkHttpClient() {
        if (sClient == null) {
            sClient = createClient();
        }
        return sClient;
    }

    public static void setOkHttpClientFactory(OkHttpClientFactory okHttpClientFactory) {
        sFactory = okHttpClientFactory;
    }

    public static OkHttpClient createClient(Context context) {
        OkHttpClientFactory okHttpClientFactory = sFactory;
        if (okHttpClientFactory != null) {
            return okHttpClientFactory.createNewNetworkModuleClient();
        }
        return createClientBuilder(context).build();
    }

    public static OkHttpClient.Builder createClientBuilder(Context context) {
        return createClientBuilder(context, MediaHttpUploader.DEFAULT_CHUNK_SIZE);
    }

    public static OkHttpClient.Builder createClientBuilder(Context context, int i11) {
        OkHttpClient.Builder builderCreateClientBuilder = createClientBuilder();
        return i11 == 0 ? builderCreateClientBuilder : builderCreateClientBuilder.cache(new Cache(new File(context.getCacheDir(), "http-cache"), i11));
    }
}
