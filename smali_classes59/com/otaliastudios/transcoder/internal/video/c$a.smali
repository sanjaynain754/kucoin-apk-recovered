.class public final Lcom/otaliastudios/transcoder/internal/video/c$a;
.super Ljava/lang/Object;
.source "FrameDropper.kt"

# interfaces
.implements Lcom/otaliastudios/transcoder/internal/video/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/video/c;->a(II)Lcom/otaliastudios/transcoder/internal/video/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000cR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000cR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "com/otaliastudios/transcoder/internal/video/c$a",
        "Lcom/otaliastudios/transcoder/internal/video/b;",
        "",
        "timeUs",
        "",
        "a",
        "(J)Z",
        "Lw90/i;",
        "Lw90/i;",
        "log",
        "",
        "b",
        "D",
        "inputSpf",
        "c",
        "outputSpf",
        "d",
        "currentSpf",
        "",
        "e",
        "I",
        "frameCount",
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
.field public final a:Lw90/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:D

.field public final c:D

.field public d:D

.field public e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(II)V
    .locals 4

    .line 1
    .line 2
    iput p1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->f:I

    .line 3
    .line 4
    iput p2, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->g:I

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    new-instance v0, Lw90/i;

    .line 10
    .line 11
    const-string v1, "FrameDropper"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lw90/i;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->a:Lw90/i;

    .line 17
    int-to-double v0, p1

    .line 18
    .line 19
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 20
    .line 21
    div-double v0, v2, v0

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->b:D

    .line 24
    int-to-double p1, p2

    .line 25
    div-double/2addr v2, p1

    .line 26
    .line 27
    iput-wide v2, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->c:D

    .line 28
    return-void
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
.method public a(J)Z
    .locals 6

    .line 1
    .line 2
    iget-wide p1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->d:D

    .line 3
    .line 4
    iget-wide v0, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->b:D

    .line 5
    add-double/2addr p1, v0

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->d:D

    .line 8
    .line 9
    iget v0, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->e:I

    .line 10
    .line 11
    add-int/lit8 v1, v0, 0x1

    .line 12
    .line 13
    iput v1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->e:I

    .line 14
    .line 15
    const-string v1, " outputSpf="

    .line 16
    .line 17
    const-string v2, " inputSpf="

    .line 18
    const/4 v3, 0x1

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->a:Lw90/i;

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    const-string v0, "RENDERING (first frame) - currentSpf="

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    iget-wide v4, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->d:D

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-wide v4, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->b:D

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    iget-wide v0, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->c:D

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    move-result-object p2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lw90/i;->h(Ljava/lang/String;)V

    .line 61
    return v3

    .line 62
    .line 63
    :cond_0
    iget-wide v4, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->c:D

    .line 64
    .line 65
    cmpl-double v0, p1, v4

    .line 66
    .line 67
    if-lez v0, :cond_1

    .line 68
    sub-double/2addr p1, v4

    .line 69
    .line 70
    iput-wide p1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->d:D

    .line 71
    .line 72
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->a:Lw90/i;

    .line 73
    .line 74
    new-instance p2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    const-string v0, "RENDERING - currentSpf="

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    iget-wide v4, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->d:D

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget-wide v4, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->b:D

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    iget-wide v0, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->c:D

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    move-result-object p2

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2}, Lw90/i;->h(Ljava/lang/String;)V

    .line 111
    return v3

    .line 112
    .line 113
    :cond_1
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->a:Lw90/i;

    .line 114
    .line 115
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    const-string v0, "DROPPING - currentSpf="

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    iget-wide v3, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->d:D

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    iget-wide v2, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->b:D

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    iget-wide v0, p0, Lcom/otaliastudios/transcoder/internal/video/c$a;->c:D

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    move-result-object p2

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p2}, Lw90/i;->h(Ljava/lang/String;)V

    .line 152
    const/4 p1, 0x0

    .line 153
    return p1
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
.end method
