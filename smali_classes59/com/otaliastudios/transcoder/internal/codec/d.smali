.class public final Lcom/otaliastudios/transcoder/internal/codec/d;
.super Lcom/otaliastudios/transcoder/internal/pipeline/c;
.source "DecoderTimer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/otaliastudios/transcoder/internal/pipeline/c<",
        "Lcom/otaliastudios/transcoder/internal/codec/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000e2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/codec/d;",
        "Lcom/otaliastudios/transcoder/internal/pipeline/c;",
        "Lcom/otaliastudios/transcoder/internal/codec/b;",
        "Lcom/otaliastudios/transcoder/internal/codec/a;",
        "Lcom/otaliastudios/transcoder/common/TrackType;",
        "track",
        "Lda0/b;",
        "interpolator",
        "<init>",
        "(Lcom/otaliastudios/transcoder/common/TrackType;Lda0/b;)V",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;",
        "state",
        "",
        "fresh",
        "Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "b",
        "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;",
        "c",
        "Lcom/otaliastudios/transcoder/common/TrackType;",
        "d",
        "Lda0/b;",
        "",
        "e",
        "Ljava/lang/Long;",
        "lastTimeUs",
        "f",
        "lastRawTimeUs",
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
.field public final c:Lcom/otaliastudios/transcoder/common/TrackType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lda0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/common/TrackType;Lda0/b;)V
    .locals 1
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lda0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "track"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "interpolator"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/pipeline/c;-><init>()V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->c:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->d:Lda0/b;

    .line 19
    return-void
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
.method public b(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;
    .locals 9
    .param p1    # Lcom/otaliastudios/transcoder/internal/pipeline/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f$b<",
            "Lcom/otaliastudios/transcoder/internal/codec/b;",
            ">;Z)",
            "Lcom/otaliastudios/transcoder/internal/pipeline/f<",
            "Lcom/otaliastudios/transcoder/internal/codec/b;",
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
    instance-of p2, p1, Lcom/otaliastudios/transcoder/internal/pipeline/f$a;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    return-object p1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;->a()Ljava/lang/Object;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    instance-of p2, p2, Lcom/otaliastudios/transcoder/internal/codec/e;

    .line 18
    .line 19
    if-nez p2, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;->a()Ljava/lang/Object;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    check-cast p2, Lcom/otaliastudios/transcoder/internal/codec/b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/otaliastudios/transcoder/internal/codec/b;->c()J

    .line 29
    move-result-wide v2

    .line 30
    .line 31
    iget-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->d:Lda0/b;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->c:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, v0, v2, v3}, Lda0/b;->a(Lcom/otaliastudios/transcoder/common/TrackType;J)J

    .line 37
    move-result-wide v4

    .line 38
    .line 39
    iget-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->e:Ljava/lang/Long;

    .line 40
    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 44
    :goto_0
    move-wide v6, v0

    .line 45
    goto :goto_1

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 52
    move-result-wide v0

    .line 53
    .line 54
    sub-long v0, v4, v0

    .line 55
    .line 56
    iget-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->f:Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 63
    move-result-wide v6

    .line 64
    .line 65
    sub-long v6, v2, v6

    .line 66
    long-to-double v0, v0

    .line 67
    long-to-double v6, v6

    .line 68
    div-double/2addr v0, v6

    .line 69
    goto :goto_0

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->e:Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    iput-object p2, p0, Lcom/otaliastudios/transcoder/internal/codec/d;->f:Ljava/lang/Long;

    .line 82
    .line 83
    new-instance p2, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;

    .line 84
    .line 85
    new-instance v0, Lcom/otaliastudios/transcoder/internal/codec/e;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;->a()Ljava/lang/Object;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    check-cast v1, Lcom/otaliastudios/transcoder/internal/codec/b;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/codec/b;->a()Ljava/nio/ByteBuffer;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;->a()Ljava/lang/Object;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    check-cast p1, Lcom/otaliastudios/transcoder/internal/codec/b;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/otaliastudios/transcoder/internal/codec/b;->b()Lkotlin/jvm/functions/Function1;

    .line 105
    move-result-object v8

    .line 106
    .line 107
    .line 108
    invoke-direct/range {v0 .. v8}, Lcom/otaliastudios/transcoder/internal/codec/e;-><init>(Ljava/nio/ByteBuffer;JJDLkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p2, v0}, Lcom/otaliastudios/transcoder/internal/pipeline/f$b;-><init>(Ljava/lang/Object;)V

    .line 112
    return-object p2

    .line 113
    .line 114
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    const-string p2, "Can\'t apply DecoderTimer twice."

    .line 117
    .line 118
    .line 119
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 120
    throw p1
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
