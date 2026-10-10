package l90;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import m90.C42494a;
import n90.C42784d;
import n90.C42786f;
import n90.C42787g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.UInt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l90.a */
/* JADX INFO: compiled from: Egloo.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Ll90/a;", "", "<init>", "()V", "", "opName", "", "b", "(Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", FirebaseAnalytics.Param.LOCATION, Constants.ScionAnalytics.PARAM_LABEL, "c", "(ILjava/lang/String;)V", "", "[F", "IDENTITY_MATRIX", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C42139a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42139a f93572a = new C42139a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final float[] IDENTITY_MATRIX;

    static {
        float[] fArr = new float[16];
        C42494a.m93178b(fArr);
        IDENTITY_MATRIX = fArr;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m92479c(int location, @NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (location >= 0) {
            return;
        }
        String str = "Unable to locate " + label + " in program";
        Log.e("Egloo", str);
        throw new RuntimeException(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m92477a(@NotNull String opName) {
        Intrinsics.checkNotNullParameter(opName, "opName");
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == C42784d.m93750n()) {
            return;
        }
        String str = "Error during " + opName + ": EGL error 0x" + C42787g.m93772b(iEglGetError);
        Log.e("Egloo", str);
        throw new RuntimeException(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m92478b(@NotNull String opName) {
        Intrinsics.checkNotNullParameter(opName, "opName");
        int iM103939constructorimpl = UInt.m103939constructorimpl(GLES20.glGetError());
        if (iM103939constructorimpl == C42786f.m93761h()) {
            return;
        }
        String str = "Error during " + opName + ": glError 0x" + C42787g.m93772b(iM103939constructorimpl) + ": " + C42787g.m93771a(iM103939constructorimpl);
        Log.e("Egloo", str);
        throw new RuntimeException(str);
    }
}
