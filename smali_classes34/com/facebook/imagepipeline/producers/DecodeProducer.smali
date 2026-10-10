.class public final Lcom/facebook/imagepipeline/producers/DecodeProducer;
.super Ljava/lang/Object;
.source "DecodeProducer.kt"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/DecodeProducer$Companion;,
        Lcom/facebook/imagepipeline/producers/DecodeProducer$a;,
        Lcom/facebook/imagepipeline/producers/DecodeProducer$b;,
        Lcom/facebook/imagepipeline/producers/DecodeProducer$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/v0<",
        "La4/a<",
        "Lx5/e;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008+\u0018\u0000 J2\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0004+\"\'KBw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010$\u001a\u0004\u0008%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00083\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u00106\u001a\u0004\u0008/\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u00106\u001a\u0004\u00088\u00107R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008+\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u001a\u0004\u00089\u0010FR\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010H\u001a\u0004\u0008=\u0010I\u00a8\u0006L"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/producers/DecodeProducer;",
        "Lcom/facebook/imagepipeline/producers/v0;",
        "La4/a;",
        "Lx5/e;",
        "Lz3/a;",
        "byteArrayPool",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "Lv5/b;",
        "imageDecoder",
        "Lv5/e;",
        "progressiveJpegConfig",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "downsampleMode",
        "",
        "downsampleEnabledForNetwork",
        "decodeCancellationEnabled",
        "Lx5/i;",
        "inputProducer",
        "",
        "maxBitmapDimension",
        "Ls5/a;",
        "closeableReferenceFactory",
        "Ljava/lang/Runnable;",
        "reclaimMemoryRunnable",
        "Lw3/k;",
        "recoverFromDecoderOOM",
        "<init>",
        "(Lz3/a;Ljava/util/concurrent/Executor;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLcom/facebook/imagepipeline/producers/v0;ILs5/a;Ljava/lang/Runnable;Lw3/k;)V",
        "Lcom/facebook/imagepipeline/producers/m;",
        "consumer",
        "Lcom/facebook/imagepipeline/producers/w0;",
        "context",
        "",
        "a",
        "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V",
        "Lz3/a;",
        "getByteArrayPool",
        "()Lz3/a;",
        "b",
        "Ljava/util/concurrent/Executor;",
        "f",
        "()Ljava/util/concurrent/Executor;",
        "c",
        "Lv5/b;",
        "g",
        "()Lv5/b;",
        "d",
        "Lv5/e;",
        "getProgressiveJpegConfig",
        "()Lv5/e;",
        "e",
        "Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "()Lcom/facebook/imagepipeline/core/DownsampleMode;",
        "Z",
        "()Z",
        "getDecodeCancellationEnabled",
        "h",
        "Lcom/facebook/imagepipeline/producers/v0;",
        "getInputProducer",
        "()Lcom/facebook/imagepipeline/producers/v0;",
        "i",
        "I",
        "getMaxBitmapDimension",
        "()I",
        "j",
        "Ls5/a;",
        "()Ls5/a;",
        "k",
        "Ljava/lang/Runnable;",
        "()Ljava/lang/Runnable;",
        "l",
        "Lw3/k;",
        "()Lw3/k;",
        "m",
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
        "SMAP\nDecodeProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,550:1\n40#2,9:551\n*S KotlinDebug\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer\n*L\n68#1:551,9\n*E\n"
    }
.end annotation


# static fields
.field public static final m:Lcom/facebook/imagepipeline/producers/DecodeProducer$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lz3/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lv5/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lv5/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/facebook/imagepipeline/core/DownsampleMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Z

.field public final g:Z

.field public final h:Lcom/facebook/imagepipeline/producers/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:I

.field public final j:Ls5/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Lw3/k;
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/DecodeProducer$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/DecodeProducer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->m:Lcom/facebook/imagepipeline/producers/DecodeProducer$Companion;

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

