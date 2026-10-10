package shark.internal.hppc;

import androidx.exifinterface.media.ExifInterface;
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

/* JADX INFO: compiled from: LongObjectScatterMap.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0014J'\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00198\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0004R\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010,R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0011\u00108\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010;\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, m90084d2 = {"Lshark/internal/hppc/LongObjectScatterMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "key", "value", "m", "(JLjava/lang/Object;)Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(J)Ljava/lang/Object;", "Lkotlin/sequences/Sequence;", "Lshark/internal/hppc/d;", "g", "()Lkotlin/sequences/Sequence;", "", "expectedElements", "", "f", "(I)V", "j", "(J)I", "", "fromKeys", "", "fromValues", CmcdData.Factory.STREAM_TYPE_LIVE, "([J[Ljava/lang/Object;)V", "arraySize", "d", "slot", "pendingKey", "pendingValue", "e", "(IJLjava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[J", "keys", "b", "[Ljava/lang/Object;", "getValues$annotations", "values", "c", "I", "assigned", "mask", "resizeAt", "", "Z", "hasEmptyKey", "", "D", "loadFactor", "k", "()Z", "isEmpty", "i", "()I", "size", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class LongObjectScatterMap<T> {

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
    public T[] values = (T[]) new Object[0];

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public double loadFactor = 0.75d;

    /* JADX INFO: renamed from: d */
    public final void m98368d(int arraySize) {
        long[] jArr = this.keys;
        T[] tArr = this.values;
        int i11 = arraySize + 1;
        try {
            this.keys = new long[i11];
            this.values = (T[]) new Object[i11];
            this.resizeAt = C44477a.f98456a.m98378a(arraySize, this.loadFactor);
            this.mask = arraySize - 1;
        } catch (OutOfMemoryError e11) {
            this.keys = jArr;
            this.values = tArr;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            String str = String.format(locale, "Not enough memory to allocate buffers for rehashing: %,d -> %,d", Arrays.copyOf(new Object[]{Integer.valueOf(this.mask + 1), Integer.valueOf(arraySize)}, 2));
            Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(locale, format, *args)");
            throw new RuntimeException(str, e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m98369e(int slot, long pendingKey, T pendingValue) {
        long[] jArr = this.keys;
        T[] tArr = this.values;
        m98368d(C44477a.f98456a.m98381d(this.mask + 1, m98373i(), this.loadFactor));
        jArr[slot] = pendingKey;
        tArr[slot] = pendingValue;
        m98376l(jArr, tArr);
    }

    /* JADX INFO: renamed from: f */
    public final void m98370f(int expectedElements) {
        if (expectedElements > this.resizeAt) {
            long[] jArr = this.keys;
            T[] tArr = this.values;
            m98368d(C44477a.f98456a.m98379b(expectedElements, this.loadFactor));
            if (m98375k()) {
                return;
            }
            m98376l(jArr, tArr);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Sequence<LongObjectPair<T>> m98371g() {
        final int i11 = this.mask + 1;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        return SequencesKt.generateSequence(new Function0<LongObjectPair<? extends T>>() { // from class: shark.internal.hppc.LongObjectScatterMap$entrySequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final LongObjectPair<T> invoke() {
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
                            Object obj = this.this$0.values[intRef.element];
                            if (obj == null) {
                                Intrinsics.throwNpe();
                            }
                            return C44482f.m98401c(j11, obj);
                        }
                        intRef3.element = i13 + 1;
                    }
                }
                if (intRef.element != i11 || !this.this$0.hasEmptyKey) {
                    return null;
                }
                intRef.element++;
                Object obj2 = this.this$0.values[i11];
                if (obj2 == null) {
                    Intrinsics.throwNpe();
                }
                return C44482f.m98401c(0L, obj2);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final T m98372h(long key) {
        if (key == 0) {
            if (this.hasEmptyKey) {
                return this.values[this.mask + 1];
            }
            return null;
        }
        long[] jArr = this.keys;
        int i11 = this.mask;
        int iM98374j = m98374j(key) & i11;
        long j11 = jArr[iM98374j];
        while (j11 != 0) {
            if (j11 == key) {
                return this.values[iM98374j];
            }
            iM98374j = (iM98374j + 1) & i11;
            j11 = jArr[iM98374j];
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final int m98373i() {
        return this.assigned + (this.hasEmptyKey ? 1 : 0);
    }

    /* JADX INFO: renamed from: j */
    public final int m98374j(long key) {
        return C44477a.f98456a.m98380c(key);
    }

    /* JADX INFO: renamed from: l */
    public final void m98376l(long[] fromKeys, T[] fromValues) {
        int i11;
        long[] jArr = this.keys;
        T[] tArr = this.values;
        int i12 = this.mask;
        int length = fromKeys.length - 1;
        jArr[jArr.length - 1] = fromKeys[length];
        tArr[tArr.length - 1] = fromValues[length];
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j11 = fromKeys[length];
            if (j11 != 0) {
                int iM98374j = m98374j(j11);
                while (true) {
                    i11 = iM98374j & i12;
                    if (jArr[i11] == 0) {
                        break;
                    } else {
                        iM98374j = i11 + 1;
                    }
                }
                jArr[i11] = j11;
                tArr[i11] = fromValues[length];
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final T m98377m(long key, T value) {
        int i11 = this.mask;
        if (key == 0) {
            this.hasEmptyKey = true;
            T[] tArr = this.values;
            int i12 = i11 + 1;
            T t11 = tArr[i12];
            tArr[i12] = value;
            return t11;
        }
        long[] jArr = this.keys;
        int iM98374j = m98374j(key) & i11;
        long j11 = jArr[iM98374j];
        while (j11 != 0) {
            if (j11 == key) {
                T[] tArr2 = this.values;
                T t12 = tArr2[iM98374j];
                tArr2[iM98374j] = value;
                return t12;
            }
            iM98374j = (iM98374j + 1) & i11;
            j11 = jArr[iM98374j];
        }
        if (this.assigned == this.resizeAt) {
            m98369e(iM98374j, key, value);
        } else {
            jArr[iM98374j] = key;
            this.values[iM98374j] = value;
        }
        this.assigned++;
        return null;
    }

    public LongObjectScatterMap() {
        m98370f(4);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m98375k() {
        if (m98373i() == 0) {
            return true;
        }
        return false;
    }
}
