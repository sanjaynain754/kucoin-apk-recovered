package p806yq;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: yq.a */
/* JADX INFO: compiled from: FramesInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lyq/a;", "", "", "total", "slow", "frozen", "stutter", "<init>", "(IIII)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "d", "()I", "b", "c", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C46557a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int total;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int slow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int frozen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int stutter;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFrozen() {
        return this.frozen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSlow() {
        return this.slow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStutter() {
        return this.stutter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public C46557a(int i11, int i12, int i13, int i14) {
        this.total = i11;
        this.slow = i12;
        this.frozen = i13;
        this.stutter = i14;
    }
}
