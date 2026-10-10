package p852kotlin.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¨\u0006\u000b"}, m90084d2 = {"mod", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "", "differenceModulo", "c", "getProgressionLastElement", "start", "end", "step", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i11, int i12, int i13) {
        return mod(mod(i11, i13) - mod(i12, i13), i13);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (i11 < i12) {
                return i12 - differenceModulo(i12, i11, i13);
            }
        } else {
            if (i13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i11 > i12) {
                return i12 + differenceModulo(i11, i12, -i13);
            }
        }
        return i12;
    }

    private static final int mod(int i11, int i12) {
        int i13 = i11 % i12;
        return i13 >= 0 ? i13 : i13 + i12;
    }

    private static final long differenceModulo(long j11, long j12, long j13) {
        return mod(mod(j11, j13) - mod(j12, j13), j13);
    }

    private static final long mod(long j11, long j12) {
        long j13 = j11 % j12;
        return j13 >= 0 ? j13 : j13 + j12;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j11, long j12, long j13) {
        if (j13 > 0) {
            return j11 >= j12 ? j12 : j12 - differenceModulo(j12, j11, j13);
        }
        if (j13 < 0) {
            return j11 <= j12 ? j12 : j12 + differenceModulo(j11, j12, -j13);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
