package p852kotlin.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.C41090b;
import p852kotlin.C41091c;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.SinceKotlin;
import p852kotlin.UInt;
import p852kotlin.ULong;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m90084d2 = {"differenceModulo", "Lkotlin/UInt;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UProgressionUtilKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m105051getProgressionLastElement7ftBX0g(long j11, long j12, long j13) {
        if (j13 > 0) {
            return Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) >= 0 ? j12 : ULong.m104018constructorimpl(j12 - m105050differenceModulosambcqE(j12, j11, ULong.m104018constructorimpl(j13)));
        }
        if (j13 < 0) {
            return Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) <= 0 ? j12 : ULong.m104018constructorimpl(j12 + m105050differenceModulosambcqE(j11, j12, ULong.m104018constructorimpl(-j13)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m105052getProgressionLastElementNkh28Cs(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m103939constructorimpl(i12 - m105049differenceModuloWZ9TVnA(i12, i11, UInt.m103939constructorimpl(i13)));
            }
        } else {
            if (i13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m103939constructorimpl(i12 + m105049differenceModuloWZ9TVnA(i11, i12, UInt.m103939constructorimpl(-i13)));
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m105049differenceModuloWZ9TVnA(int i11, int i12, int i13) {
        int iM90093a = C41090b.m90093a(i11, i13);
        int iM90093a2 = C41090b.m90093a(i12, i13);
        int iCompare = Integer.compare(iM90093a ^ Integer.MIN_VALUE, iM90093a2 ^ Integer.MIN_VALUE);
        int iM103939constructorimpl = UInt.m103939constructorimpl(iM90093a - iM90093a2);
        if (iCompare >= 0) {
            return iM103939constructorimpl;
        }
        return UInt.m103939constructorimpl(iM103939constructorimpl + i13);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m105050differenceModulosambcqE(long j11, long j12, long j13) {
        long jM90094a = C41091c.m90094a(j11, j13);
        long jM90094a2 = C41091c.m90094a(j12, j13);
        int iCompare = Long.compare(jM90094a ^ Long.MIN_VALUE, jM90094a2 ^ Long.MIN_VALUE);
        long jM104018constructorimpl = ULong.m104018constructorimpl(jM90094a - jM90094a2);
        if (iCompare >= 0) {
            return jM104018constructorimpl;
        }
        return ULong.m104018constructorimpl(jM104018constructorimpl + j13);
    }
}
