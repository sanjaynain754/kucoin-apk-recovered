package com.kubi.p110rn.exception;

import com.kubi.monitor.MonitorLevel;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNIssue.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "categoryFatal", "categoryMessage", "msg", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNIssueKt {

    @NotNull
    private static final String CATEGORY = "base|RN|%s|ignore=%s";

    public static final void categoryException(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new RNException(e11, source, false, null, 8, null), null, 2, null);
    }

    public static final void categoryFatal(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96566a(new RNException(e11, source, false, null, 8, null), MonitorLevel.FATAL);
    }

    public static final void categoryMessage(@NotNull String msg, @NotNull String source) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new RNMessage(msg, source, false, 4, null), null, 2, null);
    }
}
