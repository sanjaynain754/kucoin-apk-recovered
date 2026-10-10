package m90;

import androidx.media3.exoplayer.upstream.CmcdData;
import n90.C42787g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m90.a */
/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0010\u0014\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([F)V", "b", "([F)[F", "library_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C42494a {
    /* JADX INFO: renamed from: a */
    public static final void m93177a(float[] fArr) {
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final float[] m93178b(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        m93177a(fArr);
        C42787g.m93774d(fArr);
        return fArr;
    }
}
