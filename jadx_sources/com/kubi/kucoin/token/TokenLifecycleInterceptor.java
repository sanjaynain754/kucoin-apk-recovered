package com.kubi.kucoin.token;

import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27058k0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p351iy.C40192c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kucoin.token.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TokenLifecycleInterceptor.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TokenLifecycleInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        C40192c c40192c = C40192c.f89321a;
        if (!c40192c.m88545g()) {
            return chain.proceed(request);
        }
        if (c40192c.m88543e().getPreflightSkipExact().contains(request.url().encodedPath())) {
            return chain.proceed(request);
        }
        if (TokenLifecycleRequestBypass.f28486a.m33024a(request)) {
            return chain.proceed(request);
        }
        if (request.tag(TokenLifecycleRefreshTag.class) != null) {
            C44128b.m97261e("TokenLifecycle", "Lifecycle interceptor bypassed internal refresh request");
            return chain.proceed(request);
        }
        if (request.tag(TokenLifecycleReplayTag.class) != null) {
            C44128b.m97261e("TokenLifecycle", "Lifecycle interceptor bypassed one-time replay request, path=" + request.url().encodedPath());
            return chain.proceed(request);
        }
        if (!UserInfo.a.n() || !C27058k0.f54342a.m66755e()) {
            return chain.proceed(request);
        }
        TokenLifecycleManager tokenLifecycleManager = TokenLifecycleManager.f28424a;
        return chain.proceed(tokenLifecycleManager.m32933Y(tokenLifecycleManager.m32944p(request)));
    }
}
