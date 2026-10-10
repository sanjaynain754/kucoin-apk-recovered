.class public final Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;
.super Lcom/otaliastudios/transcoder/internal/pipeline/e;
.source "AudioEngine.kt"

# interfaces
.implements Lcom/otaliastudios/transcoder/internal/codec/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/e<",
        "Lcom/otaliastudios/transcoder/internal/codec/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/a;",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        "Lcom/otaliastudios/transcoder/internal/codec/f;",
        ">;",
        "Lcom/otaliastudios/transcoder/internal/codec/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 =2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001>B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001aH\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u001a\u0010)\u001a\u00020\u00008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010&\u001a\u0004\u0008\'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008.\u0010!R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0018\u0010:\u001a\u000207*\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0018\u0010<\u001a\u000207*\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u00109\u00a8\u0006?"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/e;",
        "Lcom/otaliastudios/transcoder/internal/codec/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/a;",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        "Lcom/otaliastudios/transcoder/internal/codec/f;",
        "Lca0/a;",
        "stretcher",
        "Lx90/a;",
        "resampler",
        "Landroid/media/MediaFormat;",
        "targetFormat",
        "<init>",
        "(Lca0/a;Lx90/a;Landroid/media/MediaFormat;)V",
        "sourceFormat",
        "Landroid/view/Surface;",
        "e",
        "(Landroid/media/MediaFormat;)Landroid/view/Surface;",
        "rawFormat",
        "",
        "a",
        "(Landroid/media/MediaFormat;)V",
        "data",
        "s",
        "(Lcom/otaliastudios/transcoder/internal/codec/b;)V",
        "r",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "g",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "c",
        "Lca0/a;",
        "d",
        "Lx90/a;",
        "Landroid/media/MediaFormat;",
        "Lw90/i;",
        "f",
        "Lw90/i;",
        "log",
        "Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;",
        "t",
        "()Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;",
        "channel",
        "Lcom/otaliastudios/transcoder/internal/audio/c;",
        "h",
        "Lcom/otaliastudios/transcoder/internal/audio/c;",
        "buffers",
        "i",
        "Lcom/otaliastudios/transcoder/internal/audio/a;",
        "j",
        "Lcom/otaliastudios/transcoder/internal/audio/a;",
        "chunks",
        "Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;",
        "k",
        "Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;",
        "remixer",
        "",
        "v",
        "(Landroid/media/MediaFormat;)I",
        "sampleRate",
        "u",
        "channels",
        "l",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final l:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final m:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final c:Lca0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lx90/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Landroid/media/MediaFormat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/otaliastudios/transcoder/internal/audio/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public i:Landroid/media/MediaFormat;

.field public j:Lcom/otaliastudios/transcoder/internal/audio/a;

.field public k:Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->l:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$Companion;

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    sput-object v0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    return-void
.end method

.method public constructor <init>(Lca0/a;Lx90/a;Landroid/media/MediaFormat;)V
    .locals 1
    .param p1    # Lca0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx90/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/media/MediaFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "stretcher"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "resampler"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string/jumbo v0, "targetFormat"

    .line 16
    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/e;-><init>()V

    .line 22
    .line 23
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->c:Lca0/a;

    .line 24
    .line 25
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->d:Lx90/a;

    .line 26
    .line 27
    iput-object p3, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->e:Landroid/media/MediaFormat;

    .line 28
    .line 29
    new-instance p1, Lw90/i;

    .line 30
    .line 31
    new-instance p2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    const-string p3, "AudioEngine("

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    sget-object p3, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 45
    move-result p3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const/16 p3, 0x29

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    move-result-object p2

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->f:Lw90/i;

    .line 63
    .line 64
    iput-object p0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->g:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    .line 65
    .line 66
    new-instance p1, Lcom/otaliastudios/transcoder/internal/audio/c;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1}, Lcom/otaliastudios/transcoder/internal/audio/c;-><init>()V

    .line 70
    .line 71
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->h:Lcom/otaliastudios/transcoder/internal/audio/c;

    .line 72
    return-void
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
.end method

