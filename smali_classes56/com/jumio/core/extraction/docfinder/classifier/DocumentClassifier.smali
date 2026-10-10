.class public final Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;
.super Lcom/jumio/core/extraction/docfinder/classifier/Classifier;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u000f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier;",
        "tfliteModel",
        "Ljava/nio/ByteBuffer;",
        "numThreads",
        "",
        "inputImageSizeX",
        "inputImageSizeY",
        "<init>",
        "(Ljava/nio/ByteBuffer;III)V",
        "classificationResultMap",
        "",
        "",
        "labelsMap",
        "",
        "",
        "thresholdMap",
        "",
        "currentModelType",
        "Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;",
        "getCurrentModelType",
        "()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;",
        "runInference",
        "",
        "recognizeMultiHeadOutput",
        "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "getResultEntries",
        "",
        "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;",
        "getOutputMapFor",
        "",
        "type",
        "getHighestConfidenceValueFor",
        "isConfidenceValueAboveThresholdFor",
        "",
        "getHighestConfidenceLabelFor",
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
        "SMAP\nDocumentClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/DocumentClassifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Timing.kt\nkotlin/system/TimingKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,207:1\n11158#2:208\n11493#2,3:209\n1742#2,6:250\n1863#3:212\n295#3,2:213\n1864#3:216\n1863#3:217\n295#3,2:218\n1864#3:224\n295#3,2:225\n1863#3,2:227\n1863#3,2:233\n346#3,8:242\n1#4:215\n37#5:220\n36#5,3:221\n37#5:229\n36#5,3:230\n29#6,3:235\n126#7:238\n153#7,3:239\n*S KotlinDebug\n*F\n+ 1 DocumentClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/DocumentClassifier\n*L\n48#1:208\n48#1:209,3\n160#1:250,6\n64#1:212\n65#1:213,2\n64#1:216\n74#1:217\n75#1:218,2\n74#1:224\n81#1:225,2\n86#1:227,2\n102#1:233,2\n144#1:242,8\n78#1:220\n78#1:221,3\n93#1:229\n93#1:230,3\n124#1:235,3\n133#1:238\n133#1:239,3\n*E\n"
    }
.end annotation


