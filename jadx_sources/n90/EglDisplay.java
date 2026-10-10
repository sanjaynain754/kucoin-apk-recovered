package n90;

import android.opengl.EGLDisplay;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n90.c, reason: from toString */
/* JADX INFO: compiled from: egl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Ln90/c;", "", "Landroid/opengl/EGLDisplay;", "native", "<init>", "(Landroid/opengl/EGLDisplay;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/opengl/EGLDisplay;", "()Landroid/opengl/EGLDisplay;", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final /* data */ class EglDisplay {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final EGLDisplay native;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EglDisplay) && Intrinsics.areEqual(this.native, ((EglDisplay) other).native);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EGLDisplay getNative() {
        return this.native;
    }

    public int hashCode() {
        EGLDisplay eGLDisplay = this.native;
        if (eGLDisplay == null) {
            return 0;
        }
        return eGLDisplay.hashCode();
    }

    @NotNull
    public String toString() {
        return "EglDisplay(native=" + this.native + ')';
    }

    public EglDisplay(@Nullable EGLDisplay eGLDisplay) {
        this.native = eGLDisplay;
    }
}
