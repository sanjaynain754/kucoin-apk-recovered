package com.jumio.commons.camera.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.CallSuper;
import com.jumio.commons.camera.Size;
import com.jumio.commons.camera.renderer.CameraRenderer;
import com.jumio.commons.camera.renderer.opengl.OpenGlRenderer;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import com.jumio.commons.camera.renderer.utils.DefaultOpenGLInterface;
import com.jumio.commons.camera.renderer.utils.OpenGLInterface;
import com.jumio.commons.log.Log;
import com.jumio.core.ServiceLocator;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.concurrent.ExecutorService;
import jumio.core.AbstractC40513C1;
import jumio.core.C40654e1;
import jumio.core.EnumC40508B1;
import jumio.core.ScheduledExecutorServiceC40568N1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013J:\u0010\f\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\r2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u00020\u0017J\u000e\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0011J\r\u00102\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0017J\b\u00105\u001a\u00020\u0017H\u0017J\b\u00106\u001a\u00020\u000bH\u0016J\b\u00107\u001a\u00020\u0017H\u0002J\u0010\u00108\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00069"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/CameraRenderer;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "<init>", "()V", InterfaceC33953u5.f72225u, "Landroid/os/HandlerThread;", "handler", "Landroid/os/Handler;", "openGlRenderer", "Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;", "textureTransform", "", "enableShader", "", "inputSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "outputSurface", "Landroid/view/Surface;", "shaderProvider", "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "onRender", "Lkotlin/Function1;", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;", "", "freezePreview", "value", "isReleased", "()Z", "frameSize", "Lcom/jumio/commons/camera/Size;", "getFrameSize", "()Lcom/jumio/commons/camera/Size;", "setFrameSize", "(Lcom/jumio/commons/camera/Size;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "textureName", "", "getTextureName", "()I", "setShader", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "onEnable", "registerInputSurface", "surfaceTexture", "unregisterInputSurface", "registerOutputSurface", "surface", "unregisterOutputSurface", "()Lkotlin/Unit;", "release", "releaseInternal", "getRenderTransform", "checkGlThread", "onFrameAvailable", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraRenderer.kt\ncom/jumio/commons/camera/renderer/CameraRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n1#2:230\n*E\n"})
public abstract class CameraRenderer implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public final HandlerThread f13568a;

    /* JADX INFO: renamed from: b */
    public final Handler f13569b;

    /* JADX INFO: renamed from: c */
    public final OpenGlRenderer f13570c;

    /* JADX INFO: renamed from: d */
    public final float[] f13571d;

    /* JADX INFO: renamed from: e */
    public boolean f13572e;

    /* JADX INFO: renamed from: f */
    public SurfaceTexture f13573f;

    /* JADX INFO: renamed from: g */
    public Surface f13574g;

    /* JADX INFO: renamed from: h */
    public ShaderProvider f13575h;

    /* JADX INFO: renamed from: i */
    public Function1 f13576i;

    /* JADX INFO: renamed from: j */
    public boolean f13577j;

    /* JADX INFO: renamed from: k */
    public boolean f13578k;

    /* JADX INFO: renamed from: l */
    public Size f13579l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorServiceC40568N1 f13580m;

    /* JADX INFO: renamed from: a */
    public static final void m14451a(CameraRenderer cameraRenderer) {
        try {
            cameraRenderer.f13570c.init(C40654e1.f90250c.getSDR());
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    public final synchronized void enableShader(final boolean enable, @Nullable final Function1<? super AbstractC40513C1, Unit> onEnable, @Nullable final Function1<? super AbstractC40513C1, Unit> onRender) {
        this.f13569b.post(new Runnable() { // from class: g9.b
            @Override // java.lang.Runnable
            public final void run() {
                CameraRenderer.m14453a(this.f85214b, onRender, enable, onEnable);
            }
        });
    }

    @NotNull
    public final ExecutorService getExecutor() {
        return this.f13580m;
    }

    @NotNull
    /* JADX INFO: renamed from: getFrameSize, reason: from getter */
    public final Size getF13579l() {
        return this.f13579l;
    }

    @NotNull
    /* JADX INFO: renamed from: getRenderTransform, reason: from getter */
    public float[] getF13571d() {
        return this.f13571d;
    }

    public final int getTextureName() {
        return this.f13570c.getTextureName();
    }

    /* JADX INFO: renamed from: isReleased, reason: from getter */
    public final boolean getF13578k() {
        return this.f13578k;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NotNull SurfaceTexture surfaceTexture) {
        Surface surface;
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        try {
            if (!Intrinsics.areEqual("CameraRenderer", Thread.currentThread().getName())) {
                throw new IllegalStateException(Unit.INSTANCE.toString());
            }
            if (this.f13578k) {
                return;
            }
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.f13571d);
            if (this.f13577j || (surface = this.f13574g) == null) {
                return;
            }
            this.f13570c.render(surfaceTexture.getTimestamp(), getF13571d(), surface, this.f13576i);
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    public final void registerInputSurface(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        try {
            if (!Intrinsics.areEqual("CameraRenderer", Thread.currentThread().getName())) {
                throw new IllegalStateException(Unit.INSTANCE.toString());
            }
            unregisterInputSurface();
            this.f13573f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.f13569b);
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    public final void registerOutputSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        try {
            if (!Intrinsics.areEqual("CameraRenderer", Thread.currentThread().getName())) {
                throw new IllegalStateException(Unit.INSTANCE.toString());
            }
            unregisterOutputSurface();
            this.f13574g = surface;
            this.f13570c.registerOutputSurface(surface);
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    public final void release() {
        this.f13580m.execute(new Runnable() { // from class: g9.a
            @Override // java.lang.Runnable
            public final void run() {
                CameraRenderer.m14454b(this.f85213b);
            }
        });
    }

    @CallSuper
    public void releaseInternal() {
        if (this.f13578k) {
            return;
        }
        try {
            if (!Intrinsics.areEqual("CameraRenderer", Thread.currentThread().getName())) {
                throw new IllegalStateException(Unit.INSTANCE.toString());
            }
            unregisterInputSurface();
            unregisterOutputSurface();
            this.f13570c.release();
            this.f13568a.quitSafely();
            this.f13580m.shutdown();
            this.f13569b.removeCallbacksAndMessages(null);
            this.f13578k = true;
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    public final void setFrameSize(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.f13579l = size;
    }

    public final void setShader(@NotNull final ShaderProvider shaderProvider) {
        Intrinsics.checkNotNullParameter(shaderProvider, "shaderProvider");
        if (Intrinsics.areEqual(this.f13575h, shaderProvider)) {
            return;
        }
        this.f13575h = shaderProvider;
        this.f13569b.post(new Runnable() { // from class: g9.e
            @Override // java.lang.Runnable
            public final void run() {
                CameraRenderer.m14452a(this.f85221b, shaderProvider);
            }
        });
    }

    public final void unregisterInputSurface() {
        SurfaceTexture surfaceTexture = this.f13573f;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            surfaceTexture.release();
        }
        this.f13573f = null;
    }

    @Nullable
    public final Unit unregisterOutputSurface() {
        try {
            Surface surface = this.f13574g;
            if (surface == null) {
                return null;
            }
            this.f13570c.unregisterOutputSurface(surface);
            return Unit.INSTANCE;
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return Unit.INSTANCE;
        }
    }

    public CameraRenderer() {
        HandlerThread handlerThread = new HandlerThread("CameraRenderer");
        this.f13568a = handlerThread;
        this.f13570c = new OpenGlRenderer();
        this.f13571d = new float[16];
        this.f13579l = new Size(TXVodDownloadDataSource.QUALITY_1080P, 1920);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f13569b = handler;
        ScheduledExecutorServiceC40568N1 scheduledExecutorServiceC40568N1 = new ScheduledExecutorServiceC40568N1(handler);
        this.f13580m = scheduledExecutorServiceC40568N1;
        scheduledExecutorServiceC40568N1.execute(new Runnable() { // from class: g9.f
            @Override // java.lang.Runnable
            public final void run() {
                CameraRenderer.m14451a(this.f85223b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m14452a(CameraRenderer cameraRenderer, ShaderProvider shaderProvider) {
        try {
            cameraRenderer.f13570c.setShader(C40654e1.f90250c.getSDR(), MapsKt.mapOf(TuplesKt.m90091to(EnumC40508B1.DEFAULT, shaderProvider)));
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14454b(CameraRenderer cameraRenderer) {
        cameraRenderer.releaseInternal();
    }

    /* JADX INFO: renamed from: a */
    public static final void m14453a(final CameraRenderer cameraRenderer, Function1 function1, final boolean z11, final Function1 function2) {
        cameraRenderer.f13576i = function1;
        if (cameraRenderer.f13577j && !z11) {
            cameraRenderer.f13577j = false;
        }
        if (z11 == cameraRenderer.f13572e) {
            return;
        }
        cameraRenderer.f13572e = z11;
        try {
            ((OpenGLInterface) ServiceLocator.INSTANCE.getServiceImplementation(OpenGLInterface.class, new Function0() { // from class: g9.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CameraRenderer.m14449a();
                }
            })).onEnableShader();
            cameraRenderer.f13570c.enableProgram(z11, new Function1() { // from class: g9.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraRenderer.m14450a(z11, cameraRenderer, function2, (AbstractC40513C1) obj);
                }
            });
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            cameraRenderer.f13577j = z11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final OpenGLInterface m14449a() {
        return new DefaultOpenGLInterface();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14450a(boolean z11, CameraRenderer cameraRenderer, Function1 function1, AbstractC40513C1 program) {
        Intrinsics.checkNotNullParameter(program, "program");
        if (!z11) {
            return Unit.INSTANCE;
        }
        program.m89154b(2.0f);
        program.m89151a(cameraRenderer.f13579l.getWidth(), cameraRenderer.f13579l.getHeight());
        program.m89150a(1.0f);
        program.m89152a(3);
        if (function1 != null) {
            function1.invoke(program);
        }
        return Unit.INSTANCE;
    }
}
