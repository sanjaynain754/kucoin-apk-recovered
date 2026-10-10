package o90;

import android.view.Surface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.opengl.core.EglCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o90.c */
/* JADX INFO: compiled from: EglWindowSurface.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lo90/c;", "Lo90/b;", "Lcom/otaliastudios/opengl/core/EglCore;", "eglCore", "Landroid/view/Surface;", "surface", "", "releaseSurface", "<init>", "(Lcom/otaliastudios/opengl/core/EglCore;Landroid/view/Surface;Z)V", "", "d", "()V", "g", "Landroid/view/Surface;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Z", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class C43003c extends AbstractC43002b {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Surface surface;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean releaseSurface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C43003c(@NotNull EglCore eglCore, @NotNull Surface surface, boolean z11) {
        super(eglCore, eglCore.m67822a(surface));
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.surface = surface;
        this.releaseSurface = z11;
    }

    @Override // o90.C43001a
    /* JADX INFO: renamed from: d */
    public void mo94431d() {
        super.mo94431d();
        if (this.releaseSurface) {
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.surface = null;
        }
    }
}
