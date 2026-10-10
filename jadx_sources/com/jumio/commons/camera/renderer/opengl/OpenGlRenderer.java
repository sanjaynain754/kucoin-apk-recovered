package com.jumio.commons.camera.renderer.opengl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.WorkerThread;
import androidx.camera.core.processing.util.GLUtils;
import androidx.core.util.Pair;
import com.jumio.commons.log.Log;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jumio.core.AbstractC40513C1;
import jumio.core.AbstractC40519D2;
import jumio.core.AbstractC40524E2;
import jumio.core.AbstractC40538H1;
import jumio.core.AbstractC40543I1;
import jumio.core.C40529F2;
import jumio.core.C40533G1;
import jumio.core.C40548J1;
import jumio.core.C40553K1;
import jumio.core.C40654e1;
import jumio.core.EnumC40508B1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J(\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0018\b\u0002\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010)0\u0018J&\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020$\u0018\u00010.J\u0006\u0010/\u001a\u00020$J\u000e\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\bJ\u000e\u00102\u001a\u00020$2\u0006\u00101\u001a\u00020\bJ\u000e\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u0019J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u001fH\u0002J6\u00107\u001a\u00020$2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u00101\u001a\u00020\b2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020$\u0018\u00010.J \u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010:\u001a\u00020;H\u0002J\u001c\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020&H\u0002J\u001a\u0010E\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\b\u0010H\u001a\u00020$H\u0002J\u0010\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020\u0015H\u0002J$\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020\u001f2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0002J\b\u0010N\u001a\u00020$H\u0002J\u0010\u0010O\u001a\u00020\t2\u0006\u00101\u001a\u00020\bH\u0002J\u0012\u0010P\u001a\u0004\u0018\u00010\t2\u0006\u00101\u001a\u00020\bH\u0002J\u0018\u0010Q\u001a\u00020$2\u0006\u00101\u001a\u00020\b2\u0006\u0010R\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006S"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;", "", "<init>", "()V", "mInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mOutputSurfaceMap", "", "Landroid/view/Surface;", "Lcom/jumio/commons/camera/renderer/surface/OutputSurface;", "mGlThread", "Ljava/lang/Thread;", "mEglDisplay", "Landroid/opengl/EGLDisplay;", "mEglContext", "Landroid/opengl/EGLContext;", "mSurfaceAttrib", "", "mEglConfig", "Landroid/opengl/EGLConfig;", "mTempSurface", "Landroid/opengl/EGLSurface;", "mCurrentSurface", "defaultProgramHandles", "", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$InputFormat;", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;", "mProgramHandles", "mCurrentProgram", "mCurrentInputformat", "mExternalTextureId", "", "textureName", "getTextureName", "()I", "init", "", "dynamicRange", "Lcom/jumio/commons/camera/renderer/graphics/DynamicRange;", "setShader", "shaderOverrides", "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "enableProgram", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "manipulate", "Lkotlin/Function1;", "release", "registerOutputSurface", "surface", "unregisterOutputSurface", "setInputFormat", "inputFormat", "activateExternalTexture", "externalTextureId", "render", "timestampNs", "", "textureTransform", "", "snapshot", "byteBuffer", "Ljava/nio/ByteBuffer;", "size", "Landroid/util/Size;", "getExtensionsBeforeInitialized", "Landroidx/core/util/Pair;", "", "dynamicRangeToInitialize", "createEglContext", "infoBuilder", "Lcom/jumio/commons/camera/renderer/graphics/GraphicDeviceInfo$Builder;", "createTempSurface", "makeCurrent", "eglSurface", "useAndConfigureProgramWithTexture", "textureId", "programHandles", "releaseInternal", "getOutSurfaceOrThrow", "createOutputSurfaceInternal", "removeOutputSurfaceInternal", "unregister", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@WorkerThread
@SourceDebugExtension({"SMAP\nOpenGlRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenGlRenderer.kt\ncom/jumio/commons/camera/renderer/opengl/OpenGlRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
public final class OpenGlRenderer {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f13581a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final HashMap f13582b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Thread f13583c;

    /* JADX INFO: renamed from: d */
    public EGLDisplay f13584d;

    /* JADX INFO: renamed from: e */
    public EGLContext f13585e;

    /* JADX INFO: renamed from: f */
    public int[] f13586f;

    /* JADX INFO: renamed from: g */
    public EGLConfig f13587g;

    /* JADX INFO: renamed from: h */
    public EGLSurface f13588h;

    /* JADX INFO: renamed from: i */
    public Surface f13589i;

    /* JADX INFO: renamed from: j */
    public Map f13590j;

    /* JADX INFO: renamed from: k */
    public Map f13591k;

    /* JADX INFO: renamed from: l */
    public AbstractC40513C1 f13592l;

    /* JADX INFO: renamed from: m */
    public EnumC40508B1 f13593m;

    /* JADX INFO: renamed from: n */
    public int f13594n;

    /* JADX INFO: renamed from: a */
    public final Pair m14455a(C40654e1 c40654e1) {
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, false)) {
            return new Pair("", "");
        }
        try {
            try {
                m14459a(c40654e1, (AbstractC40543I1) null);
                EGLConfig eGLConfig = this.f13587g;
                if (eGLConfig != null) {
                    this.f13588h = AbstractC40538H1.m89174a(this.f13584d, eGLConfig);
                }
                EGLSurface eGLSurface = this.f13588h;
                if (!EGL14.eglMakeCurrent(this.f13584d, eGLSurface, eGLSurface, this.f13585e)) {
                    throw new IllegalStateException("eglMakeCurrent failed");
                }
                String strGlGetString = GLES20.glGetString(7939);
                if (strGlGetString == null) {
                    strGlGetString = "";
                }
                String strEglQueryString = EGL14.eglQueryString(this.f13584d, 12373);
                if (strEglQueryString == null) {
                    strEglQueryString = "";
                }
                Pair pair = new Pair(strGlGetString, strEglQueryString);
                m14456a();
                return pair;
            } catch (IllegalStateException e11) {
                Log.m14485w("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e11.getMessage(), e11);
                Pair pair2 = new Pair("", "");
                m14456a();
                return pair2;
            }
        } catch (Throwable th2) {
            m14456a();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void enableProgram$default(OpenGlRenderer openGlRenderer, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        openGlRenderer.enableProgram(z11, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void render$default(OpenGlRenderer openGlRenderer, long j11, float[] fArr, Surface surface, Function1 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        openGlRenderer.render(j11, fArr, surface, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setShader$default(OpenGlRenderer openGlRenderer, C40654e1 c40654e1, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        openGlRenderer.setShader(c40654e1, map);
    }

    public final void enableProgram(boolean enable, @Nullable Function1<? super AbstractC40513C1, Unit> manipulate) {
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, true)) {
            return;
        }
        AbstractC40538H1.m89179a(this.f13583c);
        m14457a(this.f13594n, (!enable || this.f13591k.isEmpty()) ? this.f13590j : this.f13591k);
        AbstractC40513C1 abstractC40513C1 = this.f13592l;
        if (abstractC40513C1 == null || manipulate == null) {
            return;
        }
        manipulate.invoke(abstractC40513C1);
    }

    public final int getTextureName() {
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, true)) {
            return -1;
        }
        return this.f13594n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public final void init(@NotNull C40654e1 dynamicRange) {
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, false)) {
            return;
        }
        AbstractC40543I1 abstractC40543I1Builder = C40553K1.f90024a.builder();
        try {
            if (dynamicRange.m89253a()) {
                Pair pairM14455a = m14455a(dynamicRange);
                F f11 = pairM14455a.first;
                if (f11 == 0) {
                    throw new IllegalStateException("Required value was null.");
                }
                String extensions = (String) f11;
                S s11 = pairM14455a.second;
                if (s11 == 0) {
                    throw new IllegalStateException("Required value was null.");
                }
                String extensions2 = (String) s11;
                if (!StringsKt.contains$default((CharSequence) extensions, (CharSequence) "GL_EXT_YUV_target", false, 2, (Object) null)) {
                    Log.m14484w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dynamicRange = C40654e1.f90250c.getSDR();
                }
                this.f13586f = AbstractC40538H1.m89181a(extensions2, dynamicRange);
                ((C40548J1) abstractC40543I1Builder).getClass();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                ((C40548J1) abstractC40543I1Builder).getClass();
            }
            m14459a(dynamicRange, abstractC40543I1Builder);
            EGLConfig eGLConfig = this.f13587g;
            if (eGLConfig != null) {
                this.f13588h = AbstractC40538H1.m89174a(this.f13584d, eGLConfig);
            }
            EGLSurface eGLSurface = this.f13588h;
            if (!EGL14.eglMakeCurrent(this.f13584d, eGLSurface, eGLSurface, this.f13585e)) {
                throw new IllegalStateException("eglMakeCurrent failed");
            }
            String version = AbstractC40538H1.m89183b();
            C40548J1 c40548j1 = (C40548J1) abstractC40543I1Builder;
            c40548j1.getClass();
            Intrinsics.checkNotNullParameter(version, "version");
            c40548j1.f90015a = version;
            this.f13590j = AbstractC40538H1.m89176a(dynamicRange, MapsKt.emptyMap());
            int iM89173a = AbstractC40538H1.m89173a();
            this.f13594n = iM89173a;
            m14457a(iM89173a, this.f13590j);
            this.f13583c = Thread.currentThread();
            this.f13581a.set(true);
            C40548J1 c40548j2 = (C40548J1) abstractC40543I1Builder;
            String str = c40548j2.f90015a;
            String str2 = c40548j2.f90016b;
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("Missing required properties:" + AbstractC40519D2.m89156a(AbstractC40519D2.m89156a((str == null ? "glVersion" : "").concat(str2 == null ? "eglVersion" : ""), ""), ""));
            }
        } catch (IllegalArgumentException e11) {
            m14456a();
            throw e11;
        } catch (IllegalStateException e12) {
            m14456a();
            throw e12;
        }
    }

    public final void registerOutputSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, true)) {
            return;
        }
        AbstractC40538H1.m89179a(this.f13583c);
        if (this.f13582b.containsKey(surface)) {
            return;
        }
        this.f13582b.put(surface, AbstractC40538H1.f89998h);
    }

    public final void release() {
        if (this.f13581a.getAndSet(false)) {
            int[] iArr = AbstractC40538H1.f89991a;
            AbstractC40538H1.m89179a(this.f13583c);
            m14456a();
        }
    }

    public final void render(long timestampNs, @NotNull float[] textureTransform, @NotNull Surface surface, @Nullable Function1<? super AbstractC40513C1, Unit> manipulate) {
        EGLSurface eglSurface;
        Intrinsics.checkNotNullParameter(textureTransform, "textureTransform");
        Intrinsics.checkNotNullParameter(surface, "surface");
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, true)) {
            return;
        }
        AbstractC40538H1.m89179a(this.f13583c);
        AbstractC40524E2 abstractC40524E2M14460of = (AbstractC40524E2) this.f13582b.get(surface);
        if (abstractC40524E2M14460of == null) {
            throw new IllegalStateException("The surface is not registered.");
        }
        if (abstractC40524E2M14460of == AbstractC40538H1.f89998h) {
            abstractC40524E2M14460of = null;
            try {
                EGLConfig eGLConfig = this.f13587g;
                eglSurface = eGLConfig != null ? AbstractC40538H1.m89175a(this.f13584d, eGLConfig, surface, this.f13586f) : null;
            } catch (IllegalArgumentException e11) {
                Log.m14485w("OpenGlRenderer", "Failed to create EGL surface: " + e11.getMessage(), e11);
            } catch (IllegalStateException e12) {
                Log.m14485w("OpenGlRenderer", "Failed to create EGL surface: " + e12.getMessage(), e12);
            }
            if (eglSurface != null) {
                int[] iArr2 = AbstractC40538H1.f89991a;
                EGLDisplay eglDisplay = this.f13584d;
                Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
                Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
                Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
                Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
                int[] iArr3 = new int[1];
                EGL14.eglQuerySurface(eglDisplay, eglSurface, 12375, iArr3, 0);
                int i11 = iArr3[0];
                Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
                Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
                int[] iArr4 = new int[1];
                EGL14.eglQuerySurface(eglDisplay, eglSurface, 12374, iArr4, 0);
                Size size = new Size(i11, iArr4[0]);
                abstractC40524E2M14460of = AbstractC40524E2.f89955a.m14460of(eglSurface, size.getWidth(), size.getHeight());
            }
            if (abstractC40524E2M14460of == null) {
                return;
            } else {
                this.f13582b.put(surface, abstractC40524E2M14460of);
            }
        }
        if (surface != this.f13589i) {
            C40529F2 c40529f2 = (C40529F2) abstractC40524E2M14460of;
            EGLSurface eGLSurface = c40529f2.f89960b;
            if (!EGL14.eglMakeCurrent(this.f13584d, eGLSurface, eGLSurface, this.f13585e)) {
                throw new IllegalStateException("eglMakeCurrent failed");
            }
            this.f13589i = surface;
            GLES20.glViewport(0, 0, c40529f2.f89961c, c40529f2.f89962d);
            GLES20.glScissor(0, 0, c40529f2.f89961c, c40529f2.f89962d);
        }
        AbstractC40513C1 abstractC40513C1 = this.f13592l;
        if (abstractC40513C1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (abstractC40513C1 instanceof C40533G1) {
            Intrinsics.checkNotNullParameter(textureTransform, "textureMat");
            GLES20.glUniformMatrix4fv(((C40533G1) abstractC40513C1).f89976j, 1, false, textureTransform, 0);
            AbstractC40538H1.m89184b("glUniformMatrix4fv");
        }
        if (manipulate != null) {
            manipulate.invoke(abstractC40513C1);
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC40538H1.m89184b("glDrawArrays");
        C40529F2 c40529f3 = (C40529F2) abstractC40524E2M14460of;
        EGLExt.eglPresentationTimeANDROID(this.f13584d, c40529f3.f89960b, timestampNs);
        if (EGL14.eglSwapBuffers(this.f13584d, c40529f3.f89960b)) {
            return;
        }
        Log.m14484w("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m14458a(surface, false);
    }

    public final void setInputFormat(@NotNull EnumC40508B1 inputFormat) {
        Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, true)) {
            return;
        }
        AbstractC40538H1.m89179a(this.f13583c);
        if (this.f13593m != inputFormat) {
            this.f13593m = inputFormat;
            m14457a(this.f13594n, this.f13590j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setShader(@NotNull C40654e1 dynamicRange, @NotNull Map<EnumC40508B1, ? extends ShaderProvider> shaderOverrides) {
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        Intrinsics.checkNotNullParameter(shaderOverrides, "shaderOverrides");
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, true)) {
            return;
        }
        if (dynamicRange.m89253a()) {
            F f11 = m14455a(dynamicRange).first;
            if (f11 == 0) {
                throw new IllegalStateException("Required value was null.");
            }
            if (!StringsKt.contains$default((CharSequence) f11, (CharSequence) "GL_EXT_YUV_target", false, 2, (Object) null)) {
                Log.m14484w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                dynamicRange = C40654e1.f90250c.getSDR();
            }
        }
        this.f13591k = AbstractC40538H1.m89176a(dynamicRange, shaderOverrides);
    }

    public final void unregisterOutputSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        int[] iArr = AbstractC40538H1.f89991a;
        if (AbstractC40538H1.m89180a(this.f13581a, true)) {
            return;
        }
        AbstractC40538H1.m89179a(this.f13583c);
        m14458a(surface, true);
    }

    public OpenGlRenderer() {
        EGLDisplay EGL_NO_DISPLAY = EGL14.EGL_NO_DISPLAY;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
        this.f13584d = EGL_NO_DISPLAY;
        EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.f13585e = EGL_NO_CONTEXT;
        this.f13586f = AbstractC40538H1.f89991a;
        EGLSurface EGL_NO_SURFACE = EGL14.EGL_NO_SURFACE;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        this.f13588h = EGL_NO_SURFACE;
        this.f13590j = MapsKt.emptyMap();
        this.f13591k = MapsKt.emptyMap();
        this.f13593m = EnumC40508B1.UNKNOWN;
        this.f13594n = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m14459a(C40654e1 c40654e1, AbstractC40543I1 abstractC40543I1) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        Intrinsics.checkNotNullExpressionValue(eGLDisplayEglGetDisplay, "eglGetDisplay(...)");
        this.f13584d = eGLDisplayEglGetDisplay;
        if (!Intrinsics.areEqual(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.f13584d, iArr, 0, iArr, 1)) {
                if (abstractC40543I1 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iArr[0]);
                    sb2.append('.');
                    sb2.append(iArr[1]);
                    String version = sb2.toString();
                    Intrinsics.checkNotNullParameter(version, "version");
                    ((C40548J1) abstractC40543I1).f90016b = version;
                }
                int i11 = c40654e1.m89253a() ? 10 : 8;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f13584d, new int[]{12324, i11, 12323, i11, 12322, i11, 12321, c40654e1.m89253a() ? 2 : 8, 12325, 0, 12326, 0, 12352, c40654e1.m89253a() ? 64 : 4, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f13584d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c40654e1.m89253a() ? 3 : 2, 12344}, 0);
                    AbstractC40538H1.m89178a("eglCreateContext");
                    this.f13587g = eGLConfig;
                    Intrinsics.checkNotNull(eGLContextEglCreateContext);
                    this.f13585e = eGLContextEglCreateContext;
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.f13584d, eGLContextEglCreateContext, 12440, iArr2, 0);
                    Log.m14463d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            EGLDisplay EGL_NO_DISPLAY = EGL14.EGL_NO_DISPLAY;
            Intrinsics.checkNotNullExpressionValue(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
            this.f13584d = EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    /* JADX INFO: renamed from: a */
    public final void m14457a(int i11, Map map) {
        AbstractC40513C1 abstractC40513C1 = (AbstractC40513C1) map.get(this.f13593m);
        if (abstractC40513C1 != null) {
            if (this.f13592l != abstractC40513C1) {
                this.f13592l = abstractC40513C1;
                abstractC40513C1.mo89153b();
                Log.m14463d("OpenGlRenderer", "Using program for input format " + this.f13593m + ": " + this.f13592l);
            }
            GLES20.glActiveTexture(33984);
            AbstractC40538H1.m89184b("glActiveTexture");
            GLES20.glBindTexture(36197, i11);
            AbstractC40538H1.m89184b("glBindTexture");
            return;
        }
        throw new IllegalStateException(("Unable to configure program for input format: " + this.f13593m).toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m14456a() {
        Iterator it = this.f13591k.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC40513C1) it.next()).f89932a);
        }
        this.f13591k = MapsKt.emptyMap();
        Iterator it2 = this.f13590j.values().iterator();
        while (it2.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC40513C1) it2.next()).f89932a);
        }
        this.f13590j = MapsKt.emptyMap();
        this.f13592l = null;
        if (!Intrinsics.areEqual(this.f13584d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f13584d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            Iterator it3 = this.f13582b.values().iterator();
            while (it3.hasNext()) {
                C40529F2 c40529f2 = (C40529F2) ((AbstractC40524E2) it3.next());
                if (!Intrinsics.areEqual(c40529f2.f89960b, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f13584d, c40529f2.f89960b)) {
                    int[] iArr = AbstractC40538H1.f89991a;
                    Intrinsics.checkNotNullParameter("eglDestroySurface", "op");
                    try {
                        AbstractC40538H1.m89178a("eglDestroySurface");
                    } catch (IllegalStateException e11) {
                        Log.m14470e(GLUtils.TAG, e11.toString(), e11);
                    }
                }
            }
            this.f13582b.clear();
            if (!Intrinsics.areEqual(this.f13588h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f13584d, this.f13588h);
                EGLSurface EGL_NO_SURFACE = EGL14.EGL_NO_SURFACE;
                Intrinsics.checkNotNullExpressionValue(EGL_NO_SURFACE, "EGL_NO_SURFACE");
                this.f13588h = EGL_NO_SURFACE;
            }
            if (!Intrinsics.areEqual(this.f13585e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f13584d, this.f13585e);
                EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
                Intrinsics.checkNotNullExpressionValue(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
                this.f13585e = EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f13584d);
            EGLDisplay EGL_NO_DISPLAY = EGL14.EGL_NO_DISPLAY;
            Intrinsics.checkNotNullExpressionValue(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
            this.f13584d = EGL_NO_DISPLAY;
        }
        this.f13587g = null;
        this.f13594n = -1;
        this.f13593m = EnumC40508B1.UNKNOWN;
        this.f13589i = null;
        this.f13583c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m14458a(Surface surface, boolean z11) {
        AbstractC40524E2 abstractC40524E2;
        if (this.f13589i == surface) {
            this.f13589i = null;
            EGLSurface eGLSurface = this.f13588h;
            if (!EGL14.eglMakeCurrent(this.f13584d, eGLSurface, eGLSurface, this.f13585e)) {
                throw new IllegalStateException("eglMakeCurrent failed");
            }
        }
        if (z11) {
            abstractC40524E2 = (AbstractC40524E2) this.f13582b.remove(surface);
        } else {
            abstractC40524E2 = (AbstractC40524E2) this.f13582b.put(surface, AbstractC40538H1.f89998h);
        }
        if (abstractC40524E2 == null || abstractC40524E2 == AbstractC40538H1.f89998h) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f13584d, ((C40529F2) abstractC40524E2).f89960b);
        } catch (RuntimeException e11) {
            Log.m14485w("OpenGlRenderer", "Failed to destroy EGL surface: " + e11.getMessage(), e11);
        }
    }
}
