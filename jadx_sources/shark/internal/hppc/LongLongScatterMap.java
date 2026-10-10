package shark.internal.hppc;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: LongLongScatterMap.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010\u0005J'\u0010(\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00100R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00108R\u0011\u0010<\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, m90084d2 = {"Lshark/internal/hppc/LongLongScatterMap;", "", "", "expectedElements", "<init>", "(I)V", "", "key", "value", "q", "(JJ)J", "k", "(J)I", "slot", CmcdData.Factory.STREAM_TYPE_LIVE, "(I)J", "i", "(J)J", "Lshark/internal/hppc/LongLongScatterMap$a;", "forEachCallback", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lshark/internal/hppc/LongLongScatterMap$a;)V", "Lkotlin/sequences/Sequence;", "Lshark/internal/hppc/c;", "g", "()Lkotlin/sequences/Sequence;", "p", "()V", "f", "m", "", "fromKeys", "fromValues", "o", "([J[J)V", "arraySize", "d", "pendingKey", "pendingValue", "e", "(IJJ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[J", "keys", "b", "values", "c", "I", "assigned", "mask", "resizeAt", "", "Z", "hasEmptyKey", "", "D", "loadFactor", "n", "()Z", "isEmpty", "j", "()I", "size", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class LongLongScatterMap {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int assigned;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int mask;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int resizeAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasEmptyKey;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long[] keys = new long[0];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long[] values = new long[0];

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public double loadFactor = 0.75d;

    /* JADX INFO: renamed from: shark.internal.hppc.LongLongScatterMap$a */
    /* JADX INFO: compiled from: LongLongScatterMap.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lshark/internal/hppc/LongLongScatterMap$a;", "", "", "key", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JJ)V", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public interface InterfaceC44476a {
        /* JADX INFO: renamed from: a */
        void mo98333a(long key, long value);
    }

    /* JADX INFO: renamed from: p */
    public final void m98363p() {
        this.assigned = 0;
        this.hasEmptyKey = false;
        m98351d(C44477a.f98456a.m98379b(4, this.loadFactor));
    }

    /* JADX INFO: renamed from: d */
    public final void m98351d(int arraySize) {
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        int i11 = arraySize + 1;
        try {
            this.keys = new long[i11];
            this.values = new long[i11];
            this.resizeAt = C44477a.f98456a.m98378a(arraySize, this.loadFactor);
            this.mask = arraySize - 1;
        } catch (OutOfMemoryError e11) {
            this.keys = jArr;
            this.values = jArr2;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            String str = String.format(locale, "Not enough memory to allocate buffers for rehashing: %,d -> %,d", Arrays.copyOf(new Object[]{Integer.valueOf(this.mask + 1), Integer.valueOf(arraySize)}, 2));
            Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(locale, format, *args)");
            throw new RuntimeException(str, e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m98352e(int slot, long pendingKey, long pendingValue) {
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        m98351d(C44477a.f98456a.m98381d(this.mask + 1, m98357j(), this.loadFactor));
        jArr[slot] = pendingKey;
        jArr2[slot] = pendingValue;
        m98362o(jArr, jArr2);
    }

    /* JADX INFO: renamed from: f */
    public final void m98353f(int expectedElements) {
        if (expectedElements > this.resizeAt) {
            long[] jArr = this.keys;
            long[] jArr2 = this.values;
            m98351d(C44477a.f98456a.m98379b(expectedElements, this.loadFactor));
            if (m98361n()) {
                return;
            }
            m98362o(jArr, jArr2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Sequence<LongLongPair> m98354g() {
        final int i11 = this.mask + 1;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        return SequencesKt.generateSequence(new Function0<LongLongPair>() { // from class: shark.internal.hppc.LongLongScatterMap$entrySequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final LongLongPair invoke() {
                Ref.IntRef intRef2 = intRef;
                int i12 = intRef2.element;
                if (i12 < i11) {
                    intRef2.element = i12 + 1;
                    while (intRef.element < i11) {
                        long[] jArr = this.this$0.keys;
                        Ref.IntRef intRef3 = intRef;
                        int i13 = intRef3.element;
                        long j11 = jArr[i13];
                        if (j11 != 0) {
                            return C44482f.m98400b(j11, this.this$0.values[intRef.element]);
                        }
                        intRef3.element = i13 + 1;
                    }
                }
                if (intRef.element != i11 || !this.this$0.hasEmptyKey) {
                    return null;
                }
                intRef.element++;
                return C44482f.m98400b(0L, this.this$0.values[i11]);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m98355h(@NotNull InterfaceC44476a forEachCallback) {
        int i11 = this.mask + 1;
        int i12 = -1;
        while (true) {
            if (i12 < i11) {
                while (true) {
                    i12++;
                    if (i12 < i11) {
                        long j11 = this.keys[i12];
                        if (j11 != 0) {
                            forEachCallback.mo98333a(j11, this.values[i12]);
                        }
                    }
                }
            }
            if (i12 != i11 || !this.hasEmptyKey) {
                return;
            }
            i12++;
            forEachCallback.mo98333a(0L, this.values[i11]);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m98357j() {
        return this.assigned + (this.hasEmptyKey ? 1 : 0);
    }

    /* JADX INFO: renamed from: k */
    public final int m98358k(long key) {
        if (key == 0) {
            if (this.hasEmptyKey) {
                return this.mask + 1;
            }
            return -1;
        }
        long[] jArr = this.keys;
        int i11 = this.mask;
        int iM98360m = m98360m(key) & i11;
        long j11 = jArr[iM98360m];
        while (j11 != 0) {
            if (j11 == key) {
                return iM98360m;
            }
            iM98360m = (iM98360m + 1) & i11;
            j11 = jArr[iM98360m];
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public final long m98359l(int slot) {
        return this.values[slot];
    }

    /* JADX INFO: renamed from: m */
    public final int m98360m(long key) {
        return C44477a.f98456a.m98380c(key);
    }

    /* JADX INFO: renamed from: o */
    public final void m98362o(long[] fromKeys, long[] fromValues) {
        int i11;
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        int i12 = this.mask;
        int length = fromKeys.length - 1;
        jArr[jArr.length - 1] = fromKeys[length];
        jArr2[jArr2.length - 1] = fromValues[length];
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j11 = fromKeys[length];
            if (j11 != 0) {
                int iM98360m = m98360m(j11);
                while (true) {
                    i11 = iM98360m & i12;
                    if (jArr[i11] == 0) {
                        break;
                    } else {
                        iM98360m = i11 + 1;
                    }
                }
                jArr[i11] = j11;
                jArr2[i11] = fromValues[length];
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final long m98364q(long key, long value) {
        int i11 = this.mask;
        if (key == 0) {
            this.hasEmptyKey = true;
            long[] jArr = this.values;
            int i12 = i11 + 1;
            long j11 = jArr[i12];
            jArr[i12] = value;
            return j11;
        }
        long[] jArr2 = this.keys;
        int iM98360m = m98360m(key) & i11;
        long j12 = jArr2[iM98360m];
        while (j12 != 0) {
            if (j12 == key) {
                long[] jArr3 = this.values;
                long j13 = jArr3[iM98360m];
                jArr3[iM98360m] = value;
                return j13;
            }
            iM98360m = (iM98360m + 1) & i11;
            j12 = jArr2[iM98360m];
        }
        if (this.assigned == this.resizeAt) {
            m98352e(iM98360m, key, value);
        } else {
            int i13 = iM98360m;
            jArr2[i13] = key;
            this.values[i13] = value;
        }
        this.assigned++;
        return 0L;
    }

    public LongLongScatterMap(int i11) {
        m98353f(i11);
    }

    /* JADX INFO: renamed from: i */
    public final long m98356i(long key) {
        boolean z11;
        int iM98358k = m98358k(key);
        if (iM98358k != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return m98359l(iM98358k);
        }
        throw new IllegalArgumentException(("Unknown key " + key).toString());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m98361n() {
        if (m98357j() == 0) {
            return true;
        }
        return false;
    }
}
