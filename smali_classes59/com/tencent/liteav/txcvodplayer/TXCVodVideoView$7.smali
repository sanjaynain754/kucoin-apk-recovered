.class final Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;


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
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

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
.method public final a(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;IILjava/lang/String;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p2

    .line 5
    .line 6
    move/from16 v2, p3

    .line 7
    .line 8
    move-object/from16 v3, p4

    .line 9
    .line 10
    iget-object v4, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 11
    .line 12
    .line 13
    invoke-static {v4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 14
    move-result v4

    .line 15
    .line 16
    const/16 v5, 0x10

    .line 17
    .line 18
    if-eq v4, v2, :cond_0

    .line 19
    .line 20
    iget-object v4, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 21
    .line 22
    .line 23
    invoke-static {v4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 24
    move-result v4

    .line 25
    sub-int/2addr v4, v2

    .line 26
    .line 27
    .line 28
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 29
    move-result v4

    .line 30
    .line 31
    if-gt v4, v5, :cond_1

    .line 32
    .line 33
    :cond_0
    iget-object v4, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 34
    .line 35
    .line 36
    invoke-static {v4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 37
    move-result v4

    .line 38
    .line 39
    if-eq v4, v1, :cond_2

    .line 40
    .line 41
    iget-object v4, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 45
    move-result v4

    .line 46
    sub-int/2addr v4, v1

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 50
    move-result v4

    .line 51
    .line 52
    if-le v4, v5, :cond_2

    .line 53
    :cond_1
    const/4 v4, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 v4, 0x0

    .line 56
    .line 57
    :goto_0
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 58
    .line 59
    .line 60
    invoke-interface/range {p1 .. p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoWidth()I

    .line 61
    move-result v6

    .line 62
    .line 63
    .line 64
    invoke-static {v5, v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 65
    .line 66
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 67
    .line 68
    .line 69
    invoke-interface/range {p1 .. p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoHeight()I

    .line 70
    move-result v6

    .line 71
    .line 72
    .line 73
    invoke-static {v5, v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 74
    .line 75
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 76
    .line 77
    .line 78
    invoke-interface/range {p1 .. p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoSarNum()I

    .line 79
    move-result v6

    .line 80
    .line 81
    .line 82
    invoke-static {v5, v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 83
    .line 84
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 85
    .line 86
    .line 87
    invoke-interface/range {p1 .. p1}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getVideoSarDen()I

    .line 88
    move-result v6

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v6}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 92
    .line 93
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getSupportedBitrates()Ljava/util/ArrayList;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    .line 106
    const-wide/32 v6, 0x7fffffff

    .line 107
    .line 108
    .line 109
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    move-result v8

    .line 111
    .line 112
    if-eqz v8, :cond_4

    .line 113
    .line 114
    .line 115
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    move-result-object v8

    .line 117
    .line 118
    check-cast v8, Lcom/tencent/liteav/txcplayer/model/a;

    .line 119
    .line 120
    iget-object v9, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 121
    .line 122
    .line 123
    invoke-static {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 124
    move-result v9

    .line 125
    .line 126
    iget-object v10, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 127
    .line 128
    .line 129
    invoke-static {v10}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 130
    move-result v10

    .line 131
    mul-int/2addr v9, v10

    .line 132
    .line 133
    iget v10, v8, Lcom/tencent/liteav/txcplayer/model/a;->b:I

    .line 134
    .line 135
    iget v11, v8, Lcom/tencent/liteav/txcplayer/model/a;->c:I

    .line 136
    mul-int/2addr v10, v11

    .line 137
    sub-int/2addr v9, v10

    .line 138
    .line 139
    .line 140
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    .line 141
    move-result v9

    .line 142
    int-to-long v9, v9

    .line 143
    .line 144
    cmp-long v11, v9, v6

    .line 145
    .line 146
    if-gez v11, :cond_3

    .line 147
    .line 148
    iget-object v6, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 149
    .line 150
    iget v7, v8, Lcom/tencent/liteav/txcplayer/model/a;->b:I

    .line 151
    int-to-long v11, v7

    .line 152
    .line 153
    iget v7, v8, Lcom/tencent/liteav/txcplayer/model/a;->c:I

    .line 154
    int-to-long v7, v7

    .line 155
    mul-long/2addr v11, v7

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v11, v12}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;J)J

    .line 159
    move-wide v6, v9

    .line 160
    goto :goto_1

    .line 161
    .line 162
    :cond_4
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 163
    .line 164
    .line 165
    invoke-static {v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;

    .line 166
    move-result-object v5

    .line 167
    .line 168
    const/16 v6, 0xcd

    .line 169
    .line 170
    .line 171
    invoke-interface {v5, v6}, Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;->getPropertyLong(I)J

    .line 172
    move-result-wide v5

    .line 173
    .line 174
    iget-object v7, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 175
    .line 176
    new-instance v8, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v9, "OnVideoSizeChangedListener width:"

    .line 179
    .line 180
    .line 181
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    iget-object v9, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 184
    .line 185
    .line 186
    invoke-static {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 187
    move-result v9

    .line 188
    .line 189
    .line 190
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v9, ":height:"

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    iget-object v9, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 198
    .line 199
    .line 200
    invoke-static {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 201
    move-result v9

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v9, ":SarNum:"

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    iget-object v9, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 212
    .line 213
    .line 214
    invoke-static {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 215
    move-result v9

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v9, ":SarDen:"

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    iget-object v9, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 226
    .line 227
    .line 228
    invoke-static {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 229
    move-result v9

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    const-string v9, ":videoRotationDegree:"

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    move-result-object v8

    .line 245
    .line 246
    .line 247
    invoke-static {v7, v8}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 248
    .line 249
    iget-object v7, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 250
    .line 251
    .line 252
    invoke-static {v7}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 253
    move-result v7

    .line 254
    .line 255
    if-eqz v7, :cond_6

    .line 256
    .line 257
    iget-object v7, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 258
    .line 259
    .line 260
    invoke-static {v7}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 261
    move-result v7

    .line 262
    .line 263
    if-eqz v7, :cond_6

    .line 264
    .line 265
    iget-object v7, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 266
    .line 267
    .line 268
    invoke-static {v7}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 269
    move-result-object v7

    .line 270
    .line 271
    if-eqz v7, :cond_5

    .line 272
    .line 273
    iget-object v7, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 274
    .line 275
    .line 276
    invoke-static {v7}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 277
    move-result-object v7

    .line 278
    .line 279
    iget-object v8, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 280
    .line 281
    .line 282
    invoke-static {v8}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 283
    move-result v8

    .line 284
    .line 285
    iget-object v9, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 286
    .line 287
    .line 288
    invoke-static {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 289
    move-result v9

    .line 290
    .line 291
    .line 292
    invoke-interface {v7, v8, v9}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->a(II)V

    .line 293
    .line 294
    iget-object v7, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 295
    .line 296
    .line 297
    invoke-static {v7}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 298
    move-result-object v7

    .line 299
    .line 300
    iget-object v8, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 301
    .line 302
    .line 303
    invoke-static {v8}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 304
    move-result v8

    .line 305
    .line 306
    iget-object v9, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 307
    .line 308
    .line 309
    invoke-static {v9}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 310
    move-result v9

    .line 311
    .line 312
    .line 313
    invoke-interface {v7, v8, v9}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->b(II)V

    .line 314
    .line 315
    :cond_5
    iget-object v7, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v7}, Landroid/view/View;->requestLayout()V

    .line 319
    .line 320
    :cond_6
    const-string v7, "EVT_KEY_VIDEO_ROTATION"

    .line 321
    .line 322
    const-string v8, "EVT_PARAM3"

    .line 323
    .line 324
    const-string v9, ")"

    .line 325
    .line 326
    const-string v10, " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):("

    .line 327
    .line 328
    const-string v11, "EVT_PARAM2"

    .line 329
    .line 330
    const-string v12, "EVT_PARAM1"

    .line 331
    .line 332
    const-string v15, "*"

    .line 333
    .line 334
    const-string v13, "Resolution change:"

    .line 335
    .line 336
    const-string v14, "description"

    .line 337
    .line 338
    move/from16 v16, v4

    .line 339
    .line 340
    const-string v4, ","

    .line 341
    .line 342
    if-eqz v16, :cond_9

    .line 343
    .line 344
    move-wide/from16 v16, v5

    .line 345
    .line 346
    new-instance v5, Landroid/os/Message;

    .line 347
    .line 348
    .line 349
    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 350
    .line 351
    const/16 v6, 0x65

    .line 352
    .line 353
    iput v6, v5, Landroid/os/Message;->what:I

    .line 354
    .line 355
    const/16 v6, 0x7d9

    .line 356
    .line 357
    iput v6, v5, Landroid/os/Message;->arg1:I

    .line 358
    .line 359
    new-instance v6, Landroid/os/Bundle;

    .line 360
    .line 361
    .line 362
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 363
    .line 364
    move-object/from16 p1, v5

    .line 365
    .line 366
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 367
    .line 368
    .line 369
    invoke-static {v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 370
    move-result v5

    .line 371
    .line 372
    .line 373
    invoke-virtual {v6, v12, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 374
    .line 375
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 376
    .line 377
    .line 378
    invoke-static {v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 379
    move-result v5

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v11, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 383
    .line 384
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 385
    .line 386
    .line 387
    invoke-static {v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z

    .line 388
    move-result v5

    .line 389
    .line 390
    if-nez v5, :cond_8

    .line 391
    .line 392
    if-nez v3, :cond_7

    .line 393
    goto :goto_3

    .line 394
    .line 395
    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    move-result-object v1

    .line 418
    .line 419
    new-instance v2, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    iget-object v3, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 425
    .line 426
    .line 427
    invoke-static {v3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 428
    move-result v3

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    iget-object v3, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 437
    .line 438
    .line 439
    invoke-static {v3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 440
    move-result v3

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    move-result-object v2

    .line 457
    .line 458
    .line 459
    invoke-virtual {v6, v14, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v6, v8, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    .line 464
    :goto_2
    move-wide/from16 v1, v16

    .line 465
    goto :goto_4

    .line 466
    .line 467
    :cond_8
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 473
    .line 474
    .line 475
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 476
    move-result v2

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 485
    .line 486
    .line 487
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 488
    move-result v2

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 495
    move-result-object v1

    .line 496
    .line 497
    .line 498
    invoke-virtual {v6, v14, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    goto :goto_2

    .line 500
    .line 501
    .line 502
    :goto_4
    invoke-virtual {v6, v7, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 503
    .line 504
    move-object/from16 v1, p1

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 508
    .line 509
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 510
    .line 511
    .line 512
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 513
    move-result-object v2

    .line 514
    .line 515
    if-eqz v2, :cond_a

    .line 516
    .line 517
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 518
    .line 519
    .line 520
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 521
    move-result-object v2

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 525
    return-void

    .line 526
    .line 527
    :cond_9
    move-wide/from16 v16, v5

    .line 528
    .line 529
    iget-object v5, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 530
    .line 531
    .line 532
    invoke-static {v5}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z

    .line 533
    move-result v5

    .line 534
    .line 535
    if-nez v5, :cond_a

    .line 536
    .line 537
    if-eqz v3, :cond_a

    .line 538
    .line 539
    new-instance v5, Landroid/os/Message;

    .line 540
    .line 541
    .line 542
    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 543
    .line 544
    const/16 v6, 0x65

    .line 545
    .line 546
    iput v6, v5, Landroid/os/Message;->what:I

    .line 547
    .line 548
    const/16 v6, 0x7d9

    .line 549
    .line 550
    iput v6, v5, Landroid/os/Message;->arg1:I

    .line 551
    .line 552
    new-instance v6, Landroid/os/Bundle;

    .line 553
    .line 554
    .line 555
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 556
    .line 557
    move-object/from16 p1, v5

    .line 558
    .line 559
    new-instance v5, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 581
    move-result-object v1

    .line 582
    .line 583
    new-instance v2, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    iget-object v3, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 589
    .line 590
    .line 591
    invoke-static {v3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 592
    move-result v3

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    iget-object v3, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 601
    .line 602
    .line 603
    invoke-static {v3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 604
    move-result v3

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    move-result-object v2

    .line 621
    .line 622
    .line 623
    invoke-virtual {v6, v14, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 624
    .line 625
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 626
    .line 627
    .line 628
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 629
    move-result v2

    .line 630
    .line 631
    .line 632
    invoke-virtual {v6, v12, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 633
    .line 634
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 635
    .line 636
    .line 637
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 638
    move-result v2

    .line 639
    .line 640
    .line 641
    invoke-virtual {v6, v11, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v6, v8, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    .line 646
    move-wide/from16 v1, v16

    .line 647
    .line 648
    .line 649
    invoke-virtual {v6, v7, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 650
    .line 651
    move-object/from16 v1, p1

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 655
    .line 656
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 657
    .line 658
    .line 659
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 660
    move-result-object v2

    .line 661
    .line 662
    if-eqz v2, :cond_a

    .line 663
    .line 664
    iget-object v2, v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$7;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 665
    .line 666
    .line 667
    invoke-static {v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 668
    move-result-object v2

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 672
    :cond_a
    return-void
.end method
