package p008a6;

import android.util.SparseIntArray;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: a6.o */
/* JADX INFO: compiled from: DefaultBitmapPoolParams.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, m90084d2 = {"La6/o;", "", "<init>", "()V", "La6/h0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()La6/h0;", "Landroid/util/SparseIntArray;", "b", "Landroid/util/SparseIntArray;", "DEFAULT_BUCKETS", "", "()I", "maxSizeHardCap", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0155o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0155o f536a = new C0155o();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final SparseIntArray DEFAULT_BUCKETS = new SparseIntArray(0);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C0148h0 m707a() {
        return new C0148h0(0, f536a.m708b(), DEFAULT_BUCKETS);
    }

    /* JADX INFO: renamed from: b */
    public final int m708b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin > 16777216) {
            return (iMin / 4) * 3;
        }
        return iMin / 2;
    }
}
