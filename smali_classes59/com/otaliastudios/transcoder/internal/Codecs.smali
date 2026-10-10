.class public final Lcom/otaliastudios/transcoder/internal/Codecs;
.super Ljava/lang/Object;
.source "Codecs.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R+\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00180\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0013\u001a\u0004\u0008\u0015\u0010\u001cR\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0013\u001a\u0004\u0008\u001b\u0010\u001cR\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0013\u001a\u0004\u0008\u001f\u0010\u001c\u00a8\u0006\""
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/Codecs;",
        "",
        "Lcom/otaliastudios/transcoder/internal/a;",
        "sources",
        "Lcom/otaliastudios/transcoder/internal/e;",
        "tracks",
        "Lw90/l;",
        "",
        "current",
        "<init>",
        "(Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lw90/l;)V",
        "",
        "g",
        "()V",
        "a",
        "Lcom/otaliastudios/transcoder/internal/a;",
        "b",
        "Lcom/otaliastudios/transcoder/internal/e;",
        "c",
        "Lw90/l;",
        "Lw90/i;",
        "d",
        "Lw90/i;",
        "log",
        "Lkotlin/Pair;",
        "Landroid/media/MediaCodec;",
        "Landroid/view/Surface;",
        "e",
        "()Lw90/l;",
        "encoders",
        "",
        "f",
        "ownsEncoderStart",
        "ownsEncoderStop",
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


# instance fields
.field public final a:Lcom/otaliastudios/transcoder/internal/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/otaliastudios/transcoder/internal/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lw90/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw90/l<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lw90/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw90/l<",
            "Lkotlin/Pair<",
            "Landroid/media/MediaCodec;",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lw90/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw90/l<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lw90/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw90/l<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lw90/l;)V
    .locals 1
    .param p1    # Lcom/otaliastudios/transcoder/internal/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/otaliastudios/transcoder/internal/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lw90/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/otaliastudios/transcoder/internal/a;",
            "Lcom/otaliastudios/transcoder/internal/e;",
            "Lw90/l<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sources"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "tracks"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v0, "current"

    .line 15
    .line 16
    .line 17
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->a:Lcom/otaliastudios/transcoder/internal/a;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->b:Lcom/otaliastudios/transcoder/internal/e;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->c:Lw90/l;

    .line 27
    .line 28
    new-instance p1, Lw90/i;

    .line 29
    .line 30
    const-string p2, "Codecs"

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p2}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->d:Lw90/i;

    .line 36
    .line 37
    new-instance p1, Lcom/otaliastudios/transcoder/internal/Codecs$encoders$1;

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, p0}, Lcom/otaliastudios/transcoder/internal/Codecs$encoders$1;-><init>(Lcom/otaliastudios/transcoder/internal/Codecs;)V

    .line 41
    .line 42
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->e:Lw90/l;

    .line 43
    .line 44
    new-instance p1, Lcom/otaliastudios/transcoder/internal/Codecs$a;

    .line 45
    .line 46
    .line 47
    invoke-direct {p1, p0}, Lcom/otaliastudios/transcoder/internal/Codecs$a;-><init>(Lcom/otaliastudios/transcoder/internal/Codecs;)V

    .line 48
    .line 49
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->f:Lw90/l;

    .line 50
    .line 51
    new-instance p1, Lcom/otaliastudios/transcoder/internal/Codecs$b;

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p0}, Lcom/otaliastudios/transcoder/internal/Codecs$b;-><init>(Lcom/otaliastudios/transcoder/internal/Codecs;)V

    .line 55
    .line 56
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->g:Lw90/l;

    .line 57
    return-void
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
.end method

.method public static final synthetic a(Lcom/otaliastudios/transcoder/internal/Codecs;)Lw90/l;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->c:Lw90/l;

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

.method public static final synthetic b(Lcom/otaliastudios/transcoder/internal/Codecs;)Lcom/otaliastudios/transcoder/internal/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->a:Lcom/otaliastudios/transcoder/internal/a;

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

.method public static final synthetic c(Lcom/otaliastudios/transcoder/internal/Codecs;)Lcom/otaliastudios/transcoder/internal/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->b:Lcom/otaliastudios/transcoder/internal/e;

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
.method public final d()Lw90/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw90/l<",
            "Lkotlin/Pair<",
            "Landroid/media/MediaCodec;",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->e:Lw90/l;

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

.method public final e()Lw90/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw90/l<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->f:Lw90/l;

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

.method public final f()Lw90/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw90/l<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->g:Lw90/l;

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

.method public final g()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/Codecs;->e:Lw90/l;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lkotlin/Pair;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Landroid/media/MediaCodec;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
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
.end method
