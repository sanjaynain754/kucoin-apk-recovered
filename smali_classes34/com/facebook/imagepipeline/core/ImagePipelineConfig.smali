.class public final Lcom/facebook/imagepipeline/core/ImagePipelineConfig;
.super Ljava/lang/Object;
.source "ImagePipelineConfig.kt"

# interfaces
.implements Ls5/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;,
        Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;,
        Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00bb\u00012\u00020\u0001:\u0004\u000e\u0007\u00bc\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0017R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R\u001a\u0010\'\u001a\u00020\"8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R \u00107\u001a\u0008\u0012\u0004\u0012\u0002040\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00085\u0010\u000f\u001a\u0004\u00086\u0010\u0011R \u00109\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u0010\u000f\u001a\u0004\u0008/\u0010\u0011R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u001a\u0010D\u001a\u00020@8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008;\u0010CR\u001c\u0010I\u001a\u0004\u0018\u00010E8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008)\u0010HR\u001c\u0010O\u001a\u0004\u0018\u00010J8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR \u0010S\u001a\u0008\u0012\u0004\u0012\u00020P0\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008Q\u0010\u000f\u001a\u0004\u0008R\u0010\u0011R\"\u0010[\u001a\u0004\u0018\u00010T8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008U\u0010V\u0012\u0004\u0008Y\u0010Z\u001a\u0004\u0008W\u0010XR \u0010]\u001a\u0008\u0012\u0004\u0012\u00020P0\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\\\u0010\u000f\u001a\u0004\u0008A\u0010\u0011R\u001a\u0010a\u001a\u00020^8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010_\u001a\u0004\u0008U\u0010`R\u001a\u0010e\u001a\u00020b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010c\u001a\u0004\u0008F\u0010dR \u0010k\u001a\u00020T8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008f\u0010g\u0012\u0004\u0008j\u0010Z\u001a\u0004\u0008h\u0010iR\u001e\u0010p\u001a\u0006\u0012\u0002\u0008\u00030l8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008m\u0010n\u001a\u0004\u0008Q\u0010oR\u0014\u0010q\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010gR\u001c\u0010v\u001a\u0004\u0018\u00010r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008M\u0010s\u001a\u0004\u0008t\u0010uR\u001a\u0010{\u001a\u00020w8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008x\u0010y\u001a\u0004\u00085\u0010zR\u001a\u0010\u007f\u001a\u00020|8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010}\u001a\u0004\u0008\u0014\u0010~R%\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0016X\u0096\u0004\u00a2\u0006\u000e\n\u0005\u0008h\u0010\u0082\u0001\u001a\u0005\u0008\\\u0010\u0083\u0001R%\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0080\u00018\u0016X\u0096\u0004\u00a2\u0006\u000e\n\u0005\u00086\u0010\u0082\u0001\u001a\u0005\u0008\u0007\u0010\u0083\u0001R\'\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0080\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0088\u0001\u0010\u0082\u0001\u001a\u0006\u0008\u0089\u0001\u0010\u0083\u0001R\u001e\u0010\u008e\u0001\u001a\u00020P8\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008%\u0010\u008b\u0001\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u00020^8\u0016X\u0096\u0004\u00a2\u0006\r\n\u0005\u0008\u008c\u0001\u0010_\u001a\u0004\u0008f\u0010`R!\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0006\u0008\u0089\u0001\u0010\u0091\u0001\u001a\u0005\u0008x\u0010\u0092\u0001R\u001e\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0016X\u0096\u0004\u00a2\u0006\u000e\n\u0005\u00081\u0010\u0095\u0001\u001a\u0005\u0008K\u0010\u0096\u0001R\u001e\u0010\u0099\u0001\u001a\u00020P8\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0006\u0008\u0098\u0001\u0010\u008b\u0001\u001a\u0005\u0008#\u0010\u008d\u0001R\u001e\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0016X\u0096\u0004\u00a2\u0006\u000e\n\u0005\u0008=\u0010\u009b\u0001\u001a\u0005\u00088\u0010\u009c\u0001R.\u0010\u00a3\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030\u009f\u0001\u0018\u00010\u009e\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008g\u0010\u00a0\u0001\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R.\u0010\u00a6\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030\u00a4\u0001\u0018\u00010\u009e\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0006\u0008\u00a5\u0001\u0010\u00a0\u0001\u001a\u0005\u0008\u000e\u0010\u00a2\u0001R!\u0010\u00ab\u0001\u001a\u0005\u0018\u00010\u00a7\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001\u001a\u0005\u0008m\u0010\u00aa\u0001R \u0010\u00b0\u0001\u001a\u00030\u00ac\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\u001a\u0006\u0008\u0088\u0001\u0010\u00af\u0001R.\u0010\u00b6\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u00b2\u0001\u0012\u0004\u0012\u00020^\u0018\u00010\u00b1\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001\u001a\u0005\u0008\u0019\u0010\u00b5\u0001R\"\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00b7\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001\u001a\u0006\u0008\u0098\u0001\u0010\u00ba\u0001\u00a8\u0006\u00bd\u0001"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;",
        "Ls5/r;",
        "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;",
        "builder",
        "<init>",
        "(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V",
        "Landroid/graphics/Bitmap$Config;",
        "a",
        "Landroid/graphics/Bitmap$Config;",
        "getBitmapConfig",
        "()Landroid/graphics/Bitmap$Config;",
        "bitmapConfig",
        "Lw3/k;",
        "Lq5/q;",
        "b",
        "Lw3/k;",
        "y",
        "()Lw3/k;",
        "bitmapMemoryCacheParamsSupplier",
        "Lcom/facebook/imagepipeline/cache/f$a;",
        "c",
        "Lcom/facebook/imagepipeline/cache/f$a;",
        "s",
        "()Lcom/facebook/imagepipeline/cache/f$a;",
        "bitmapMemoryCacheTrimStrategy",
        "d",
        "r",
        "encodedMemoryCacheTrimStrategy",
        "Lcom/facebook/imagepipeline/cache/c$b;",
        "Lq3/a;",
        "e",
        "Lcom/facebook/imagepipeline/cache/c$b;",
        "()Lcom/facebook/imagepipeline/cache/c$b;",
        "bitmapMemoryCacheEntryStateObserver",
        "Lq5/h;",
        "f",
        "Lq5/h;",
        "C",
        "()Lq5/h;",
        "cacheKeyFactory",
        "Landroid/content/Context;",
        "g",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "context",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "h",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "F",
        "()Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "downsampleMode",
        "Ls5/b;",
        "i",
        "A",
        "diskCachesStoreSupplier",
        "j",
        "encodedMemoryCacheParamsSupplier",
        "Ls5/n;",
        "k",
        "Ls5/n;",
        "H",
        "()Ls5/n;",
        "executorSupplier",
        "Lq5/n;",
        "l",
        "Lq5/n;",
        "()Lq5/n;",
        "imageCacheStatsTracker",
        "Lv5/b;",
        "m",
        "Lv5/b;",
        "()Lv5/b;",
        "imageDecoder",
        "Le6/d;",
        "n",
        "Le6/d;",
        "w",
        "()Le6/d;",
        "imageTranscoderFactory",
        "",
        "o",
        "getEnableEncodedImageColorSpaceUsage",
        "enableEncodedImageColorSpaceUsage",
        "",
        "p",
        "Ljava/lang/Integer;",
        "v",
        "()Ljava/lang/Integer;",
        "getImageTranscoderType$annotations",
        "()V",
        "imageTranscoderType",
        "q",
        "isPrefetchEnabledSupplier",
        "Lr3/b;",
        "Lr3/b;",
        "()Lr3/b;",
        "mainDiskCacheConfig",
        "Lz3/d;",
        "Lz3/d;",
        "()Lz3/d;",
        "memoryTrimmableRegistry",
        "t",
        "I",
        "z",
        "()I",
        "getMemoryChunkType$annotations",
        "memoryChunkType",
        "Lcom/facebook/imagepipeline/producers/p0;",
        "u",
        "Lcom/facebook/imagepipeline/producers/p0;",
        "()Lcom/facebook/imagepipeline/producers/p0;",
        "networkFetcher",
        "httpNetworkTimeout",
        "Lp5/c;",
        "Lp5/c;",
        "getPlatformBitmapFactory",
        "()Lp5/c;",
        "platformBitmapFactory",
        "La6/g0;",
        "x",
        "La6/g0;",
        "()La6/g0;",
        "poolFactory",
        "Lv5/e;",
        "Lv5/e;",
        "()Lv5/e;",
        "progressiveJpegConfig",
        "",
        "Lz5/d;",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "requestListeners",
        "Lz5/c;",
        "requestListener2s",
        "Lcom/facebook/imagepipeline/producers/n;",
        "B",
        "E",
        "customProducerSequenceFactories",
        "Z",
        "D",
        "()Z",
        "isResizeAndRotateEnabledForNetwork",
        "smallImageDiskCacheConfig",
        "Lv5/c;",
        "Lv5/c;",
        "()Lv5/c;",
        "imageDecoderConfig",
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;",
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;",
        "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;",
        "experiments",
        "G",
        "isDiskCacheEnabled",
        "Lu5/a;",
        "Lu5/a;",
        "()Lu5/a;",
        "closeableReferenceLeakTracker",
        "Lcom/facebook/imagepipeline/cache/f;",
        "Lx5/e;",
        "Lcom/facebook/imagepipeline/cache/f;",
        "getBitmapCacheOverride",
        "()Lcom/facebook/imagepipeline/cache/f;",
        "bitmapCacheOverride",
        "Lcom/facebook/common/memory/PooledByteBuffer;",
        "J",
        "encodedMemoryCacheOverride",
        "Lu3/g;",
        "K",
        "Lu3/g;",
        "()Lu3/g;",
        "executorServiceForAnimatedImages",
        "Lcom/facebook/imagepipeline/cache/a;",
        "L",
        "Lcom/facebook/imagepipeline/cache/a;",
        "()Lcom/facebook/imagepipeline/cache/a;",
        "bitmapMemoryCacheFactory",
        "",
        "",
        "M",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "dynamicDiskCacheConfigMap",
        "Ls3/a;",
        "callerContextVerifier",
        "Ls3/a;",
        "()Ls3/a;",
        "N",
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
        "SMAP\nImagePipelineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,577:1\n40#2,9:578\n*S KotlinDebug\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig\n*L\n159#1:578,9\n*E\n"
    }
