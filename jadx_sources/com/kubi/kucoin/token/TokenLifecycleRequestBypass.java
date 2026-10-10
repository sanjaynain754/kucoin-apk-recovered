package com.kubi.kucoin.token;

import java.util.Set;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.token.o, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TokenLifecycleRequestBypass.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleRequestBypass;", "", "<init>", "()V", "bypassPaths", "", "", "shouldBypass", "", "request", "Lokhttp3/Request;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TokenLifecycleRequestBypass {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TokenLifecycleRequestBypass f28486a = new TokenLifecycleRequestBypass();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f28487b = SetsKt.setOf((Object[]) new String[]{"/app/v1/auth/logout", "/app/v1/auth/refresh-token", "/app/v1/auth/login-validation", "/app/v1/auth/login-kickout", "/app/v2/auth/login-validation", "/app/v2/auth/login-kickout", "/app/v1/auth/sign-up", "/app/v1/auth/external-register"});

    /* JADX INFO: renamed from: a */
    public final boolean m33024a(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return f28487b.contains(request.url().encodedPath());
    }
}
