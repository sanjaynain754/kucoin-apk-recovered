package com.facebook;

import android.os.Handler;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5552c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.c */
/* JADX INFO: compiled from: RequestProgress.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R$\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001e"}, m90084d2 = {"Lcom/facebook/c;", "", "Landroid/os/Handler;", "callbackHandler", "Lcom/facebook/GraphRequest;", "request", "<init>", "(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V", "", "size", "", "b", "(J)V", "c", "d", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/os/Handler;", "Lcom/facebook/GraphRequest;", "J", "threshold", "<set-?>", "getProgress", "()J", "progress", "e", "lastReportedProgress", "f", "getMaxProgress", "maxProgress", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5552c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Handler callbackHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final GraphRequest request;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long threshold;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long progress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long lastReportedProgress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long maxProgress;

    /* JADX INFO: renamed from: e */
    public static final void m8442e(GraphRequest.InterfaceC5490b interfaceC5490b, long j11, long j12) {
        ((GraphRequest.InterfaceC5494f) interfaceC5490b).m7702b(j11, j12);
    }

    /* JADX INFO: renamed from: b */
    public final void m8443b(long size) {
        long j11 = this.progress + size;
        this.progress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            m8445d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8444c(long size) {
        this.maxProgress += size;
    }

    /* JADX INFO: renamed from: d */
    public final void m8445d() {
        if (this.progress > this.lastReportedProgress) {
            final GraphRequest.InterfaceC5490b callback = this.request.getCom.tencent.qcloud.tuicore.TUIConstants.TUIChat.CALL_BACK java.lang.String();
            final long j11 = this.maxProgress;
            if (j11 <= 0 || !(callback instanceof GraphRequest.InterfaceC5494f)) {
                return;
            }
            final long j12 = this.progress;
            Handler handler = this.callbackHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: z2.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5552c.m8442e(callback, j12, j11);
                    }
                });
            } else {
                ((GraphRequest.InterfaceC5494f) callback).m7702b(j12, j11);
            }
            this.lastReportedProgress = this.progress;
        }
    }

    public C5552c(@Nullable Handler handler, @NotNull GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.callbackHandler = handler;
        this.request = request;
        this.threshold = C5501a.m7811y();
    }
}
