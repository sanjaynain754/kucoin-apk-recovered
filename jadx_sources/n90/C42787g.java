package n90;

import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n90.g */
/* JADX INFO: compiled from: misc.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"", "value", "", "b", "(I)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "matrix", "", "d", "([F)V", "c", "([F)[F", "library_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C42787g {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final float[] m93773c(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return (float[]) matrix.clone();
    }

    /* JADX INFO: renamed from: d */
    public static final void m93774d(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.setIdentityM(matrix, 0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m93771a(int i11) {
        String strGluErrorString = GLU.gluErrorString(i11);
        Intrinsics.checkNotNullExpressionValue(strGluErrorString, "gluErrorString(value)");
        return strGluErrorString;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m93772b(int i11) {
        String hexString = Integer.toHexString(i11);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        return hexString;
    }
}
