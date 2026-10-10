package o90;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.opengl.core.EglCore;
import n90.C42784d;
import n90.EglSurface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o90.a */
/* JADX INFO: compiled from: EglSurface.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lo90/a;", "", "Lcom/otaliastudios/opengl/core/EglCore;", "eglCore", "Ln90/e;", "eglSurface", "<init>", "(Lcom/otaliastudios/opengl/core/EglCore;Ln90/e;)V", "", "d", "()V", "c", "", "nsecs", "e", "(J)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/otaliastudios/opengl/core/EglCore;", "()Lcom/otaliastudios/opengl/core/EglCore;", "setEglCore$library_release", "(Lcom/otaliastudios/opengl/core/EglCore;)V", "b", "Ln90/e;", "()Ln90/e;", "setEglSurface$library_release", "(Ln90/e;)V", "", "I", "width", "height", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class C43001a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public EglCore eglCore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public EglSurface eglSurface;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int height;

    public C43001a(@NotNull EglCore eglCore, @NotNull EglSurface eglSurface) {
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        this.eglCore = eglCore;
        this.eglSurface = eglSurface;
        this.width = -1;
        this.height = -1;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EglCore getEglCore() {
        return this.eglCore;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EglSurface getEglSurface() {
        return this.eglSurface;
    }

    /* JADX INFO: renamed from: c */
    public final void m94430c() {
        this.eglCore.m67823b(this.eglSurface);
    }

    /* JADX INFO: renamed from: d */
    public void mo94431d() {
        this.eglCore.m67825d(this.eglSurface);
        this.eglSurface = C42784d.m93744h();
        this.height = -1;
        this.width = -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m94432e(long nsecs) {
        this.eglCore.m67826e(this.eglSurface, nsecs);
    }
}
