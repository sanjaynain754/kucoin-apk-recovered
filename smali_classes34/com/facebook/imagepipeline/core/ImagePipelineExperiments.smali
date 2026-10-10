.class public final Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;
.super Ljava/lang/Object;
.source "ImagePipelineExperiments.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;,
        Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$Companion;,
        Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$b;,
        Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\t\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 h2\u00020\u0001:\u0004\u0007\u0010\u000ciB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0008\u001a\u0004\u0008\r\u0010\nR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0008\u001a\u0004\u0008\u0016\u0010\nR\u0017\u0010\u001a\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0008\u001a\u0004\u0008\u0019\u0010\nR\u0017\u0010\u001d\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0008\u001a\u0004\u0008\u001c\u0010\nR\u0017\u0010\"\u001a\u00020\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u0015\u0010!R\u0017\u0010$\u001a\u00020\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010 \u001a\u0004\u0008\u001f\u0010!R\u0017\u0010&\u001a\u00020\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010 \u001a\u0004\u0008\u001b\u0010!R\u0017\u0010(\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u0008\u001a\u0004\u0008\u0018\u0010\nR\u0017\u0010+\u001a\u00020\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010 \u001a\u0004\u0008*\u0010!R\u0017\u0010-\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010\u0008\u001a\u0004\u0008 \u0010\nR\u0017\u0010/\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010\u0008\u001a\u0004\u0008.\u0010\nR\u0017\u00105\u001a\u0002008\u0006\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u001d\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u0006068\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R\u0017\u0010=\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010\u0008\u001a\u0004\u0008<\u0010\nR\u0017\u0010?\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010\u0008\u001a\u0004\u0008\'\u0010\nR\u001d\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u0006068\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u00108\u001a\u0004\u0008A\u0010:R\u0017\u0010E\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010\u0008\u001a\u0004\u0008D\u0010\nR\u0017\u0010H\u001a\u00020F8\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010.\u001a\u0004\u00081\u0010GR\u0017\u0010J\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010\u0008\u001a\u0004\u0008,\u0010\nR\u0017\u0010K\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0008\u001a\u0004\u0008%\u0010\nR\u0017\u0010M\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0008\u001a\u0004\u0008L\u0010\nR\u0017\u0010O\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0008\u001a\u0004\u0008N\u0010\nR\u0017\u0010Q\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0008\u001a\u0004\u0008P\u0010\nR\u0017\u0010T\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008R\u0010\u0008\u001a\u0004\u0008S\u0010\nR\u0017\u0010U\u001a\u00020\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010 \u001a\u0004\u0008I\u0010!R\u0017\u0010V\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008S\u0010\u0008\u001a\u0004\u0008\u0007\u0010\nR\u0017\u0010W\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008L\u0010\u0008\u001a\u0004\u0008)\u0010\nR\u0017\u0010X\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008P\u0010\u0008\u001a\u0004\u0008@\u0010\nR\u0017\u0010Y\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008N\u0010\u0008\u001a\u0004\u0008>\u0010\nR\u0017\u0010Z\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008D\u0010\u0008\u001a\u0004\u0008C\u0010\nR\u0017\u0010[\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010\u0008\u001a\u0004\u0008\u000c\u0010\nR\u0017\u0010\\\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010\u0008\u001a\u0004\u0008#\u0010\nR\u0017\u0010]\u001a\u00020\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010 \u001a\u0004\u0008\u0010\u0010!R\u0017\u0010_\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010\u0008\u001a\u0004\u0008^\u0010\nR\u0017\u0010c\u001a\u00020`8\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010a\u001a\u0004\u00087\u0010bR\u0019\u0010e\u001a\u0004\u0018\u00010d8\u0006\u00a2\u0006\u000c\n\u0004\u0008e\u0010f\u001a\u0004\u0008R\u0010g\u00a8\u0006j"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;",
        "",
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;",
        "builder",
        "<init>",
        "(Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;)V",
        "",
        "a",
        "Z",
        "K",
        "()Z",
        "isWebpSupportEnabled",
        "b",
        "A",
        "isDecodeCancellationEnabled",
        "Le4/b;",
        "c",
        "Le4/b;",
        "y",
        "()Le4/b;",
        "webpBitmapFactory",
        "d",
        "x",
        "useDownsamplingRatioForResizing",
        "e",
        "w",
        "useBitmapPrepareToDraw",
        "f",
        "v",
        "useBalancedAnimationStrategy",
        "",
        "g",
        "I",
        "()I",
        "animationStrategyBufferLengthMilliseconds",
        "h",
        "bitmapPrepareToDrawMinSizeBytes",
        "i",
        "bitmapPrepareToDrawMaxSizeBytes",
        "j",
        "bitmapPrepareToDrawForPrefetch",
        "k",
        "m",
        "maxBitmapDimension",
        "l",
        "isNativeCodeDisabled",
        "J",
        "isPartialImageCachingEnabled",
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;",
        "n",
        "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;",
        "p",
        "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;",
        "producerFactoryMethod",
        "Lw3/k;",
        "o",
        "Lw3/k;",
        "H",
        "()Lw3/k;",
        "isLazyDataSource",
        "G",
        "isGingerbreadDecoderEnabled",
        "q",
        "downscaleFrameToDrawableDimensions",
        "r",
        "t",
        "suppressBitmapPrefetchingSupplier",
        "s",
        "F",
        "isExperimentalThreadHandoffQueueEnabled",
        "",
        "()J",
        "memoryType",
        "u",
        "keepCancelledFetchAsLowPriority",
        "downsampleIfLargeBitmap",
        "C",
        "isEncodedCacheEnabled",
        "E",
        "isEnsureTranscoderLibraryLoaded",
        "D",
        "isEncodedMemoryCacheProbingEnabled",
        "z",
        "B",
        "isDiskCacheProbingEnabled",
        "trackedKeysSize",
        "allowDelay",
        "handOffOnUiThreadOnly",
        "shouldStoreCacheEntrySize",
        "shouldIgnoreCacheSizeMismatch",
        "shouldUseDecodingBufferHelper",
        "allowProgressiveOnPrefetch",
        "cancelDecodeOnCacheMiss",
        "animationRenderFpsLimit",
        "getPrefetchShortcutEnabled",
        "prefetchShortcutEnabled",
        "Lb6/f;",
        "Lb6/f;",
        "()Lb6/f;",
        "platformDecoderOptions",
        "Le4/b$a;",
        "webpErrorLogger",
        "Le4/b$a;",
        "()Le4/b$a;",
        "L",
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


