package com.kubi.user.token;

import com.kubi.kucoin.token.TokenLifecycleRefreshTag;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: TokenLifecycleRefreshRequestInterceptor.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshRequestInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TokenLifecycleRefreshRequestInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f53863a = new Companion(null);

    /* JADX INFO: compiled from: TokenLifecycleRefreshRequestInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshRequestInterceptor$Companion;", "", "<init>", "()V", "X_APP_TOKEN", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (request.tag(TokenLifecycleRefreshTag.class) == null) {
            return chain.proceed(request);
        }
        String strHeader = request.header("X-KC-TOKEN-LIFECYCLE-ATTRIBUTION");
        if (strHeader == null) {
            strHeader = "";
        }
        Request requestBuild = request.newBuilder().removeHeader("X-KC-TOKEN-LIFECYCLE-ATTRIBUTION").build();
        C44128b.m97261e("TokenLifecycle", "Removed local attribution header from internal refresh request, path=" + request.url().encodedPath());
        Response responseProceed = chain.proceed(requestBuild);
        if (strHeader.length() == 0) {
            return responseProceed;
        }
        Response responseBuild = responseProceed.newBuilder().request(responseProceed.request().newBuilder().header("X-APP-TOKEN", strHeader).build()).build();
        C44128b.m97261e("TokenLifecycle", "Restored local account attribution on refresh response, path=" + request.url().encodedPath());
        return responseBuild;
    }
}
