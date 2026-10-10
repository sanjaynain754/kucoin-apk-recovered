package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import bi0.InterfaceC4623a;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import shark.internal.aosp.ByteArrayTimSort;

/* JADX INFO: renamed from: shark.internal.m */
/* JADX INFO: compiled from: UnsortedByteEntries.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00060\rR\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u00060\rR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100¨\u00061"}, m90084d2 = {"Lshark/internal/m;", "", "", "bytesPerValue", "", "longIdentifiers", "initialCapacity", "", "growthFactor", "<init>", "(IZID)V", "", "key", "Lshark/internal/m$a;", "i", "(J)Lshark/internal/m$a;", "Lshark/internal/SortedBytesMap;", "k", "()Lshark/internal/SortedBytesMap;", "", "array", "index", CmcdData.Factory.STREAM_TYPE_LIVE, "([BI)I", "m", "([BI)J", "newCapacity", "", "j", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "bytesPerEntry", "b", "[B", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "c", "Lshark/internal/m$a;", "subArray", "d", "subArrayIndex", "e", "assigned", "f", "currentCapacity", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "Z", "D", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44487m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int bytesPerEntry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public byte[] entries;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final a subArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int subArrayIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int assigned;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int currentCapacity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int bytesPerValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean longIdentifiers;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int initialCapacity;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final double growthFactor;

    /* JADX INFO: renamed from: shark.internal.m$a */
    /* JADX INFO: compiled from: UnsortedByteEntries.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lshark/internal/m$a;", "", "<init>", "(Lshark/internal/m;)V", "", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(B)V", "", "b", "(J)V", "", "c", "(I)V", "byteCount", "e", "(JI)V", "d", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m98428a(byte value) {
            int i11 = C44487m.this.subArrayIndex;
            C44487m.this.subArrayIndex++;
            if (i11 >= 0 && C44487m.this.bytesPerEntry >= i11) {
                int i12 = ((C44487m.this.assigned - 1) * C44487m.this.bytesPerEntry) + i11;
                byte[] bArr = C44487m.this.entries;
                if (bArr == null) {
                    Intrinsics.throwNpe();
                }
                bArr[i12] = value;
                return;
            }
            throw new IllegalArgumentException(("Index " + i11 + " should be between 0 and " + C44487m.this.bytesPerEntry).toString());
        }

        /* JADX INFO: renamed from: b */
        public final void m98429b(long value) {
            if (C44487m.this.longIdentifiers) {
                m98431d(value);
            } else {
                m98430c((int) value);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m98430c(int value) {
            int i11 = C44487m.this.subArrayIndex;
            C44487m.this.subArrayIndex += 4;
            if (!(i11 >= 0 && i11 <= C44487m.this.bytesPerEntry + (-4))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Index ");
                sb2.append(i11);
                sb2.append(" should be between 0 and ");
                sb2.append(C44487m.this.bytesPerEntry - 4);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            int i12 = ((C44487m.this.assigned - 1) * C44487m.this.bytesPerEntry) + i11;
            byte[] bArr = C44487m.this.entries;
            if (bArr == null) {
                Intrinsics.throwNpe();
            }
            bArr[i12] = (byte) ((value >>> 24) & 255);
            bArr[i12 + 1] = (byte) ((value >>> 16) & 255);
            bArr[i12 + 2] = (byte) ((value >>> 8) & 255);
            bArr[i12 + 3] = (byte) (value & 255);
        }

        /* JADX INFO: renamed from: d */
        public final void m98431d(long value) {
            int i11 = C44487m.this.subArrayIndex;
            C44487m.this.subArrayIndex += 8;
            if (!(i11 >= 0 && i11 <= C44487m.this.bytesPerEntry - 8)) {
                throw new IllegalArgumentException(("Index " + i11 + " should be between 0 and " + (C44487m.this.bytesPerEntry - 8)).toString());
            }
            int i12 = ((C44487m.this.assigned - 1) * C44487m.this.bytesPerEntry) + i11;
            byte[] bArr = C44487m.this.entries;
            if (bArr == null) {
                Intrinsics.throwNpe();
            }
            bArr[i12] = (byte) ((value >>> 56) & 255);
            bArr[i12 + 1] = (byte) ((value >>> 48) & 255);
            bArr[i12 + 2] = (byte) ((value >>> 40) & 255);
            bArr[i12 + 3] = (byte) ((value >>> 32) & 255);
            bArr[i12 + 4] = (byte) ((value >>> 24) & 255);
            bArr[i12 + 5] = (byte) ((value >>> 16) & 255);
            bArr[i12 + 6] = (byte) ((value >>> 8) & 255);
            bArr[i12 + 7] = (byte) (value & 255);
        }

        /* JADX INFO: renamed from: e */
        public final void m98432e(long value, int byteCount) {
            int i11 = C44487m.this.subArrayIndex;
            C44487m.this.subArrayIndex += byteCount;
            if (!(i11 >= 0 && i11 <= C44487m.this.bytesPerEntry - byteCount)) {
                throw new IllegalArgumentException(("Index " + i11 + " should be between 0 and " + (C44487m.this.bytesPerEntry - byteCount)).toString());
            }
            int i12 = ((C44487m.this.assigned - 1) * C44487m.this.bytesPerEntry) + i11;
            byte[] bArr = C44487m.this.entries;
            if (bArr == null) {
                Intrinsics.throwNpe();
            }
            int i13 = (byteCount - 1) * 8;
            while (i13 >= 8) {
                bArr[i12] = (byte) (255 & (value >>> i13));
                i13 -= 8;
                i12++;
            }
            bArr[i12] = (byte) (value & 255);
        }
    }

    /* JADX INFO: renamed from: shark.internal.m$b */
    /* JADX INFO: compiled from: UnsortedByteEntries.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"shark/internal/m$b", "Lbi0/a;", "", "entrySize", "", "o1Array", "o1Index", "o2Array", "o2Index", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I[BI[BI)I", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class b implements InterfaceC4623a {
        public b() {
        }

        @Override // bi0.InterfaceC4623a
        /* JADX INFO: renamed from: a */
        public int mo4549a(int entrySize, @NotNull byte[] o1Array, int o1Index, @NotNull byte[] o2Array, int o2Index) {
            return C44487m.this.longIdentifiers ? (C44487m.this.m98427m(o1Array, o1Index * entrySize) > C44487m.this.m98427m(o2Array, o2Index * entrySize) ? 1 : (C44487m.this.m98427m(o1Array, o1Index * entrySize) == C44487m.this.m98427m(o2Array, o2Index * entrySize) ? 0 : -1)) : Intrinsics.compare(C44487m.this.m98426l(o1Array, o1Index * entrySize), C44487m.this.m98426l(o2Array, o2Index * entrySize));
        }
    }

    public C44487m(int i11, boolean z11, int i12, double d11) {
        this.bytesPerValue = i11;
        this.longIdentifiers = z11;
        this.initialCapacity = i12;
        this.growthFactor = d11;
        this.bytesPerEntry = i11 + (z11 ? 8 : 4);
        this.subArray = new a();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final a m98423i(long key) {
        if (this.entries == null) {
            int i11 = this.initialCapacity;
            this.currentCapacity = i11;
            this.entries = new byte[i11 * this.bytesPerEntry];
        } else {
            int i12 = this.currentCapacity;
            if (i12 == this.assigned) {
                int i13 = (int) (((double) i12) * this.growthFactor);
                m98424j(i13);
                this.currentCapacity = i13;
            }
        }
        this.assigned++;
        this.subArrayIndex = 0;
        this.subArray.m98429b(key);
        return this.subArray;
    }

    /* JADX INFO: renamed from: j */
    public final void m98424j(int newCapacity) {
        int i11 = this.bytesPerEntry;
        byte[] bArr = new byte[newCapacity * i11];
        System.arraycopy(this.entries, 0, bArr, 0, this.assigned * i11);
        this.entries = bArr;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final SortedBytesMap m98425k() {
        if (this.assigned == 0) {
            return new SortedBytesMap(this.longIdentifiers, this.bytesPerValue, new byte[0]);
        }
        byte[] bArrCopyOf = this.entries;
        if (bArrCopyOf == null) {
            Intrinsics.throwNpe();
        }
        ByteArrayTimSort.INSTANCE.sort(bArrCopyOf, 0, this.assigned, this.bytesPerEntry, new b());
        int length = bArrCopyOf.length;
        int i11 = this.assigned;
        int i12 = this.bytesPerEntry;
        if (length > i11 * i12) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11 * i12);
            Intrinsics.checkExpressionValueIsNotNull(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        }
        this.entries = null;
        this.assigned = 0;
        return new SortedBytesMap(this.longIdentifiers, this.bytesPerValue, bArrCopyOf);
    }

    /* JADX INFO: renamed from: l */
    public final int m98426l(byte[] array, int index) {
        int i11 = ((array[index + 1] & 255) << 16) | ((array[index] & 255) << 24);
        return (array[index + 3] & 255) | i11 | ((array[index + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: m */
    public final long m98427m(byte[] array, int index) {
        long j11 = ((((long) array[index]) & 255) << 56) | ((((long) array[index + 1]) & 255) << 48) | ((((long) array[index + 2]) & 255) << 40) | ((((long) array[index + 3]) & 255) << 32) | ((((long) array[index + 4]) & 255) << 24) | ((((long) array[index + 5]) & 255) << 16);
        return (((long) array[index + 7]) & 255) | j11 | ((((long) array[index + 6]) & 255) << 8);
    }

    public /* synthetic */ C44487m(int i11, boolean z11, int i12, double d11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11, (i13 & 4) != 0 ? 4 : i12, (i13 & 8) != 0 ? 2.0d : d11);
    }
}
