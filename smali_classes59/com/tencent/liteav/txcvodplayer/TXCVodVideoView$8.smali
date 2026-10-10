.class final Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

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
.method public final a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->getInstance()Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/txcplayer/ext/service/RenderProcessService;->setSurfaceBufferSize(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "setSurfaceBufferSize succeed"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 19
    .line 20
    :cond_0
    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d()Z

    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 32
    .line 33
    const-string v1, "has advanced license!"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->checkSubtitle()V

    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    .line 57
    .line 58
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 62
    move-result v0

    .line 63
    const/4 v1, 0x1

    .line 64
    const/4 v2, 0x3

    .line 65
    .line 66
    if-ne v0, v1, :cond_5

    .line 67
    .line 68
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 69
    .line 70
    const/16 v1, 0x7dd

    .line 71
    .line 72
    const-string v3, "VOD ready(EVT_VOD_PLAY_PREPARED)"

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1, v3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 76
    .line 77
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/e;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    iget-boolean v0, v0, Lcom/tencent/liteav/txcplayer/e;->p:Z

    .line 84
    const/4 v1, 0x4

    .line 85
    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 98
    move-result v0

    .line 99
    .line 100
    if-eq v0, v1, :cond_4

    .line 101
    .line 102
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 106
    .line 107
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 108
    const/4 v1, 0x2

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 112
    .line 113
    :cond_5
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)J

    .line 117
    .line 118
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 122
    move-result v0

    .line 123
    const/4 v1, -0x1

    .line 124
    .line 125
    if-ne v0, v1, :cond_6

    .line 126
    .line 127
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 131
    .line 132
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 133
    .line 134
    .line 135
    invoke-static {v0, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 136
    .line 137
    :cond_6
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 138
    .line 139
    .line 140
    invoke-interface {p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoWidth()I

    .line 141
    move-result v1

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 145
    .line 146
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 147
    .line 148
    .line 149
    invoke-interface {p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoHeight()I

    .line 150
    move-result p1

    .line 151
    .line 152
    .line 153
    invoke-static {v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 154
    .line 155
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 156
    .line 157
    .line 158
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 159
    move-result p1

    .line 160
    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 164
    .line 165
    .line 166
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 167
    move-result p1

    .line 168
    .line 169
    if-eqz p1, :cond_7

    .line 170
    .line 171
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    if-eqz p1, :cond_7

    .line 178
    .line 179
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 183
    move-result-object p1

    .line 184
    .line 185
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 189
    move-result v0

    .line 190
    .line 191
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 192
    .line 193
    .line 194
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 195
    move-result v1

    .line 196
    .line 197
    .line 198
    invoke-interface {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->a(II)V

    .line 199
    .line 200
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 201
    .line 202
    .line 203
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 204
    move-result-object p1

    .line 205
    .line 206
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 207
    .line 208
    .line 209
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 210
    move-result v0

    .line 211
    .line 212
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 213
    .line 214
    .line 215
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 216
    move-result v1

    .line 217
    .line 218
    .line 219
    invoke-interface {p1, v0, v1}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->b(II)V

    .line 220
    .line 221
    :cond_7
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 222
    .line 223
    .line 224
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 225
    move-result p1

    .line 226
    .line 227
    if-ne p1, v2, :cond_8

    .line 228
    .line 229
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$8;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 230
    const/4 v0, 0x0

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Z)V

    .line 234
    :cond_8
    return-void
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
