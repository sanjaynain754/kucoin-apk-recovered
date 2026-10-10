package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: og0.d0 */
/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"", "propertyName", "", "defaultValue", "d", "(Ljava/lang/String;Z)Z", "", "minValue", "maxValue", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;III)I", "", "b", "(Ljava/lang/String;JJJ)J", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class C43051d0 {
    /* JADX INFO: renamed from: a */
    public static final int m94564a(@NotNull String str, int i11, int i12, int i13) {
        return (int) C43047b0.m94540c(str, i11, i12, i13);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m94568e(String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 1;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return C43047b0.m94539b(str, i11, i12, i13);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m94569f(String str, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j12 = 1;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            j13 = Long.MAX_VALUE;
        }
        return C43047b0.m94540c(str, j11, j14, j13);
    }

    /* JADX INFO: renamed from: b */
    public static final long m94565b(@NotNull String str, long j11, long j12, long j13) {
        String strM94541d = C43047b0.m94541d(str);
        if (strM94541d == null) {
            return j11;
        }
        Long longOrNull = StringsKt.toLongOrNull(strM94541d);
        if (longOrNull != null) {
            long jLongValue = longOrNull.longValue();
            if (j12 <= jLongValue && jLongValue <= j13) {
                return jLongValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j12 + ".." + j13 + ", but is '" + jLongValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM94541d + '\'').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m94566c(@NotNull String str, @NotNull String str2) {
        String strM94541d = C43047b0.m94541d(str);
        if (strM94541d == null) {
            return str2;
        }
        return strM94541d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94567d(@NotNull String str, boolean z11) {
        String strM94541d = C43047b0.m94541d(str);
        if (strM94541d != null) {
            return Boolean.parseBoolean(strM94541d);
        }
        return z11;
    }
}
