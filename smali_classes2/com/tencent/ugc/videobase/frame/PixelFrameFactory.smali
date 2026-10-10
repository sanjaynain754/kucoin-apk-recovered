.class public Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::ugc"
.end annotation


# instance fields
.field private mCallerEGLContext:Landroid/opengl/EGLContext;

.field private mCallerEGLDisplay:Landroid/opengl/EGLDisplay;

.field private mCallerEGLDrawSurface:Landroid/opengl/EGLSurface;

.field private mCallerEGLReadSurface:Landroid/opengl/EGLSurface;

.field private mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

.field private final mLastFrameSize:Lcom/tencent/liteav/base/util/Size;

.field private mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

.field private mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

.field private mSharedEGLContext:Ljava/lang/Object;

.field private final mTAG:Ljava/lang/String;

.field private final mThrottlers:Lcom/tencent/liteav/base/b/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "PixelFrameFactory_"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mTAG:Ljava/lang/String;

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mSharedEGLContext:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 31
    .line 32
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLContext:Landroid/opengl/EGLContext;

    .line 35
    .line 36
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLReadSurface:Landroid/opengl/EGLSurface;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLDrawSurface:Landroid/opengl/EGLSurface;

    .line 41
    .line 42
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Lcom/tencent/liteav/base/util/Size;-><init>()V

    .line 46
    .line 47
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mLastFrameSize:Lcom/tencent/liteav/base/util/Size;

    .line 48
    .line 49
    new-instance v0, Lcom/tencent/liteav/base/b/b;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0}, Lcom/tencent/liteav/base/b/b;-><init>()V

    .line 53
    .line 54
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 55
    return-void
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