# static fields
.field private static final CONFIDENCE_VALUE_FALLBACK:[F
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final IMAGE_SIZE_X:I = 0xe0

.field public static final IMAGE_SIZE_Y:I = 0xe0

.field public static final KEY_COUNTRY:Ljava/lang/String; = "country"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_SIDE:Ljava/lang/String; = "classifier"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_TYPE:Ljava/lang/String; = "idtype"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private classificationResultMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final currentModelType:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final labelsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final thresholdMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->Companion:Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier$Companion;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    sput-object v0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->CONFIDENCE_VALUE_FALLBACK:[F

    .line 14
    return-void
    .line 15
    .line 16
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;III)V
    .locals 7
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "tfliteModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;-><init>(Ljava/nio/ByteBuffer;III)V

    .line 3
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->classificationResultMap:Ljava/util/Map;

    .line 4
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    .line 5
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->thresholdMap:Ljava/util/Map;

    .line 6
    sget-object p2, Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;->CLASSIFICATION:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;

    iput-object p2, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->currentModelType:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;

    .line 7
    iget-object p2, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    const-string p3, "serving_default"

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2, p3}, Lorg/tensorflow/lite/Interpreter;->getSignatureOutputs(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    new-array p2, p4, [Ljava/lang/String;

    .line 8
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    array-length v1, p2

    move v2, p4

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_3

    aget-object v4, p2, v2

    .line 10
    iget-object v5, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v4, p3}, Lorg/tensorflow/lite/Interpreter;->getOutputTensorFromSignature(Ljava/lang/String;Ljava/lang/String;)Lorg/tensorflow/lite/Tensor;

    move-result-object v3

    .line 11
    :cond_2
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 12
    :cond_3
    invoke-static {p2, v0}, Lkotlin/collections/ArraysKt;->zip([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    .line 13
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lorg/tensorflow/lite/Interpreter;->getOutputTensorCount()I

    move-result v0

    goto :goto_1

    :cond_4
    move v0, p4

    :goto_1
    move v1, p4

    :goto_2
    if-ge v1, v0, :cond_6

    .line 15
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    if-eqz v2, :cond_5

    invoke-virtual {v2, v1}, Lorg/tensorflow/lite/Interpreter;->getOutputTensor(I)Lorg/tensorflow/lite/Tensor;

    move-result-object v2

    goto :goto_3

    :cond_5
    move-object v2, v3

    :goto_3
    invoke-interface {p3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 16
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_7
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/tensorflow/lite/Tensor;

    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lkotlin/Pair;

    if-eqz v1, :cond_9

    .line 19
    invoke-interface {v1}, Lorg/tensorflow/lite/Tensor;->name()Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_9
    move-object v6, v3

    :goto_5
    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/tensorflow/lite/Tensor;

    if-eqz v5, :cond_a

    invoke-interface {v5}, Lorg/tensorflow/lite/Tensor;->name()Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    :cond_a
    move-object v5, v3

    :goto_6
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_7

    :cond_b
    move-object v4, v3

    .line 20
    :goto_7
    check-cast v4, Lkotlin/Pair;

    if-eqz v4, :cond_c

    .line 21
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_8

    :cond_c
    move-object v1, v3

    :goto_8
    if-eqz v1, :cond_7

    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 23
    :cond_d
    new-instance p2, Lorg/tensorflow/lite/support/metadata/MetadataExtractor;

    invoke-direct {p2, p1}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor;-><init>(Ljava/nio/ByteBuffer;)V

    .line 24
    invoke-virtual {p2}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor;->hasMetadata()Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const-string v0, "getAssociatedFile(...)"

    const/4 v1, 0x2

    const-string v2, "getAssociatedFileNames(...)"

    if-eqz p3, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 26
    invoke-virtual {p2}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor;->getAssociatedFileNames()Ljava/util/Set;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .line 28
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v5, p3, p4, v1, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    goto :goto_a

    :cond_10
    move-object v4, v3

    .line 29
    :goto_a
    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_e

    .line 30
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_11

    goto :goto_9

    .line 31
    :cond_11
    invoke-virtual {p2, v4}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor;->getAssociatedFile(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 32
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkotlin/text/Regex;

    const-string v4, "[\r\n]+"

    invoke-direct {v2, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1, p4}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v1

    .line 33
    new-array v2, p4, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 34
    invoke-interface {v0, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 35
    :cond_12
    invoke-virtual {p2}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor;->getAssociatedFileNames()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_14

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Ljava/lang/String;

    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v4, "threshold"

    invoke-static {v2, v4, p4, v1, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_b

    :cond_14
    move-object p3, v3

    .line 38
    :goto_b
    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_16

    .line 39
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_15

    goto :goto_c

    .line 40
    :cond_15
    invoke-virtual {p2, p3}, Lorg/tensorflow/lite/support/metadata/MetadataExtractor;->getAssociatedFile(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object p1

    sget-object p2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance p3, Ljava/lang/String;

    invoke-direct {p3, p1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_d

    .line 41
    :cond_16
    :goto_c
    const-string p3, ""

    :goto_d
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "sdk"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lorg/json/JSONObject;

    if-eqz p2, :cond_17

    move-object v3, p1

    check-cast v3, Lorg/json/JSONObject;

    :cond_17
    if-nez v3, :cond_18

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 42
    :cond_18
    iget-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    .line 43
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 44
    iget-object p3, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->thresholdMap:Ljava/util/Map;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_op_threshold"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    double-to-float v0, v0

    goto :goto_f

    :cond_19
    const/4 v0, 0x0

    :goto_f
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p3, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    .line 45
    :cond_1a
    const-string p1, "DocumentClassifier"

    const-string p2, "Extractor doesn\'t have metadata"

    invoke-static {p1, p2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :cond_1b
    iget-object p1, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    .line 47
    new-array p2, p4, [[Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 48
    check-cast p1, [[Ljava/lang/String;

    .line 49
    array-length p2, p1

    :goto_10
    if-ge p4, p2, :cond_1c

    .line 50
    iget-object p3, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->classificationResultMap:Ljava/util/Map;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aget-object v1, p1, p4

    array-length v1, v1

    new-array v1, v1, [F

    filled-new-array {v1}, [[F

    move-result-object v1

    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p4, p4, 0x1

    goto :goto_10

    :cond_1c
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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;-><init>(Ljava/nio/ByteBuffer;III)V

    return-void
.end method

.method private final getHighestConfidenceLabelFor(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getOutputMapFor(Ljava/lang/String;)[F

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget v3, v0, v2

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getHighestConfidenceValueFor(Ljava/lang/String;)F

    .line 14
    move-result v4

    .line 15
    .line 16
    cmpg-float v3, v3, v4

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v2, -0x1

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-ltz v2, :cond_2

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    .line 33
    :goto_2
    const-string v1, "-"

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 39
    move-result v0

    .line 40
    .line 41
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    check-cast p1, [Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    aget-object p1, p1, v0

    .line 52
    .line 53
    if-nez p1, :cond_3

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    return-object p1

    .line 56
    :cond_4
    :goto_3
    return-object v1
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

.method private final getHighestConfidenceValueFor(Ljava/lang/String;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getOutputMapFor(Ljava/lang/String;)[F

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->maxOrThrow([F)F

    .line 8
    move-result p1

    .line 9
    return p1
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

.method private final getOutputMapFor(Ljava/lang/String;)[F
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    if-gez v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 27
    .line 28
    :cond_0
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 v1, -0x1

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    move-result-object p1

    .line 44
    const/4 v0, 0x0

    .line 45
    .line 46
    if-ltz v1, :cond_3

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object p1, v0

    .line 49
    .line 50
    :goto_2
    if-eqz p1, :cond_8

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 54
    move-result v1

    .line 55
    .line 56
    iget-object v2, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->classificationResultMap:Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 60
    move-result v2

    .line 61
    .line 62
    if-gt v2, v1, :cond_4

    .line 63
    .line 64
    sget-object p1, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->CONFIDENCE_VALUE_FALLBACK:[F

    .line 65
    return-object p1

    .line 66
    .line 67
    :cond_4
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->classificationResultMap:Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    instance-of v1, p1, [[F

    .line 74
    .line 75
    if-eqz v1, :cond_5

    .line 76
    move-object v0, p1

    .line 77
    .line 78
    check-cast v0, [[F

    .line 79
    .line 80
    :cond_5
    if-eqz v0, :cond_7

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    check-cast p1, [F

    .line 87
    .line 88
    if-nez p1, :cond_6

    .line 89
    goto :goto_3

    .line 90
    :cond_6
    return-object p1

    .line 91
    .line 92
    :cond_7
    :goto_3
    sget-object p1, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->CONFIDENCE_VALUE_FALLBACK:[F

    .line 93
    return-object p1

    .line 94
    .line 95
    :cond_8
    sget-object p1, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->CONFIDENCE_VALUE_FALLBACK:[F

    .line 96
    return-object p1
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

.method private final getResultEntries()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    .line 33
    new-instance v3, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    check-cast v4, Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    move-result-object v5

    .line 44
    .line 45
    check-cast v5, Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, v5}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getHighestConfidenceLabelFor(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    move-result-object v6

    .line 54
    .line 55
    check-cast v6, Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v6}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getHighestConfidenceValueFor(Ljava/lang/String;)F

    .line 59
    move-result v6

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    check-cast v2, Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, v2}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->isConfidenceValueAboveThresholdFor(Ljava/lang/String;)Z

    .line 69
    move-result v2

    .line 70
    .line 71
    .line 72
    invoke-direct {v3, v4, v5, v6, v2}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;-><init>(Ljava/lang/String;Ljava/lang/String;FZ)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    return-object v1
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method private final isConfidenceValueAboveThresholdFor(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getHighestConfidenceValueFor(Ljava/lang/String;)F

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->thresholdMap:Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Float;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 18
    move-result p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    .line 22
    :goto_0
    cmpl-float p1, v0, p1

    .line 23
    .line 24
    if-lez p1, :cond_1

    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1
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
.end method


# virtual methods
.method public getCurrentModelType()Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->currentModelType:Lcom/jumio/core/extraction/docfinder/classifier/Classifier$ModelType;

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

.method public final recognizeMultiHeadOutput(Landroid/graphics/Bitmap;)Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "bitmap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->convertBitmapToByteBuffer(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->runInference()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    move-result-wide v2

    .line 20
    sub-long/2addr v2, v0

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v0, "Running inference took "

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v0, "ms"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    const-string v0, "DocumentClassifier"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, p1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    new-instance p1, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getResultEntries()Ljava/util/List;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, v0}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;-><init>(Ljava/util/List;)V

    .line 54
    return-object p1
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

.method public runInference()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "DocumentClassifier"

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->tflite:Lorg/tensorflow/lite/Interpreter;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/core/extraction/docfinder/classifier/Classifier;->getImgData()Ljava/nio/ByteBuffer;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    filled-new-array {v2}, [Ljava/nio/ByteBuffer;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    iget-object v3, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->classificationResultMap:Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Lorg/tensorflow/lite/Interpreter;->runForMultipleInputsOutputs([Ljava/lang/Object;Ljava/util/Map;)V

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v1

    .line 22
    goto :goto_2

    .line 23
    .line 24
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->labelsMap:Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    move-result v2

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v4, ": "

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v2}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getHighestConfidenceLabelFor(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    move-result-object v4

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v4, "; conf: "

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v2}, Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifier;->getHighestConfidenceValueFor(Ljava/lang/String;)F

    .line 73
    move-result v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v2}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :goto_2
    const-string v2, "Error on running inference"

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v2, v1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    :cond_1
    return-void
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
.end method
