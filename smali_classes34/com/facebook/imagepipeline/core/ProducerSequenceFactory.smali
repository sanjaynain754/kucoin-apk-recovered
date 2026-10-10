.class public final Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;
.super Ljava/lang/Object;
.source "ProducerSequenceFactory.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010%\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008.\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0093\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0011\u001a\u00020\u0008\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0008\u0012\u0006\u0010\u0015\u001a\u00020\u0008\u0012\u0006\u0010\u0016\u001a\u00020\u0008\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010!\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J)\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001eH\u0002\u00a2\u0006\u0004\u0008%\u0010&J=\u0010*\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0(0\'H\u0002\u00a2\u0006\u0004\u0008*\u0010+J#\u0010,\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001eH\u0002\u00a2\u0006\u0004\u0008,\u0010&J#\u0010-\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001eH\u0002\u00a2\u0006\u0004\u0008-\u0010&J/\u0010.\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002\u00a2\u0006\u0004\u0008.\u0010&J7\u0010/\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0(0\'H\u0002\u00a2\u0006\u0004\u0008/\u0010+J)\u00100\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0(0\'H\u0002\u00a2\u0006\u0004\u00080\u00101J/\u00102\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002\u00a2\u0006\u0004\u00082\u0010&J/\u00103\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002\u00a2\u0006\u0004\u00083\u0010&J/\u00104\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002\u00a2\u0006\u0004\u00084\u0010&J\u001d\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u00086\u0010\"J!\u00107\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u00087\u0010\"J\u001f\u00108\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e2\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0006\u00a2\u0006\u0004\u00088\u00109J\'\u0010:\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e\u00a2\u0006\u0004\u0008:\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010BR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010\u000f\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010BR\u0014\u0010\u0010\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010BR\u0014\u0010\u0011\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0014\u0010\u0014\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010BR\u0014\u0010\u0015\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010BR\u0014\u0010\u0016\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010BR\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QRL\u0010[\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e0R8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008S\u0010T\u0012\u0004\u0008Y\u0010Z\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XRH\u0010`\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e0R8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\\\u0010T\u0012\u0004\u0008_\u0010Z\u001a\u0004\u0008]\u0010V\"\u0004\u0008^\u0010XRL\u0010e\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e0R8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008a\u0010T\u0012\u0004\u0008d\u0010Z\u001a\u0004\u0008b\u0010V\"\u0004\u0008c\u0010XR\'\u0010k\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008g\u0010h\u001a\u0004\u0008i\u0010jR-\u0010o\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0087\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008l\u0010h\u0012\u0004\u0008n\u0010Z\u001a\u0004\u0008m\u0010jR\'\u0010r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008p\u0010h\u001a\u0004\u0008q\u0010jR\'\u0010u\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008s\u0010h\u001a\u0004\u0008t\u0010jR#\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008v\u0010h\u001a\u0004\u0008w\u0010jR#\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008y\u0010h\u001a\u0004\u0008z\u0010jR!\u0010~\u001a\u0008\u0012\u0004\u0012\u00020#0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008|\u0010h\u001a\u0004\u0008}\u0010jR$\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008w\u0010h\u001a\u0004\u0008\u007f\u0010jR$\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010h\u001a\u0004\u0008|\u0010jR$\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u0010h\u001a\u0004\u0008y\u0010jR)\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\r\n\u0004\u0008}\u0010h\u001a\u0005\u0008\u0083\u0001\u0010jR*\u0010\u0087\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u0085\u0001\u0010h\u001a\u0005\u0008\u0086\u0001\u0010jR)\u0010\u0089\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\r\n\u0004\u00087\u0010h\u001a\u0005\u0008\u0088\u0001\u0010jR)\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8GX\u0086\u0084\u0002\u00a2\u0006\r\n\u0004\u00084\u0010h\u001a\u0005\u0008\u008a\u0001\u0010jR)\u0010\u008d\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\r\n\u0004\u00086\u0010h\u001a\u0005\u0008\u008c\u0001\u0010jR*\u0010\u0090\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u008e\u0001\u0010h\u001a\u0005\u0008\u008f\u0001\u0010jR*\u0010\u0091\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000e\n\u0005\u0008\u0088\u0001\u0010h\u001a\u0005\u0008\u008e\u0001\u0010jR)\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002\u00a2\u0006\r\n\u0004\u0008\u007f\u0010h\u001a\u0005\u0008\u0085\u0001\u0010j\u00a8\u0006\u0094\u0001"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;",
        "",
        "Landroid/content/ContentResolver;",
        "contentResolver",
        "Ls5/v;",
        "producerFactory",
        "Lcom/facebook/imagepipeline/producers/p0;",
        "networkFetcher",
        "",
        "resizeAndRotateEnabledForNetwork",
        "webpSupportEnabled",
        "Lcom/facebook/imagepipeline/producers/f1;",
        "threadHandoffProducerQueue",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "downsampleMode",
        "useBitmapPrepareToDraw",
        "partialImageCachingEnabled",
        "diskCacheEnabled",
        "Le6/d;",
        "imageTranscoderFactory",
        "isEncodedMemoryCacheProbingEnabled",
        "isDiskCacheProbingEnabled",
        "allowDelay",
        "",
        "Lcom/facebook/imagepipeline/producers/n;",
        "customProducerSequenceFactories",
        "<init>",
        "(Landroid/content/ContentResolver;Ls5/v;Lcom/facebook/imagepipeline/producers/p0;ZZLcom/facebook/imagepipeline/producers/f1;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZZLe6/d;ZZZLjava/util/Set;)V",
        "Lcom/facebook/imagepipeline/request/ImageRequest;",
        "imageRequest",
        "Lcom/facebook/imagepipeline/producers/v0;",
        "La4/a;",
        "Lx5/e;",
        "A",
        "(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/producers/v0;",
        "Lx5/i;",
        "inputProducer",
        "g0",
        "(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;",
        "",
        "Lcom/facebook/imagepipeline/producers/k1;",
        "thumbnailProducers",
        "h0",
        "(Lcom/facebook/imagepipeline/producers/v0;[Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;",
        "k0",
        "j0",
        "e0",
        "m0",
        "l0",
        "([Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;",
        "Q",
        "B",
        "F",
        "Ljava/lang/Void;",
        "G",
        "E",
        "i0",
        "(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;",
        "f0",
        "a",
        "Landroid/content/ContentResolver;",
        "b",
        "Ls5/v;",
        "c",
        "Lcom/facebook/imagepipeline/producers/p0;",
        "d",
        "Z",
        "e",
        "f",
        "Lcom/facebook/imagepipeline/producers/f1;",
        "g",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "h",
        "i",
        "j",
        "k",
        "Le6/d;",
        "l",
        "m",
        "n",
        "o",
        "Ljava/util/Set;",
        "",
        "p",
        "Ljava/util/Map;",
        "getPostprocessorSequences",
        "()Ljava/util/Map;",
        "setPostprocessorSequences",
        "(Ljava/util/Map;)V",
        "getPostprocessorSequences$annotations",
        "()V",
        "postprocessorSequences",
        "q",
        "getCloseableImagePrefetchSequences",
        "setCloseableImagePrefetchSequences",
        "getCloseableImagePrefetchSequences$annotations",
        "closeableImagePrefetchSequences",
        "r",
        "getBitmapPrepareSequences",
        "setBitmapPrepareSequences",
        "getBitmapPrepareSequences$annotations",
        "bitmapPrepareSequences",
        "Lcom/facebook/common/memory/PooledByteBuffer;",
        "s",
        "Lkotlin/Lazy;",
        "getNetworkFetchEncodedImageProducerSequence",
        "()Lcom/facebook/imagepipeline/producers/v0;",
        "networkFetchEncodedImageProducerSequence",
        "t",
        "getLocalFileFetchEncodedImageProducerSequence",
        "getLocalFileFetchEncodedImageProducerSequence$annotations",
        "localFileFetchEncodedImageProducerSequence",
        "u",
        "getLocalContentUriFetchEncodedImageProducerSequence",
        "localContentUriFetchEncodedImageProducerSequence",
        "v",
        "O",
        "networkFetchSequence",
        "w",
        "z",
        "backgroundNetworkFetchToEncodedMemorySequence",
        "x",
        "P",
        "networkFetchToEncodedMemoryPrefetchSequence",
        "y",
        "C",
        "commonNetworkFetchToEncodedMemorySequence",
        "J",
        "localFileFetchToEncodedMemoryPrefetchSequence",
        "backgroundLocalFileFetchToEncodeMemorySequence",
        "backgroundLocalContentUriFetchToEncodeMemorySequence",
        "K",
        "localImageFileFetchSequence",
        "D",
        "N",
        "localVideoFileFetchSequence",
        "I",
        "localContentUriFetchSequence",
        "M",
        "localThumbnailBitmapSdk29FetchSequence",
        "R",
        "qualifiedResourceFetchSequence",
        "H",
        "L",
        "localResourceFetchSequence",
        "localAssetFetchSequence",
        "dataFetchSequence",
        "Companion",
        "imagepipeline_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nProducerSequenceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProducerSequenceFactory.kt\ncom/facebook/imagepipeline/core/ProducerSequenceFactory\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,636:1\n40#2,9:637\n40#2,9:646\n40#2,2:655\n44#2,5:658\n40#2,9:663\n40#2,9:672\n40#2,9:681\n40#2,9:690\n40#2,9:699\n40#2,9:708\n40#2,9:717\n40#2,9:726\n40#2,9:735\n40#2,9:744\n40#2,9:753\n40#2,9:762\n40#2,9:771\n1#3:657\n*S KotlinDebug\n*F\n+ 1 ProducerSequenceFactory.kt\ncom/facebook/imagepipeline/core/ProducerSequenceFactory\n*L\n79#1:637,9\n167#1:646,9\n198#1:655,2\n198#1:658,5\n298#1:663,9\n483#1:672,9\n511#1:681,9\n109#1:690,9\n118#1:699,9\n129#1:708,9\n257#1:717,9\n267#1:726,9\n279#1:735,9\n289#1:744,9\n317#1:753,9\n327#1:762,9\n341#1:771,9\n*E\n"
    }
