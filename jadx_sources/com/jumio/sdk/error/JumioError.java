package com.jumio.sdk.error;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lcom/jumio/sdk/error/JumioError;", "Ljava/io/Serializable;", "isRetryable", "", "domain", "", "code", "message", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getDomain", "()Ljava/lang/String;", "getCode", "getMessage", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioError implements Serializable {

    /* JADX INFO: renamed from: a */
    public final boolean f14705a;

    /* JADX INFO: renamed from: b */
    public final String f14706b;

    /* JADX INFO: renamed from: c */
    public final String f14707c;

    /* JADX INFO: renamed from: d */
    public final String f14708d;

    public JumioError(boolean z11, @NotNull String domain, @NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f14705a = z11;
        this.f14706b = domain;
        this.f14707c = code;
        this.f14708d = message;
    }

    @NotNull
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final String getF14707c() {
        return this.f14707c;
    }

    @NotNull
    /* JADX INFO: renamed from: getDomain, reason: from getter */
    public final String getF14706b() {
        return this.f14706b;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public final String getF14708d() {
        return this.f14708d;
    }

    /* JADX INFO: renamed from: isRetryable, reason: from getter */
    public final boolean getF14705a() {
        return this.f14705a;
    }
}
