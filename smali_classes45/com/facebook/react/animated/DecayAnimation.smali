.class public final Lcom/facebook/react/animated/DecayAnimation;
.super Lcom/facebook/react/animated/AnimationDriver;
.source "DecayAnimation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/facebook/react/animated/DecayAnimation;",
        "Lcom/facebook/react/animated/AnimationDriver;",
        "config",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "velocity",
        "",
        "deceleration",
        "startFrameTimeMillis",
        "",
        "fromValue",
        "lastValue",
        "iterations",
        "",
        "currentLoop",
        "resetConfig",
        "",
        "runAnimationStep",
        "frameTimeNanos",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDecayAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecayAnimation.kt\ncom/facebook/react/animated/DecayAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
    }
.end annotation


# instance fields
.field private currentLoop:I

.field private deceleration:D

.field private fromValue:D

.field private iterations:I

.field private lastValue:D

.field private startFrameTimeMillis:J

.field private velocity:D


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimationDriver;-><init>()V

    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->startFrameTimeMillis:J

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    iput v0, p0, Lcom/facebook/react/animated/DecayAnimation;->iterations:I

    .line 16
    .line 17
    iput v0, p0, Lcom/facebook/react/animated/DecayAnimation;->currentLoop:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/DecayAnimation;->resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 21
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method public resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "velocity"

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->velocity:D

    .line 15
    .line 16
    const-string v0, "deceleration"

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 20
    move-result-wide v0

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->deceleration:D

    .line 23
    .line 24
    const-wide/16 v0, -0x1

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->startFrameTimeMillis:J

    .line 27
    .line 28
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->fromValue:D

    .line 31
    .line 32
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->lastValue:D

    .line 33
    .line 34
    const-string v0, "iterations"

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x1

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 45
    move-result p1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p1, v2

    .line 48
    .line 49
    :goto_0
    iput p1, p0, Lcom/facebook/react/animated/DecayAnimation;->iterations:I

    .line 50
    .line 51
    iput v2, p0, Lcom/facebook/react/animated/DecayAnimation;->currentLoop:I

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v2, 0x0

    .line 56
    .line 57
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 58
    return-void
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
.end method

.method public runAnimationStep(J)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/facebook/react/animated/AnimationDriver;->animatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 5
    .line 6
    if-eqz v1, :cond_5

    .line 7
    .line 8
    .line 9
    const v2, 0xf4240

    .line 10
    int-to-long v2, v2

    .line 11
    .line 12
    div-long v2, p1, v2

    .line 13
    .line 14
    iget-wide v4, v0, Lcom/facebook/react/animated/DecayAnimation;->startFrameTimeMillis:J

    .line 15
    .line 16
    const-wide/16 v6, -0x1

    .line 17
    .line 18
    cmp-long v4, v4, v6

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x10

    .line 23
    int-to-long v4, v4

    .line 24
    .line 25
    sub-long v4, v2, v4

    .line 26
    .line 27
    iput-wide v4, v0, Lcom/facebook/react/animated/DecayAnimation;->startFrameTimeMillis:J

    .line 28
    .line 29
    iget-wide v4, v0, Lcom/facebook/react/animated/DecayAnimation;->fromValue:D

    .line 30
    .line 31
    iget-wide v8, v0, Lcom/facebook/react/animated/DecayAnimation;->lastValue:D

    .line 32
    .line 33
    cmpg-double v8, v4, v8

    .line 34
    .line 35
    if-nez v8, :cond_0

    .line 36
    .line 37
    iget-wide v4, v1, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 38
    .line 39
    iput-wide v4, v0, Lcom/facebook/react/animated/DecayAnimation;->fromValue:D

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_0
    iput-wide v4, v1, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 43
    .line 44
    :goto_0
    iget-wide v4, v1, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 45
    .line 46
    iput-wide v4, v0, Lcom/facebook/react/animated/DecayAnimation;->lastValue:D

    .line 47
    .line 48
    :cond_1
    iget-wide v4, v0, Lcom/facebook/react/animated/DecayAnimation;->fromValue:D

    .line 49
    .line 50
    iget-wide v8, v0, Lcom/facebook/react/animated/DecayAnimation;->velocity:D

    .line 51
    const/4 v10, 0x1

    .line 52
    int-to-double v11, v10

    .line 53
    .line 54
    iget-wide v13, v0, Lcom/facebook/react/animated/DecayAnimation;->deceleration:D

    .line 55
    .line 56
    sub-double v15, v11, v13

    .line 57
    div-double/2addr v8, v15

    .line 58
    .line 59
    sub-double v13, v11, v13

    .line 60
    neg-double v13, v13

    .line 61
    .line 62
    iget-wide v6, v0, Lcom/facebook/react/animated/DecayAnimation;->startFrameTimeMillis:J

    .line 63
    sub-long/2addr v2, v6

    .line 64
    long-to-double v2, v2

    .line 65
    mul-double/2addr v13, v2

    .line 66
    .line 67
    .line 68
    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    .line 69
    move-result-wide v2

    .line 70
    sub-double/2addr v11, v2

    .line 71
    mul-double/2addr v8, v11

    .line 72
    add-double/2addr v4, v8

    .line 73
    .line 74
    iget-wide v2, v0, Lcom/facebook/react/animated/DecayAnimation;->lastValue:D

    .line 75
    sub-double/2addr v2, v4

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 79
    move-result-wide v2

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    const-wide v6, 0x3fb999999999999aL    # 0.1

    .line 85
    .line 86
    cmpg-double v2, v2, v6

    .line 87
    .line 88
    if-gez v2, :cond_4

    .line 89
    .line 90
    iget v2, v0, Lcom/facebook/react/animated/DecayAnimation;->iterations:I

    .line 91
    const/4 v3, -0x1

    .line 92
    .line 93
    if-eq v2, v3, :cond_2

    .line 94
    .line 95
    iget v3, v0, Lcom/facebook/react/animated/DecayAnimation;->currentLoop:I

    .line 96
    .line 97
    if-ge v3, v2, :cond_3

    .line 98
    .line 99
    :cond_2
    const-wide/16 v2, -0x1

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_3
    iput-boolean v10, v0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 103
    return-void

    .line 104
    .line 105
    :goto_1
    iput-wide v2, v0, Lcom/facebook/react/animated/DecayAnimation;->startFrameTimeMillis:J

    .line 106
    .line 107
    iget v2, v0, Lcom/facebook/react/animated/DecayAnimation;->currentLoop:I

    .line 108
    add-int/2addr v2, v10

    .line 109
    .line 110
    iput v2, v0, Lcom/facebook/react/animated/DecayAnimation;->currentLoop:I

    .line 111
    .line 112
    :cond_4
    iput-wide v4, v0, Lcom/facebook/react/animated/DecayAnimation;->lastValue:D

    .line 113
    .line 114
    iput-wide v4, v1, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 115
    return-void

    .line 116
    .line 117
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 118
    .line 119
    const-string v2, "Animated value should not be null"

    .line 120
    .line 121
    .line 122
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    throw v1
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
.end method
