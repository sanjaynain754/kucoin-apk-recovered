package com.kubi.kyc.ui.kycv2.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.blankj.utilcode.util.C5274i;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.google.common.util.concurrent.ListenableFuture;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.kyc.exception.KycException;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.sdk.BaseApplication;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p445m2.AbstractC42397h;
import p460n2.InterfaceC42704b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KycCameraViewModel.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J(\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fJ\"\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/H\u0094@¢\u0006\u0002\u00100R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u00070\b¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u00070\u000b¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UIState;", "<init>", "()V", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "Lorg/jspecify/annotations/NonNull;", "preview", "Landroidx/camera/core/Preview;", "track", "", "category", "", "error_message", "success", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "initializeCamera", "context", "Landroid/content/Context;", "startPreview", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "previewView", "Landroidx/camera/view/PreviewView;", "switchCamera", "capturePhoto", "clipOutPathView", "Lcom/kubi/kyc/ui/kycv2/camera/ClipOutPathView;", "cropPhoto", "uri", "Landroid/net/Uri;", ConstantsKt.FACE_CAPTURE_MODE_FRONT, "cropImage", "Landroid/graphics/Bitmap;", "bitmap", "getCaptureStorageDirectory", "Ljava/io/File;", "cameraLensToSelector", "Landroidx/camera/core/CameraSelector;", "lensFacing", "", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UIState;", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycCameraViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycCameraViewModel.kt\ncom/kubi/kyc/ui/kycv2/camera/KycCameraViewModel\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 4 KycIssue.kt\ncom/kubi/kyc/exception/KycIssueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,328:1\n71#2,4:329\n50#3,17:333\n44#4,2:350\n774#5:352\n865#5,2:353\n*S KotlinDebug\n*F\n+ 1 KycCameraViewModel.kt\ncom/kubi/kyc/ui/kycv2/camera/KycCameraViewModel\n*L\n60#1:329,4\n113#1:333,17\n134#1:350,2\n89#1:352\n89#1:353,2\n*E\n"})
public final class KycCameraViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f31477a0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    public ProcessCameraProvider f31478X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ImageCapture f31479Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Preview f31480Z;

    /* JADX INFO: compiled from: KycCameraViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraViewModel$Companion;", "", "<init>", "()V", "CAMERA_INIT", "", "CAMERA_INIT_RESULT", "CAMERA_PREVIEW", "CAMERA_PREVIEW_RESULT", "CAMERA_FINISH", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.KycCameraViewModel$a */
    /* JADX INFO: compiled from: KycCameraViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kyc/ui/kycv2/camera/KycCameraViewModel$capturePhoto$1", "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "onImageSaved", "", "outputFileResults", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "onError", "exception", "Landroidx/camera/core/ImageCaptureException;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17203a implements ImageCapture.OnImageSavedCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PreviewView f31482b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ClipOutPathView f31483c;

        public C17203a(PreviewView previewView, ClipOutPathView clipOutPathView) {
            this.f31482b = previewView;
            this.f31483c = clipOutPathView;
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(ImageCaptureException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            KycCameraViewModel.this.m37248r(outputFileResults.getSavedUri(), ((UIState) KycCameraViewModel.this.getState()).getCameraLens() == 0, this.f31482b, this.f31483c);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.KycCameraViewModel$b */
    /* JADX INFO: compiled from: KycCameraViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/kyc/ui/kycv2/camera/KycCameraViewModel$cropPhoto$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKycCameraViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycCameraViewModel.kt\ncom/kubi/kyc/ui/kycv2/camera/KycCameraViewModel$cropPhoto$1\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,328:1\n15#2,2:329\n*S KotlinDebug\n*F\n+ 1 KycCameraViewModel.kt\ncom/kubi/kyc/ui/kycv2/camera/KycCameraViewModel$cropPhoto$1\n*L\n223#1:329,2\n*E\n"})
    public static final class C17204b extends AbstractC42397h<Bitmap> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PreviewView f31485f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ClipOutPathView f31486g;

        public C17204b(PreviewView previewView, ClipOutPathView clipOutPathView) {
            this.f31485f = previewView;
            this.f31486g = clipOutPathView;
        }

        /* JADX INFO: renamed from: l */
        public static final UIState m37256l(File file, UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, null, file.getPath(), null, 0, 13, null);
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo6639e(final Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            final KycCameraViewModel kycCameraViewModel = KycCameraViewModel.this;
            final PreviewView previewView = this.f31485f;
            final ClipOutPathView clipOutPathView = this.f31486g;
            C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.kyc.ui.kycv2.camera.m
                @Override // java.lang.Runnable
                public final void run() {
                    KycCameraViewModel.C17204b.m37255k(kycCameraViewModel, resource, previewView, clipOutPathView);
                }
            });
        }

        /* JADX INFO: renamed from: k */
        public static final void m37255k(KycCameraViewModel kycCameraViewModel, Bitmap bitmap, PreviewView previewView, ClipOutPathView clipOutPathView) {
            Bitmap bitmapM37247q = kycCameraViewModel.m37247q(bitmap, previewView, clipOutPathView);
            final File file = new File(kycCameraViewModel.m37249t(), System.currentTimeMillis() + ".jpeg");
            if (bitmapM37247q != null) {
                bitmapM37247q.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(file));
            }
            KycCameraViewModel.m37228E(kycCameraViewModel, "camera_finish", null, Boolean.TRUE, 2, null);
            kycCameraViewModel.updateState(new Function1() { // from class: com.kubi.kyc.ui.kycv2.camera.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycCameraViewModel.C17204b.m37256l(file, (UIState) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.KycCameraViewModel$dispatchIntent$3 */
    /* JADX INFO: compiled from: KycCameraViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kyc.ui.kycv2.camera.KycCameraViewModel$dispatchIntent$3", m90122f = "KycCameraViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C172053 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC19282d $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172053(InterfaceC19282d interfaceC19282d, Continuation<? super C172053> continuation) {
            super(2, continuation);
            this.$intent = interfaceC19282d;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KycCameraViewModel.this.new C172053(this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C172053) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                KycCameraViewModel.this.m37252y(((KycCameraContract$UiIntent.StartPreview) this.$intent).getLifecycleOwner(), ((KycCameraContract$UiIntent.StartPreview) this.$intent).getPreviewView());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m37251v(Context context) {
        m37228E(this, "camera_init", null, null, 6, null);
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.INSTANCE.getInstance(context);
        companion.addListener(new Runnable() { // from class: com.kubi.kyc.ui.kycv2.camera.j
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                KycCameraViewModel.m37240w(this.f31493b, companion);
            }
        }, ContextCompat.getMainExecutor(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m37252y(LifecycleOwner lifecycleOwner, PreviewView previewView) throws Throwable {
        Object objM103844constructorimpl;
        m37228E(this, "camera_preview", null, null, 6, null);
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
            ViewPort viewPort = previewView.getViewPort();
            Intrinsics.checkNotNull(viewPort);
            UseCaseGroup useCaseGroupBuild = builder.setViewPort(viewPort).addUseCase(this.f31479Y).addUseCase(this.f31480Z).build();
            Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "build(...)");
            ProcessCameraProvider processCameraProvider = this.f31478X;
            if (processCameraProvider == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
                processCameraProvider = null;
            }
            processCameraProvider.unbindAll();
            ProcessCameraProvider processCameraProvider2 = this.f31478X;
            if (processCameraProvider2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
                processCameraProvider2 = null;
            }
            processCameraProvider2.bindToLifecycle(lifecycleOwner, m37245o(((UIState) getState()).getCameraLens()), useCaseGroupBuild);
            this.f31480Z.setSurfaceProvider(previewView.getSurfaceProvider());
            try {
                m37228E(this, "camera_preview_result", null, Boolean.TRUE, 2, null);
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(updateState(new Function1() { // from class: com.kubi.kyc.ui.kycv2.camera.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KycCameraViewModel.m37242z((UIState) obj);
                    }
                })));
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
        } catch (Throwable th4) {
            th = th4;
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【KycCameraViewModel 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new KycException(thM103847exceptionOrNullimpl2, "KycCameraViewModel", false, null, 8, null), null, 2, null);
            m37244D("camera_preview_result", thM103847exceptionOrNullimpl2.getMessage(), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final UIState m37226B(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, CameraState.NOT_READY, null, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m37227C(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, CameraState.NOT_READY, null, null, 1, 6, null);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m37228E(KycCameraViewModel kycCameraViewModel, String str, String str2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        kycCameraViewModel.m37244D(str, str2, bool);
    }

    /* JADX INFO: renamed from: s */
    public static final UIState m37239s(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, CameraState.NOT_READY, null, null, 0, 14, null);
    }

    /* JADX INFO: renamed from: x */
    public static final UIState m37241x(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, CameraState.READY, null, list, 0, 10, null);
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m37242z(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, CameraState.READY, null, null, 0, 14, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m37244D(String str, String str2, Boolean bool) {
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        if (str != null) {
            eventParametersBuilderAcquire.m42393d("category", str);
        }
        if (str2 != null) {
            eventParametersBuilderAcquire.m42393d("error_message", str2);
        }
        if (bool != null) {
            eventParametersBuilderAcquire.m42394e("success", bool.booleanValue());
        }
        TechnologyEvent.m42388d("kyc_newcamera_event", eventParametersBuilderAcquire);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof KycCameraContract$UiIntent.CameraInit) {
            m37251v(BaseApplication.INSTANCE.get());
        } else if (interfaceC19282d instanceof KycCameraContract$UiIntent.CameraReset) {
            updateState(new Function1() { // from class: com.kubi.kyc.ui.kycv2.camera.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycCameraViewModel.m37239s((UIState) obj);
                }
            });
        } else if (interfaceC19282d instanceof KycCameraContract$UiIntent.ShutterButtonClick) {
            KycCameraContract$UiIntent.ShutterButtonClick shutterButtonClick = (KycCameraContract$UiIntent.ShutterButtonClick) interfaceC19282d;
            m37246p(shutterButtonClick.getPreviewView(), shutterButtonClick.getClipOutPathView());
        } else if (interfaceC19282d instanceof KycCameraContract$UiIntent.SwitchCameraClick) {
            m37243A();
        } else if (interfaceC19282d instanceof KycCameraContract$UiIntent.StartPreview) {
            launchOnMain(new C172053(interfaceC19282d, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public final CameraSelector m37245o(int i11) {
        if (i11 == 0) {
            CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            return DEFAULT_FRONT_CAMERA;
        }
        if (i11 == 1) {
            CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
            return DEFAULT_BACK_CAMERA;
        }
        throw new IllegalArgumentException("Invalid lens facing type: " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m37246p(PreviewView previewView, ClipOutPathView clipOutPathView) {
        File file = new File(m37249t(), System.currentTimeMillis() + ".jpeg");
        ImageCapture.Metadata metadata = new ImageCapture.Metadata();
        metadata.setReversedHorizontal(((UIState) getState()).getCameraLens() == 0);
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).setMetadata(metadata).build();
        Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "build(...)");
        this.f31479Y.takePicture(outputFileOptionsBuild, C41718o1.m91177a(C42911a.m94120b()), new C17203a(previewView, clipOutPathView));
    }

    /* JADX INFO: renamed from: q */
    public final Bitmap m37247q(Bitmap bitmap, PreviewView previewView, ClipOutPathView clipOutPathView) {
        float fM6235c = C5274i.m6235c(84.0f) - C5274i.m6235c(16.0f);
        float right = clipOutPathView.getRight() - 10.0f;
        float fM6235c2 = C5274i.m6235c(242.0f) + fM6235c + C5274i.m6235c(16.0f);
        float width = 10.0f / previewView.getWidth();
        float height = fM6235c / previewView.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) (bitmap.getWidth() * width), (int) (bitmap.getHeight() * height), (int) (((right / previewView.getWidth()) - width) * bitmap.getWidth()), (int) (((fM6235c2 / previewView.getBottom()) - height) * bitmap.getHeight()));
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: r */
    public final void m37248r(@Nullable Uri uri, boolean z11, @NotNull PreviewView previewView, @NotNull ClipOutPathView clipOutPathView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(clipOutPathView, "clipOutPathView");
        if (uri == null || uri.getPath() == null) {
            return;
        }
        ComponentCallbacks2C5309c.m6557u(clipOutPathView).mo6621d().mo6597H0(uri).m6591B0(new C17204b(previewView, clipOutPathView));
    }

    /* JADX INFO: renamed from: t */
    public final File m37249t() {
        File file = new File(BaseApplication.INSTANCE.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES), "camera_extensions");
        file.mkdirs();
        return file;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 0, 15, null);
    }

    public KycCameraViewModel() {
        ImageCapture imageCaptureBuild = new ImageCapture.Builder().setTargetAspectRatio(1).build();
        Intrinsics.checkNotNullExpressionValue(imageCaptureBuild, "build(...)");
        this.f31479Y = imageCaptureBuild;
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(1).build();
        Intrinsics.checkNotNullExpressionValue(previewBuild, "build(...)");
        this.f31480Z = previewBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static final void m37240w(KycCameraViewModel kycCameraViewModel, ListenableFuture listenableFuture) throws ExecutionException, InterruptedException {
        V v11 = listenableFuture.get();
        Intrinsics.checkNotNullExpressionValue(v11, "get(...)");
        kycCameraViewModel.f31478X = (ProcessCameraProvider) v11;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{1, 0});
        final ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            int iIntValue = ((Number) obj).intValue();
            ProcessCameraProvider processCameraProvider = kycCameraViewModel.f31478X;
            if (processCameraProvider == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
                processCameraProvider = null;
            }
            if (processCameraProvider.hasCamera(kycCameraViewModel.m37245o(iIntValue))) {
                arrayList.add(obj);
            }
        }
        kycCameraViewModel.updateState(new Function1() { // from class: com.kubi.kyc.ui.kycv2.camera.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KycCameraViewModel.m37241x(arrayList, (UIState) obj2);
            }
        });
        m37228E(kycCameraViewModel, "camera_init_result", null, Boolean.TRUE, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final void m37243A() {
        UIState uIState = (UIState) getState();
        if (uIState.getCameraState() == CameraState.READY && uIState.getAvailableCameraLens().size() != 1) {
            if (uIState.getCameraLens() == 1) {
                updateState(new Function1() { // from class: com.kubi.kyc.ui.kycv2.camera.h
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KycCameraViewModel.m37226B((UIState) obj);
                    }
                });
            } else {
                updateState(new Function1() { // from class: com.kubi.kyc.ui.kycv2.camera.i
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KycCameraViewModel.m37227C((UIState) obj);
                    }
                });
            }
        }
    }
}
