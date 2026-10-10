package com.kubi.agora;

import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.view.Surface;
import com.google.firebase.messaging.Constants;
import com.kubi.sdk.BaseApplication;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ScreenCaptureHelper.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0002'(B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0014J \u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010%\u001a\u00020\u001aJ\b\u0010&\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureHelper;", "", "projectionManager", "Landroid/media/projection/MediaProjectionManager;", "callbackStore", "Lcom/kubi/agora/ProjectionCallbackStore;", "serviceStarter", "Lcom/kubi/agora/ProjectionServiceStarter;", "<init>", "(Landroid/media/projection/MediaProjectionManager;Lcom/kubi/agora/ProjectionCallbackStore;Lcom/kubi/agora/ProjectionServiceStarter;)V", "()V", "mediaProjection", "Landroid/media/projection/MediaProjection;", "mediaProjectionCallback", "Landroid/media/projection/MediaProjection$Callback;", "virtualDisplay", "Landroid/hardware/display/VirtualDisplay;", "captureSurface", "Landroid/view/Surface;", "captureSpec", "Lcom/kubi/agora/CaptureSpec;", "isCapturing", "", TUIConstants.TUIChat.CALL_BACK, "Lcom/kubi/agora/ScreenCaptureHelper$ScreenCaptureCallback;", "setCallback", "", "startCapture", "Landroid/content/Intent;", "surface", "spec", "onActivityResult", "requestCode", "", "resultCode", "data", "stopCapture", "release", "startVirtualDisplay", "ScreenCaptureCallback", "Companion", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenCaptureHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenCaptureHelper.kt\ncom/kubi/agora/ScreenCaptureHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class ScreenCaptureHelper {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f15283k = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MediaProjectionManager f15284a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ProjectionCallbackStore f15285b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ProjectionServiceStarter f15286c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public MediaProjection f15287d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public MediaProjection.Callback f15288e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public VirtualDisplay f15289f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Surface f15290g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public CaptureSpec f15291h;

    /* JADX INFO: renamed from: i */
    public boolean f15292i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InterfaceC9381a f15293j;

    /* JADX INFO: compiled from: ScreenCaptureHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureHelper$Companion;", "", "<init>", "()V", "REQUEST_CODE_MEDIA_PROJECTION", "", "TAG", "", "VIRTUAL_DISPLAY_NAME", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.agora.ScreenCaptureHelper$a */
    /* JADX INFO: compiled from: ScreenCaptureHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureHelper$ScreenCaptureCallback;", "", "onCaptureStarted", "", "surface", "Landroid/view/Surface;", "onCaptureStopped", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC9381a {
        /* JADX INFO: renamed from: a */
        void mo14878a(@NotNull Surface surface);

        /* JADX INFO: renamed from: b */
        void mo14879b();

        void onError(@NotNull String error);
    }

    /* JADX INFO: renamed from: com.kubi.agora.ScreenCaptureHelper$b */
    /* JADX INFO: compiled from: ScreenCaptureHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/agora/ScreenCaptureHelper$onActivityResult$1", "Lcom/kubi/agora/ScreenCaptureService$ProjectionReadyCallback;", "onProjectionReady", "", "projection", "Landroid/media/projection/MediaProjection;", "onProjectionError", "message", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nScreenCaptureHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenCaptureHelper.kt\ncom/kubi/agora/ScreenCaptureHelper$onActivityResult$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
    public static final class C9382b implements ScreenCaptureService.InterfaceC9383a {

        /* JADX INFO: renamed from: com.kubi.agora.ScreenCaptureHelper$b$a */
        /* JADX INFO: compiled from: ScreenCaptureHelper.kt */
        @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/agora/ScreenCaptureHelper$onActivityResult$1$onProjectionReady$1$1", "Landroid/media/projection/MediaProjection$Callback;", "onStop", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends MediaProjection.Callback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ScreenCaptureHelper f15295a;

            public a(ScreenCaptureHelper screenCaptureHelper) {
                this.f15295a = screenCaptureHelper;
            }

            @Override // android.media.projection.MediaProjection.Callback
            public void onStop() {
                C44128b.m97259c("ScreenCaptureHelper", "MediaProjection stopped");
                this.f15295a.m14877j();
            }
        }

        public C9382b() {
        }

        @Override // com.kubi.agora.ScreenCaptureService.InterfaceC9383a
        /* JADX INFO: renamed from: a */
        public void mo14884a(final String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C44128b.m97261e("ScreenCaptureHelper", "Projection error: " + message);
            Handler handlerM14916j = AgoraShareScreenManager.f15305a.m14916j();
            final ScreenCaptureHelper screenCaptureHelper = ScreenCaptureHelper.this;
            handlerM14916j.post(new Runnable() { // from class: com.kubi.agora.n
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenCaptureHelper.C9382b.m14882e(screenCaptureHelper, message);
                }
            });
        }

        @Override // com.kubi.agora.ScreenCaptureService.InterfaceC9383a
        /* JADX INFO: renamed from: b */
        public void mo14885b(final MediaProjection projection) {
            Intrinsics.checkNotNullParameter(projection, "projection");
            Handler handlerM14916j = AgoraShareScreenManager.f15305a.m14916j();
            final ScreenCaptureHelper screenCaptureHelper = ScreenCaptureHelper.this;
            handlerM14916j.post(new Runnable() { // from class: com.kubi.agora.o
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenCaptureHelper.C9382b.m14883f(screenCaptureHelper, projection);
                }
            });
        }

        /* JADX INFO: renamed from: e */
        public static final void m14882e(ScreenCaptureHelper screenCaptureHelper, String str) {
            InterfaceC9381a interfaceC9381a = screenCaptureHelper.f15293j;
            if (interfaceC9381a != null) {
                interfaceC9381a.onError(str);
            }
        }

        /* JADX INFO: renamed from: f */
        public static final void m14883f(ScreenCaptureHelper screenCaptureHelper, MediaProjection mediaProjection) {
            screenCaptureHelper.f15287d = mediaProjection;
            a aVar = new a(screenCaptureHelper);
            mediaProjection.registerCallback(aVar, null);
            screenCaptureHelper.f15288e = aVar;
            screenCaptureHelper.m14876i();
        }
    }

    public ScreenCaptureHelper(@NotNull MediaProjectionManager projectionManager, @NotNull ProjectionCallbackStore callbackStore, @NotNull ProjectionServiceStarter serviceStarter) {
        Intrinsics.checkNotNullParameter(projectionManager, "projectionManager");
        Intrinsics.checkNotNullParameter(callbackStore, "callbackStore");
        Intrinsics.checkNotNullParameter(serviceStarter, "serviceStarter");
        this.f15284a = projectionManager;
        this.f15285b = callbackStore;
        this.f15286c = serviceStarter;
    }

    /* JADX INFO: renamed from: e */
    public final void m14872e(int i11, int i12, @Nullable Intent intent) {
        if (i11 != 1001) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[onActivityResult] requestCode=");
        sb2.append(i11);
        sb2.append(", resultCode=");
        sb2.append(i12);
        sb2.append(", data is null = ");
        sb2.append(intent == null);
        C44128b.m97259c("ScreenCaptureHelper", sb2.toString());
        if (i12 == -1 && intent != null) {
            this.f15285b.mo14948a(new C9382b());
            this.f15286c.mo14950b(i12, intent);
            return;
        }
        C44128b.m97261e("ScreenCaptureHelper", "User denied screen capture permission");
        InterfaceC9381a interfaceC9381a = this.f15293j;
        if (interfaceC9381a != null) {
            interfaceC9381a.onError("User denied screen capture permission");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14874g(@Nullable InterfaceC9381a interfaceC9381a) {
        this.f15293j = interfaceC9381a;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Intent m14875h(@NotNull Surface surface, @NotNull CaptureSpec spec) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(spec, "spec");
        if (this.f15292i) {
            C44128b.m97259c("ScreenCaptureHelper", "Screen capture already started");
            return null;
        }
        this.f15290g = surface;
        this.f15291h = spec;
        if (this.f15287d != null) {
            m14876i();
            return null;
        }
        Intent intentCreateScreenCaptureIntent = this.f15284a.createScreenCaptureIntent();
        Intrinsics.checkNotNullExpressionValue(intentCreateScreenCaptureIntent, "createScreenCaptureIntent(...)");
        return intentCreateScreenCaptureIntent;
    }

    /* JADX INFO: renamed from: i */
    public final void m14876i() {
        Surface surface = this.f15290g;
        MediaProjection mediaProjection = this.f15287d;
        CaptureSpec captureSpec = this.f15291h;
        if (surface == null || mediaProjection == null || captureSpec == null) {
            C44128b.m97261e("ScreenCaptureHelper", "Surface, MediaProjection or CaptureSpec is null");
            return;
        }
        this.f15289f = mediaProjection.createVirtualDisplay("ScreenCapture", captureSpec.getWidth(), captureSpec.getHeight(), captureSpec.getDensityDpi(), 16, surface, null, null);
        this.f15292i = true;
        C44128b.m97259c("ScreenCaptureHelper", "VirtualDisplay created: " + captureSpec.getWidth() + 'x' + captureSpec.getHeight());
        InterfaceC9381a interfaceC9381a = this.f15293j;
        if (interfaceC9381a != null) {
            interfaceC9381a.mo14878a(surface);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m14877j() {
        boolean z11 = this.f15292i;
        this.f15292i = false;
        VirtualDisplay virtualDisplay = this.f15289f;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.f15289f = null;
        MediaProjection mediaProjection = this.f15287d;
        if (mediaProjection != null) {
            MediaProjection.Callback callback = this.f15288e;
            if (callback != null) {
                mediaProjection.unregisterCallback(callback);
            }
            this.f15288e = null;
            this.f15287d = null;
            mediaProjection.stop();
        }
        this.f15290g = null;
        this.f15291h = null;
        this.f15286c.mo14949a();
        if (z11) {
            C44128b.m97259c("ScreenCaptureHelper", "Screen capture stopped");
            InterfaceC9381a interfaceC9381a = this.f15293j;
            if (interfaceC9381a != null) {
                interfaceC9381a.mo14879b();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14873f() {
        m14877j();
        this.f15293j = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ScreenCaptureHelper() {
        Object systemService = BaseApplication.INSTANCE.get().getApplicationContext().getSystemService("media_projection");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        this((MediaProjectionManager) systemService, ScreenCaptureServiceCallbackStore.f15333a, ScreenCaptureServiceStarter.f15334a);
    }
}