.method public constructor <init>(Lz3/a;Ljava/util/concurrent/Executor;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLcom/facebook/imagepipeline/producers/v0;ILs5/a;Ljava/lang/Runnable;Lw3/k;)V
    .locals 1
    .param p1    # Lz3/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
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
    .param p8    # Lcom/facebook/imagepipeline/producers/v0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ls5/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Lw3/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/a;",
            "Ljava/util/concurrent/Executor;",
            "Lv5/b;",
            "Lv5/e;",
            "Lcom/facebook/imagepipeline/core/DownsampleMode;",
            "ZZ",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "Lx5/i;",
            ">;I",
            "Ls5/a;",
            "Ljava/lang/Runnable;",
            "Lw3/k<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "byteArrayPool"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "executor"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "imageDecoder"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "progressiveJpegConfig"

    .line 19
    .line 20
    .line 21
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    const-string v0, "downsampleMode"

    .line 24
    .line 25
    .line 26
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    const-string v0, "inputProducer"

    .line 29
    .line 30
    .line 31
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    const-string v0, "closeableReferenceFactory"

    .line 34
    .line 35
    .line 36
    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string/jumbo v0, "recoverFromDecoderOOM"

    .line 40
    .line 41
    .line 42
    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->a:Lz3/a;

    .line 48
    .line 49
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->b:Ljava/util/concurrent/Executor;

    .line 50
    .line 51
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->c:Lv5/b;

    .line 52
    .line 53
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->d:Lv5/e;

    .line 54
    .line 55
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->e:Lcom/facebook/imagepipeline/core/DownsampleMode;

    .line 56
    .line 57
    iput-boolean p6, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->f:Z

    .line 58
    .line 59
    iput-boolean p7, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->g:Z

    .line 60
    .line 61
    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->h:Lcom/facebook/imagepipeline/producers/v0;

    .line 62
    .line 63
    iput p9, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->i:I

    .line 64
    .line 65
    iput-object p10, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->j:Ls5/a;

    .line 66
    .line 67
    iput-object p11, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->k:Ljava/lang/Runnable;

    .line 68
    .line 69
    iput-object p12, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->l:Lw3/k;

    .line 70
    return-void
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
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 10
    .param p1    # Lcom/facebook/imagepipeline/producers/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/imagepipeline/producers/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "La4/a<",
            "Lx5/e;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "consumer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "context"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ld6/b;->d()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ld4/d;->p(Landroid/net/Uri;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->s(Landroid/net/Uri;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    new-instance v1, Lcom/facebook/imagepipeline/producers/DecodeProducer$a;

    .line 43
    .line 44
    iget-boolean v5, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->g:Z

    .line 45
    .line 46
    iget v6, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->i:I

    .line 47
    move-object v2, p0

    .line 48
    move-object v3, p1

    .line 49
    move-object v4, p2

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v1 .. v6}, Lcom/facebook/imagepipeline/producers/DecodeProducer$a;-><init>(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;ZI)V

    .line 53
    move-object v3, v2

    .line 54
    move-object v5, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object v3, p0

    .line 57
    move-object v4, p1

    .line 58
    move-object v5, p2

    .line 59
    .line 60
    new-instance v6, Lv5/f;

    .line 61
    .line 62
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->a:Lz3/a;

    .line 63
    .line 64
    .line 65
    invoke-direct {v6, p1}, Lv5/f;-><init>(Lz3/a;)V

    .line 66
    .line 67
    new-instance v2, Lcom/facebook/imagepipeline/producers/DecodeProducer$b;

    .line 68
    .line 69
    iget-object v7, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->d:Lv5/e;

    .line 70
    .line 71
    iget-boolean v8, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->g:Z

    .line 72
    .line 73
    iget v9, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->i:I

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v2 .. v9}, Lcom/facebook/imagepipeline/producers/DecodeProducer$b;-><init>(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;Lv5/f;Lv5/e;ZI)V

    .line 77
    move-object v1, v2

    .line 78
    .line 79
    :goto_0
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->h:Lcom/facebook/imagepipeline/producers/v0;

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v1, v5}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 83
    return-void

    .line 84
    :cond_1
    move-object v3, p0

    .line 85
    move-object v4, p1

    .line 86
    move-object v5, p2

    .line 87
    .line 88
    const-string p1, "DecodeProducer#produceResults"

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Ld6/b;->a(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :try_start_0
    invoke-interface {v5}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 99
    move-result-object p2

    .line 100
    .line 101
    .line 102
    invoke-static {p2}, Ld4/d;->p(Landroid/net/Uri;)Z

    .line 103
    move-result p2

    .line 104
    .line 105
    if-nez p2, :cond_2

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->s(Landroid/net/Uri;)Z

    .line 113
    move-result p1

    .line 114
    .line 115
    if-nez p1, :cond_2

    .line 116
    .line 117
    new-instance v2, Lcom/facebook/imagepipeline/producers/DecodeProducer$a;

    .line 118
    .line 119
    iget-boolean v6, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->g:Z

    .line 120
    .line 121
    iget v7, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->i:I

    .line 122
    .line 123
    .line 124
    invoke-direct/range {v2 .. v7}, Lcom/facebook/imagepipeline/producers/DecodeProducer$a;-><init>(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;ZI)V

    .line 125
    goto :goto_1

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    move-object p1, v0

    .line 128
    goto :goto_2

    .line 129
    .line 130
    :cond_2
    new-instance v6, Lv5/f;

    .line 131
    .line 132
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->a:Lz3/a;

    .line 133
    .line 134
    .line 135
    invoke-direct {v6, p1}, Lv5/f;-><init>(Lz3/a;)V

    .line 136
    .line 137
    new-instance v2, Lcom/facebook/imagepipeline/producers/DecodeProducer$b;

    .line 138
    .line 139
    iget-object v7, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->d:Lv5/e;

    .line 140
    .line 141
    iget-boolean v8, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->g:Z

    .line 142
    .line 143
    iget v9, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->i:I

    .line 144
    .line 145
    .line 146
    invoke-direct/range {v2 .. v9}, Lcom/facebook/imagepipeline/producers/DecodeProducer$b;-><init>(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;Lv5/f;Lv5/e;ZI)V

    .line 147
    .line 148
    :goto_1
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/DecodeProducer;->h:Lcom/facebook/imagepipeline/producers/v0;

    .line 149
    .line 150
    .line 151
    invoke-interface {p1, v2, v5}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 152
    .line 153
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    invoke-static {}, Ld6/b;->b()V

    .line 157
    return-void

    .line 158
    .line 159
    .line 160
    :goto_2
    invoke-static {}, Ld6/b;->b()V

    .line 161
    throw p1
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

.method public final c()Ls5/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->j:Ls5/a;

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

.method public final d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->f:Z

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

.method public final e()Lcom/facebook/imagepipeline/core/DownsampleMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->e:Lcom/facebook/imagepipeline/core/DownsampleMode;

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

.method public final f()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->b:Ljava/util/concurrent/Executor;

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

.method public final g()Lv5/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->c:Lv5/b;

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

.method public final h()Ljava/lang/Runnable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->k:Ljava/lang/Runnable;

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

.method public final i()Lw3/k;
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
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/DecodeProducer;->l:Lw3/k;

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
