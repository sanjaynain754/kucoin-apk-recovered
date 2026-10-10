.class public final Lcom/otaliastudios/transcoder/internal/codec/Encoder;
.super Lcom/otaliastudios/transcoder/internal/pipeline/e;
.source "Encoder.kt"

# interfaces
.implements Lcom/otaliastudios/transcoder/internal/codec/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/transcoder/internal/codec/Encoder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/e<",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        "Lcom/otaliastudios/transcoder/internal/codec/f;",
        "Lt90/g;",
        "Lt90/f;",
        ">;",
        "Lcom/otaliastudios/transcoder/internal/codec/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u001f2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001NB)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eB\u0019\u0008\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0015\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040 H\u0014\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008#\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010/R+\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00198B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R+\u0010<\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00198B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00089\u00103\u001a\u0004\u0008:\u00105\"\u0004\u0008;\u00107R\u001a\u0010A\u001a\u00020\u00008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0016\u0010M\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010+\u00a8\u0006O"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/codec/Encoder;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/e;",
        "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;",
        "Lcom/otaliastudios/transcoder/internal/codec/f;",
        "Lt90/g;",
        "Lt90/f;",
        "Landroid/media/MediaCodec;",
        "codec",
        "Landroid/view/Surface;",
        "surface",
        "",
        "ownsCodecStart",
        "ownsCodecStop",
        "<init>",
        "(Landroid/media/MediaCodec;Landroid/view/Surface;ZZ)V",
        "Lcom/otaliastudios/transcoder/internal/Codecs;",
        "codecs",
        "Lcom/otaliastudios/transcoder/common/TrackType;",
        "type",
        "(Lcom/otaliastudios/transcoder/internal/Codecs;Lcom/otaliastudios/transcoder/common/TrackType;)V",
        "",
        "t",
        "()V",
        "Lkotlin/Pair;",
        "Ljava/nio/ByteBuffer;",
        "",
        "buffer",
        "()Lkotlin/Pair;",
        "data",
        "o",
        "(Lcom/otaliastudios/transcoder/internal/codec/EncoderData;)V",
        "n",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "g",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "release",
        "c",
        "Landroid/media/MediaCodec;",
        "d",
        "Landroid/view/Surface;",
        "getSurface",
        "()Landroid/view/Surface;",
        "e",
        "Z",
        "f",
        "Lcom/otaliastudios/transcoder/common/TrackType;",
        "Lw90/i;",
        "Lw90/i;",
        "log",
        "<set-?>",
        "h",
        "Lkotlin/properties/ReadWriteProperty;",
        "r",
        "()I",
        "u",
        "(I)V",
        "dequeuedInputs",
        "i",
        "s",
        "v",
        "dequeuedOutputs",
        "j",
        "Lcom/otaliastudios/transcoder/internal/codec/Encoder;",
        "q",
        "()Lcom/otaliastudios/transcoder/internal/codec/Encoder;",
        "channel",
        "Lu90/a;",
        "k",
        "Lkotlin/Lazy;",
        "p",
        "()Lu90/a;",
        "buffers",
        "Landroid/media/MediaCodec$BufferInfo;",
        "l",
        "Landroid/media/MediaCodec$BufferInfo;",
        "info",
        "m",
        "eosReceivedButNotEnqueued",
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
.field public static final n:Lcom/otaliastudios/transcoder/internal/codec/Encoder$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic o:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Lw90/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw90/l<",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final c:Landroid/media/MediaCodec;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Landroid/view/Surface;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Z

