package com.otaliastudios.opengl.surface;

import com.otaliastudios.opengl.core.EglCore;
import o90.C43001a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EglSurface.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/otaliastudios/opengl/surface/EglSurface;", "Lo90/a;", "Lcom/otaliastudios/opengl/core/EglCore;", "eglCore", "Ln90/e;", "eglSurface", "<init>", "(Lcom/otaliastudios/opengl/core/EglCore;Ln90/e;)V", "e", "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class EglSurface extends C43001a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f55603f;

    /* JADX INFO: compiled from: EglSurface.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/otaliastudios/opengl/surface/EglSurface$Companion;", "", "()V", "TAG", "", "getTAG$annotations", "getTAG", "()Ljava/lang/String;", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String getTAG() {
            return EglSurface.f55603f;
        }

        public static /* synthetic */ void getTAG$annotations() {
        }
    }

    static {
        String simpleName = n90.EglSurface.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "EglSurface::class.java.simpleName");
        f55603f = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EglSurface(@NotNull EglCore eglCore, @NotNull n90.EglSurface eglSurface) {
        super(eglCore, eglSurface);
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
    }
}
