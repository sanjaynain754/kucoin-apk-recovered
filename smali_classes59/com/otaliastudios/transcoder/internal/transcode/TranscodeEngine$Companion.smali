.class public final Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;
.super Ljava/lang/Object;
.source "TranscodeEngine.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;",
        "",
        "<init>",
        "()V",
        "Lq90/e;",
        "options",
        "",
        "transcode",
        "(Lq90/e;)V",
        "",
        "",
        "a",
        "(Ljava/lang/Throwable;)Z",
        "Lw90/i;",
        "log",
        "Lw90/i;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    return v1

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    if-nez p1, :cond_2

    .line 25
    return v1

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;->a(Ljava/lang/Throwable;)Z

    .line 29
    move-result p1

    .line 30
    return p1
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
.end method

.method public final transcode(Lq90/e;)V
    .locals 12
    .param p1    # Lq90/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "options"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->a()Lw90/i;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "transcode(): called..."

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lw90/i;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v1, Lcom/otaliastudios/transcoder/internal/transcode/a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p1}, Lcom/otaliastudios/transcoder/internal/transcode/a;-><init>(Lq90/e;)V

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    :try_start_0
    new-instance v4, Lcom/otaliastudios/transcoder/internal/a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v4, p1}, Lcom/otaliastudios/transcoder/internal/a;-><init>(Lq90/e;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lq90/e;->q()Lz90/a;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lq90/e;->x()Lba0/e;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lq90/e;->p()Lba0/e;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v3}, Lw90/m;->c(Ljava/lang/Object;Ljava/lang/Object;)Lw90/l;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lq90/e;->u()Lea0/b;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lq90/e;->w()I

    .line 51
    move-result v8

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lq90/e;->t()Lda0/b;

    .line 55
    move-result-object v11

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lq90/e;->o()Lca0/a;

    .line 59
    move-result-object v9

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lq90/e;->n()Lx90/a;

    .line 63
    move-result-object v10

    .line 64
    .line 65
    new-instance v3, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;

    .line 66
    .line 67
    const-string p1, "dataSink"

    .line 68
    .line 69
    .line 70
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string/jumbo p1, "validator"

    .line 74
    .line 75
    .line 76
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    const-string p1, "audioStretcher"

    .line 79
    .line 80
    .line 81
    invoke-static {v9, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    const-string p1, "audioResampler"

    .line 84
    .line 85
    .line 86
    invoke-static {v10, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string/jumbo p1, "timeInterpolator"

    .line 90
    .line 91
    .line 92
    invoke-static {v11, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-direct/range {v3 .. v11}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;-><init>(Lcom/otaliastudios/transcoder/internal/a;Lz90/a;Lw90/l;Lea0/b;ILca0/a;Lx90/a;Lda0/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 96
    .line 97
    .line 98
    :try_start_1
    invoke-virtual {v3}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->h()Z

    .line 99
    move-result p1

    .line 100
    .line 101
    if-nez p1, :cond_0

    .line 102
    const/4 p1, 0x1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p1}, Lcom/otaliastudios/transcoder/internal/transcode/a;->e(I)V

    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    move-object v2, v3

    .line 110
    goto :goto_3

    .line 111
    :catch_0
    move-exception v0

    .line 112
    move-object p1, v0

    .line 113
    move-object v2, v3

    .line 114
    goto :goto_1

    .line 115
    .line 116
    :cond_0
    new-instance p1, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion$transcode$1;

    .line 117
    .line 118
    .line 119
    invoke-direct {p1, v1}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion$transcode$1;-><init>(Lcom/otaliastudios/transcoder/internal/transcode/a;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, p1}, Lcom/otaliastudios/transcoder/internal/transcode/DefaultTranscodeEngine;->g(Lkotlin/jvm/functions/Function1;)V

    .line 123
    const/4 p1, 0x0

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, p1}, Lcom/otaliastudios/transcoder/internal/transcode/a;->e(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    :goto_0
    invoke-virtual {v3}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->b()V

    .line 130
    return-void

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    move-object p1, v0

    .line 133
    goto :goto_3

    .line 134
    :catch_1
    move-exception v0

    .line 135
    move-object p1, v0

    .line 136
    .line 137
    .line 138
    :goto_1
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine$Companion;->a(Ljava/lang/Throwable;)Z

    .line 139
    move-result v0

    .line 140
    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->a()Lw90/i;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    const-string v3, "Transcode canceled."

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v3, p1}, Lw90/i;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/otaliastudios/transcoder/internal/transcode/a;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 154
    .line 155
    if-nez v2, :cond_1

    .line 156
    goto :goto_2

    .line 157
    .line 158
    .line 159
    :cond_1
    invoke-virtual {v2}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->b()V

    .line 160
    :goto_2
    return-void

    .line 161
    .line 162
    .line 163
    :cond_2
    :try_start_3
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->a()Lw90/i;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    const-string v3, "Unexpected error while transcoding."

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v3, p1}, Lw90/i;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, p1}, Lcom/otaliastudios/transcoder/internal/transcode/a;->c(Ljava/lang/Throwable;)V

    .line 173
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 174
    .line 175
    :goto_3
    if-nez v2, :cond_3

    .line 176
    goto :goto_4

    .line 177
    .line 178
    .line 179
    :cond_3
    invoke-virtual {v2}, Lcom/otaliastudios/transcoder/internal/transcode/TranscodeEngine;->b()V

    .line 180
    :goto_4
    throw p1
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
.end method
