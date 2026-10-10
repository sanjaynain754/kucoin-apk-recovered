.class public final Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;
.super Lcom/jumio/core/extraction/docfinder/classifier/Classifier;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0008\u0010\u001a\u001a\u00020\u001bH\u0014R\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;",
        "tfliteModel",
        "Ljava/nio/ByteBuffer;",
        "numThreads",
        "",
        "inputImageSizeX",
        "inputImageSizeY",
        "<init>",
        "(Ljava/nio/ByteBuffer;III)V",
        "labelProbArray",
        "",
        "",
        "[[F",
        "currentModelType",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;",
        "getCurrentModelType",
        "()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;",
        "getNormalizedProbability",
        "",
        "labelIndex",
        "recognizeImage",
        "",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "runInference",
        "",
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
        "SMAP\nCornerDetectionClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerDetectionClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,96:1\n29#2,3:97\n*S KotlinDebug\n*F\n+ 1 CornerDetectionClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier\n*L\n44#1:97,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final IMAGE_SIZE_X:I = 0xe0

.field public static final IMAGE_SIZE_Y:I = 0xe0

.field public static final c:Lkotlin/ranges/IntRange;


# instance fields
.field public final a:[[F

.field public final b:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->Companion:Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier$Companion;

    .line 9
    .line 10
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x7

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 16
    .line 17
    sput-object v0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->c:Lkotlin/ranges/IntRange;

    .line 18
    return-void
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
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;III)V
    .locals 1
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "tfliteModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;-><init>(Ljava/nio/ByteBuffer;III)V

    const/16 p1, 0x8

    .line 3
    new-array p1, p1, [F

    filled-new-array {p1}, [[F

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 4
    sget-object p1, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;->CORNER_DETECTION:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;

    iput-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->b:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/16 v0, 0xe0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p4, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;-><init>(Ljava/nio/ByteBuffer;III)V

    return-void
.end method


# virtual methods
.method public getCurrentModelType()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->b:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;

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

.method public final declared-synchronized recognizeImage(Landroid/graphics/Bitmap;)Ljava/util/List;
    .locals 8
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Ljava/util/List<",
            "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "bitmap"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->isActive$jumio_docfinder_release()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->convertBitmapToByteBuffer(Landroid/graphics/Bitmap;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    move-result-wide v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->runInference()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    move-result-wide v3

    .line 32
    sub-long/2addr v3, v1

    .line 33
    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "Running inference took "

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "ms"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    const-string v1, "CornerDetectionClassifier"

    .line 54
    .line 55
    .line 56
    invoke-static {v1, p1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    sget-object p1, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->c:Lkotlin/ranges/IntRange;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lkotlin/ranges/IntProgression;->getFirst()I

    .line 62
    move-result v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lkotlin/ranges/IntProgression;->getLast()I

    .line 66
    move-result p1

    .line 67
    .line 68
    if-gt v1, p1, :cond_0

    .line 69
    .line 70
    :goto_0
    new-instance v2, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    iget-object v4, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 77
    const/4 v5, 0x0

    .line 78
    .line 79
    aget-object v4, v4, v5

    .line 80
    .line 81
    aget v5, v4, v1

    .line 82
    const/4 v6, 0x2

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v4, 0x0

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v2 .. v7}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$Recognition;-><init>(Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    if-eq v1, p1, :cond_0

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    goto :goto_1

    .line 99
    :cond_0
    monitor-exit p0

    .line 100
    return-object v0

    .line 101
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    throw p1
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

.method public runInference()V
    .locals 13

    .line 1
    .line 2
    const-string v1, "CornerDetectionClassifier"

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->getImgData()Ljava/nio/ByteBuffer;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2, v3}, Lorg/tensorflow/lite/Interpreter;->run(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    :goto_0
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 21
    .line 22
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 23
    .line 24
    const-string v2, "TL(%f, %f), TR(%f, %f), BR(%f, %f), BL(%f, %f)"

    .line 25
    .line 26
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 27
    const/4 v4, 0x0

    .line 28
    .line 29
    aget-object v3, v3, v4

    .line 30
    .line 31
    aget v3, v3, v4

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 38
    .line 39
    aget-object v3, v3, v4

    .line 40
    const/4 v6, 0x1

    .line 41
    .line 42
    aget v3, v3, v6

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 49
    .line 50
    aget-object v3, v3, v4

    .line 51
    const/4 v7, 0x2

    .line 52
    .line 53
    aget v3, v3, v7

    .line 54
    .line 55
    .line 56
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 57
    move-result-object v7

    .line 58
    .line 59
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 60
    .line 61
    aget-object v3, v3, v4

    .line 62
    const/4 v8, 0x3

    .line 63
    .line 64
    aget v3, v3, v8

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    move-result-object v8

    .line 69
    .line 70
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 71
    .line 72
    aget-object v3, v3, v4

    .line 73
    const/4 v9, 0x4

    .line 74
    .line 75
    aget v3, v3, v9

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    move-result-object v9

    .line 80
    .line 81
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 82
    .line 83
    aget-object v3, v3, v4

    .line 84
    const/4 v10, 0x5

    .line 85
    .line 86
    aget v3, v3, v10

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    move-result-object v10

    .line 91
    .line 92
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 93
    .line 94
    aget-object v3, v3, v4

    .line 95
    const/4 v11, 0x6

    .line 96
    .line 97
    aget v3, v3, v11

    .line 98
    .line 99
    .line 100
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    move-result-object v11

    .line 102
    .line 103
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/CornerDetectionClassifier;->a:[[F

    .line 104
    .line 105
    aget-object v3, v3, v4

    .line 106
    const/4 v4, 0x7

    .line 107
    .line 108
    aget v3, v3, v4

    .line 109
    .line 110
    .line 111
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    move-result-object v12

    .line 113
    .line 114
    .line 115
    filled-new-array/range {v5 .. v12}, [Ljava/lang/Object;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    const/16 v4, 0x8

    .line 119
    .line 120
    .line 121
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    const-string v2, "format(...)"

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    return-void

    .line 136
    .line 137
    :goto_1
    const-string v2, "Error on running inference"

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v2, v0}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    return-void
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
.end method
