package p345ik;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ik.e */
/* JADX INFO: compiled from: SuccessRateEvaluator.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, m90084d2 = {"Lik/e;", "", "", "windowSize", "<init>", "(J)V", "", "success", "Lik/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Z)Lik/f;", "", "b", "()V", "J", "windowSuccessCount", "c", "windowTotalCount", "d", "totalSuccessCount", "e", "totalRequestCount", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38657e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long windowSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long windowSuccessCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long windowTotalCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long totalSuccessCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long totalRequestCount;

    public C38657e(long j11) {
        this.windowSize = j11;
    }

    public /* synthetic */ C38657e(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 500L : j11);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final SuccessRateStats m87393a(boolean success) {
        if (success) {
            this.windowSuccessCount++;
            this.totalSuccessCount++;
        }
        long j11 = this.windowTotalCount + 1;
        this.windowTotalCount = j11;
        long j12 = this.totalRequestCount + 1;
        this.totalRequestCount = j12;
        if (j11 < this.windowSize) {
            return null;
        }
        double d11 = this.windowSuccessCount / j11;
        double d12 = this.totalSuccessCount / j12;
        m87394b();
        return new SuccessRateStats(d11, d12);
    }

    /* JADX INFO: renamed from: b */
    public final void m87394b() {
        this.windowSuccessCount = 0L;
        this.windowTotalCount = 0L;
    }
}
