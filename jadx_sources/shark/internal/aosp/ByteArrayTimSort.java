package shark.internal.aosp;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bi0.InterfaceC4623a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ByteArrayTimSort.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001*B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\n\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e¨\u0006+"}, m90084d2 = {"Lshark/internal/aosp/ByteArrayTimSort;", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lbi0/a;", "c", "", "entrySize", "<init>", "([BLbi0/a;I)V", "runBase", "runLen", "", "m", "(II)V", "i", "()V", "j", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)V", "base1", "len1", "base2", "len2", CmcdData.Factory.STREAM_TYPE_LIVE, "(IIII)V", "k", "minCapacity", "g", "(I)[B", "I", "minGallop", "b", "[B", "tmp", "stackSize", "", "d", "[I", "e", "f", "Lbi0/a;", "Companion", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class ByteArrayTimSort {

    /* JADX INFO: renamed from: l */
    public static final boolean f98406l = false;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int minGallop;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public byte[] tmp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int stackSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int[] runBase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int[] runLen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final byte[] a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final InterfaceC4623a c;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int entrySize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final int f98403i = 32;

    /* JADX INFO: renamed from: j */
    public static final int f98404j = 7;

    /* JADX INFO: renamed from: k */
    public static final int f98405k = 256;

    /* JADX INFO: compiled from: ByteArrayTimSort.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0005\u0010\u0015J7\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0016J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!JO\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006*"}, m90084d2 = {"Lshark/internal/aosp/ByteArrayTimSort$Companion;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "entrySize", "Lbi0/a;", "c", "", "sort", "([BILbi0/a;)V", "lo", "hi", "([BIIILbi0/a;)V", "len", "start", "end", "b", "(III)V", "([BIIIILbi0/a;)V", "([BIIILbi0/a;)I", "g", "([BIII)V", "n", "f", "(I)I", "keyArray", "keyIndex", TtmlNode.RUBY_BASE, "hint", "d", "([BI[BIIIILbi0/a;)I", "e", "", "DEBUG", "Z", "INITIAL_TMP_STORAGE_LENGTH", "I", "MIN_GALLOP", "MIN_MERGE", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public final void sort(@NotNull byte[] a11, int entrySize, @NotNull InterfaceC4623a c11) {
            sort(a11, 0, a11.length / entrySize, entrySize, c11);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final void m98316b(int len, int start, int end) {
            if (start < 0 || end > len) {
                throw new ArrayIndexOutOfBoundsException("start < 0 || end > len. start=" + start + ", end=" + end + ", len=" + len);
            }
            if (start <= end) {
                return;
            }
            throw new IllegalArgumentException("start > end: " + start + " > " + end);
        }

        /* JADX INFO: renamed from: d */
        public final int m98318d(byte[] keyArray, int keyIndex, byte[] a11, int base, int len, int hint, int entrySize, InterfaceC4623a c11) {
            int i11;
            int i12;
            boolean unused = ByteArrayTimSort.f98406l;
            int i13 = base + hint;
            if (c11.mo4549a(entrySize, keyArray, keyIndex, a11, i13) > 0) {
                int i14 = len - hint;
                int i15 = 0;
                int i16 = 1;
                while (i16 < i14 && c11.mo4549a(entrySize, keyArray, keyIndex, a11, i13 + i16) > 0) {
                    int i17 = (i16 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i15 = i16;
                    i16 = i18;
                }
                if (i16 <= i14) {
                    i14 = i16;
                }
                i11 = i15 + hint;
                i12 = i14 + hint;
            } else {
                int i19 = hint + 1;
                int i21 = 0;
                int i22 = 1;
                while (i22 < i19 && c11.mo4549a(entrySize, keyArray, keyIndex, a11, i13 - i22) <= 0) {
                    int i23 = (i22 * 2) + 1;
                    if (i23 <= 0) {
                        i23 = i19;
                    }
                    int i24 = i23;
                    i21 = i22;
                    i22 = i24;
                }
                if (i22 <= i19) {
                    i19 = i22;
                }
                int i25 = hint - i21;
                i11 = hint - i19;
                i12 = i25;
            }
            if (ByteArrayTimSort.f98406l) {
            }
            int i26 = i11 + 1;
            while (i26 < i12) {
                int i27 = ((i12 - i26) >>> 1) + i26;
                if (c11.mo4549a(entrySize, keyArray, keyIndex, a11, base + i27) > 0) {
                    i26 = i27 + 1;
                } else {
                    i12 = i27;
                }
            }
            boolean unused2 = ByteArrayTimSort.f98406l;
            return i12;
        }

        /* JADX INFO: renamed from: e */
        public final int m98319e(byte[] keyArray, int keyIndex, byte[] a11, int base, int len, int hint, int entrySize, InterfaceC4623a c11) {
            int i11;
            int i12;
            boolean unused = ByteArrayTimSort.f98406l;
            int i13 = base + hint;
            if (c11.mo4549a(entrySize, keyArray, keyIndex, a11, i13) < 0) {
                int i14 = hint + 1;
                int i15 = 0;
                int i16 = 1;
                while (i16 < i14 && c11.mo4549a(entrySize, keyArray, keyIndex, a11, i13 - i16) < 0) {
                    int i17 = (i16 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i15 = i16;
                    i16 = i18;
                }
                if (i16 <= i14) {
                    i14 = i16;
                }
                i12 = hint - i14;
                i11 = hint - i15;
            } else {
                int i19 = len - hint;
                int i21 = 0;
                int i22 = 1;
                while (i22 < i19 && c11.mo4549a(entrySize, keyArray, keyIndex, a11, i13 + i22) >= 0) {
                    int i23 = (i22 * 2) + 1;
                    if (i23 <= 0) {
                        i23 = i19;
                    }
                    int i24 = i23;
                    i21 = i22;
                    i22 = i24;
                }
                if (i22 <= i19) {
                    i19 = i22;
                }
                i11 = hint + i19;
                i12 = i21 + hint;
            }
            if (ByteArrayTimSort.f98406l) {
            }
            int i25 = i12 + 1;
            while (i25 < i11) {
                int i26 = ((i11 - i25) >>> 1) + i25;
                if (c11.mo4549a(entrySize, keyArray, keyIndex, a11, base + i26) < 0) {
                    i11 = i26;
                } else {
                    i25 = i26 + 1;
                }
            }
            boolean unused2 = ByteArrayTimSort.f98406l;
            return i11;
        }

        /* JADX INFO: renamed from: g */
        public final void m98321g(byte[] a11, int lo2, int hi2, int entrySize) {
            while (true) {
                hi2--;
                if (lo2 >= hi2) {
                    return;
                }
                int i11 = lo2 * entrySize;
                int i12 = hi2 * entrySize;
                for (int i13 = 0; i13 < entrySize; i13++) {
                    int i14 = i11 + i13;
                    byte b11 = a11[i14];
                    int i15 = i12 + i13;
                    a11[i14] = a11[i15];
                    a11[i15] = b11;
                }
                lo2++;
            }
        }

        public final void sort(@NotNull byte[] a11, int lo2, int hi2, int entrySize, @NotNull InterfaceC4623a c11) {
            m98316b(a11.length / entrySize, lo2, hi2);
            int i11 = hi2 - lo2;
            if (i11 < 2) {
                return;
            }
            if (i11 < ByteArrayTimSort.f98403i) {
                m98315a(a11, lo2, hi2, lo2 + m98317c(a11, lo2, hi2, entrySize, c11), entrySize, c11);
                return;
            }
            int i12 = hi2;
            int i13 = entrySize;
            InterfaceC4623a interfaceC4623a = c11;
            ByteArrayTimSort byteArrayTimSort = new ByteArrayTimSort(a11, interfaceC4623a, i13, null);
            int iM98320f = m98320f(i11);
            int i14 = lo2;
            while (true) {
                int i15 = i13;
                InterfaceC4623a interfaceC4623a2 = interfaceC4623a;
                int iM98317c = m98317c(a11, i14, i12, i15, interfaceC4623a2);
                int i16 = i12;
                interfaceC4623a = interfaceC4623a2;
                i13 = i15;
                if (iM98317c < iM98320f) {
                    int i17 = i11 <= iM98320f ? i11 : iM98320f;
                    m98315a(a11, i14, i14 + i17, i14 + iM98317c, i13, interfaceC4623a);
                    iM98317c = i17;
                }
                byteArrayTimSort.m98314m(i14, iM98317c);
                byteArrayTimSort.m98310i();
                int i18 = i14 + iM98317c;
                i11 -= iM98317c;
                if (i11 == 0) {
                    break;
                }
                i12 = i16;
                i14 = i18;
            }
            boolean unused = ByteArrayTimSort.f98406l;
            byteArrayTimSort.m98311j();
            if (ByteArrayTimSort.f98406l) {
                int unused2 = byteArrayTimSort.stackSize;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m98315a(byte[] a11, int lo2, int hi2, int start, int entrySize, InterfaceC4623a c11) {
            boolean unused = ByteArrayTimSort.f98406l;
            if (start == lo2) {
                start++;
            }
            byte[] bArr = new byte[entrySize];
            while (start < hi2) {
                int i11 = start * entrySize;
                for (int i12 = 0; i12 < entrySize; i12++) {
                    bArr[i12] = a11[i11 + i12];
                }
                boolean unused2 = ByteArrayTimSort.f98406l;
                int i13 = lo2;
                int i14 = start;
                while (i13 < i14) {
                    int i15 = (i13 + i14) >>> 1;
                    byte[] bArr2 = a11;
                    int i16 = entrySize;
                    InterfaceC4623a interfaceC4623a = c11;
                    if (interfaceC4623a.mo4549a(i16, bArr, 0, bArr2, i15) < 0) {
                        i14 = i15;
                    } else {
                        i13 = i15 + 1;
                    }
                    c11 = interfaceC4623a;
                    entrySize = i16;
                    a11 = bArr2;
                }
                byte[] bArr3 = a11;
                int i17 = entrySize;
                InterfaceC4623a interfaceC4623a2 = c11;
                boolean unused3 = ByteArrayTimSort.f98406l;
                int i18 = start - i13;
                if (i18 != 1) {
                    if (i18 != 2) {
                        System.arraycopy(bArr3, i13 * i17, bArr3, (i13 + 1) * i17, i18 * i17);
                    } else {
                        int i19 = i13 * i17;
                        int i21 = (i13 + 1) * i17;
                        int i22 = (i13 + 2) * i17;
                        for (int i23 = 0; i23 < i17; i23++) {
                            bArr3[i22 + i23] = bArr3[i21 + i23];
                        }
                        for (int i24 = 0; i24 < i17; i24++) {
                            bArr3[i21 + i24] = bArr3[i19 + i24];
                        }
                    }
                } else {
                    int i25 = i13 * i17;
                    int i26 = (i13 + 1) * i17;
                    for (int i27 = 0; i27 < i17; i27++) {
                        bArr3[i26 + i27] = bArr3[i25 + i27];
                    }
                }
                int i28 = i13 * i17;
                for (int i29 = 0; i29 < i17; i29++) {
                    bArr3[i28 + i29] = bArr[i29];
                }
                start++;
                c11 = interfaceC4623a2;
                entrySize = i17;
                a11 = bArr3;
            }
        }

        /* JADX INFO: renamed from: c */
        public final int m98317c(byte[] a11, int lo2, int hi2, int entrySize, InterfaceC4623a c11) {
            boolean unused = ByteArrayTimSort.f98406l;
            int i11 = lo2 + 1;
            if (i11 == hi2) {
                return 1;
            }
            int iMo4549a = c11.mo4549a(entrySize, a11, i11, a11, lo2);
            int i12 = lo2 + 2;
            if (iMo4549a < 0) {
                while (i12 < hi2 && c11.mo4549a(entrySize, a11, i12, a11, i12 - 1) < 0) {
                    i12++;
                }
                m98321g(a11, lo2, i12, entrySize);
            } else {
                while (i12 < hi2 && c11.mo4549a(entrySize, a11, i12, a11, i12 - 1) >= 0) {
                    i12++;
                }
            }
            return i12 - lo2;
        }

        /* JADX INFO: renamed from: f */
        public final int m98320f(int n11) {
            boolean unused = ByteArrayTimSort.f98406l;
            int i11 = 0;
            while (n11 >= ByteArrayTimSort.f98403i) {
                i11 |= n11 & 1;
                n11 >>= 1;
            }
            return n11 + i11;
        }
    }

    public /* synthetic */ ByteArrayTimSort(byte[] bArr, InterfaceC4623a interfaceC4623a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, interfaceC4623a, i11);
    }

    public ByteArrayTimSort(byte[] bArr, InterfaceC4623a interfaceC4623a, int i11) {
        this.a = bArr;
        this.c = interfaceC4623a;
        this.entrySize = i11;
        this.minGallop = f98404j;
        int length = bArr.length / i11;
        int i12 = f98405k;
        this.tmp = new byte[i11 * (length < i12 * 2 ? length >>> 1 : i12)];
        int i13 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.runBase = new int[i13];
        this.runLen = new int[i13];
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m98308g(int minCapacity) {
        byte[] bArr = this.tmp;
        if (bArr == null) {
            Intrinsics.throwNpe();
        }
        int length = bArr.length;
        int i11 = this.entrySize;
        if (length < minCapacity * i11) {
            int i12 = (minCapacity >> 1) | minCapacity;
            int i13 = i12 | (i12 >> 2);
            int i14 = i13 | (i13 >> 4);
            int i15 = i14 | (i14 >> 8);
            int i16 = (i15 | (i15 >> 16)) + 1;
            if (i16 >= 0) {
                minCapacity = Math.min(i16, (this.a.length / i11) >>> 1);
            }
            this.tmp = new byte[minCapacity * this.entrySize];
        }
        byte[] bArr2 = this.tmp;
        if (bArr2 == null) {
            Intrinsics.throwNpe();
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: h */
    public final void m98309h(int i11) {
        byte[] bArr;
        int iM98318d;
        if (f98406l) {
            int i12 = this.stackSize;
            if (i11 != i12 - 2) {
                int i13 = i12 - 3;
            }
        }
        int[] iArr = this.runBase;
        int i14 = iArr[i11];
        int[] iArr2 = this.runLen;
        int i15 = iArr2[i11];
        int i16 = i11 + 1;
        int i17 = iArr[i16];
        int i18 = iArr2[i16];
        iArr2[i11] = i15 + i18;
        int i19 = this.stackSize;
        if (i11 == i19 - 3) {
            int i21 = i11 + 2;
            iArr[i16] = iArr[i21];
            iArr2[i16] = iArr2[i21];
        }
        this.stackSize = i19 - 1;
        Companion companion = INSTANCE;
        byte[] bArr2 = this.a;
        int iM98319e = companion.m98319e(bArr2, i17, bArr2, i14, i15, 0, this.entrySize, this.c);
        int i22 = i14 + iM98319e;
        int i23 = i15 - iM98319e;
        if (i23 == 0 || (iM98318d = companion.m98318d((bArr = this.a), (i22 + i23) - 1, bArr, i17, i18, i18 - 1, this.entrySize, this.c)) == 0) {
            return;
        }
        if (i23 <= iM98318d) {
            m98313l(i22, i23, i17, iM98318d);
        } else {
            m98312k(i22, i23, i17, iM98318d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: i */
    public final void m98310i() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        while (true) {
            int i11 = this.stackSize;
            if (i11 <= 1) {
                return;
            }
            int i12 = i11 - 2;
            if (i12 >= 1) {
                int[] iArr4 = this.runLen;
                if (iArr4[i11 - 3] > iArr4[i12] + iArr4[i11 - 1]) {
                    if (i12 >= 2) {
                        iArr2 = this.runLen;
                        if (iArr2[i11 - 4] <= iArr2[i12] + iArr2[i11 - 3]) {
                            iArr3 = this.runLen;
                            if (iArr3[i11 - 3] < iArr3[i11 - 1]) {
                                i12 = i11 - 3;
                            }
                        }
                    }
                    iArr = this.runLen;
                    if (iArr[i12] > iArr[i11 - 1]) {
                        return;
                    }
                } else {
                    iArr3 = this.runLen;
                    if (iArr3[i11 - 3] < iArr3[i11 - 1]) {
                        i12 = i11 - 3;
                    }
                }
            } else {
                if (i12 >= 2) {
                    iArr2 = this.runLen;
                    if (iArr2[i11 - 4] <= iArr2[i12] + iArr2[i11 - 3]) {
                        iArr3 = this.runLen;
                        if (iArr3[i11 - 3] < iArr3[i11 - 1]) {
                            i12 = i11 - 3;
                        }
                    }
                }
                iArr = this.runLen;
                if (iArr[i12] > iArr[i11 - 1]) {
                    return;
                }
            }
            m98309h(i12);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m98311j() {
        while (true) {
            int i11 = this.stackSize;
            if (i11 <= 1) {
                return;
            }
            int i12 = i11 - 2;
            if (i12 > 0) {
                int[] iArr = this.runLen;
                if (iArr[i11 - 3] < iArr[i11 - 1]) {
                    i12 = i11 - 3;
                }
            }
            m98309h(i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101 A[LOOP:6: B:47:0x00ff->B:48:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e A[LOOP:7: B:60:0x014c->B:61:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bd A[LOOP:5: B:40:0x00c4->B:90:0x01bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2 A[LOOP:3: B:21:0x006f->B:91:0x01c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0161 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m98312k(int base1, int len1, int base2, int len2) {
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        int i16;
        byte[] bArr2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int iM98318d;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z11;
        boolean z12;
        int i31;
        int i32;
        int i33 = len2;
        if (f98406l && len1 > 0 && i33 > 0) {
            int i34 = base1 + len1;
        }
        byte[] bArr3 = this.a;
        byte[] bArrM98308g = m98308g(i33);
        int i35 = this.entrySize;
        int i36 = i33 * i35;
        int i37 = 0;
        System.arraycopy(bArr3, base2 * i35, bArrM98308g, 0, i36);
        int i38 = base1 + len1;
        int i39 = i33 - 1;
        int i41 = base2 + i33;
        int i42 = (i41 - 1) * i35;
        int i43 = (i38 - 1) * i35;
        for (int i44 = 0; i44 < i35; i44++) {
            bArr3[i42 + i44] = bArr3[i43 + i44];
        }
        int i45 = i41 - 2;
        int i46 = i38 - 2;
        int i47 = len1 - 1;
        if (i47 == 0) {
            System.arraycopy(bArrM98308g, 0, bArr3, (i45 - i39) * i35, i36);
            return;
        }
        int i48 = 1;
        if (i33 == 1) {
            int i49 = i45 - i47;
            System.arraycopy(bArr3, ((i46 - i47) + 1) * i35, bArr3, (i49 + 1) * i35, i47 * i35);
            int i51 = i49 * i35;
            int i52 = i39 * i35;
            while (i37 < i35) {
                bArr3[i51 + i37] = bArrM98308g[i52 + i37];
                i37++;
            }
            return;
        }
        InterfaceC4623a interfaceC4623a = this.c;
        int i53 = this.minGallop;
        loop2: while (true) {
            i11 = i46;
            i12 = i47;
            i13 = i39;
            int i54 = i37;
            int i55 = i54;
            while (true) {
                boolean z13 = f98406l;
                byte[] bArr4 = bArr3;
                int i56 = i35;
                InterfaceC4623a interfaceC4623a2 = interfaceC4623a;
                int iMo4549a = interfaceC4623a2.mo4549a(i56, bArrM98308g, i13, bArr4, i11);
                interfaceC4623a = interfaceC4623a2;
                i35 = i56;
                bArr3 = bArr4;
                if (iMo4549a < 0) {
                    int i57 = i45 * i35;
                    int i58 = i11 * i35;
                    while (i37 < i35) {
                        bArr3[i57 + i37] = bArr3[i58 + i37];
                        i37++;
                    }
                    i45--;
                    i11--;
                    i54 += i48;
                    i12--;
                    if (i12 == 0) {
                        bArr = bArrM98308g;
                        break loop2;
                    }
                    i55 = 0;
                    if ((i54 | i55) >= i53) {
                        int i59 = i11;
                        i14 = i12;
                        i15 = i59;
                        i53 = i53;
                        while (true) {
                            boolean z14 = f98406l;
                            i16 = i13;
                            byte[] bArr5 = bArr3;
                            bArr2 = bArrM98308g;
                            int iM98319e = INSTANCE.m98319e(bArr2, i16, bArr5, base1, i14, i14 - 1, i35, interfaceC4623a);
                            bArr3 = bArr5;
                            i17 = i14 - iM98319e;
                            if (i17 != 0) {
                                i45 -= i17;
                                int i61 = i15 - i17;
                                i32 = i14 - i17;
                                System.arraycopy(bArr3, (i61 + 1) * i35, bArr3, (i45 + 1) * i35, i17 * i35);
                                i11 = i61;
                                i12 = i32;
                                if (i32 == 0) {
                                    bArr = bArr2;
                                    i53 = i53;
                                    i13 = i16;
                                    break loop2;
                                }
                            } else {
                                int i62 = i14;
                                i11 = i15;
                                i12 = i62;
                            }
                            i18 = i45 * i35;
                            i19 = i16 * i35;
                            for (i21 = 0; i21 < i35; i21++) {
                                bArr3[i18 + i21] = bArr2[i19 + i21];
                            }
                            i45--;
                            i22 = i16 - 1;
                            i23 = i11;
                            i24 = i33 - 1;
                            if (i24 == i48) {
                                bArr = bArr2;
                                i33 = i24;
                                i13 = i22;
                            } else {
                                bArr = bArr2;
                                iM98318d = i24 - INSTANCE.m98318d(bArr3, i23, bArr2, 0, i24, i33 - 2, i35, interfaceC4623a);
                                if (iM98318d != 0) {
                                    i31 = i45 - iM98318d;
                                    i13 = i22 - iM98318d;
                                    i25 = i24 - iM98318d;
                                    System.arraycopy(bArr, (i13 + 1) * i35, bArr3, (i31 + 1) * i35, iM98318d * i35);
                                    if (i25 <= i48) {
                                        i45 = i31;
                                        i11 = i23;
                                        i33 = i25;
                                        i53 = i53;
                                        break loop2;
                                    }
                                } else {
                                    i25 = i24;
                                    i13 = i22;
                                }
                                i45 = i31;
                                i26 = i45 * i35;
                                i27 = i23 * i35;
                                for (i28 = 0; i28 < i35; i28++) {
                                    bArr3[i26 + i28] = bArr3[i27 + i28];
                                }
                                i45--;
                                i23--;
                                i14 = i12 - 1;
                                if (i14 == 0) {
                                    i33 = i25;
                                    i12 = i14;
                                    i48 = 1;
                                } else {
                                    i48 = 1;
                                    i53--;
                                    i29 = f98404j;
                                    if (i17 >= i29) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iM98318d >= i29) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12 || z11) {
                                        i15 = i23;
                                        i33 = i25;
                                        bArrM98308g = bArr;
                                    } else {
                                        if (i53 < 0) {
                                            i53 = 0;
                                        }
                                        i53 += 2;
                                        i37 = 0;
                                        i46 = i23;
                                        i33 = i25;
                                        bArrM98308g = bArr;
                                        i39 = i13;
                                        i47 = i14;
                                    }
                                }
                            }
                            i11 = i23;
                            break loop2;
                        }
                    }
                    i37 = 0;
                } else {
                    int i63 = i45 * i35;
                    int i64 = i13 * i35;
                    for (int i65 = 0; i65 < i35; i65++) {
                        bArr3[i63 + i65] = bArrM98308g[i64 + i65];
                    }
                    i45--;
                    i13--;
                    i55++;
                    i33--;
                    if (i33 == i48) {
                        bArr = bArrM98308g;
                        break loop2;
                    }
                    i54 = 0;
                    if ((i54 | i55) >= i53) {
                        int i510 = i11;
                        i14 = i12;
                        i15 = i510;
                        i53 = i53;
                        while (true) {
                            boolean z15 = f98406l;
                            i16 = i13;
                            byte[] bArr6 = bArr3;
                            bArr2 = bArrM98308g;
                            int iM98319e2 = INSTANCE.m98319e(bArr2, i16, bArr6, base1, i14, i14 - 1, i35, interfaceC4623a);
                            bArr3 = bArr6;
                            i17 = i14 - iM98319e2;
                            if (i17 != 0) {
                                i45 -= i17;
                                int i66 = i15 - i17;
                                i32 = i14 - i17;
                                System.arraycopy(bArr3, (i66 + 1) * i35, bArr3, (i45 + 1) * i35, i17 * i35);
                                i11 = i66;
                                i12 = i32;
                                if (i32 == 0) {
                                    bArr = bArr2;
                                    i53 = i53;
                                    i13 = i16;
                                    break loop2;
                                }
                            } else {
                                int i67 = i14;
                                i11 = i15;
                                i12 = i67;
                            }
                            i18 = i45 * i35;
                            i19 = i16 * i35;
                            while (i21 < i35) {
                                bArr3[i18 + i21] = bArr2[i19 + i21];
                            }
                            i45--;
                            i22 = i16 - 1;
                            i23 = i11;
                            i24 = i33 - 1;
                            if (i24 == i48) {
                                bArr = bArr2;
                                i33 = i24;
                                i13 = i22;
                            } else {
                                bArr = bArr2;
                                iM98318d = i24 - INSTANCE.m98318d(bArr3, i23, bArr2, 0, i24, i33 - 2, i35, interfaceC4623a);
                                if (iM98318d != 0) {
                                    i31 = i45 - iM98318d;
                                    i13 = i22 - iM98318d;
                                    i25 = i24 - iM98318d;
                                    System.arraycopy(bArr, (i13 + 1) * i35, bArr3, (i31 + 1) * i35, iM98318d * i35);
                                    if (i25 <= i48) {
                                        i45 = i31;
                                        i11 = i23;
                                        i33 = i25;
                                        i53 = i53;
                                        break loop2;
                                    }
                                } else {
                                    i25 = i24;
                                    i13 = i22;
                                }
                                i45 = i31;
                                i26 = i45 * i35;
                                i27 = i23 * i35;
                                while (i28 < i35) {
                                    bArr3[i26 + i28] = bArr3[i27 + i28];
                                }
                                i45--;
                                i23--;
                                i14 = i12 - 1;
                                if (i14 == 0) {
                                    i33 = i25;
                                    i12 = i14;
                                    i48 = 1;
                                } else {
                                    i48 = 1;
                                    i53--;
                                    i29 = f98404j;
                                    if (i17 >= i29) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iM98318d >= i29) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12 || z11) {
                                        i15 = i23;
                                        i33 = i25;
                                        bArrM98308g = bArr;
                                    } else {
                                        if (i53 < 0) {
                                            i53 = 0;
                                        }
                                        i53 += 2;
                                        i37 = 0;
                                        i46 = i23;
                                        i33 = i25;
                                        bArrM98308g = bArr;
                                        i39 = i13;
                                        i47 = i14;
                                    }
                                }
                            }
                            i11 = i23;
                            break loop2;
                        }
                    }
                    i37 = 0;
                }
            }
        }
        if (i53 < i48) {
            i53 = i48;
        }
        this.minGallop = i53;
        if (i33 != i48) {
            if (i33 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(bArr, 0, bArr3, (i45 - (i33 - 1)) * i35, i33 * i35);
            return;
        }
        int i68 = i45 - i12;
        System.arraycopy(bArr3, ((i11 - i12) + i48) * i35, bArr3, (i68 + 1) * i35, i12 * i35);
        int i69 = i68 * i35;
        int i71 = i13 * i35;
        for (int i72 = 0; i72 < i35; i72++) {
            bArr3[i69 + i72] = bArr[i71 + i72];
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[LOOP:6: B:48:0x00eb->B:49:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137 A[LOOP:7: B:60:0x0135->B:61:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187  */
    /* JADX WARN: Code duplicated, block: B:81:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x018e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a0 A[LOOP:5: B:40:0x00bf->B:90:0x01a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a6 A[LOOP:3: B:20:0x0061->B:91:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x014b A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public final void m98313l(int base1, int len1, int base2, int len2) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM98319e;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int iM98318d;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z11;
        boolean z12;
        int i31;
        int i32;
        int i33 = len1;
        if (f98406l && i33 > 0 && len2 > 0) {
            int i34 = base1 + i33;
        }
        byte[] bArr = this.a;
        int i35 = this.entrySize;
        byte[] bArrM98308g = m98308g(i33);
        int i36 = base1 * i35;
        int i37 = i33 * i35;
        int i38 = 0;
        System.arraycopy(bArr, i36, bArrM98308g, 0, i37);
        int i39 = base2 * i35;
        for (int i41 = 0; i41 < i35; i41++) {
            bArr[i36 + i41] = bArr[i39 + i41];
        }
        int i42 = 1;
        int i43 = base1 + 1;
        int i44 = base2 + 1;
        int i45 = len2 - 1;
        if (i45 == 0) {
            System.arraycopy(bArrM98308g, 0, bArr, i43 * i35, i37);
            return;
        }
        if (i33 == 1) {
            System.arraycopy(bArr, i44 * i35, bArr, i43 * i35, i45 * i35);
            int i46 = (i43 + i45) * i35;
            while (i38 < i35) {
                bArr[i46 + i38] = bArrM98308g[i38];
                i38++;
            }
            return;
        }
        InterfaceC4623a interfaceC4623a = this.c;
        int i47 = this.minGallop;
        int i48 = 0;
        loop2: while (true) {
            i11 = i48;
            i12 = i43;
            i13 = i45;
            int i49 = i38;
            int i51 = i49;
            while (true) {
                boolean z13 = f98406l;
                byte[] bArr2 = bArr;
                byte[] bArr3 = bArrM98308g;
                int i52 = i35;
                InterfaceC4623a interfaceC4623a2 = interfaceC4623a;
                int i53 = i44;
                int iMo4549a = interfaceC4623a2.mo4549a(i52, bArr2, i53, bArr3, i11);
                interfaceC4623a = interfaceC4623a2;
                i35 = i52;
                bArr = bArr2;
                if (iMo4549a < 0) {
                    int i54 = i12 * i35;
                    int i55 = i53 * i35;
                    for (int i56 = i38; i56 < i35; i56++) {
                        bArr[i54 + i56] = bArr[i55 + i56];
                    }
                    i12++;
                    i44 = i53 + 1;
                    i51++;
                    i13--;
                    if (i13 == 0) {
                        bArrM98308g = bArr3;
                        break loop2;
                    }
                    i49 = i38;
                    if ((i49 | i51) >= i47) {
                        i14 = i44;
                        bArrM98308g = bArr3;
                        i15 = i11;
                        i16 = i33;
                        i17 = i47;
                        while (true) {
                            boolean z14 = f98406l;
                            iM98319e = INSTANCE.m98319e(bArr, i14, bArrM98308g, i15, i16, 0, i35, interfaceC4623a);
                            if (iM98319e != 0) {
                                System.arraycopy(bArrM98308g, i15 * i35, bArr, i12 * i35, iM98319e * i35);
                                i12 += iM98319e;
                                i31 = i15 + iM98319e;
                                i32 = i16 - iM98319e;
                                if (i32 <= i42) {
                                    i47 = i17;
                                    i11 = i31;
                                    i44 = i14;
                                    i33 = i32;
                                    i42 = i42;
                                    break loop2;
                                }
                                i11 = i31;
                                i18 = i32;
                            } else {
                                i18 = i16;
                                i11 = i15;
                            }
                            i19 = i12 * i35;
                            i21 = i14 * i35;
                            for (i22 = 0; i22 < i35; i22++) {
                                bArr[i19 + i22] = bArr[i21 + i22];
                            }
                            i12++;
                            i23 = i14 + 1;
                            i13--;
                            if (i13 == 0) {
                                i47 = i17;
                                i42 = i42;
                                i44 = i23;
                                i33 = i18;
                                break loop2;
                            }
                            byte[] bArr4 = bArrM98308g;
                            byte[] bArr5 = bArr;
                            i24 = i11;
                            iM98318d = INSTANCE.m98318d(bArr4, i24, bArr5, i23, i13, 0, i35, interfaceC4623a);
                            bArrM98308g = bArr4;
                            bArr = bArr5;
                            if (iM98318d != 0) {
                                System.arraycopy(bArr, i23 * i35, bArr, i12 * i35, iM98318d * i35);
                                i12 += iM98318d;
                                i25 = i23 + iM98318d;
                                i13 -= iM98318d;
                                if (i13 == 0) {
                                    i47 = i17;
                                    i44 = i25;
                                    i11 = i24;
                                    i33 = i18;
                                    i42 = 1;
                                    break loop2;
                                }
                            } else {
                                i25 = i23;
                                i13 = i13;
                            }
                            i26 = i12 * i35;
                            i27 = i24 * i35;
                            for (i28 = 0; i28 < i35; i28++) {
                                bArr[i26 + i28] = bArrM98308g[i27 + i28];
                            }
                            i12++;
                            i15 = i24 + 1;
                            i16 = i18 - 1;
                            i42 = 1;
                            if (i16 == 1) {
                                i47 = i17;
                                i44 = i25;
                                i33 = i16;
                                i11 = i15;
                                break loop2;
                            }
                            i17--;
                            i29 = f98404j;
                            if (iM98319e >= i29) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (iM98318d >= i29) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z11 && !z12) {
                                break;
                            }
                            i14 = i25;
                            i42 = 1;
                        }
                        if (i17 < 0) {
                            i17 = 0;
                        }
                        i47 = i17 + 2;
                        i44 = i25;
                        i42 = 1;
                        i48 = i15;
                        i33 = i16;
                        i43 = i12;
                        i45 = i13;
                        i38 = 0;
                    } else {
                        bArrM98308g = bArr3;
                    }
                } else {
                    int i57 = i12 * i35;
                    int i58 = i11 * i35;
                    for (int i59 = i38; i59 < i35; i59++) {
                        bArr[i57 + i59] = bArr3[i58 + i59];
                    }
                    i12++;
                    i11++;
                    i49++;
                    i33--;
                    if (i33 == i42) {
                        i44 = i53;
                        bArrM98308g = bArr3;
                        break loop2;
                    }
                    i44 = i53;
                    i51 = i38;
                    if ((i49 | i51) >= i47) {
                        i14 = i44;
                        bArrM98308g = bArr3;
                        i15 = i11;
                        i16 = i33;
                        i17 = i47;
                        while (true) {
                            boolean z15 = f98406l;
                            iM98319e = INSTANCE.m98319e(bArr, i14, bArrM98308g, i15, i16, 0, i35, interfaceC4623a);
                            if (iM98319e != 0) {
                                System.arraycopy(bArrM98308g, i15 * i35, bArr, i12 * i35, iM98319e * i35);
                                i12 += iM98319e;
                                i31 = i15 + iM98319e;
                                i32 = i16 - iM98319e;
                                if (i32 <= i42) {
                                    i47 = i17;
                                    i11 = i31;
                                    i44 = i14;
                                    i33 = i32;
                                    i42 = i42;
                                    break loop2;
                                }
                                i11 = i31;
                                i18 = i32;
                            } else {
                                i18 = i16;
                                i11 = i15;
                            }
                            i19 = i12 * i35;
                            i21 = i14 * i35;
                            while (i22 < i35) {
                                bArr[i19 + i22] = bArr[i21 + i22];
                            }
                            i12++;
                            i23 = i14 + 1;
                            i13--;
                            if (i13 == 0) {
                                i47 = i17;
                                i42 = i42;
                                i44 = i23;
                                i33 = i18;
                                break loop2;
                            }
                            byte[] bArr6 = bArrM98308g;
                            byte[] bArr7 = bArr;
                            i24 = i11;
                            iM98318d = INSTANCE.m98318d(bArr6, i24, bArr7, i23, i13, 0, i35, interfaceC4623a);
                            bArrM98308g = bArr6;
                            bArr = bArr7;
                            if (iM98318d != 0) {
                                System.arraycopy(bArr, i23 * i35, bArr, i12 * i35, iM98318d * i35);
                                i12 += iM98318d;
                                i25 = i23 + iM98318d;
                                i13 -= iM98318d;
                                if (i13 == 0) {
                                    i47 = i17;
                                    i44 = i25;
                                    i11 = i24;
                                    i33 = i18;
                                    i42 = 1;
                                    break loop2;
                                }
                            } else {
                                i25 = i23;
                                i13 = i13;
                            }
                            i26 = i12 * i35;
                            i27 = i24 * i35;
                            while (i28 < i35) {
                                bArr[i26 + i28] = bArrM98308g[i27 + i28];
                            }
                            i12++;
                            i15 = i24 + 1;
                            i16 = i18 - 1;
                            i42 = 1;
                            if (i16 == 1) {
                                i47 = i17;
                                i44 = i25;
                                i33 = i16;
                                i11 = i15;
                                break loop2;
                            }
                            i17--;
                            i29 = f98404j;
                            if (iM98319e >= i29) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (iM98318d >= i29) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z11 && !z12) {
                                break;
                            }
                            i14 = i25;
                            i42 = 1;
                        }
                        if (i17 < 0) {
                            i17 = 0;
                        }
                        i47 = i17 + 2;
                        i44 = i25;
                        i42 = 1;
                        i48 = i15;
                        i33 = i16;
                        i43 = i12;
                        i45 = i13;
                        i38 = 0;
                    } else {
                        bArrM98308g = bArr3;
                    }
                }
            }
        }
        if (i47 < i42) {
            i47 = i42;
        }
        this.minGallop = i47;
        if (i33 != i42) {
            if (i33 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(bArrM98308g, i11 * i35, bArr, i12 * i35, i33 * i35);
            return;
        }
        System.arraycopy(bArr, i44 * i35, bArr, i12 * i35, i13 * i35);
        int i61 = (i12 + i13) * i35;
        int i62 = i11 * i35;
        for (int i63 = 0; i63 < i35; i63++) {
            bArr[i61 + i63] = bArrM98308g[i62 + i63];
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m98314m(int runBase, int runLen) {
        int[] iArr = this.runBase;
        int i11 = this.stackSize;
        iArr[i11] = runBase;
        this.runLen[i11] = runLen;
        this.stackSize = i11 + 1;
    }
}
