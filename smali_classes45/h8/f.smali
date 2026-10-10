.class public Lh8/f;
.super Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;
.source "GifDecoder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder<",
        "Lcom/github/penfeizhou/animation/gif/io/GifReader;",
        "Li8/a;",
        ">;"
    }
.end annotation


# instance fields
.field public A:I

.field public w:Li8/a;

.field public final x:Landroid/graphics/Paint;

.field public y:I

.field public final z:Lh8/f$b;


# direct methods
.method public constructor <init>(Lk8/b;Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;-><init>(Lk8/b;Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder$j;)V

    .line 4
    .line 5
    new-instance p1, Li8/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Li8/a;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lh8/f;->w:Li8/a;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Paint;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lh8/f;->x:Landroid/graphics/Paint;

    .line 18
    const/4 p2, 0x0

    .line 19
    .line 20
    iput p2, p0, Lh8/f;->y:I

    .line 21
    .line 22
    new-instance p2, Lh8/f$b;

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, v0}, Lh8/f$b;-><init>(Lh8/f$a;)V

    .line 27
    .line 28
    iput-object p2, p0, Lh8/f;->z:Lh8/f$b;

    .line 29
    const/4 p2, 0x1

    .line 30
    .line 31
    iput p2, p0, Lh8/f;->A:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    return-void
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
.end method


# virtual methods
.method public bridge synthetic A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh8/f;->T(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public bridge synthetic C()Lcom/github/penfeizhou/animation/io/e;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lh8/f;->U()Li8/a;

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
    .line 18
.end method

.method public bridge synthetic I(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    check-cast p1, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lh8/f;->V(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Landroid/graphics/Rect;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public K()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lh8/f;->z:Lh8/f$b;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput-object v1, v0, Lh8/f$b;->a:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    iput-object v1, p0, Lh8/f;->w:Li8/a;

    .line 8
    return-void
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
.end method

.method public M(Lcom/github/penfeizhou/animation/decode/a;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/penfeizhou/animation/decode/a<",
            "Lcom/github/penfeizhou/animation/gif/io/GifReader;",
            "Li8/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    .line 3
    check-cast v0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 9
    move-result v1

    .line 10
    .line 11
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 12
    div-int/2addr v1, v2

    .line 13
    .line 14
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 18
    move-result v2

    .line 19
    .line 20
    iget v3, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 21
    div-int/2addr v2, v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->H(II)Landroid/graphics/Bitmap;

    .line 25
    move-result-object v6

    .line 26
    .line 27
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->n:Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    check-cast v1, Landroid/graphics/Canvas;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    new-instance v1, Landroid/graphics/Canvas;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 41
    .line 42
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->n:Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    invoke-interface {v2, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    :cond_0
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v2}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->transparencyFlag()Z

    .line 59
    move-result v2

    .line 60
    .line 61
    if-nez v2, :cond_1

    .line 62
    .line 63
    iget v2, p0, Lh8/f;->y:I

    .line 64
    :goto_0
    move v7, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :goto_1
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->e:I

    .line 70
    .line 71
    if-nez v2, :cond_2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v7}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_2
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->d:Ljava/util/List;

    .line 79
    .line 80
    add-int/lit8 v2, v2, -0x1

    .line 81
    .line 82
    .line 83
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    check-cast v2, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 90
    .line 91
    iget v3, v2, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 92
    .line 93
    iget v4, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 94
    .line 95
    div-int v5, v3, v4

    .line 96
    .line 97
    iget v8, v2, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 98
    .line 99
    div-int v9, v8, v4

    .line 100
    .line 101
    iget v10, v2, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 102
    add-int/2addr v3, v10

    .line 103
    div-int/2addr v3, v4

    .line 104
    .line 105
    iget v10, v2, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 106
    add-int/2addr v8, v10

    .line 107
    div-int/2addr v8, v4

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v5, v9, v3, v8}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 111
    .line 112
    iget v3, v2, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 113
    const/4 v4, 0x2

    .line 114
    const/4 v5, 0x3

    .line 115
    .line 116
    if-eq v3, v4, :cond_4

    .line 117
    .line 118
    if-eq v3, v5, :cond_3

    .line 119
    goto :goto_2

    .line 120
    .line 121
    :cond_3
    iget-object v3, p0, Lh8/f;->z:Lh8/f$b;

    .line 122
    .line 123
    iget-object v3, v3, Lh8/f$b;->a:Ljava/nio/ByteBuffer;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 127
    .line 128
    iget v3, p0, Lh8/f;->y:I

    .line 129
    .line 130
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 134
    .line 135
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 139
    move-result v3

    .line 140
    .line 141
    iget v4, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 142
    div-int/2addr v3, v4

    .line 143
    .line 144
    iget-object v4, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->p:Landroid/graphics/Rect;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 148
    move-result v4

    .line 149
    .line 150
    iget v8, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 151
    div-int/2addr v4, v8

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v3, v4}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->H(II)Landroid/graphics/Bitmap;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    iget-object v4, p0, Lh8/f;->z:Lh8/f$b;

    .line 158
    .line 159
    iget-object v4, v4, Lh8/f$b;->a:Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v4}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 163
    .line 164
    iget-object v4, p0, Lh8/f;->x:Landroid/graphics/Paint;

    .line 165
    const/4 v8, 0x0

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v3, v8, v8, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v3}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->J(Landroid/graphics/Bitmap;)V

    .line 172
    goto :goto_2

    .line 173
    .line 174
    :cond_4
    iget v3, p0, Lh8/f;->y:I

    .line 175
    .line 176
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 180
    .line 181
    .line 182
    :goto_2
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 183
    .line 184
    iget v3, v0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 185
    .line 186
    if-ne v3, v5, :cond_5

    .line 187
    .line 188
    iget v2, v2, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 189
    .line 190
    if-eq v2, v5, :cond_5

    .line 191
    .line 192
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 196
    .line 197
    iget-object v2, p0, Lh8/f;->z:Lh8/f$b;

    .line 198
    .line 199
    iget-object v2, v2, Lh8/f$b;->a:Ljava/nio/ByteBuffer;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 203
    .line 204
    iget-object v2, p0, Lh8/f;->z:Lh8/f$b;

    .line 205
    .line 206
    iget-object v2, v2, Lh8/f$b;->a:Ljava/nio/ByteBuffer;

    .line 207
    .line 208
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 212
    .line 213
    :cond_5
    :goto_3
    iget v2, p1, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 214
    .line 215
    iget v3, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 216
    div-int/2addr v2, v3

    .line 217
    .line 218
    iget p1, p1, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 219
    div-int/2addr p1, v3

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v2, p1}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->H(II)Landroid/graphics/Bitmap;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    iget-object v2, p0, Lh8/f;->x:Landroid/graphics/Paint;

    .line 226
    .line 227
    iget v3, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lh8/f;->U()Li8/a;

    .line 231
    move-result-object v5

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v0 .. v5}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Li8/a;)Landroid/graphics/Bitmap;

    .line 235
    .line 236
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v7, p1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v4}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->J(Landroid/graphics/Bitmap;)V

    .line 243
    .line 244
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 248
    .line 249
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v6, p1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v6}, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->J(Landroid/graphics/Bitmap;)V

    .line 256
    return-void
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
.end method

