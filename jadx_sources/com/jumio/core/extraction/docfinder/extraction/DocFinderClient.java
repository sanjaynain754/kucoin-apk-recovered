package com.jumio.core.extraction.docfinder.extraction;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.cdn.CDNDecryptException;
import com.jumio.core.cdn.CDNEncryptedEntry;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.data.document.CornerPoints;
import com.jumio.core.environment.Environment;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.ProcessingTimesRecorder;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.jumio.core.extraction.docfinder.DocFinderPlugin;
import com.jumio.core.extraction.docfinder.classifier.Classifier;
import com.jumio.core.extraction.docfinder.classifier.CornerDetectionClassifier;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifierResult;
import com.jumio.core.extraction.docfinder.processor.DocfinderProcessorFactory;
import com.jumio.core.extraction.docfinder.processor.base.BaseImageData;
import com.jumio.core.extraction.docfinder.processor.base.DocfinderBaseImageProcessor;
import com.jumio.core.extraction.docfinder.processor.tilted.TiltedProcessorState;
import com.jumio.core.extraction.result.DataExtractionResult;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ExtractionResultProvider;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.DocfinderSettingsModel;
import com.jumio.core.models.ExtractionModeModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.performance.FrameRateCallback;
import com.jumio.core.performance.FrameRateCheck;
import com.jumio.core.performance.FrameRateObserver;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.processor.ImageProcessorHandler;
import com.jumio.core.processor.ImageProcessorHandlerInterface;
import com.jumio.core.processor.ImageProcessorHandlerInterfaceKt;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.processor.alignment.AlignmentConfig;
import com.jumio.core.processor.alignment.AlignmentProcessorState;
import com.jumio.core.processor.challenge.CameraChallengeProcessorState;
import com.jumio.core.processor.flash.FlashProcessorState$Flash;
import com.jumio.core.processor.queue.ProcessorQueue;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.DeviceUtilKt;
import com.jumio.sdk.data.JumioTiltState;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jumio.p381df.C40762a;
import jumio.p381df.C40764c;
import jumio.p381df.C40765d;
import jumio.p381df.C40768g;
import jumio.p381df.C40769h;
import jumio.p381df.C40771j;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020(H\u0014J\b\u0010.\u001a\u00020 H\u0014J \u0010/\u001a\u00020(2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0016H\u0014J\u0012\u00105\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0018H\u0016J\b\u00108\u001a\u00020(H\u0016J\b\u00109\u001a\u00020(H\u0016J\b\u0010:\u001a\u00020(H\u0002J\b\u0010;\u001a\u00020(H\u0002J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\u001cH\u0002JN\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020 2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020 H\u0082@¢\u0006\u0002\u0010JJ&\u0010K\u001a\u00020@2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010LJ\u0010\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020\u001cH\u0002J\u0010\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u00020QH\u0002J$\u0010R\u001a\u00020\u00162\u0006\u0010S\u001a\u00020\u001a2\b\b\u0002\u0010T\u001a\u00020U2\b\b\u0002\u0010V\u001a\u00020UH\u0002J\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010?\u001a\u00020@H\u0082@¢\u0006\u0002\u0010XJ\u0016\u0010Y\u001a\u00020(2\u0006\u0010?\u001a\u00020@H\u0082@¢\u0006\u0002\u0010XJ \u0010Z\u001a\u00020(2\u0006\u0010A\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010S\u001a\u00020\u001aH\u0002J\u0018\u0010^\u001a\u00020(2\u0006\u0010A\u001a\u00020[2\u0006\u0010S\u001a\u00020\u001aH\u0002J\u0010\u0010_\u001a\u00020(2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010`\u001a\u00020(H\u0002J6\u0010a\u001a\u00020\u001a2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010c\u001a\u00020\u00182\u0006\u0010d\u001a\u00020\u00182\u0006\u0010e\u001a\u00020\u00182\u0006\u0010f\u001a\u00020\u0018H\u0002J \u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u0018H\u0002J \u0010n\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u0018H\u0002J \u0010o\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006p"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;", "Lcom/jumio/core/extraction/ExtractionClient;", "Lcom/jumio/core/performance/FrameRateCallback;", "context", "Landroid/content/Context;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "docfinderSettingsModel", "Lcom/jumio/core/models/DocfinderSettingsModel;", "imageProcessorHandler", "Lcom/jumio/core/processor/ImageProcessorHandlerInterface;", "processingTimesRecorder", "Lcom/jumio/core/extraction/ProcessingTimesRecorder;", "<init>", "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/models/DocfinderSettingsModel;Lcom/jumio/core/processor/ImageProcessorHandlerInterface;Lcom/jumio/core/extraction/ProcessingTimesRecorder;)V", "cornerDetectionClassifier", "Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;", "documentClassifier", "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;", "processingLock", "", "croppedRectWithMargins", "Landroid/graphics/Rect;", "rotationAngle", "", "referenceCorners", "Lcom/jumio/core/data/document/CornerPoints;", "initializationTimeString", "", "cdnFeatureModel", "Lcom/jumio/core/cdn/CDNFeatureModel;", "skipCornerProcessing", "", "frameRateCheck", "Lcom/jumio/core/performance/FrameRateCheck;", "getFrameRateCheck", "()Lcom/jumio/core/performance/FrameRateCheck;", "setFrameRateCheck", "(Lcom/jumio/core/performance/FrameRateCheck;)V", "configure", "", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "configurationModel", "Lcom/jumio/core/model/StaticModel;", "init", "shouldFeed", "process", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", BridgeParamKeyKt.CAPTURE, "onFramesSampled", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "cancel", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "docFinderNotAvailable", "initFrameRateObservation", "skipImage", DocumentClassifier.KEY_SIDE, "handleTakeImageState", "bitmap", "Landroid/graphics/Bitmap;", "state", "Lcom/jumio/core/processor/ProcessorState$TakePicture;", "cornerRecognitions", "", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;", "runClassification", "cameraConnectionData", "Lcom/jumio/core/camera/CameraConnectionData;", "runTransformation", "(Landroid/graphics/Bitmap;Lcom/jumio/core/processor/ProcessorState$TakePicture;Ljava/util/List;Ljava/lang/String;ZLcom/jumio/core/camera/CameraConnectionData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertFrameToBitmap", "(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dumpProcessingTimesDebugInfo", "name", "logClassificationsDebugInfo", "classification", "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;", "determineDocumentCropArea", "corners", "cropLongSideMargin", "", "cropShortSideMargin", "recognizeCorners", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runDocumentClassification", "publishState", "Lcom/jumio/core/processor/ProcessorState;", "image", "Lcom/jumio/core/processor/ProcessorImage;", "publishAlignmentState", "reportDocumentClassification", "disableDocFinder", "getAbsoluteCornerPointsFromRelativeRecognitions", "recognitionResults", "absoluteWidth", "absoluteHeight", "offsetX", "offsetY", "initClassifier", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;", "cdnEncryptedEntry", "Lcom/jumio/core/cdn/CDNEncryptedEntry;", "device", "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;", "numThreads", "initCornerDetectionClassifier", "initDocumentClassifier", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDocFinderClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocFinderClient.kt\ncom/jumio/core/extraction/docfinder/extraction/DocFinderClient\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,836:1\n34#2:837\n34#2:838\n1863#3,2:839\n1755#3,3:841\n*S KotlinDebug\n*F\n+ 1 DocFinderClient.kt\ncom/jumio/core/extraction/docfinder/extraction/DocFinderClient\n*L\n473#1:837\n495#1:838\n662#1:839,2\n694#1:841,3\n*E\n"})
public final class DocFinderClient extends ExtractionClient implements FrameRateCallback {

    /* JADX INFO: renamed from: A */
    public Rect f14047A;

    /* JADX INFO: renamed from: B */
    public int f14048B;

    /* JADX INFO: renamed from: C */
    public CornerPoints f14049C;

    /* JADX INFO: renamed from: D */
    public String f14050D;

    /* JADX INFO: renamed from: E */
    public CDNFeatureModel f14051E;

    /* JADX INFO: renamed from: F */
    public boolean f14052F;

    /* JADX INFO: renamed from: G */
    public FrameRateCheck f14053G;

    /* JADX INFO: renamed from: u */
    public final DocfinderSettingsModel f14054u;

    /* JADX INFO: renamed from: v */
    public final ImageProcessorHandlerInterface f14055v;

    /* JADX INFO: renamed from: w */
    public final ProcessingTimesRecorder f14056w;

    /* JADX INFO: renamed from: x */
    public CornerDetectionClassifier f14057x;

    /* JADX INFO: renamed from: y */
    public DocumentClassifier f14058y;

    /* JADX INFO: renamed from: z */
    public final Object f14059z;

    public /* synthetic */ DocFinderClient(Context context, ScopeProviderInterface scopeProviderInterface, DocfinderSettingsModel docfinderSettingsModel, ImageProcessorHandlerInterface imageProcessorHandlerInterface, ProcessingTimesRecorder processingTimesRecorder, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, scopeProviderInterface, docfinderSettingsModel, (i11 & 8) != 0 ? new ImageProcessorHandler(new ProcessorQueue(), new DocfinderProcessorFactory(new AlignmentConfig(0.12f, 0.32f, docfinderSettingsModel))) : imageProcessorHandlerInterface, (i11 & 16) != 0 ? new ProcessingTimesRecorder() : processingTimesRecorder);
    }

    /* JADX INFO: renamed from: a */
    public static Rect m14537a(CornerPoints cornerPoints, float f11, float f12) {
        float f13;
        float f13793n;
        if (cornerPoints.getIdPortrait()) {
            float f13792m = cornerPoints.getF13792m() * f12;
            float f14 = 2;
            f13 = f13792m / f14;
            f13793n = (cornerPoints.getF13793n() * f11) / f14;
        } else {
            float f13792m2 = cornerPoints.getF13792m() * f11;
            float f15 = 2;
            f13 = f13792m2 / f15;
            f13793n = (cornerPoints.getF13793n() * f12) / f15;
        }
        float f16 = 2;
        Log.m14463d("DocFinderClient", "Document Crop Area | Size: " + new Size((int) ((f13 * f16) + cornerPoints.getF13792m()), (int) ((f16 * f13793n) + cornerPoints.getF13793n())));
        return new Rect((int) (cornerPoints.getF13784e() - f13), (int) (cornerPoints.getF13786g() - f13793n), (int) (cornerPoints.getF13785f() + f13), (int) (cornerPoints.getF13787h() + f13793n));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object access$handleTakeImageState(DocFinderClient docFinderClient, Bitmap bitmap, ProcessorState.TakePicture takePicture, List list, String str, boolean z11, CameraConnectionData cameraConnectionData, boolean z12, Continuation continuation) {
        C40764c c40764c;
        CornerPoints cornerPointsM14538a;
        String str2;
        CameraConnectionData cameraConnectionData2;
        boolean z13;
        CameraConnectionData cameraConnectionData3;
        boolean z14;
        String str3;
        int saveImage;
        docFinderClient.getClass();
        if (continuation instanceof C40764c) {
            c40764c = (C40764c) continuation;
            int i11 = c40764c.f90530j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40764c.f90530j = i11 - Integer.MIN_VALUE;
            } else {
                c40764c = new C40764c(docFinderClient, continuation);
            }
        } else {
            c40764c = new C40764c(docFinderClient, continuation);
        }
        Object obj = c40764c.f90528h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40764c.f90530j;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            cornerPointsM14538a = m14538a(list, bitmap.getWidth(), bitmap.getHeight(), 0, 0);
            if (z11) {
                docFinderClient.f14049C = cornerPointsM14538a;
                Bitmap bitmapCrop = BitmapUtilKt.crop(bitmap, m14537a(cornerPointsM14538a, 0.0f, 0.0f), false);
                C40765d c40765d = new C40765d(docFinderClient, null);
                c40764c.f90521a = bitmap;
                c40764c.f90522b = takePicture;
                c40764c.f90523c = SpillingKt.nullOutSpilledVariable(list);
                str2 = str;
                c40764c.f90524d = str2;
                cameraConnectionData2 = cameraConnectionData;
                c40764c.f90525e = cameraConnectionData2;
                c40764c.f90526f = cornerPointsM14538a;
                z13 = z12;
                c40764c.f90527g = z13;
                c40764c.f90530j = 1;
                if (BitmapUtilKt.use(bitmapCrop, c40765d, c40764c) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                str2 = str;
                cameraConnectionData2 = cameraConnectionData;
                z13 = z12;
            }
            cameraConnectionData3 = cameraConnectionData2;
            z14 = z13;
            str3 = str2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z15 = c40764c.f90527g;
            CornerPoints cornerPoints = c40764c.f90526f;
            CameraConnectionData cameraConnectionData4 = c40764c.f90525e;
            String str4 = c40764c.f90524d;
            ProcessorState.TakePicture takePicture2 = c40764c.f90522b;
            Bitmap bitmap2 = c40764c.f90521a;
            ResultKt.throwOnFailure(obj);
            z14 = z15;
            bitmap = bitmap2;
            cornerPointsM14538a = cornerPoints;
            cameraConnectionData3 = cameraConnectionData4;
            str3 = str4;
            takePicture = takePicture2;
        }
        Size outputSize = takePicture.getOutputSize();
        if (outputSize != null) {
            saveImage = ExtractionUpdateState.INSTANCE.getSaveDebugImage();
            docFinderClient.f14047A = BitmapUtilKt.getCenterCropRoi(bitmap, outputSize);
        } else {
            Log.m14463d("DocFinderClient", "Final document corners projected to image: " + cornerPointsM14538a);
            saveImage = ExtractionUpdateState.INSTANCE.getSaveImage();
            docFinderClient.f14047A = m14537a(cornerPointsM14538a, 0.12f, 0.32f);
        }
        docFinderClient.f14048B = 0;
        Bitmap bitmapCrop2 = BitmapUtilKt.crop(bitmap, docFinderClient.f14047A, true);
        if (z14 && cornerPointsM14538a.getRotationAngle() != 0) {
            int rotationAngle = cornerPointsM14538a.getRotationAngle();
            docFinderClient.f14048B = rotationAngle;
            bitmapCrop2 = BitmapUtilKt.rotate(bitmapCrop2, rotationAngle, true);
        }
        docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, saveImage, new ImageExtractionResult(bitmapCrop2, docFinderClient.getF13857o(), str3, takePicture.getBatchId(), takePicture.getImageMetadata(), cameraConnectionData3), null, 4, null));
        return Unit.INSTANCE;
    }

    public static final void access$publishState(DocFinderClient docFinderClient, ProcessorState processorState, ProcessorImage processorImage, CornerPoints cornerPoints) {
        Object objAsList;
        BaseImageData f14092d;
        docFinderClient.getClass();
        if ((processorState instanceof AlignmentProcessorState) || (processorState instanceof ProcessorState.HoldStill)) {
            ImageProcessorInterface currentProcessor = docFinderClient.f14055v.getCurrentProcessor();
            DocfinderBaseImageProcessor docfinderBaseImageProcessor = currentProcessor instanceof DocfinderBaseImageProcessor ? (DocfinderBaseImageProcessor) currentProcessor : null;
            BaseImageData f14092d2 = docfinderBaseImageProcessor != null ? docfinderBaseImageProcessor.getF14092d() : null;
            if (processorState instanceof ProcessorState.HoldStill) {
                ExtractionUpdateInterface.Companion companion = ExtractionUpdateInterface.INSTANCE;
                int validCorners = DocFinderUpdateState.INSTANCE.getValidCorners();
                if (f14092d2 == null) {
                    objAsList = f14092d2;
                    objAsList = cornerPoints.asList();
                }
                objAsList = f14092d2;
                docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion, validCorners, objAsList, null, 4, null));
                docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion, ExtractionUpdateState.INSTANCE.getHoldStill(), Long.valueOf(((ProcessorState.HoldStill) processorState).getTime()), null, 4, null));
            } else if (!(processorState instanceof AlignmentProcessorState.Valid)) {
                if (f14092d2 != null && f14092d2.getSendRotateUpdate()) {
                    docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getRotate(), null, null, 4, null));
                }
                ExtractionUpdateInterface.Companion companion2 = ExtractionUpdateInterface.INSTANCE;
                int invalidCorners = DocFinderUpdateState.INSTANCE.getInvalidCorners();
                Object objAsList2 = f14092d2;
                if (f14092d2 == null) {
                    objAsList2 = cornerPoints.asList();
                }
                docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion2, invalidCorners, objAsList2, null, 4, null));
            }
            if (processorState instanceof AlignmentProcessorState.CenterId) {
                docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getCenterId(), null, null, 4, null));
                return;
            }
            if (processorState instanceof AlignmentProcessorState.TooClose) {
                docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getTooClose(), null, null, 4, null));
                return;
            }
            if (processorState instanceof AlignmentProcessorState.MoveCloser) {
                docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getMoveCloser(), null, null, 4, null));
                return;
            } else {
                if (processorState instanceof AlignmentProcessorState.HoldStraight) {
                    docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getHoldStraight(), null, null, 4, null));
                    return;
                }
                Log.m14479v("DocFinderClient", "Nothing to publish for state: " + processorState);
                return;
            }
        }
        if (processorState instanceof ProcessorState.Finished) {
            if (docFinderClient.f14052F) {
                docFinderClient.f14052F = false;
                FrameRateObserver f13853k = docFinderClient.getF13853k();
                if (f13853k != null) {
                    f13853k.start();
                }
            }
            ProcessorState.Finished finished = (ProcessorState.Finished) processorState;
            Object result = finished.getResult();
            ExtractionResult extractionResult = result instanceof ExtractionResultProvider ? ((ExtractionResultProvider) result).getExtractionResult(docFinderClient.getF13857o(), processorImage.getClassifier(), finished.getBatchId()) : new ExtractionResult(docFinderClient.getF13857o(), processorImage.getClassifier(), finished.getBatchId());
            MetaInfo metaInfo = extractionResult instanceof DataExtractionResult ? ((DataExtractionResult) extractionResult).getMetaInfo() : null;
            ImageProcessorInterface currentProcessor2 = docFinderClient.f14055v.getCurrentProcessor();
            DocfinderBaseImageProcessor docfinderBaseImageProcessor2 = currentProcessor2 instanceof DocfinderBaseImageProcessor ? (DocfinderBaseImageProcessor) currentProcessor2 : null;
            if (docfinderBaseImageProcessor2 != null && (f14092d = docfinderBaseImageProcessor2.getF14092d()) != null) {
                docFinderClient.publishUpdate(ExtractionUpdateInterface.INSTANCE.build(DocFinderUpdateState.INSTANCE.getValidCorners(), f14092d, null));
            }
            docFinderClient.publishUpdate(ExtractionUpdateInterface.INSTANCE.build(ExtractionUpdateState.INSTANCE.getShotTaken(), extractionResult, metaInfo));
            return;
        }
        if (processorState instanceof ProcessorState.Skip) {
            docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getSkipImage(), new ExtractionResult(docFinderClient.getF13857o(), processorImage.getClassifier(), null, 4, null), null, 4, null));
            return;
        }
        if (processorState instanceof FlashProcessorState$Flash) {
            docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getFlash(), ((FlashProcessorState$Flash) processorState).getRequestedState(), null, 4, null));
            return;
        }
        if (processorState instanceof ProcessorState.RequestMetering) {
            docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getMetering(), ((ProcessorState.RequestMetering) processorState).getMeteringConfig(), null, 4, null));
            return;
        }
        if (processorState instanceof TiltedProcessorState.Flash) {
            docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getTilt(), ((TiltedProcessorState.Flash) processorState).getRequestedState(), null, 4, null));
            return;
        }
        if (processorState instanceof TiltedProcessorState.Tilt) {
            TiltedProcessorState.Tilt tilt = (TiltedProcessorState.Tilt) processorState;
            docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getTilt(), new JumioTiltState(tilt.getCurrentAngle(), tilt.getTargetAngle()), null, 4, null));
        } else if (!(processorState instanceof CameraChallengeProcessorState.ApplyCaptureSettings)) {
            Log.m14479v("DocFinderClient", "Nothing to publish for state: " + processorState);
        } else {
            docFinderClient.f14052F = true;
            FrameRateObserver f13853k2 = docFinderClient.getF13853k();
            if (f13853k2 != null) {
                f13853k2.stop();
            }
            docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getSetChallenge(), ((CameraChallengeProcessorState.ApplyCaptureSettings) processorState).getSettings(), null, 4, null));
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void init() {
        super.init();
        long jUptimeMillis = SystemClock.uptimeMillis();
        CDNFeatureModel cDNFeatureModel = this.f14051E;
        if (cDNFeatureModel == null || !cDNFeatureModel.has(DocFinderPlugin.CORNER_DETECTION_MODEL)) {
            Analytics.INSTANCE.add(MobileEvents.misc$default("docFinderModelNotAvailable", null, 2, null));
            triggerFallback(JumioFallbackReason.SCANNING_ERROR);
            return;
        }
        Classifier.Device device = DocFinderClientKt.f14060a;
        CDNEncryptedEntry cDNEncryptedEntry = cDNFeatureModel.get(DocFinderPlugin.CORNER_DETECTION_MODEL);
        try {
            if (cDNEncryptedEntry == null) {
                Analytics.INSTANCE.add(MobileEvents.misc$default("docfinderModelNotAvailable", null, 2, null));
                triggerFallback(JumioFallbackReason.SCANNING_ERROR);
                return;
            }
            if (cDNEncryptedEntry.isPreloadedFile()) {
                Analytics.INSTANCE.add(MobileEvents.misc$default("docFinderPreloaded", null, 2, null));
            }
            Classifier classifierM14539a = m14539a(cDNEncryptedEntry, device);
            Intrinsics.checkNotNull(classifierM14539a, "null cannot be cast to non-null type com.jumio.core.extraction.docfinder.classifier.CornerDetectionClassifier");
            this.f14057x = (CornerDetectionClassifier) classifierM14539a;
            Classifier.Device device2 = DocFinderClientKt.f14060a;
            CDNEncryptedEntry cDNEncryptedEntry2 = cDNFeatureModel.get(DocFinderPlugin.CLASSIFIER_MODEL);
            try {
                if (cDNEncryptedEntry2 == null) {
                    throw new IllegalArgumentException("Could not find encrypted model classifierOnDeviceV2");
                }
                if (cDNEncryptedEntry2.isPreloadedFile()) {
                    Analytics.INSTANCE.add(MobileEvents.misc$default("classifierOnDevicePreloaded", null, 2, null));
                }
                Classifier classifierM14539a2 = m14539a(cDNEncryptedEntry2, device2);
                Intrinsics.checkNotNull(classifierM14539a2, "null cannot be cast to non-null type com.jumio.core.extraction.docfinder.classifier.DocumentClassifier");
                this.f14058y = (DocumentClassifier) classifierM14539a2;
                long jConvert = TimeUnit.NANOSECONDS.convert(this.f14054u.getF14216b(), TimeUnit.MILLISECONDS);
                startFrameRateObservation(jConvert, this);
                Log.m14463d("DocFinderClient", "Frame rate observation initialised with:\n" + this.f14054u.getF14215a() + " FPS threshold\n" + jConvert + " Ns sampling time\n" + this.f14054u.getF14217c() + " violation limit");
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                StringBuilder sb2 = new StringBuilder("Initialization: ");
                sb2.append(jUptimeMillis2);
                sb2.append(" ms");
                this.f14050D = sb2.toString();
                MetaInfo metaInfo = new MetaInfo();
                metaInfo.put("initTime", Long.valueOf(jUptimeMillis2));
                Analytics.INSTANCE.add(MobileEvents.performance("DocFinderClient", metaInfo));
                Log.m14479v("DocFinderClient", this.f14050D);
                this.f14055v.resetCurrentProcessor();
            } catch (Exception e11) {
                if (cDNEncryptedEntry2 != null && cDNEncryptedEntry2.isAssetFile() && DeviceUtilKt.getDeviceUtil().isDebug(getF13845c())) {
                    StringsKt.substringAfterLast$default(cDNEncryptedEntry2.getFile(), "/", (String) null, 2, (Object) null);
                }
                Log.m14470e("DocFinderClient", "Failed to create classifierOnDeviceV2 classifier.", e11);
                cDNFeatureModel.clean(DocFinderPlugin.CLASSIFIER_MODEL);
                Analytics.INSTANCE.add(MobileEvents.misc$default(e11 instanceof CDNDecryptException ? "classifierOnDeviceDecryptionFailed" : "classifierOnDeviceInitFailed", null, 2, null));
            } catch (UnsatisfiedLinkError e12) {
                Log.m14470e("DocFinderClient", "Failed to create docfinderModel classifier.", e12);
                Analytics.Companion companion = Analytics.INSTANCE;
                companion.add(MobileEvents.exception(e12));
                companion.add(MobileEvents.misc$default("classifierOnDeviceUnsatifiedLink", null, 2, null));
            }
        } catch (Exception e13) {
            if (cDNEncryptedEntry != null && cDNEncryptedEntry.isAssetFile() && DeviceUtilKt.getDeviceUtil().isDebug(getF13845c())) {
                StringsKt.substringAfterLast$default(cDNEncryptedEntry.getFile(), "/", (String) null, 2, (Object) null);
            }
            Log.m14470e("DocFinderClient", "Failed to create docfinderModel classifier.", e13);
            cDNFeatureModel.clean(DocFinderPlugin.CORNER_DETECTION_MODEL);
            Analytics.INSTANCE.add(MobileEvents.misc$default(e13 instanceof CDNDecryptException ? "docfinderModelDecryptionFailed" : "docFinderModelInitFailed", null, 2, null));
        } catch (UnsatisfiedLinkError e14) {
            Log.m14470e("DocFinderClient", "Failed to create docfinderModel classifier.", e14);
            Analytics.Companion companion2 = Analytics.INSTANCE;
            companion2.add(MobileEvents.exception(e14));
            companion2.add(MobileEvents.misc$default("docfinderModelUnsatifiedLink", null, 2, null));
        }
    }

    public static final void access$dumpProcessingTimesDebugInfo(DocFinderClient docFinderClient, String str) {
        synchronized (docFinderClient.f14059z) {
            Log log = Log.INSTANCE;
            LogLevel logLevel = LogLevel.OFF;
            docFinderClient.f14056w.reset();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final Object access$recognizeCorners(DocFinderClient docFinderClient, Bitmap bitmap, Continuation continuation) {
        return docFinderClient.f14052F ? CollectionsKt.emptyList() : C41686h.m91049g(docFinderClient.getF13852j().getBackgroundDispatcher(), new C40769h(docFinderClient, bitmap, null), continuation);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void cancel() {
        synchronized (this.f14059z) {
            try {
                super.cancel();
                CornerDetectionClassifier cornerDetectionClassifier = this.f14057x;
                if (cornerDetectionClassifier != null) {
                    cornerDetectionClassifier.cancel();
                }
                DocumentClassifier documentClassifier = this.f14058y;
                if (documentClassifier != null) {
                    documentClassifier.cancel();
                }
                this.f14056w.reset();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void configure(@NotNull DataManager dataManager, @NotNull StaticModel configurationModel) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(configurationModel, "configurationModel");
        super.configure(dataManager, configurationModel);
        if (configurationModel instanceof PhysicalIdScanPartModel) {
            this.f14051E = (CDNFeatureModel) dataManager.get(CDNFeatureModel.class);
            ImageProcessorHandlerInterfaceKt.initProcessorsFromScanPartModel(this.f14055v, (PhysicalIdScanPartModel) configurationModel);
        } else {
            Log.m14484w("DocFinderClient", "Configuration model must be an instance of " + Reflection.getOrCreateKotlinClass(PhysicalIdScanPartModel.class).getSimpleName());
            setConfigured(false);
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void destroy() {
        synchronized (this.f14059z) {
            try {
                super.destroy();
                CornerDetectionClassifier cornerDetectionClassifier = this.f14057x;
                if (cornerDetectionClassifier != null) {
                    cornerDetectionClassifier.destroy();
                }
                DocumentClassifier documentClassifier = this.f14058y;
                if (documentClassifier != null) {
                    documentClassifier.destroy();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    @Nullable
    /* JADX INFO: renamed from: getFrameRateCheck, reason: from getter */
    public FrameRateCheck getF14053G() {
        return this.f14053G;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void process(@NotNull Frame frame, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        synchronized (this.f14059z) {
            if (getDataExtraction()) {
                C41696j.m91104d(getF13852j().getMainScope(), getF13852j().getBackgroundDispatcher(), null, new C40768g(this, frame, cameraSettings, extractionArea, null), 2, null);
                Unit unit = Unit.INSTANCE;
            } else {
                publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, DocFinderUpdateState.INSTANCE.getInvalidCorners(), null, null, 4, null));
                setResult(false);
            }
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void setFrameRateCheck(@Nullable FrameRateCheck frameRateCheck) {
        this.f14053G = frameRateCheck;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    @Override // com.jumio.core.extraction.ExtractionClient
    public boolean shouldFeed() {
        boolean z11;
        synchronized (this.f14059z) {
            CornerDetectionClassifier cornerDetectionClassifier = this.f14057x;
            if (cornerDetectionClassifier != null) {
                z11 = cornerDetectionClassifier.isActive$jumio_docfinder_release();
            }
        }
        return z11;
    }

    public static final /* synthetic */ CornerPoints access$getAbsoluteCornerPointsFromRelativeRecognitions(DocFinderClient docFinderClient, List list, int i11, int i12, int i13, int i14) {
        docFinderClient.getClass();
        return m14538a(list, i11, i12, i13, i14);
    }

    public static final void access$logClassificationsDebugInfo(DocFinderClient docFinderClient, DocumentClassifierResult documentClassifierResult) {
        docFinderClient.getClass();
        Log log = Log.INSTANCE;
        LogLevel logLevel = LogLevel.OFF;
    }

    public static final void access$reportDocumentClassification(DocFinderClient docFinderClient, DocumentClassifierResult documentClassifierResult) {
        String file;
        CDNEncryptedEntry cDNEncryptedEntry;
        docFinderClient.getClass();
        MetaInfo metaInfo = new MetaInfo();
        for (DocumentClassifierResult.Entry entry : documentClassifierResult.getEntries()) {
            metaInfo.put(entry.getKey(), entry.getLabel() + ';' + entry.getConfidence() + ';' + entry.getAboveThreshold());
        }
        CDNFeatureModel cDNFeatureModel = docFinderClient.f14051E;
        if (cDNFeatureModel != null && (cDNEncryptedEntry = cDNFeatureModel.get(DocFinderPlugin.CLASSIFIER_MODEL)) != null) {
            file = cDNEncryptedEntry.getFile();
        } else {
            file = null;
        }
        metaInfo.put("file", file);
        Analytics.INSTANCE.add(MobileEvents.misc(DocFinderPlugin.CLASSIFIER_MODEL, metaInfo));
    }

    public static final Object access$runDocumentClassification(DocFinderClient docFinderClient, Bitmap bitmap, Continuation continuation) {
        Object objM91049g = C41686h.m91049g(docFinderClient.getF13852j().getBackgroundDispatcher(), new C40771j(docFinderClient, bitmap, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    public static final void access$skipImage(DocFinderClient docFinderClient, String str) {
        docFinderClient.getClass();
        docFinderClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getSkipImage(), new ExtractionResult(docFinderClient.getF13857o(), str, null, 4, null), null, 4, null));
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void capture(@Nullable Frame frame) {
        super.capture(frame);
        ImageProcessorInterface currentProcessor = this.f14055v.getCurrentProcessor();
        if (currentProcessor != null) {
            C41696j.m91104d(getF13852j().getMainScope(), getF13852j().getBackgroundDispatcher(), null, new C40762a(frame, this, currentProcessor, null), 2, null);
        } else {
            setResult(false);
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient, com.jumio.core.performance.FrameRateCallback
    public void onFramesSampled(int frames) {
        FrameRateCheck f14053g = getF14053G();
        if (f14053g != null && !f14053g.checkFrameRate(frames)) {
            Analytics.INSTANCE.add(MobileEvents.misc$default("docFinderFrameRateFallback", null, 2, null));
            triggerFallback(JumioFallbackReason.LOW_PERFORMANCE);
            DataManager f13856n = getF13856n();
            if (f13856n != null) {
                f13856n.put(ExtractionModeModel.class, new ExtractionModeModel(false));
            }
            Log.m14484w("DocFinderClient", "DocFinder disabled for the session - Reason: fallback");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocFinderClient(@NotNull Context context, @NotNull ScopeProviderInterface scopeProvider, @NotNull DocfinderSettingsModel docfinderSettingsModel, @NotNull ImageProcessorHandlerInterface imageProcessorHandler, @NotNull ProcessingTimesRecorder processingTimesRecorder) {
        super(context, scopeProvider);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(docfinderSettingsModel, "docfinderSettingsModel");
        Intrinsics.checkNotNullParameter(imageProcessorHandler, "imageProcessorHandler");
        Intrinsics.checkNotNullParameter(processingTimesRecorder, "processingTimesRecorder");
        this.f14054u = docfinderSettingsModel;
        this.f14055v = imageProcessorHandler;
        this.f14056w = processingTimesRecorder;
        this.f14059z = new Object();
        this.f14047A = new Rect();
        this.f14049C = new CornerPoints(null, null, null, null, 15, null);
        this.f14050D = "";
        this.f14053G = new FrameRateCheck(docfinderSettingsModel.getF14215a(), docfinderSettingsModel.getF14217c());
        Environment.loadTensorflow$default(Environment.INSTANCE, context, false, 2, null);
        setShouldInitAsync(true);
        setCenterCropExtractionArea(true);
    }

    /* JADX INFO: renamed from: a */
    public static CornerPoints m14538a(List list, int i11, int i12, int i13, int i14) {
        if (list.size() == 8) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    float f14035c = ((Classifier.Recognition) it.next()).getF14035c();
                    if (0.0f > f14035c || f14035c > 1.0f) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < 4; i15++) {
                int i16 = i15 * 2;
                arrayList.add(i15, new PointF((((Classifier.Recognition) list.get(i16)).getF14035c() * i11) + i13, (((Classifier.Recognition) list.get(i16 + 1)).getF14035c() * i12) + i14));
            }
            return new CornerPoints((PointF) arrayList.get(0), (PointF) arrayList.get(1), (PointF) arrayList.get(2), (PointF) arrayList.get(3));
        }
        return new CornerPoints(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a */
    public final Classifier m14539a(CDNEncryptedEntry cDNEncryptedEntry, Classifier.Device device) throws CDNDecryptException, IOException {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Log.m14479v("DocFinderClient", "Creating " + cDNEncryptedEntry + " classifier (device=%s, numThreads=%d) " + device + ", 4");
        Classifier classifierCreate = Classifier.INSTANCE.create(getF13845c(), cDNEncryptedEntry, 4, this.f14054u.getF14218d());
        Log.m14479v("DocFinderClient", cDNEncryptedEntry + " classifier creation time: " + (SystemClock.uptimeMillis() - jUptimeMillis));
        return classifierCreate;
    }
}
