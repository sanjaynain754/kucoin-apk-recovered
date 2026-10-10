package com.kubi.sdk.push.jpush;

import android.util.Log;
import cn.jiguang.privates.common.log.JCommonLog;
import com.kubi.sdk.push.exception.JPushException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.push.jpush.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PushLogHandler.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/push/jpush/BackPushLogHandler;", "Lcn/jiguang/privates/common/log/JCommonLog$ILogHandler;", "debug", "", "<init>", "(Z)V", "d", "", "tag", "", "msg", "i", "w", "e", "issue", "", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BackPushLogHandler implements JCommonLog.ILogHandler {

    /* JADX INFO: renamed from: a */
    public final boolean f47599a;

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: d */
    public void mo5434d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (this.f47599a) {
            Log.d("JPUSH", '[' + tag + ']' + msg);
        }
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: e */
    public void mo5435e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C43840a.m96548b("JPUSH", '[' + tag + ']' + msg);
        if (this.f47599a) {
            Log.e("JPUSH", '[' + tag + ']' + msg);
        }
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: i */
    public void mo5436i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (this.f47599a) {
            Log.i("JPUSH", '[' + tag + ']' + msg);
        }
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    public void issue(@NotNull String tag, @NotNull String msg, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(e11, "e");
        if (this.f47599a) {
            Log.e("JPUSH", '[' + tag + ']' + msg, e11);
        }
        C43846g.m96568c(new JPushException(e11, "JPUSH", false, '[' + tag + ']' + msg, 4, null), null, 2, null);
    }

    @Override // cn.jiguang.privates.common.log.JCommonLog.ILogHandler
    /* JADX INFO: renamed from: w */
    public void mo5437w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C43840a.m96552g("JPUSH", '[' + tag + ']' + msg);
        if (this.f47599a) {
            Log.w("JPUSH", '[' + tag + ']' + msg);
        }
    }

    public BackPushLogHandler(boolean z11) {
        this.f47599a = z11;
    }
}
