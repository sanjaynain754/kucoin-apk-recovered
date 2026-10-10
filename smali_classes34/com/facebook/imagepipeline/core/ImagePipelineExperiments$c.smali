.class public interface abstract Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;
.super Ljava/lang/Object;
.source "ImagePipelineExperiments.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u00e5\u0001\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00152\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u000c2\u0006\u0010*\u001a\u00020\"H&\u00a2\u0006\u0004\u0008,\u0010-\u00a8\u0006."
    }
    d2 = {
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lz3/a;",
        "byteArrayPool",
        "Lv5/b;",
        "imageDecoder",
        "Lv5/e;",
        "progressiveJpegConfig",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "downsampleMode",
        "",
        "resizeAndRotateEnabledForNetwork",
        "decodeCancellationEnabled",
        "Ls5/n;",
        "executorSupplier",
        "Lz3/h;",
        "pooledByteBufferFactory",
        "Lz3/k;",
        "pooledByteStreams",
        "Lcom/facebook/imagepipeline/cache/f;",
        "Lq3/a;",
        "Lx5/e;",
        "bitmapMemoryCache",
        "Lcom/facebook/common/memory/PooledByteBuffer;",
        "encodedMemoryCache",
        "Lw3/k;",
        "Ls5/b;",
        "diskCachesStoreSupplier",
        "Lq5/h;",
        "cacheKeyFactory",
        "Lp5/c;",
        "platformBitmapFactory",
        "",
        "bitmapPrepareToDrawMinSizeBytes",
        "bitmapPrepareToDrawMaxSizeBytes",
        "bitmapPrepareToDrawForPrefetch",
        "maxBitmapSize",
        "Ls5/a;",
        "closeableReferenceFactory",
        "keepCancelledFetchAsLowPriority",
        "trackedKeysSize",
        "Ls5/v;",
        "a",
        "(Landroid/content/Context;Lz3/a;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLs5/n;Lz3/h;Lz3/k;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lp5/c;IIZILs5/a;ZI)Ls5/v;",
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


# virtual methods
.method public abstract a(Landroid/content/Context;Lz3/a;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLs5/n;Lz3/h;Lz3/k;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lp5/c;IIZILs5/a;ZI)Ls5/v;
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lz3/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lv5/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lv5/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/facebook/imagepipeline/core/DownsampleMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ls5/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lz3/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lz3/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/facebook/imagepipeline/cache/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lcom/facebook/imagepipeline/cache/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lw3/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lq5/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lp5/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p20    # Ls5/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lz3/a;",
            "Lv5/b;",
            "Lv5/e;",
            "Lcom/facebook/imagepipeline/core/DownsampleMode;",
            "ZZ",
            "Ls5/n;",
            "Lz3/h;",
            "Lz3/k;",
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lx5/e;",
            ">;",
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;",
            "Lw3/k<",
            "Ls5/b;",
            ">;",
            "Lq5/h;",
            "Lp5/c;",
            "IIZI",
            "Ls5/a;",
            "ZI)",
            "Ls5/v;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
