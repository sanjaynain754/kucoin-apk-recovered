.class public Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;
.super Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;
    }
.end annotation


# static fields
.field private static final DURATION_PHANTOM_LV1:I = 0xf0

.field private static final DURATION_PHANTOM_LV10:I = 0x528

.field private static final DURATION_PHANTOM_LV11:I = 0x5a0

.field private static final DURATION_PHANTOM_LV12:I = 0x618

.field private static final DURATION_PHANTOM_LV13:I = 0x690

.field private static final DURATION_PHANTOM_LV14:I = 0x708

.field private static final DURATION_PHANTOM_LV2:I = 0x168

.field private static final DURATION_PHANTOM_LV3:I = 0x1e0

.field private static final DURATION_PHANTOM_LV4:I = 0x258

.field private static final DURATION_PHANTOM_LV5:I = 0x2d0

.field private static final DURATION_PHANTOM_LV6:I = 0x348

.field private static final DURATION_PHANTOM_LV7:I = 0x3c0

.field private static final DURATION_PHANTOM_LV8:I = 0x438

.field private static final DURATION_PHANTOM_LV9:I = 0x4b0

.field private static final DURATION_PHANTOM_LVMIN:I = 0x78


# instance fields
.field private mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter;-><init>()V

    .line 4
    return-void
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
.method public setNextFrameTimestamp(J)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter;->setNextFrameTimestamp(J)V

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;-><init>()V

    .line 15
    .line 16
    iput-object v1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 17
    .line 18
    iput v2, v1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->fringeNumber:I

    .line 19
    .line 20
    .line 21
    const v3, 0x3e99999a    # 0.3f

    .line 22
    .line 23
    iput v3, v1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->alpahLevel:F

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 26
    .line 27
    new-array v3, v0, [F

    .line 28
    .line 29
    .line 30
    fill-array-data v3, :array_0

    .line 31
    .line 32
    iput-object v3, v1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;->offetRed:[F

    .line 33
    .line 34
    new-array v3, v0, [F

    .line 35
    .line 36
    .line 37
    fill-array-data v3, :array_1

    .line 38
    .line 39
    iput-object v3, v1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;->offsetGreen:[F

    .line 40
    .line 41
    iget-wide v3, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;->mEffectStartTime:J

    .line 42
    sub-long/2addr p1, v3

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    .line 46
    move-result-wide p1

    .line 47
    .line 48
    const-wide/16 v3, 0x78

    .line 49
    .line 50
    cmp-long v1, p1, v3

    .line 51
    .line 52
    if-gez v1, :cond_1

    .line 53
    .line 54
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 55
    const/4 p2, 0x0

    .line 56
    .line 57
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 58
    .line 59
    new-array p2, v0, [F

    .line 60
    .line 61
    .line 62
    fill-array-data p2, :array_2

    .line 63
    .line 64
    iput-object p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;->offetRed:[F

    .line 65
    .line 66
    new-array p2, v0, [F

    .line 67
    .line 68
    .line 69
    fill-array-data p2, :array_3

    .line 70
    .line 71
    iput-object p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;->offsetGreen:[F

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_1
    if-gez v1, :cond_2

    .line 76
    .line 77
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 78
    .line 79
    iput v2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_2
    const-wide/16 v1, 0xf0

    .line 84
    .line 85
    cmp-long v1, p1, v1

    .line 86
    .line 87
    if-gez v1, :cond_3

    .line 88
    .line 89
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 90
    .line 91
    iput v0, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_3
    const-wide/16 v0, 0x168

    .line 96
    .line 97
    cmp-long v0, p1, v0

    .line 98
    .line 99
    if-gez v0, :cond_4

    .line 100
    .line 101
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 102
    const/4 p2, 0x3

    .line 103
    .line 104
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 105
    .line 106
    goto/16 :goto_0

    .line 107
    .line 108
    :cond_4
    const-wide/16 v0, 0x1e0

    .line 109
    .line 110
    cmp-long v0, p1, v0

    .line 111
    .line 112
    if-gez v0, :cond_5

    .line 113
    .line 114
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 115
    const/4 p2, 0x4

    .line 116
    .line 117
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_5
    const-wide/16 v0, 0x258

    .line 122
    .line 123
    cmp-long v0, p1, v0

    .line 124
    .line 125
    if-gez v0, :cond_6

    .line 126
    .line 127
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 128
    const/4 p2, 0x5

    .line 129
    .line 130
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_6
    const-wide/16 v0, 0x2d0

    .line 135
    .line 136
    cmp-long v0, p1, v0

    .line 137
    .line 138
    if-gez v0, :cond_7

    .line 139
    .line 140
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 141
    const/4 p2, 0x6

    .line 142
    .line 143
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_7
    const-wide/16 v0, 0x348

    .line 148
    .line 149
    cmp-long v0, p1, v0

    .line 150
    .line 151
    if-gez v0, :cond_8

    .line 152
    .line 153
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 154
    const/4 p2, 0x7

    .line 155
    .line 156
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_8
    const-wide/16 v0, 0x3c0

    .line 161
    .line 162
    cmp-long v0, p1, v0

    .line 163
    .line 164
    if-gez v0, :cond_9

    .line 165
    .line 166
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 167
    .line 168
    const/16 p2, 0x8

    .line 169
    .line 170
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 171
    goto :goto_0

    .line 172
    .line 173
    :cond_9
    const-wide/16 v0, 0x438

    .line 174
    .line 175
    cmp-long v0, p1, v0

    .line 176
    .line 177
    if-gez v0, :cond_a

    .line 178
    .line 179
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 180
    .line 181
    const/16 p2, 0x9

    .line 182
    .line 183
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 184
    goto :goto_0

    .line 185
    .line 186
    :cond_a
    const-wide/16 v0, 0x4b0

    .line 187
    .line 188
    cmp-long v0, p1, v0

    .line 189
    .line 190
    if-gez v0, :cond_b

    .line 191
    .line 192
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 193
    .line 194
    const/16 p2, 0xa

    .line 195
    .line 196
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 197
    goto :goto_0

    .line 198
    .line 199
    :cond_b
    const-wide/16 v0, 0x528

    .line 200
    .line 201
    cmp-long v0, p1, v0

    .line 202
    .line 203
    if-gez v0, :cond_c

    .line 204
    .line 205
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 206
    .line 207
    const/16 p2, 0xb

    .line 208
    .line 209
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 210
    goto :goto_0

    .line 211
    .line 212
    :cond_c
    const-wide/16 v0, 0x5a0

    .line 213
    .line 214
    cmp-long v0, p1, v0

    .line 215
    .line 216
    if-gez v0, :cond_d

    .line 217
    .line 218
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 219
    .line 220
    const/16 p2, 0xc

    .line 221
    .line 222
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 223
    goto :goto_0

    .line 224
    .line 225
    :cond_d
    const-wide/16 v0, 0x618

    .line 226
    .line 227
    cmp-long v0, p1, v0

    .line 228
    .line 229
    if-gez v0, :cond_e

    .line 230
    .line 231
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 232
    .line 233
    const/16 p2, 0xd

    .line 234
    .line 235
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 236
    goto :goto_0

    .line 237
    .line 238
    :cond_e
    const-wide/16 v0, 0x690

    .line 239
    .line 240
    cmp-long v0, p1, v0

    .line 241
    .line 242
    if-gez v0, :cond_f

    .line 243
    .line 244
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 245
    .line 246
    const/16 p2, 0xe

    .line 247
    .line 248
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 249
    goto :goto_0

    .line 250
    .line 251
    :cond_f
    const-wide/16 v0, 0x708

    .line 252
    .line 253
    cmp-long p1, p1, v0

    .line 254
    .line 255
    if-gez p1, :cond_10

    .line 256
    .line 257
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 258
    .line 259
    const/16 p2, 0xf

    .line 260
    .line 261
    iput p2, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter$SpiritOutEffectParam;->zoomOutLevel:I

    .line 262
    goto :goto_0

    .line 263
    .line 264
    :cond_10
    const-wide/16 p1, -0x1

    .line 265
    .line 266
    iput-wide p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;->mEffectStartTime:J

    .line 267
    .line 268
    :goto_0
    iget-object p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter;->mPhantomParam:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;

    .line 269
    .line 270
    if-eqz p1, :cond_11

    .line 271
    .line 272
    iget-object p2, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUSpiritOutFilter;->mZoomInOutFilter:Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCZoomInOutFilter;

    .line 273
    .line 274
    if-eqz p2, :cond_11

    .line 275
    .line 276
    iget-object v0, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;->offetRed:[F

    .line 277
    .line 278
    iget-object v1, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;->offsetGreen:[F

    .line 279
    .line 280
    iget-object p1, p1, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUPhontomFilter$PhantomParam;->offsetBlue:[F

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2, v0, v1, p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCZoomInOutFilter;->setColorOffset([F[F[F)V

    .line 284
    :cond_11
    return-void

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    :array_1
    .array-data 4
        0x0
        0x3dcccccd    # 0.1f
    .end array-data

    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data
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
