package shark.internal.hppc;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import java.util.Locale;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: shark.internal.hppc.e */
/* JADX INFO: compiled from: LongScatterSet.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010(¨\u0006*"}, m90084d2 = {"Lshark/internal/hppc/e;", "", "", "expectedElements", "<init>", "(I)V", "", "key", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)Z", "d", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "e", "j", "()I", "f", "(J)I", "inputGapSlot", "i", "", "fromKeys", "g", "([J)V", "arraySize", "b", "slot", "pendingKey", "c", "(IJ)V", "[J", "keys", "I", "assigned", "mask", "resizeAt", "Z", "hasEmptyKey", "", "D", "loadFactor", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44481e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long[] keys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int assigned;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int mask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int resizeAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasEmptyKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final double loadFactor;

    public C44481e(int i11) {
        this.keys = new long[0];
        this.loadFactor = 0.75d;
        m98393e(i11);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m98389a(long key) {
        if (key == 0) {
            boolean z11 = !this.hasEmptyKey;
            this.hasEmptyKey = true;
            return z11;
        }
        long[] jArr = this.keys;
        int i11 = this.mask;
        int iM98394f = m98394f(key) & i11;
        long j11 = jArr[iM98394f];
        while (j11 != 0) {
            if (j11 == key) {
                return false;
            }
            iM98394f = (iM98394f + 1) & i11;
            j11 = jArr[iM98394f];
        }
        if (this.assigned == this.resizeAt) {
            m98391c(iM98394f, key);
        } else {
            jArr[iM98394f] = key;
        }
        this.assigned++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m98390b(int arraySize) {
        long[] jArr = this.keys;
        try {
            this.keys = new long[arraySize + 1];
            this.resizeAt = C44477a.f98456a.m98378a(arraySize, this.loadFactor);
            this.mask = arraySize - 1;
        } catch (OutOfMemoryError e11) {
            this.keys = jArr;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            String str = String.format(locale, "Not enough memory to allocate buffers for rehashing: %,d -> %,d", Arrays.copyOf(new Object[]{Integer.valueOf(m98398j()), Integer.valueOf(arraySize)}, 2));
            Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(locale, format, *args)");
            throw new RuntimeException(str, e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m98391c(int slot, long pendingKey) {
        long[] jArr = this.keys;
        m98390b(C44477a.f98456a.m98381d(this.mask + 1, m98398j(), this.loadFactor));
        jArr[slot] = pendingKey;
        m98395g(jArr);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m98392d(long key) {
        if (key == 0) {
            return this.hasEmptyKey;
        }
        long[] jArr = this.keys;
        int i11 = this.mask;
        int iM98394f = m98394f(key) & i11;
        long j11 = jArr[iM98394f];
        while (j11 != 0) {
            if (j11 == key) {
                return true;
            }
            iM98394f = (iM98394f + 1) & i11;
            j11 = jArr[iM98394f];
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m98393e(int expectedElements) {
        if (expectedElements > this.resizeAt) {
            long[] jArr = this.keys;
            m98390b(C44477a.f98456a.m98379b(expectedElements, this.loadFactor));
            if (m98398j() != 0) {
                m98395g(jArr);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m98394f(long key) {
        return C44477a.f98456a.m98380c(key);
    }

    /* JADX INFO: renamed from: g */
    public final void m98395g(long[] fromKeys) {
        int i11;
        long[] jArr = this.keys;
        int i12 = this.mask;
        int length = fromKeys.length - 1;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j11 = fromKeys[length];
            if (j11 != 0) {
                int iM98394f = m98394f(j11);
                while (true) {
                    i11 = iM98394f & i12;
                    if (jArr[i11] == 0) {
                        break;
                    } else {
                        iM98394f = i11 + 1;
                    }
                }
                jArr[i11] = j11;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m98396h(long key) {
        if (key == 0) {
            boolean z11 = this.hasEmptyKey;
            this.hasEmptyKey = false;
            return z11;
        }
        long[] jArr = this.keys;
        int i11 = this.mask;
        int iM98394f = m98394f(key) & i11;
        long j11 = jArr[iM98394f];
        while (j11 != 0) {
            if (j11 == key) {
                m98397i(iM98394f);
                return true;
            }
            iM98394f = (iM98394f + 1) & i11;
            j11 = jArr[iM98394f];
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m98397i(int inputGapSlot) {
        long[] jArr = this.keys;
        int i11 = this.mask;
        int i12 = 0;
        while (true) {
            i12++;
            int i13 = (inputGapSlot + i12) & i11;
            long j11 = jArr[i13];
            if (j11 == 0) {
                jArr[inputGapSlot] = 0;
                this.assigned--;
                return;
            } else if (((i13 - m98394f(j11)) & i11) >= i12) {
                jArr[inputGapSlot] = j11;
                i12 = 0;
                inputGapSlot = i13;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m98398j() {
        return this.assigned + (this.hasEmptyKey ? 1 : 0);
    }

    public /* synthetic */ C44481e(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 4 : i11);
    }
}
