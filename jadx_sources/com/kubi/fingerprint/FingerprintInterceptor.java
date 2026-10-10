package com.kubi.fingerprint;

import android.text.TextUtils;
import kotlinx.coroutines.C41690i;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FingerprintInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/fingerprint/FingerprintInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FingerprintInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String strHeader = chain.request().header("HEADER_FINGER_EVENT");
        if (TextUtils.isEmpty(strHeader)) {
            return chain.proceed(chain.request());
        }
        return chain.proceed(chain.request().newBuilder().addHeader("TOKEN", (String) C41690i.m91067b(null, new FingerprintInterceptor$intercept$token$1(strHeader, null), 1, null)).removeHeader("HEADER_FINGER_EVENT").build());
    }
}
