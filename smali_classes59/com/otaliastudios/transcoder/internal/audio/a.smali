.class public final Lcom/otaliastudios/transcoder/internal/audio/a;
.super Ljava/lang/Object;
.source "chunks.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ3\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0015\u0010\u0016Jh\u0010\u001d\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0008(\u000b\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0008(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00028\u00000\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001fR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/audio/a;",
        "",
        "",
        "sampleRate",
        "channels",
        "<init>",
        "(II)V",
        "",
        "d",
        "()Z",
        "Ljava/nio/ShortBuffer;",
        "buffer",
        "",
        "timeUs",
        "",
        "timeStretch",
        "Lkotlin/Function0;",
        "",
        "release",
        "b",
        "(Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;)V",
        "c",
        "()V",
        "T",
        "eos",
        "Lkotlin/Function3;",
        "Lkotlin/ParameterName;",
        "name",
        "action",
        "a",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;",
        "I",
        "Lkotlin/collections/ArrayDeque;",
        "Lcom/otaliastudios/transcoder/internal/audio/Chunk;",
        "Lkotlin/collections/ArrayDeque;",
        "queue",
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
.field public final a:I

.field public final b:I

.field public final c:Lkotlin/collections/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/collections/ArrayDeque<",
            "Lcom/otaliastudios/transcoder/internal/audio/Chunk;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->a:I

    .line 6
    .line 7
    iput p2, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->b:I

    .line 8
    .line 9
    new-instance p1, Lkotlin/collections/ArrayDeque;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Lkotlin/collections/ArrayDeque;-><init>()V

    .line 13
    .line 14
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->c:Lkotlin/collections/ArrayDeque;

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
.method public final a(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;
    .locals 10
    .param p2    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/nio/ShortBuffer;",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Ljava/lang/Double;",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "action"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->c:Lkotlin/collections/ArrayDeque;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lkotlin/collections/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    move-object v1, v0

    .line 13
    .line 14
    check-cast v1, Lcom/otaliastudios/transcoder/internal/audio/Chunk;

    .line 15
    .line 16
    sget-object v0, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->e:Lcom/otaliastudios/transcoder/internal/audio/Chunk$Companion;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/otaliastudios/transcoder/internal/audio/Chunk$Companion;->getEos()Lcom/otaliastudios/transcoder/internal/audio/Chunk;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-ne v1, v0, :cond_0

    .line 23
    return-object p1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->d()Ljava/nio/ShortBuffer;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 31
    move-result p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->d()Ljava/nio/ShortBuffer;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 39
    move-result v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->d()Ljava/nio/ShortBuffer;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->g()J

    .line 47
    move-result-wide v3

    .line 48
    .line 49
    .line 50
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->f()D

    .line 55
    move-result-wide v4

    .line 56
    .line 57
    .line 58
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    invoke-interface {p2, v2, v3, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->d()Ljava/nio/ShortBuffer;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/nio/ShortBuffer;->limit(I)Ljava/nio/Buffer;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->d()Ljava/nio/ShortBuffer;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 78
    move-result v0

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->d()Ljava/nio/ShortBuffer;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 88
    move-result v0

    .line 89
    sub-int/2addr p1, v0

    .line 90
    .line 91
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->c:Lkotlin/collections/ArrayDeque;

    .line 92
    .line 93
    iget v2, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->a:I

    .line 94
    .line 95
    iget v3, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->b:I

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v2, v3}, Lcom/otaliastudios/transcoder/internal/audio/b;->d(III)J

    .line 99
    move-result-wide v3

    .line 100
    .line 101
    const/16 v8, 0xd

    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v2, 0x0

    .line 104
    .line 105
    const-wide/16 v5, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v1 .. v9}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->c(Lcom/otaliastudios/transcoder/internal/audio/Chunk;Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/otaliastudios/transcoder/internal/audio/Chunk;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Lkotlin/collections/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 114
    return-object p2

    .line 115
    .line 116
    .line 117
    :cond_1
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->e()Lkotlin/jvm/functions/Function0;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    .line 121
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 122
    return-object p2
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

.method public final b(Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;)V
    .locals 8
    .param p1    # Ljava/nio/ShortBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ShortBuffer;",
            "JD",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "buffer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "release"

    .line 9
    .line 10
    .line 11
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->c:Lkotlin/collections/ArrayDeque;

    .line 20
    .line 21
    new-instance v1, Lcom/otaliastudios/transcoder/internal/audio/Chunk;

    .line 22
    move-object v2, p1

    .line 23
    move-wide v3, p2

    .line 24
    move-wide v5, p4

    .line 25
    move-object v7, p6

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v1 .. v7}, Lcom/otaliastudios/transcoder/internal/audio/Chunk;-><init>(Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lkotlin/collections/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 32
    return-void

    .line 33
    :cond_0
    move-object v7, p6

    .line 34
    .line 35
    .line 36
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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
.end method

.method public final c()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->c:Lkotlin/collections/ArrayDeque;

    .line 3
    .line 4
    sget-object v1, Lcom/otaliastudios/transcoder/internal/audio/Chunk;->e:Lcom/otaliastudios/transcoder/internal/audio/Chunk$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/audio/Chunk$Companion;->getEos()Lcom/otaliastudios/transcoder/internal/audio/Chunk;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lkotlin/collections/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final d()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/audio/a;->c:Lkotlin/collections/ArrayDeque;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlin/collections/ArrayDeque;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
