package com.kubi.kumex.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kumex.utils.v, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Log.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kumex/utils/Log;", "", "<init>", "()V", "PREFIX", "", "i", "", "tag", "message", "w", "d", "e", "throwable", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Log {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Log f30813a = new Log();

    /* JADX INFO: renamed from: a */
    public final void m36615a(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C44128b.m97259c("Futures:" + tag, message);
    }

    /* JADX INFO: renamed from: b */
    public final void m36616b(@NotNull String tag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        C44128b.m97263g("Futures:" + tag, throwable);
    }

    /* JADX INFO: renamed from: c */
    public final void m36617c(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C44128b.m97266j("Futures:" + tag, message);
    }

    /* JADX INFO: renamed from: d */
    public final void m36618d(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C44128b.m97270n("Futures:" + tag, message);
    }
}
