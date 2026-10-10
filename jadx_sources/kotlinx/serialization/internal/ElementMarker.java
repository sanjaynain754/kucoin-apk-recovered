package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "Lvg0/f;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lvg0/f;Lkotlin/jvm/functions/Function2;)V", "index", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "d", "()I", "elementsCount", "", "e", "(I)[J", "b", "c", "Lvg0/f;", "Lkotlin/jvm/functions/Function2;", "", "J", "lowerMarks", "[J", "highMarksArray", "Companion", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ElementMarker {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final long[] f91889f = new long[0];

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45533f descriptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC45533f, Integer, Boolean> readIfAbsent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long lowerMarks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final long[] highMarksArray;

    /* JADX WARN: Multi-variable type inference failed */
    public ElementMarker(@NotNull InterfaceC45533f descriptor, @NotNull Function2<? super InterfaceC45533f, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.highMarksArray = f91889f;
        } else {
            this.lowerMarks = 0L;
            this.highMarksArray = m91421e(elementsCount);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m91417a(int index) {
        if (index < 64) {
            this.lowerMarks |= 1 << index;
        } else {
            m91418b(index);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m91418b(int index) {
        int i11 = (index >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i11] = jArr[i11] | (1 << (index & 63));
    }

    /* JADX INFO: renamed from: c */
    public final int m91419c() {
        int length = this.highMarksArray.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            int i13 = i12 * 64;
            long j11 = this.highMarksArray[i11];
            while (j11 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                j11 |= 1 << iNumberOfTrailingZeros;
                int i14 = iNumberOfTrailingZeros + i13;
                if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(i14)).booleanValue()) {
                    this.highMarksArray[i11] = j11;
                    return i14;
                }
            }
            this.highMarksArray[i11] = j11;
            i11 = i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m91420d() {
        int iNumberOfTrailingZeros;
        int elementsCount = this.descriptor.getElementsCount();
        do {
            long j11 = this.lowerMarks;
            if (j11 == -1) {
                if (elementsCount > 64) {
                    return m91419c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
            this.lowerMarks |= 1 << iNumberOfTrailingZeros;
        } while (!this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: e */
    public final long[] m91421e(int elementsCount) {
        long[] jArr = new long[(elementsCount - 1) >>> 6];
        if ((elementsCount & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << elementsCount;
        }
        return jArr;
    }
}
