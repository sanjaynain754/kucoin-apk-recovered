package com.kubi.sdk.web.helper;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebCoreException;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.web.helper.b */
/* JADX INFO: compiled from: TimeoutWatcher.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/web/helper/b;", "", "Lkotlin/Function0;", "", "timeoutAction", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "d", "()V", "f", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function0;", "", "b", "J", "()J", "c", "(J)V", "timeoutSecond", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "getFuture", "()Ljava/util/concurrent/Future;", "setFuture", "(Ljava/util/concurrent/Future;)V", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTimeoutWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeoutWatcher.kt\ncom/kubi/sdk/web/helper/TimeoutWatcher\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,39:1\n86#2,3:40\n86#2,3:43\n*S KotlinDebug\n*F\n+ 1 TimeoutWatcher.kt\ncom/kubi/sdk/web/helper/TimeoutWatcher\n*L\n27#1:40,3\n36#1:43,3\n*E\n"})
public final class C24306b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> timeoutAction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long timeoutSecond;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Future<?> future;

    /* JADX INFO: renamed from: f */
    public final void m58697f() {
        try {
            Future<?> future = this.future;
            if (future != null) {
                future.cancel(false);
            }
            this.future = null;
        } catch (Throwable th2) {
            C43846g.m96568c(new WebCoreException(th2, "TimeoutWatcher", false, "cancel failed", 4, null), null, 2, null);
        }
    }

    public C24306b(@NotNull Function0<Unit> timeoutAction) {
        Intrinsics.checkNotNullParameter(timeoutAction, "timeoutAction");
        this.timeoutAction = timeoutAction;
    }

    /* JADX INFO: renamed from: e */
    public static final void m58693e(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimeoutSecond() {
        return this.timeoutSecond;
    }

    /* JADX INFO: renamed from: c */
    public final void m58695c(long j11) {
        this.timeoutSecond = j11;
    }

    /* JADX INFO: renamed from: d */
    public final void m58696d() {
        if (this.timeoutSecond > 0 && this.future == null) {
            try {
                ScheduledExecutorService scheduledExecutorServiceM94136b = C42917g.m94136b();
                final Function0<Unit> function0 = this.timeoutAction;
                this.future = scheduledExecutorServiceM94136b.schedule(new Runnable() { // from class: com.kubi.sdk.web.helper.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C24306b.m58693e(function0);
                    }
                }, this.timeoutSecond, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                C43846g.m96568c(new WebCoreException(th2, "TimeoutWatcher", false, "schedule failed", 4, null), null, 2, null);
            }
        }
    }
}
