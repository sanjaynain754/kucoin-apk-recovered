.class public final Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/WorkerThread;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J(\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0018\u0008\u0002\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010)0\u0018J&\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\u0016\u0008\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020$\u0018\u00010.J\u0006\u0010/\u001a\u00020$J\u000e\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u0008J\u000e\u00102\u001a\u00020$2\u0006\u00101\u001a\u00020\u0008J\u000e\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u0019J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u001fH\u0002J6\u00107\u001a\u00020$2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u00101\u001a\u00020\u00082\u0016\u0008\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020$\u0018\u00010.J \u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010:\u001a\u00020;H\u0002J\u001c\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020&H\u0002J\u001a\u0010E\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0008\u0010F\u001a\u0004\u0018\u00010GH\u0002J\u0008\u0010H\u001a\u00020$H\u0002J\u0010\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020\u0015H\u0002J$\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020\u001f2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0002J\u0008\u0010N\u001a\u00020$H\u0002J\u0010\u0010O\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0008H\u0002J\u0012\u0010P\u001a\u0004\u0018\u00010\t2\u0006\u00101\u001a\u00020\u0008H\u0002J\u0018\u0010Q\u001a\u00020$2\u0006\u00101\u001a\u00020\u00082\u0006\u0010R\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006S"
    }
    d2 = {
        "Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;",
        "",
        "<init>",
        "()V",
        "mInitialized",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "mOutputSurfaceMap",
        "",
        "Landroid/view/Surface;",
        "Lcom/jumio/commons/camera/renderer/surface/OutputSurface;",
        "mGlThread",
        "Ljava/lang/Thread;",
        "mEglDisplay",
        "Landroid/opengl/EGLDisplay;",
        "mEglContext",
        "Landroid/opengl/EGLContext;",
        "mSurfaceAttrib",
        "",
        "mEglConfig",
        "Landroid/opengl/EGLConfig;",
        "mTempSurface",
        "Landroid/opengl/EGLSurface;",
        "mCurrentSurface",
        "defaultProgramHandles",
        "",
        "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$InputFormat;",
        "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;",
        "mProgramHandles",
        "mCurrentProgram",
        "mCurrentInputformat",
        "mExternalTextureId",
        "",
        "textureName",
        "getTextureName",
        "()I",
        "init",
        "",
        "dynamicRange",
        "Lcom/jumio/commons/camera/renderer/graphics/DynamicRange;",
        "setShader",
        "shaderOverrides",
        "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;",
        "enableProgram",
        "enable",
        "",
        "manipulate",
        "Lkotlin/Function1;",
        "release",
        "registerOutputSurface",
        "surface",
        "unregisterOutputSurface",
        "setInputFormat",
        "inputFormat",
        "activateExternalTexture",
        "externalTextureId",
        "render",
        "timestampNs",
        "",
        "textureTransform",
        "",
        "snapshot",
        "byteBuffer",
        "Ljava/nio/ByteBuffer;",
        "size",
        "Landroid/util/Size;",
        "getExtensionsBeforeInitialized",
        "Landroidx/core/util/Pair;",
        "",
        "dynamicRangeToInitialize",
        "createEglContext",
        "infoBuilder",
        "Lcom/jumio/commons/camera/renderer/graphics/GraphicDeviceInfo$Builder;",
        "createTempSurface",
        "makeCurrent",
        "eglSurface",
        "useAndConfigureProgramWithTexture",
        "textureId",
        "programHandles",
        "releaseInternal",
        "getOutSurfaceOrThrow",
        "createOutputSurfaceInternal",
        "removeOutputSurfaceInternal",
        "unregister",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOpenGlRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenGlRenderer.kt\ncom/jumio/commons/camera/renderer/opengl/OpenGlRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/HashMap;

.field public c:Ljava/lang/Thread;

.field public d:Landroid/opengl/EGLDisplay;

.field public e:Landroid/opengl/EGLContext;

.field public f:[I

.field public g:Landroid/opengl/EGLConfig;

.field public h:Landroid/opengl/EGLSurface;

.field public i:Landroid/view/Surface;

.field public j:Ljava/util/Map;

.field public k:Ljava/util/Map;

.field public l:Ljumio/core/C1;

.field public m:Ljumio/core/B1;

.field public n:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashMap;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    .line 19
    .line 20
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 21
    .line 22
    const-string v1, "EGL_NO_DISPLAY"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 28
    .line 29
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 30
    .line 31
    const-string v1, "EGL_NO_CONTEXT"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    .line 37
    .line 38
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 39
    .line 40
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->f:[I

    .line 41
    .line 42
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 43
    .line 44
    const-string v1, "EGL_NO_SURFACE"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->j:Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->k:Ljava/util/Map;

    .line 62
    .line 63
    sget-object v0, Ljumio/core/B1;->a:Ljumio/core/B1;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->m:Ljumio/core/B1;

    .line 66
    const/4 v0, -0x1

    .line 67
    .line 68
    iput v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->n:I

    .line 69
    return-void
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
.end method

.method public static synthetic enableProgram$default(Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->enableProgram(ZLkotlin/jvm/functions/Function1;)V

    .line 9
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
.end method

.method public static synthetic render$default(Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;J[FLandroid/view/Surface;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    and-int/lit8 p6, p6, 0x8

    .line 3
    .line 4
    if-eqz p6, :cond_0

    .line 5
    const/4 p5, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-wide v1, p1

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->render(J[FLandroid/view/Surface;Lkotlin/jvm/functions/Function1;)V

    .line 14
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public static synthetic setShader$default(Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;Ljumio/core/e1;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->setShader(Ljumio/core/e1;Ljava/util/Map;)V

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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
.end method


# virtual methods
.method public final a(Ljumio/core/e1;)Landroidx/core/util/Pair;
    .locals 4

    .line 1
    const-string v0, "Failed to get GL or EGL extensions: "

    sget-object v1, Ljumio/core/H1;->a:[I

    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    .line 2
    new-instance p1, Landroidx/core/util/Pair;

    invoke-direct {p1, v2, v2}, Landroidx/core/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, v1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(Ljumio/core/e1;Ljumio/core/I1;)V

    .line 4
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->g:Landroid/opengl/EGLConfig;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    invoke-static {v1, p1}, Ljumio/core/H1;->a(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;)Landroid/opengl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    .line 6
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    iget-object v3, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    invoke-static {v1, p1, p1, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0x1f03

    .line 7
    invoke-static {p1}, Landroid/opengl/GLES20;->glGetString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    move-object p1, v2

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    const/16 v3, 0x3055

    invoke-static {v1, v3}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    move-object v1, v2

    .line 9
    :cond_3
    new-instance v3, Landroidx/core/util/Pair;

    invoke-direct {v3, p1, v1}, Landroidx/core/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a()V

    return-object v3

    .line 11
    :cond_4
    :try_start_1
    const-string p1, "eglMakeCurrent failed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :goto_1
    :try_start_2
    const-string v1, "OpenGlRenderer"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    new-instance p1, Landroidx/core/util/Pair;

    invoke-direct {p1, v2, v2}, Landroidx/core/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a()V

    return-object p1

    :goto_2
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a()V

    throw p1
.end method

.method public final a()V
    .locals 5

    .line 54
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljumio/core/C1;

    .line 55
    iget v1, v1, Ljumio/core/C1;->a:I

    .line 56
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    goto :goto_0

    .line 57
    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->k:Ljava/util/Map;

    .line 58
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljumio/core/C1;

    .line 59
    iget v1, v1, Ljumio/core/C1;->a:I

    .line 60
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    goto :goto_1

    .line 61
    :cond_1
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->j:Ljava/util/Map;

    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->l:Ljumio/core/C1;

    .line 63
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 64
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v1, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 65
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljumio/core/E2;

    .line 66
    check-cast v2, Ljumio/core/F2;

    .line 67
    iget-object v3, v2, Ljumio/core/F2;->b:Landroid/opengl/EGLSurface;

    .line 68
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 69
    iget-object v3, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 70
    iget-object v2, v2, Ljumio/core/F2;->b:Landroid/opengl/EGLSurface;

    .line 71
    invoke-static {v3, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 72
    sget-object v2, Ljumio/core/H1;->a:[I

    .line 73
    const-string v2, "op"

    const-string v3, "eglDestroySurface"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    :try_start_0
    invoke-static {v3}, Ljumio/core/H1;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GLUtils"

    invoke-static {v4, v3, v2}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 76
    :cond_3
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 77
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 78
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 79
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    const-string v2, "EGL_NO_SURFACE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    .line 80
    :cond_4
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 81
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 82
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    const-string v2, "EGL_NO_CONTEXT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    .line 83
    :cond_5
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 84
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 85
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    const-string v2, "EGL_NO_DISPLAY"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 86
    :cond_6
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->g:Landroid/opengl/EGLConfig;

    const/4 v1, -0x1

    .line 87
    iput v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->n:I

    .line 88
    sget-object v1, Ljumio/core/B1;->a:Ljumio/core/B1;

    iput-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->m:Ljumio/core/B1;

    .line 89
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->i:Landroid/view/Surface;

    .line 90
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    return-void
.end method

.method public final a(ILjava/util/Map;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->m:Ljumio/core/B1;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljumio/core/C1;

    if-eqz p2, :cond_1

    .line 45
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->l:Ljumio/core/C1;

    if-eq v0, p2, :cond_0

    .line 46
    iput-object p2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->l:Ljumio/core/C1;

    .line 47
    invoke-virtual {p2}, Ljumio/core/C1;->b()V

    .line 48
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Using program for input format "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->m:Ljumio/core/B1;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->l:Ljumio/core/C1;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "OpenGlRenderer"

    invoke-static {v0, p2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const p2, 0x84c0

    .line 49
    invoke-static {p2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 50
    const-string p2, "glActiveTexture"

    invoke-static {p2}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    const p2, 0x8d65

    .line 51
    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 52
    const-string p1, "glBindTexture"

    invoke-static {p1}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    return-void

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unable to configure program for input format: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->m:Ljumio/core/B1;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final a(Landroid/view/Surface;Z)V
    .locals 3

    .line 91
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->i:Landroid/view/Surface;

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    .line 92
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->i:Landroid/view/Surface;

    .line 93
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    .line 94
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    invoke-static {v1, v0, v0, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "eglMakeCurrent failed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 95
    iget-object p2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljumio/core/E2;

    goto :goto_1

    .line 96
    :cond_2
    iget-object p2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    .line 97
    sget-object v0, Ljumio/core/H1;->h:Ljumio/core/E2;

    .line 98
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljumio/core/E2;

    :goto_1
    if-eqz p1, :cond_3

    .line 99
    sget-object p2, Ljumio/core/H1;->h:Ljumio/core/E2;

    if-eq p1, p2, :cond_3

    .line 100
    :try_start_0
    iget-object p2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    check-cast p1, Ljumio/core/F2;

    .line 101
    iget-object p1, p1, Ljumio/core/F2;->b:Landroid/opengl/EGLSurface;

    .line 102
    invoke-static {p2, p1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 103
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Failed to destroy EGL surface: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "OpenGlRenderer"

    invoke-static {v0, p2, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public final a(Ljumio/core/e1;Ljumio/core/I1;)V
    .locals 31

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 15
    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v2

    const-string v3, "eglGetDisplay(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 16
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x2

    .line 17
    new-array v3, v2, [I

    .line 18
    iget-object v4, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    const/4 v5, 0x1

    invoke-static {v4, v3, v1, v3, v5}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz p2, :cond_0

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    aget v6, v3, v1

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v6, 0x2e

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget v3, v3, v5

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p2

    check-cast v4, Ljumio/core/J1;

    .line 20
    const-string v6, "version"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iput-object v3, v4, Ljumio/core/J1;->b:Ljava/lang/String;

    .line 22
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljumio/core/e1;->a()Z

    move-result v3

    const/16 v4, 0x8

    if-eqz v3, :cond_1

    const/16 v3, 0xa

    move v7, v3

    goto :goto_0

    :cond_1
    move v7, v4

    .line 23
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljumio/core/e1;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    move v13, v2

    goto :goto_1

    :cond_2
    move v13, v4

    .line 24
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ljumio/core/e1;->a()Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x40

    :goto_2
    move/from16 v19, v3

    goto :goto_3

    :cond_3
    const/4 v3, 0x4

    goto :goto_2

    :goto_3
    const/16 v21, 0x5

    const/16 v22, 0x3038

    const/16 v6, 0x3024

    const/16 v8, 0x3023

    const/16 v10, 0x3022

    const/16 v12, 0x3021

    const/16 v14, 0x3025

    const/4 v15, 0x0

    const/16 v16, 0x3026

    const/16 v17, 0x0

    const/16 v18, 0x3040

    const/16 v20, 0x3033

    move v9, v7

    move v11, v7

    .line 25
    filled-new-array/range {v6 .. v22}, [I

    move-result-object v24

    .line 26
    new-array v3, v5, [Landroid/opengl/EGLConfig;

    .line 27
    new-array v4, v5, [I

    .line 28
    iget-object v6, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    const/16 v28, 0x1

    const/16 v30, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v3

    move-object/from16 v29, v4

    move-object/from16 v23, v6

    .line 29
    invoke-static/range {v23 .. v30}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 30
    aget-object v3, v26, v1

    .line 31
    invoke-virtual/range {p1 .. p1}, Ljumio/core/e1;->a()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v2, 0x3

    :cond_4
    const/16 v4, 0x3038

    const/16 v6, 0x3098

    .line 32
    filled-new-array {v6, v2, v4}, [I

    move-result-object v2

    .line 33
    iget-object v4, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v4, v3, v7, v2, v1}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v2

    .line 34
    const-string v4, "eglCreateContext"

    invoke-static {v4}, Ljumio/core/H1;->a(Ljava/lang/String;)V

    .line 35
    iput-object v3, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->g:Landroid/opengl/EGLConfig;

    .line 36
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v2, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    .line 37
    new-array v3, v5, [I

    .line 38
    iget-object v4, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    invoke-static {v4, v2, v6, v3, v1}, Landroid/opengl/EGL14;->eglQueryContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;I[II)Z

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "EGLContext created, client version "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget v1, v3, v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "OpenGlRenderer"

    invoke-static {v2, v1}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 40
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to find a suitable EGLConfig"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 41
    :cond_6
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    const-string v2, "EGL_NO_DISPLAY"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 42
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to initialize EGL14"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 43
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to get EGL14 display"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final enableProgram(ZLkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljumio/core/C1;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljumio/core/H1;->a(Ljava/lang/Thread;)V

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->k:Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 25
    move-result p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->k:Ljava/util/Map;

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->j:Ljava/util/Map;

    .line 33
    .line 34
    :goto_0
    iget v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->n:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(ILjava/util/Map;)V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->l:Ljumio/core/C1;

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    :cond_2
    :goto_1
    return-void
.end method

.method public final getTextureName()I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    const/4 v0, -0x1

    .line 13
    return v0

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->n:I

    .line 16
    return v0
.end method

.method public final init(Ljumio/core/e1;)V
    .locals 8
    .param p1    # Ljumio/core/e1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    .line 2
    const-string v0, "extensions"

    .line 3
    .line 4
    const-string v1, "dynamicRange"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v1, Ljumio/core/H1;->a:[I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    sget-object v1, Ljumio/core/K1;->a:Lcom/jumio/commons/camera/renderer/graphics/GraphicDeviceInfo$Companion;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/jumio/commons/camera/renderer/graphics/GraphicDeviceInfo$Companion;->builder()Ljumio/core/I1;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p1}, Ljumio/core/e1;->a()Z

    .line 29
    move-result v3

    .line 30
    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(Ljumio/core/e1;)Landroidx/core/util/Pair;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    iget-object v4, v3, Landroidx/core/util/Pair;->first:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    const-string v5, "Required value was null."

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    :try_start_1
    check-cast v4, Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, v3, Landroidx/core/util/Pair;->second:Ljava/lang/Object;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    check-cast v3, Ljava/lang/String;

    .line 50
    .line 51
    const-string v5, "GL_EXT_YUV_target"

    .line 52
    const/4 v6, 0x2

    .line 53
    const/4 v7, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static {v4, v5, v2, v6, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 57
    move-result v2

    .line 58
    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    const-string p1, "OpenGlRenderer"

    .line 62
    .line 63
    const-string v2, "Device does not support GL_EXT_YUV_target. Fallback to SDR."

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v2}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    sget-object p1, Ljumio/core/e1;->c:Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;->getSDR()Ljumio/core/e1;

    .line 72
    move-result-object p1

    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception p1

    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    :catch_1
    move-exception p1

    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    .line 82
    :cond_1
    :goto_0
    invoke-static {v3, p1}, Ljumio/core/H1;->a(Ljava/lang/String;Ljumio/core/e1;)[I

    .line 83
    move-result-object v2

    .line 84
    .line 85
    iput-object v2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->f:[I

    .line 86
    move-object v2, v1

    .line 87
    .line 88
    check-cast v2, Ljumio/core/J1;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    move-object v2, v1

    .line 96
    .line 97
    check-cast v2, Ljumio/core/J1;

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    goto :goto_1

    .line 105
    .line 106
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    .line 109
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    throw p1

    .line 111
    .line 112
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    .line 115
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    throw p1

    .line 117
    .line 118
    .line 119
    :cond_4
    :goto_1
    invoke-virtual {p0, p1, v1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(Ljumio/core/e1;Ljumio/core/I1;)V

    .line 120
    .line 121
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->g:Landroid/opengl/EGLConfig;

    .line 122
    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    iget-object v2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 126
    .line 127
    .line 128
    invoke-static {v2, v0}, Ljumio/core/H1;->a(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;)Landroid/opengl/EGLSurface;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    iput-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    .line 132
    .line 133
    :cond_5
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->h:Landroid/opengl/EGLSurface;

    .line 134
    .line 135
    iget-object v2, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 136
    .line 137
    iget-object v3, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v0, v0, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 141
    move-result v0

    .line 142
    .line 143
    if-eqz v0, :cond_9

    .line 144
    .line 145
    .line 146
    invoke-static {}, Ljumio/core/H1;->b()Ljava/lang/String;

    .line 147
    move-result-object v0

    .line 148
    move-object v2, v1

    .line 149
    .line 150
    check-cast v2, Ljumio/core/J1;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    const-string v3, "version"

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    iput-object v0, v2, Ljumio/core/J1;->a:Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    .line 167
    invoke-static {p1, v0}, Ljumio/core/H1;->a(Ljumio/core/e1;Ljava/util/Map;)Ljava/util/HashMap;

    .line 168
    move-result-object p1

    .line 169
    .line 170
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->j:Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    invoke-static {}, Ljumio/core/H1;->a()I

    .line 174
    move-result p1

    .line 175
    .line 176
    iput p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->n:I

    .line 177
    .line 178
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->j:Ljava/util/Map;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p1, v0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(ILjava/util/Map;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 182
    .line 183
    .line 184
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 185
    move-result-object p1

    .line 186
    .line 187
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    .line 188
    .line 189
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 190
    const/4 v0, 0x1

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 194
    .line 195
    check-cast v1, Ljumio/core/J1;

    .line 196
    .line 197
    iget-object p1, v1, Ljumio/core/J1;->a:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v0, v1, Ljumio/core/J1;->b:Ljava/lang/String;

    .line 200
    .line 201
    if-eqz p1, :cond_6

    .line 202
    .line 203
    if-eqz v0, :cond_6

    .line 204
    .line 205
    new-instance p1, Ljumio/core/K1;

    .line 206
    return-void

    .line 207
    .line 208
    :cond_6
    const-string v1, ""

    .line 209
    .line 210
    if-nez p1, :cond_7

    .line 211
    .line 212
    const-string p1, "glVersion"

    .line 213
    goto :goto_2

    .line 214
    :cond_7
    move-object p1, v1

    .line 215
    .line 216
    :goto_2
    if-nez v0, :cond_8

    .line 217
    .line 218
    const-string v0, "eglVersion"

    .line 219
    goto :goto_3

    .line 220
    :cond_8
    move-object v0, v1

    .line 221
    .line 222
    .line 223
    :goto_3
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    move-result-object p1

    .line 225
    .line 226
    .line 227
    invoke-static {p1, v1}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    move-result-object p1

    .line 229
    .line 230
    .line 231
    invoke-static {p1, v1}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    move-result-object p1

    .line 233
    .line 234
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 235
    .line 236
    new-instance v1, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-string v2, "Missing required properties:"

    .line 239
    .line 240
    .line 241
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    move-result-object p1

    .line 249
    .line 250
    .line 251
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 252
    throw v0

    .line 253
    .line 254
    :cond_9
    :try_start_2
    const-string p1, "eglMakeCurrent failed"

    .line 255
    .line 256
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 257
    .line 258
    .line 259
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 260
    throw v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 261
    .line 262
    .line 263
    :goto_4
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a()V

    .line 264
    throw p1

    .line 265
    .line 266
    .line 267
    :goto_5
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a()V

    .line 268
    throw p1
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public final registerOutputSurface(Landroid/view/Surface;)V
    .locals 2
    .param p1    # Landroid/view/Surface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "surface"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ljumio/core/H1;->a(Ljava/lang/Thread;)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    .line 33
    .line 34
    sget-object v1, Ljumio/core/H1;->h:Ljumio/core/E2;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final release()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 13
    .line 14
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljumio/core/H1;->a(Ljava/lang/Thread;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a()V

    .line 21
    return-void
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
.end method

.method public final render(J[FLandroid/view/Surface;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .param p3    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/view/Surface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[F",
            "Landroid/view/Surface;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljumio/core/C1;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "Failed to create EGL surface: "

    .line 3
    .line 4
    const-string v1, "textureTransform"

    .line 5
    .line 6
    .line 7
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "surface"

    .line 10
    .line 11
    .line 12
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    sget-object v1, Ljumio/core/H1;->a:[I

    .line 15
    .line 16
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_7

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljumio/core/H1;->a(Ljava/lang/Thread;)V

    .line 31
    .line 32
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    check-cast v1, Ljumio/core/E2;

    .line 39
    .line 40
    if-eqz v1, :cond_b

    .line 41
    .line 42
    sget-object v3, Ljumio/core/H1;->h:Ljumio/core/E2;

    .line 43
    .line 44
    const-string v4, "OpenGlRenderer"

    .line 45
    const/4 v5, 0x0

    .line 46
    .line 47
    if-eq v1, v3, :cond_1

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    :cond_1
    const/4 v1, 0x0

    .line 51
    .line 52
    :try_start_0
    iget-object v3, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->g:Landroid/opengl/EGLConfig;

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    iget-object v6, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 57
    .line 58
    iget-object v7, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->f:[I

    .line 59
    .line 60
    .line 61
    invoke-static {v6, v3, p4, v7}, Ljumio/core/H1;->a(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/view/Surface;[I)Landroid/opengl/EGLSurface;

    .line 62
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    goto :goto_3

    .line 64
    :catch_0
    move-exception v3

    .line 65
    goto :goto_1

    .line 66
    :catch_1
    move-exception v3

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    :goto_0
    move-object v0, v1

    .line 69
    goto :goto_3

    .line 70
    .line 71
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-static {v4, v0, v3}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-static {v4, v0, v3}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :goto_3
    if-nez v0, :cond_3

    .line 112
    goto :goto_4

    .line 113
    .line 114
    :cond_3
    sget-object v1, Ljumio/core/H1;->a:[I

    .line 115
    .line 116
    iget-object v1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 117
    .line 118
    const-string v3, "eglDisplay"

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    const-string v6, "eglSurface"

    .line 124
    .line 125
    .line 126
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    new-array v7, v2, [I

    .line 135
    .line 136
    const/16 v8, 0x3057

    .line 137
    .line 138
    .line 139
    invoke-static {v1, v0, v8, v7, v5}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    .line 140
    .line 141
    aget v7, v7, v5

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    new-array v3, v2, [I

    .line 150
    .line 151
    const/16 v6, 0x3056

    .line 152
    .line 153
    .line 154
    invoke-static {v1, v0, v6, v3, v5}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    .line 155
    .line 156
    aget v1, v3, v5

    .line 157
    .line 158
    new-instance v3, Landroid/util/Size;

    .line 159
    .line 160
    .line 161
    invoke-direct {v3, v7, v1}, Landroid/util/Size;-><init>(II)V

    .line 162
    .line 163
    sget-object v1, Ljumio/core/E2;->a:Lcom/jumio/commons/camera/renderer/surface/OutputSurface$Companion;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 167
    move-result v6

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 171
    move-result v3

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v0, v6, v3}, Lcom/jumio/commons/camera/renderer/surface/OutputSurface$Companion;->of(Landroid/opengl/EGLSurface;II)Ljumio/core/E2;

    .line 175
    move-result-object v0

    .line 176
    move-object v1, v0

    .line 177
    .line 178
    :goto_4
    if-nez v1, :cond_4

    .line 179
    .line 180
    goto/16 :goto_7

    .line 181
    .line 182
    :cond_4
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->b:Ljava/util/HashMap;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, p4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    :goto_5
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->i:Landroid/view/Surface;

    .line 188
    .line 189
    if-eq p4, v0, :cond_6

    .line 190
    move-object v0, v1

    .line 191
    .line 192
    check-cast v0, Ljumio/core/F2;

    .line 193
    .line 194
    iget-object v3, v0, Ljumio/core/F2;->b:Landroid/opengl/EGLSurface;

    .line 195
    .line 196
    iget-object v6, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 197
    .line 198
    iget-object v7, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->e:Landroid/opengl/EGLContext;

    .line 199
    .line 200
    .line 201
    invoke-static {v6, v3, v3, v7}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 202
    move-result v3

    .line 203
    .line 204
    if-eqz v3, :cond_5

    .line 205
    .line 206
    iput-object p4, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->i:Landroid/view/Surface;

    .line 207
    .line 208
    iget v3, v0, Ljumio/core/F2;->c:I

    .line 209
    .line 210
    iget v6, v0, Ljumio/core/F2;->d:I

    .line 211
    .line 212
    .line 213
    invoke-static {v5, v5, v3, v6}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 214
    .line 215
    iget v3, v0, Ljumio/core/F2;->c:I

    .line 216
    .line 217
    iget v0, v0, Ljumio/core/F2;->d:I

    .line 218
    .line 219
    .line 220
    invoke-static {v5, v5, v3, v0}, Landroid/opengl/GLES20;->glScissor(IIII)V

    .line 221
    goto :goto_6

    .line 222
    .line 223
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 224
    .line 225
    const-string p2, "eglMakeCurrent failed"

    .line 226
    .line 227
    .line 228
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 229
    throw p1

    .line 230
    .line 231
    :cond_6
    :goto_6
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->l:Ljumio/core/C1;

    .line 232
    .line 233
    if-eqz v0, :cond_a

    .line 234
    .line 235
    instance-of v3, v0, Ljumio/core/G1;

    .line 236
    .line 237
    if-eqz v3, :cond_7

    .line 238
    move-object v3, v0

    .line 239
    .line 240
    check-cast v3, Ljumio/core/G1;

    .line 241
    .line 242
    const-string v6, "textureMat"

    .line 243
    .line 244
    .line 245
    invoke-static {p3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    iget v3, v3, Ljumio/core/G1;->j:I

    .line 248
    .line 249
    .line 250
    invoke-static {v3, v2, v5, p3, v5}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 251
    .line 252
    const-string p3, "glUniformMatrix4fv"

    .line 253
    .line 254
    .line 255
    invoke-static {p3}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 256
    .line 257
    :cond_7
    if-eqz p5, :cond_8

    .line 258
    .line 259
    .line 260
    invoke-interface {p5, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    :cond_8
    const/4 p3, 0x5

    .line 262
    const/4 p5, 0x4

    .line 263
    .line 264
    .line 265
    invoke-static {p3, v5, p5}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 266
    .line 267
    const-string p3, "glDrawArrays"

    .line 268
    .line 269
    .line 270
    invoke-static {p3}, Ljumio/core/H1;->b(Ljava/lang/String;)V

    .line 271
    .line 272
    iget-object p3, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 273
    .line 274
    check-cast v1, Ljumio/core/F2;

    .line 275
    .line 276
    iget-object p5, v1, Ljumio/core/F2;->b:Landroid/opengl/EGLSurface;

    .line 277
    .line 278
    .line 279
    invoke-static {p3, p5, p1, p2}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

    .line 280
    .line 281
    iget-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->d:Landroid/opengl/EGLDisplay;

    .line 282
    .line 283
    iget-object p2, v1, Ljumio/core/F2;->b:Landroid/opengl/EGLSurface;

    .line 284
    .line 285
    .line 286
    invoke-static {p1, p2}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 287
    move-result p1

    .line 288
    .line 289
    if-nez p1, :cond_9

    .line 290
    .line 291
    new-instance p1, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    const-string p2, "Failed to swap buffers with EGL error: 0x"

    .line 294
    .line 295
    .line 296
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 300
    move-result p2

    .line 301
    .line 302
    .line 303
    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 304
    move-result-object p2

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    move-result-object p1

    .line 312
    .line 313
    .line 314
    invoke-static {v4, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0, p4, v5}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(Landroid/view/Surface;Z)V

    .line 318
    :cond_9
    :goto_7
    return-void

    .line 319
    .line 320
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 321
    .line 322
    const-string p2, "Required value was null."

    .line 323
    .line 324
    .line 325
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 326
    throw p1

    .line 327
    .line 328
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 329
    .line 330
    const-string p2, "The surface is not registered."

    .line 331
    .line 332
    .line 333
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 334
    throw p1
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public final setInputFormat(Ljumio/core/B1;)V
    .locals 2
    .param p1    # Ljumio/core/B1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inputFormat"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ljumio/core/H1;->a(Ljava/lang/Thread;)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->m:Ljumio/core/B1;

    .line 25
    .line 26
    if-eq v0, p1, :cond_1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->m:Ljumio/core/B1;

    .line 29
    .line 30
    iget p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->n:I

    .line 31
    .line 32
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->j:Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v0}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(ILjava/util/Map;)V

    .line 36
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final setShader(Ljumio/core/e1;Ljava/util/Map;)V
    .locals 5
    .param p1    # Ljumio/core/e1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljumio/core/e1;",
            "Ljava/util/Map<",
            "Ljumio/core/B1;",
            "+",
            "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dynamicRange"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "shaderOverrides"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 13
    .line 14
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Ljumio/core/e1;->a()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(Ljumio/core/e1;)Landroidx/core/util/Pair;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget-object v0, v0, Landroidx/core/util/Pair;->first:Ljava/lang/Object;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    const/4 v1, 0x2

    .line 40
    const/4 v2, 0x0

    .line 41
    .line 42
    const-string v3, "GL_EXT_YUV_target"

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v3, v4, v1, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 47
    move-result v0

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    const-string p1, "OpenGlRenderer"

    .line 52
    .line 53
    const-string v0, "Device does not support GL_EXT_YUV_target. Fallback to SDR."

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    sget-object p1, Ljumio/core/e1;->c:Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;->getSDR()Ljumio/core/e1;

    .line 62
    move-result-object p1

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string p2, "Required value was null."

    .line 68
    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    throw p1

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    invoke-static {p1, p2}, Ljumio/core/H1;->a(Ljumio/core/e1;Ljava/util/Map;)Ljava/util/HashMap;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    iput-object p1, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->k:Ljava/util/Map;

    .line 78
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public final unregisterOutputSurface(Landroid/view/Surface;)V
    .locals 2
    .param p1    # Landroid/view/Surface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "surface"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Ljumio/core/H1;->a:[I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljumio/core/H1;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Z)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->c:Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Ljumio/core/H1;->a(Ljava/lang/Thread;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v1}, Lcom/jumio/commons/camera/renderer/opengl/OpenGlRenderer;->a(Landroid/view/Surface;Z)V

    .line 26
    return-void
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
.end method
