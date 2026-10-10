package com.otaliastudios.opengl.program;

import android.graphics.RectF;
import android.opengl.GLES20;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.opengl.draw.AbstractC27327a;
import com.otaliastudios.opengl.draw.AbstractC27328b;
import com.otaliastudios.opengl.texture.GlTexture;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import l90.C42139a;
import n90.C42786f;
import n90.C42787g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p90.C43418a;
import p90.C43419b;

/* JADX INFO: compiled from: GlTextureProgram.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 G2\u00020\u0001:\u0001HB=\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fBI\b\u0017\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u001a\u00101\u001a\u00060.j\u0002`/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0016\u00102\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u0014\u00103\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0014\u00104\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u0018\u00109\u001a\u000605j\u0002`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010F\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\b7\u0010E¨\u0006I"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlTextureProgram;", "Lcom/otaliastudios/opengl/program/GlProgram;", "", "handle", "", "ownsHandle", "", "vertexPositionName", "vertexMvpMatrixName", "textureCoordsName", "textureTransformName", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "vertexShader", "fragmentShader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/otaliastudios/opengl/draw/b;", "drawable", "", "modelViewProjectionMatrix", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/otaliastudios/opengl/draw/b;[F)V", "vertex", "Lcom/otaliastudios/opengl/draw/a;", "", "value", "min", "max", "horizontal", "j", "(ILcom/otaliastudios/opengl/draw/a;FFFZ)F", "g", "(Lcom/otaliastudios/opengl/draw/b;)V", "i", "()V", "f", "[F", "k", "()[F", "setTextureTransform", "([F)V", "textureTransform", "Lcom/otaliastudios/opengl/program/GlProgramLocation;", "Lcom/otaliastudios/opengl/program/GlProgramLocation;", "textureTransformHandle", "Ljava/nio/FloatBuffer;", "Lcom/otaliastudios/opengl/types/FloatBuffer;", "Ljava/nio/FloatBuffer;", "textureCoordsBuffer", "textureCoordsHandle", "vertexPositionHandle", "vertexMvpMatrixHandle", "Landroid/graphics/RectF;", "Lcom/otaliastudios/opengl/geometry/RectF;", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/graphics/RectF;", "lastDrawableBounds", "m", "I", "lastDrawableVersion", "n", "Lcom/otaliastudios/opengl/draw/a;", "lastDrawable", "Lcom/otaliastudios/opengl/texture/GlTexture;", "o", "Lcom/otaliastudios/opengl/texture/GlTexture;", "getTexture", "()Lcom/otaliastudios/opengl/texture/GlTexture;", "(Lcom/otaliastudios/opengl/texture/GlTexture;)V", "texture", "p", "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class GlTextureProgram extends GlProgram {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public float[] textureTransform;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final GlProgramLocation textureTransformHandle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public FloatBuffer textureCoordsBuffer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final GlProgramLocation textureCoordsHandle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final GlProgramLocation vertexPositionHandle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final GlProgramLocation vertexMvpMatrixHandle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final RectF lastDrawableBounds;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int lastDrawableVersion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public AbstractC27327a lastDrawable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public GlTexture texture;

    @JvmOverloads
    public GlTextureProgram() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlTextureProgram(int i11, boolean z11, @NotNull String vertexPositionName, @NotNull String vertexMvpMatrixName, @Nullable String str, @Nullable String str2) {
        super(i11, z11, new GlShader[0]);
        Intrinsics.checkNotNullParameter(vertexPositionName, "vertexPositionName");
        Intrinsics.checkNotNullParameter(vertexMvpMatrixName, "vertexMvpMatrixName");
        this.textureTransform = C42787g.m93773c(C42139a.IDENTITY_MATRIX);
        this.textureTransformHandle = str2 == null ? null : m67840e(str2);
        this.textureCoordsBuffer = C43418a.m95608b(8);
        this.textureCoordsHandle = str != null ? m67839d(str) : null;
        this.vertexPositionHandle = m67839d(vertexPositionName);
        this.vertexMvpMatrixHandle = m67840e(vertexMvpMatrixName);
        this.lastDrawableBounds = new RectF();
        this.lastDrawableVersion = -1;
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    /* JADX INFO: renamed from: g */
    public void mo67842g(@NotNull AbstractC27328b drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        super.mo67842g(drawable);
        GLES20.glDisableVertexAttribArray(this.vertexPositionHandle.getUvalue());
        GlProgramLocation glProgramLocation = this.textureCoordsHandle;
        if (glProgramLocation != null) {
            GLES20.glDisableVertexAttribArray(glProgramLocation.getUvalue());
        }
        GlTexture glTexture = this.texture;
        if (glTexture != null) {
            glTexture.unbind();
        }
        C42139a.m92478b("onPostDraw end");
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    /* JADX INFO: renamed from: h */
    public void mo67843h(@NotNull AbstractC27328b drawable, @NotNull float[] modelViewProjectionMatrix) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(modelViewProjectionMatrix, "modelViewProjectionMatrix");
        super.mo67843h(drawable, modelViewProjectionMatrix);
        if (!(drawable instanceof AbstractC27327a)) {
            throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
        }
        GlTexture glTexture = this.texture;
        if (glTexture != null) {
            glTexture.bind();
        }
        GLES20.glUniformMatrix4fv(this.vertexMvpMatrixHandle.getValue(), 1, false, modelViewProjectionMatrix, 0);
        C42139a.m92478b("glUniformMatrix4fv");
        GlProgramLocation glProgramLocation = this.textureTransformHandle;
        if (glProgramLocation != null) {
            GLES20.glUniformMatrix4fv(glProgramLocation.getValue(), 1, false, getTextureTransform(), 0);
            C42139a.m92478b("glUniformMatrix4fv");
        }
        GlProgramLocation glProgramLocation2 = this.vertexPositionHandle;
        GLES20.glEnableVertexAttribArray(glProgramLocation2.getUvalue());
        C42139a.m92478b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(glProgramLocation2.getUvalue(), 2, C42786f.m93756c(), false, drawable.m67835g(), (Buffer) drawable.getVertexArray());
        C42139a.m92478b("glVertexAttribPointer");
        GlProgramLocation glProgramLocation3 = this.textureCoordsHandle;
        if (glProgramLocation3 == null) {
            return;
        }
        if (!Intrinsics.areEqual(drawable, this.lastDrawable) || drawable.getVertexArrayVersion() != this.lastDrawableVersion) {
            AbstractC27327a abstractC27327a = (AbstractC27327a) drawable;
            this.lastDrawable = abstractC27327a;
            this.lastDrawableVersion = drawable.getVertexArrayVersion();
            abstractC27327a.m67831h(this.lastDrawableBounds);
            int iM67834f = drawable.m67834f() * 2;
            if (this.textureCoordsBuffer.capacity() < iM67834f) {
                C43419b.m95609a(this.textureCoordsBuffer);
                this.textureCoordsBuffer = C43418a.m95608b(iM67834f);
            }
            this.textureCoordsBuffer.clear();
            this.textureCoordsBuffer.limit(iM67834f);
            if (iM67834f > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    boolean z11 = i11 % 2 == 0;
                    float f11 = drawable.getVertexArray().get(i11);
                    RectF rectF = this.lastDrawableBounds;
                    float f12 = z11 ? rectF.left : rectF.bottom;
                    RectF rectF2 = this.lastDrawableBounds;
                    this.textureCoordsBuffer.put(m67851j(i11 / 2, abstractC27327a, f11, f12, z11 ? rectF2.right : rectF2.top, z11));
                    if (i12 >= iM67834f) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
        }
        this.textureCoordsBuffer.rewind();
        GLES20.glEnableVertexAttribArray(glProgramLocation3.getUvalue());
        C42139a.m92478b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(glProgramLocation3.getUvalue(), 2, C42786f.m93756c(), false, drawable.m67835g(), (Buffer) this.textureCoordsBuffer);
        C42139a.m92478b("glVertexAttribPointer");
    }

    /* JADX INFO: renamed from: j */
    public float m67851j(int vertex, @NotNull AbstractC27327a drawable, float value, float min, float max, boolean horizontal) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return (((value - min) / (max - min)) * 1.0f) + 0.0f;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final float[] getTextureTransform() {
        return this.textureTransform;
    }

    /* JADX INFO: renamed from: l */
    public final void m67853l(@Nullable GlTexture glTexture) {
        this.texture = glTexture;
    }

    @Override // com.otaliastudios.opengl.program.GlProgram
    /* JADX INFO: renamed from: i */
    public void mo67844i() {
        super.mo67844i();
        C43419b.m95609a(this.textureCoordsBuffer);
        GlTexture glTexture = this.texture;
        if (glTexture != null) {
            glTexture.m67861g();
        }
        this.texture = null;
    }

    public /* synthetic */ GlTextureProgram(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n" : str, (i11 & 2) != 0 ? "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n" : str2, (i11 & 4) != 0 ? "aPosition" : str3, (i11 & 8) != 0 ? "uMVPMatrix" : str4, (i11 & 16) != 0 ? "aTextureCoord" : str5, (i11 & 32) != 0 ? "uTexMatrix" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GlTextureProgram(@NotNull String vertexShader, @NotNull String fragmentShader, @NotNull String vertexPositionName, @NotNull String vertexMvpMatrixName, @Nullable String str, @Nullable String str2) {
        this(GlProgram.INSTANCE.create(vertexShader, fragmentShader), true, vertexPositionName, vertexMvpMatrixName, str, str2);
        Intrinsics.checkNotNullParameter(vertexShader, "vertexShader");
        Intrinsics.checkNotNullParameter(fragmentShader, "fragmentShader");
        Intrinsics.checkNotNullParameter(vertexPositionName, "vertexPositionName");
        Intrinsics.checkNotNullParameter(vertexMvpMatrixName, "vertexMvpMatrixName");
    }
}
