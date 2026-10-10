.class public interface abstract Ls5/r;
.super Ljava/lang/Object;
.source "ImagePipelineConfigInterface.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000c\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\tR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0005R\u0014\u0010 \u001a\u00020\u001d8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0005R\u0014\u0010*\u001a\u00020\'8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u0014\u00102\u001a\u00020/8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=R\u001a\u0010@\u001a\u0008\u0012\u0004\u0012\u00020!0\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010\u0005R\u0014\u0010D\u001a\u00020A8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010CR\u0014\u0010H\u001a\u00020E8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0014\u0010K\u001a\u00020;8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010JR\u0018\u0010O\u001a\u0006\u0012\u0002\u0008\u00030L8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010NR\u0014\u0010S\u001a\u00020P8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010RR\u0014\u0010W\u001a\u00020T8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010VR\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0X8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010[R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0X8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010[R\u001a\u0010b\u001a\u0008\u0012\u0004\u0012\u00020`0X8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008a\u0010[R\u0014\u0010d\u001a\u00020!8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008c\u0010#R\u0014\u0010f\u001a\u00020A8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008e\u0010CR\u0016\u0010j\u001a\u0004\u0018\u00010g8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010iR\u0016\u0010n\u001a\u0004\u0018\u00010k8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008l\u0010mR\u0014\u0010r\u001a\u00020o8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010qR\u0014\u0010v\u001a\u00020s8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008t\u0010uR\"\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020x\u0018\u00010w8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008y\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008}\u0010~R\'\u0010\u0084\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020A\u0018\u00010\u0080\u00018&X\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u00a8\u0006\u0085\u0001"
    }
    d2 = {
        "Ls5/r;",
        "",
        "Lw3/k;",
        "Lq5/q;",
        "y",
        "()Lw3/k;",
        "bitmapMemoryCacheParamsSupplier",
        "Lcom/facebook/imagepipeline/cache/f$a;",
        "s",
        "()Lcom/facebook/imagepipeline/cache/f$a;",
        "bitmapMemoryCacheTrimStrategy",
        "r",
        "encodedMemoryCacheTrimStrategy",
        "Lcom/facebook/imagepipeline/cache/c$b;",
        "Lq3/a;",
        "e",
        "()Lcom/facebook/imagepipeline/cache/c$b;",
        "bitmapMemoryCacheEntryStateObserver",
        "Lq5/h;",
        "C",
        "()Lq5/h;",
        "cacheKeyFactory",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "context",
        "Ls5/b;",
        "A",
        "diskCachesStoreSupplier",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "F",
        "()Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "downsampleMode",
        "",
        "f",
        "()Z",
        "isDiskCacheEnabled",
        "h",
        "encodedMemoryCacheParamsSupplier",
        "Ls5/n;",
        "H",
        "()Ls5/n;",
        "executorSupplier",
        "Lu3/g;",
        "u",
        "()Lu3/g;",
        "executorServiceForAnimatedImages",
        "Lq5/n;",
        "k",
        "()Lq5/n;",
        "imageCacheStatsTracker",
        "Lv5/b;",
        "g",
        "()Lv5/b;",
        "imageDecoder",
        "Le6/d;",
        "w",
        "()Le6/d;",
        "imageTranscoderFactory",
        "",
        "v",
        "()Ljava/lang/Integer;",
        "imageTranscoderType",
        "l",
        "isPrefetchEnabledSupplier",
        "Lr3/b;",
        "p",
        "()Lr3/b;",
        "mainDiskCacheConfig",
        "Lz3/d;",
        "m",
        "()Lz3/d;",
        "memoryTrimmableRegistry",
        "z",
        "()I",
        "memoryChunkType",
        "Lcom/facebook/imagepipeline/producers/p0;",
        "o",
        "()Lcom/facebook/imagepipeline/producers/p0;",
        "networkFetcher",
        "La6/g0;",
        "i",
        "()La6/g0;",
        "poolFactory",
        "Lv5/e;",
        "c",
        "()Lv5/e;",
        "progressiveJpegConfig",
        "",
        "Lz5/d;",
        "q",
        "()Ljava/util/Set;",
        "requestListeners",
        "Lz5/c;",
        "a",
        "requestListener2s",
        "Lcom/facebook/imagepipeline/producers/n;",
        "E",
        "customProducerSequenceFactories",
        "D",
        "isResizeAndRotateEnabledForNetwork",
        "t",
        "smallImageDiskCacheConfig",
        "Lv5/c;",
        "x",
        "()Lv5/c;",
        "imageDecoderConfig",
        "Ls3/a;",
        "G",
        "()Ls3/a;",
        "callerContextVerifier",
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;",
        "n",
        "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;",
        "experiments",
        "Lu5/a;",
        "j",
        "()Lu5/a;",
        "closeableReferenceLeakTracker",
        "Lcom/facebook/imagepipeline/cache/f;",
        "Lcom/facebook/common/memory/PooledByteBuffer;",
        "b",
        "()Lcom/facebook/imagepipeline/cache/f;",
        "encodedMemoryCacheOverride",
        "Lcom/facebook/imagepipeline/cache/a;",
        "B",
        "()Lcom/facebook/imagepipeline/cache/a;",
        "bitmapMemoryCacheFactory",
        "",
        "",
        "d",
        "()Ljava/util/Map;",
        "dynamicDiskCacheConfigMap",
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
.method public abstract A()Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/k<",
            "Ls5/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract B()Lcom/facebook/imagepipeline/cache/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract C()Lq5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract D()Z
.end method

.method public abstract E()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/facebook/imagepipeline/producers/n;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract F()Lcom/facebook/imagepipeline/core/DownsampleMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract G()Ls3/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract H()Ls5/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract a()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lz5/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b()Lcom/facebook/imagepipeline/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c()Lv5/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract d()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lr3/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract e()Lcom/facebook/imagepipeline/cache/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/cache/c$b<",
            "Lq3/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract f()Z
.end method

.method public abstract g()Lv5/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getContext()Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract h()Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/k<",
            "Lq5/q;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i()La6/g0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract j()Lu5/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract k()Lq5/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract l()Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract m()Lz3/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract o()Lcom/facebook/imagepipeline/producers/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/p0<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract p()Lr3/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract q()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lz5/d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract r()Lcom/facebook/imagepipeline/cache/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract s()Lcom/facebook/imagepipeline/cache/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract t()Lr3/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract u()Lu3/g;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract v()Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract w()Le6/d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract x()Lv5/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract y()Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/k<",
            "Lq5/q;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract z()I
.end method