.method public static final synthetic j(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lcom/otaliastudios/transcoder/internal/audio/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->h:Lcom/otaliastudios/transcoder/internal/audio/c;

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
    .line 25
.end method

.method public static final synthetic k(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->u(Landroid/media/MediaFormat;)I

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
.end method

.method public static final synthetic l(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->i:Landroid/media/MediaFormat;

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
    .line 25
.end method

.method public static final synthetic m(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->k:Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;

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
    .line 25
.end method

.method public static final synthetic n(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lx90/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->d:Lx90/a;

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
    .line 25
.end method

.method public static final synthetic o(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Landroid/media/MediaFormat;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->v(Landroid/media/MediaFormat;)I

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
.end method

.method public static final synthetic p(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Lca0/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->c:Lca0/a;

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
    .line 25
.end method

.method public static final synthetic q(Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;)Landroid/media/MediaFormat;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->e:Landroid/media/MediaFormat;

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
    .line 25
.end method


# virtual methods
.method public a(Landroid/media/MediaFormat;)V
    .locals 3
    .param p1    # Landroid/media/MediaFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "rawFormat"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->f:Lw90/i;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v2, "handleRawFormat("

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const/16 v2, 0x29

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 34
    .line 35
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->i:Landroid/media/MediaFormat;

    .line 36
    .line 37
    sget-object v0, Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;->a:Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->u(Landroid/media/MediaFormat;)I

    .line 41
    move-result v1

    .line 42
    .line 43
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->e:Landroid/media/MediaFormat;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->u(Landroid/media/MediaFormat;)I

    .line 47
    move-result v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer$Companion;->get$lib_release(II)Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->k:Lcom/otaliastudios/transcoder/internal/audio/remix/AudioRemixer;

    .line 54
    .line 55
    new-instance v0, Lcom/otaliastudios/transcoder/internal/audio/a;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->v(Landroid/media/MediaFormat;)I

    .line 59
    move-result v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->u(Landroid/media/MediaFormat;)I

    .line 63
    move-result p1

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1, p1}, Lcom/otaliastudios/transcoder/internal/audio/a;-><init>(II)V

    .line 67
    .line 68
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->j:Lcom/otaliastudios/transcoder/internal/audio/a;

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
.end method

.method public e(Landroid/media/MediaFormat;)Landroid/view/Surface;
    .locals 1
    .param p1    # Landroid/media/MediaFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sourceFormat"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1
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
.end method

.method public g()Lcom/otaliastudios/transcoder/internal/pipeline/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f<",
            "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->j:Lcom/otaliastudios/transcoder/internal/audio/a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "chunks"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/otaliastudios/transcoder/internal/audio/a;->d()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->f:Lw90/i;

    .line 20
    .line 21
    const-string v1, "drain(): no chunks, waiting..."

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$d;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$d;

    .line 27
    return-object v0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/a;->f()Lcom/otaliastudios/transcoder/internal/pipeline/b;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    check-cast v0, Lcom/otaliastudios/transcoder/internal/codec/f;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Lcom/otaliastudios/transcoder/internal/codec/f;->buffer()Lkotlin/Pair;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->f:Lw90/i;

    .line 42
    .line 43
    const-string v1, "drain(): no next buffer, waiting..."

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 47
    .line 48
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$d;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$d;

    .line 49
    return-object v0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    check-cast v0, Ljava/lang/Number;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 65
    move-result v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    iget-object v5, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->j:Lcom/otaliastudios/transcoder/internal/audio/a;

    .line 72
    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move-object v1, v5

    .line 79
    .line 80
    :goto_0
    new-instance v2, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 81
    .line 82
    new-instance v5, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;

    .line 83
    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    .line 87
    invoke-direct {v5, v3, v0, v6, v7}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;-><init>(Ljava/nio/ByteBuffer;IJ)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v2, v5}, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    new-instance v5, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;

    .line 93
    .line 94
    .line 95
    invoke-direct {v5, v4, p0, v3, v0}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$drain$2;-><init>(Ljava/nio/ShortBuffer;Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;Ljava/nio/ByteBuffer;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2, v5}, Lcom/otaliastudios/transcoder/internal/audio/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    check-cast v0, Lcom/otaliastudios/transcoder/internal/pipeline/f;

    .line 102
    return-object v0
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
.end method

.method public bridge synthetic getChannel()Lcom/otaliastudios/transcoder/internal/pipeline/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->t()Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/otaliastudios/transcoder/internal/codec/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->r(Lcom/otaliastudios/transcoder/internal/codec/b;)V

    .line 6
    return-void
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
.end method

.method public bridge synthetic i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/otaliastudios/transcoder/internal/codec/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->s(Lcom/otaliastudios/transcoder/internal/codec/b;)V

    .line 6
    return-void
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
.end method

.method public r(Lcom/otaliastudios/transcoder/internal/codec/b;)V
    .locals 11
    .param p1    # Lcom/otaliastudios/transcoder/internal/codec/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p1, Lcom/otaliastudios/transcoder/internal/codec/e;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    move-object v0, p1

    .line 12
    .line 13
    check-cast v0, Lcom/otaliastudios/transcoder/internal/codec/e;

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 20
    :goto_1
    move-wide v8, v2

    .line 21
    goto :goto_2

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v0}, Lcom/otaliastudios/transcoder/internal/codec/e;->d()D

    .line 25
    move-result-wide v2

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :goto_2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->j:Lcom/otaliastudios/transcoder/internal/audio/a;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const-string v0, "chunks"

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    move-object v4, v1

    .line 37
    goto :goto_3

    .line 38
    :cond_2
    move-object v4, v0

    .line 39
    .line 40
    .line 41
    :goto_3
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/b;->a()Ljava/nio/ByteBuffer;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    const-string v0, "data.buffer.asShortBuffer()"

    .line 49
    .line 50
    .line 51
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/b;->c()J

    .line 55
    move-result-wide v6

    .line 56
    .line 57
    new-instance v10, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$enqueue$1;

    .line 58
    .line 59
    .line 60
    invoke-direct {v10, p1}, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine$enqueue$1;-><init>(Lcom/otaliastudios/transcoder/internal/codec/b;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual/range {v4 .. v10}, Lcom/otaliastudios/transcoder/internal/audio/a;->b(Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;)V

    .line 64
    return-void
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
.end method

.method public s(Lcom/otaliastudios/transcoder/internal/codec/b;)V
    .locals 2
    .param p1    # Lcom/otaliastudios/transcoder/internal/codec/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->f:Lw90/i;

    .line 8
    .line 9
    const-string v1, "enqueueEos()"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/b;->b()Lkotlin/jvm/functions/Function1;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->j:Lcom/otaliastudios/transcoder/internal/audio/a;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const-string p1, "chunks"

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    const/4 p1, 0x0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/audio/a;->c()V

    .line 35
    return-void
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
.end method

.method public t()Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;->g:Lcom/otaliastudios/transcoder/internal/audio/AudioEngine;

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
.end method

.method public final u(Landroid/media/MediaFormat;)I
    .locals 1

    .line 1
    .line 2
    const-string v0, "channel-count"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public final v(Landroid/media/MediaFormat;)I
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sample-rate"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 7
    move-result p1

    .line 8
    return p1
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
.end method
