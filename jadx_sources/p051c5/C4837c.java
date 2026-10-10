package p051c5;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p222e5.InterfaceC37074a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c5.c */
/* JADX INFO: compiled from: AnimationFrameScheduler.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u001eR\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010%\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\f\"\u0004\b$\u0010+R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)¨\u00061"}, m90084d2 = {"Lc5/c;", "", "Le5/a;", "frameScheduler", "<init>", "(Le5/a;)V", "", "i", "()V", "j", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "", "c", "()J", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "e", "d", "Le5/a;", "b", "Z", "g", "(Z)V", "running", "J", "getFrameSchedulingDelayMs", "setFrameSchedulingDelayMs", "(J)V", "frameSchedulingDelayMs", "getFrameSchedulingOffsetMs", "setFrameSchedulingOffsetMs", "frameSchedulingOffsetMs", "pauseTimeMs", "f", "startMs", "expectedRenderTimeMs", "lastFrameAnimationTimeMs", "lastFrameAnimationTimeDifferenceMs", "I", "getLastDrawnFrameNumber", "(I)V", "lastDrawnFrameNumber", "k", "pausedLastDrawnFrameNumber", CmcdData.Factory.STREAM_TYPE_LIVE, "framesDropped", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C4837c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37074a frameScheduler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean running;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long frameSchedulingDelayMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long frameSchedulingOffsetMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long pauseTimeMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long startMs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long expectedRenderTimeMs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long lastFrameAnimationTimeMs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long lastFrameAnimationTimeDifferenceMs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int lastDrawnFrameNumber;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int pausedLastDrawnFrameNumber;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int framesDropped;

    public C4837c(@NotNull InterfaceC37074a frameScheduler) {
        Intrinsics.checkNotNullParameter(frameScheduler, "frameScheduler");
        this.frameScheduler = frameScheduler;
        this.frameSchedulingDelayMs = 8L;
        this.lastDrawnFrameNumber = -1;
        this.pausedLastDrawnFrameNumber = -1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRunning() {
        return this.running;
    }

    /* JADX INFO: renamed from: c */
    public final long m4959c() {
        if (!this.running) {
            return -1L;
        }
        long jMo8829a = this.frameScheduler.mo8829a(m4960d() - this.startMs);
        if (jMo8829a == -1) {
            this.running = false;
            return -1L;
        }
        long j11 = jMo8829a + this.frameSchedulingDelayMs;
        this.expectedRenderTimeMs = this.startMs + j11;
        return j11;
    }

    /* JADX INFO: renamed from: e */
    public final void m4961e() {
        this.framesDropped++;
    }

    /* JADX INFO: renamed from: f */
    public final void m4962f(int i11) {
        this.lastDrawnFrameNumber = i11;
    }

    /* JADX INFO: renamed from: g */
    public final void m4963g(boolean z11) {
        this.running = z11;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4964h() {
        return this.lastDrawnFrameNumber != -1 && m4960d() >= this.expectedRenderTimeMs;
    }

    /* JADX INFO: renamed from: i */
    public final void m4965i() {
        if (this.running) {
            return;
        }
        long jM4960d = m4960d();
        long j11 = jM4960d - this.pauseTimeMs;
        this.startMs = j11;
        this.expectedRenderTimeMs = j11;
        this.lastFrameAnimationTimeMs = jM4960d - this.lastFrameAnimationTimeDifferenceMs;
        this.lastDrawnFrameNumber = this.pausedLastDrawnFrameNumber;
        this.running = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m4966j() {
        if (this.running) {
            long jM4960d = m4960d();
            this.pauseTimeMs = jM4960d - this.startMs;
            this.lastFrameAnimationTimeDifferenceMs = jM4960d - this.lastFrameAnimationTimeMs;
            this.startMs = 0L;
            this.expectedRenderTimeMs = 0L;
            this.lastFrameAnimationTimeMs = -1L;
            this.lastDrawnFrameNumber = -1;
            this.running = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4957a() {
        long jMax;
        long jM4960d = m4960d();
        if (this.running) {
            jMax = (jM4960d - this.startMs) + this.frameSchedulingOffsetMs;
        } else {
            jMax = Math.max(this.lastFrameAnimationTimeMs, 0L);
        }
        int iMo8830b = this.frameScheduler.mo8830b(jMax, this.lastFrameAnimationTimeMs);
        this.lastFrameAnimationTimeMs = jMax;
        return iMo8830b;
    }

    /* JADX INFO: renamed from: d */
    public final long m4960d() {
        return SystemClock.uptimeMillis();
    }
}
