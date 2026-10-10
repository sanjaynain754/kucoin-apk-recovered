package p008a6;

import android.util.SparseIntArray;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: a6.q */
/* JADX INFO: compiled from: DefaultFlexByteArrayPoolParams.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"La6/q;", "", "<init>", "()V", "", "min", "max", "numThreads", "Landroid/util/SparseIntArray;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(III)Landroid/util/SparseIntArray;", "La6/h0;", "b", "()La6/h0;", "I", "getDEFAULT_MAX_NUM_THREADS", "()I", "DEFAULT_MAX_NUM_THREADS", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0157q {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0157q f539a = new C0157q();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int DEFAULT_MAX_NUM_THREADS = Runtime.getRuntime().availableProcessors();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SparseIntArray m710a(int min, int max, int numThreads) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (min <= max) {
            sparseIntArray.put(min, numThreads);
            min *= 2;
        }
        return sparseIntArray;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C0148h0 m711b() {
        int i11 = DEFAULT_MAX_NUM_THREADS;
        return new C0148h0(4194304, i11 * 4194304, m710a(131072, 4194304, i11), 131072, 4194304, i11);
    }
}
