.class public final Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;
.super Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;
.source "DefaultTranscodeEngine.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$Companion;,
        Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 G2\u00020\u0001:\u0001HBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ/\u0010(\u001a\u00020\'2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010E\u00a8\u0006I"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;",
        "Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;",
        "Lcom/otaliastudios/transcoder/internal/a;",
        "dataSources",
        "Lz90/a;",
        "dataSink",
        "Lw90/l;",
        "Lba0/e;",
        "strategies",
        "Lea0/b;",
        "validator",
        "",
        "videoRotation",
        "Lca0/a;",
        "audioStretcher",
        "Lx90/a;",
        "audioResampler",
        "Lda0/b;",
        "interpolator",
        "<init>",
        "(Lcom/otaliastudios/transcoder/internal/a;Lz90/a;Lw90/l;Lea0/b;ILca0/a;Lx90/a;Lda0/b;)V",
        "",
        "h",
        "()Z",
        "Lkotlin/Function1;",
        "",
        "",
        "progress",
        "g",
        "(Lkotlin/jvm/functions/Function1;)V",
        "b",
        "()V",
        "Lcom/otaliastudios/transcoder/common/TrackType;",
        "type",
        "index",
        "Lcom/otaliastudios/transcoder/common/TrackStatus;",
        "status",
        "Landroid/media/MediaFormat;",
        "outputFormat",
        "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;",
        "f",
        "(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;",
        "c",
        "Lcom/otaliastudios/transcoder/internal/a;",
        "d",
        "Lz90/a;",
        "e",
        "Lea0/b;",
        "I",
        "Lca0/a;",
        "Lx90/a;",
        "Lw90/i;",
        "i",
        "Lw90/i;",
        "log",
        "Lcom/otaliastudios/transcoder/internal/e;",
        "j",
        "Lcom/otaliastudios/transcoder/internal/e;",
        "tracks",
        "Lcom/otaliastudios/transcoder/internal/c;",
        "k",
        "Lcom/otaliastudios/transcoder/internal/c;",
        "segments",
        "Lcom/otaliastudios/transcoder/internal/d;",
        "l",
        "Lcom/otaliastudios/transcoder/internal/d;",
        "timer",
        "Lcom/otaliastudios/transcoder/internal/Codecs;",
        "m",
        "Lcom/otaliastudios/transcoder/internal/Codecs;",
        "codecs",
        "n",
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
.field public static final n:Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final o:J

.field public static final p:J


# instance fields
.field public final c:Lcom/otaliastudios/transcoder/internal/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lz90/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lea0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:I

.field public final g:Lca0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lx90/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/otaliastudios/transcoder/internal/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/otaliastudios/transcoder/internal/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lcom/otaliastudios/transcoder/internal/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/otaliastudios/transcoder/internal/Codecs;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->n:Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$Companion;

    .line 9
    .line 10
    const-wide/16 v0, 0xa

    .line 11
    .line 12
    sput-wide v0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->o:J

    .line 13
    .line 14
    sput-wide v0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->p:J

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/a;Lz90/a;Lw90/l;Lea0/b;ILca0/a;Lx90/a;Lda0/b;)V
    .locals 2
    .param p1    # Lcom/otaliastudios/transcoder/internal/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lz90/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lw90/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lea0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lca0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lx90/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lda0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/otaliastudios/transcoder/internal/a;",
            "Lz90/a;",
            "Lw90/l<",
            "Lba0/e;",
            ">;",
            "Lea0/b;",
            "I",
            "Lca0/a;",
            "Lx90/a;",
            "Lda0/b;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataSources"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "dataSink"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "strategies"

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v0, "validator"

    .line 20
    .line 21
    .line 22
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    const-string v0, "audioStretcher"

    .line 25
    .line 26
    .line 27
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    const-string v0, "audioResampler"

    .line 30
    .line 31
    .line 32
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    const-string v0, "interpolator"

    .line 35
    .line 36
    .line 37
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;-><init>()V

    .line 41
    .line 42
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->c:Lcom/otaliastudios/transcoder/internal/a;

    .line 43
    .line 44
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->d:Lz90/a;

    .line 45
    .line 46
    iput-object p4, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->e:Lea0/b;

    .line 47
    .line 48
    iput p5, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->f:I

    .line 49
    .line 50
    iput-object p6, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->g:Lca0/a;

    .line 51
    .line 52
    iput-object p7, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->h:Lx90/a;

    .line 53
    .line 54
    new-instance p4, Lw90/i;

    .line 55
    .line 56
    const-string p6, "TranscodeEngine"

    .line 57
    .line 58
    .line 59
    invoke-direct {p4, p6}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    iput-object p4, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->i:Lw90/i;

    .line 62
    .line 63
    new-instance p6, Lcom/otaliastudios/transcoder/internal/e;

    .line 64
    const/4 p7, 0x0

    .line 65
    .line 66
    .line 67
    invoke-direct {p6, p3, p1, p5, p7}, Lcom/otaliastudios/transcoder/internal/e;-><init>(Lw90/l;Lcom/otaliastudios/transcoder/internal/a;IZ)V

    .line 68
    .line 69
    iput-object p6, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->j:Lcom/otaliastudios/transcoder/internal/e;

    .line 70
    .line 71
    new-instance p3, Lcom/otaliastudios/transcoder/internal/c;

    .line 72
    .line 73
    new-instance p5, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$segments$1;

    .line 74
    .line 75
    .line 76
    invoke-direct {p5, p0}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$segments$1;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p3, p1, p6, p5}, Lcom/otaliastudios/transcoder/internal/c;-><init>(Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lkotlin/jvm/functions/Function4;)V

    .line 80
    .line 81
    iput-object p3, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->k:Lcom/otaliastudios/transcoder/internal/c;

    .line 82
    .line 83
    new-instance p5, Lcom/otaliastudios/transcoder/internal/d;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Lcom/otaliastudios/transcoder/internal/c;->b()Lw90/j;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-direct {p5, p8, p1, p6, v0}, Lcom/otaliastudios/transcoder/internal/d;-><init>(Lda0/b;Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lw90/l;)V

    .line 91
    .line 92
    iput-object p5, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

    .line 93
    .line 94
    new-instance p5, Lcom/otaliastudios/transcoder/internal/Codecs;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3}, Lcom/otaliastudios/transcoder/internal/c;->b()Lw90/j;

    .line 98
    move-result-object p3

    .line 99
    .line 100
    .line 101
    invoke-direct {p5, p1, p6, p3}, Lcom/otaliastudios/transcoder/internal/Codecs;-><init>(Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lw90/l;)V

    .line 102
    .line 103
    iput-object p5, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->m:Lcom/otaliastudios/transcoder/internal/Codecs;

    .line 104
    .line 105
    const-string p3, "Created Tracks, Segments, Timer..."

    .line 106
    .line 107
    .line 108
    invoke-virtual {p4, p3}, Lw90/i;->c(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p2, p7}, Lz90/a;->c(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/a;->a()Ljava/util/List;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    sget-object p3, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;->INSTANCE:Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$location$1;

    .line 122
    .line 123
    .line 124
    invoke-static {p1, p3}, Lkotlin/sequences/SequencesKt;->mapNotNull(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lkotlin/sequences/SequencesKt;->firstOrNull(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    check-cast p1, [D

    .line 132
    .line 133
    if-eqz p1, :cond_0

    .line 134
    .line 135
    aget-wide p7, p1, p7

    .line 136
    const/4 p3, 0x1

    .line 137
    .line 138
    aget-wide v0, p1, p3

    .line 139
    .line 140
    .line 141
    invoke-interface {p2, p7, p8, v0, v1}, Lz90/a;->b(DD)V

    .line 142
    .line 143
    :cond_0
    sget-object p1, Lcom/otaliastudios/transcoder/common/TrackType;->VIDEO:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p6}, Lcom/otaliastudios/transcoder/internal/e;->b()Lw90/l;

    .line 147
    move-result-object p3

    .line 148
    .line 149
    .line 150
    invoke-interface {p3}, Lw90/l;->o()Ljava/lang/Object;

    .line 151
    move-result-object p3

    .line 152
    .line 153
    check-cast p3, Lcom/otaliastudios/transcoder/common/TrackStatus;

    .line 154
    .line 155
    .line 156
    invoke-interface {p2, p1, p3}, Lz90/a;->d(Lcom/otaliastudios/transcoder/common/TrackType;Lcom/otaliastudios/transcoder/common/TrackStatus;)V

    .line 157
    .line 158
    sget-object p1, Lcom/otaliastudios/transcoder/common/TrackType;->AUDIO:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p6}, Lcom/otaliastudios/transcoder/internal/e;->b()Lw90/l;

    .line 162
    move-result-object p3

    .line 163
    .line 164
    .line 165
    invoke-interface {p3}, Lw90/l;->p()Ljava/lang/Object;

    .line 166
    move-result-object p3

    .line 167
    .line 168
    check-cast p3, Lcom/otaliastudios/transcoder/common/TrackStatus;

    .line 169
    .line 170
    .line 171
    invoke-interface {p2, p1, p3}, Lz90/a;->d(Lcom/otaliastudios/transcoder/common/TrackType;Lcom/otaliastudios/transcoder/common/TrackStatus;)V

    .line 172
    .line 173
    const-string p1, "Set up the DataSink..."

    .line 174
    .line 175
    .line 176
    invoke-virtual {p4, p1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 177
    return-void
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
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
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
.end method

.method public static final synthetic d(Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->f(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;

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
.end method

.method public static final synthetic e(Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;)Lcom/otaliastudios/transcoder/internal/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

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
.method public b()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->k:Lcom/otaliastudios/transcoder/internal/c;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/otaliastudios/transcoder/internal/c;->f()V

    .line 8
    .line 9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    .line 16
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->d:Lz90/a;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Lz90/a;->release()V

    .line 29
    .line 30
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    .line 37
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->c:Lcom/otaliastudios/transcoder/internal/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/otaliastudios/transcoder/internal/a;->release()V

    .line 50
    .line 51
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 55
    goto :goto_2

    .line 56
    :catchall_2
    move-exception v0

    .line 57
    .line 58
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    :goto_2
    :try_start_3
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->m:Lcom/otaliastudios/transcoder/internal/Codecs;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/otaliastudios/transcoder/internal/Codecs;->g()V

    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 76
    goto :goto_3

    .line 77
    :catchall_3
    move-exception v0

    .line 78
    .line 79
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    :goto_3
    return-void
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
.end method

.method public final f(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->i:Lw90/i;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "createPipeline("

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, ", "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "), format="

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lw90/i;->j(Ljava/lang/String;)V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/transcoder/internal/d;->m(Lcom/otaliastudios/transcoder/common/TrackType;I)Lda0/b;

    .line 50
    move-result-object v4

    .line 51
    .line 52
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->c:Lcom/otaliastudios/transcoder/internal/a;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lcom/otaliastudios/transcoder/internal/a;->e(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/util/List;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v1, Laa0/b;

    .line 63
    .line 64
    new-instance v2, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$createPipeline$source$1;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, p0, p1}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$createPipeline$source$1;-><init>(Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;Lcom/otaliastudios/transcoder/common/TrackType;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v2}, Lw90/g;->a(Laa0/b;Lkotlin/jvm/functions/Function0;)Laa0/b;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->d:Lz90/a;

    .line 74
    .line 75
    new-instance v3, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$createPipeline$sink$1;

    .line 76
    .line 77
    .line 78
    invoke-direct {v3, p2, v0}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$createPipeline$sink$1;-><init>(ILjava/util/List;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v3}, Lw90/g;->b(Lz90/a;Lkotlin/jvm/functions/Function0;)Lz90/a;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    sget-object p2, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine$a;->$EnumSwitchMapping$0:[I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 88
    move-result p3

    .line 89
    .line 90
    aget p2, p2, p3

    .line 91
    const/4 p3, 0x1

    .line 92
    .line 93
    if-eq p2, p3, :cond_3

    .line 94
    const/4 p3, 0x2

    .line 95
    .line 96
    if-eq p2, p3, :cond_2

    .line 97
    const/4 p3, 0x3

    .line 98
    .line 99
    if-eq p2, p3, :cond_1

    .line 100
    const/4 p3, 0x4

    .line 101
    .line 102
    if-ne p2, p3, :cond_0

    .line 103
    .line 104
    iget-object v6, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->m:Lcom/otaliastudios/transcoder/internal/Codecs;

    .line 105
    .line 106
    iget v7, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->f:I

    .line 107
    .line 108
    iget-object v8, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->g:Lca0/a;

    .line 109
    .line 110
    iget-object v9, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->h:Lx90/a;

    .line 111
    move-object v1, p1

    .line 112
    move-object v5, p4

    .line 113
    .line 114
    .line 115
    invoke-static/range {v1 .. v9}, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt;->d(Lcom/otaliastudios/transcoder/common/TrackType;Laa0/b;Lz90/a;Lda0/b;Landroid/media/MediaFormat;Lcom/otaliastudios/transcoder/internal/Codecs;ILca0/a;Lx90/a;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;

    .line 116
    move-result-object p1

    .line 117
    return-object p1

    .line 118
    .line 119
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 120
    .line 121
    .line 122
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 123
    throw p1

    .line 124
    :cond_1
    move-object v1, p1

    .line 125
    .line 126
    .line 127
    invoke-static {v1, v2, v3, v4}, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt;->c(Lcom/otaliastudios/transcoder/common/TrackType;Laa0/b;Lz90/a;Lda0/b;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;

    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    .line 131
    .line 132
    :cond_2
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt;->b()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;

    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    .line 136
    .line 137
    :cond_3
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/pipeline/PipelinesKt;->b()Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;

    .line 138
    move-result-object p1

    .line 139
    return-object p1
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
.end method

.method public g(Lkotlin/jvm/functions/Function1;)V
    .locals 11
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Double;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "progress"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->i:Lw90/i;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "transcode(): about to start, durationUs="

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/otaliastudios/transcoder/internal/d;->l()J

    .line 25
    move-result-wide v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, ", audioUs="

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/otaliastudios/transcoder/internal/d;->i()Lw90/l;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Lw90/l;->J()Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v2, ", videoUs="

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/otaliastudios/transcoder/internal/d;->i()Lw90/l;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Lw90/l;->q()Ljava/lang/Object;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 72
    .line 73
    const-wide/16 v0, 0x0

    .line 74
    move-wide v2, v0

    .line 75
    .line 76
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->k:Lcom/otaliastudios/transcoder/internal/c;

    .line 77
    .line 78
    sget-object v5, Lcom/otaliastudios/transcoder/common/TrackType;->AUDIO:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5}, Lcom/otaliastudios/transcoder/internal/c;->e(Lcom/otaliastudios/transcoder/common/TrackType;)Lcom/otaliastudios/transcoder/internal/b;

    .line 82
    move-result-object v4

    .line 83
    .line 84
    iget-object v5, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->k:Lcom/otaliastudios/transcoder/internal/c;

    .line 85
    .line 86
    sget-object v6, Lcom/otaliastudios/transcoder/common/TrackType;->VIDEO:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v6}, Lcom/otaliastudios/transcoder/internal/c;->e(Lcom/otaliastudios/transcoder/common/TrackType;)Lcom/otaliastudios/transcoder/internal/b;

    .line 90
    move-result-object v5

    .line 91
    const/4 v6, 0x0

    .line 92
    .line 93
    if-nez v4, :cond_1

    .line 94
    move v4, v6

    .line 95
    goto :goto_1

    .line 96
    .line 97
    .line 98
    :cond_1
    invoke-virtual {v4}, Lcom/otaliastudios/transcoder/internal/b;->a()Z

    .line 99
    move-result v4

    .line 100
    .line 101
    :goto_1
    if-nez v5, :cond_2

    .line 102
    move v5, v6

    .line 103
    goto :goto_2

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v5}, Lcom/otaliastudios/transcoder/internal/b;->a()Z

    .line 107
    move-result v5

    .line 108
    :goto_2
    or-int/2addr v4, v5

    .line 109
    .line 110
    if-nez v4, :cond_3

    .line 111
    .line 112
    iget-object v5, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->k:Lcom/otaliastudios/transcoder/internal/c;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Lcom/otaliastudios/transcoder/internal/c;->c()Z

    .line 116
    move-result v5

    .line 117
    .line 118
    if-nez v5, :cond_3

    .line 119
    const/4 v6, 0x1

    .line 120
    .line 121
    :cond_3
    iget-object v5, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->i:Lw90/i;

    .line 122
    .line 123
    new-instance v7, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string/jumbo v8, "transcode(): executed step="

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v8, " advanced="

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v8, " completed="

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    move-result-object v7

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v7}, Lw90/i;->h(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 162
    move-result v5

    .line 163
    .line 164
    if-nez v5, :cond_6

    .line 165
    .line 166
    if-eqz v6, :cond_4

    .line 167
    .line 168
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->d:Lz90/a;

    .line 178
    .line 179
    .line 180
    invoke-interface {p1}, Lz90/a;->stop()V

    .line 181
    return-void

    .line 182
    .line 183
    :cond_4
    if-nez v4, :cond_5

    .line 184
    .line 185
    sget-wide v4, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->o:J

    .line 186
    .line 187
    .line 188
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 189
    .line 190
    :cond_5
    const-wide/16 v4, 0x1

    .line 191
    add-long/2addr v2, v4

    .line 192
    .line 193
    sget-wide v4, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->p:J

    .line 194
    .line 195
    rem-long v4, v2, v4

    .line 196
    .line 197
    cmp-long v4, v4, v0

    .line 198
    .line 199
    if-nez v4, :cond_0

    .line 200
    .line 201
    iget-object v4, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Lcom/otaliastudios/transcoder/internal/d;->k()Lw90/l;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    .line 208
    invoke-interface {v4}, Lw90/l;->p()Ljava/lang/Object;

    .line 209
    move-result-object v4

    .line 210
    .line 211
    check-cast v4, Ljava/lang/Number;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 215
    move-result-wide v4

    .line 216
    .line 217
    iget-object v6, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->l:Lcom/otaliastudios/transcoder/internal/d;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6}, Lcom/otaliastudios/transcoder/internal/d;->k()Lw90/l;

    .line 221
    move-result-object v6

    .line 222
    .line 223
    .line 224
    invoke-interface {v6}, Lw90/l;->o()Ljava/lang/Object;

    .line 225
    move-result-object v6

    .line 226
    .line 227
    check-cast v6, Ljava/lang/Number;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 231
    move-result-wide v6

    .line 232
    .line 233
    iget-object v8, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->i:Lw90/i;

    .line 234
    .line 235
    new-instance v9, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string/jumbo v10, "transcode(): got progress, video="

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string v10, " audio="

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    move-result-object v9

    .line 260
    .line 261
    .line 262
    invoke-virtual {v8, v9}, Lw90/i;->h(Ljava/lang/String;)V

    .line 263
    add-double/2addr v6, v4

    .line 264
    .line 265
    iget-object v4, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->j:Lcom/otaliastudios/transcoder/internal/e;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4}, Lcom/otaliastudios/transcoder/internal/e;->a()Lw90/l;

    .line 269
    move-result-object v4

    .line 270
    .line 271
    .line 272
    invoke-interface {v4}, Lw90/l;->getSize()I

    .line 273
    move-result v4

    .line 274
    int-to-double v4, v4

    .line 275
    div-double/2addr v6, v4

    .line 276
    .line 277
    .line 278
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 279
    move-result-object v4

    .line 280
    .line 281
    .line 282
    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_6
    new-instance p1, Ljava/lang/InterruptedException;

    .line 287
    .line 288
    .line 289
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 290
    throw p1
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
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
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
.end method

.method public h()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->e:Lea0/b;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->j:Lcom/otaliastudios/transcoder/internal/e;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/e;->b()Lw90/l;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Lw90/l;->o()Ljava/lang/Object;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    check-cast v1, Lcom/otaliastudios/transcoder/common/TrackStatus;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->j:Lcom/otaliastudios/transcoder/internal/e;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/otaliastudios/transcoder/internal/e;->b()Lw90/l;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Lw90/l;->p()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lcom/otaliastudios/transcoder/common/TrackStatus;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1, v2}, Lea0/b;->a(Lcom/otaliastudios/transcoder/common/TrackStatus;Lcom/otaliastudios/transcoder/common/TrackStatus;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->i:Lw90/i;

    .line 35
    .line 36
    const-string v1, "Validator has decided that the input is fine and transcoding is not necessary."

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 40
    const/4 v0, 0x0

    .line 41
    return v0

    .line 42
    :cond_0
    const/4 v0, 0x1

    .line 43
    return v0
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
