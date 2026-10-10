.class final Lcom/tencent/liteav/a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/a;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/a$4;->a:Lcom/tencent/liteav/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/a$4;->a:Lcom/tencent/liteav/a;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/tencent/liteav/a;->t(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/renderer/c;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/tencent/liteav/a$4;->a:Lcom/tencent/liteav/a;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/liteav/txcvodplayer/renderer/c;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/c;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lcom/tencent/liteav/a;->a(Lcom/tencent/liteav/a;Lcom/tencent/liteav/txcvodplayer/renderer/c;)Lcom/tencent/liteav/txcvodplayer/renderer/c;

    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/a$4;->a:Lcom/tencent/liteav/a;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/tencent/liteav/a;->t(Lcom/tencent/liteav/a;)Lcom/tencent/liteav/txcvodplayer/renderer/c;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    const-string v0, "SubtitleRender"

    .line 27
    .line 28
    if-nez p2, :cond_1

    .line 29
    .line 30
    const-string p1, "[renderToBitmap] subtitleFrameBuffer is null"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const/4 p1, 0x0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "[renderToBitmap] subtitleFrameBuffer, trackId: "

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    iget v2, p2, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->trackID:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, " ,width: "

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->getSrcWidth()I

    .line 56
    move-result v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v2, ", height: "

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->getSrcHeight()I

    .line 68
    move-result v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    iget-object v0, p1, Lcom/tencent/liteav/txcvodplayer/renderer/c;->a:Landroid/graphics/Bitmap;

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 86
    move-result v0

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->getSrcWidth()I

    .line 90
    move-result v1

    .line 91
    .line 92
    if-ne v0, v1, :cond_2

    .line 93
    .line 94
    iget-object v0, p1, Lcom/tencent/liteav/txcvodplayer/renderer/c;->a:Landroid/graphics/Bitmap;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 98
    move-result v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->getSrcHeight()I

    .line 102
    move-result v1

    .line 103
    .line 104
    if-eq v0, v1, :cond_3

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->getSrcWidth()I

    .line 108
    move-result v0

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->getSrcHeight()I

    .line 112
    move-result v1

    .line 113
    .line 114
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    iput-object v0, p1, Lcom/tencent/liteav/txcvodplayer/renderer/c;->a:Landroid/graphics/Bitmap;

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {p2}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleFrameBuffer;->getData()[[B

    .line 124
    move-result-object p2

    .line 125
    const/4 v0, 0x0

    .line 126
    .line 127
    aget-object p2, p2, v0

    .line 128
    .line 129
    .line 130
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 131
    move-result-object p2

    .line 132
    .line 133
    iget-object v0, p1, Lcom/tencent/liteav/txcvodplayer/renderer/c;->a:Landroid/graphics/Bitmap;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p2}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 137
    .line 138
    iget-object p1, p1, Lcom/tencent/liteav/txcvodplayer/renderer/c;->a:Landroid/graphics/Bitmap;

    .line 139
    .line 140
    :goto_0
    iget-object p2, p0, Lcom/tencent/liteav/a$4;->a:Lcom/tencent/liteav/a;

    .line 141
    .line 142
    .line 143
    invoke-static {p2}, Lcom/tencent/liteav/a;->u(Lcom/tencent/liteav/a;)Lcom/tencent/rtmp/ui/TXSubtitleView;

    .line 144
    move-result-object p2

    .line 145
    .line 146
    if-eqz p2, :cond_4

    .line 147
    .line 148
    iget-object p2, p0, Lcom/tencent/liteav/a$4;->a:Lcom/tencent/liteav/a;

    .line 149
    .line 150
    .line 151
    invoke-static {p2}, Lcom/tencent/liteav/a;->u(Lcom/tencent/liteav/a;)Lcom/tencent/rtmp/ui/TXSubtitleView;

    .line 152
    move-result-object p2

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2, p1}, Lcom/tencent/rtmp/ui/TXSubtitleView;->show(Landroid/graphics/Bitmap;)V

    .line 156
    :cond_4
    return-void
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
