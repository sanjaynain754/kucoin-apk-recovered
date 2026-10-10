package shark.internal.hppc;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: shark.internal.hppc.a */
/* JADX INFO: compiled from: HPPC.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\rJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/internal/hppc/a;", "", "<init>", "()V", "", "k", "", "c", "(J)I", "elements", "", "loadFactor", "b", "(ID)I", "input", "e", "(J)J", "arraySize", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "d", "(IID)I", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44477a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44477a f98456a = new C44477a();

    /* JADX INFO: renamed from: b */
    public final int m98379b(int elements, double loadFactor) {
        long jCeil = (long) Math.ceil(((double) elements) / loadFactor);
        if (jCeil == elements) {
            jCeil++;
        }
        long jMax = Math.max(4, m98382e(jCeil));
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String str = String.format(locale, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(new Object[]{Integer.valueOf(elements), Double.valueOf(loadFactor)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(locale, format, *args)");
        throw new RuntimeException(str);
    }

    /* JADX INFO: renamed from: a */
    public final int m98378a(int arraySize, double loadFactor) {
        return Math.min(arraySize - 1, (int) Math.ceil(((double) arraySize) * loadFactor));
    }

    /* JADX INFO: renamed from: d */
    public final int m98381d(int arraySize, int elements, double loadFactor) {
        if (arraySize != 1073741824) {
            return arraySize << 1;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String str = String.format(locale, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(new Object[]{Integer.valueOf(elements), Double.valueOf(loadFactor)}, 2));
        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(locale, format, *args)");
        throw new RuntimeException(str);
    }

    /* JADX INFO: renamed from: e */
    public final long m98382e(long input) {
        long j11 = input - 1;
        long j12 = j11 | (j11 >> 1);
        long j13 = j12 | (j12 >> 2);
        long j14 = j13 | (j13 >> 4);
        long j15 = j14 | (j14 >> 8);
        long j16 = j15 | (j15 >> 16);
        return (j16 | (j16 >> 32)) + 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m98380c(long k11) {
        long j11 = k11 * (-7046029254386353131L);
        return (int) (j11 ^ (j11 >>> 32));
    }
}
