package shark.internal.hppc;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: shark.internal.hppc.b, reason: from toString */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lshark/internal/hppc/b;", "B", "", "", "first", "second", "<init>", "(ILjava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "b", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getFirst", "Ljava/lang/Object;", "getSecond", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class IntObjectPair<B> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final B second;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: b */
    public final B m98384b() {
        return this.second;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntObjectPair)) {
            return false;
        }
        IntObjectPair intObjectPair = (IntObjectPair) other;
        return this.first == intObjectPair.first && Intrinsics.areEqual(this.second, intObjectPair.second);
    }

    public int hashCode() {
        int i11 = this.first * 31;
        B b11 = this.second;
        return i11 + (b11 != null ? b11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IntObjectPair(first=" + this.first + ", second=" + this.second + ")";
    }

    public IntObjectPair(int i11, B b11) {
        this.first = i11;
        this.second = b11;
    }
}
