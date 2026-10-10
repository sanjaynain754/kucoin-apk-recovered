package com.otaliastudios.opengl.program;

import android.opengl.GLES20;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.opengl.draw.AbstractC27328b;
import l90.C42139a;
import l90.C42141c;
import l90.InterfaceC42140b;
import n90.C42786f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.UInt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GlProgram.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001(B-\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$¨\u0006)"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlProgram;", "Ll90/b;", "", "handle", "", "ownsHandle", "", "Lcom/otaliastudios/opengl/program/GlShader;", "shaders", "<init>", "(IZ[Lcom/otaliastudios/opengl/program/GlShader;)V", "", "i", "()V", "bind", "unbind", "Lcom/otaliastudios/opengl/draw/b;", "drawable", "", "modelViewProjectionMatrix", "b", "(Lcom/otaliastudios/opengl/draw/b;[F)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "f", "(Lcom/otaliastudios/opengl/draw/b;)V", "g", "", "name", "Lcom/otaliastudios/opengl/program/GlProgramLocation;", "d", "(Ljava/lang/String;)Lcom/otaliastudios/opengl/program/GlProgramLocation;", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getHandle", "()I", "Z", "c", "[Lcom/otaliastudios/opengl/program/GlShader;", "isReleased", "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class GlProgram implements InterfaceC42140b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int handle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean ownsHandle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final GlShader[] shaders;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isReleased;

    /* JADX INFO: compiled from: GlProgram.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlProgram$Companion;", "", "()V", "create", "", "shaders", "", "Lcom/otaliastudios/opengl/program/GlShader;", "([Lcom/otaliastudios/opengl/program/GlShader;)I", "vertexShaderSource", "", "fragmentShaderSource", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Use create(GlShader) signature.")
        @JvmStatic
        public final int create(@NotNull String vertexShaderSource, @NotNull String fragmentShaderSource) {
            Intrinsics.checkNotNullParameter(vertexShaderSource, "vertexShaderSource");
            Intrinsics.checkNotNullParameter(fragmentShaderSource, "fragmentShaderSource");
            return create(new GlShader(C42786f.m93770q(), vertexShaderSource), new GlShader(C42786f.m93757d(), fragmentShaderSource));
        }

        public Companion() {
        }

        @JvmStatic
        public final int create(@NotNull GlShader... shaders) {
            Intrinsics.checkNotNullParameter(shaders, "shaders");
            int iM103939constructorimpl = UInt.m103939constructorimpl(GLES20.glCreateProgram());
            C42139a.m92478b("glCreateProgram");
            if (iM103939constructorimpl != 0) {
                for (GlShader glShader : shaders) {
                    GLES20.glAttachShader(iM103939constructorimpl, UInt.m103939constructorimpl(glShader.getId()));
                    C42139a.m92478b("glAttachShader");
                }
                GLES20.glLinkProgram(iM103939constructorimpl);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(iM103939constructorimpl, C42786f.m93759f(), iArr, 0);
                if (iArr[0] == C42786f.m93769p()) {
                    return iM103939constructorimpl;
                }
                String strStringPlus = Intrinsics.stringPlus("Could not link program: ", GLES20.glGetProgramInfoLog(iM103939constructorimpl));
                GLES20.glDeleteProgram(iM103939constructorimpl);
                throw new RuntimeException(strStringPlus);
            }
            throw new RuntimeException("Could not create program");
        }
    }

    @Override // l90.InterfaceC42140b
    public void unbind() {
        GLES20.glUseProgram(0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m67836c(GlProgram glProgram, AbstractC27328b abstractC27328b, float[] fArr, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
        }
        if ((i11 & 2) != 0) {
            fArr = abstractC27328b.getModelMatrix();
        }
        glProgram.m67838b(abstractC27328b, fArr);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: a */
    public final void m67837a(@NotNull AbstractC27328b drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        m67836c(this, drawable, null, 2, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: b */
    public final void m67838b(@NotNull final AbstractC27328b drawable, @NotNull final float[] modelViewProjectionMatrix) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(modelViewProjectionMatrix, "modelViewProjectionMatrix");
        C42139a.m92478b("draw start");
        C42141c.m92480a(this, new Function0<Unit>() { // from class: com.otaliastudios.opengl.program.GlProgram$draw$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.mo67843h(drawable, modelViewProjectionMatrix);
                this.this$0.m67841f(drawable);
                this.this$0.mo67842g(drawable);
            }
        });
        C42139a.m92478b("draw end");
    }

    @Override // l90.InterfaceC42140b
    public void bind() {
        GLES20.glUseProgram(UInt.m103939constructorimpl(this.handle));
        C42139a.m92478b("glUseProgram");
    }

    /* JADX INFO: renamed from: f */
    public void m67841f(@NotNull AbstractC27328b drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        drawable.mo67828a();
    }

    /* JADX INFO: renamed from: g */
    public void mo67842g(@NotNull AbstractC27328b drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
    }

    /* JADX INFO: renamed from: h */
    public void mo67843h(@NotNull AbstractC27328b drawable, @NotNull float[] modelViewProjectionMatrix) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(modelViewProjectionMatrix, "modelViewProjectionMatrix");
    }

    /* JADX INFO: renamed from: i */
    public void mo67844i() {
        if (this.isReleased) {
            return;
        }
        if (this.ownsHandle) {
            GLES20.glDeleteProgram(UInt.m103939constructorimpl(this.handle));
        }
        for (GlShader glShader : this.shaders) {
            glShader.m67849b();
        }
        this.isReleased = true;
    }

    public GlProgram(int i11, boolean z11, @NotNull GlShader... shaders) {
        Intrinsics.checkNotNullParameter(shaders, "shaders");
        this.handle = i11;
        this.ownsHandle = z11;
        this.shaders = shaders;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final GlProgramLocation m67839d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return GlProgramLocation.INSTANCE.getAttrib(this.handle, name);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final GlProgramLocation m67840e(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return GlProgramLocation.INSTANCE.getUniform(this.handle, name);
    }
}
