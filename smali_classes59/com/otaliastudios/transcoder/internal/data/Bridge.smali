.class public final Lcom/otaliastudios/transcoder/internal/data/Bridge;
.super Ljava/lang/Object;
.source "Bridge.kt"

# interfaces
.implements Lcom/otaliastudios/transcoder/internal/pipeline/g;
.implements Lt90/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/g<",
        "Lt90/c;",
        "Lt90/b;",
        "Lt90/g;",
        "Lt90/f;",
        ">;",
        "Lt90/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J+\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00172\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001c\u0010\r\u001a\n \"*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u001a\u0010(\u001a\u00020\u00008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008%\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/data/Bridge;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/g;",
        "Lt90/c;",
        "Lt90/b;",
        "Lt90/g;",
        "Lt90/f;",
        "Landroid/media/MediaFormat;",
        "format",
        "<init>",
        "(Landroid/media/MediaFormat;)V",
        "Lkotlin/Pair;",
        "Ljava/nio/ByteBuffer;",
        "",
        "buffer",
        "()Lkotlin/Pair;",
        "next",
        "",
        "g",
        "(Lt90/f;)V",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;",
        "state",
        "",
        "fresh",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "b",
        "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "Landroid/media/MediaFormat;",
        "Lw90/i;",
        "c",
        "Lw90/i;",
        "log",
        "d",
        "I",
        "bufferSize",
        "kotlin.jvm.PlatformType",
        "e",
        "Ljava/nio/ByteBuffer;",
        "f",
        "Lcom/otaliastudios/transcoder/internal/data/Bridge;",
        "()Lcom/otaliastudios/transcoder/internal/data/Bridge;",
        "channel",
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
.field public final b:Landroid/media/MediaFormat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:I

.field public final e:Ljava/nio/ByteBuffer;

.field public final f:Lcom/otaliastudios/transcoder/internal/data/Bridge;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/media/MediaFormat;)V
    .locals 2
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->b:Landroid/media/MediaFormat;

    .line 11
    .line 12
    new-instance v0, Lw90/i;

    .line 13
    .line 14
    const-string v1, "Bridge"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->c:Lw90/i;

    .line 20
    .line 21
    const-string v0, "max-input-size"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 25
    move-result p1

    .line 26
    .line 27
    iput p1, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->d:I

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->e:Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    iput-object p0, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->f:Lcom/otaliastudios/transcoder/internal/data/Bridge;

    .line 44
    return-void
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


# virtual methods
.method public b(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;
    .locals 6
    .param p1    # Lcom/otaliastudios/transcoder/internal/pipeline/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f$b<",
            "Lt90/c;",
            ">;Z)",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f<",
            "Lt90/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo p2, "state"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;->a()Ljava/lang/Object;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    check-cast p2, Lt90/c;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lt90/c;->a()Laa0/b$a;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    iget-boolean v4, p2, Laa0/b$a;->b:Z

    .line 19
    .line 20
    new-instance v0, Lt90/g;

    .line 21
    .line 22
    iget-object v1, p2, Laa0/b$a;->a:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    const-string v2, "chunk.buffer"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    iget-wide v2, p2, Laa0/b$a;->c:J

    .line 30
    .line 31
    sget-object v5, Lcom/otaliastudios/transcoder/internal/data/Bridge$step$result$1;->INSTANCE:Lcom/otaliastudios/transcoder/internal/data/Bridge$step$result$1;

    .line 32
    .line 33
    .line 34
    invoke-direct/range {v0 .. v5}, Lt90/g;-><init>(Ljava/nio/ByteBuffer;JILkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    instance-of p1, p1, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    new-instance p1, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, v0}, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;-><init>(Ljava/lang/Object;)V

    .line 44
    return-object p1

    .line 45
    .line 46
    :cond_0
    new-instance p1, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;-><init>(Ljava/lang/Object;)V

    .line 50
    return-object p1
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
.end method

.method public buffer()Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->e:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->e:Ljava/nio/ByteBuffer;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public bridge synthetic c(Lcom/otaliastudios/transcoder/internal/pipeline/b;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lt90/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/data/Bridge;->g(Lt90/f;)V

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

.method public f()Lcom/otaliastudios/transcoder/internal/data/Bridge;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->f:Lcom/otaliastudios/transcoder/internal/data/Bridge;

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

.method public g(Lt90/f;)V
    .locals 3
    .param p1    # Lt90/f;
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
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->c:Lw90/i;

    .line 9
    .line 10
    const-string v1, "initialize(): format="

    .line 11
    .line 12
    iget-object v2, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->b:Landroid/media/MediaFormat;

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/data/Bridge;->b:Landroid/media/MediaFormat;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v0}, Lt90/f;->d(Landroid/media/MediaFormat;)V

    .line 25
    return-void
.end method

.method public bridge synthetic getChannel()Lcom/otaliastudios/transcoder/internal/pipeline/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/otaliastudios/transcoder/internal/data/Bridge;->f()Lcom/otaliastudios/transcoder/internal/data/Bridge;

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

.method public release()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/g$a;->b(Lcom/otaliastudios/transcoder/internal/pipeline/g;)V

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
.end method
