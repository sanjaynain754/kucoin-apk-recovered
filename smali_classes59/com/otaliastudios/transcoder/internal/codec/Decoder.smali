.class public final Lcom/otaliastudios/transcoder/internal/codec/Decoder;
.super Lcom/otaliastudios/transcoder/internal/pipeline/e;
.source "Decoder.kt"

# interfaces
.implements Lt90/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/transcoder/internal/codec/Decoder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/e<",
        "Lt90/c;",
        "Lt90/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/a;",
        ">;",
        "Lt90/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0000\u0018\u0000 G2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001HB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0019H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001a\u0010)\u001a\u00020\u00008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010/\u001a\u0004\u00080\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R+\u0010B\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00128B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR+\u0010F\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00128B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008C\u0010=\u001a\u0004\u0008D\u0010?\"\u0004\u0008E\u0010A\u00a8\u0006I"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/codec/Decoder;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/e;",
        "Lt90/c;",
        "Lt90/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/a;",
        "Landroid/media/MediaFormat;",
        "format",
        "",
        "continuous",
        "<init>",
        "(Landroid/media/MediaFormat;Z)V",
        "next",
        "",
        "t",
        "(Lcom/otaliastudios/transcoder/internal/codec/a;)V",
        "Lkotlin/Pair;",
        "Ljava/nio/ByteBuffer;",
        "",
        "buffer",
        "()Lkotlin/Pair;",
        "data",
        "o",
        "(Lt90/c;)V",
        "n",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "g",
        "()Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "release",
        "()V",
        "u",
        "c",
        "Landroid/media/MediaFormat;",
        "Lw90/i;",
        "d",
        "Lw90/i;",
        "log",
        "e",
        "Lcom/otaliastudios/transcoder/internal/codec/Decoder;",
        "q",
        "()Lcom/otaliastudios/transcoder/internal/codec/Decoder;",
        "channel",
        "Landroid/media/MediaCodec;",
        "f",
        "Landroid/media/MediaCodec;",
        "codec",
        "Lu90/a;",
        "Lkotlin/Lazy;",
        "p",
        "()Lu90/a;",
        "buffers",
        "Landroid/media/MediaCodec$BufferInfo;",
        "h",
        "Landroid/media/MediaCodec$BufferInfo;",
        "info",
        "Lcom/otaliastudios/transcoder/internal/codec/c;",
        "i",
        "Lcom/otaliastudios/transcoder/internal/codec/c;",
        "dropper",
        "<set-?>",
        "j",
        "Lkotlin/properties/ReadWriteProperty;",
        "r",
        "()I",
        "v",
        "(I)V",
        "dequeuedInputs",
        "k",
        "s",
        "w",
        "dequeuedOutputs",
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
.field public static final l:Lcom/otaliastudios/transcoder/internal/codec/Decoder$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic m:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Lw90/l;
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
.field public final c:Landroid/media/MediaFormat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/otaliastudios/transcoder/internal/codec/Decoder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Landroid/media/MediaCodec;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Landroid/media/MediaCodec$BufferInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lcom/otaliastudios/transcoder/internal/codec/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lkotlin/properties/ReadWriteProperty;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lkotlin/properties/ReadWriteProperty;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 3
    .line 4
    const-class v1, Lcom/otaliastudios/transcoder/internal/codec/Decoder;

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
    sput-object v2, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->m:[Lkotlin/reflect/KProperty;

    .line 40
    .line 41
    new-instance v0, Lcom/otaliastudios/transcoder/internal/codec/Decoder$Companion;

    .line 42
    const/4 v1, 0x0

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .line 47
    sput-object v0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->l:Lcom/otaliastudios/transcoder/internal/codec/Decoder$Companion;

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
    sput-object v0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->n:Lw90/l;

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

.method public constructor <init>(Landroid/media/MediaFormat;Z)V
    .locals 4
    .param p1    # Landroid/media/MediaFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "format"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/e;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->c:Landroid/media/MediaFormat;

    .line 11
    .line 12
    new-instance v0, Lw90/i;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    const-string v2, "Decoder("

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lr90/c;->a(Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/common/TrackType;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const/16 v2, 0x2c

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    sget-object v2, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->n:Lw90/l;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lr90/c;->a(Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/common/TrackType;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    invoke-interface {v2, v3}, Lw90/l;->M(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 50
    move-result v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const/16 v2, 0x29

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

    .line 68
    .line 69
    iput-object p0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->e:Lcom/otaliastudios/transcoder/internal/codec/Decoder;

    .line 70
    .line 71
    .line 72
    const-string/jumbo v0, "mime"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    const-string v0, "createDecoderByType(form\u2026(MediaFormat.KEY_MIME)!!)"

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 91
    .line 92
    new-instance p1, Lcom/otaliastudios/transcoder/internal/codec/Decoder$buffers$2;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder$buffers$2;-><init>(Lcom/otaliastudios/transcoder/internal/codec/Decoder;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->g:Lkotlin/Lazy;

    .line 102
    .line 103
    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    .line 104
    .line 105
    .line 106
    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 107
    .line 108
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->h:Landroid/media/MediaCodec$BufferInfo;

    .line 109
    .line 110
    new-instance p1, Lcom/otaliastudios/transcoder/internal/codec/c;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, p2}, Lcom/otaliastudios/transcoder/internal/codec/c;-><init>(Z)V

    .line 114
    .line 115
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->i:Lcom/otaliastudios/transcoder/internal/codec/c;

    .line 116
    .line 117
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 118
    const/4 p1, 0x0

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    new-instance p2, Lcom/otaliastudios/transcoder/internal/codec/Decoder$a;

    .line 125
    .line 126
    .line 127
    invoke-direct {p2, p1, p1, p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/otaliastudios/transcoder/internal/codec/Decoder;)V

    .line 128
    .line 129
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->j:Lkotlin/properties/ReadWriteProperty;

    .line 130
    .line 131
    new-instance p2, Lcom/otaliastudios/transcoder/internal/codec/Decoder$b;

    .line 132
    .line 133
    .line 134
    invoke-direct {p2, p1, p1, p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder$b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/otaliastudios/transcoder/internal/codec/Decoder;)V

    .line 135
    .line 136
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->k:Lkotlin/properties/ReadWriteProperty;

    .line 137
    return-void
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
.end method

.method public static final synthetic j(Lcom/otaliastudios/transcoder/internal/codec/Decoder;)Landroid/media/MediaCodec;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

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

.method public static final synthetic k(Lcom/otaliastudios/transcoder/internal/codec/Decoder;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->s()I

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

.method public static final synthetic l(Lcom/otaliastudios/transcoder/internal/codec/Decoder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->u()V

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

.method public static final synthetic m(Lcom/otaliastudios/transcoder/internal/codec/Decoder;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->w(I)V

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
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

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
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->r()I

    .line 14
    move-result v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->v(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->p()Lu90/a;

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
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

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
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->r()I

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
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->s()I

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

.method public bridge synthetic c(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/otaliastudios/transcoder/internal/codec/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->t(Lcom/otaliastudios/transcoder/internal/codec/a;)V

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

.method public g()Lcom/otaliastudios/transcoder/internal/pipeline/f;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f<",
            "Lcom/otaliastudios/transcoder/internal/codec/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->h:Landroid/media/MediaCodec$BufferInfo;

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x3

    .line 12
    .line 13
    if-eq v0, v1, :cond_6

    .line 14
    const/4 v1, -0x2

    .line 15
    .line 16
    if-eq v0, v1, :cond_5

    .line 17
    const/4 v1, -0x1

    .line 18
    .line 19
    if-eq v0, v1, :cond_4

    .line 20
    .line 21
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->h:Landroid/media/MediaCodec$BufferInfo;

    .line 22
    .line 23
    iget v4, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 24
    .line 25
    and-int/lit8 v4, v4, 0x4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x1

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    move v4, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v4, v5

    .line 33
    .line 34
    :goto_0
    if-eqz v4, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    move-result-object v1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_1
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->i:Lcom/otaliastudios/transcoder/internal/codec/c;

    .line 42
    .line 43
    iget-wide v7, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v7, v8}, Lcom/otaliastudios/transcoder/internal/codec/c;->d(J)Ljava/lang/Long;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    :goto_1
    if-eqz v1, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->s()I

    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v6

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v2}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->w(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->p()Lu90/a;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0}, Lu90/a;->b(I)Ljava/nio/ByteBuffer;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    const-string v3, "buffers.getOutputBuffer(result)"

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    new-instance v3, Lcom/otaliastudios/transcoder/internal/codec/b;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 76
    move-result-wide v5

    .line 77
    .line 78
    new-instance v1, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, p0, v0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder$drain$data$1;-><init>(Lcom/otaliastudios/transcoder/internal/codec/Decoder;I)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v3, v2, v5, v6, v1}, Lcom/otaliastudios/transcoder/internal/codec/b;-><init>(Ljava/nio/ByteBuffer;JLkotlin/jvm/functions/Function1;)V

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v3}, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;-><init>(Ljava/lang/Object;)V

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_2
    new-instance v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, v3}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;-><init>(Ljava/lang/Object;)V

    .line 98
    goto :goto_2

    .line 99
    .line 100
    :cond_3
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v0, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 104
    .line 105
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$d;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$d;

    .line 106
    .line 107
    :goto_2
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

    .line 108
    .line 109
    const-string v2, "drain(): returning "

    .line 110
    .line 111
    .line 112
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v2}, Lw90/i;->h(Ljava/lang/String;)V

    .line 117
    return-object v0

    .line 118
    .line 119
    :cond_4
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

    .line 120
    .line 121
    const-string v1, "drain(): got INFO_TRY_AGAIN_LATER, waiting."

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 125
    .line 126
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$d;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$d;

    .line 127
    return-object v0

    .line 128
    .line 129
    :cond_5
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

    .line 130
    .line 131
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    const-string v2, "drain(): got INFO_OUTPUT_FORMAT_CHANGED, handling format and retrying. format="

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/a;->f()Lcom/otaliastudios/transcoder/internal/pipeline/b;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    check-cast v0, Lcom/otaliastudios/transcoder/internal/codec/a;

    .line 151
    .line 152
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    const-string v2, "codec.outputFormat"

    .line 159
    .line 160
    .line 161
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v0, v1}, Lcom/otaliastudios/transcoder/internal/codec/a;->a(Landroid/media/MediaFormat;)V

    .line 165
    .line 166
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$c;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$c;

    .line 167
    return-object v0

    .line 168
    .line 169
    :cond_6
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

    .line 170
    .line 171
    const-string v1, "drain(): got INFO_OUTPUT_BUFFERS_CHANGED, retrying."

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->p()Lu90/a;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Lu90/a;->c()V

    .line 182
    .line 183
    sget-object v0, Lcom/otaliastudios/transcoder/internal/pipeline/f$c;->a:Lcom/otaliastudios/transcoder/internal/pipeline/f$c;

    .line 184
    return-object v0
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
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->q()Lcom/otaliastudios/transcoder/internal/codec/Decoder;

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
    check-cast p1, Lt90/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->n(Lt90/c;)V

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
    check-cast p1, Lt90/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->o(Lt90/c;)V

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

.method public n(Lt90/c;)V
    .locals 8
    .param p1    # Lt90/c;
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
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->r()I

    .line 9
    move-result v0

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->v(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lt90/c;->a()Laa0/b$a;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lt90/c;->b()I

    .line 22
    move-result v2

    .line 23
    .line 24
    iget-boolean v7, v0, Laa0/b$a;->b:Z

    .line 25
    .line 26
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 27
    .line 28
    iget-object p1, v0, Laa0/b$a;->a:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 32
    move-result v3

    .line 33
    .line 34
    iget-object p1, v0, Laa0/b$a;->a:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 38
    move-result v4

    .line 39
    .line 40
    iget-wide v5, v0, Laa0/b$a;->c:J

    .line 41
    .line 42
    .line 43
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 44
    .line 45
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->i:Lcom/otaliastudios/transcoder/internal/codec/c;

    .line 46
    .line 47
    iget-wide v1, v0, Laa0/b$a;->c:J

    .line 48
    .line 49
    iget-boolean v0, v0, Laa0/b$a;->d:Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1, v2, v0}, Lcom/otaliastudios/transcoder/internal/codec/c;->c(JZ)V

    .line 53
    return-void
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

.method public o(Lt90/c;)V
    .locals 8
    .param p1    # Lt90/c;
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
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

    .line 8
    .line 9
    const-string v1, "enqueueEos()!"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->r()I

    .line 16
    move-result v0

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->v(I)V

    .line 22
    .line 23
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lt90/c;->d()I

    .line 27
    move-result v2

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    const-wide/16 v5, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v7, 0x4

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 36
    return-void
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

.method public final p()Lu90/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->g:Lkotlin/Lazy;

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

.method public q()Lcom/otaliastudios/transcoder/internal/codec/Decoder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->e:Lcom/otaliastudios/transcoder/internal/codec/Decoder;

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

.method public final r()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->j:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->m:[Lkotlin/reflect/KProperty;

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

.method public release()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

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
    const-string/jumbo v2, "release(): releasing codec. dequeuedInputs="

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->r()I

    .line 17
    move-result v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, " dequeuedOutputs="

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->s()I

    .line 29
    move-result v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final s()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->k:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->m:[Lkotlin/reflect/KProperty;

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

.method public t(Lcom/otaliastudios/transcoder/internal/codec/a;)V
    .locals 4
    .param p1    # Lcom/otaliastudios/transcoder/internal/codec/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "next"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/otaliastudios/transcoder/internal/pipeline/a;->c(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->d:Lw90/i;

    .line 12
    .line 13
    const-string v1, "initialize()"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->c:Landroid/media/MediaFormat;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0}, Lcom/otaliastudios/transcoder/internal/codec/a;->e(Landroid/media/MediaFormat;)Landroid/view/Surface;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->c:Landroid/media/MediaFormat;

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 32
    .line 33
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->f:Landroid/media/MediaCodec;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    .line 37
    return-void
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

.method public final u()V
    .locals 0

    .line 1
    return-void
    .line 2
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
.end method

.method public final v(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->j:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->m:[Lkotlin/reflect/KProperty;

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

.method public final w(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->k:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/codec/Decoder;->m:[Lkotlin/reflect/KProperty;

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
