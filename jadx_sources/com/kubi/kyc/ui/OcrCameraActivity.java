package com.kubi.kyc.ui;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Size;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5302w;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.messaging.Constants;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.exception.KycException;
import com.kubi.mvi.common.C19241c;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.sdk.base.p113ui.OldBaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;
import p205dn.C36883c;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45678b;
import xb0.C46126b;

/* JADX INFO: compiled from: OcrCameraActivity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 u2\u00020\u00012\u00020\u0002:\tuvwxyz{|}B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010A\u001a\u00020BJ\u0012\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\u0010\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020@H\u0002J\u0010\u0010J\u001a\u00020@2\u0006\u0010K\u001a\u00020LH\u0017J\b\u0010M\u001a\u00020EH\u0002J\b\u0010N\u001a\u00020EH\u0002J\b\u0010O\u001a\u00020EH\u0014J\b\u0010P\u001a\u00020EH\u0002J\b\u0010Q\u001a\u00020EH\u0014J\b\u0010R\u001a\u00020EH\u0014J\b\u0010S\u001a\u00020EH\u0002J\b\u0010T\u001a\u00020EH\u0002J\u0010\u0010U\u001a\u00020E2\u0006\u0010V\u001a\u00020(H\u0003J\b\u0010W\u001a\u00020EH\u0003J\b\u0010X\u001a\u00020EH\u0003J\b\u0010Y\u001a\u00020EH\u0003J\b\u0010Z\u001a\u00020EH\u0003J\b\u0010[\u001a\u00020EH\u0003J\b\u0010\\\u001a\u00020EH\u0003J\b\u0010]\u001a\u00020EH\u0003J\u0018\u0010^\u001a\u00020E2\u0006\u0010_\u001a\u00020B2\u0006\u0010`\u001a\u00020BH\u0003J\u0018\u0010a\u001a\u00020E2\u0006\u0010_\u001a\u00020B2\u0006\u0010`\u001a\u00020BH\u0003J\b\u0010b\u001a\u00020EH\u0003J.\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010e\u001a\u00020*2\n\u0010f\u001a\u0006\u0012\u0002\b\u00030g2\u0006\u0010_\u001a\u00020B2\u0006\u0010`\u001a\u00020BH\u0003J/\u0010c\u001a\u0004\u0018\u00010d2\u000e\u0010h\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010i2\u0006\u0010j\u001a\u00020B2\u0006\u0010k\u001a\u00020BH\u0002¢\u0006\u0002\u0010lJ\u0010\u0010m\u001a\u00020B2\u0006\u0010e\u001a\u00020*H\u0002J\u0018\u0010n\u001a\u00020B2\u0006\u0010e\u001a\u00020*2\u0006\u0010o\u001a\u00020BH\u0002J\u0012\u0010p\u001a\u0004\u0018\u00010*2\u0006\u0010V\u001a\u00020(H\u0002J\u0016\u0010q\u001a\u00020E2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020E0sH\u0002J\b\u0010t\u001a\u00020EH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0015\u001a\u00060\u0016R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006~"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity;", "Lcom/kubi/sdk/base/ui/OldBaseActivity;", "Landroid/os/Handler$Callback;", "<init>", "()V", "binding", "Lcom/kubi/kyc/databinding/BusercenterActivityOcrCameraBinding;", "getBinding", "()Lcom/kubi/kyc/databinding/BusercenterActivityOcrCameraBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "Lkotlin/Lazy;", "mainHandler", "Landroid/os/Handler;", "saveImageExecutor", "Ljava/util/concurrent/Executor;", "deviceOrientationListener", "Lcom/kubi/kyc/ui/OcrCameraActivity$DeviceOrientationListener;", "getDeviceOrientationListener", "()Lcom/kubi/kyc/ui/OcrCameraActivity$DeviceOrientationListener;", "deviceOrientationListener$delegate", "cameraPreview", "Landroid/view/TextureView;", "getCameraPreview", "()Landroid/view/TextureView;", "cameraPreview$delegate", "mediaActionSound", "Landroid/media/MediaActionSound;", "captureResults", "Ljava/util/concurrent/BlockingQueue;", "Landroid/hardware/camera2/CaptureResult;", "cameraThread", "Landroid/os/HandlerThread;", "cameraHandler", "frontCameraId", "", "frontCameraCharacteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "backCameraId", "backCameraCharacteristics", "cameraDeviceFuture", "Lcom/google/common/util/concurrent/SettableFuture;", "Landroid/hardware/camera2/CameraDevice;", "cameraCharacteristicsFuture", "captureSessionFuture", "Landroid/hardware/camera2/CameraCaptureSession;", "previewSurfaceTextureFuture", "Landroid/graphics/SurfaceTexture;", "previewSurface", "Landroid/view/Surface;", "previewDataImageReader", "Landroid/media/ImageReader;", "previewDataSurface", "jpegImageReader", "jpegSurface", "previewImageRequestBuilder", "Landroid/hardware/camera2/CaptureRequest$Builder;", "captureImageRequestBuilder", "isTakingPic", "", "getLayout", "", "resultPicPath", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showTakePicLayout", TIMPushProvider.f75062n, "handleMessage", "msg", "Landroid/os/Message;", "msgCloseCamera", "handleError", "onResume", "realPreview", "onPause", "onDestroy", "startCameraThread", "stopCameraThread", "openCamera", "cameraId", "switchCamera", "closeCamera", "createSession", "closeSession", "startPreview", "stopPreview", "captureImage", "setPreviewSize", ViewProps.MAX_WIDTH, ViewProps.MAX_HEIGHT, "setImageSize", "createCaptureRequestBuilders", "getOptimalSize", "Landroid/util/Size;", "cameraCharacteristics", "clazz", "Ljava/lang/Class;", "supportedSizes", "", "width", "height", "([Landroid/util/Size;II)Landroid/util/Size;", "getDisplayRotation", "getJpegOrientation", "deviceOrientation", "getCameraCharacteristics", "checkCameraPermission", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "showOpenCameraDialog", "Companion", "DeviceOrientationListener", "CameraStateCallback", "SessionStateCallback", "PreviewSurfaceTextureListener", "OnPreviewDataAvailableListener", "RepeatingCaptureStateCallback", "CaptureImageStateCallback", "OnJpegImageAvailableListener", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOcrCameraActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcrCameraActivity.kt\ncom/kubi/kyc/ui/OcrCameraActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n*L\n1#1,866:1\n45#2,19:867\n13472#3,2:886\n50#4,17:888\n1#5:905\n44#6,2:906\n*S KotlinDebug\n*F\n+ 1 OcrCameraActivity.kt\ncom/kubi/kyc/ui/OcrCameraActivity\n*L\n57#1:867,19\n126#1:886,2\n434#1:888,17\n439#1:906,2\n*E\n"})
public final class OcrCameraActivity extends OldBaseActivity implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    @Nullable
    public SettableFuture<CameraDevice> f31325A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public SettableFuture<CameraCharacteristics> f31326B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public SettableFuture<CameraCaptureSession> f31327C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public SettableFuture<SurfaceTexture> f31328D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public Surface f31329E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public ImageReader f31330F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public Surface f31331G;

    /* JADX INFO: renamed from: H */
    @Nullable
    public ImageReader f31332H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public Surface f31333I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public CaptureRequest.Builder f31334J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public CaptureRequest.Builder f31335K;

    /* JADX INFO: renamed from: u */
    @Nullable
    public HandlerThread f31346u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public Handler f31347v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public String f31348w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public CameraCharacteristics f31349x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public String f31350y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public CameraCharacteristics f31351z;

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ KProperty<Object>[] f31324O = {Reflection.property1(new PropertyReference1Impl(OcrCameraActivity.class, "binding", "getBinding()Lcom/kubi/kyc/databinding/BusercenterActivityOcrCameraBinding;", 0))};

    /* JADX INFO: renamed from: N */
    @NotNull
    public static final Companion f31323N = new Companion(null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public final InterfaceC24293a f31338m = C45678b.m100788b(this, new Function1<C36883c, Unit>() { // from class: com.kubi.kyc.ui.OcrCameraActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C36883c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36883c c36883c) {
            invoke(c36883c);
            return Unit.INSTANCE;
        }
    }, new Function1<OcrCameraActivity, C36883c>() { // from class: com.kubi.kyc.ui.OcrCameraActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36883c invoke(@NotNull OcrCameraActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C36883c.m82635a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Lazy f31339n = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.l1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OcrCameraActivity.m37010B0(this.f31538b);
        }
    });

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Handler f31340o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Executor f31341p = C42917g.m94140f("saveImage");

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Lazy f31342q = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.m1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OcrCameraActivity.m37015L0(this.f31541b);
        }
    });

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Lazy f31343r = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.n1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OcrCameraActivity.m37011C0(this.f31544b);
        }
    });

    /* JADX INFO: renamed from: s */
    @NotNull
    public final MediaActionSound f31344s = new MediaActionSound();

    /* JADX INFO: renamed from: t */
    @NotNull
    public final BlockingQueue<CaptureResult> f31345t = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: L */
    public boolean f31336L = true;

    /* JADX INFO: renamed from: M */
    @NotNull
    public String f31337M = "";

    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$Companion;", "", "<init>", "()V", "TAG", "", "MSG_OPEN_CAMERA", "", "MSG_CLOSE_CAMERA", "MSG_CREATE_SESSION", "MSG_CLOSE_SESSION", "MSG_SET_PREVIEW_SIZE", "MSG_START_PREVIEW", "MSG_STOP_PREVIEW", "MSG_SET_IMAGE_SIZE", "MSG_CAPTURE_IMAGE", "MSG_CREATE_REQUEST_BUILDERS", "MAX_PREVIEW_WIDTH", "MAX_PREVIEW_HEIGHT", "MAX_IMAGE_WIDTH", "MAX_IMAGE_HEIGHT", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$a */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$CameraStateCallback;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;)V", "onOpened", "", "camera", "Landroid/hardware/camera2/CameraDevice;", "onDisconnected", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17138a extends CameraDevice.StateCallback {
        public C17138a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NotNull CameraDevice camera) {
            Intrinsics.checkNotNullParameter(camera, "camera");
            SettableFuture settableFuture = OcrCameraActivity.this.f31325A;
            if (settableFuture != null) {
                settableFuture.set(camera);
            }
            OcrCameraActivity.this.m37014I0();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NotNull CameraDevice camera, int error) {
            Intrinsics.checkNotNullParameter(camera, "camera");
            SettableFuture settableFuture = OcrCameraActivity.this.f31325A;
            if (settableFuture != null) {
                settableFuture.set(camera);
            }
            OcrCameraActivity.this.m37014I0();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NotNull CameraDevice camera) {
            Intrinsics.checkNotNullParameter(camera, "camera");
            SettableFuture settableFuture = OcrCameraActivity.this.f31325A;
            if (settableFuture != null) {
                settableFuture.set(camera);
            }
            SettableFuture settableFuture2 = OcrCameraActivity.this.f31326B;
            if (settableFuture2 != null) {
                OcrCameraActivity ocrCameraActivity = OcrCameraActivity.this;
                String id2 = camera.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                settableFuture2.set(ocrCameraActivity.m37060N0(id2));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$b */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0017J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$CaptureImageStateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;)V", "onCaptureStarted", "", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "request", "Landroid/hardware/camera2/CaptureRequest;", "timestamp", "", "frameNumber", "onCaptureCompleted", DbParams.KEY_CHANNEL_RESULT, "Landroid/hardware/camera2/TotalCaptureResult;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17139b extends CameraCaptureSession.CaptureCallback {
        public C17139b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @MainThread
        public void onCaptureCompleted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, @NotNull TotalCaptureResult result) throws InterruptedException {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            super.onCaptureCompleted(session, request, result);
            OcrCameraActivity.this.f31345t.put(result);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @MainThread
        public void onCaptureStarted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, long timestamp, long frameNumber) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            super.onCaptureStarted(session, request, timestamp, frameNumber);
            Handler handler = OcrCameraActivity.this.f31347v;
            if (handler != null) {
                final OcrCameraActivity ocrCameraActivity = OcrCameraActivity.this;
                handler.post(new Runnable() { // from class: com.kubi.kyc.ui.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        OcrCameraActivity.C17139b.m37082b(ocrCameraActivity);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public static final void m37082b(OcrCameraActivity ocrCameraActivity) {
            ocrCameraActivity.f31344s.play(0);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$c */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0017R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$DeviceOrientationListener;", "Landroid/view/OrientationEventListener;", "context", "Landroid/content/Context;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;Landroid/content/Context;)V", "value", "", "orientation", "getOrientation", "()I", "onOrientationChanged", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17140c extends OrientationEventListener {

        /* JADX INFO: renamed from: a */
        public int f31354a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OcrCameraActivity f31355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17140c(@NotNull OcrCameraActivity ocrCameraActivity, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f31355b = ocrCameraActivity;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF31354a() {
            return this.f31354a;
        }

        @Override // android.view.OrientationEventListener
        @MainThread
        public void onOrientationChanged(int orientation) {
            this.f31354a = orientation;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$d */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$OnJpegImageAvailableListener;", "Landroid/media/ImageReader$OnImageAvailableListener;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;)V", "dateFormat", "Ljava/text/DateFormat;", "cameraDir", "", "onImageAvailable", "", "imageReader", "Landroid/media/ImageReader;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17141d implements ImageReader.OnImageAvailableListener {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final DateFormat f31356b = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault());

        /* JADX INFO: renamed from: c */
        @NotNull
        public final String f31357c = C5302w.m6508c() + "/Camera";

        public C17141d() {
        }

        /* JADX INFO: renamed from: g */
        public static final void m37090g(final C17141d c17141d, final CaptureResult captureResult, final byte[] bArr, final int i11, final int i12, final OcrCameraActivity ocrCameraActivity) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.ui.r1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OcrCameraActivity.C17141d.m37091h(this.f31564b, captureResult, bArr, i11, i12, ocrCameraActivity);
                }
            });
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        @WorkerThread
        public void onImageAvailable(@NotNull final ImageReader imageReader) {
            Intrinsics.checkNotNullParameter(imageReader, "imageReader");
            final OcrCameraActivity ocrCameraActivity = OcrCameraActivity.this;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.ui.p1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OcrCameraActivity.C17141d.m37089f(imageReader, ocrCameraActivity, this);
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m37089f(ImageReader imageReader, final OcrCameraActivity ocrCameraActivity, final C17141d c17141d) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            final CaptureResult captureResult = (CaptureResult) ocrCameraActivity.f31345t.take();
            if (imageAcquireNextImage != null && captureResult != null) {
                try {
                    ByteBuffer buffer = imageAcquireNextImage.getPlanes()[0].getBuffer();
                    final byte[] bArr = new byte[buffer.remaining()];
                    buffer.get(bArr);
                    final int width = imageAcquireNextImage.getWidth();
                    final int height = imageAcquireNextImage.getHeight();
                    ocrCameraActivity.f31341p.execute(new Runnable() { // from class: com.kubi.kyc.ui.q1
                        @Override // java.lang.Runnable
                        public final void run() {
                            OcrCameraActivity.C17141d.m37090g(this.f31555b, captureResult, bArr, width, height, ocrCameraActivity);
                        }
                    });
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(imageAcquireNextImage, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AutoCloseableKt.closeFinally(imageAcquireNextImage, th2);
                        throw th3;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public static final Unit m37091h(C17141d c17141d, CaptureResult captureResult, byte[] bArr, int i11, int i12, final OcrCameraActivity ocrCameraActivity) {
            Bitmap bitmapM36868c;
            CameraTopRectView cameraTopRectView;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = "IMG_" + c17141d.f31356b.format(Long.valueOf(jCurrentTimeMillis));
            String str2 = str + ".jpeg";
            File file = new File(c17141d.f31357c);
            if (!file.exists()) {
                file.mkdir();
            }
            final String str3 = c17141d.f31357c + '/' + str2;
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            FilesKt.writeBytes(new File(str3), bArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", str);
            contentValues.put("_display_name", str2);
            contentValues.put("_data", str3);
            contentValues.put("datetaken", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("width", Integer.valueOf(i11));
            contentValues.put("height", Integer.valueOf(i12));
            contentValues.put("orientation", num);
            ocrCameraActivity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (ocrCameraActivity.f31326B != null) {
                SettableFuture settableFuture = ocrCameraActivity.f31326B;
                Intrinsics.checkNotNull(settableFuture);
                V v11 = settableFuture.get();
                Intrinsics.checkNotNullExpressionValue(v11, "get(...)");
                Size sizeM37067U0 = ocrCameraActivity.m37067U0((CameraCharacteristics) v11, SurfaceTexture.class, 1440, TXVodDownloadDataSource.QUALITY_1080P);
                SettableFuture settableFuture2 = ocrCameraActivity.f31326B;
                Intrinsics.checkNotNull(settableFuture2);
                V v12 = settableFuture2.get();
                Intrinsics.checkNotNullExpressionValue(v12, "get(...)");
                int iM37064R0 = ocrCameraActivity.m37064R0((CameraCharacteristics) v12);
                if (sizeM37067U0 != null) {
                    C36883c c36883cM37059M0 = ocrCameraActivity.m37059M0();
                    if (c36883cM37059M0 != null && (cameraTopRectView = c36883cM37059M0.f81443l) != null) {
                        bitmapM36868c = cameraTopRectView.m36868c(bArr, iM37064R0, sizeM37067U0.getHeight(), sizeM37067U0.getWidth());
                    } else {
                        bitmapM36868c = null;
                    }
                    if (bitmapM36868c != null) {
                        bitmapM36868c.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(str3)));
                    }
                    ocrCameraActivity.runOnUiThread(new Runnable() { // from class: com.kubi.kyc.ui.s1
                        @Override // java.lang.Runnable
                        public final void run() {
                            OcrCameraActivity.C17141d.m37092i(ocrCameraActivity, str3);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static final void m37092i(final OcrCameraActivity ocrCameraActivity, final String str) {
            if (!ocrCameraActivity.isFinishing() && !ocrCameraActivity.isDestroyed()) {
                C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.ui.t1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OcrCameraActivity.C17141d.m37093j(ocrCameraActivity, str);
                    }
                });
                ocrCameraActivity.m37076n1(false);
                ocrCameraActivity.f31337M = str;
            }
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m37093j(OcrCameraActivity ocrCameraActivity, String str) {
            ImageView imageView;
            C36883c c36883cM37059M0 = ocrCameraActivity.m37059M0();
            if (c36883cM37059M0 != null && (imageView = c36883cM37059M0.f81442k) != null) {
                ComponentCallbacks2C5309c.m6559w(ocrCameraActivity).mo6634v(str).m6594E0(imageView);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$e */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$OnPreviewDataAvailableListener;", "Landroid/media/ImageReader$OnImageAvailableListener;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;)V", "onImageAvailable", "", "imageReader", "Landroid/media/ImageReader;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17142e implements ImageReader.OnImageAvailableListener {
        public C17142e() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        @WorkerThread
        public void onImageAvailable(@NotNull final ImageReader imageReader) {
            Intrinsics.checkNotNullParameter(imageReader, "imageReader");
            C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.ui.u1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OcrCameraActivity.C17142e.m37095b(imageReader);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m37095b(ImageReader imageReader) {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            if (imageAcquireNextImage != null) {
                try {
                    Image.Plane[] planes = imageAcquireNextImage.getPlanes();
                    Image.Plane plane = planes[0];
                    Image.Plane plane2 = planes[1];
                    Image.Plane plane3 = planes[2];
                    plane.getBuffer();
                    plane2.getBuffer();
                    plane3.getBuffer();
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(imageAcquireNextImage, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AutoCloseableKt.closeFinally(imageAcquireNextImage, th2);
                        throw th3;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$f */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$PreviewSurfaceTextureListener;", "Landroid/view/TextureView$SurfaceTextureListener;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;)V", "onSurfaceTextureSizeChanged", "", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureUpdated", "onSurfaceTextureDestroyed", "", "onSurfaceTextureAvailable", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class TextureViewSurfaceTextureListenerC17143f implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC17143f() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        @MainThread
        public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            SettableFuture settableFuture = OcrCameraActivity.this.f31328D;
            Intrinsics.checkNotNull(settableFuture);
            settableFuture.set(surfaceTexture);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        @MainThread
        public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        @MainThread
        public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        @MainThread
        public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$g */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0017J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$RepeatingCaptureStateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;)V", "onCaptureStarted", "", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "request", "Landroid/hardware/camera2/CaptureRequest;", "timestamp", "", "frameNumber", "onCaptureCompleted", DbParams.KEY_CHANNEL_RESULT, "Landroid/hardware/camera2/TotalCaptureResult;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17144g extends CameraCaptureSession.CaptureCallback {
        public C17144g() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @MainThread
        public void onCaptureCompleted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, @NotNull TotalCaptureResult result) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            super.onCaptureCompleted(session, request, result);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @MainThread
        public void onCaptureStarted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, long timestamp, long frameNumber) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(request, "request");
            super.onCaptureStarted(session, request, timestamp, frameNumber);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.OcrCameraActivity$h */
    /* JADX INFO: compiled from: OcrCameraActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kyc/ui/OcrCameraActivity$SessionStateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "<init>", "(Lcom/kubi/kyc/ui/OcrCameraActivity;)V", "onConfigured", "", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "onConfigureFailed", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17145h extends CameraCaptureSession.StateCallback {
        public C17145h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NotNull CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            SettableFuture settableFuture = OcrCameraActivity.this.f31327C;
            if (settableFuture != null) {
                settableFuture.set(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NotNull CameraCaptureSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            SettableFuture settableFuture = OcrCameraActivity.this.f31327C;
            if (settableFuture != null) {
                settableFuture.set(session);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final int m37065S0(CameraCharacteristics cameraCharacteristics, int i11) {
        if (i11 == -1) {
            return 0;
        }
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Intrinsics.checkNotNull(obj);
        int iIntValue = ((Number) obj).intValue();
        int i12 = ((i11 + 45) / 90) * 90;
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num != null && num.intValue() == 0) {
            i12 = -i12;
        }
        return ((iIntValue + i12) + TXVodDownloadDataSource.QUALITY_360P) % TXVodDownloadDataSource.QUALITY_360P;
    }

    @Override // android.os.Handler.Callback
    @SuppressLint({"MissingPermission"})
    public boolean handleMessage(@NotNull Message msg) {
        CaptureRequest.Builder builder;
        int i11;
        int i12;
        Size sizeM37067U0;
        Intrinsics.checkNotNullParameter(msg, "msg");
        try {
            switch (msg.what) {
                case 1:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_OPEN_CAMERA");
                    this.f31325A = SettableFuture.create();
                    this.f31326B = SettableFuture.create();
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    C17138a c17138a = new C17138a();
                    CameraManager cameraManagerM37061O0 = m37061O0();
                    if (cameraManagerM37061O0 != null) {
                        cameraManagerM37061O0.openCamera(str, c17138a, this.f31340o);
                    }
                    break;
                case 2:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_CLOSE_CAMERA");
                    m37070Y0();
                    break;
                case 3:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_CREATE_SESSION");
                    C17145h c17145h = new C17145h();
                    ArrayList arrayList = new ArrayList();
                    Surface surface = this.f31329E;
                    if (surface != null) {
                        arrayList.add(surface);
                    }
                    Surface surface2 = this.f31331G;
                    if (surface2 != null) {
                        arrayList.add(surface2);
                    }
                    Surface surface3 = this.f31333I;
                    if (surface3 != null) {
                        arrayList.add(surface3);
                    }
                    this.f31327C = SettableFuture.create();
                    SettableFuture<CameraDevice> settableFuture = this.f31325A;
                    CameraDevice cameraDevice = settableFuture != null ? settableFuture.get() : null;
                    if (cameraDevice != null) {
                        cameraDevice.createCaptureSession(arrayList, c17145h, this.f31340o);
                    }
                    break;
                case 4:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_CLOSE_SESSION");
                    SettableFuture<CameraCaptureSession> settableFuture2 = this.f31327C;
                    CameraCaptureSession cameraCaptureSession = settableFuture2 != null ? settableFuture2.get() : null;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.close();
                    }
                    this.f31327C = null;
                    break;
                case 5:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_SET_PREVIEW_SIZE");
                    SettableFuture<CameraCharacteristics> settableFuture3 = this.f31326B;
                    CameraCharacteristics cameraCharacteristics = settableFuture3 != null ? settableFuture3.get() : null;
                    if (cameraCharacteristics != null) {
                        Size sizeM37067U1 = m37067U0(cameraCharacteristics, SurfaceTexture.class, msg.arg1, msg.arg2);
                        SettableFuture<SurfaceTexture> settableFuture4 = this.f31328D;
                        SurfaceTexture surfaceTexture = settableFuture4 != null ? settableFuture4.get() : null;
                        if (sizeM37067U1 != null && surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(sizeM37067U1.getWidth(), sizeM37067U1.getHeight());
                        }
                        this.f31329E = new Surface(surfaceTexture);
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null && streamConfigurationMap.isOutputSupportedFor(35) && sizeM37067U1 != null) {
                            ImageReader imageReaderNewInstance = ImageReader.newInstance(sizeM37067U1.getWidth(), sizeM37067U1.getHeight(), 35, 3);
                            this.f31330F = imageReaderNewInstance;
                            if (imageReaderNewInstance != null) {
                                imageReaderNewInstance.setOnImageAvailableListener(new C17142e(), this.f31347v);
                            }
                            ImageReader imageReader = this.f31330F;
                            this.f31331G = imageReader != null ? imageReader.getSurface() : null;
                            break;
                        }
                    }
                    break;
                case 6:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_START_PREVIEW");
                    SettableFuture<CameraCaptureSession> settableFuture5 = this.f31327C;
                    CameraCaptureSession cameraCaptureSession2 = settableFuture5 != null ? settableFuture5.get() : null;
                    Surface surface4 = this.f31329E;
                    if (surface4 != null && cameraCaptureSession2 != null && (builder = this.f31334J) != null && this.f31335K != null) {
                        if (builder != null) {
                            Intrinsics.checkNotNull(surface4);
                            builder.addTarget(surface4);
                        }
                        CaptureRequest.Builder builder2 = this.f31335K;
                        if (builder2 != null) {
                            Surface surface5 = this.f31329E;
                            Intrinsics.checkNotNull(surface5);
                            builder2.addTarget(surface5);
                        }
                        Surface surface6 = this.f31331G;
                        if (surface6 != null) {
                            CaptureRequest.Builder builder3 = this.f31334J;
                            if (builder3 != null) {
                                Intrinsics.checkNotNull(surface6);
                                builder3.addTarget(surface6);
                            }
                            CaptureRequest.Builder builder4 = this.f31335K;
                            if (builder4 != null) {
                                Surface surface7 = this.f31331G;
                                Intrinsics.checkNotNull(surface7);
                                builder4.addTarget(surface7);
                            }
                        }
                        CaptureRequest.Builder builder5 = this.f31334J;
                        Intrinsics.checkNotNull(builder5);
                        CaptureRequest captureRequestBuild = builder5.build();
                        Intrinsics.checkNotNullExpressionValue(captureRequestBuild, "build(...)");
                        cameraCaptureSession2.setRepeatingRequest(captureRequestBuild, new C17144g(), this.f31340o);
                        break;
                    }
                    break;
                case 7:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_STOP_PREVIEW");
                    SettableFuture<CameraCaptureSession> settableFuture6 = this.f31327C;
                    CameraCaptureSession cameraCaptureSession3 = settableFuture6 != null ? settableFuture6.get() : null;
                    if (cameraCaptureSession3 != null) {
                        cameraCaptureSession3.stopRepeating();
                    }
                    break;
                case 8:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_SET_IMAGE_SIZE");
                    SettableFuture<CameraCharacteristics> settableFuture7 = this.f31326B;
                    CameraCharacteristics cameraCharacteristics2 = settableFuture7 != null ? settableFuture7.get() : null;
                    if (cameraCharacteristics2 != null && (sizeM37067U0 = m37067U0(cameraCharacteristics2, ImageReader.class, (i11 = msg.arg1), (i12 = msg.arg2))) != null) {
                        ImageReader imageReaderNewInstance2 = ImageReader.newInstance(sizeM37067U0.getWidth(), sizeM37067U0.getHeight(), 256, 5);
                        this.f31332H = imageReaderNewInstance2;
                        if (imageReaderNewInstance2 != null) {
                            imageReaderNewInstance2.setOnImageAvailableListener(new C17141d(), this.f31347v);
                        }
                        ImageReader imageReader2 = this.f31332H;
                        this.f31333I = imageReader2 != null ? imageReader2.getSurface() : null;
                        Size[] sizeArr = (Size[]) cameraCharacteristics2.get(CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES);
                        if (sizeArr != null && this.f31335K != null) {
                            Size sizeM37068V0 = m37068V0(sizeArr, i11, i12);
                            CaptureRequest.Builder builder6 = this.f31335K;
                            Intrinsics.checkNotNull(builder6);
                            builder6.set(CaptureRequest.JPEG_THUMBNAIL_SIZE, sizeM37068V0);
                            break;
                        }
                    }
                    break;
                case 9:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_CAPTURE_IMAGE");
                    SettableFuture<CameraCharacteristics> settableFuture8 = this.f31326B;
                    CameraCharacteristics cameraCharacteristics3 = settableFuture8 != null ? settableFuture8.get() : null;
                    SettableFuture<CameraCaptureSession> settableFuture9 = this.f31327C;
                    CameraCaptureSession cameraCaptureSession4 = settableFuture9 != null ? settableFuture9.get() : null;
                    if (cameraCaptureSession4 != null && this.f31335K != null && this.f31333I != null && cameraCharacteristics3 != null) {
                        int iM37065S0 = m37065S0(cameraCharacteristics3, m37063Q0().getF31354a());
                        CaptureRequest.Builder builder7 = this.f31335K;
                        Intrinsics.checkNotNull(builder7);
                        builder7.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(iM37065S0));
                        CaptureRequest.Builder builder8 = this.f31335K;
                        Intrinsics.checkNotNull(builder8);
                        builder8.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(BuiltinOptions.SegmentSumOptions));
                        CaptureRequest.Builder builder9 = this.f31335K;
                        Intrinsics.checkNotNull(builder9);
                        Surface surface8 = this.f31333I;
                        Intrinsics.checkNotNull(surface8);
                        builder9.addTarget(surface8);
                        CaptureRequest.Builder builder10 = this.f31335K;
                        Intrinsics.checkNotNull(builder10);
                        CaptureRequest captureRequestBuild2 = builder10.build();
                        Intrinsics.checkNotNullExpressionValue(captureRequestBuild2, "build(...)");
                        cameraCaptureSession4.capture(captureRequestBuild2, new C17139b(), this.f31340o);
                        break;
                    }
                    break;
                case 10:
                    C44128b.m97259c("OcrCameraActivity", "Handle message: MSG_CREATE_REQUEST_BUILDERS");
                    SettableFuture<CameraDevice> settableFuture10 = this.f31325A;
                    CameraDevice cameraDevice2 = settableFuture10 != null ? settableFuture10.get() : null;
                    if (cameraDevice2 != null) {
                        this.f31334J = cameraDevice2.createCaptureRequest(1);
                        this.f31335K = cameraDevice2.createCaptureRequest(2);
                    }
                    break;
            }
        } catch (Exception unused) {
            m37069W0();
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public static final CameraManager m37010B0(OcrCameraActivity ocrCameraActivity) {
        return (CameraManager) ocrCameraActivity.getSystemService("camera");
    }

    /* JADX INFO: renamed from: C0 */
    public static final TextureView m37011C0(OcrCameraActivity ocrCameraActivity) {
        return (TextureView) ocrCameraActivity.findViewById(R$id.camera_preview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: I0 */
    public final void m37014I0() {
        Handler handler = this.f31347v;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static final C17140c m37015L0(OcrCameraActivity ocrCameraActivity) {
        return new C17140c(ocrCameraActivity, ocrCameraActivity);
    }

    /* JADX INFO: renamed from: X0 */
    public static final void m37017X0(OcrCameraActivity ocrCameraActivity) {
        Intent intent = new Intent();
        intent.putExtra("take_pic_request_key", ocrCameraActivity.getIntent().getIntExtra("take_pic_request_key", 0));
        intent.putExtra("take_pic_result_key", "TAKE_PIC_ERROR");
        ocrCameraActivity.setResult(-1, intent);
        ocrCameraActivity.finish();
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m37020Z0(OcrCameraActivity ocrCameraActivity, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ocrCameraActivity.m37055E0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m37022a1(OcrCameraActivity ocrCameraActivity, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ocrCameraActivity.m37080r1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m37024b1(OcrCameraActivity ocrCameraActivity, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ocrCameraActivity.f31336L) {
            ocrCameraActivity.onBackPressed();
        } else {
            ocrCameraActivity.m37076n1(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m37026c1(OcrCameraActivity ocrCameraActivity, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent();
        intent.putExtra("take_pic_request_key", ocrCameraActivity.getIntent().getIntExtra("take_pic_request_key", 0));
        intent.putExtra("take_pic_result_key", ocrCameraActivity.f31337M);
        ocrCameraActivity.setResult(-1, intent);
        ocrCameraActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m37028d1(OcrCameraActivity ocrCameraActivity, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ocrCameraActivity.m37076n1(true);
        ocrCameraActivity.m37078p1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m37033g1(OcrCameraActivity ocrCameraActivity, String str) {
        Message messageObtainMessage;
        Handler handler = ocrCameraActivity.f31347v;
        if (handler != null && (messageObtainMessage = handler.obtainMessage(1, str)) != null) {
            messageObtainMessage.sendToTarget();
        }
        return Unit.INSTANCE;
    }

    @MainThread
    /* JADX INFO: renamed from: E0 */
    public final void m37055E0() {
        Handler handler = this.f31347v;
        if (handler != null) {
            handler.sendEmptyMessage(9);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: J0 */
    public final void m37057J0() {
        Handler handler = this.f31347v;
        if (handler != null) {
            handler.sendEmptyMessage(10);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: K0 */
    public final void m37058K0() {
        Handler handler = this.f31347v;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final C36883c m37059M0() {
        return (C36883c) this.f31338m.getValue(this, f31324O[0]);
    }

    /* JADX INFO: renamed from: N0 */
    public final CameraCharacteristics m37060N0(String str) {
        if (Intrinsics.areEqual(str, this.f31348w)) {
            return this.f31349x;
        }
        if (Intrinsics.areEqual(str, this.f31350y)) {
            return this.f31351z;
        }
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public final CameraManager m37061O0() {
        return (CameraManager) this.f31339n.getValue();
    }

    /* JADX INFO: renamed from: P0 */
    public final TextureView m37062P0() {
        Object value = this.f31343r.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextureView) value;
    }

    /* JADX INFO: renamed from: Q0 */
    public final C17140c m37063Q0() {
        return (C17140c) this.f31342q.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final int m37066T0() {
        return R$layout.busercenter_activity_ocr_camera;
    }

    @WorkerThread
    /* JADX INFO: renamed from: U0 */
    public final Size m37067U0(CameraCharacteristics cameraCharacteristics, Class<?> cls, int i11, int i12) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(cls) : null;
        Intrinsics.checkNotNull(outputSizes);
        return m37068V0(outputSizes, i11, i12);
    }

    /* JADX INFO: renamed from: V0 */
    public final Size m37068V0(Size[] sizeArr, int i11, int i12) {
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        float f11 = i11 / i12;
        Size size = sizeArr[0];
        Iterator it = ArrayIteratorKt.iterator(sizeArr);
        float f12 = 0.5f;
        while (it.hasNext()) {
            Size size2 = (Size) it.next();
            float fAbs = Math.abs(f11 - (size2.getWidth() / size2.getHeight()));
            if (fAbs == 0.0f) {
                return size2;
            }
            if (fAbs < f12) {
                size = size2;
                f12 = fAbs;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m37069W0() {
        runOnUiThread(new Runnable() { // from class: com.kubi.kyc.ui.z0
            @Override // java.lang.Runnable
            public final void run() {
                OcrCameraActivity.m37017X0(this.f31595b);
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m37070Y0() {
        SettableFuture<CameraDevice> settableFuture = this.f31325A;
        CameraDevice cameraDevice = settableFuture != null ? settableFuture.get() : null;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.f31325A = null;
        this.f31326B = null;
    }

    @MainThread
    /* JADX INFO: renamed from: f1 */
    public final void m37071f1(final String str) {
        m37056F0(new Function0() { // from class: com.kubi.kyc.ui.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OcrCameraActivity.m37033g1(this.f31375b, str);
            }
        });
    }

    @MainThread
    /* JADX INFO: renamed from: i1 */
    public final void m37073i1(int i11, int i12) {
        Message messageObtainMessage;
        Handler handler = this.f31347v;
        if (handler == null || (messageObtainMessage = handler.obtainMessage(8, i11, i12)) == null) {
            return;
        }
        messageObtainMessage.sendToTarget();
    }

    @MainThread
    /* JADX INFO: renamed from: j1 */
    public final void m37074j1(int i11, int i12) {
        Message messageObtainMessage;
        Handler handler = this.f31347v;
        if (handler == null || (messageObtainMessage = handler.obtainMessage(5, i11, i12)) == null) {
            return;
        }
        messageObtainMessage.sendToTarget();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m37075k1() {
        String string = getString(R$string.camera_authorization_tips, getString(R$string.camera_storage_authorization));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogHelper.m37109c(this, string, supportFragmentManager, new Function0() { // from class: com.kubi.kyc.ui.d1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OcrCameraActivity.m37039l1(this.f31390b);
            }
        }, new Function0() { // from class: com.kubi.kyc.ui.e1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OcrCameraActivity.m37041m1(this.f31392b);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final void m37076n1(boolean z11) {
        ImageView imageView;
        ImageView imageView2;
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        ImageView imageView3;
        ImageView imageView4;
        LinearLayout linearLayout2;
        FrameLayout frameLayout2;
        this.f31336L = z11;
        if (z11) {
            C36883c c36883cM37059M0 = m37059M0();
            if (c36883cM37059M0 != null && (frameLayout2 = c36883cM37059M0.f81436e) != null) {
                ViewExtKt.m66594y(frameLayout2);
            }
            C36883c c36883cM37059M1 = m37059M0();
            if (c36883cM37059M1 != null && (linearLayout2 = c36883cM37059M1.f81439h) != null) {
                ViewExtKt.m66577h(linearLayout2);
            }
            C36883c c36883cM37059M2 = m37059M0();
            if (c36883cM37059M2 != null && (imageView4 = c36883cM37059M2.f81437f) != null) {
                imageView4.setImageResource(R$drawable.ic2_arrow_left2_20);
            }
            C36883c c36883cM37059M3 = m37059M0();
            if (c36883cM37059M3 == null || (imageView3 = c36883cM37059M3.f81438g) == null) {
                return;
            }
            ViewExtKt.m66594y(imageView3);
            return;
        }
        C36883c c36883cM37059M4 = m37059M0();
        if (c36883cM37059M4 != null && (frameLayout = c36883cM37059M4.f81436e) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        C36883c c36883cM37059M5 = m37059M0();
        if (c36883cM37059M5 != null && (linearLayout = c36883cM37059M5.f81439h) != null) {
            ViewExtKt.m66594y(linearLayout);
        }
        C36883c c36883cM37059M6 = m37059M0();
        if (c36883cM37059M6 != null && (imageView2 = c36883cM37059M6.f81437f) != null) {
            imageView2.setImageResource(R$drawable.ic_close_24);
        }
        C36883c c36883cM37059M7 = m37059M0();
        if (c36883cM37059M7 == null || (imageView = c36883cM37059M7.f81438g) == null) {
            return;
        }
        ViewExtKt.m66577h(imageView);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m37077o1() {
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        this.f31346u = handlerThread;
        handlerThread.start();
        this.f31347v = new Handler(handlerThread.getLooper(), this);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.ui.f1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OcrCameraActivity.m37030e1(this.f31395b);
            }
        });
        super.onDestroy();
    }

    @MainThread
    /* JADX INFO: renamed from: p1 */
    public final void m37078p1() {
        Handler handler = this.f31347v;
        if (handler != null) {
            handler.sendEmptyMessage(6);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m37079q1() {
        HandlerThread handlerThread = this.f31346u;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f31346u = null;
        this.f31347v = null;
    }

    @MainThread
    /* JADX INFO: renamed from: r1 */
    public final void m37080r1() {
        SettableFuture<CameraDevice> settableFuture = this.f31325A;
        CameraDevice cameraDevice = settableFuture != null ? settableFuture.get() : null;
        String str = Intrinsics.areEqual(cameraDevice != null ? cameraDevice.getId() : null, this.f31348w) ? this.f31350y : this.f31348w;
        if (str != null) {
            m37014I0();
            m37071f1(str);
            m37057J0();
            m37074j1(1440, TXVodDownloadDataSource.QUALITY_1080P);
            m37073i1(4032, 3024);
            m37058K0();
            m37078p1();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m37012G0(Function0 function0, OcrCameraActivity ocrCameraActivity, Boolean bool) {
        if (bool.booleanValue()) {
            function0.invoke();
        } else {
            ocrCameraActivity.m37075k1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m37013H0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e1 */
    public static final Unit m37030e1(OcrCameraActivity ocrCameraActivity) {
        ocrCameraActivity.m37070Y0();
        ocrCameraActivity.m37079q1();
        ocrCameraActivity.f31344s.release();
        Handler handler = ocrCameraActivity.f31347v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l1 */
    public static final Unit m37039l1(OcrCameraActivity ocrCameraActivity) {
        ocrCameraActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m37041m1(OcrCameraActivity ocrCameraActivity) {
        ocrCameraActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m37056F0(final Function0<Unit> function0) {
        C46126b c46126bM56595V = m56595V();
        Intrinsics.checkNotNullExpressionValue(c46126bM56595V, "getRxPermissions(...)");
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(c46126bM56595V, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OcrCameraActivity.m37012G0(function0, this, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(new Consumer() { // from class: com.kubi.kyc.ui.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OcrCameraActivity.m37013H0(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: R0 */
    public final int m37064R0(CameraCharacteristics cameraCharacteristics) {
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        int i11 = 0;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation == 3) {
                        i11 = 270;
                    }
                } else {
                    i11 = 180;
                }
            } else {
                i11 = 90;
            }
        }
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Intrinsics.checkNotNull(obj);
        int iIntValue = ((Number) obj).intValue();
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num != null && num.intValue() == 0) {
            return (360 - ((iIntValue + i11) % TXVodDownloadDataSource.QUALITY_360P)) % TXVodDownloadDataSource.QUALITY_360P;
        }
        return ((iIntValue - i11) + TXVodDownloadDataSource.QUALITY_360P) % TXVodDownloadDataSource.QUALITY_360P;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m37072h1() {
        m37014I0();
        String str = this.f31350y;
        if (str == null) {
            str = this.f31348w;
        }
        if (str != null) {
            m37071f1(str);
        } else {
            m37069W0();
        }
        m37057J0();
        m37074j1(1440, TXVodDownloadDataSource.QUALITY_1080P);
        m37073i1(4032, 3024);
        m37058K0();
        m37078p1();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        String[] cameraIdList;
        TextView textView;
        Button button;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        CameraCharacteristics cameraCharacteristics;
        RelativeLayout relativeLayout;
        super.onCreate(savedInstanceState);
        setContentView(m37066T0());
        m37077o1();
        C36883c c36883cM37059M0 = m37059M0();
        if (c36883cM37059M0 != null && (relativeLayout = c36883cM37059M0.f81440i) != null) {
            relativeLayout.bringToFront();
        }
        if (m37061O0() == null) {
            m37069W0();
        }
        CameraManager cameraManagerM37061O0 = m37061O0();
        if (cameraManagerM37061O0 != null) {
            cameraIdList = cameraManagerM37061O0.getCameraIdList();
        } else {
            cameraIdList = null;
        }
        if (cameraIdList != null) {
            for (String str : cameraIdList) {
                CameraManager cameraManagerM37061O1 = m37061O0();
                if (cameraManagerM37061O1 != null) {
                    cameraCharacteristics = cameraManagerM37061O1.getCameraCharacteristics(str);
                } else {
                    cameraCharacteristics = null;
                }
                if (cameraCharacteristics != null) {
                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                    Integer num = (Integer) cameraCharacteristics.get(key);
                    if (num != null && num.intValue() == 0) {
                        this.f31348w = str;
                        this.f31349x = cameraCharacteristics;
                    } else {
                        Integer num2 = (Integer) cameraCharacteristics.get(key);
                        if (num2 != null && num2.intValue() == 1) {
                            this.f31350y = str;
                            this.f31351z = cameraCharacteristics;
                        }
                    }
                }
            }
        }
        m37072h1();
        this.f31328D = SettableFuture.create();
        m37062P0().setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC17143f());
        C36883c c36883cM37059M1 = m37059M0();
        if (c36883cM37059M1 != null && (imageView3 = c36883cM37059M1.f81434c) != null) {
            ViewExtKt.m66575f(imageView3, new Function1() { // from class: com.kubi.kyc.ui.g1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OcrCameraActivity.m37020Z0(this.f31398b, (View) obj);
                }
            });
        }
        C36883c c36883cM37059M2 = m37059M0();
        if (c36883cM37059M2 != null && (imageView2 = c36883cM37059M2.f81438g) != null) {
            ViewExtKt.m66575f(imageView2, new Function1() { // from class: com.kubi.kyc.ui.h1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OcrCameraActivity.m37022a1(this.f31400b, (View) obj);
                }
            });
        }
        C36883c c36883cM37059M3 = m37059M0();
        if (c36883cM37059M3 != null && (imageView = c36883cM37059M3.f81437f) != null) {
            ViewExtKt.m66575f(imageView, new Function1() { // from class: com.kubi.kyc.ui.i1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OcrCameraActivity.m37024b1(this.f31403b, (View) obj);
                }
            });
        }
        m37076n1(this.f31336L);
        C36883c c36883cM37059M4 = m37059M0();
        if (c36883cM37059M4 != null && (button = c36883cM37059M4.f81433b) != null) {
            ViewExtKt.m66575f(button, new Function1() { // from class: com.kubi.kyc.ui.j1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OcrCameraActivity.m37026c1(this.f31405b, (View) obj);
                }
            });
        }
        C36883c c36883cM37059M5 = m37059M0();
        if (c36883cM37059M5 != null && (textView = c36883cM37059M5.f81444m) != null) {
            ViewExtKt.m66575f(textView, new Function1() { // from class: com.kubi.kyc.ui.k1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OcrCameraActivity.m37028d1(this.f31408b, (View) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() throws Throwable {
        Object objM103844constructorimpl;
        Unit unit;
        super.onPause();
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            m37063Q0().disable();
            m37014I0();
            ImageReader imageReader = this.f31330F;
            if (imageReader != null) {
                imageReader.close();
            }
            ImageReader imageReader2 = this.f31332H;
            if (imageReader2 != null) {
                imageReader2.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!zM42528a && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                C44128b.m97262f("crash_issue", "crash_issue->【WidgetLifecycle 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            } else {
                throw thM103847exceptionOrNullimpl;
            }
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl2, "OcrCameraActivity", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m37063Q0().enable();
    }
}
