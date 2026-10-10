package p008a6;

import android.util.SparseIntArray;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: a6.p */
/* JADX INFO: compiled from: DefaultByteArrayPoolParams.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"La6/p;", "", "<init>", "()V", "La6/h0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()La6/h0;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0156p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0156p f538a = new C0156p();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C0148h0 m709a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new C0148h0(81920, 1048576, sparseIntArray);
    }
}
