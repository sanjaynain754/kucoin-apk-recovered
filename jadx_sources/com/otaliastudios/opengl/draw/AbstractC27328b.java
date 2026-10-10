package com.otaliastudios.opengl.draw;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.FloatBuffer;
import l90.AbstractC42142d;
import l90.C42139a;
import n90.C42787g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.otaliastudios.opengl.draw.b */
/* JADX INFO: compiled from: GlDrawable.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0017\u001a\u00060\u0012j\u0002`\u00138&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/otaliastudios/opengl/draw/b;", "Ll90/d;", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "d", "[F", "c", "()[F", "modelMatrix", "", "<set-?>", "e", "I", "()I", "vertexArrayVersion", "Ljava/nio/FloatBuffer;", "Lcom/otaliastudios/opengl/types/FloatBuffer;", "()Ljava/nio/FloatBuffer;", "setVertexArray", "(Ljava/nio/FloatBuffer;)V", "vertexArray", "b", "coordsPerVertex", "g", "vertexStride", "f", "vertexCount", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class AbstractC27328b extends AbstractC42142d {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final float[] modelMatrix = C42787g.m93773c(C42139a.IDENTITY_MATRIX);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int vertexArrayVersion;

    /* JADX INFO: renamed from: a */
    public abstract void mo67828a();

    /* JADX INFO: renamed from: b */
    public abstract int mo67830b();

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract FloatBuffer mo67829d();

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final float[] getModelMatrix() {
        return this.modelMatrix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getVertexArrayVersion() {
        return this.vertexArrayVersion;
    }

    /* JADX INFO: renamed from: f */
    public int m67834f() {
        return mo67829d().limit() / mo67830b();
    }

    /* JADX INFO: renamed from: g */
    public int m67835g() {
        return mo67830b() * 4;
    }
}
