package shark.internal.hppc;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: shark.internal.hppc.d, reason: from toString */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lshark/internal/hppc/d;", "B", "", "", "first", "second", "<init>", "(JLjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class LongObjectPair<B> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final B second;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: b */
    public final B m98388b() {
        return this.second;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LongObjectPair)) {
            return false;
        }
        LongObjectPair longObjectPair = (LongObjectPair) other;
        return this.first == longObjectPair.first && Intrinsics.areEqual(this.second, longObjectPair.second);
    }

    public int hashCode() {
        long j11 = this.first;
        int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
        B b11 = this.second;
        return i11 + (b11 != null ? b11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LongObjectPair(first=" + this.first + ", second=" + this.second + ")";
    }

    public LongObjectPair(long j11, B b11) {
        this.first = j11;
        this.second = b11;
    }
}
