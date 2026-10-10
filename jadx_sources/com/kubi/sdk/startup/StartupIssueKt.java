package com.kubi.sdk.startup;

import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StartupIssue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0080\b\u001a\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"CATEGORY", "", "STARTUP_CATEGORY", "TAG", "categoryException", "", "e", "", "source", "categoryMessage", "msg", "techEvent", "code", "Lcom/kubi/sdk/startup/EventCode;", "Startup_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class StartupIssueKt {

    @NotNull
    private static final String CATEGORY = "lib|startup|%s|ignore=%s";

    @NotNull
    public static final String STARTUP_CATEGORY = "Startup";

    @NotNull
    public static final String TAG = "StartupTask";

    public static final void categoryException(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new StartupException(e11, source, true, null, 8, null), null, 2, null);
    }

    public static final void categoryMessage(@NotNull String msg, @NotNull String source) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new AppRouterMessage(msg, source, false, 4, null), null, 2, null);
    }

    public static final void techEvent(@NotNull EventCode code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C43847h.m96575d(KunlunTechEventEnum.CATE_STARTUP, code.ordinal());
    }
}
