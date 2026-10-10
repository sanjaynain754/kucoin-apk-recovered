package com.sumsub.sns.internal.core.presentation.camera;

import android.content.Context;
import android.os.SystemClock;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.ExposureState;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.ListenableFuture;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.util.camera.C33394d;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.io.File;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28746l {

    /* JADX INFO: renamed from: x */
    public static final Size f58454x = new Size(1920, TXVodDownloadDataSource.QUALITY_1080P);

    /* JADX INFO: renamed from: y */
    public static final Size f58455y = new Size(1280, 960);

    /* JADX INFO: renamed from: a */
    public final CameraX$Mode f58456a;

    /* JADX INFO: renamed from: b */
    public final C28732b f58457b;

    /* JADX INFO: renamed from: c */
    public final CameraSelector f58458c;

    /* JADX INFO: renamed from: d */
    public final C33394d f58459d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC28753s f58460e;

    /* JADX INFO: renamed from: f */
    public ExecutorService f58461f;

    /* JADX INFO: renamed from: g */
    public AbstractC41710m1 f58462g;

    /* JADX INFO: renamed from: h */
    public InterfaceC41709m0 f58463h;

    /* JADX INFO: renamed from: i */
    public VideoCapture f58464i;

    /* JADX INFO: renamed from: j */
    public Recording f58465j;

    /* JADX INFO: renamed from: k */
    public ImageCapture f58466k;

    /* JADX INFO: renamed from: l */
    public ImageAnalysis f58467l;

    /* JADX INFO: renamed from: m */
    public Preview f58468m;

    /* JADX INFO: renamed from: n */
    public Camera f58469n;

    /* JADX INFO: renamed from: o */
    public ProcessCameraProvider f58470o;

    /* JADX INFO: renamed from: p */
    public PreviewView.StreamState f58471p;

    /* JADX INFO: renamed from: q */
    public File f58472q;

    /* JADX INFO: renamed from: r */
    public PreviewView f58473r;

    /* JADX INFO: renamed from: s */
    public boolean f58474s;

    /* JADX INFO: renamed from: t */
    public long f58475t;

    /* JADX INFO: renamed from: u */
    public final Observer f58476u = new Observer() { // from class: com.sumsub.sns.internal.core.presentation.camera.c0
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            C28746l.m69558a(this.f58438b, (PreviewView.StreamState) obj);
        }
    };

    /* JADX INFO: renamed from: v */
    public final Observer f58477v = new Observer() { // from class: com.sumsub.sns.internal.core.presentation.camera.d0
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            C28746l.m69556a(this.f58441b, (CameraState) obj);
        }
    };

    /* JADX INFO: renamed from: w */
    public final ResolutionSelector f58478w;

    /* JADX INFO: renamed from: a */
    public final void m69567a(final File file) {
        if (C28468k0.f57988f && this.f58465j != null) {
            throw new IllegalStateException("Check failed.");
        }
        VideoCapture videoCapture = this.f58464i;
        if (videoCapture == null) {
            C33272c.f67816e.f67810a.mo68956e("CameraX", "takeVideoSnapshot: videoCapture use case is null, aborting", null);
            return;
        }
        PreviewView previewView = this.f58473r;
        Context context = previewView != null ? previewView.getContext() : null;
        if (context == null) {
            C33272c.f67816e.f67810a.mo68956e("CameraX", "takeVideoSnapshot: context is null, aborting", null);
            return;
        }
        if (file == null) {
            file = new File(context.getCacheDir(), UUID.randomUUID() + ".mp4");
        }
        C33272c.f67816e.f67810a.mo68955d("CameraX", "Take video snapshot and save to " + file.getName(), null);
        FileOutputOptions.Builder builder = new FileOutputOptions.Builder(file);
        long j11 = this.f58457b.f58431e;
        if (j11 > 0) {
            builder.setFileSizeLimit(j11);
        }
        long j12 = this.f58457b.f58430d;
        if (j12 > 0) {
            builder.setDurationLimitMillis(j12);
        }
        PendingRecording pendingRecordingPrepareRecording = ((Recorder) videoCapture.getOutput()).prepareRecording(context, builder.build());
        CameraX$Mode cameraX$Mode = this.f58456a;
        if (cameraX$Mode != CameraX$Mode.SEAMLESS_DOC_CAPTURE && cameraX$Mode != CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
            PendingRecording.withAudioEnabled$default(pendingRecordingPrepareRecording, false, 1, null);
        }
        this.f58465j = pendingRecordingPrepareRecording.start(ContextCompat.getMainExecutor(context), new Consumer() { // from class: com.sumsub.sns.internal.core.presentation.camera.z
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                C28746l.m69560a(this.f58492b, file, (VideoRecordEvent) obj);
            }
        });
        this.f58472q = file;
    }

    /* JADX INFO: renamed from: b */
    public final void m69569b(final LifecycleOwner lifecycleOwner, PreviewView previewView, final Function0 function0) {
        AbstractC41710m1 abstractC41710m1M91179c;
        LiveData<PreviewView.StreamState> previewStreamState;
        this.f58474s = false;
        this.f58473r = previewView;
        if (previewView != null && (previewStreamState = previewView.getPreviewStreamState()) != null) {
            previewStreamState.removeObserver(this.f58476u);
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f58461f = executorServiceNewSingleThreadExecutor;
        if (executorServiceNewSingleThreadExecutor == null || (abstractC41710m1M91179c = C41718o1.m91179c(executorServiceNewSingleThreadExecutor)) == null) {
            abstractC41710m1M91179c = null;
        } else {
            this.f58463h = C41713n0.m91125a(abstractC41710m1M91179c);
        }
        this.f58462g = abstractC41710m1M91179c;
        previewView.getPreviewStreamState().observe(lifecycleOwner, this.f58476u);
        boolean z11 = ContextCompat.checkSelfPermission(previewView.getContext(), "android.permission.CAMERA") == 0;
        boolean zAreEqual = Intrinsics.areEqual(this.f58458c, CameraSelector.DEFAULT_FRONT_CAMERA);
        C33272c.f67816e.f67810a.mo68955d("CameraX", "startInternal: mode=" + this.f58456a + ", cameraPermissionGranted=" + z11 + ", front=" + zAreEqual, null);
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.INSTANCE.getInstance(previewView.getContext());
        companion.addListener(new Runnable() { // from class: com.sumsub.sns.internal.core.presentation.camera.b0
            @Override // java.lang.Runnable
            public final void run() {
                C28746l.m69559a(this.f58432b, companion, lifecycleOwner, function0);
            }
        }, ContextCompat.getMainExecutor(previewView.getContext()));
    }

    /* JADX INFO: renamed from: c */
    public final void m69570c() {
        C28732b c28732b = this.f58457b;
        Recorder.Builder qualitySelector = new Recorder.Builder().setQualitySelector(QualitySelector.from(c28732b.f58428b, FallbackStrategy.higherQualityOrLowerThan(c28732b.f58429c)));
        int i11 = this.f58457b.f58427a;
        if (i11 > 0) {
            C33272c.f67816e.f67810a.mo68955d("CameraX", "using " + i11 + " videoBitRate", null);
            qualitySelector.setTargetVideoEncodingBitRate(this.f58457b.f58427a);
        }
        this.f58464i = VideoCapture.withOutput(qualitySelector.build());
    }

    /* JADX INFO: renamed from: d */
    public final C28758x m69571d() {
        CameraInfo cameraInfo;
        ExposureState exposureState;
        CameraInfo cameraInfo2;
        ExposureState exposureState2;
        Integer num;
        Integer num2;
        CameraInfo cameraInfo3;
        ExposureState exposureState3;
        Camera camera = this.f58469n;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null || !exposureState.isExposureCompensationSupported()) {
            return new C28758x();
        }
        Camera camera2 = this.f58469n;
        Integer numValueOf = null;
        Range<Integer> exposureCompensationRange = (camera2 == null || (cameraInfo3 = camera2.getCameraInfo()) == null || (exposureState3 = cameraInfo3.getExposureState()) == null) ? null : exposureState3.getExposureCompensationRange();
        int iIntValue = (exposureCompensationRange == null || (num2 = (Integer) exposureCompensationRange.getLower()) == null) ? 0 : num2.intValue();
        int iIntValue2 = (exposureCompensationRange == null || (num = (Integer) exposureCompensationRange.getUpper()) == null) ? 0 : num.intValue();
        Camera camera3 = this.f58469n;
        if (camera3 != null && (cameraInfo2 = camera3.getCameraInfo()) != null && (exposureState2 = cameraInfo2.getExposureState()) != null) {
            numValueOf = Integer.valueOf(exposureState2.getExposureCompensationIndex());
        }
        return new C28758x(m69561a(numValueOf != null ? numValueOf.intValue() : 0), m69561a(iIntValue), m69561a(iIntValue2));
    }

    /* JADX INFO: renamed from: e */
    public final void m69572e() {
        CameraInfo cameraInfo;
        LiveData<CameraState> cameraState;
        LiveData<PreviewView.StreamState> previewStreamState;
        C33272c.f67816e.f67810a.mo68955d("CameraX", "On destroy", null);
        this.f58474s = true;
        this.f58471p = null;
        ImageAnalysis imageAnalysis = this.f58467l;
        if (imageAnalysis != null) {
            imageAnalysis.clearAnalyzer();
        }
        ExecutorService executorService = this.f58461f;
        if (executorService != null) {
            executorService.shutdown();
        }
        m69573f();
        ProcessCameraProvider processCameraProvider = this.f58470o;
        if (processCameraProvider != null) {
            Iterator it = CollectionsKt.listOfNotNull((Object[]) new UseCase[]{this.f58468m, this.f58466k, this.f58464i, this.f58467l}).iterator();
            while (it.hasNext()) {
                processCameraProvider.unbind((UseCase) it.next());
            }
        }
        this.f58470o = null;
        Preview preview = this.f58468m;
        if (preview != null) {
            preview.setSurfaceProvider(null);
        }
        this.f58468m = null;
        PreviewView previewView = this.f58473r;
        if (previewView != null && (previewStreamState = previewView.getPreviewStreamState()) != null) {
            previewStreamState.removeObserver(this.f58476u);
        }
        this.f58473r = null;
        Camera camera = this.f58469n;
        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null && (cameraState = cameraInfo.getCameraState()) != null) {
            cameraState.removeObserver(this.f58477v);
        }
        this.f58469n = null;
        this.f58475t = 0L;
        InterfaceC41709m0 interfaceC41709m0 = this.f58463h;
        if (interfaceC41709m0 != null) {
            C41713n0.m91129e(interfaceC41709m0, null, 1, null);
        }
        AbstractC41710m1 abstractC41710m1 = this.f58462g;
        if (abstractC41710m1 != null) {
            try {
                abstractC41710m1.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m69573f() {
        if (this.f58465j == null) {
            return;
        }
        C33272c.f67816e.f67810a.mo68955d("CameraX", "Stop video recording", null);
        Recording recording = this.f58465j;
        if (recording != null) {
            recording.stop();
        }
        Recording recording2 = this.f58465j;
        if (recording2 != null) {
            recording2.close();
        }
        this.f58465j = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m69574g() {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("CameraX", "Take picture", null);
        if (this.f58456a == CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY) {
            c33270a.f67810a.mo68955d("CameraX", "Taking picture on legacy seamless", null);
            InterfaceC41709m0 interfaceC41709m0 = this.f58463h;
            if (interfaceC41709m0 != null) {
                C41696j.m91104d(interfaceC41709m0, null, null, new C28744j(this, null), 3, null);
                return;
            }
            return;
        }
        ImageCapture imageCapture = this.f58466k;
        if (imageCapture == null) {
            c33270a.f67810a.mo68956e("CameraX", "takePicture: imageCapture use case is null, aborting", null);
            return;
        }
        PreviewView previewView = this.f58473r;
        Context context = previewView != null ? previewView.getContext() : null;
        File cacheDir = context != null ? context.getCacheDir() : null;
        String str = "manual_" + UUID.randomUUID() + ".jpg";
        if (str == null) {
            str = UUID.randomUUID() + ".jpg";
        }
        File file = new File(cacheDir, str);
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
        PreviewView previewView2 = this.f58473r;
        Context context2 = previewView2 != null ? previewView2.getContext() : null;
        if (context2 == null) {
            c33270a.f67810a.mo68956e("CameraX", "takePicture: context is null, aborting", null);
        } else {
            imageCapture.takePicture(outputFileOptionsBuild, ContextCompat.getMainExecutor(context2), new C28745k(file, this));
        }
    }

    public C28746l(CameraX$Mode cameraX$Mode, Size size, int i11, C28732b c28732b, CameraSelector cameraSelector, C33394d c33394d, InterfaceC28753s interfaceC28753s) {
        this.f58456a = cameraX$Mode;
        this.f58457b = c28732b;
        this.f58458c = cameraSelector;
        this.f58459d = c33394d;
        this.f58460e = interfaceC28753s;
        ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
        if (size == null) {
            if (i11 == 0) {
                size = f58455y;
            } else {
                size = f58454x;
            }
        }
        this.f58478w = builder.setResolutionStrategy(new ResolutionStrategy(size, 1)).setAspectRatioStrategy(new AspectRatioStrategy(i11, 1)).setAllowedResolutionMode(0).build();
    }

    /* JADX INFO: renamed from: b */
    public final UseCaseGroup m69568b() {
        UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
        switch (AbstractC28741g.f58445a[this.f58456a.ordinal()]) {
            case 1:
                this.f58466k = new ImageCapture.Builder().setResolutionSelector(this.f58478w).build();
                break;
            case 2:
                m69570c();
                break;
            case 3:
                m69562a();
                break;
            case 4:
                this.f58466k = new ImageCapture.Builder().setResolutionSelector(this.f58478w).build();
                m69562a();
                break;
            case 5:
                m69570c();
                m69562a();
                break;
            case 6:
                m69570c();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ImageCapture imageCapture = this.f58466k;
        if (imageCapture != null) {
            builder.addUseCase(imageCapture);
        }
        VideoCapture videoCapture = this.f58464i;
        if (videoCapture != null) {
            builder.addUseCase(videoCapture);
        }
        ImageAnalysis imageAnalysis = this.f58467l;
        if (imageAnalysis != null) {
            builder.addUseCase(imageAnalysis);
        }
        Preview previewBuild = new Preview.Builder().setResolutionSelector(this.f58478w).build();
        PreviewView previewView = this.f58473r;
        previewBuild.setSurfaceProvider(previewView != null ? previewView.getSurfaceProvider() : null);
        builder.addUseCase(previewBuild);
        this.f58468m = previewBuild;
        return builder.build();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69558a(C28746l c28746l, PreviewView.StreamState streamState) {
        InterfaceC28753s interfaceC28753s;
        long j11 = c28746l.f58475t;
        Long lValueOf = Long.valueOf(j11);
        if (j11 <= 0) {
            lValueOf = null;
        }
        C33272c.f67816e.f67810a.mo68955d("CameraX", "Stream state changed: " + streamState + " (" + (lValueOf != null ? SystemClock.elapsedRealtime() - lValueOf.longValue() : -1L) + "ms since bind)", null);
        if (c28746l.f58471p != streamState) {
            if (streamState == PreviewView.StreamState.STREAMING && (interfaceC28753s = c28746l.f58460e) != null) {
                interfaceC28753s.mo69579b();
            }
            c28746l.f58471p = streamState;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69556a(C28746l c28746l, CameraState cameraState) {
        String str;
        String str2;
        CameraState.StateError error = cameraState.getError();
        if (error != null) {
            int code = error.getCode();
            int code2 = error.getCode();
            c28746l.getClass();
            switch (code2) {
                case 1:
                    str2 = "ERROR_MAX_CAMERAS_IN_USE";
                    break;
                case 2:
                    str2 = "ERROR_CAMERA_IN_USE";
                    break;
                case 3:
                    str2 = "ERROR_OTHER_RECOVERABLE_ERROR";
                    break;
                case 4:
                    str2 = "ERROR_STREAM_CONFIG";
                    break;
                case 5:
                    str2 = "ERROR_CAMERA_DISABLED";
                    break;
                case 6:
                    str2 = "ERROR_CAMERA_FATAL_ERROR";
                    break;
                case 7:
                    str2 = "ERROR_DO_NOT_DISTURB_MODE_ENABLED";
                    break;
                default:
                    str2 = "UNKNOWN";
                    break;
            }
            str = ", error=" + code + " (" + str2 + ")";
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C33272c.f67816e.f67810a.mo68955d("CameraX", "Camera device state: type=" + cameraState.getType() + str, error != null ? error.getCause() : null);
    }

    /* JADX INFO: renamed from: a */
    public final void m69566a(final LifecycleOwner lifecycleOwner, final PreviewView previewView, final Function0 function0) {
        String str = "start: cameraFront=" + Intrinsics.areEqual(this.f58458c, CameraSelector.DEFAULT_FRONT_CAMERA);
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("CameraX", str, null);
        if (previewView == null) {
            c33270a.f67810a.mo68956e("CameraX", "start: previewView is null, aborting", null);
            return;
        }
        if (previewView == this.f58473r) {
            c33270a.f67810a.mo68955d("CameraX", "start: skipping", null);
            return;
        }
        if (this.f58459d == null) {
            c33270a.f67810a.mo68955d("CameraX", "CameraChecked is null", null);
            m69569b(lifecycleOwner, previewView, function0);
        } else {
            c33270a.f67810a.mo68955d("CameraX", "Starting camera check", null);
            this.f58459d.f68101b.m71691a(new Function0() { // from class: com.sumsub.sns.internal.core.presentation.camera.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C28746l.m69555a(this.f58423b, lifecycleOwner, previewView, function0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69555a(C28746l c28746l, LifecycleOwner lifecycleOwner, PreviewView previewView, Function0 function0) {
        c28746l.m69569b(lifecycleOwner, previewView, function0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m69559a(C28746l c28746l, ListenableFuture listenableFuture, LifecycleOwner lifecycleOwner, Function0 function0) {
        CameraInfo cameraInfo;
        LiveData<CameraState> cameraState;
        if (c28746l.f58474s) {
            C33272c.f67816e.f67810a.mo68955d("CameraX", "startInternal: stopped before bind, skipping", null);
            return;
        }
        try {
            ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) listenableFuture.get();
            processCameraProvider.unbindAll();
            c28746l.f58475t = SystemClock.elapsedRealtime();
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(lifecycleOwner, c28746l.f58458c, c28746l.m69568b());
            c28746l.f58469n = cameraBindToLifecycle;
            c28746l.f58470o = processCameraProvider;
            if (cameraBindToLifecycle != null && (cameraInfo = cameraBindToLifecycle.getCameraInfo()) != null && (cameraState = cameraInfo.getCameraState()) != null) {
                cameraState.observe(lifecycleOwner, c28746l.f58477v);
            }
            if (function0 != null) {
                function0.invoke();
            }
        } catch (IllegalArgumentException e11) {
            InterfaceC28753s interfaceC28753s = c28746l.f58460e;
            if (interfaceC28753s != null) {
                interfaceC28753s.onError(new C28757w());
            }
            C33272c.f67816e.f67810a.mo68956e("CameraX", "Init camera failed with unsupported hardware: " + e11.getMessage(), e11);
        } catch (Exception e12) {
            InterfaceC28753s interfaceC28753s2 = c28746l.f58460e;
            if (interfaceC28753s2 != null) {
                interfaceC28753s2.onError(e12);
            }
            C33272c.f67816e.f67810a.mo68956e("CameraX", "Init camera failed: " + e12.getClass().getSimpleName() + ": " + e12.getMessage(), e12);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69560a(C28746l c28746l, File file, VideoRecordEvent videoRecordEvent) {
        c28746l.m69565a(videoRecordEvent, file);
    }

    /* JADX INFO: renamed from: a */
    public final void m69565a(VideoRecordEvent videoRecordEvent, File file) {
        InterfaceC28753s interfaceC28753s;
        boolean z11 = videoRecordEvent instanceof VideoRecordEvent.Start;
        if (z11 && (interfaceC28753s = this.f58460e) != null) {
            interfaceC28753s.mo69580b(file);
        }
        if (z11 || (videoRecordEvent instanceof VideoRecordEvent.Pause) || (videoRecordEvent instanceof VideoRecordEvent.Resume) || (videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
            C33272c.f67816e.f67810a.mo68955d("CameraX", file.getName() + " recording state=" + videoRecordEvent, null);
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                m69564a((VideoRecordEvent.Finalize) videoRecordEvent);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m69564a(VideoRecordEvent.Finalize finalize) {
        AbstractC28738e c28736d;
        InterfaceC28753s interfaceC28753s;
        if (finalize.hasError()) {
            String str = "handleVideoRecordFinalized: error=" + finalize.getError();
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d("CameraX", str, null);
            Throwable cause = finalize.getCause();
            if (cause != null) {
                c33270a.f67810a.mo68955d("CameraX", "Video recording finialized with exception", cause);
            }
            c28736d = new C28734c(finalize.getError(), finalize.getCause());
        } else {
            c28736d = new C28736d((int) TimeUnit.NANOSECONDS.toSeconds(finalize.getRecordingStats().getRecordedDurationNanos()), finalize.getRecordingStats().getNumBytesRecorded());
        }
        File file = this.f58472q;
        if (file != null && (interfaceC28753s = this.f58460e) != null) {
            interfaceC28753s.mo69577a(new C28740f(file, c28736d));
        }
        this.f58472q = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m69563a(float f11) {
        CameraInfo cameraInfo;
        ExposureState exposureState;
        Range<Integer> exposureCompensationRange;
        CameraControl cameraControl;
        CameraInfo cameraInfo2;
        ExposureState exposureState2;
        Rational exposureCompensationStep;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("CameraX", "Set exposure " + f11, null);
        Camera camera = this.f58469n;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null || (exposureCompensationRange = exposureState.getExposureCompensationRange()) == null) {
            return;
        }
        Camera camera2 = this.f58469n;
        float fFloatValue = (camera2 == null || (cameraInfo2 = camera2.getCameraInfo()) == null || (exposureState2 = cameraInfo2.getExposureState()) == null || (exposureCompensationStep = exposureState2.getExposureCompensationStep()) == null) ? 1.0f : exposureCompensationStep.floatValue();
        Integer num = (Integer) exposureCompensationRange.getLower();
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) exposureCompensationRange.getUpper();
        int iMax = Integer.max(Integer.min((int) (f11 / fFloatValue), num2 != null ? num2.intValue() : 0), iIntValue);
        if (exposureCompensationRange.contains(Integer.valueOf(iMax))) {
            Camera camera3 = this.f58469n;
            if (camera3 == null || (cameraControl = camera3.getCameraControl()) == null) {
                return;
            }
            cameraControl.setExposureCompensationIndex(iMax);
            return;
        }
        c33270a.f67810a.mo68956e("CameraX", "Set exposure failed, " + f11 + " is out of range " + exposureCompensationRange, null);
    }

    /* JADX INFO: renamed from: a */
    public final float m69561a(int i11) {
        CameraInfo cameraInfo;
        ExposureState exposureState;
        Rational exposureCompensationStep;
        Camera camera = this.f58469n;
        return ((camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null || (exposureCompensationStep = exposureState.getExposureCompensationStep()) == null) ? 0.0f : exposureCompensationStep.floatValue()) * i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m69562a() {
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setBackpressureStrategy(0).setTargetRotation(0).setOutputImageFormat(2).setResolutionSelector(this.f58478w).build();
        this.f58467l = imageAnalysisBuild;
        ExecutorService executorService = this.f58461f;
        if (executorService == null || imageAnalysisBuild == null) {
            return;
        }
        imageAnalysisBuild.setAnalyzer(executorService, new ImageAnalysis.Analyzer() { // from class: com.sumsub.sns.internal.core.presentation.camera.e0
            @Override // androidx.camera.core.ImageAnalysis.Analyzer
            public final void analyze(ImageProxy imageProxy) throws InterruptedException {
                C28746l.m69557a(this.f58442a, imageProxy);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m69557a(C28746l c28746l, ImageProxy imageProxy) throws InterruptedException {
        C41690i.m91067b(null, new C28742h(c28746l, imageProxy, null), 1, null);
    }
}