.field public final f:Lcom/otaliastudios/transcoder/common/TrackType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lkotlin/properties/ReadWriteProperty;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lkotlin/properties/ReadWriteProperty;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/otaliastudios/transcoder/internal/codec/Encoder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Landroid/media/MediaCodec$BufferInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 3
    .line 4
    const-class v1, Lcom/otaliastudios/transcoder/internal/codec/Encoder;

    .line 5
    .line 6
    const-string v2, "dequeuedInputs"

    .line 7
    .line 8
    const-string v3, "getDequeuedInputs()I"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v2, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 19
    .line 20
    const-string v3, "dequeuedOutputs"

    .line 21
    .line 22
    const-string v5, "getDequeuedOutputs()I"

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x2

    .line 31
    .line 32
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 33
    .line 34
    aput-object v0, v2, v4

    .line 35
    const/4 v0, 0x1

    .line 36
    .line 37
    aput-object v1, v2, v0

    .line 38
    .line 39
    sput-object v2, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->o:[Lkotlin/reflect/KProperty;

    .line 40
    .line 41
    new-instance v0, Lcom/otaliastudios/transcoder/internal/codec/Encoder$Companion;

    .line 42
    const/4 v1, 0x0

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .line 47
    sput-object v0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->n:Lcom/otaliastudios/transcoder/internal/codec/Encoder$Companion;

    .line 48
    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 53
    .line 54
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lw90/m;->c(Ljava/lang/Object;Ljava/lang/Object;)Lw90/l;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    sput-object v0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->p:Lw90/l;

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
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Landroid/view/Surface;ZZ)V
    .locals 3
    .param p1    # Landroid/media/MediaCodec;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/Surface;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/e;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 3
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->d:Landroid/view/Surface;

    .line 4
    iput-boolean p4, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->e:Z

    .line 5
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->getSurface()Landroid/view/Surface;

    move-result-object p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/otaliastudios/transcoder/common/TrackType;->VIDEO:Lcom/otaliastudios/transcoder/common/TrackType;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/otaliastudios/transcoder/common/TrackType;->AUDIO:Lcom/otaliastudios/transcoder/common/TrackType;

    :goto_0
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->f:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 6
    new-instance v0, Lw90/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Encoder("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->p:Lw90/l;

    invoke-interface {v2, p2}, Lw90/l;->M(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lw90/i;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g:Lw90/i;

    .line 7
    sget-object p2, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 8
    new-instance v2, Lcom/otaliastudios/transcoder/internal/codec/Encoder$a;

    invoke-direct {v2, v1, v1, p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/otaliastudios/transcoder/internal/codec/Encoder;)V

    .line 9
    iput-object v2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->h:Lkotlin/properties/ReadWriteProperty;

    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 11
    new-instance v1, Lcom/otaliastudios/transcoder/internal/codec/Encoder$b;

    invoke-direct {v1, p2, p2, p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder$b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/otaliastudios/transcoder/internal/codec/Encoder;)V

    .line 12
    iput-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->i:Lkotlin/properties/ReadWriteProperty;

    .line 13
    iput-object p0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->j:Lcom/otaliastudios/transcoder/internal/codec/Encoder;

    .line 14
    new-instance p2, Lcom/otaliastudios/transcoder/internal/codec/Encoder$buffers$2;

    invoke-direct {p2, p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder$buffers$2;-><init>(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->k:Lkotlin/Lazy;

    .line 15
    new-instance p2, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p2}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->l:Landroid/media/MediaCodec$BufferInfo;

    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Encoder: ownsStart="

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " ownsStop="

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lw90/i;->c(Ljava/lang/String;)V

    if-eqz p3, :cond_1

    .line 17
    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    :cond_1
    return-void
.end method

.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/Codecs;Lcom/otaliastudios/transcoder/common/TrackType;)V
    .locals 3
    .param p1    # Lcom/otaliastudios/transcoder/internal/Codecs;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "codecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/Codecs;->d()Lw90/l;

    move-result-object v0

    invoke-interface {v0, p2}, Lw90/l;->M(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/MediaCodec;

    .line 19
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/Codecs;->d()Lw90/l;

    move-result-object v1

    invoke-interface {v1, p2}, Lw90/l;->M(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    .line 20
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/Codecs;->e()Lw90/l;

    move-result-object v2

    invoke-interface {v2, p2}, Lw90/l;->M(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 21
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/Codecs;->f()Lw90/l;

    move-result-object p1

    invoke-interface {p1, p2}, Lw90/l;->M(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 22
    invoke-direct {p0, v0, v1, v2, p1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;-><init>(Landroid/media/MediaCodec;Landroid/view/Surface;ZZ)V

    return-void
.end method

.method public static final synthetic j(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)Landroid/media/MediaCodec;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

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

.method public static final synthetic k(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->s()I

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
.end method

.method public static final synthetic l(Lcom/otaliastudios/transcoder/internal/codec/Encoder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->t()V

    .line 4
    return-void
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

.method public static final synthetic m(Lcom/otaliastudios/transcoder/internal/codec/Encoder;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->v(I)V

    .line 4
    return-void
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

.method private final p()Lu90/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->k:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lu90/a;

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
.end method

.method private final r()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->h:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->o:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 17
    move-result v0

    .line 18
    return v0
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
.end method

.method private final s()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->i:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->o:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 17
    move-result v0

    .line 18
    return v0
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
.end method

.method private final t()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g:Lw90/i;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "dequeuedInputs="

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->r()I

    .line 16
    move-result v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, " dequeuedOutputs="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->s()I

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lw90/i;->h(Ljava/lang/String;)V

    .line 39
    return-void
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

.method private final u(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->h:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->o:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 15
    return-void
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

.method private final v(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->i:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->o:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 15
    return-void
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
.method public buffer()Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->r()I

    .line 14
    move-result v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->u(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->p()Lu90/a;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lu90/a;->a(I)Ljava/nio/ByteBuffer;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g:Lw90/i;

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    const-string v2, "buffer() failed. dequeuedInputs="

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->r()I

    .line 52
    move-result v2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, " dequeuedOutputs="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->s()I

    .line 64
    move-result v2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 75
    const/4 v0, 0x0

    .line 76
    return-object v0
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
.end method

.method public g()Lcom/otaliastudios/transcoder/internal/pipeline/f;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f<",
            "Lt90/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->m:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, 0x1388

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    :goto_0
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->l:Landroid/media/MediaCodec$BufferInfo;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3, v0, v1}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 17
    move-result v0

    .line 18
    const/4 v1, -0x3

    .line 19
    .line 20
    if-eq v0, v1, :cond_7

    .line 21
    const/4 v1, -0x2

    .line 22
    .line 23
    if-eq v0, v1, :cond_6

    .line 24
    const/4 v1, -0x1

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    if-eq v0, v1, :cond_4

    .line 28
    .line 29
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->l:Landroid/media/MediaCodec$BufferInfo;

    .line 30
    .line 31
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 32
    .line 33
    and-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 41
    .line 42
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$c;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$c;

    .line 43
    return-object v0

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->s()I

    .line 47
    move-result v1

    .line 48
    const/4 v3, 0x1

    .line 49
    add-int/2addr v1, v3

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->v(I)V

    .line 53
    .line 54
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->l:Landroid/media/MediaCodec$BufferInfo;

    .line 55
    .line 56
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 57
    .line 58
    and-int/lit8 v4, v1, 0x4

    .line 59
    .line 60
    if-eqz v4, :cond_2

    .line 61
    move v2, v3

    .line 62
    .line 63
    :cond_2
    and-int/lit8 v7, v1, -0x5

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->p()Lu90/a;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, Lu90/a;->b(I)Ljava/nio/ByteBuffer;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    const-string v1, "buffers.getOutputBuffer(result)"

    .line 74
    .line 75
    .line 76
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->l:Landroid/media/MediaCodec$BufferInfo;

    .line 79
    .line 80
    iget-wide v5, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 84
    .line 85
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->l:Landroid/media/MediaCodec$BufferInfo;

    .line 86
    .line 87
    iget v3, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 88
    .line 89
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 90
    add-int/2addr v3, v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 94
    .line 95
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->l:Landroid/media/MediaCodec$BufferInfo;

    .line 96
    .line 97
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 101
    .line 102
    new-instance v3, Lt90/g;

    .line 103
    .line 104
    new-instance v8, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;

    .line 105
    .line 106
    .line 107
    invoke-direct {v8, p0, v0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$data$1;-><init>(Lcom/otaliastudios/transcoder/internal/codec/Encoder;I)V

    .line 108
    .line 109
    .line 110
    invoke-direct/range {v3 .. v8}, Lt90/g;-><init>(Ljava/nio/ByteBuffer;JILkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 115
    .line 116
    .line 117
    invoke-direct {v0, v3}, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;-><init>(Ljava/lang/Object;)V

    .line 118
    return-object v0

    .line 119
    .line 120
    :cond_3
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;

    .line 121
    .line 122
    .line 123
    invoke-direct {v0, v3}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;-><init>(Ljava/lang/Object;)V

    .line 124
    return-object v0

    .line 125
    .line 126
    :cond_4
    iget-boolean v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->m:Z

    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g:Lw90/i;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    const-string v3, "Sending fake Eos. dequeuedInputs="

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->r()I

    .line 144
    move-result v3

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v3, " dequeuedOutputs="

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->s()I

    .line 156
    move-result v3

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 170
    move-result-object v4

    .line 171
    .line 172
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 173
    .line 174
    new-instance v3, Lt90/g;

    .line 175
    .line 176
    const-string v1, "buffer"

    .line 177
    .line 178
    .line 179
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    const/4 v7, 0x0

    .line 181
    .line 182
    sget-object v8, Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$1;->INSTANCE:Lcom/otaliastudios/transcoder/internal/codec/Encoder$drain$1;

    .line 183
    .line 184
    const-wide/16 v5, 0x0

    .line 185
    .line 186
    .line 187
    invoke-direct/range {v3 .. v8}, Lt90/g;-><init>(Ljava/nio/ByteBuffer;JILkotlin/jvm/functions/Function0;)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, v3}, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;-><init>(Ljava/lang/Object;)V

    .line 191
    return-object v0

    .line 192
    .line 193
    :cond_5
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g:Lw90/i;

    .line 194
    .line 195
    const-string v1, "Can\'t dequeue output buffer: INFO_TRY_AGAIN_LATER"

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 199
    .line 200
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$d;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$d;

    .line 201
    return-object v0

    .line 202
    .line 203
    :cond_6
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g:Lw90/i;

    .line 204
    .line 205
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 209
    move-result-object v1

    .line 210
    .line 211
    const-string v2, "INFO_OUTPUT_FORMAT_CHANGED! format="

    .line 212
    .line 213
    .line 214
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/a;->f()Lcom/otaliastudios/transcoder/internal/pipeline/b;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    check-cast v0, Lt90/f;

    .line 225
    .line 226
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 230
    move-result-object v1

    .line 231
    .line 232
    const-string v2, "codec.outputFormat"

    .line 233
    .line 234
    .line 235
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v0, v1}, Lt90/f;->d(Landroid/media/MediaFormat;)V

    .line 239
    .line 240
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$c;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$c;

    .line 241
    return-object v0

    .line 242
    .line 243
    .line 244
    :cond_7
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->p()Lu90/a;

    .line 245
    move-result-object v0

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Lu90/a;->c()V

    .line 249
    .line 250
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$c;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$c;

    .line 251
    return-object v0
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
.end method

.method public bridge synthetic getChannel()Lcom/otaliastudios/transcoder/internal/pipeline/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->q()Lcom/otaliastudios/transcoder/internal/codec/Encoder;

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

.method public getSurface()Landroid/view/Surface;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->d:Landroid/view/Surface;

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

.method public bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->n(Lcom/otaliastudios/transcoder/internal/codec/EncoderData;)V

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
    check-cast p1, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->o(Lcom/otaliastudios/transcoder/internal/codec/EncoderData;)V

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

.method public n(Lcom/otaliastudios/transcoder/internal/codec/EncoderData;)V
    .locals 8
    .param p1    # Lcom/otaliastudios/transcoder/internal/codec/EncoderData;
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
    .line 8
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->getSurface()Landroid/view/Surface;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;->b()Ljava/nio/ByteBuffer;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;->c()I

    .line 24
    move-result v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 28
    move-result v3

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 32
    move-result v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;->d()J

    .line 36
    move-result-wide v5

    .line 37
    const/4 v7, 0x0

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->r()I

    .line 44
    move-result p1

    .line 45
    .line 46
    add-int/lit8 p1, p1, -0x1

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->u(I)V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string v0, "Audio should always pass a buffer to Encoder."

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p1
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

.method public o(Lcom/otaliastudios/transcoder/internal/codec/EncoderData;)V
    .locals 8
    .param p1    # Lcom/otaliastudios/transcoder/internal/codec/EncoderData;
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
    .line 8
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->getSurface()Landroid/view/Surface;

    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->e:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iput-boolean v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->m:Z

    .line 19
    .line 20
    :cond_0
    if-nez v0, :cond_1

    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    move v7, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v0, 0x4

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :goto_1
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/EncoderData;->c()I

    .line 31
    move-result v2

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    const-wide/16 v5, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    .line 37
    .line 38
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->r()I

    .line 42
    move-result p1

    .line 43
    .line 44
    add-int/lit8 p1, p1, -0x1

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->u(I)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_2
    iget-boolean p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->e:Z

    .line 51
    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    iput-boolean v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->m:Z

    .line 55
    return-void

    .line 56
    .line 57
    :cond_3
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    .line 61
    return-void
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

.method public q()Lcom/otaliastudios/transcoder/internal/codec/Encoder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->j:Lcom/otaliastudios/transcoder/internal/codec/Encoder;

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

.method public release()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->g:Lw90/i;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "release(): ownsStop="

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->e:Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, " dequeuedInputs="

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->r()I

    .line 27
    move-result v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, " dequeuedOutputs="

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->s()I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 50
    .line 51
    iget-boolean v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->e:Z

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Encoder;->c:Landroid/media/MediaCodec;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 59
    :cond_0
    return-void
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
.end method
