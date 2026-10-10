package shark.internal.hppc;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: shark.internal.hppc.c, reason: from toString */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lshark/internal/hppc/c;", "", "", "first", "second", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "b", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class LongLongPair {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long second;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSecond() {
        return this.second;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LongLongPair)) {
            return false;
        }
        LongLongPair longLongPair = (LongLongPair) other;
        return this.first == longLongPair.first && this.second == longLongPair.second;
    }

    public int hashCode() {
        long j11 = this.first;
        int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
        long j12 = this.second;
        return i11 + ((int) ((j12 >>> 32) ^ j12));
    }

    @NotNull
    public String toString() {
        return "LongLongPair(first=" + this.first + ", second=" + this.second + ")";
    }

    public LongLongPair(long j11, long j12) {
        this.first = j11;
        this.second = j12;
    }
}
