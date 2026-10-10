package com.kubi.p110rn.startup;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CalcBundleHostInterceptor.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/startup/CalcBundleHostInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CalcBundleHostInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        if (!Intrinsics.areEqual(httpUrlUrl.encodedPath(), "/app/v1/rn/calcBundle") && !Intrinsics.areEqual(httpUrlUrl.encodedPath(), "/v1/rn/calcBundle")) {
            return chain.proceed(request);
        }
        String strHost = httpUrlUrl.host();
        int iHashCode = strHost.hashCode();
        if (iHashCode == 99196102) {
            if (strHost.equals("appapi-v2.th.sit4.kucoin.net")) {
                str = "appapi-v2.th.sit3.kucoin.net";
                return chain.proceed(request.newBuilder().url(httpUrlUrl.newBuilder().host(str).build()).build());
            }
            return chain.proceed(request);
        }
        if (iHashCode == 747391184) {
            if (strHost.equals("appapi-v2.tr.sit4.kucoin.net")) {
                str = "appapi-v2.tr.sit3.kucoin.net";
                return chain.proceed(request.newBuilder().url(httpUrlUrl.newBuilder().host(str).build()).build());
            }
            return chain.proceed(request);
        }
        if (iHashCode == 1854084228 && strHost.equals("appapi-v2.sit4.kucoin.net")) {
            str = "appapi-v2.sit3.kucoin.net";
            return chain.proceed(request.newBuilder().url(httpUrlUrl.newBuilder().host(str).build()).build());
        }
        return chain.proceed(request);
    }
}
