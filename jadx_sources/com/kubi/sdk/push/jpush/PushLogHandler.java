package com.kubi.sdk.push.jpush;

import cn.jiguang.privates.common.log.JCommonLog;
import com.kubi.sdk.push.exception.JPushException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.push.jpush.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PushLogHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/push/jpush/PushLogHandler;", "Lcn/jiguang/privates/common/log/JCommonLog$ILogHandler;", "<init>", "()V", "d", "", "tag", "", "msg", "i", "w", "e", "issue", "", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PushLogHandler implements JCommonLog.ILogHandler {
    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: d */
    public void mo5434d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97259c("JPUSH", '[' + tag + ']' + msg);
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: e */
    public void mo5435e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C43840a.m96548b("JPUSH", '[' + tag + ']' + msg);
        C44128b.m97261e("JPUSH", '[' + tag + ']' + msg);
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: i */
    public void mo5436i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97266j("JPUSH", '[' + tag + ']' + msg);
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    public void issue(@NotNull String tag, @NotNull String msg, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(e11, "e");
        C44128b.m97262f("JPUSH", '[' + tag + ']' + msg, e11);
        C43846g.m96568c(new JPushException(e11, "JPUSH", false, '[' + tag + ']' + msg, 4, null), null, 2, null);
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: w */
    public void mo5437w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C43840a.m96552g("JPUSH", '[' + tag + ']' + msg);
        C44128b.m97270n("JPUSH", '[' + tag + ']' + msg);
    }
}
