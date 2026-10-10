.class public Lcom/tencent/ugc/videobase/egl/EGL14Helper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ugc/videobase/egl/EGLHelper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/tencent/ugc/videobase/egl/EGLHelper<",
        "Landroid/opengl/EGLContext;",
        ">;"
    }
.end annotation


# static fields
.field private static final ATTRIBUTE_LIST_FOR_OFFSCREEN_SURFACE:[I

.field private static final ATTRIBUTE_LIST_FOR_SURFACE:[I

.field private static final EGL_RECORDABLE_ANDROID:I = 0x3142


# instance fields
.field private mEGLConfig:Landroid/opengl/EGLConfig;

.field private mEGLContext:Landroid/opengl/EGLContext;

.field private mEGLDisplay:Landroid/opengl/EGLDisplay;

.field private mEGLSurface:Landroid/opengl/EGLSurface;

.field private final mHeight:I

.field private final mTAG:Ljava/lang/String;

.field private final mWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x11

    .line 3
    .line 4
    new-array v0, v0, [I

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->ATTRIBUTE_LIST_FOR_SURFACE:[I

    .line 10
    .line 11
    const/16 v0, 0x13

    .line 12
    .line 13
    new-array v0, v0, [I

    .line 14
    .line 15
    .line 16
    fill-array-data v0, :array_1

    .line 17
    .line 18
    sput-object v0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->ATTRIBUTE_LIST_FOR_OFFSCREEN_SURFACE:[I

    .line 19
    return-void

    .line 20
    nop

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
    :array_0
    .array-data 4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x0
        0x3026
        0x0
        0x3040
        0x4
        0x3142
        0x1
        0x3038
    .end array-data

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
    :array_1
    .array-data 4
        0x3033
        0x1
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x0
        0x3026
        0x0
        0x3040
        0x4
        0x3142
        0x1
        0x3038
    .end array-data
.end method

.method private constructor <init>(II)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 7
    .line 8
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 11
    .line 12
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 15
    .line 16
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 19
    .line 20
    iput p1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mWidth:I

    .line 21
    .line 22
    iput p2, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mHeight:I

    .line 23
    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string p2, "EGL14Helper@"

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    move-result p2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    iput-object p1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mTAG:Ljava/lang/String;

    .line 43
    return-void
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

.method private static createEGLContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;ILandroid/opengl/EGLContext;)Landroid/opengl/EGLContext;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/ugc/videobase/egl/EGLException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x3098

    .line 3
    .line 4
    const/16 v1, 0x3038

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, p2, v1}, [I

    .line 8
    move-result-object p2

    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    sget-object p3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1, p3, p2, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->throwEGLExceptionIfFailed()V

    .line 21
    return-object p0
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
.end method

.method public static createEGLSurface(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;II)Lcom/tencent/ugc/videobase/egl/EGL14Helper;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/ugc/videobase/egl/EGLException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p3, p4}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;-><init>(II)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->initialize(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;)V
    :try_end_0
    .catch Lcom/tencent/ugc/videobase/egl/EGLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object v0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->destroy()V

    .line 14
    throw p0
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
.end method

.method private initialize(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/ugc/videobase/egl/EGLException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    move-object/from16 v3, p3

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v4}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 13
    move-result-object v5

    .line 14
    .line 15
    iput-object v5, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 16
    .line 17
    sget-object v6, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 18
    .line 19
    if-eq v5, v6, :cond_7

    .line 20
    const/4 v6, 0x2

    .line 21
    .line 22
    new-array v7, v6, [I

    .line 23
    const/4 v8, 0x1

    .line 24
    .line 25
    .line 26
    invoke-static {v5, v7, v4, v7, v8}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 27
    move-result v5

    .line 28
    .line 29
    if-eqz v5, :cond_6

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 34
    goto :goto_2

    .line 35
    .line 36
    :cond_0
    new-array v12, v8, [Landroid/opengl/EGLConfig;

    .line 37
    .line 38
    new-array v15, v8, [I

    .line 39
    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    sget-object v0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->ATTRIBUTE_LIST_FOR_OFFSCREEN_SURFACE:[I

    .line 43
    :goto_0
    move-object v10, v0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    sget-object v0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->ATTRIBUTE_LIST_FOR_SURFACE:[I

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :goto_1
    iget-object v9, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 50
    const/4 v14, 0x1

    .line 51
    .line 52
    const/16 v16, 0x0

    .line 53
    const/4 v11, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    .line 56
    .line 57
    invoke-static/range {v9 .. v16}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 58
    move-result v0

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    aget-object v0, v12, v4

    .line 63
    .line 64
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 65
    .line 66
    .line 67
    :goto_2
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 68
    move-result v0

    .line 69
    .line 70
    const/16 v5, 0x12

    .line 71
    .line 72
    if-lt v0, v5, :cond_2

    .line 73
    .line 74
    :try_start_0
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 75
    .line 76
    iget-object v5, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v5, v6, v2}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->createEGLContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;ILandroid/opengl/EGLContext;)Landroid/opengl/EGLContext;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;
    :try_end_0
    .catch Lcom/tencent/ugc/videobase/egl/EGLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_3

    .line 84
    .line 85
    :catch_0
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mTAG:Ljava/lang/String;

    .line 86
    .line 87
    const-string v5, "failed to create EGLContext of OpenGL ES 2.0, try 3.0"

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v5}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 93
    .line 94
    iget-object v5, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 95
    const/4 v6, 0x3

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v5, v6, v2}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->createEGLContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;ILandroid/opengl/EGLContext;)Landroid/opengl/EGLContext;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 102
    goto :goto_3

    .line 103
    .line 104
    :cond_2
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 105
    .line 106
    iget-object v5, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v5, v6, v2}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->createEGLContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;ILandroid/opengl/EGLContext;)Landroid/opengl/EGLContext;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 113
    .line 114
    :goto_3
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mTAG:Ljava/lang/String;

    .line 115
    .line 116
    new-instance v5, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v7, "create eglContext "

    .line 119
    .line 120
    .line 121
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    iget-object v7, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v7, " sharedContext: "

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v2, " version:"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    move-result-object v2

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    const/16 v0, 0x3038

    .line 152
    .line 153
    if-nez v3, :cond_3

    .line 154
    .line 155
    iget v2, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mWidth:I

    .line 156
    .line 157
    const/16 v3, 0x3056

    .line 158
    .line 159
    iget v5, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mHeight:I

    .line 160
    .line 161
    const/16 v6, 0x3057

    .line 162
    .line 163
    .line 164
    filled-new-array {v6, v2, v3, v5, v0}, [I

    .line 165
    move-result-object v0

    .line 166
    .line 167
    iget-object v2, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 168
    .line 169
    iget-object v3, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 170
    .line 171
    .line 172
    invoke-static {v2, v3, v0, v4}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 176
    goto :goto_4

    .line 177
    .line 178
    .line 179
    :cond_3
    filled-new-array {v0}, [I

    .line 180
    move-result-object v0

    .line 181
    .line 182
    :try_start_1
    iget-object v2, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 183
    .line 184
    iget-object v5, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 185
    .line 186
    .line 187
    invoke-static {v2, v5, v3, v0, v4}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 191
    .line 192
    .line 193
    :goto_4
    invoke-static {}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->throwEGLExceptionIfFailed()V

    .line 194
    .line 195
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 196
    .line 197
    iget-object v2, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 198
    .line 199
    iget-object v3, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 203
    move-result v0

    .line 204
    .line 205
    if-nez v0, :cond_4

    .line 206
    .line 207
    .line 208
    invoke-static {}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->throwEGLExceptionIfFailed()V

    .line 209
    :cond_4
    return-void

    .line 210
    :catchall_0
    move-exception v0

    .line 211
    .line 212
    .line 213
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 214
    move-result v2

    .line 215
    .line 216
    new-instance v3, Lcom/tencent/ugc/videobase/egl/EGLException;

    .line 217
    .line 218
    const-string v4, ""

    .line 219
    .line 220
    .line 221
    invoke-direct {v3, v2, v4, v0}, Lcom/tencent/ugc/videobase/egl/EGLException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 222
    throw v3

    .line 223
    .line 224
    :cond_5
    new-instance v0, Lcom/tencent/ugc/videobase/egl/EGLException;

    .line 225
    .line 226
    .line 227
    invoke-direct {v0, v4}, Lcom/tencent/ugc/videobase/egl/EGLException;-><init>(I)V

    .line 228
    throw v0

    .line 229
    :cond_6
    const/4 v0, 0x0

    .line 230
    .line 231
    iput-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 232
    .line 233
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mTAG:Ljava/lang/String;

    .line 234
    .line 235
    const-string v2, "unable to initialize EGL14"

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    new-instance v0, Lcom/tencent/ugc/videobase/egl/EGLException;

    .line 241
    .line 242
    .line 243
    invoke-direct {v0, v4}, Lcom/tencent/ugc/videobase/egl/EGLException;-><init>(I)V

    .line 244
    throw v0

    .line 245
    .line 246
    :cond_7
    iget-object v0, v1, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mTAG:Ljava/lang/String;

    .line 247
    .line 248
    const-string v2, "unable to get EGL14 display"

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    new-instance v0, Lcom/tencent/ugc/videobase/egl/EGLException;

    .line 254
    .line 255
    .line 256
    invoke-direct {v0, v4}, Lcom/tencent/ugc/videobase/egl/EGLException;-><init>(I)V

    .line 257
    throw v0
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
.end method

.method private static throwEGLExceptionIfFailed()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/ugc/videobase/egl/EGLException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x3000

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v1, Lcom/tencent/ugc/videobase/egl/EGLException;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v0}, Lcom/tencent/ugc/videobase/egl/EGLException;-><init>(I)V

    .line 15
    throw v1
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
.end method


# virtual methods
.method public destroy()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 3
    .line 4
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 5
    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 9
    .line 10
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 16
    .line 17
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 25
    .line 26
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 31
    .line 32
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 33
    .line 34
    if-eq v0, v1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mTAG:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "destroy eglContext "

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    iget-object v2, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 58
    .line 59
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 63
    .line 64
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 70
    .line 71
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 75
    .line 76
    :cond_2
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 79
    return-void
    .line 80
    .line 81
.end method

.method public destroySurface()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 3
    .line 4
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->unmakeCurrent()V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 17
    .line 18
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 21
    :cond_0
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
.end method

.method public getContext()Landroid/opengl/EGLContext;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    return-object v0
.end method

.method public bridge synthetic getContext()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->getContext()Landroid/opengl/EGLContext;

    move-result-object v0

    return-object v0
.end method

.method public getSurfaceSize()Lcom/tencent/liteav/base/util/Size;
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 8
    .line 9
    const/16 v3, 0x3057

    .line 10
    const/4 v4, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0, v4}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    iget-object v2, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 17
    .line 18
    iget-object v3, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 19
    .line 20
    const/16 v5, 0x3056

    .line 21
    const/4 v6, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3, v5, v0, v6}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    new-instance v1, Lcom/tencent/liteav/base/util/Size;

    .line 32
    .line 33
    aget v2, v0, v4

    .line 34
    .line 35
    aget v0, v0, v6

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 39
    return-object v1

    .line 40
    .line 41
    :cond_0
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v4, v4}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 45
    return-object v0
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

.method public makeCurrent()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/ugc/videobase/egl/EGLException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLContext:Landroid/opengl/EGLContext;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->throwEGLExceptionIfFailed()V

    .line 16
    :cond_0
    return-void
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
.end method

.method public setPresentationTime(J)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

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

.method public swapBuffers()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/ugc/videobase/egl/EGLException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->throwEGLExceptionIfFailed()V

    .line 17
    :cond_0
    return-void
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
.end method

.method public unmakeCurrent()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 3
    .line 4
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 9
    .line 10
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 14
    :cond_0
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
.end method

.method public updateSurface(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencent/ugc/videobase/egl/EGLException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->destroySurface()V

    .line 4
    .line 5
    const/16 v0, 0x3038

    .line 6
    .line 7
    .line 8
    filled-new-array {v0}, [I

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLDisplay:Landroid/opengl/EGLDisplay;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLConfig:Landroid/opengl/EGLConfig;

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, p1, v0, v3}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, p0, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->mEGLSurface:Landroid/opengl/EGLSurface;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/ugc/videobase/egl/EGL14Helper;->throwEGLExceptionIfFailed()V

    .line 24
    return-void
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
