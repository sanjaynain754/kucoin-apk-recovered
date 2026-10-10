package o90;

import com.otaliastudios.opengl.core.EglCore;
import com.otaliastudios.opengl.surface.EglSurface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o90.b */
/* JADX INFO: compiled from: EglWindowSurface.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lo90/b;", "Lcom/otaliastudios/opengl/surface/EglSurface;", "Lcom/otaliastudios/opengl/core/EglCore;", "eglCore", "Ln90/e;", "eglSurface", "<init>", "(Lcom/otaliastudios/opengl/core/EglCore;Ln90/e;)V", "", "g", "()Z", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class AbstractC43002b extends EglSurface {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC43002b(@NotNull EglCore eglCore, @NotNull n90.EglSurface eglSurface) {
        super(eglCore, eglSurface);
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94433g() {
        return getEglCore().m67827f(getEglSurface());
    }
}
