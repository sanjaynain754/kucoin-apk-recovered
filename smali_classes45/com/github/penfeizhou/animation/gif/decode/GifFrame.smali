.class public Lcom/github/penfeizhou/animation/gif/decode/GifFrame;
.super Lcom/github/penfeizhou/animation/decode/a;
.source "GifFrame.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/penfeizhou/animation/decode/a<",
        "Lcom/github/penfeizhou/animation/gif/io/GifReader;",
        "Li8/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final DEFAULT_DELAY:I = 0xa

.field private static final sDataBlock:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "[B>;"
        }
    .end annotation
.end field


# instance fields
.field public final colorTable:Lh8/c;

.field public final disposalMethod:I

.field private final imageDataOffset:I

.field private final interlace:Z

.field private final lzwMinCodeSize:I

.field public final transparentColorIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "animation-decoder-gif"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 11
    .line 12
    sput-object v0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->sDataBlock:Ljava/lang/ThreadLocal;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>(Lcom/github/penfeizhou/animation/gif/io/GifReader;Lh8/c;Lcom/github/penfeizhou/animation/gif/decode/b;Lh8/g;)V
    .locals 2
    .param p3    # Lcom/github/penfeizhou/animation/gif/decode/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/github/penfeizhou/animation/decode/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 4
    const/4 p1, -0x1

    .line 5
    .line 6
    if-eqz p3, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3}, Lcom/github/penfeizhou/animation/gif/decode/b;->c()I

    .line 10
    move-result v0

    .line 11
    .line 12
    iput v0, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 13
    .line 14
    iget v0, p3, Lcom/github/penfeizhou/animation/gif/decode/b;->c:I

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    if-gtz v0, :cond_0

    .line 19
    move v0, v1

    .line 20
    :cond_0
    mul-int/2addr v0, v1

    .line 21
    .line 22
    iput v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Lcom/github/penfeizhou/animation/gif/decode/b;->d()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget p1, p3, Lcom/github/penfeizhou/animation/gif/decode/b;->d:I

    .line 31
    .line 32
    iput p1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->transparentColorIndex:I

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    iput p1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->transparentColorIndex:I

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 p3, 0x0

    .line 38
    .line 39
    iput p3, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 40
    .line 41
    iput p1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->transparentColorIndex:I

    .line 42
    .line 43
    :goto_0
    iget p1, p4, Lh8/g;->a:I

    .line 44
    .line 45
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 46
    .line 47
    iget p1, p4, Lh8/g;->b:I

    .line 48
    .line 49
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 50
    .line 51
    iget p1, p4, Lh8/g;->c:I

    .line 52
    .line 53
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 54
    .line 55
    iget p1, p4, Lh8/g;->d:I

    .line 56
    .line 57
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p4}, Lh8/g;->b()Z

    .line 61
    move-result p1

    .line 62
    .line 63
    iput-boolean p1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->interlace:Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p4}, Lh8/g;->c()Z

    .line 67
    move-result p1

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    iget-object p1, p4, Lh8/g;->f:Lh8/c;

    .line 72
    .line 73
    iput-object p1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->colorTable:Lh8/c;

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :cond_3
    iput-object p2, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->colorTable:Lh8/c;

    .line 77
    .line 78
    :goto_1
    iget p1, p4, Lh8/g;->g:I

    .line 79
    .line 80
    iput p1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->lzwMinCodeSize:I

    .line 81
    .line 82
    iget p1, p4, Lh8/g;->h:I

    .line 83
    .line 84
    iput p1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->imageDataOffset:I

    .line 85
    return-void
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

.method private native uncompressLZW(Lcom/github/penfeizhou/animation/gif/io/GifReader;[II[IIIIZ[B)V
.end method


# virtual methods
.method public bridge synthetic draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Lcom/github/penfeizhou/animation/io/e;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    check-cast p5, Li8/a;

    invoke-virtual/range {p0 .. p5}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Li8/a;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Li8/a;)Landroid/graphics/Bitmap;
    .locals 2

    .line 2
    :try_start_0
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    mul-int/2addr v0, v1

    mul-int v1, p3, p3

    div-int/2addr v0, v1

    invoke-virtual {p5, v0}, Li8/a;->c(I)V

    .line 3
    invoke-virtual {p5}, Li8/a;->b()[I

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0, p3}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->encode([II)V

    .line 5
    invoke-virtual {p5}, Li8/a;->a()Ljava/nio/IntBuffer;

    move-result-object p5

    invoke-virtual {p5}, Ljava/nio/IntBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 6
    iget-object p5, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    const/4 v0, 0x0

    iput v0, p5, Landroid/graphics/Rect;->left:I

    .line 7
    iput v0, p5, Landroid/graphics/Rect;->top:I

    .line 8
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p5, Landroid/graphics/Rect;->right:I

    .line 9
    iget-object p5, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p5, Landroid/graphics/Rect;->bottom:I

    .line 10
    iget-object p5, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    int-to-float v1, v0

    int-to-float p3, p3

    div-float/2addr v1, p3

    float-to-int v1, v1

    iput v1, p5, Landroid/graphics/Rect;->left:I

    .line 11
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    int-to-float v1, v1

    div-float/2addr v1, p3

    float-to-int v1, v1

    iput v1, p5, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    div-float/2addr v0, p3

    .line 12
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p5, Landroid/graphics/Rect;->right:I

    .line 13
    iget-object p5, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    int-to-float v0, v0

    div-float/2addr v0, p3

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    int-to-float p3, p3

    add-float/2addr v0, p3

    float-to-int p3, v0

    iput p3, p5, Landroid/graphics/Rect;->bottom:I

    .line 14
    iget-object p3, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    iget-object p5, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    invoke-virtual {p1, p4, p3, p5, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-object p4
.end method

.method public encode([II)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 3
    .line 4
    check-cast v0, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/io/c;->reset()V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 10
    .line 11
    check-cast v0, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 12
    .line 13
    iget v1, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->imageDataOffset:I

    .line 14
    int-to-long v1, v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 18
    .line 19
    sget-object v0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->sDataBlock:Ljava/lang/ThreadLocal;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    check-cast v1, [B

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/16 v1, 0xff

    .line 30
    .line 31
    new-array v1, v1, [B

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 35
    :cond_0
    move-object v11, v1

    .line 36
    .line 37
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 38
    move-object v3, v0

    .line 39
    .line 40
    check-cast v3, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->colorTable:Lh8/c;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lh8/c;->b()[I

    .line 46
    move-result-object v4

    .line 47
    .line 48
    iget v5, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->transparentColorIndex:I

    .line 49
    .line 50
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 51
    .line 52
    div-int v7, v0, p2

    .line 53
    .line 54
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 55
    .line 56
    div-int v8, v0, p2

    .line 57
    .line 58
    iget v9, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->lzwMinCodeSize:I

    .line 59
    .line 60
    iget-boolean v10, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->interlace:Z

    .line 61
    move-object v2, p0

    .line 62
    move-object v6, p1

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v2 .. v11}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->uncompressLZW(Lcom/github/penfeizhou/animation/gif/io/GifReader;[II[IIIIZ[B)V

    .line 66
    return-void
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
.end method

.method public transparencyFlag()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->transparentColorIndex:I

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
