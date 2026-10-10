package com.kubi.monitor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Issues.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/monitor/BaseIssueException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "category", "", "msg", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public abstract class BaseIssueException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseIssueException(@NotNull String category, @NotNull String msg) {
        super("category:" + category + ':' + msg);
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseIssueException(@NotNull String category, @Nullable String str, @NotNull Throwable e11) {
        super("category:" + category + ':' + ((Object) str), e11);
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(e11, "e");
    }
}