.end annotation


# static fields
.field public static final N:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static O:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lz5/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final B:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/facebook/imagepipeline/producers/n;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final C:Z

.field public final D:Lr3/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final E:Lv5/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final F:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final G:Z

.field public final H:Lu5/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final I:Lcom/facebook/imagepipeline/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final J:Lcom/facebook/imagepipeline/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lcom/facebook/common/memory/PooledByteBuffer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final K:Lu3/g;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final L:Lcom/facebook/imagepipeline/cache/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final M:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lr3/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final a:Landroid/graphics/Bitmap$Config;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Lq5/q;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/facebook/imagepipeline/cache/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/facebook/imagepipeline/cache/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/facebook/imagepipeline/cache/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/c$b<",
            "Lq3/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Lq5/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/facebook/imagepipeline/core/DownsampleMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ls5/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Lq5/q;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Ls5/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lq5/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lv5/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final n:Le6/d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final o:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final q:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r:Lr3/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s:Lz3/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:I

.field public final u:Lcom/facebook/imagepipeline/producers/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/p0<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final v:I

.field public final w:Lp5/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final x:La6/g0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final y:Lv5/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final z:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lz5/d;",
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
    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->N:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;

    .line 9
    .line 10
    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;-><init>()V

    .line 14
    .line 15
    sput-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->O:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public constructor <init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Ld6/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    const-string v0, "ImagePipelineConfig()"

    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->v()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->a()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->F:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    .line 6
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->f()Lw3/k;

    move-result-object v0

    const-string v1, "Required value was null."

    if-nez v0, :cond_2

    .line 7
    new-instance v0, Lq5/j;

    .line 8
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->k()Landroid/content/Context;

    move-result-object v2

    const-string v3, "activity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/app/ActivityManager;

    .line 9
    invoke-direct {v0, v2}, Lq5/j;-><init>(Landroid/app/ActivityManager;)V

    goto :goto_0

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_2
    :goto_0
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->b:Lw3/k;

    .line 12
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->g()Lcom/facebook/imagepipeline/cache/f$a;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/facebook/imagepipeline/cache/BitmapMemoryCacheTrimStrategy;

    invoke-direct {v0}, Lcom/facebook/imagepipeline/cache/BitmapMemoryCacheTrimStrategy;-><init>()V

    .line 13
    :cond_3
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->c:Lcom/facebook/imagepipeline/cache/f$a;

    .line 14
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->t()Lcom/facebook/imagepipeline/cache/f$a;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v0, Lcom/facebook/imagepipeline/cache/g;

    invoke-direct {v0}, Lcom/facebook/imagepipeline/cache/g;-><init>()V

    .line 15
    :cond_4
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->d:Lcom/facebook/imagepipeline/cache/f$a;

    .line 16
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->d()Lcom/facebook/imagepipeline/cache/c$b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->e:Lcom/facebook/imagepipeline/cache/c$b;

    .line 17
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->b()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-nez v0, :cond_5

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_5
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->a:Landroid/graphics/Bitmap$Config;

    .line 18
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->h()Lq5/h;

    move-result-object v0

    const-string v2, "getInstance(...)"

    if-nez v0, :cond_6

    invoke-static {}, Lq5/k;->f()Lq5/k;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->f:Lq5/h;

    .line 19
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->k()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1d

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->g:Landroid/content/Context;

    .line 20
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->o()Lcom/facebook/imagepipeline/core/DownsampleMode;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->h:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 21
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->s()Lw3/k;

    move-result-object v0

    if-nez v0, :cond_7

    new-instance v0, Lq5/l;

    invoke-direct {v0}, Lq5/l;-><init>()V

    .line 22
    :cond_7
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->j:Lw3/k;

    .line 23
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->y()Lq5/n;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-static {}, Lq5/s;->o()Lq5/s;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    :cond_8
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->l:Lq5/n;

    .line 25
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->z()Lv5/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->m:Lv5/b;

    .line 26
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->q()Lw3/k;

    move-result-object v0

    if-nez v0, :cond_9

    sget-object v0, Lw3/l;->b:Lw3/k;

    const-string v1, "BOOLEAN_FALSE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    :cond_9
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->o:Lw3/k;

    .line 28
    sget-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->N:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;

    invoke-static {v0, p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;->access$getImageTranscoderFactory(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)Le6/d;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->n:Le6/d;

    .line 29
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->C()Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->p:Ljava/lang/Integer;

    .line 30
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->P()Lw3/k;

    move-result-object v1

    if-nez v1, :cond_a

    sget-object v1, Lw3/l;->a:Lw3/k;

    const-string v3, "BOOLEAN_TRUE"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->q:Lw3/k;

    .line 31
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->D()Lr3/b;

    move-result-object v1

    if-nez v1, :cond_b

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->k()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;->access$getDefaultMainDiskCacheConfig(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;Landroid/content/Context;)Lr3/b;

    move-result-object v1

    .line 32
    :cond_b
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->r:Lr3/b;

    .line 33
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->F()Lz3/d;

    move-result-object v1

    if-nez v1, :cond_c

    invoke-static {}, Lz3/e;->b()Lz3/e;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    :cond_c
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->s:Lz3/d;

    .line 35
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;->access$getMemoryChunkType(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;)I

    move-result v1

    iput v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->t:I

    .line 36
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->x()I

    move-result v1

    if-gez v1, :cond_d

    const/16 v1, 0x7530

    goto :goto_1

    .line 37
    :cond_d
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->x()I

    move-result v1

    .line 38
    :goto_1
    iput v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->v:I

    .line 39
    invoke-static {}, Ld6/b;->d()Z

    move-result v2

    if-nez v2, :cond_e

    .line 40
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->G()Lcom/facebook/imagepipeline/producers/p0;

    move-result-object v2

    if-nez v2, :cond_10

    new-instance v2, Lcom/facebook/imagepipeline/producers/b0;

    invoke-direct {v2, v1}, Lcom/facebook/imagepipeline/producers/b0;-><init>(I)V

    goto :goto_3

    .line 41
    :cond_e
    const-string v2, "ImagePipelineConfig->mNetworkFetcher"

    invoke-static {v2}, Ld6/b;->a(Ljava/lang/String;)V

    .line 42
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->G()Lcom/facebook/imagepipeline/producers/p0;

    move-result-object v2

    if-nez v2, :cond_f

    new-instance v2, Lcom/facebook/imagepipeline/producers/b0;

    invoke-direct {v2, v1}, Lcom/facebook/imagepipeline/producers/b0;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    .line 43
    :cond_f
    :goto_2
    invoke-static {}, Ld6/b;->b()V

    .line 44
    :cond_10
    :goto_3
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->u:Lcom/facebook/imagepipeline/producers/p0;

    .line 45
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->H()Lp5/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->w:Lp5/c;

    .line 46
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->I()La6/g0;

    move-result-object v1

    if-nez v1, :cond_11

    new-instance v1, La6/g0;

    invoke-static {}, La6/e0;->n()La6/e0$a;

    move-result-object v2

    invoke-virtual {v2}, La6/e0$a;->m()La6/e0;

    move-result-object v2

    invoke-direct {v1, v2}, La6/g0;-><init>(La6/e0;)V

    :cond_11
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->x:La6/g0;

    .line 47
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->J()Lv5/e;

    move-result-object v1

    if-nez v1, :cond_12

    new-instance v1, Lv5/g;

    invoke-direct {v1}, Lv5/g;-><init>()V

    :cond_12
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->y:Lv5/e;

    .line 48
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->L()Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_13

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    :cond_13
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->z:Ljava/util/Set;

    .line 49
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->K()Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_14

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    :cond_14
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->A:Ljava/util/Set;

    .line 50
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->l()Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_15

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    :cond_15
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->B:Ljava/util/Set;

    .line 51
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->M()Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->C:Z

    .line 52
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->O()Lr3/b;

    move-result-object v1

    if-nez v1, :cond_16

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->p()Lr3/b;

    move-result-object v1

    :cond_16
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->D:Lr3/b;

    .line 53
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->A()Lv5/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->E:Lv5/c;

    .line 54
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->i()La6/g0;

    move-result-object v1

    invoke-virtual {v1}, La6/g0;->e()I

    move-result v1

    .line 55
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->u()Ls5/n;

    move-result-object v2

    if-nez v2, :cond_17

    new-instance v2, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;

    invoke-direct {v2, v1}, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;-><init>(I)V

    :cond_17
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->k:Ls5/n;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->m()Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->G:Z

    .line 57
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->i()Ls3/a;

    .line 58
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->j()Lu5/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->H:Lu5/a;

    .line 59
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->c()Lcom/facebook/imagepipeline/cache/f;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->I:Lcom/facebook/imagepipeline/cache/f;

    .line 60
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->e()Lcom/facebook/imagepipeline/cache/a;

    move-result-object v1

    if-nez v1, :cond_18

    new-instance v1, Lcom/facebook/imagepipeline/cache/b;

    invoke-direct {v1}, Lcom/facebook/imagepipeline/cache/b;-><init>()V

    .line 61
    :cond_18
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->L:Lcom/facebook/imagepipeline/cache/a;

    .line 62
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->r()Lcom/facebook/imagepipeline/cache/f;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->J:Lcom/facebook/imagepipeline/cache/f;

    .line 63
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->N()Lu3/g;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->K:Lu3/g;

    .line 64
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->p()Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->M:Ljava/util/Map;

    .line 65
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->n()Lw3/k;

    move-result-object v1

    if-nez v1, :cond_1a

    .line 66
    new-instance v1, Ls5/j;

    .line 67
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;->w()Ls5/o;

    move-result-object p1

    if-nez p1, :cond_19

    .line 68
    new-instance p1, Ls5/k;

    new-instance v2, Ls5/m;

    invoke-direct {v2}, Ls5/m;-><init>()V

    invoke-direct {p1, v2}, Ls5/k;-><init>(Ls5/l;)V

    .line 69
    :cond_19
    invoke-direct {v1, p1, p0}, Ls5/j;-><init>(Ls5/o;Ls5/r;)V

    .line 70
    :cond_1a
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->i:Lw3/k;

    .line 71
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->y()Le4/b;

    move-result-object p1

    if-eqz p1, :cond_1b

    .line 72
    new-instance v1, Lcom/facebook/imagepipeline/bitmaps/HoneycombBitmapCreator;

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->i()La6/g0;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/imagepipeline/bitmaps/HoneycombBitmapCreator;-><init>(La6/g0;)V

    .line 73
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

    move-result-object v2

    invoke-static {v0, p1, v2, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;->access$setWebpBitmapFactory(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;Le4/b;Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;Le4/a;)V

    .line 74
    :cond_1b
    invoke-static {}, Ld6/b;->d()Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 75
    invoke-static {}, Ld6/b;->b()V

    :cond_1c
    return-void

    .line 76
    :goto_4
    invoke-static {}, Ld6/b;->b()V

    throw p1

    .line 77
    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;-><init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V

    return-void
.end method

.method public static final synthetic I()Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->O:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

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
    .line 17
    .line 18
.end method

.method public static final synthetic J(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->O:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

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
.end method

.method public static final K()Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->N:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;->getDefaultImageRequestConfig()Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public static final L(Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->N:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;->newBuilder(Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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


# virtual methods
.method public A()Lw3/k;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->i:Lw3/k;

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
    .line 17
    .line 18
.end method

.method public B()Lcom/facebook/imagepipeline/cache/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->L:Lcom/facebook/imagepipeline/cache/a;

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
    .line 17
    .line 18
.end method

.method public C()Lq5/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->f:Lq5/h;

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
    .line 17
    .line 18
.end method

.method public D()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->C:Z

    .line 3
    return v0
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
.end method

.method public E()Ljava/util/Set;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->B:Ljava/util/Set;

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
    .line 17
    .line 18
.end method

.method public F()Lcom/facebook/imagepipeline/core/DownsampleMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->h:Lcom/facebook/imagepipeline/core/DownsampleMode;

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
    .line 17
    .line 18
.end method

.method public G()Ls3/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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
.end method

.method public H()Ls5/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->k:Ls5/n;

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
    .line 17
    .line 18
.end method

.method public a()Ljava/util/Set;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->A:Ljava/util/Set;

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
    .line 17
    .line 18
.end method

.method public b()Lcom/facebook/imagepipeline/cache/f;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->J:Lcom/facebook/imagepipeline/cache/f;

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
    .line 17
    .line 18
.end method

.method public c()Lv5/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->y:Lv5/e;

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
    .line 17
    .line 18
.end method

.method public d()Ljava/util/Map;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->M:Ljava/util/Map;

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
    .line 17
    .line 18
.end method

.method public e()Lcom/facebook/imagepipeline/cache/c$b;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->e:Lcom/facebook/imagepipeline/cache/c$b;

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
    .line 17
    .line 18
.end method

.method public f()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->G:Z

    .line 3
    return v0
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
.end method

.method public g()Lv5/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->m:Lv5/b;

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
    .line 17
    .line 18
.end method

.method public getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->g:Landroid/content/Context;

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
    .line 17
    .line 18
.end method

.method public h()Lw3/k;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->j:Lw3/k;

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
    .line 17
    .line 18
.end method

.method public i()La6/g0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->x:La6/g0;

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
    .line 17
    .line 18
.end method

.method public j()Lu5/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->H:Lu5/a;

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
    .line 17
    .line 18
.end method

.method public k()Lq5/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->l:Lq5/n;

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
    .line 17
    .line 18
.end method

.method public l()Lw3/k;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->q:Lw3/k;

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
    .line 17
    .line 18
.end method

.method public m()Lz3/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->s:Lz3/d;

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
    .line 17
    .line 18
.end method

.method public n()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->F:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;

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
    .line 17
    .line 18
.end method

.method public o()Lcom/facebook/imagepipeline/producers/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/imagepipeline/producers/p0<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->u:Lcom/facebook/imagepipeline/producers/p0;

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
    .line 17
    .line 18
.end method

.method public p()Lr3/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->r:Lr3/b;

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
    .line 17
    .line 18
.end method

.method public q()Ljava/util/Set;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->z:Ljava/util/Set;

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
    .line 17
    .line 18
.end method

.method public r()Lcom/facebook/imagepipeline/cache/f$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->d:Lcom/facebook/imagepipeline/cache/f$a;

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
    .line 17
    .line 18
.end method

.method public s()Lcom/facebook/imagepipeline/cache/f$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->c:Lcom/facebook/imagepipeline/cache/f$a;

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
    .line 17
    .line 18
.end method

.method public t()Lr3/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->D:Lr3/b;

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
    .line 17
    .line 18
.end method

.method public u()Lu3/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->K:Lu3/g;

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
    .line 17
    .line 18
.end method

.method public v()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->p:Ljava/lang/Integer;

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
    .line 17
    .line 18
.end method

.method public w()Le6/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->n:Le6/d;

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
    .line 17
    .line 18
.end method

.method public x()Lv5/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->E:Lv5/c;

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
    .line 17
    .line 18
.end method

.method public y()Lw3/k;
    .locals 1
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

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->b:Lw3/k;

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
    .line 17
    .line 18
.end method

.method public z()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->t:I

    .line 3
    return v0
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
.end method
