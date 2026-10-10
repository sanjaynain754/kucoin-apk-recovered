.class public abstract Lcom/jumio/core/extraction/docfinder/classifier/Classifier;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;,
        Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Device;,
        Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;,
        Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008&\u0018\u0000 ,2\u00020\u0001:\u0004)*+,B-\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0004J\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\r\u0010#\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\u0008$J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u0005H\u0002J\u0008\u0010(\u001a\u00020\u001eH$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;",
        "",
        "tfliteModel",
        "Ljava/nio/ByteBuffer;",
        "numThreads",
        "",
        "inputImageSizeX",
        "inputImageSizeY",
        "<init>",
        "(Ljava/nio/ByteBuffer;III)V",
        "intValues",
        "",
        "tfliteOptions",
        "Lorg/tensorflow/lite/Interpreter$Options;",
        "inferenceCancelled",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "tflite",
        "Lorg/tensorflow/lite/Interpreter;",
        "imgData",
        "getImgData",
        "()Ljava/nio/ByteBuffer;",
        "setImgData",
        "(Ljava/nio/ByteBuffer;)V",
        "currentModelType",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;",
        "getCurrentModelType",
        "()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;",
        "normalizeImages",
        "",
        "convertBitmapToByteBuffer",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "cancel",
        "destroy",
        "isActive",
        "isActive$jumio_docfinder_release",
        "numBytesPerChannel",
        "addPixelValue",
        "pixelValue",
        "runInference",
        "ModelType",
        "Device",
        "Recognition",
        "Companion",
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
        "SMAP\nClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Classifier.kt\ncom/jumio/core/extraction/docfinder/classifier/Classifier\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,239:1\n29#2,3:240\n*S KotlinDebug\n*F\n+ 1 Classifier.kt\ncom/jumio/core/extraction/docfinder/classifier/Classifier\n*L\n221#1:240,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DEFAULT_MODEL_INIT_TIMEOUT:J = 0x1388L

.field private static final DIM_BATCH_SIZE:I = 0x1

.field private static final DIM_PIXEL_SIZE:I = 0x3

.field private static TAG:Ljava/lang/String;


# instance fields
.field private imgData:Ljava/nio/ByteBuffer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private inferenceCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final inputImageSizeX:I

.field private final inputImageSizeY:I

.field private intValues:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field protected normalizeImages:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field private final numBytesPerChannel:I

