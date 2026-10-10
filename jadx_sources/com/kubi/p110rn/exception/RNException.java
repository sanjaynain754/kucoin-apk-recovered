package com.kubi.p110rn.exception;

import com.kubi.monitor.BaseIssueException;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNIssue.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/exception/RNException;", "Lcom/kubi/monitor/BaseIssueException;", "thr", "", "source", "", "ignore", "", "msg", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;)V", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNException extends BaseIssueException {
    public /* synthetic */ RNException(Throwable th2, String str, boolean z11, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RNException(@NotNull Throwable thr, @NotNull String source, boolean z11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(thr, "thr");
        Intrinsics.checkNotNullParameter(source, "source");
        String str2 = String.format("base|RN|%s|ignore=%s", Arrays.copyOf(new Object[]{source, Boolean.valueOf(z11)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        super(str2, str, thr);
    }
}
