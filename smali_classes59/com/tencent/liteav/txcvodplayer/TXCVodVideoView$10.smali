.class final Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;


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
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

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
.method public final a(IIILjava/lang/Object;)Z
    .locals 2

    .line 1
    .line 2
    const/16 v0, -0x8ff

    .line 3
    .line 4
    if-eq p1, v0, :cond_13

    .line 5
    .line 6
    const/16 v0, 0x3ee

    .line 7
    .line 8
    if-eq p1, v0, :cond_12

    .line 9
    .line 10
    const/16 v0, 0x7d7

    .line 11
    .line 12
    if-eq p1, v0, :cond_11

    .line 13
    .line 14
    const/16 v0, 0x7db

    .line 15
    .line 16
    if-eq p1, v0, :cond_f

    .line 17
    .line 18
    const/16 v0, 0x7de

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    if-eq p1, v0, :cond_d

    .line 22
    .line 23
    const/16 v0, 0x7e4

    .line 24
    .line 25
    if-eq p1, v0, :cond_b

    .line 26
    .line 27
    const/16 v0, 0x7ea

    .line 28
    .line 29
    if-eq p1, v0, :cond_a

    .line 30
    .line 31
    const/16 v0, 0x7ee

    .line 32
    .line 33
    if-eq p1, v0, :cond_6

    .line 34
    .line 35
    const/16 v0, 0x7d2

    .line 36
    .line 37
    if-eq p1, v0, :cond_5

    .line 38
    .line 39
    const/16 v0, 0x7d3

    .line 40
    .line 41
    if-eq p1, v0, :cond_2

    .line 42
    .line 43
    const-string v0, ",error:"

    .line 44
    .line 45
    .line 46
    packed-switch p1, :pswitch_data_0

    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :pswitch_0
    if-eqz p4, :cond_0

    .line 51
    .line 52
    instance-of p3, p4, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz p3, :cond_0

    .line 55
    move-object v1, p4

    .line 56
    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p4, "dns resolved url:"

    .line 62
    .line 63
    .line 64
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object p3

    .line 78
    .line 79
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 80
    .line 81
    .line 82
    invoke-static {p4, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 83
    .line 84
    if-nez p2, :cond_14

    .line 85
    .line 86
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 87
    .line 88
    .line 89
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :pswitch_1
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 94
    .line 95
    const-string p3, "Video data received"

    .line 96
    .line 97
    .line 98
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :pswitch_2
    if-eqz p4, :cond_1

    .line 103
    .line 104
    instance-of v1, p4, Ljava/lang/String;

    .line 105
    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 109
    .line 110
    check-cast p4, Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    invoke-static {v1, p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v1, "TCP Connect ServerIp:"

    .line 118
    .line 119
    .line 120
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v1, ",port:"

    .line 132
    .line 133
    .line 134
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    move-result-object p2

    .line 148
    .line 149
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 150
    .line 151
    .line 152
    invoke-static {p4, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 153
    .line 154
    if-nez p3, :cond_14

    .line 155
    .line 156
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 157
    .line 158
    .line 159
    invoke-static {p3, p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 160
    .line 161
    goto/16 :goto_3

    .line 162
    .line 163
    :cond_2
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 164
    .line 165
    const-string p3, "EVT_RENDER_FIRST_I_FRAME"

    .line 166
    .line 167
    .line 168
    invoke-static {p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 169
    .line 170
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 171
    .line 172
    .line 173
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z

    .line 174
    move-result p2

    .line 175
    .line 176
    const-string p3, "VOD displayed the first frame"

    .line 177
    .line 178
    if-eqz p2, :cond_4

    .line 179
    .line 180
    new-instance p2, Landroid/os/Bundle;

    .line 181
    .line 182
    .line 183
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 184
    .line 185
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 186
    .line 187
    .line 188
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 189
    move-result-object p4

    .line 190
    .line 191
    .line 192
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 193
    move-result p4

    .line 194
    .line 195
    .line 196
    const-string/jumbo v0, "support_hevc"

    .line 197
    .line 198
    if-nez p4, :cond_3

    .line 199
    .line 200
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 201
    .line 202
    .line 203
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 204
    move-result-object p4

    .line 205
    .line 206
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 207
    .line 208
    .line 209
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/e;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    iget-object v1, v1, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    move-result p4

    .line 217
    .line 218
    if-eqz p4, :cond_3

    .line 219
    .line 220
    const-string p4, "0"

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, v0, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    goto :goto_0

    .line 225
    .line 226
    :cond_3
    const-string p4, "1"

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, v0, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    :goto_0
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 232
    .line 233
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    invoke-static {p4, p1, p3, p2, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 237
    goto :goto_1

    .line 238
    .line 239
    :cond_4
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 240
    .line 241
    .line 242
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 243
    .line 244
    :goto_1
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 245
    .line 246
    .line 247
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)F

    .line 248
    move-result p2

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRate(F)V

    .line 252
    .line 253
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 254
    .line 255
    .line 256
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->q(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z

    .line 257
    .line 258
    goto/16 :goto_3

    .line 259
    .line 260
    :cond_5
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 261
    .line 262
    const-string p3, "hit cache"

    .line 263
    .line 264
    .line 265
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 266
    .line 267
    goto/16 :goto_3

    .line 268
    .line 269
    .line 270
    :cond_6
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e()Z

    .line 271
    move-result p1

    .line 272
    const/4 p2, 0x0

    .line 273
    .line 274
    if-nez p1, :cond_7

    .line 275
    return p2

    .line 276
    .line 277
    :cond_7
    if-eqz p4, :cond_8

    .line 278
    .line 279
    instance-of p1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;

    .line 280
    .line 281
    if-eqz p1, :cond_8

    .line 282
    move-object v1, p4

    .line 283
    .line 284
    check-cast v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;

    .line 285
    .line 286
    :cond_8
    if-nez v1, :cond_9

    .line 287
    .line 288
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 289
    .line 290
    const-string p3, "VOD_PLAY_EVT_VIDEO_SEI, seiInfo is null"

    .line 291
    .line 292
    .line 293
    invoke-static {p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 294
    return p2

    .line 295
    .line 296
    :cond_9
    new-instance p1, Landroid/os/Bundle;

    .line 297
    .line 298
    .line 299
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 300
    .line 301
    const-string p2, "EVT_KEY_SEI_TYPE"

    .line 302
    .line 303
    iget p3, v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;->videoSeiType:I

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 307
    .line 308
    const-string p2, "EVT_KEY_SEI_SIZE"

    .line 309
    .line 310
    iget p3, v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;->seiDataSize:I

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 314
    .line 315
    const-string p2, "EVT_KEY_SEI_DATA"

    .line 316
    .line 317
    iget-object p3, v1, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPVideoSeiInfo;->seiData:[B

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 321
    .line 322
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 323
    .line 324
    .line 325
    invoke-static {p2, v0, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILandroid/os/Bundle;)V

    .line 326
    .line 327
    goto/16 :goto_3

    .line 328
    .line 329
    :cond_a
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 330
    .line 331
    const-string p3, "Audio first play"

    .line 332
    .line 333
    .line 334
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 335
    .line 336
    goto/16 :goto_3

    .line 337
    .line 338
    :cond_b
    if-eqz p4, :cond_c

    .line 339
    .line 340
    instance-of p1, p4, Ljava/lang/Long;

    .line 341
    .line 342
    if-eqz p1, :cond_c

    .line 343
    .line 344
    check-cast p4, Ljava/lang/Long;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 348
    move-result-wide p1

    .line 349
    goto :goto_2

    .line 350
    .line 351
    :cond_c
    const-wide/16 p1, -0x1

    .line 352
    .line 353
    :goto_2
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 354
    long-to-int p1, p1

    .line 355
    .line 356
    .line 357
    invoke-static {p4, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;II)V

    .line 358
    .line 359
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 360
    .line 361
    .line 362
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;II)V

    .line 363
    .line 364
    goto/16 :goto_3

    .line 365
    .line 366
    :cond_d
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 367
    .line 368
    const-string p4, "Buffer ended"

    .line 369
    .line 370
    .line 371
    invoke-static {p3, p1, p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 372
    .line 373
    if-eqz p2, :cond_e

    .line 374
    .line 375
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 376
    .line 377
    .line 378
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/e;

    .line 379
    move-result-object p1

    .line 380
    .line 381
    iget-object p1, p1, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 385
    move-result p2

    .line 386
    .line 387
    if-eqz p2, :cond_e

    .line 388
    .line 389
    const-string p2, "m3u8"

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 393
    move-result p1

    .line 394
    .line 395
    if-nez p1, :cond_14

    .line 396
    .line 397
    :cond_e
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 398
    .line 399
    .line 400
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 401
    move-result p1

    .line 402
    const/4 p2, 0x3

    .line 403
    .line 404
    if-ne p1, p2, :cond_14

    .line 405
    .line 406
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 407
    .line 408
    const-string p3, "Playback started"

    .line 409
    .line 410
    .line 411
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->r(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/Object;

    .line 412
    move-result-object p4

    .line 413
    .line 414
    const/16 v0, 0x7d4

    .line 415
    .line 416
    .line 417
    invoke-static {p1, v0, p3, v1, p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 418
    .line 419
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 420
    .line 421
    .line 422
    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 423
    .line 424
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 425
    .line 426
    .line 427
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 428
    move-result-object p1

    .line 429
    .line 430
    const/16 p2, 0x64

    .line 431
    .line 432
    .line 433
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 434
    .line 435
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 436
    .line 437
    .line 438
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 439
    move-result-object p1

    .line 440
    .line 441
    const/16 p2, 0x67

    .line 442
    .line 443
    .line 444
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 445
    .line 446
    goto/16 :goto_3

    .line 447
    .line 448
    :cond_f
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 449
    .line 450
    const-string p3, "EVT_VIDEO_CHANGE_ROTATION: "

    .line 451
    .line 452
    .line 453
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 454
    move-result-object p4

    .line 455
    .line 456
    .line 457
    invoke-virtual {p3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    move-result-object p3

    .line 459
    .line 460
    .line 461
    invoke-static {p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)V

    .line 462
    .line 463
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 464
    .line 465
    .line 466
    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->g(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 467
    .line 468
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 469
    .line 470
    .line 471
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcplayer/e;

    .line 472
    move-result-object p1

    .line 473
    .line 474
    iget-boolean p1, p1, Lcom/tencent/liteav/txcplayer/e;->B:Z

    .line 475
    .line 476
    if-eqz p1, :cond_10

    .line 477
    .line 478
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 479
    .line 480
    .line 481
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 482
    move-result p1

    .line 483
    .line 484
    if-lez p1, :cond_10

    .line 485
    .line 486
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 487
    .line 488
    .line 489
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 490
    move-result p2

    .line 491
    .line 492
    .line 493
    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 494
    .line 495
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 496
    .line 497
    .line 498
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 499
    move-result-object p1

    .line 500
    .line 501
    if-eqz p1, :cond_10

    .line 502
    .line 503
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 504
    .line 505
    .line 506
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/renderer/a;

    .line 507
    move-result-object p1

    .line 508
    .line 509
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 510
    .line 511
    .line 512
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 513
    move-result p2

    .line 514
    .line 515
    .line 516
    invoke-interface {p1, p2}, Lcom/tencent/liteav/txcvodplayer/renderer/a;->setVideoRotation(I)V

    .line 517
    .line 518
    :cond_10
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 519
    .line 520
    new-instance p2, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    const-string p3, "Video angle "

    .line 523
    .line 524
    .line 525
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 528
    .line 529
    .line 530
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 531
    move-result p3

    .line 532
    .line 533
    .line 534
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    move-result-object p2

    .line 539
    .line 540
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 541
    .line 542
    .line 543
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 544
    .line 545
    .line 546
    invoke-static {p1, v0, p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 547
    goto :goto_3

    .line 548
    .line 549
    :cond_11
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 550
    .line 551
    const-string p3, "Buffer started"

    .line 552
    .line 553
    .line 554
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 555
    goto :goto_3

    .line 556
    .line 557
    :cond_12
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 558
    .line 559
    .line 560
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->u(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 561
    move-result-object p1

    .line 562
    .line 563
    .line 564
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 565
    move-result p1

    .line 566
    .line 567
    if-eqz p1, :cond_14

    .line 568
    .line 569
    if-eqz p4, :cond_14

    .line 570
    .line 571
    instance-of p1, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;

    .line 572
    .line 573
    if-eqz p1, :cond_14

    .line 574
    .line 575
    check-cast p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;

    .line 576
    .line 577
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 578
    .line 579
    iget-object p2, p4, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMsg$TPDownLoadProgressInfo;->extraInfo:Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 585
    .line 586
    const-string p3, "cdnip"

    .line 587
    .line 588
    .line 589
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 590
    move-result-object p1

    .line 591
    .line 592
    .line 593
    invoke-static {p2, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 594
    goto :goto_3

    .line 595
    :catch_0
    move-exception p1

    .line 596
    .line 597
    .line 598
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 599
    goto :goto_3

    .line 600
    .line 601
    :cond_13
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 602
    const/4 p3, -0x1

    .line 603
    .line 604
    .line 605
    invoke-static {p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 606
    .line 607
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 608
    .line 609
    .line 610
    invoke-static {p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 611
    .line 612
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 613
    .line 614
    const-string p3, "file not found"

    .line 615
    .line 616
    .line 617
    invoke-static {p2, p1, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;)V

    .line 618
    .line 619
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$10;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 620
    .line 621
    .line 622
    invoke-virtual {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a()V

    .line 623
    :cond_14
    :goto_3
    const/4 p1, 0x1

    .line 624
    return p1

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
    :pswitch_data_0
    .packed-switch 0x7e0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
