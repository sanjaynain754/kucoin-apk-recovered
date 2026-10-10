package p008a6;

import android.util.SparseIntArray;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: a6.r */
/* JADX INFO: compiled from: DefaultNativeMemoryChunkPoolParams.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m90084d2 = {"La6/r;", "", "<init>", "()V", "La6/h0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()La6/h0;", "", "c", "()I", "maxSizeSoftCap", "b", "maxSizeHardCap", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0158r {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0158r f541a = new C0158r();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C0148h0 m712a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        C0158r c0158r = f541a;
        return new C0148h0(c0158r.m714c(), c0158r.m713b(), sparseIntArray);
    }

    /* JADX INFO: renamed from: b */
    public final int m713b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return iMin / 2;
        }
        return (iMin / 4) * 3;
    }

    /* JADX INFO: renamed from: c */
    public final int m714c() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 3145728;
        }
        if (iMin < 33554432) {
            return 6291456;
        }
        return 12582912;
    }
}
