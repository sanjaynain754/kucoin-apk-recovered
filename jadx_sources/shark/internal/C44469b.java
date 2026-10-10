package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: shark.internal.b */
/* JADX INFO: compiled from: ByteSubArray.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lshark/internal/b;", "", "", "array", "", "rangeStart", "size", "", "longIdentifiers", "<init>", "([BIIZ)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()B", "", "b", "()J", "c", "()I", "byteCount", "e", "(I)J", "d", "I", "endInclusive", "currentIndex", "[B", "Z", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44469b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int endInclusive;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final byte[] array;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int rangeStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean longIdentifiers;

    /* JADX INFO: renamed from: a */
    public final byte m98322a() {
        int i11 = this.currentIndex;
        this.currentIndex = i11 + 1;
        if (i11 >= 0 && this.endInclusive >= i11) {
            return this.array[this.rangeStart + i11];
        }
        throw new IllegalArgumentException(("Index " + i11 + " should be between 0 and " + this.endInclusive).toString());
    }

    /* JADX INFO: renamed from: b */
    public final long m98323b() {
        return this.longIdentifiers ? m98325d() : m98324c();
    }

    /* JADX INFO: renamed from: c */
    public final int m98324c() {
        int i11 = this.currentIndex;
        this.currentIndex = i11 + 4;
        if (i11 >= 0 && i11 <= this.endInclusive + (-3)) {
            return C44470c.m98327a(this.array, this.rangeStart + i11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i11);
        sb2.append(" should be between 0 and ");
        sb2.append(this.endInclusive - 3);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX INFO: renamed from: d */
    public final long m98325d() {
        int i11 = this.currentIndex;
        this.currentIndex = i11 + 8;
        if (i11 >= 0 && i11 <= this.endInclusive + (-7)) {
            return C44470c.m98328b(this.array, this.rangeStart + i11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i11);
        sb2.append(" should be between 0 and ");
        sb2.append(this.endInclusive - 7);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX INFO: renamed from: e */
    public final long m98326e(int byteCount) {
        int i11 = this.currentIndex;
        this.currentIndex = i11 + byteCount;
        if (!(i11 >= 0 && i11 <= this.endInclusive - (byteCount + (-1)))) {
            throw new IllegalArgumentException(("Index " + i11 + " should be between 0 and " + (this.endInclusive - (byteCount - 1))).toString());
        }
        int i12 = this.rangeStart + i11;
        byte[] bArr = this.array;
        int i13 = (byteCount - 1) * 8;
        long j11 = 0;
        while (i13 >= 8) {
            j11 |= (255 & ((long) bArr[i12])) << i13;
            i13 -= 8;
            i12++;
        }
        return (((long) bArr[i12]) & 255) | j11;
    }

    public C44469b(@NotNull byte[] bArr, int i11, int i12, boolean z11) {
        this.array = bArr;
        this.rangeStart = i11;
        this.longIdentifiers = z11;
        this.endInclusive = i12 - 1;
    }
}