.end annotation


# static fields
.field public static final K:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final B:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final C:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final D:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final E:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final F:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final G:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final H:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final I:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final J:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a:Landroid/content/ContentResolver;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ls5/v;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/facebook/imagepipeline/producers/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/p0<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Z

.field public final e:Z

.field public final f:Lcom/facebook/imagepipeline/producers/f1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/facebook/imagepipeline/core/DownsampleMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Le6/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/facebook/imagepipeline/producers/n;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final u:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final v:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final w:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final x:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->K:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>(Landroid/content/ContentResolver;Ls5/v;Lcom/facebook/imagepipeline/producers/p0;ZZLcom/facebook/imagepipeline/producers/f1;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZZLe6/d;ZZZLjava/util/Set;)V
    .locals 1
    .param p1    # Landroid/content/ContentResolver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ls5/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/imagepipeline/producers/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/facebook/imagepipeline/producers/f1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/facebook/imagepipeline/core/DownsampleMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Le6/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Ls5/v;",
            "Lcom/facebook/imagepipeline/producers/p0<",
            "*>;ZZ",
            "Lcom/facebook/imagepipeline/producers/f1;",
            "Lcom/facebook/imagepipeline/core/DownsampleMode;",
            "ZZZ",
            "Le6/d;",
            "ZZZ",
            "Ljava/util/Set<",
            "+",
            "Lcom/facebook/imagepipeline/producers/n;",
            ">;)V"
        }
    .end annotation

    const-string v0, "contentResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "producerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkFetcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "threadHandoffProducerQueue"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downsampleMode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageTranscoderFactory"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->a:Landroid/content/ContentResolver;

    .line 3
    iput-object p2, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 4
    iput-object p3, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->c:Lcom/facebook/imagepipeline/producers/p0;

    .line 5
    iput-boolean p4, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->d:Z

    .line 6
    iput-boolean p5, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->e:Z

    .line 7
    iput-object p6, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 8
    iput-object p7, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->g:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 9
    iput-boolean p8, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->h:Z

    .line 10
    iput-boolean p9, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->i:Z

    .line 11
    iput-boolean p10, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->j:Z

    .line 12
    iput-object p11, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k:Le6/d;

    .line 13
    iput-boolean p12, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->l:Z

    .line 14
    iput-boolean p13, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->m:Z

    .line 15
    iput-boolean p14, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->n:Z

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->o:Ljava/util/Set;

    .line 17
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->p:Ljava/util/Map;

    .line 18
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->q:Ljava/util/Map;

    .line 19
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->r:Ljava/util/Map;

    .line 20
    new-instance p1, Ls5/w;

    invoke-direct {p1, p0}, Ls5/w;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->s:Lkotlin/Lazy;

    .line 21
    new-instance p1, Ls5/n0;

    invoke-direct {p1, p0}, Ls5/n0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->t:Lkotlin/Lazy;

    .line 22
    new-instance p1, Ls5/x;

    invoke-direct {p1, p0}, Ls5/x;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->u:Lkotlin/Lazy;

    .line 23
    new-instance p1, Ls5/y;

    invoke-direct {p1, p0}, Ls5/y;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->v:Lkotlin/Lazy;

    .line 24
    new-instance p1, Ls5/z;

    invoke-direct {p1, p0}, Ls5/z;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->w:Lkotlin/Lazy;

    .line 25
    new-instance p1, Ls5/a0;

    invoke-direct {p1, p0}, Ls5/a0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->x:Lkotlin/Lazy;

    .line 26
    new-instance p1, Ls5/b0;

    invoke-direct {p1, p0}, Ls5/b0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->y:Lkotlin/Lazy;

    .line 27
    new-instance p1, Ls5/c0;

    invoke-direct {p1, p0}, Ls5/c0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->z:Lkotlin/Lazy;

    .line 28
    new-instance p1, Ls5/d0;

    invoke-direct {p1, p0}, Ls5/d0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->A:Lkotlin/Lazy;

    .line 29
    new-instance p1, Ls5/e0;

    invoke-direct {p1, p0}, Ls5/e0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->B:Lkotlin/Lazy;

    .line 30
    new-instance p1, Ls5/f0;

    invoke-direct {p1, p0}, Ls5/f0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->C:Lkotlin/Lazy;

    .line 31
    new-instance p1, Ls5/g0;

    invoke-direct {p1, p0}, Ls5/g0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->D:Lkotlin/Lazy;

    .line 32
    new-instance p1, Ls5/h0;

    invoke-direct {p1, p0}, Ls5/h0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->E:Lkotlin/Lazy;

    .line 33
    new-instance p1, Ls5/i0;

    invoke-direct {p1, p0}, Ls5/i0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->F:Lkotlin/Lazy;

    .line 34
    new-instance p1, Ls5/j0;

    invoke-direct {p1, p0}, Ls5/j0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->G:Lkotlin/Lazy;

    .line 35
    new-instance p1, Ls5/k0;

    invoke-direct {p1, p0}, Ls5/k0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->H:Lkotlin/Lazy;

    .line 36
    new-instance p1, Ls5/l0;

    invoke-direct {p1, p0}, Ls5/l0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->I:Lkotlin/Lazy;

    .line 37
    new-instance p1, Ls5/m0;

    invoke-direct {p1, p0}, Ls5/m0;-><init>(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->J:Lkotlin/Lazy;

    return-void
.end method

.method public static final S(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls5/v;->q()Lcom/facebook/imagepipeline/producers/LocalAssetFetchProducer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "newLocalAssetFetchProducer(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->g0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
    .line 23
.end method

.method public static final T(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/facebook/imagepipeline/producers/a1;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->x()Lcom/facebook/imagepipeline/producers/v0;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a1;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V

    .line 22
    return-object v0

    .line 23
    .line 24
    :cond_0
    const-string v0, "ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init"

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    :try_start_0
    new-instance v0, Lcom/facebook/imagepipeline/producers/a1;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->x()Lcom/facebook/imagepipeline/producers/v0;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a1;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ld6/b;->b()V

    .line 40
    return-object v0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ld6/b;->b()V

    .line 45
    throw p0
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
.end method

.method public static final U(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls5/v;->r()Lcom/facebook/imagepipeline/producers/LocalContentUriFetchProducer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "newLocalContentUriFetchProducer(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ls5/v;->s()Lcom/facebook/imagepipeline/producers/e0;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ls5/v;->t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x2

    .line 31
    .line 32
    new-array v3, v3, [Lcom/facebook/imagepipeline/producers/k1;

    .line 33
    const/4 v4, 0x0

    .line 34
    .line 35
    aput-object v1, v3, v4

    .line 36
    const/4 v1, 0x1

    .line 37
    .line 38
    aput-object v2, v3, v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0, v3}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->h0(Lcom/facebook/imagepipeline/producers/v0;[Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 42
    move-result-object p0

    .line 43
    return-object p0
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
.end method

.method public static final V(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/facebook/imagepipeline/producers/a1;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->y()Lcom/facebook/imagepipeline/producers/v0;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a1;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V

    .line 22
    return-object v0

    .line 23
    .line 24
    :cond_0
    const-string v0, "ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init"

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    :try_start_0
    new-instance v0, Lcom/facebook/imagepipeline/producers/a1;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->y()Lcom/facebook/imagepipeline/producers/v0;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a1;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ld6/b;->b()V

    .line 40
    return-object v0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ld6/b;->b()V

    .line 45
    throw p0
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
.end method

.method public static final W(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/e1;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->y()Lcom/facebook/imagepipeline/producers/v0;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ls5/v;->E(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/e1;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_0
    const-string v0, "ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init"

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->y()Lcom/facebook/imagepipeline/producers/v0;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ls5/v;->E(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/e1;

    .line 38
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ld6/b;->b()V

    .line 42
    return-object p0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ld6/b;->b()V

    .line 47
    throw p0
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
.end method

.method public static final X(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls5/v;->u()Lcom/facebook/imagepipeline/producers/LocalFileFetchProducer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "newLocalFileFetchProducer(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->g0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
    .line 23
.end method

.method public static final Y(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls5/v;->v()Lcom/facebook/imagepipeline/producers/LocalResourceFetchProducer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "newLocalResourceFetchProducer(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->g0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
    .line 23
.end method

.method public static final Z(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x1d

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ls5/v;->w()Lcom/facebook/imagepipeline/producers/k0;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const-string v1, "newLocalThumbnailBitmapSdk29Producer(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->e0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_0
    new-instance p0, Ljava/lang/Throwable;

    .line 31
    .line 32
    const-string v0, "Unreachable exception. Just to make linter happy for the lazy block."

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 36
    throw p0
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
.end method

.method public static synthetic a(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->n0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static final a0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls5/v;->x()Lcom/facebook/imagepipeline/producers/l0;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "newLocalVideoThumbnailProducer(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->e0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
    .line 23
.end method

.method public static synthetic b(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->u(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static final b0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/facebook/imagepipeline/producers/a1;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->z()Lcom/facebook/imagepipeline/producers/v0;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a1;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V

    .line 22
    return-object v0

    .line 23
    .line 24
    :cond_0
    const-string v0, "ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init"

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    :try_start_0
    new-instance v0, Lcom/facebook/imagepipeline/producers/a1;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->z()Lcom/facebook/imagepipeline/producers/v0;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/a1;-><init>(Lcom/facebook/imagepipeline/producers/v0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ld6/b;->b()V

    .line 40
    return-object v0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ld6/b;->b()V

    .line 45
    throw p0
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
.end method

.method public static synthetic c(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->s(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static final c0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->C()Lcom/facebook/imagepipeline/producers/v0;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    const-string v0, "ProducerSequenceFactory#getNetworkFetchSequence:init"

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->C()Lcom/facebook/imagepipeline/producers/v0;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 34
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ld6/b;->b()V

    .line 38
    return-object p0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ld6/b;->b()V

    .line 43
    throw p0
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
.end method

.method public static synthetic d(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->w(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static final d0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/e1;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->z()Lcom/facebook/imagepipeline/producers/v0;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ls5/v;->E(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/e1;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_0
    const-string v0, "ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence"

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->z()Lcom/facebook/imagepipeline/producers/v0;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ls5/v;->E(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/e1;

    .line 38
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ld6/b;->b()V

    .line 42
    return-object p0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ld6/b;->b()V

    .line 47
    throw p0
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
.end method

.method public static synthetic e(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;

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
.end method

.method public static synthetic f(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/e1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->d0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/e1;

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
.end method

.method public static synthetic g(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->U(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic h(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->Z(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic i(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->T(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;

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
.end method

.method public static synthetic j(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->t(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic k(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->v(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic l(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->X(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic m(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->S(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic n(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/e1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->W(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/e1;

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
.end method

.method public static final n0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls5/v;->C()Lcom/facebook/imagepipeline/producers/QualifiedResourceFetchProducer;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "newQualifiedResourceFetchProducer(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->g0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
    .line 23
.end method

.method public static synthetic o(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->a0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic p(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->V(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/a1;

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
.end method

.method public static synthetic q(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->Y(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static synthetic r(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->c0(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;

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
.end method

.method public static final s(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    const-string v1, "newLocalContentUriFetchProducer(...)"

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ls5/v;->r()Lcom/facebook/imagepipeline/producers/LocalContentUriFetchProducer;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 30
    .line 31
    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0, p0}, Ls5/v;->b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    .line 38
    :cond_0
    const-string v0, "ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init"

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ls5/v;->r()Lcom/facebook/imagepipeline/producers/LocalContentUriFetchProducer;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0, p0}, Ls5/v;->b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 62
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ld6/b;->b()V

    .line 66
    return-object p0

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ld6/b;->b()V

    .line 71
    throw p0
    .line 72
.end method

.method public static final t(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    const-string v1, "newLocalFileFetchProducer(...)"

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ls5/v;->u()Lcom/facebook/imagepipeline/producers/LocalFileFetchProducer;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 30
    .line 31
    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0, p0}, Ls5/v;->b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    .line 38
    :cond_0
    const-string v0, "ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence"

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ls5/v;->u()Lcom/facebook/imagepipeline/producers/LocalFileFetchProducer;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0, p0}, Ls5/v;->b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 62
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ld6/b;->b()V

    .line 66
    return-object p0

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ld6/b;->b()V

    .line 71
    throw p0
    .line 72
.end method

.method public static final u(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->C()Lcom/facebook/imagepipeline/producers/v0;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Ls5/v;->b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_0
    const-string v0, "ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init"

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->C()Lcom/facebook/imagepipeline/producers/v0;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, p0}, Ls5/v;->b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 42
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-static {}, Ld6/b;->b()V

    .line 46
    return-object p0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ld6/b;->b()V

    .line 51
    throw p0
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
.end method

.method public static final v(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ld6/b;->d()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->c:Lcom/facebook/imagepipeline/producers/p0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->i0(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    .line 21
    :cond_0
    const-string v0, "ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence"

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->c:Lcom/facebook/imagepipeline/producers/p0;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->i0(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 30
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ld6/b;->b()V

    .line 34
    return-object p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ld6/b;->b()V

    .line 39
    throw p0
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
.end method

.method public static final w(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls5/v;->i()Lcom/facebook/imagepipeline/producers/o;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "newDataFetchProducer(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ls5/v;->a(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/a;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 24
    const/4 v2, 0x1

    .line 25
    .line 26
    iget-object v3, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k:Le6/d;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0, v2, v3}, Ls5/v;->D(Lcom/facebook/imagepipeline/producers/v0;ZLe6/d;)Lcom/facebook/imagepipeline/producers/b1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 34
    move-result-object p0

    .line 35
    return-object p0
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
.end method


# virtual methods
.method public final A(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/request/ImageRequest;",
            ")",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "Unsupported uri scheme! Uri is: "

    .line 7
    .line 8
    const-string v2, "Uri is null."

    .line 9
    .line 10
    const-string v3, "getSourceUri(...)"

    .line 11
    .line 12
    if-nez v0, :cond_8

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    if-eqz v0, :cond_7

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUriType()I

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_6

    .line 28
    .line 29
    .line 30
    packed-switch v2, :pswitch_data_0

    .line 31
    .line 32
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->o:Ljava/util/Set;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    move-result v3

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    move-result-object v3

    .line 49
    move-object v4, v3

    .line 50
    .line 51
    check-cast v4, Lcom/facebook/imagepipeline/producers/n;

    .line 52
    .line 53
    iget-object v7, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 54
    .line 55
    iget-object v8, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 56
    .line 57
    iget-boolean v9, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->l:Z

    .line 58
    .line 59
    iget-boolean v10, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->m:Z

    .line 60
    move-object v6, p0

    .line 61
    move-object v5, p1

    .line 62
    .line 63
    .line 64
    invoke-virtual/range {v4 .. v10}, Lcom/facebook/imagepipeline/producers/n;->b(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;Ls5/v;Lcom/facebook/imagepipeline/producers/f1;ZZ)Lcom/facebook/imagepipeline/producers/v0;

    .line 65
    move-result-object p1

    .line 66
    move-object v4, v5

    .line 67
    move-object v5, v6

    .line 68
    .line 69
    if-eqz p1, :cond_0

    .line 70
    return-object p1

    .line 71
    :cond_0
    move-object p1, v4

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object v5, p0

    .line 74
    .line 75
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    sget-object v2, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->K:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;->access$getShortenedUriString(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;Landroid/net/Uri;)Ljava/lang/String;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    throw p1

    .line 101
    :pswitch_0
    move-object v5, p0

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->R()Lcom/facebook/imagepipeline/producers/v0;

    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :pswitch_1
    move-object v5, p0

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->D()Lcom/facebook/imagepipeline/producers/v0;

    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :pswitch_2
    move-object v5, p0

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->L()Lcom/facebook/imagepipeline/producers/v0;

    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    :pswitch_3
    move-object v5, p0

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->H()Lcom/facebook/imagepipeline/producers/v0;

    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :pswitch_4
    move-object v5, p0

    .line 126
    move-object v4, p1

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getLoadThumbnailOnlyForAndroidSdkAboveQ()Z

    .line 130
    move-result p1

    .line 131
    .line 132
    if-eqz p1, :cond_2

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->M()Lcom/facebook/imagepipeline/producers/v0;

    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    .line 139
    :cond_2
    iget-object p1, v5, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->a:Landroid/content/ContentResolver;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, Ly3/a;->c(Ljava/lang/String;)Z

    .line 147
    move-result p1

    .line 148
    .line 149
    if-eqz p1, :cond_3

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->N()Lcom/facebook/imagepipeline/producers/v0;

    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    .line 156
    .line 157
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->I()Lcom/facebook/imagepipeline/producers/v0;

    .line 158
    move-result-object p1

    .line 159
    return-object p1

    .line 160
    :pswitch_5
    move-object v5, p0

    .line 161
    move-object v4, p1

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getLoadThumbnailOnlyForAndroidSdkAboveQ()Z

    .line 165
    move-result p1

    .line 166
    .line 167
    if-eqz p1, :cond_4

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->M()Lcom/facebook/imagepipeline/producers/v0;

    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    .line 174
    .line 175
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->K()Lcom/facebook/imagepipeline/producers/v0;

    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    :pswitch_6
    move-object v5, p0

    .line 179
    move-object v4, p1

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getLoadThumbnailOnlyForAndroidSdkAboveQ()Z

    .line 183
    move-result p1

    .line 184
    .line 185
    if-eqz p1, :cond_5

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->M()Lcom/facebook/imagepipeline/producers/v0;

    .line 189
    move-result-object p1

    .line 190
    return-object p1

    .line 191
    .line 192
    .line 193
    :cond_5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->N()Lcom/facebook/imagepipeline/producers/v0;

    .line 194
    move-result-object p1

    .line 195
    return-object p1

    .line 196
    :cond_6
    move-object v5, p0

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->O()Lcom/facebook/imagepipeline/producers/v0;

    .line 200
    move-result-object p1

    .line 201
    return-object p1

    .line 202
    :cond_7
    move-object v5, p0

    .line 203
    .line 204
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 205
    .line 206
    .line 207
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 208
    throw p1

    .line 209
    :cond_8
    move-object v5, p0

    .line 210
    move-object v4, p1

    .line 211
    .line 212
    const-string p1, "ProducerSequenceFactory#getBasicDecodedImageSequence"

    .line 213
    .line 214
    .line 215
    invoke-static {p1}, Ld6/b;->a(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :try_start_0
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    .line 222
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    if-eqz p1, :cond_10

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUriType()I

    .line 228
    move-result v0

    .line 229
    .line 230
    if-eqz v0, :cond_f

    .line 231
    .line 232
    .line 233
    packed-switch v0, :pswitch_data_1

    .line 234
    .line 235
    iget-object v0, v5, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->o:Ljava/util/Set;

    .line 236
    .line 237
    if-eqz v0, :cond_a

    .line 238
    .line 239
    .line 240
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 241
    move-result-object v0

    .line 242
    .line 243
    .line 244
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    move-result v2

    .line 246
    .line 247
    if-eqz v2, :cond_a

    .line 248
    .line 249
    .line 250
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    move-result-object v2

    .line 252
    move-object v3, v2

    .line 253
    .line 254
    check-cast v3, Lcom/facebook/imagepipeline/producers/n;

    .line 255
    .line 256
    iget-object v6, v5, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 257
    .line 258
    iget-object v7, v5, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 259
    .line 260
    iget-boolean v8, v5, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->l:Z

    .line 261
    .line 262
    iget-boolean v9, v5, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->m:Z

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v3 .. v9}, Lcom/facebook/imagepipeline/producers/n;->b(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;Ls5/v;Lcom/facebook/imagepipeline/producers/f1;ZZ)Lcom/facebook/imagepipeline/producers/v0;

    .line 266
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 267
    .line 268
    if-eqz v2, :cond_9

    .line 269
    .line 270
    .line 271
    invoke-static {}, Ld6/b;->b()V

    .line 272
    return-object v2

    .line 273
    :catchall_0
    move-exception v0

    .line 274
    move-object p1, v0

    .line 275
    .line 276
    goto/16 :goto_2

    .line 277
    .line 278
    :cond_a
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 279
    .line 280
    sget-object v2, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->K:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;

    .line 281
    .line 282
    .line 283
    invoke-static {v2, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;->access$getShortenedUriString(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;Landroid/net/Uri;)Ljava/lang/String;

    .line 284
    move-result-object p1

    .line 285
    .line 286
    new-instance v2, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    move-result-object p1

    .line 300
    .line 301
    .line 302
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 303
    throw v0

    .line 304
    .line 305
    .line 306
    :pswitch_7
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->R()Lcom/facebook/imagepipeline/producers/v0;

    .line 307
    move-result-object p1

    .line 308
    goto :goto_1

    .line 309
    .line 310
    .line 311
    :pswitch_8
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->D()Lcom/facebook/imagepipeline/producers/v0;

    .line 312
    move-result-object p1

    .line 313
    goto :goto_1

    .line 314
    .line 315
    .line 316
    :pswitch_9
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->L()Lcom/facebook/imagepipeline/producers/v0;

    .line 317
    move-result-object p1

    .line 318
    goto :goto_1

    .line 319
    .line 320
    .line 321
    :pswitch_a
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->H()Lcom/facebook/imagepipeline/producers/v0;

    .line 322
    move-result-object p1

    .line 323
    goto :goto_1

    .line 324
    .line 325
    .line 326
    :pswitch_b
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getLoadThumbnailOnlyForAndroidSdkAboveQ()Z

    .line 327
    move-result v0

    .line 328
    .line 329
    if-eqz v0, :cond_b

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->M()Lcom/facebook/imagepipeline/producers/v0;

    .line 333
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 334
    .line 335
    .line 336
    invoke-static {}, Ld6/b;->b()V

    .line 337
    return-object p1

    .line 338
    .line 339
    :cond_b
    :try_start_2
    iget-object v0, v5, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->a:Landroid/content/ContentResolver;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 343
    move-result-object p1

    .line 344
    .line 345
    .line 346
    invoke-static {p1}, Ly3/a;->c(Ljava/lang/String;)Z

    .line 347
    move-result p1

    .line 348
    .line 349
    if-eqz p1, :cond_c

    .line 350
    .line 351
    .line 352
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->N()Lcom/facebook/imagepipeline/producers/v0;

    .line 353
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 354
    .line 355
    .line 356
    invoke-static {}, Ld6/b;->b()V

    .line 357
    return-object p1

    .line 358
    .line 359
    .line 360
    :cond_c
    :try_start_3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->I()Lcom/facebook/imagepipeline/producers/v0;

    .line 361
    move-result-object p1

    .line 362
    goto :goto_1

    .line 363
    .line 364
    .line 365
    :pswitch_c
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getLoadThumbnailOnlyForAndroidSdkAboveQ()Z

    .line 366
    move-result p1

    .line 367
    .line 368
    if-eqz p1, :cond_d

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->M()Lcom/facebook/imagepipeline/producers/v0;

    .line 372
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 373
    .line 374
    .line 375
    invoke-static {}, Ld6/b;->b()V

    .line 376
    return-object p1

    .line 377
    .line 378
    .line 379
    :cond_d
    :try_start_4
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->K()Lcom/facebook/imagepipeline/producers/v0;

    .line 380
    move-result-object p1

    .line 381
    goto :goto_1

    .line 382
    .line 383
    .line 384
    :pswitch_d
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/request/ImageRequest;->getLoadThumbnailOnlyForAndroidSdkAboveQ()Z

    .line 385
    move-result p1

    .line 386
    .line 387
    if-eqz p1, :cond_e

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->M()Lcom/facebook/imagepipeline/producers/v0;

    .line 391
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 392
    .line 393
    .line 394
    invoke-static {}, Ld6/b;->b()V

    .line 395
    return-object p1

    .line 396
    .line 397
    .line 398
    :cond_e
    :try_start_5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->N()Lcom/facebook/imagepipeline/producers/v0;

    .line 399
    move-result-object p1

    .line 400
    goto :goto_1

    .line 401
    .line 402
    .line 403
    :cond_f
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->O()Lcom/facebook/imagepipeline/producers/v0;

    .line 404
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 405
    .line 406
    .line 407
    :goto_1
    invoke-static {}, Ld6/b;->b()V

    .line 408
    return-object p1

    .line 409
    .line 410
    :cond_10
    :try_start_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 411
    .line 412
    .line 413
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 414
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 415
    .line 416
    .line 417
    :goto_2
    invoke-static {}, Ld6/b;->b()V

    .line 418
    throw p1

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
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
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
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method public final declared-synchronized B(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->r:Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ls5/v;->f(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/i;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->r:Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit p0

    .line 27
    return-object v0

    .line 28
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
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
.end method

.method public final C()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final D()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->J:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final E(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .param p1    # Lcom/facebook/imagepipeline/request/ImageRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/request/ImageRequest;",
            ")",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "imageRequest"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ld6/b;->d()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->A(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/producers/v0;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getPostprocessor()Lcom/facebook/imagepipeline/request/b;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->Q(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->h:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->B(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    :cond_1
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->n:Z

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getDelayMs()I

    .line 41
    move-result p1

    .line 42
    .line 43
    if-lez p1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->F(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    return-object v0

    .line 50
    .line 51
    :cond_3
    const-string v0, "ProducerSequenceFactory#getDecodedImageProducerSequence"

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->A(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/producers/v0;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getPostprocessor()Lcom/facebook/imagepipeline/request/b;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->Q(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_4
    :goto_0
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->h:Z

    .line 74
    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->B(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    :cond_5
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->n:Z

    .line 82
    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getDelayMs()I

    .line 87
    move-result p1

    .line 88
    .line 89
    if-lez p1, :cond_6

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->F(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 93
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    :cond_6
    invoke-static {}, Ld6/b;->b()V

    .line 97
    return-object v0

    .line 98
    .line 99
    .line 100
    :goto_1
    invoke-static {}, Ld6/b;->b()V

    .line 101
    throw p1
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
.end method

.method public final declared-synchronized F(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ls5/v;->k(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/r;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    const-string v0, "newDelayProducer(...)"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final G(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 3
    .param p1    # Lcom/facebook/imagepipeline/request/ImageRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/request/ImageRequest;",
            ")",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "imageRequest"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->K:Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;->access$validateEncodedImageRequest(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;Lcom/facebook/imagepipeline/request/ImageRequest;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUriType()I

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    const/4 v2, 0x2

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    const/4 v2, 0x3

    .line 21
    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    const-string v1, "getSourceUri(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;->access$getShortenedUriString(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;Landroid/net/Uri;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    const-string v2, "Unsupported uri scheme for encoded image fetch! Uri is: "

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    throw v1

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->J()Lcom/facebook/imagepipeline/producers/v0;

    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->P()Lcom/facebook/imagepipeline/producers/v0;

    .line 68
    move-result-object p1

    .line 69
    return-object p1
    .line 70
    .line 71
    .line 72
.end method

.method public final H()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->I:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final I()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->E:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final J()Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getValue(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final K()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->C:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final L()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->H:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final M()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->F:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final N()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->D:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final O()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->v:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final P()Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->x:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getValue(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final declared-synchronized Q(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->p:Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ls5/v;->B(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/t0;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "newPostprocessorProducer(...)"

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ls5/v;->A(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/s0;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->p:Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit p0

    .line 38
    return-object v0

    .line 39
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1
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
.end method

.method public final R()Lcom/facebook/imagepipeline/producers/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->G:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final e0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ls5/v;->e(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/h;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "newBitmapMemoryCacheProducer(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ls5/v;->d(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/g;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    const-string v0, "newBitmapMemoryCacheKeyMultiplexProducer(...)"

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f:Lcom/facebook/imagepipeline/producers/f1;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Ls5/v;->b(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string v0, "newBackgroundThreadHandoffProducer(...)"

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->l:Z

    .line 38
    .line 39
    const-string v1, "newBitmapMemoryCacheGetProducer(...)"

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->m:Z

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ls5/v;->c(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/BitmapMemoryCacheGetProducer;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ls5/v;->c(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/BitmapMemoryCacheGetProducer;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ls5/v;->g(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/j;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    const-string v0, "newBitmapProbeProducer(...)"

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    return-object p1
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
.end method

.method public final f0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .param p1    # Lcom/facebook/imagepipeline/producers/v0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "inputProducer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ld6/b;->d()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    const-string v1, "newDecodeProducer(...)"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ls5/v;->j(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/DecodeProducer;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->e0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_0
    const-string v0, "ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence"

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ls5/v;->j(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/DecodeProducer;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->e0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 45
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ld6/b;->b()V

    .line 49
    return-object p1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ld6/b;->b()V

    .line 54
    throw p1
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
.end method

.method public final g0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ls5/v;->t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    new-array v1, v1, [Lcom/facebook/imagepipeline/producers/k1;

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    aput-object v0, v1, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, v1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->h0(Lcom/facebook/imagepipeline/producers/v0;[Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final h0(Lcom/facebook/imagepipeline/producers/v0;[Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;[",
            "Lcom/facebook/imagepipeline/producers/k1<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->m0(Lcom/facebook/imagepipeline/producers/v0;[Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->f0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public final declared-synchronized i0(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 5
    .param p1    # Lcom/facebook/imagepipeline/producers/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/p0<",
            "*>;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
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
    const-string v0, "networkFetcher"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence"

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ld6/b;->d()Z

    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ls5/v;->y(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    const-string v0, "newNetworkFetchProducer(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Ls5/v;->a(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/a;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    const-string v0, "newAddImageTransformMetaDataProducer(...)"

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 43
    .line 44
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->d:Z

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->g:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 49
    .line 50
    sget-object v4, Lcom/facebook/imagepipeline/core/DownsampleMode;->NEVER:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 51
    .line 52
    if-eq v1, v4, :cond_0

    .line 53
    move v2, v3

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_3

    .line 57
    .line 58
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k:Le6/d;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1, v2, v1}, Ls5/v;->D(Lcom/facebook/imagepipeline/producers/v0;ZLe6/d;)Lcom/facebook/imagepipeline/producers/b1;

    .line 62
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit p0

    .line 64
    return-object p1

    .line 65
    .line 66
    .line 67
    :cond_1
    :try_start_1
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    :try_start_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ls5/v;->y(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    const-string v0, "newNetworkFetchProducer(...)"

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Ls5/v;->a(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/a;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    const-string v0, "newAddImageTransformMetaDataProducer(...)"

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 94
    .line 95
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->d:Z

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->g:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 100
    .line 101
    sget-object v4, Lcom/facebook/imagepipeline/core/DownsampleMode;->NEVER:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 102
    .line 103
    if-eq v1, v4, :cond_2

    .line 104
    move v2, v3

    .line 105
    goto :goto_1

    .line 106
    :catchall_1
    move-exception p1

    .line 107
    goto :goto_2

    .line 108
    .line 109
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k:Le6/d;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1, v2, v1}, Ls5/v;->D(Lcom/facebook/imagepipeline/producers/v0;ZLe6/d;)Lcom/facebook/imagepipeline/producers/b1;

    .line 113
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    .line 115
    .line 116
    :try_start_3
    invoke-static {}, Ld6/b;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 117
    monitor-exit p0

    .line 118
    return-object p1

    .line 119
    .line 120
    .line 121
    :goto_2
    :try_start_4
    invoke-static {}, Ld6/b;->b()V

    .line 122
    throw p1

    .line 123
    :goto_3
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 124
    throw p1
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
.end method

.method public final j0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "newDiskCacheReadProducer(...)"

    .line 7
    .line 8
    const-string v2, "newPartialDiskCacheProducer(...)"

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->i:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ls5/v;->z(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/q0;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ls5/v;->m(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/u;

    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ls5/v;->m(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/u;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ls5/v;->l(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/t;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    return-object p1

    .line 50
    .line 51
    :cond_1
    const-string v0, "ProducerSequenceFactory#newDiskCacheSequence"

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->i:Z

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ls5/v;->z(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/q0;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ls5/v;->m(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/u;

    .line 73
    move-result-object p1

    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ls5/v;->m(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/u;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 86
    .line 87
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ls5/v;->l(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/t;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    invoke-static {}, Ld6/b;->b()V

    .line 98
    return-object p1

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-static {}, Ld6/b;->b()V

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
.end method

.method public final k0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->j:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->j0(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ls5/v;->o(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    const-string v0, "newEncodedMemoryCacheProducer(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->m:Z

    .line 22
    .line 23
    const-string v1, "newEncodedCacheKeyMultiplexProducer(...)"

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ls5/v;->p(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/y;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    const-string v0, "newEncodedProbeProducer(...)"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ls5/v;->n(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/w;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    return-object p1

    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ls5/v;->n(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/w;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    return-object p1
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
.end method

.method public final l0([Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/facebook/imagepipeline/producers/k1<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ls5/v;->G([Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/j1;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "newThumbnailBranchProducer(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k:Le6/d;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2}, Ls5/v;->D(Lcom/facebook/imagepipeline/producers/v0;ZLe6/d;)Lcom/facebook/imagepipeline/producers/b1;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    const-string v0, "newResizeAndRotateProducer(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    return-object p1
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
.end method

.method public final m0(Lcom/facebook/imagepipeline/producers/v0;[Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;[",
            "Lcom/facebook/imagepipeline/producers/k1<",
            "Lx5/i;",
            ">;)",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ls5/v;->a(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/a;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "newAddImageTransformMetaDataProducer(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->k:Le6/d;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1, v2}, Ls5/v;->D(Lcom/facebook/imagepipeline/producers/v0;ZLe6/d;)Lcom/facebook/imagepipeline/producers/b1;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->b:Ls5/v;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ls5/v;->F(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/h1;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    const-string v0, "newThrottlingProducer(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->l0([Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-static {p2, p1}, Ls5/v;->h(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/k;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    const-string p2, "newBranchOnSeparateImagesProducer(...)"

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    return-object p1
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
.end method

.method public final x()Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->B:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getValue(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final y()Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->A:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getValue(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final z()Lcom/facebook/imagepipeline/producers/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;->w:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getValue(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/imagepipeline/producers/v0;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method