.field protected tflite:Lorg/tensorflow/lite/Interpreter;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tfliteModel:Ljava/nio/ByteBuffer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tfliteOptions:Lorg/tensorflow/lite/Interpreter$Options;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->Companion:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Companion;

    .line 9
    .line 10
    const-string v0, "Classifier"

    .line 11
    .line 12
    sput-object v0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->TAG:Ljava/lang/String;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;III)V
    .locals 2
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "tfliteModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tfliteModel:Ljava/nio/ByteBuffer;

    .line 3
    iput p3, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inputImageSizeX:I

    .line 4
    iput p4, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inputImageSizeY:I

    mul-int/2addr p3, p4

    .line 5
    new-array p1, p3, [I

    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->intValues:[I

    .line 6
    new-instance p1, Lorg/tensorflow/lite/Interpreter$Options;

    invoke-direct {p1}, Lorg/tensorflow/lite/Interpreter$Options;-><init>()V

    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tfliteOptions:Lorg/tensorflow/lite/Interpreter$Options;

    .line 7
    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p4, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inferenceCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x1

    .line 8
    iput-boolean p4, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->normalizeImages:Z

    const/4 v1, 0x4

    .line 9
    iput v1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->numBytesPerChannel:I

    .line 10
    invoke-virtual {p1, p2}, Lorg/tensorflow/lite/Interpreter$Options;->setNumThreads(I)Lorg/tensorflow/lite/Interpreter$Options;

    .line 11
    invoke-virtual {p1, p4}, Lorg/tensorflow/lite/Interpreter$Options;->setCancellable(Z)Lorg/tensorflow/lite/Interpreter$Options;

    .line 12
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inferenceCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 14
    new-instance p2, Lorg/tensorflow/lite/Interpreter;

    iget-object p4, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tfliteModel:Ljava/nio/ByteBuffer;

    invoke-direct {p2, p4, p1}, Lorg/tensorflow/lite/Interpreter;-><init>(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/Interpreter$Options;)V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v0

    .line 16
    sget-object p4, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->TAG:Ljava/lang/String;

    const-string v0, "TAG"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Initializing interpreter took "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "ms"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p4, p1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    mul-int/lit8 p1, p3, 0xc

    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 18
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 19
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->imgData:Ljava/nio/ByteBuffer;

    .line 20
    new-array p1, p3, [I

    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->intValues:[I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p4, v0

    .line 21
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;-><init>(Ljava/nio/ByteBuffer;III)V

    return-void
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->TAG:Ljava/lang/String;

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


# virtual methods
.method public final declared-synchronized cancel()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->TAG:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "TAG"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    const-string v1, "Classifier cancel executed"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inferenceCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lorg/tensorflow/lite/Interpreter;->setCancelled(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v0
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

.method public final convertBitmapToByteBuffer(Landroid/graphics/Bitmap;)V
    .locals 11
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "bitmap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->imgData:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->intValues:[I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 18
    move-result v4

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 22
    move-result v7

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    move-result v8

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v1, p1

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 37
    move-result-wide v0

    .line 38
    .line 39
    iget p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inputImageSizeX:I

    .line 40
    const/4 v2, 0x0

    .line 41
    move v3, v2

    .line 42
    move v4, v3

    .line 43
    .line 44
    :goto_0
    if-ge v3, p1, :cond_4

    .line 45
    .line 46
    iget v5, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inputImageSizeY:I

    .line 47
    move v6, v2

    .line 48
    .line 49
    :goto_1
    if-ge v6, v5, :cond_3

    .line 50
    .line 51
    iget-object v7, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->intValues:[I

    .line 52
    .line 53
    add-int/lit8 v8, v4, 0x1

    .line 54
    .line 55
    aget v4, v7, v4

    .line 56
    .line 57
    iget-boolean v7, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->normalizeImages:Z

    .line 58
    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    const/high16 v7, 0x437f0000    # 255.0f

    .line 62
    goto :goto_2

    .line 63
    .line 64
    :cond_1
    const/high16 v7, 0x3f800000    # 1.0f

    .line 65
    .line 66
    :goto_2
    iget-object v9, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->imgData:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    if-eqz v9, :cond_2

    .line 69
    .line 70
    shr-int/lit8 v10, v4, 0x10

    .line 71
    .line 72
    and-int/lit16 v10, v10, 0xff

    .line 73
    int-to-float v10, v10

    .line 74
    div-float/2addr v10, v7

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    shr-int/lit8 v10, v4, 0x8

    .line 80
    .line 81
    and-int/lit16 v10, v10, 0xff

    .line 82
    int-to-float v10, v10

    .line 83
    div-float/2addr v10, v7

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    and-int/lit16 v4, v4, 0xff

    .line 89
    int-to-float v4, v4

    .line 90
    div-float/2addr v4, v7

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v4}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 96
    move v4, v8

    .line 97
    goto :goto_1

    .line 98
    .line 99
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 100
    goto :goto_0

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 104
    move-result-wide v2

    .line 105
    .line 106
    sget-object p1, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->TAG:Ljava/lang/String;

    .line 107
    .line 108
    const-string v4, "TAG"

    .line 109
    .line 110
    .line 111
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    new-instance v4, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v5, "Timecost to put values into ByteBuffer: "

    .line 116
    .line 117
    .line 118
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    sub-long/2addr v2, v0

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v0}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    return-void
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
.end method

.method public final declared-synchronized destroy()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->TAG:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "TAG"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    const-string v1, "Classifier destroy executed"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/tensorflow/lite/Interpreter;->close()V

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
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

.method public abstract getCurrentModelType()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final getImgData()Ljava/nio/ByteBuffer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->imgData:Ljava/nio/ByteBuffer;

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

.method public final isActive$jumio_docfinder_release()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->inferenceCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public abstract runInference()V
.end method

.method public final setImgData(Ljava/nio/ByteBuffer;)V
    .locals 0
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->imgData:Ljava/nio/ByteBuffer;

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