# static fields
.field public static final L:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A:I

.field public final B:Z

.field public final C:Z

.field public final D:Z

.field public final E:Z

.field public final F:Z

.field public final G:Z

.field public final H:Z

.field public final I:I

.field public final J:Z

.field public final K:Lb6/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a:Z

.field public final b:Z

.field public final c:Le4/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:I

.field public final l:Z

.field public final m:Z

.field public final n:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
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

.field public final p:Z

.field public final q:Z

.field public final r:Lw3/k;
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

.field public final s:Z

.field public final t:J

.field public final u:Z

.field public final v:Z

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->L:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$Companion;

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

.method public constructor <init>(Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->c:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->a:Z

    .line 4
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->d:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->b:Z

    .line 5
    iget-object v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->e:Le4/b;

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->c:Le4/b;

    .line 6
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->f:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->d:Z

    .line 7
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->g:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->e:Z

    .line 8
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->h:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->f:Z

    .line 9
    iget v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->i:I

    iput v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->g:I

    .line 10
    iget v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->j:I

    iput v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->h:I

    .line 11
    iget v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->k:I

    iput v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->i:I

    .line 12
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->l:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->j:Z

    .line 13
    iget v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->m:I

    iput v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->k:I

    .line 14
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->n:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->l:Z

    .line 15
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->o:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->m:Z

    .line 16
    iget-object v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->p:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$b;

    invoke-direct {v0}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$b;-><init>()V

    :cond_0
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->n:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;

    .line 17
    iget-object v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->q:Lw3/k;

    if-nez v0, :cond_1

    sget-object v0, Lw3/l;->b:Lw3/k;

    const-string v1, "BOOLEAN_FALSE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->o:Lw3/k;

    .line 18
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->r:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->p:Z

    .line 19
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->s:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->q:Z

    .line 20
    iget-object v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->t:Lw3/k;

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->r:Lw3/k;

    .line 21
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->u:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->s:Z

    .line 22
    iget-wide v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->v:J

    iput-wide v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->t:J

    .line 23
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->w:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->u:Z

    .line 24
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->x:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->v:Z

    .line 25
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->y:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->w:Z

    .line 26
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->z:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->x:Z

    .line 27
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->A:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->y:Z

    .line 28
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->B:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->z:Z

    .line 29
    iget v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->C:I

    iput v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->A:I

    .line 30
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->H:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->G:Z

    .line 31
    iget v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->I:I

    iput v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->I:I

    .line 32
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->D:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->B:Z

    .line 33
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->E:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->C:Z

    .line 34
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->F:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->D:Z

    .line 35
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->G:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->E:Z

    .line 36
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->b:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->F:Z

    .line 37
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->J:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->H:Z

    .line 38
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->K:Z

    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->J:Z

    .line 39
    iget-object p1, p1, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;->L:Lb6/f;

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->K:Lb6/f;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;-><init>(Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;)V

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->b:Z

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

.method public final B()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->z:Z

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

.method public final C()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->w:Z

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

.method public final D()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->y:Z

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

.method public final E()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->x:Z

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

.method public final F()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->s:Z

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

.method public final G()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->p:Z

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

.method public final H()Lw3/k;
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
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->o:Lw3/k;

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

.method public final I()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->l:Z

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

.method public final J()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->m:Z

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

.method public final K()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->a:Z

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

.method public final a()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->B:Z

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

.method public final b()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->G:Z

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

.method public final c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->I:I

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

.method public final d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->g:I

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

.method public final e()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->j:Z

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

.method public final f()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->i:I

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

.method public final g()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->h:I

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

.method public final h()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->H:Z

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

.method public final i()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->v:Z

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

.method public final j()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->q:Z

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

.method public final k()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->C:Z

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

.method public final l()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->u:Z

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

.method public final m()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->k:I

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

.method public final n()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->t:J

    .line 3
    return-wide v0
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

.method public final o()Lb6/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->K:Lb6/f;

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

.method public final p()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->n:Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;

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

.method public final q()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->E:Z

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

.method public final r()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->D:Z

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

.method public final s()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->F:Z

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

.method public final t()Lw3/k;
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
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->r:Lw3/k;

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

.method public final u()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->A:I

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

.method public final v()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->f:Z

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

.method public final w()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->e:Z

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

.method public final x()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->d:Z

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

.method public final y()Le4/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;->c:Le4/b;

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

.method public final z()Le4/b$a;
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