.method public T(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/gif/io/GifReader;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 6
    return-object v0
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
.end method

.method public U()Li8/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lh8/f;->w:Li8/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Li8/a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Li8/a;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lh8/f;->w:Li8/a;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lh8/f;->w:Li8/a;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public V(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Landroid/graphics/Rect;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/github/penfeizhou/animation/gif/decode/GifParser;->c(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, -0x1

    .line 12
    move v4, v1

    .line 13
    move v5, v4

    .line 14
    move-object v6, v2

    .line 15
    move-object v7, v6

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v8

    .line 20
    .line 21
    if-eqz v8, :cond_6

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v8

    .line 26
    .line 27
    check-cast v8, Lh8/b;

    .line 28
    .line 29
    instance-of v9, v8, Lh8/h;

    .line 30
    .line 31
    if-eqz v9, :cond_1

    .line 32
    .line 33
    check-cast v8, Lh8/h;

    .line 34
    .line 35
    iget v4, v8, Lh8/h;->a:I

    .line 36
    .line 37
    iget v5, v8, Lh8/h;->b:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8}, Lh8/h;->b()Z

    .line 41
    move-result v9

    .line 42
    .line 43
    if-eqz v9, :cond_0

    .line 44
    .line 45
    iget-byte v3, v8, Lh8/h;->d:B

    .line 46
    .line 47
    and-int/lit16 v3, v3, 0xff

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_1
    instance-of v9, v8, Lh8/c;

    .line 51
    .line 52
    if-eqz v9, :cond_2

    .line 53
    move-object v6, v8

    .line 54
    .line 55
    check-cast v6, Lh8/c;

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_2
    instance-of v9, v8, Lcom/github/penfeizhou/animation/gif/decode/b;

    .line 59
    .line 60
    if-eqz v9, :cond_3

    .line 61
    move-object v7, v8

    .line 62
    .line 63
    check-cast v7, Lcom/github/penfeizhou/animation/gif/decode/b;

    .line 64
    goto :goto_0

    .line 65
    .line 66
    :cond_3
    instance-of v9, v8, Lh8/g;

    .line 67
    .line 68
    if-eqz v9, :cond_4

    .line 69
    .line 70
    new-instance v9, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;

    .line 71
    .line 72
    check-cast v8, Lh8/g;

    .line 73
    .line 74
    .line 75
    invoke-direct {v9, p1, v6, v7, v8}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;-><init>(Lcom/github/penfeizhou/animation/gif/io/GifReader;Lh8/c;Lcom/github/penfeizhou/animation/gif/decode/b;Lh8/g;)V

    .line 76
    .line 77
    iget-object v8, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->d:Ljava/util/List;

    .line 78
    .line 79
    .line 80
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_4
    instance-of v9, v8, Lh8/a;

    .line 84
    .line 85
    if-eqz v9, :cond_0

    .line 86
    .line 87
    check-cast v8, Lh8/a;

    .line 88
    .line 89
    iget-object v9, v8, Lh8/a;->b:Ljava/lang/String;

    .line 90
    .line 91
    const-string v10, "NETSCAPE2.0"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    move-result v9

    .line 96
    .line 97
    if-eqz v9, :cond_0

    .line 98
    .line 99
    iget v8, v8, Lh8/a;->a:I

    .line 100
    .line 101
    if-nez v8, :cond_5

    .line 102
    .line 103
    iput v1, p0, Lh8/f;->A:I

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_5
    if-lez v8, :cond_0

    .line 107
    .line 108
    add-int/lit8 v8, v8, 0x1

    .line 109
    .line 110
    iput v8, p0, Lh8/f;->A:I

    .line 111
    goto :goto_0

    .line 112
    :cond_6
    int-to-long v7, v4

    .line 113
    int-to-long v9, v5

    .line 114
    mul-long/2addr v7, v9

    .line 115
    .line 116
    iget p1, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->k:I

    .line 117
    int-to-long v9, p1

    .line 118
    int-to-long v11, p1

    .line 119
    mul-long/2addr v9, v11

    .line 120
    div-long/2addr v7, v9

    .line 121
    .line 122
    const-wide/16 v9, 0x1

    .line 123
    add-long/2addr v7, v9

    .line 124
    .line 125
    const-wide/16 v9, 0x4

    .line 126
    mul-long/2addr v7, v9

    .line 127
    long-to-int p1, v7

    .line 128
    .line 129
    .line 130
    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    iget-object v0, p0, Lh8/f;->z:Lh8/f$b;

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    iput-object p1, v0, Lh8/f$b;->a:Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    if-eqz v6, :cond_7

    .line 144
    .line 145
    if-ltz v3, :cond_7

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Lh8/c;->b()[I

    .line 149
    move-result-object p1

    .line 150
    array-length p1, p1

    .line 151
    .line 152
    if-ge v3, p1, :cond_7

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6}, Lh8/c;->b()[I

    .line 156
    move-result-object p1

    .line 157
    .line 158
    aget p1, p1, v3

    .line 159
    .line 160
    and-int/lit16 v0, p1, 0xff

    .line 161
    .line 162
    shr-int/lit8 v2, p1, 0x8

    .line 163
    .line 164
    and-int/lit16 v2, v2, 0xff

    .line 165
    .line 166
    shr-int/lit8 p1, p1, 0x10

    .line 167
    .line 168
    and-int/lit16 p1, p1, 0xff

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v2, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 172
    move-result p1

    .line 173
    .line 174
    iput p1, p0, Lh8/f;->y:I

    .line 175
    .line 176
    :cond_7
    new-instance p1, Landroid/graphics/Rect;

    .line 177
    .line 178
    .line 179
    invoke-direct {p1, v1, v1, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 180
    return-object p1

    .line 181
    :catch_0
    move-exception p1

    .line 182
    long-to-double v0, v7

    .line 183
    .line 184
    const-wide/high16 v3, 0x4130000000000000L    # 1048576.0

    .line 185
    div-double/2addr v0, v3

    .line 186
    .line 187
    .line 188
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    .line 192
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 193
    move-result-object v1

    .line 194
    .line 195
    .line 196
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 197
    move-result-object v0

    .line 198
    .line 199
    const-string v1, "OutOfMemoryError in GifDecoder: Buffer needed: %.2fMB (%,d bytes)"

    .line 200
    .line 201
    .line 202
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    const-string v1, "GifDecoder"

    .line 206
    .line 207
    .line 208
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    .line 210
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/FrameSeqDecoder;->o:Ljava/nio/ByteBuffer;

    .line 211
    .line 212
    iget-object v0, p0, Lh8/f;->z:Lh8/f$b;

    .line 213
    .line 214
    iput-object v2, v0, Lh8/f$b;->a:Ljava/nio/ByteBuffer;

    .line 215
    throw p1
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
.end method

.method public t(II)I
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public x()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lh8/f;->A:I

    .line 3
    return v0
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
.end method