.method private copyTexture(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 21
    move-result v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 37
    .line 38
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mLastFrameSize:Lcom/tencent/liteav/base/util/Size;

    .line 39
    .line 40
    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 44
    move-result v2

    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mLastFrameSize:Lcom/tencent/liteav/base/util/Size;

    .line 49
    .line 50
    iget v1, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 54
    move-result v2

    .line 55
    .line 56
    if-eq v1, v2, :cond_3

    .line 57
    .line 58
    :cond_1
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->uninitialize()V

    .line 64
    const/4 v1, 0x0

    .line 65
    .line 66
    iput-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 67
    .line 68
    :cond_2
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mLastFrameSize:Lcom/tencent/liteav/base/util/Size;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 72
    move-result v2

    .line 73
    .line 74
    iput v2, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 75
    .line 76
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mLastFrameSize:Lcom/tencent/liteav/base/util/Size;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 80
    move-result v2

    .line 81
    .line 82
    iput v2, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    .line 83
    .line 84
    :cond_3
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    new-instance v1, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    .line 92
    move-result v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    .line 96
    move-result v3

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v2, v3}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;-><init>(II)V

    .line 100
    .line 101
    iput-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 102
    .line 103
    :cond_4
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 104
    .line 105
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->c:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, p1, v2, v0}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->renderFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/ugc/videobase/frame/GLTexture;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/frame/GLTexture;->wrap(Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 120
    return-object p1
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
.end method

.method private deepCopyDataToPixelFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 3

    .line 1
    .line 2
    instance-of v0, p2, [B

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    move-object v0, p2

    .line 7
    .line 8
    check-cast v0, [B

    .line 9
    array-length v0, v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/tencent/ugc/videobase/utils/MemoryAllocator;->allocateByteArray(I)[B

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    return-object v1

    .line 17
    :cond_0
    array-length v1, v0

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setData([B)V

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_1
    instance-of v0, p2, Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    check-cast p2, Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 35
    move-result v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lcom/tencent/ugc/videobase/utils/MemoryAllocator;->allocateDirectBuffer(I)Ljava/nio/ByteBuffer;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    return-object v1

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setBuffer(Ljava/nio/ByteBuffer;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->retain()I

    .line 58
    return-object p1
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
.end method

.method private deepCopyTextureToPixelFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->saveCallerEGLContext()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mSharedEGLContext:Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p2}, Lcom/tencent/liteav/base/util/CommonUtil;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->uninitOpenGLComponents()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p2}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->initRenderEGLContext(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->makeCurrent()Z

    .line 24
    move-result p2

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 29
    .line 30
    const-string v0, "makeCurrent"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v0}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mTAG:Ljava/lang/String;

    .line 37
    const/4 v1, 0x0

    .line 38
    .line 39
    new-array v1, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v2, "use origin texture when makeCurrent error"

    .line 42
    .line 43
    .line 44
    invoke-static {p2, v0, v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->retain()I

    .line 48
    return-object p1

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-direct {p0, p1}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->copyTexture(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->restoreCallerEGLContext()V

    .line 59
    return-object p1
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
.end method

.method private initRenderEGLContext(Ljava/lang/Object;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mTAG:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "initRenderEGLContext"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    iput-object p1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mSharedEGLContext:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v0, Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/tencent/ugc/videobase/egl/EGLCore;-><init>()V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 22
    .line 23
    const/16 v1, 0x80

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0, p1, v2, v1, v1}, Lcom/tencent/ugc/videobase/egl/EGLCore;->initialize(Ljava/lang/Object;Landroid/view/Surface;II)V
    :try_end_0
    .catch Lcom/tencent/ugc/videobase/egl/EGLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p1

    .line 30
    .line 31
    iput-object v2, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 34
    .line 35
    const-string v1, "initEGLCore"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mTAG:Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "create EGLCore failed."

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    return-void
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
.end method

.method private makeCurrent()Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 8
    .line 9
    const-string v2, "makeCurrentNull"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mTAG:Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "makeCurrent on mEGLCore is null"

    .line 18
    .line 19
    new-array v4, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2, v3, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    return v1

    .line 24
    .line 25
    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/egl/EGLCore;->makeCurrent()V
    :try_end_0
    .catch Lcom/tencent/ugc/videobase/egl/EGLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    .line 31
    iget-object v2, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 32
    .line 33
    const-string v3, "makeCurrentError"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    iget-object v3, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mTAG:Ljava/lang/String;

    .line 40
    .line 41
    const-string v4, "make current failed."

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3, v4, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    return v1
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

.method private restoreCallerEGLContext()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLContext:Landroid/opengl/EGLContext;

    .line 3
    .line 4
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/CommonUtil;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLDrawSurface:Landroid/opengl/EGLSurface;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLReadSurface:Landroid/opengl/EGLSurface;

    .line 17
    .line 18
    iget-object v3, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLContext:Landroid/opengl/EGLContext;

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentDisplay()Landroid/opengl/EGLDisplay;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 29
    .line 30
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 34
    return-void
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

.method private saveCallerEGLContext()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentContext()Landroid/opengl/EGLContext;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLContext:Landroid/opengl/EGLContext;

    .line 7
    .line 8
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/liteav/base/util/CommonUtil;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLContext:Landroid/opengl/EGLContext;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/CommonUtil;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void

    .line 25
    .line 26
    :cond_1
    :goto_0
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLContext:Landroid/opengl/EGLContext;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentDisplay()Landroid/opengl/EGLDisplay;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 33
    .line 34
    const/16 v0, 0x305a

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLReadSurface:Landroid/opengl/EGLSurface;

    .line 41
    .line 42
    const/16 v0, 0x3059

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mCallerEGLDrawSurface:Landroid/opengl/EGLSurface;

    .line 49
    return-void
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

.method private shallowCopyDataToPixelFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 1

    .line 1
    .line 2
    instance-of v0, p2, [B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p2, [B

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setData([B)V

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    instance-of v0, p2, Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p2, Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setBuffer(Ljava/nio/ByteBuffer;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->retain()I

    .line 23
    return-object p1
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
.end method


# virtual methods
.method public declared-synchronized create(IIJIIILjava/lang/Object;Ljava/lang/Object;Z)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    new-instance v0, Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setWidth(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setHeight(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p3, p4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setTimestamp(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p8}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setGLContext(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p7}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setTextureId(I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p5}, Lcom/tencent/liteav/videobase/base/GLConstants$a;->a(I)Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setPixelBufferType(Lcom/tencent/liteav/videobase/base/GLConstants$a;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p6}, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->a(I)Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setPixelFormatType(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    sget-object p2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->d:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 42
    .line 43
    if-eq p1, p2, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    sget-object p2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 50
    .line 51
    if-ne p1, p2, :cond_0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-direct {p0, v0, p8}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->deepCopyTextureToPixelFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 56
    move-result-object p1

    .line 57
    goto :goto_1

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_2

    .line 60
    .line 61
    :cond_1
    :goto_0
    if-eqz p10, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v0, p9}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->deepCopyDataToPixelFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 65
    move-result-object p1

    .line 66
    goto :goto_1

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-direct {p0, v0, p9}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->shallowCopyDataToPixelFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    .line 70
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :goto_1
    monitor-exit p0

    .line 72
    return-object p1

    .line 73
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    throw p1
.end method

.method public declared-synchronized release(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1

    .line 11
    :cond_0
    :goto_0
    monitor-exit p0

    .line 12
    return-void
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
.end method

.method public declared-synchronized uninitOpenGLComponents()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mTAG:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "uninitOpenGLComponents"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->makeCurrent()Z

    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->evictAll()V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->destroy()V

    .line 34
    .line 35
    iput-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->uninitialize()V

    .line 46
    .line 47
    iput-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mPixelFrameRenderer:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/tencent/ugc/videobase/egl/EGLCore;->destroy(Lcom/tencent/ugc/videobase/egl/EGLCore;)V

    .line 53
    .line 54
    iput-object v1, p0, Lcom/tencent/ugc/videobase/frame/PixelFrameFactory;->mRenderEGLCore:Lcom/tencent/ugc/videobase/egl/EGLCore;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    monitor-exit p0

    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    throw v0
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
