package com.jumio.sdk.retry;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/jumio/sdk/retry/JumioRetryReason;", "Ljava/io/Serializable;", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioRetryReason implements Serializable {

    /* JADX INFO: renamed from: a */
    public final int f14742a;

    /* JADX INFO: renamed from: b */
    public final String f14743b;

    public JumioRetryReason(int i11, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f14742a = i11;
        this.f14743b = message;
    }

    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final int getF14742a() {
        return this.f14742a;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public final String getF14743b() {
        return this.f14743b;
    }
}
