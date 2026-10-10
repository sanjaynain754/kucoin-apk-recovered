package com.facebook.fresco.animation.frame;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p222e5.InterfaceC37074a;
import p683v4.InterfaceC45417d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DropFramesFrameScheduler.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u001a"}, m90084d2 = {"Lcom/facebook/fresco/animation/frame/DropFramesFrameScheduler;", "Le5/a;", "Lv4/d;", "animationInformation", "<init>", "(Lv4/d;)V", "", "animationTimeMs", "lastFrameTimeMs", "", "b", "(JJ)I", "d", "()J", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)J", "", "e", "()Z", "timeInCurrentLoopMs", "c", "(J)I", "Lv4/d;", "J", "_loopDurationMs", "Companion", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DropFramesFrameScheduler implements InterfaceC37074a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45417d animationInformation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long _loopDurationMs;

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final int m8831c(long timeInCurrentLoopMs) {
        int i11 = 0;
        long jMo4287i = 0;
        while (true) {
            jMo4287i += (long) this.animationInformation.mo4287i(i11);
            int i12 = i11 + 1;
            if (timeInCurrentLoopMs < jMo4287i) {
                return i11;
            }
            i11 = i12;
        }
    }

    public DropFramesFrameScheduler(@NotNull InterfaceC45417d animationInformation) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.animationInformation = animationInformation;
        this._loopDurationMs = -1L;
    }

    /* JADX INFO: renamed from: d */
    public long m8832d() {
        long j11 = this._loopDurationMs;
        if (j11 != -1) {
            return j11;
        }
        this._loopDurationMs = 0L;
        int iMo4283a = this.animationInformation.mo4283a();
        for (int i11 = 0; i11 < iMo4283a; i11++) {
            this._loopDurationMs += (long) this.animationInformation.mo4287i(i11);
        }
        return this._loopDurationMs;
    }

    /* JADX INFO: renamed from: e */
    public boolean m8833e() {
        return this.animationInformation.mo4284b() == 0;
    }

    @Override // p222e5.InterfaceC37074a
    /* JADX INFO: renamed from: a */
    public long mo8829a(long animationTimeMs) {
        long jM8832d = m8832d();
        long jMo4287i = 0;
        if (jM8832d == 0) {
            return -1L;
        }
        if (!m8833e() && animationTimeMs / jM8832d >= this.animationInformation.mo4284b()) {
            return -1L;
        }
        long j11 = animationTimeMs % jM8832d;
        int iMo4283a = this.animationInformation.mo4283a();
        for (int i11 = 0; i11 < iMo4283a && jMo4287i <= j11; i11++) {
            jMo4287i += (long) this.animationInformation.mo4287i(i11);
        }
        return animationTimeMs + (jMo4287i - j11);
    }

    @Override // p222e5.InterfaceC37074a
    /* JADX INFO: renamed from: b */
    public int mo8830b(long animationTimeMs, long lastFrameTimeMs) {
        long jM8832d = m8832d();
        if (jM8832d == 0) {
            return m8831c(0L);
        }
        if (!m8833e() && animationTimeMs / jM8832d >= this.animationInformation.mo4284b()) {
            return -1;
        }
        return m8831c(animationTimeMs % jM8832d);
    }
}
