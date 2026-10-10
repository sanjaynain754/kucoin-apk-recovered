package com.kubi.sdk.web.http;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.web.http.a */
/* JADX INFO: compiled from: OKHttpProxyClient.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/web/http/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Lokhttp3/OkHttpClient;", "b", "Ljava/lang/Object;", "lock", "c", "Lokhttp3/OkHttpClient;", "proxyClient", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24315a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24315a f48460a = new C24315a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Object lock = new Object();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static OkHttpClient proxyClient;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final OkHttpClient m58742a(@NotNull Context context) {
        OkHttpClient okHttpClientBuild;
        Intrinsics.checkNotNullParameter(context, "context");
        OkHttpClient okHttpClient = proxyClient;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        synchronized (lock) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            okHttpClientBuild = builder.connectTimeout(15L, timeUnit).writeTimeout(30L, timeUnit).readTimeout(30L, timeUnit).cache(new Cache(new File(context.getCacheDir(), "webclient"), 20971520L)).cookieJar(new CookieManagerJar()).protocols(CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1})).build();
            proxyClient = okHttpClientBuild;
        }
        return okHttpClientBuild;
    }
}
