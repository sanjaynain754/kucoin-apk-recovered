.class public final Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;
.super Lcom/jumio/core/extraction/ExtractionClient;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/performance/FrameRateCallback;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0008\u0010-\u001a\u00020(H\u0014J\u0008\u0010.\u001a\u00020 H\u0014J \u0010/\u001a\u00020(2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0016H\u0014J\u0012\u00105\u001a\u00020(2\u0008\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0018H\u0016J\u0008\u00108\u001a\u00020(H\u0016J\u0008\u00109\u001a\u00020(H\u0016J\u0008\u0010:\u001a\u00020(H\u0002J\u0008\u0010;\u001a\u00020(H\u0002J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\u001cH\u0002JN\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020E0D2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020 2\u0008\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020 H\u0082@\u00a2\u0006\u0002\u0010JJ&\u0010K\u001a\u00020@2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010LJ\u0010\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020\u001cH\u0002J\u0010\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u00020QH\u0002J$\u0010R\u001a\u00020\u00162\u0006\u0010S\u001a\u00020\u001a2\u0008\u0008\u0002\u0010T\u001a\u00020U2\u0008\u0008\u0002\u0010V\u001a\u00020UH\u0002J\u001c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020E0D2\u0006\u0010?\u001a\u00020@H\u0082@\u00a2\u0006\u0002\u0010XJ\u0016\u0010Y\u001a\u00020(2\u0006\u0010?\u001a\u00020@H\u0082@\u00a2\u0006\u0002\u0010XJ \u0010Z\u001a\u00020(2\u0006\u0010A\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010S\u001a\u00020\u001aH\u0002J\u0018\u0010^\u001a\u00020(2\u0006\u0010A\u001a\u00020[2\u0006\u0010S\u001a\u00020\u001aH\u0002J\u0010\u0010_\u001a\u00020(2\u0006\u0010P\u001a\u00020QH\u0002J\u0008\u0010`\u001a\u00020(H\u0002J6\u0010a\u001a\u00020\u001a2\u000c\u0010b\u001a\u0008\u0012\u0004\u0012\u00020E0D2\u0006\u0010c\u001a\u00020\u00182\u0006\u0010d\u001a\u00020\u00182\u0006\u0010e\u001a\u00020\u00182\u0006\u0010f\u001a\u00020\u0018H\u0002J \u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u0018H\u0002J \u0010n\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u0018H\u0002J \u0010o\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006p"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;",
        "Lcom/jumio/core/extraction/ExtractionClient;",
        "Lcom/jumio/core/performance/FrameRateCallback;",
        "context",
        "Landroid/content/Context;",
        "scopeProvider",
        "Lcom/jumio/core/scope/ScopeProviderInterface;",
        "docfinderSettingsModel",
        "Lcom/jumio/core/models/DocfinderSettingsModel;",
        "imageProcessorHandler",
        "Lcom/jumio/core/processor/ImageProcessorHandlerInterface;",
        "processingTimesRecorder",
        "Lcom/jumio/core/extraction/ProcessingTimesRecorder;",
        "<init>",
        "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/models/DocfinderSettingsModel;Lcom/jumio/core/processor/ImageProcessorHandlerInterface;Lcom/jumio/core/extraction/ProcessingTimesRecorder;)V",
        "cornerDetectionClassifier",
        "Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;",
        "documentClassifier",
        "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;",
        "processingLock",
        "",
        "croppedRectWithMargins",
        "Landroid/graphics/Rect;",
        "rotationAngle",
        "",
        "referenceCorners",
        "Lcom/jumio/core/data/document/CornerPoints;",
        "initializationTimeString",
        "",
        "cdnFeatureModel",
        "Lcom/jumio/core/cdn/CDNFeatureModel;",
        "skipCornerProcessing",
        "",
        "frameRateCheck",
        "Lcom/jumio/core/performance/FrameRateCheck;",
        "getFrameRateCheck",
        "()Lcom/jumio/core/performance/FrameRateCheck;",
        "setFrameRateCheck",
        "(Lcom/jumio/core/performance/FrameRateCheck;)V",
        "configure",
        "",
        "dataManager",
        "Lcom/jumio/core/persistence/DataManager;",
        "configurationModel",
        "Lcom/jumio/core/model/StaticModel;",
        "init",
        "shouldFeed",
        "process",
        "frame",
        "Lcom/jumio/commons/camera/Frame;",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "extractionArea",
        "capture",
        "onFramesSampled",
        "frames",
        "cancel",
        "destroy",
        "docFinderNotAvailable",
        "initFrameRateObservation",
        "skipImage",
        "classifier",
        "handleTakeImageState",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "state",
        "Lcom/jumio/core/processor/ProcessorState$TakePicture;",
        "cornerRecognitions",
        "",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;",
        "runClassification",
        "cameraConnectionData",
        "Lcom/jumio/core/camera/CameraConnectionData;",
        "runTransformation",
        "(Landroid/graphics/Bitmap;Lcom/jumio/core/processor/ProcessorState$TakePicture;Ljava/util/List;Ljava/lang/String;ZLcom/jumio/core/camera/CameraConnectionData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "convertFrameToBitmap",
        "(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "dumpProcessingTimesDebugInfo",
        "name",
        "logClassificationsDebugInfo",
        "classification",
        "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;",
        "determineDocumentCropArea",
        "corners",
        "cropLongSideMargin",
        "",
        "cropShortSideMargin",
        "recognizeCorners",
        "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "runDocumentClassification",
        "publishState",
        "Lcom/jumio/core/processor/ProcessorState;",
        "image",
        "Lcom/jumio/core/processor/ProcessorImage;",
        "publishAlignmentState",
        "reportDocumentClassification",
        "disableDocFinder",
        "getAbsoluteCornerPointsFromRelativeRecognitions",
        "recognitionResults",
        "absoluteWidth",
        "absoluteHeight",
        "offsetX",
        "offsetY",
        "initClassifier",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;",
        "cdnEncryptedEntry",
        "Lcom/jumio/core/cdn/CDNEncryptedEntry;",
        "device",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;",
        "numThreads",
        "initCornerDetectionClassifier",
        "initDocumentClassifier",
        "jumio-docfinder_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDocFinderClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocFinderClient.kt\ncom/jumio/core/extraction/docfinder/extraction/DocFinderClient\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,836:1\n34#2:837\n34#2:838\n1863#3,2:839\n1755#3,3:841\n*S KotlinDebug\n*F\n+ 1 DocFinderClient.kt\ncom/jumio/core/extraction/docfinder/extraction/DocFinderClient\n*L\n473#1:837\n495#1:838\n662#1:839,2\n694#1:841,3\n*E\n"
    }
.end annotation


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:I

.field public C:Lcom/jumio/core/data/document/CornerPoints;

.field public D:Ljava/lang/String;

.field public E:Lcom/jumio/core/cdn/CDNFeatureModel;

.field public F:Z

.field public G:Lcom/jumio/core/performance/FrameRateCheck;

.field public final u:Lcom/jumio/core/models/DocfinderSettingsModel;

.field public final v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

.field public final w:Lcom/jumio/core/extraction/ProcessingTimesRecorder;

.field public x:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;

.field public y:Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/models/DocfinderSettingsModel;Lcom/jumio/core/processor/ImageProcessorHandlerInterface;Lcom/jumio/core/extraction/ProcessingTimesRecorder;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/scope/ScopeProviderInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/core/models/DocfinderSettingsModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/core/processor/ImageProcessorHandlerInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/jumio/core/extraction/ProcessingTimesRecorder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "docfinderSettingsModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageProcessorHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processingTimesRecorder"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/jumio/core/extraction/ExtractionClient;-><init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;)V

    .line 11
    iput-object p3, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->u:Lcom/jumio/core/models/DocfinderSettingsModel;

    .line 12
    iput-object p4, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

    .line 13
    iput-object p5, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->w:Lcom/jumio/core/extraction/ProcessingTimesRecorder;

    .line 14
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->z:Ljava/lang/Object;

    .line 15
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->A:Landroid/graphics/Rect;

    .line 16
    new-instance v0, Lcom/jumio/core/data/document/CornerPoints;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/jumio/core/data/document/CornerPoints;-><init>(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->C:Lcom/jumio/core/data/document/CornerPoints;

    .line 17
    const-string p2, ""

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->D:Ljava/lang/String;

    .line 18
    new-instance p2, Lcom/jumio/core/performance/FrameRateCheck;

    .line 19
    invoke-virtual {p3}, Lcom/jumio/core/models/DocfinderSettingsModel;->getFrameRateThreshold()I

    move-result p4

    .line 20
    invoke-virtual {p3}, Lcom/jumio/core/models/DocfinderSettingsModel;->getViolationLimit()I

    move-result p3

    .line 21
    invoke-direct {p2, p4, p3}, Lcom/jumio/core/performance/FrameRateCheck;-><init>(II)V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->G:Lcom/jumio/core/performance/FrameRateCheck;

    .line 22
    sget-object p2, Lcom/jumio/core/environment/Environment;->INSTANCE:Lcom/jumio/core/environment/Environment;

    const/4 p3, 0x2

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-static {p2, p1, p5, p3, p4}, Lcom/jumio/core/environment/Environment;->loadTensorflow$default(Lcom/jumio/core/environment/Environment;Landroid/content/Context;ZILjava/lang/Object;)Z

    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->setShouldInitAsync(Z)V

    .line 24
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->setCenterCropExtractionArea(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/models/DocfinderSettingsModel;Lcom/jumio/core/processor/ImageProcessorHandlerInterface;Lcom/jumio/core/extraction/ProcessingTimesRecorder;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_0

    .line 1
    new-instance v0, Lcom/jumio/core/processor/ImageProcessorHandler;

    .line 2
    new-instance v1, Lcom/jumio/core/processor/queue/ProcessorQueue;

    invoke-direct {v1}, Lcom/jumio/core/processor/queue/ProcessorQueue;-><init>()V

    .line 3
    new-instance v2, Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;

    .line 4
    new-instance v3, Lcom/jumio/core/processor/alignment/AlignmentConfig;

    const v4, 0x3df5c28f    # 0.12f

    const v5, 0x3ea3d70a    # 0.32f

    .line 5
    invoke-direct {v3, v4, v5, p3}, Lcom/jumio/core/processor/alignment/AlignmentConfig;-><init>(FFLcom/jumio/core/models/DocfinderSettingsModel;)V

    .line 6
    invoke-direct {v2, v3}, Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;-><init>(Lcom/jumio/core/processor/alignment/AlignmentConfig;)V

    .line 7
    invoke-direct {v0, v1, v2}, Lcom/jumio/core/processor/ImageProcessorHandler;-><init>(Lcom/jumio/core/processor/queue/ProcessorQueueInterface;Lcom/jumio/core/processor/ImageProcessorFactoryInterface;)V

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p4

    :goto_0
    and-int/lit8 v0, p6, 0x10

    if-eqz v0, :cond_1

    .line 8
    new-instance v0, Lcom/jumio/core/extraction/ProcessingTimesRecorder;

    invoke-direct {v0}, Lcom/jumio/core/extraction/ProcessingTimesRecorder;-><init>()V

    move-object v11, v0

    :goto_1
    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    goto :goto_2

    :cond_1
    move-object/from16 v11, p5

    goto :goto_1

    .line 9
    :goto_2
    invoke-direct/range {v6 .. v11}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;-><init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/models/DocfinderSettingsModel;Lcom/jumio/core/processor/ImageProcessorHandlerInterface;Lcom/jumio/core/extraction/ProcessingTimesRecorder;)V

    return-void
.end method

.method public static a(Lcom/jumio/core/data/document/CornerPoints;FF)Landroid/graphics/Rect;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getIdPortrait()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getWidth()F

    move-result v0

    mul-float/2addr v0, p2

    int-to-float p2, v1

    div-float/2addr v0, p2

    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getHeight()F

    move-result v2

    mul-float/2addr v2, p1

    div-float/2addr v2, p2

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getWidth()F

    move-result v0

    mul-float/2addr v0, p1

    int-to-float p1, v1

    div-float/2addr v0, p1

    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getHeight()F

    move-result v2

    mul-float/2addr v2, p2

    div-float/2addr v2, p1

    .line 6
    :goto_0
    new-instance p1, Lcom/jumio/commons/camera/Size;

    .line 7
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getWidth()F

    move-result p2

    int-to-float v1, v1

    mul-float v3, v0, v1

    add-float/2addr v3, p2

    float-to-int p2, v3

    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getHeight()F

    move-result v3

    mul-float/2addr v1, v2

    add-float/2addr v1, v3

    float-to-int v1, v1

    .line 9
    invoke-direct {p1, p2, v1}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Document Crop Area | Size: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DocFinderClient"

    invoke-static {p2, p1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    new-instance p1, Landroid/graphics/Rect;

    .line 12
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getLeft()F

    move-result p2

    sub-float/2addr p2, v0

    float-to-int p2, p2

    .line 13
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getTop()F

    move-result v1

    sub-float/2addr v1, v2

    float-to-int v1, v1

    .line 14
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getRight()F

    move-result v3

    add-float/2addr v3, v0

    float-to-int v0, v3

    .line 15
    invoke-virtual {p0}, Lcom/jumio/core/data/document/CornerPoints;->getBottom()F

    move-result p0

    add-float/2addr p0, v2

    float-to-int p0, p0

    .line 16
    invoke-direct {p1, p2, v1, v0, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method

.method public static a(Ljava/util/List;IIII)Lcom/jumio/core/data/document/CornerPoints;
    .locals 8

    .line 17
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 18
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;

    .line 20
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;->getConfidence()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v2, v2, v1

    if-gtz v2, :cond_3

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_3

    goto :goto_0

    .line 21
    :cond_1
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_2
    const/4 v3, 0x4

    const/4 v4, 0x1

    if-ge v2, v3, :cond_2

    .line 22
    new-instance v3, Landroid/graphics/PointF;

    mul-int/lit8 v5, v2, 0x2

    .line 23
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;

    invoke-virtual {v6}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;->getConfidence()F

    move-result v6

    int-to-float v7, p1

    mul-float/2addr v6, v7

    int-to-float v7, p3

    add-float/2addr v6, v7

    add-int/2addr v5, v4

    .line 24
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;

    invoke-virtual {v4}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;->getConfidence()F

    move-result v4

    int-to-float v5, p2

    mul-float/2addr v4, v5

    int-to-float v5, p4

    add-float/2addr v4, v5

    .line 25
    invoke-direct {v3, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 26
    invoke-virtual {v0, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 27
    :cond_2
    new-instance p0, Lcom/jumio/core/data/document/CornerPoints;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/PointF;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/PointF;

    const/4 p3, 0x2

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/PointF;

    const/4 p4, 0x3

    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/graphics/PointF;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/data/document/CornerPoints;-><init>(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    return-object p0

    .line 28
    :cond_3
    new-instance v0, Lcom/jumio/core/data/document/CornerPoints;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/jumio/core/data/document/CornerPoints;-><init>(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final access$convertFrameToBitmap(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    new-instance v0, Ljumio/df/b;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1, p2, p3, v1}, Ljumio/df/b;-><init>(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0, p4}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
.end method

.method public static final access$dumpProcessingTimesDebugInfo(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->z:Ljava/lang/Object;

    .line 3
    monitor-enter p1

    .line 4
    .line 5
    :try_start_0
    sget-object v0, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 6
    .line 7
    sget-object v0, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->w:Lcom/jumio/core/extraction/ProcessingTimesRecorder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ProcessingTimesRecorder;->reset()V

    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p1

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit p1

    .line 19
    throw p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final synthetic access$getAbsoluteCornerPointsFromRelativeRecognitions(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Ljava/util/List;IIII)Lcom/jumio/core/data/document/CornerPoints;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3, p4, p5}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->a(Ljava/util/List;IIII)Lcom/jumio/core/data/document/CornerPoints;

    .line 7
    move-result-object p0

    .line 8
    return-object p0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
.end method

.method public static final synthetic access$getConfiguredPart(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getConfiguredPart()Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getContext(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getContext()Landroid/content/Context;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getCornerDetectionClassifier$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->x:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getCroppedRectWithMargins$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->A:Landroid/graphics/Rect;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getDocumentClassifier$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->y:Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getImageProcessorHandler$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Lcom/jumio/core/processor/ImageProcessorHandlerInterface;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getProcessingTimesRecorder$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Lcom/jumio/core/extraction/ProcessingTimesRecorder;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->w:Lcom/jumio/core/extraction/ProcessingTimesRecorder;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getReferenceCorners$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Lcom/jumio/core/data/document/CornerPoints;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->C:Lcom/jumio/core/data/document/CornerPoints;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getRotationAngle$p(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->B:I

    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final access$handleTakeImageState(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Landroid/graphics/Bitmap;Lcom/jumio/core/processor/ProcessorState$TakePicture;Ljava/util/List;Ljava/lang/String;ZLcom/jumio/core/camera/CameraConnectionData;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v1, v0, Ljumio/df/c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljumio/df/c;

    iget v2, v1, Ljumio/df/c;->j:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ljumio/df/c;->j:I

    goto :goto_0

    :cond_0
    new-instance v1, Ljumio/df/c;

    invoke-direct {v1, p0, v0}, Ljumio/df/c;-><init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Ljumio/df/c;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 3
    iget v3, v1, Ljumio/df/c;->j:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-boolean p1, v1, Ljumio/df/c;->g:Z

    iget-object p2, v1, Ljumio/df/c;->f:Lcom/jumio/core/data/document/CornerPoints;

    iget-object v2, v1, Ljumio/df/c;->e:Lcom/jumio/core/camera/CameraConnectionData;

    iget-object v3, v1, Ljumio/df/c;->d:Ljava/lang/String;

    iget-object v6, v1, Ljumio/df/c;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v6, v1, Ljumio/df/c;->b:Lcom/jumio/core/processor/ProcessorState$TakePicture;

    iget-object v1, v1, Ljumio/df/c;->a:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v0, v1

    move v1, p1

    move-object p1, v0

    move-object v0, p2

    move-object v12, v2

    move-object v9, v3

    move-object p2, v6

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    move-object/from16 v6, p3

    .line 6
    invoke-static {v6, v0, v3, v4, v4}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->a(Ljava/util/List;IIII)Lcom/jumio/core/data/document/CornerPoints;

    move-result-object v0

    if-eqz p5, :cond_3

    .line 7
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->C:Lcom/jumio/core/data/document/CornerPoints;

    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v3, v3}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->a(Lcom/jumio/core/data/document/CornerPoints;FF)Landroid/graphics/Rect;

    move-result-object v3

    .line 9
    invoke-static {p1, v3, v4}, Lcom/jumio/commons/utils/BitmapUtilKt;->crop(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    new-instance v7, Ljumio/df/d;

    const/4 v8, 0x0

    invoke-direct {v7, p0, v8}, Ljumio/df/d;-><init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v1, Ljumio/df/c;->a:Landroid/graphics/Bitmap;

    iput-object p2, v1, Ljumio/df/c;->b:Lcom/jumio/core/processor/ProcessorState$TakePicture;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v1, Ljumio/df/c;->c:Ljava/lang/Object;

    move-object/from16 v6, p4

    iput-object v6, v1, Ljumio/df/c;->d:Ljava/lang/String;

    move-object/from16 v8, p6

    iput-object v8, v1, Ljumio/df/c;->e:Lcom/jumio/core/camera/CameraConnectionData;

    iput-object v0, v1, Ljumio/df/c;->f:Lcom/jumio/core/data/document/CornerPoints;

    move/from16 v9, p7

    iput-boolean v9, v1, Ljumio/df/c;->g:Z

    iput v5, v1, Ljumio/df/c;->j:I

    invoke-static {v3, v7, v1}, Lcom/jumio/commons/utils/BitmapUtilKt;->use(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_3
    move-object/from16 v6, p4

    move-object/from16 v8, p6

    move/from16 v9, p7

    :cond_4
    move-object v12, v8

    move v1, v9

    move-object v9, v6

    .line 10
    :goto_1
    invoke-virtual {p2}, Lcom/jumio/core/processor/ProcessorState$TakePicture;->getOutputSize()Lcom/jumio/commons/camera/Size;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 11
    sget-object v3, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v3}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getSaveDebugImage()I

    move-result v3

    .line 12
    invoke-static {p1, v2}, Lcom/jumio/commons/utils/BitmapUtilKt;->getCenterCropRoi(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/Size;)Landroid/graphics/Rect;

    move-result-object v2

    iput-object v2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->A:Landroid/graphics/Rect;

    goto :goto_2

    .line 13
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Final document corners projected to image: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "DocFinderClient"

    invoke-static {v3, v2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    sget-object v2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getSaveImage()I

    move-result v3

    const v2, 0x3df5c28f    # 0.12f

    const v6, 0x3ea3d70a    # 0.32f

    .line 15
    invoke-static {v0, v2, v6}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->a(Lcom/jumio/core/data/document/CornerPoints;FF)Landroid/graphics/Rect;

    move-result-object v2

    iput-object v2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->A:Landroid/graphics/Rect;

    .line 16
    :goto_2
    iput v4, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->B:I

    .line 17
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->A:Landroid/graphics/Rect;

    invoke-static {p1, v2, v5}, Lcom/jumio/commons/utils/BitmapUtilKt;->crop(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz v1, :cond_6

    .line 18
    invoke-virtual {v0}, Lcom/jumio/core/data/document/CornerPoints;->getRotationAngle()I

    move-result v1

    if-eqz v1, :cond_6

    .line 19
    invoke-virtual {v0}, Lcom/jumio/core/data/document/CornerPoints;->getRotationAngle()I

    move-result v0

    iput v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->B:I

    .line 20
    invoke-static {p1, v0, v5}, Lcom/jumio/commons/utils/BitmapUtilKt;->rotate(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_6
    move-object v7, p1

    .line 21
    sget-object p1, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    .line 22
    new-instance v6, Lcom/jumio/core/extraction/result/ImageExtractionResult;

    .line 23
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getConfiguredPart()Ljava/lang/String;

    move-result-object v8

    .line 24
    invoke-virtual {p2}, Lcom/jumio/core/processor/ProcessorState$TakePicture;->getBatchId()Ljava/lang/String;

    move-result-object v10

    .line 25
    invoke-virtual {p2}, Lcom/jumio/core/processor/ProcessorState$TakePicture;->getImageMetadata()Lcom/jumio/commons/camera/ImageMetadata;

    move-result-object v11

    .line 26
    invoke-direct/range {v6 .. v12}, Lcom/jumio/core/extraction/result/ImageExtractionResult;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/commons/camera/ImageMetadata;Lcom/jumio/core/camera/CameraConnectionData;)V

    const/4 p2, 0x4

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object/from16 p3, p1

    move/from16 p7, p2

    move-object/from16 p8, v0

    move-object/from16 p6, v1

    move/from16 p4, v3

    move-object/from16 p5, v6

    .line 27
    invoke-static/range {p3 .. p8}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 29
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final access$logClassificationsDebugInfo(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    sget-object p0, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 6
    .line 7
    sget-object p0, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final synthetic access$publishResult(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/core/model/StaticModel;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishResult(Lcom/jumio/core/model/StaticModel;)V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final access$publishState(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/core/processor/ProcessorState;Lcom/jumio/core/processor/ProcessorImage;Lcom/jumio/core/data/document/CornerPoints;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lcom/jumio/core/processor/alignment/AlignmentProcessorState;

    const-string v1, "DocFinderClient"

    const-string v2, "Nothing to publish for state: "

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_e

    instance-of v0, p1, Lcom/jumio/core/processor/ProcessorState$HoldStill;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 3
    :cond_0
    instance-of p3, p1, Lcom/jumio/core/processor/ProcessorState$Finished;

    if-eqz p3, :cond_6

    .line 4
    iget-boolean p3, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->F:Z

    if-eqz p3, :cond_1

    const/4 p3, 0x0

    .line 5
    iput-boolean p3, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->F:Z

    .line 6
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getFrameRateObserver()Lcom/jumio/core/performance/FrameRateObserver;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/jumio/core/performance/FrameRateObserver;->start()V

    .line 7
    :cond_1
    check-cast p1, Lcom/jumio/core/processor/ProcessorState$Finished;

    invoke-virtual {p1}, Lcom/jumio/core/processor/ProcessorState$Finished;->getResult()Ljava/lang/Object;

    move-result-object p3

    .line 8
    instance-of v0, p3, Lcom/jumio/core/extraction/result/ExtractionResultProvider;

    if-eqz v0, :cond_2

    .line 9
    check-cast p3, Lcom/jumio/core/extraction/result/ExtractionResultProvider;

    .line 10
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getConfiguredPart()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-interface {p2}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    move-result-object p2

    .line 12
    invoke-virtual {p1}, Lcom/jumio/core/processor/ProcessorState$Finished;->getBatchId()Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-interface {p3, v0, p2, p1}, Lcom/jumio/core/extraction/result/ExtractionResultProvider;->getExtractionResult(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/jumio/core/extraction/result/ExtractionResult;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_2
    new-instance p3, Lcom/jumio/core/extraction/result/ExtractionResult;

    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getConfiguredPart()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/jumio/core/processor/ProcessorState$Finished;->getBatchId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, v0, p2, p1}, Lcom/jumio/core/extraction/result/ExtractionResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, p3

    .line 15
    :goto_0
    instance-of p2, p1, Lcom/jumio/core/extraction/result/DataExtractionResult;

    if-eqz p2, :cond_3

    .line 16
    move-object p2, p1

    check-cast p2, Lcom/jumio/core/extraction/result/DataExtractionResult;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/result/DataExtractionResult;->getMetaInfo()Lcom/jumio/analytics/MetaInfo;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v4

    .line 17
    :goto_1
    iget-object p3, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

    invoke-interface {p3}, Lcom/jumio/core/processor/ImageProcessorHandlerInterface;->getCurrentProcessor()Lcom/jumio/core/processor/ImageProcessorInterface;

    move-result-object p3

    instance-of v0, p3, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;

    if-eqz v0, :cond_4

    check-cast p3, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;

    goto :goto_2

    :cond_4
    move-object p3, v4

    :goto_2
    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;->getBaseImageData()Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;

    move-result-object p3

    if-eqz p3, :cond_5

    .line 18
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v1, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->INSTANCE:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;

    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->getValidCorners()I

    move-result v1

    invoke-virtual {v0, v1, p3, v4}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build(ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 19
    :cond_5
    sget-object p3, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getShotTaken()I

    move-result v0

    invoke-virtual {p3, v0, p1, p2}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build(ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 20
    :cond_6
    instance-of p3, p1, Lcom/jumio/core/processor/ProcessorState$Skip;

    if-eqz p3, :cond_7

    .line 21
    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getSkipImage()I

    move-result v5

    new-instance v6, Lcom/jumio/core/extraction/result/ExtractionResult;

    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getConfiguredPart()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/jumio/core/extraction/result/ExtractionResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x4

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 22
    :cond_7
    instance-of p2, p1, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;

    if-eqz p2, :cond_8

    .line 23
    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getFlash()I

    move-result v5

    check-cast p1, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;

    invoke-virtual {p1}, Lcom/jumio/core/processor/flash/FlashProcessorState$Flash;->getRequestedState()Lcom/jumio/sdk/enums/JumioFlashState;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 24
    :cond_8
    instance-of p2, p1, Lcom/jumio/core/processor/ProcessorState$RequestMetering;

    if-eqz p2, :cond_9

    .line 25
    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getMetering()I

    move-result v5

    check-cast p1, Lcom/jumio/core/processor/ProcessorState$RequestMetering;

    invoke-virtual {p1}, Lcom/jumio/core/processor/ProcessorState$RequestMetering;->getMeteringConfig()Lcom/jumio/commons/camera/MeteringConfig;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 26
    :cond_9
    instance-of p2, p1, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Flash;

    if-eqz p2, :cond_a

    .line 27
    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getTilt()I

    move-result v5

    check-cast p1, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Flash;

    invoke-virtual {p1}, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Flash;->getRequestedState()Lcom/jumio/sdk/enums/JumioFlashState;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 28
    :cond_a
    instance-of p2, p1, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Tilt;

    if-eqz p2, :cond_b

    .line 29
    sget-object v4, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getTilt()I

    move-result v5

    new-instance v6, Lcom/jumio/sdk/data/JumioTiltState;

    check-cast p1, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Tilt;

    invoke-virtual {p1}, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Tilt;->getCurrentAngle()I

    move-result p2

    invoke-virtual {p1}, Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedProcessorState$Tilt;->getTargetAngle()I

    move-result p1

    invoke-direct {v6, p2, p1}, Lcom/jumio/sdk/data/JumioTiltState;-><init>(II)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 30
    :cond_b
    instance-of p2, p1, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;

    if-eqz p2, :cond_d

    .line 31
    iput-boolean v3, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->F:Z

    .line 32
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getFrameRateObserver()Lcom/jumio/core/performance/FrameRateObserver;

    move-result-object p2

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Lcom/jumio/core/performance/FrameRateObserver;->stop()V

    .line 33
    :cond_c
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getSetChallenge()I

    move-result v1

    check-cast p1, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;

    invoke-virtual {p1}, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorState$ApplyCaptureSettings;->getSettings()Lcom/jumio/commons/camera/CaptureSettings;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 34
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 35
    :cond_e
    :goto_3
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

    invoke-interface {p2}, Lcom/jumio/core/processor/ImageProcessorHandlerInterface;->getCurrentProcessor()Lcom/jumio/core/processor/ImageProcessorInterface;

    move-result-object p2

    instance-of v0, p2, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;

    if-eqz v0, :cond_f

    check-cast p2, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;

    goto :goto_4

    :cond_f
    move-object p2, v4

    :goto_4
    if-eqz p2, :cond_10

    invoke-virtual {p2}, Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;->getBaseImageData()Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;

    move-result-object v4

    .line 36
    :cond_10
    instance-of p2, p1, Lcom/jumio/core/processor/ProcessorState$HoldStill;

    if-eqz p2, :cond_12

    .line 37
    sget-object v5, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->INSTANCE:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->getValidCorners()I

    move-result v6

    if-nez v4, :cond_11

    invoke-virtual {p3}, Lcom/jumio/core/data/document/CornerPoints;->asList()Ljava/util/List;

    move-result-object v4

    :cond_11
    move-object v7, v4

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 38
    sget-object p2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getHoldStill()I

    move-result v6

    move-object p2, p1

    check-cast p2, Lcom/jumio/core/processor/ProcessorState$HoldStill;

    invoke-virtual {p2}, Lcom/jumio/core/processor/ProcessorState$HoldStill;->getTime()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    goto :goto_5

    .line 39
    :cond_12
    instance-of p2, p1, Lcom/jumio/core/processor/alignment/AlignmentProcessorState$Valid;

    if-nez p2, :cond_15

    if-eqz v4, :cond_13

    .line 40
    invoke-virtual {v4}, Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;->getSendRotateUpdate()Z

    move-result p2

    if-ne p2, v3, :cond_13

    .line 41
    sget-object v5, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getRotate()I

    move-result v6

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 42
    :cond_13
    sget-object v5, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p2, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->INSTANCE:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;

    invoke-virtual {p2}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->getInvalidCorners()I

    move-result v6

    if-nez v4, :cond_14

    invoke-virtual {p3}, Lcom/jumio/core/data/document/CornerPoints;->asList()Ljava/util/List;

    move-result-object v4

    :cond_14
    move-object v7, v4

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 43
    :cond_15
    :goto_5
    instance-of p2, p1, Lcom/jumio/core/processor/alignment/AlignmentProcessorState$CenterId;

    if-eqz p2, :cond_16

    .line 44
    sget-object v3, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getCenterId()I

    move-result v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 45
    :cond_16
    instance-of p2, p1, Lcom/jumio/core/processor/alignment/AlignmentProcessorState$TooClose;

    if-eqz p2, :cond_17

    .line 46
    sget-object v3, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getTooClose()I

    move-result v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 47
    :cond_17
    instance-of p2, p1, Lcom/jumio/core/processor/alignment/AlignmentProcessorState$MoveCloser;

    if-eqz p2, :cond_18

    .line 48
    sget-object v3, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getMoveCloser()I

    move-result v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 49
    :cond_18
    instance-of p2, p1, Lcom/jumio/core/processor/alignment/AlignmentProcessorState$HoldStraight;

    if-eqz p2, :cond_19

    .line 50
    sget-object v3, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    sget-object p1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {p1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getHoldStraight()I

    move-result v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void

    .line 51
    :cond_19
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$publishUpdate(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final access$recognizeCorners(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->F:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Ljumio/df/h;

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0, p1, v2}, Ljumio/df/h;-><init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 27
    move-result-object p0

    .line 28
    return-object p0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public static final access$reportDocumentClassification(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/jumio/analytics/MetaInfo;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;->getEntries()Ljava/util/List;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;->getKey()Ljava/lang/String;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;->getLabel()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const/16 v4, 0x3b

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;->getConfidence()F

    .line 53
    move-result v5

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;->getAboveThreshold()Z

    .line 63
    move-result v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_0
    iget-object p0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->E:Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 77
    .line 78
    const-string p1, "classifierOnDeviceV2"

    .line 79
    .line 80
    if-eqz p0, :cond_1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lcom/jumio/core/cdn/CDNFeatureModel;->get(Ljava/lang/String;)Lcom/jumio/core/cdn/CDNEncryptedEntry;

    .line 84
    move-result-object p0

    .line 85
    .line 86
    if-eqz p0, :cond_1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->getFile()Ljava/lang/String;

    .line 90
    move-result-object p0

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    const/4 p0, 0x0

    .line 93
    .line 94
    :goto_1
    const-string v1, "file"

    .line 95
    .line 96
    .line 97
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    sget-object p0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 100
    .line 101
    .line 102
    invoke-static {p1, v0}, Lcom/jumio/analytics/MobileEvents;->misc(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 107
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public static final synthetic access$requestHighResolutionImage(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->requestHighResolutionImage()Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final access$runDocumentClassification(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v1, Ljumio/df/j;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v2}, Ljumio/df/j;-><init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public static final synthetic access$setResult(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final access$skipImage(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Ljava/lang/String;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    .line 6
    .line 7
    sget-object v1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getSkipImage()I

    .line 11
    move-result v1

    .line 12
    .line 13
    new-instance v2, Lcom/jumio/core/extraction/result/ExtractionResult;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getConfiguredPart()Ljava/lang/String;

    .line 17
    move-result-object v3

    .line 18
    const/4 v6, 0x4

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    move-object v4, p1

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v2 .. v7}, Lcom/jumio/core/extraction/result/ExtractionResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    const/4 v4, 0x4

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v0 .. v5}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final a(Lcom/jumio/core/cdn/CDNEncryptedEntry;Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;)Lcom/jumio/core/extraction/docfinder/classifier/Classifier;
    .locals 9

    .line 29
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Creating "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " classifier (device=%s, numThreads=%d) "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", 4"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v2, "DocFinderClient"

    invoke-static {v2, p2}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    sget-object v3, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->Companion:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;

    .line 32
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 33
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->u:Lcom/jumio/core/models/DocfinderSettingsModel;

    invoke-virtual {p2}, Lcom/jumio/core/models/DocfinderSettingsModel;->getModelInitTimeoutInMs()J

    move-result-wide v7

    const/4 v6, 0x4

    move-object v5, p1

    .line 34
    invoke-virtual/range {v3 .. v8}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;->create(Landroid/content/Context;Lcom/jumio/core/cdn/CDNEncryptedEntry;IJ)Lcom/jumio/core/extraction/docfinder/classifier/Classifier;

    move-result-object p1

    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " classifier creation time: "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public cancel()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->z:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0}, Lcom/jumio/core/extraction/ExtractionClient;->cancel()V

    .line 7
    .line 8
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->x:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->cancel()V

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->y:Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->cancel()V

    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->w:Lcom/jumio/core/extraction/ProcessingTimesRecorder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ProcessingTimesRecorder;->reset()V

    .line 29
    .line 30
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0

    .line 34
    throw v1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public capture(Lcom/jumio/commons/camera/Frame;)V
    .locals 8
    .param p1    # Lcom/jumio/commons/camera/Frame;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->capture(Lcom/jumio/commons/camera/Frame;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/jumio/core/processor/ImageProcessorHandlerInterface;->getCurrentProcessor()Lcom/jumio/core/processor/ImageProcessorInterface;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    new-instance v5, Ljumio/df/a;

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct {v5, p1, p0, v0, v1}, Ljumio/df/a;-><init>(Lcom/jumio/commons/camera/Frame;Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/core/processor/ImageProcessorInterface;Lkotlin/coroutines/Continuation;)V

    .line 39
    const/4 v6, 0x2

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public configure(Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/model/StaticModel;)V
    .locals 1
    .param p1    # Lcom/jumio/core/persistence/DataManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/model/StaticModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "dataManager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "configurationModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2}, Lcom/jumio/core/extraction/ExtractionClient;->configure(Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/model/StaticModel;)V

    .line 14
    .line 15
    instance-of v0, p2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string p2, "Configuration model must be an instance of "

    .line 22
    .line 23
    .line 24
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    const-class p2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    const-string p2, "DocFinderClient"

    .line 44
    .line 45
    .line 46
    invoke-static {p2, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const/4 p1, 0x0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->setConfigured(Z)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_0
    const-class v0, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    check-cast p1, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->E:Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 62
    .line 63
    iget-object p1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

    .line 64
    .line 65
    check-cast p2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p2}, Lcom/jumio/core/processor/ImageProcessorHandlerInterfaceKt;->initProcessorsFromScanPartModel(Lcom/jumio/core/processor/ImageProcessorHandlerInterface;Lcom/jumio/core/models/PhysicalIdScanPartModel;)V

    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public destroy()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->z:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0}, Lcom/jumio/core/extraction/ExtractionClient;->destroy()V

    .line 7
    .line 8
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->x:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->destroy()V

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->y:Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->destroy()V

    .line 24
    .line 25
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :cond_1
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit v0

    .line 29
    throw v1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public getFrameRateCheck()Lcom/jumio/core/performance/FrameRateCheck;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->G:Lcom/jumio/core/performance/FrameRateCheck;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public init()V
    .locals 14

    .line 1
    invoke-super {p0}, Lcom/jumio/core/extraction/ExtractionClient;->init()V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->E:Lcom/jumio/core/cdn/CDNFeatureModel;

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_9

    .line 4
    const-string v5, "docfinderModel"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/jumio/core/cdn/CDNFeatureModel;->has([Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_9

    .line 5
    :cond_0
    invoke-static {}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClientKt;->access$getDEFAULT_CLASSIFIER_DEVICE$p()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;

    move-result-object v6

    .line 6
    invoke-virtual {v2, v5}, Lcom/jumio/core/cdn/CDNFeatureModel;->get(Ljava/lang/String;)Lcom/jumio/core/cdn/CDNEncryptedEntry;

    move-result-object v7

    const-string v8, "/"

    const/4 v9, 0x1

    const-string v10, "Failed to create docfinderModel classifier."

    const-string v11, "DocFinderClient"

    if-nez v7, :cond_1

    .line 7
    :try_start_0
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    const-string v1, "docfinderModelNotAvailable"

    invoke-static {v1, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :catch_1
    move-exception v0

    goto/16 :goto_6

    .line 8
    :cond_1
    invoke-virtual {v7}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->isPreloadedFile()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 9
    sget-object v12, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    const-string v13, "docFinderPreloaded"

    invoke-static {v13, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 10
    :cond_2
    invoke-virtual {p0, v7, v6}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->a(Lcom/jumio/core/cdn/CDNEncryptedEntry;Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;)Lcom/jumio/core/extraction/docfinder/classifier/Classifier;

    move-result-object v6

    const-string v12, "null cannot be cast to non-null type com.jumio.core.extraction.docfinder.classifier.CornerDetectionClassifier"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;

    iput-object v6, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->x:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    invoke-static {}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClientKt;->access$getDEFAULT_CLASSIFIER_DEVICE$p()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;

    move-result-object v5

    .line 12
    const-string v6, "classifierOnDeviceV2"

    invoke-virtual {v2, v6}, Lcom/jumio/core/cdn/CDNFeatureModel;->get(Ljava/lang/String;)Lcom/jumio/core/cdn/CDNEncryptedEntry;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 13
    :try_start_1
    invoke-virtual {v7}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->isPreloadedFile()Z

    move-result v12

    if-eqz v12, :cond_3

    .line 14
    sget-object v12, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    const-string v13, "classifierOnDevicePreloaded"

    invoke-static {v13, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    goto :goto_0

    :catch_2
    move-exception v2

    goto :goto_1

    :catch_3
    move-exception v5

    goto :goto_2

    .line 15
    :cond_3
    :goto_0
    invoke-virtual {p0, v7, v5}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->a(Lcom/jumio/core/cdn/CDNEncryptedEntry;Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;)Lcom/jumio/core/extraction/docfinder/classifier/Classifier;

    move-result-object v5

    const-string v12, "null cannot be cast to non-null type com.jumio.core.extraction.docfinder.classifier.DocumentClassifier"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;

    iput-object v5, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->y:Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;

    goto :goto_4

    .line 16
    :cond_4
    const-string v5, "Could not find encrypted model classifierOnDeviceV2"

    .line 17
    new-instance v12, Ljava/lang/IllegalArgumentException;

    invoke-direct {v12, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v12
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_2

    .line 18
    :goto_1
    invoke-static {v11, v10, v2}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    sget-object v5, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    invoke-static {v2}, Lcom/jumio/analytics/MobileEvents;->exception(Ljava/lang/Throwable;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 20
    const-string v2, "classifierOnDeviceUnsatifiedLink"

    invoke-static {v2, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    goto :goto_4

    :goto_2
    if-eqz v7, :cond_5

    .line 21
    invoke-virtual {v7}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->isAssetFile()Z

    move-result v10

    if-ne v10, v9, :cond_5

    invoke-static {}, Lcom/jumio/core/util/DeviceUtilKt;->getDeviceUtil()Lcom/jumio/core/interfaces/DeviceUtilInterface;

    move-result-object v9

    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-interface {v9, v10}, Lcom/jumio/core/interfaces/DeviceUtilInterface;->isDebug(Landroid/content/Context;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 22
    invoke-virtual {v7}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->getFile()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v8, v4, v3, v4}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 23
    :cond_5
    const-string v7, "Failed to create classifierOnDeviceV2 classifier."

    invoke-static {v11, v7, v5}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    invoke-virtual {v2, v6}, Lcom/jumio/core/cdn/CDNFeatureModel;->clean(Ljava/lang/String;)V

    .line 25
    instance-of v2, v5, Lcom/jumio/core/cdn/CDNDecryptException;

    if-eqz v2, :cond_6

    .line 26
    const-string v2, "classifierOnDeviceDecryptionFailed"

    goto :goto_3

    .line 27
    :cond_6
    const-string v2, "classifierOnDeviceInitFailed"

    .line 28
    :goto_3
    sget-object v5, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    invoke-static {v2, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 29
    :goto_4
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 30
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->u:Lcom/jumio/core/models/DocfinderSettingsModel;

    invoke-virtual {v3}, Lcom/jumio/core/models/DocfinderSettingsModel;->getSamplingTimeInMs()J

    move-result-wide v3

    .line 31
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 32
    invoke-virtual {v2, v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    .line 33
    invoke-virtual {p0, v2, v3, p0}, Lcom/jumio/core/extraction/ExtractionClient;->startFrameRateObservation(JLcom/jumio/core/performance/FrameRateCallback;)V

    .line 34
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Frame rate observation initialised with:\n"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    iget-object v5, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->u:Lcom/jumio/core/models/DocfinderSettingsModel;

    invoke-virtual {v5}, Lcom/jumio/core/models/DocfinderSettingsModel;->getFrameRateThreshold()I

    move-result v5

    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " FPS threshold\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " Ns sampling time\n"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->u:Lcom/jumio/core/models/DocfinderSettingsModel;

    invoke-virtual {v2}, Lcom/jumio/core/models/DocfinderSettingsModel;->getViolationLimit()I

    move-result v2

    .line 38
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " violation limit"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 39
    invoke-static {v11, v2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Initialization: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->D:Ljava/lang/String;

    .line 42
    new-instance v0, Lcom/jumio/analytics/MetaInfo;

    invoke-direct {v0}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "initTime"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    invoke-static {v11, v0}, Lcom/jumio/analytics/MobileEvents;->performance(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 45
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->D:Ljava/lang/String;

    invoke-static {v11, v0}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->v:Lcom/jumio/core/processor/ImageProcessorHandlerInterface;

    invoke-interface {v0}, Lcom/jumio/core/processor/ImageProcessorHandlerInterface;->resetCurrentProcessor()V

    return-void

    .line 47
    :goto_5
    invoke-static {v11, v10, v0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    sget-object v1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    invoke-static {v0}, Lcom/jumio/analytics/MobileEvents;->exception(Ljava/lang/Throwable;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 49
    const-string v0, "docfinderModelUnsatifiedLink"

    invoke-static {v0, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    goto :goto_8

    :goto_6
    if-eqz v7, :cond_7

    .line 50
    invoke-virtual {v7}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->isAssetFile()Z

    move-result v1

    if-ne v1, v9, :cond_7

    invoke-static {}, Lcom/jumio/core/util/DeviceUtilKt;->getDeviceUtil()Lcom/jumio/core/interfaces/DeviceUtilInterface;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-interface {v1, v6}, Lcom/jumio/core/interfaces/DeviceUtilInterface;->isDebug(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 51
    invoke-virtual {v7}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->getFile()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8, v4, v3, v4}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 52
    :cond_7
    invoke-static {v11, v10, v0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    invoke-virtual {v2, v5}, Lcom/jumio/core/cdn/CDNFeatureModel;->clean(Ljava/lang/String;)V

    .line 54
    instance-of v0, v0, Lcom/jumio/core/cdn/CDNDecryptException;

    if-eqz v0, :cond_8

    .line 55
    const-string v0, "docfinderModelDecryptionFailed"

    goto :goto_7

    .line 56
    :cond_8
    const-string v0, "docFinderModelInitFailed"

    .line 57
    :goto_7
    sget-object v1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    invoke-static {v0, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 58
    :goto_8
    sget-object v0, Lcom/jumio/sdk/enums/JumioFallbackReason;->SCANNING_ERROR:Lcom/jumio/sdk/enums/JumioFallbackReason;

    invoke-virtual {p0, v0}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    return-void

    .line 59
    :cond_9
    :goto_9
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    const-string v1, "docFinderModelNotAvailable"

    invoke-static {v1, v4, v3, v4}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 60
    sget-object v0, Lcom/jumio/sdk/enums/JumioFallbackReason;->SCANNING_ERROR:Lcom/jumio/sdk/enums/JumioFallbackReason;

    invoke-virtual {p0, v0}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public onFramesSampled(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->getFrameRateCheck()Lcom/jumio/core/performance/FrameRateCheck;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/jumio/core/performance/FrameRateCheck;->checkFrameRate(I)Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    sget-object p1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 15
    .line 16
    const-string v0, "docFinderFrameRateFallback"

    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2, v1, v2}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 26
    .line 27
    sget-object p1, Lcom/jumio/sdk/enums/JumioFallbackReason;->LOW_PERFORMANCE:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->triggerFallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)Lkotlinx/coroutines/x1;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    new-instance v0, Lcom/jumio/core/models/ExtractionModeModel;

    .line 39
    const/4 v1, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1}, Lcom/jumio/core/models/ExtractionModeModel;-><init>(Z)V

    .line 43
    .line 44
    const-class v1, Lcom/jumio/core/models/ExtractionModeModel;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1, v0}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 48
    .line 49
    :cond_0
    const-string p1, "DocFinderClient"

    .line 50
    .line 51
    const-string v0, "DocFinder disabled for the session - Reason: fallback"

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :cond_1
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public process(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V
    .locals 10
    .param p1    # Lcom/jumio/commons/camera/Frame;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "frame"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "cameraSettings"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "extractionArea"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->z:Ljava/lang/Object;

    .line 18
    monitor-enter v1

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getDataExtraction()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    sget-object v2, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;

    .line 27
    .line 28
    sget-object p1, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->INSTANCE:Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderUpdateState;->getInvalidCorners()I

    .line 32
    move-result v3

    .line 33
    const/4 v6, 0x4

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v2 .. v7}, Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;->build$default(Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 44
    const/4 p1, 0x0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    monitor-exit v1

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/jumio/core/extraction/ExtractionClient;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    new-instance v4, Ljumio/df/g;

    .line 71
    const/4 v9, 0x0

    .line 72
    move-object v5, p0

    .line 73
    move-object v6, p1

    .line 74
    move-object v7, p2

    .line 75
    move-object v8, p3

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v4 .. v9}, Ljumio/df/g;-><init>(Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)V

    .line 79
    const/4 v6, 0x2

    .line 80
    const/4 v7, 0x0

    .line 81
    move-object v5, v4

    .line 82
    const/4 v4, 0x0

    .line 83
    .line 84
    .line 85
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    monitor-exit v1

    .line 89
    return-void

    .line 90
    :goto_0
    monitor-exit v1

    .line 91
    throw p1
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public setFrameRateCheck(Lcom/jumio/core/performance/FrameRateCheck;)V
    .locals 0
    .param p1    # Lcom/jumio/core/performance/FrameRateCheck;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->G:Lcom/jumio/core/performance/FrameRateCheck;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public shouldFeed()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->z:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/extraction/DocFinderClient;->x:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->isActive$jumio_docfinder_release()Z

    .line 11
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    :goto_0
    monitor-exit v0

    .line 20
    return v2

    .line 21
    :goto_1
    monitor-exit v0

    .line 22
    throw v1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method
