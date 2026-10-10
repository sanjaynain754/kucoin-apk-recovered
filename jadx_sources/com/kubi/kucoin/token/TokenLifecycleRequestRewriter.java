package com.kubi.kucoin.token;

import androidx.credentials.provider.CredentialEntry;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.token.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TokenLifecycleRequestRewriter.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleRequestRewriter;", "", "<init>", "()V", "X_APP_TOKEN", "", "LOGIN_BY_TOKEN_PATH", "LOGOUT_PATH", "withAccessToken", "Lokhttp3/Request;", "request", "newToken", "isBusiness401Replay", "", "isInternalTokenRequest", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TokenLifecycleRequestRewriter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TokenLifecycleRequestRewriter f28488a = new TokenLifecycleRequestRewriter();

    /* JADX INFO: renamed from: a */
    public final boolean m33025a(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (request.tag(TokenLifecycleRefreshTag.class) == null && request.tag(TokenLifecycleReplayTag.class) == null) ? false : true;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Request m33026b(@NotNull Request request, @NotNull String newToken, boolean z11) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        if (StringsKt.contains$default((CharSequence) request.url().getUrl(), (CharSequence) "/login-by-token", false, 2, (Object) null)) {
            request = request.newBuilder().header("Content-Type", "application/x-www-form-urlencoded").post(RequestBody.INSTANCE.create("token=" + newToken, MediaType.INSTANCE.parse("text"))).build();
        } else if (StringsKt.contains$default((CharSequence) request.url().getUrl(), (CharSequence) "v1/auth/logout", false, 2, (Object) null)) {
            request = request.newBuilder().post(RequestBody.INSTANCE.create("token=" + newToken, MediaType.INSTANCE.parse("application/x-www-form-urlencoded"))).build();
        }
        Request.Builder builderHeader = request.newBuilder().header("X-APP-TOKEN", newToken);
        if (z11) {
            builderHeader.header("retry", CredentialEntry.TRUE_STRING).tag(TokenLifecycleReplayTag.class, TokenLifecycleReplayTag.f28485a);
        }
        return builderHeader.build();
    }
}
