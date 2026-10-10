.class public final Lcom/facebook/react/animated/SpringAnimation;
.super Lcom/facebook/react/animated/AnimationDriver;
.source "SpringAnimation.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/SpringAnimation$Companion;,
        Lcom/facebook/react/animated/SpringAnimation$PhysicsState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0002&\'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0011H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\"\u00a8\u0006("
    }
    d2 = {
        "Lcom/facebook/react/animated/SpringAnimation;",
        "Lcom/facebook/react/animated/AnimationDriver;",
        "config",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "lastTime",
        "",
        "springStarted",
        "",
        "springStiffness",
        "",
        "springDamping",
        "springMass",
        "initialVelocity",
        "overshootClampingEnabled",
        "currentState",
        "Lcom/facebook/react/animated/SpringAnimation$PhysicsState;",
        "startValue",
        "endValue",
        "restSpeedThreshold",
        "displacementFromRestThreshold",
        "timeAccumulator",
        "iterations",
        "",
        "currentLoop",
        "originalValue",
        "resetConfig",
        "",
        "runAnimationStep",
        "frameTimeNanos",
        "getDisplacementDistanceForState",
        "state",
        "isAtRest",
        "()Z",
        "isOvershooting",
        "advance",
        "realDeltaTime",
        "PhysicsState",
        "Companion",
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
        "SMAP\nSpringAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringAnimation.kt\ncom/facebook/react/animated/SpringAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/animated/SpringAnimation$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MAX_DELTA_TIME_SEC:D = 0.064


# instance fields
.field private currentLoop:I

.field private final currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private displacementFromRestThreshold:D

.field private endValue:D

.field private initialVelocity:D

.field private iterations:I

.field private lastTime:J

.field private originalValue:D

.field private overshootClampingEnabled:Z

.field private restSpeedThreshold:D

.field private springDamping:D

.field private springMass:D

.field private springStarted:Z

.field private springStiffness:D

.field private startValue:D

.field private timeAccumulator:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/animated/SpringAnimation$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/animated/SpringAnimation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/animated/SpringAnimation;->Companion:Lcom/facebook/react/animated/SpringAnimation$Companion;

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
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 8
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
    new-instance v1, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x0

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v1 .. v7}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;-><init>(DDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 22
    .line 23
    const-string v0, "initialVelocity"

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 27
    move-result-wide v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setVelocity(D)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/SpringAnimation;->resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V

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
.end method

.method private final advance(D)V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :cond_0
    const-wide v1, 0x3fb0624dd2f1a9fcL    # 0.064

    .line 16
    .line 17
    cmpl-double v3, p1, v1

    .line 18
    .line 19
    if-lez v3, :cond_1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_1
    move-wide/from16 v1, p1

    .line 23
    .line 24
    :goto_0
    iget-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 25
    add-double/2addr v3, v1

    .line 26
    .line 27
    iput-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 28
    .line 29
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->springDamping:D

    .line 30
    .line 31
    iget-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->springMass:D

    .line 32
    .line 33
    iget-wide v5, v0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 34
    .line 35
    iget-wide v7, v0, Lcom/facebook/react/animated/SpringAnimation;->initialVelocity:D

    .line 36
    neg-double v7, v7

    .line 37
    const/4 v9, 0x2

    .line 38
    int-to-double v9, v9

    .line 39
    .line 40
    mul-double v11, v5, v3

    .line 41
    .line 42
    .line 43
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 44
    move-result-wide v11

    .line 45
    mul-double/2addr v9, v11

    .line 46
    div-double/2addr v1, v9

    .line 47
    div-double/2addr v5, v3

    .line 48
    .line 49
    .line 50
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 51
    move-result-wide v3

    .line 52
    .line 53
    mul-double v5, v1, v1

    .line 54
    .line 55
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 56
    .line 57
    sub-double v5, v9, v5

    .line 58
    .line 59
    .line 60
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 61
    move-result-wide v5

    .line 62
    mul-double/2addr v5, v3

    .line 63
    .line 64
    iget-wide v11, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 65
    .line 66
    iget-wide v13, v0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 67
    sub-double/2addr v11, v13

    .line 68
    .line 69
    iget-wide v13, v0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 70
    .line 71
    cmpg-double v9, v1, v9

    .line 72
    .line 73
    if-gez v9, :cond_2

    .line 74
    neg-double v9, v1

    .line 75
    mul-double/2addr v9, v3

    .line 76
    mul-double/2addr v9, v13

    .line 77
    .line 78
    .line 79
    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    .line 80
    move-result-wide v9

    .line 81
    .line 82
    move-wide/from16 p1, v1

    .line 83
    .line 84
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 85
    .line 86
    mul-double v3, v3, p1

    .line 87
    .line 88
    mul-double v15, v3, v11

    .line 89
    add-double/2addr v7, v15

    .line 90
    .line 91
    div-double v15, v7, v5

    .line 92
    mul-double/2addr v13, v5

    .line 93
    .line 94
    .line 95
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 96
    move-result-wide v17

    .line 97
    .line 98
    mul-double v15, v15, v17

    .line 99
    .line 100
    .line 101
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 102
    move-result-wide v17

    .line 103
    .line 104
    mul-double v17, v17, v11

    .line 105
    .line 106
    add-double v15, v15, v17

    .line 107
    mul-double/2addr v15, v9

    .line 108
    sub-double/2addr v1, v15

    .line 109
    mul-double/2addr v3, v9

    .line 110
    .line 111
    .line 112
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 113
    move-result-wide v15

    .line 114
    mul-double/2addr v15, v7

    .line 115
    div-double/2addr v15, v5

    .line 116
    .line 117
    .line 118
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 119
    move-result-wide v17

    .line 120
    .line 121
    mul-double v17, v17, v11

    .line 122
    .line 123
    add-double v15, v15, v17

    .line 124
    mul-double/2addr v3, v15

    .line 125
    .line 126
    .line 127
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 128
    move-result-wide v15

    .line 129
    mul-double/2addr v15, v7

    .line 130
    mul-double/2addr v5, v11

    .line 131
    .line 132
    .line 133
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 134
    move-result-wide v7

    .line 135
    mul-double/2addr v5, v7

    .line 136
    sub-double/2addr v15, v5

    .line 137
    mul-double/2addr v9, v15

    .line 138
    sub-double/2addr v3, v9

    .line 139
    goto :goto_1

    .line 140
    :cond_2
    neg-double v1, v3

    .line 141
    mul-double/2addr v1, v13

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    .line 145
    move-result-wide v1

    .line 146
    .line 147
    iget-wide v5, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 148
    .line 149
    mul-double v9, v3, v11

    .line 150
    add-double/2addr v9, v7

    .line 151
    mul-double/2addr v9, v13

    .line 152
    add-double/2addr v9, v11

    .line 153
    mul-double/2addr v9, v1

    .line 154
    sub-double/2addr v5, v9

    .line 155
    .line 156
    mul-double v9, v13, v3

    .line 157
    const/4 v15, 0x1

    .line 158
    .line 159
    move-wide/from16 p1, v1

    .line 160
    int-to-double v1, v15

    .line 161
    sub-double/2addr v9, v1

    .line 162
    mul-double/2addr v7, v9

    .line 163
    mul-double/2addr v13, v11

    .line 164
    mul-double/2addr v3, v3

    .line 165
    mul-double/2addr v13, v3

    .line 166
    add-double/2addr v7, v13

    .line 167
    .line 168
    mul-double v3, p1, v7

    .line 169
    move-wide v1, v5

    .line 170
    .line 171
    :goto_1
    iget-object v5, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5, v1, v2}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setPosition(D)V

    .line 175
    .line 176
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v3, v4}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setVelocity(D)V

    .line 180
    .line 181
    .line 182
    invoke-direct {v0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 183
    move-result v1

    .line 184
    .line 185
    if-nez v1, :cond_4

    .line 186
    .line 187
    iget-boolean v1, v0, Lcom/facebook/react/animated/SpringAnimation;->overshootClampingEnabled:Z

    .line 188
    .line 189
    if-eqz v1, :cond_3

    .line 190
    .line 191
    .line 192
    invoke-direct {v0}, Lcom/facebook/react/animated/SpringAnimation;->isOvershooting()Z

    .line 193
    move-result v1

    .line 194
    .line 195
    if-eqz v1, :cond_3

    .line 196
    goto :goto_3

    .line 197
    :cond_3
    :goto_2
    return-void

    .line 198
    .line 199
    :cond_4
    :goto_3
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 200
    .line 201
    const-wide/16 v3, 0x0

    .line 202
    .line 203
    cmpl-double v1, v1, v3

    .line 204
    .line 205
    if-lez v1, :cond_5

    .line 206
    .line 207
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 208
    .line 209
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 210
    .line 211
    iget-object v5, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v1, v2}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setPosition(D)V

    .line 215
    goto :goto_4

    .line 216
    .line 217
    :cond_5
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 221
    move-result-wide v1

    .line 222
    .line 223
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 224
    .line 225
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 226
    .line 227
    :goto_4
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v3, v4}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setVelocity(D)V

    .line 231
    return-void
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

.method private final getDisplacementDistanceForState(Lcom/facebook/react/animated/SpringAnimation$PhysicsState;)D
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 6
    move-result-wide v2

    .line 7
    sub-double/2addr v0, v2

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method private final isAtRest()Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getVelocity()D

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->restSpeedThreshold:D

    .line 13
    .line 14
    cmpg-double v0, v0, v2

    .line 15
    .line 16
    if-gtz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Lcom/facebook/react/animated/SpringAnimation;->getDisplacementDistanceForState(Lcom/facebook/react/animated/SpringAnimation$PhysicsState;)D

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->displacementFromRestThreshold:D

    .line 25
    .line 26
    cmpg-double v0, v0, v2

    .line 27
    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 31
    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    cmpg-double v0, v0, v2

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
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
.end method

.method private final isOvershooting()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmpl-double v0, v0, v2

    .line 7
    .line 8
    if-lez v0, :cond_2

    .line 9
    .line 10
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 13
    .line 14
    cmpg-double v0, v0, v2

    .line 15
    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 25
    .line 26
    cmpl-double v0, v0, v2

    .line 27
    .line 28
    if-gtz v0, :cond_1

    .line 29
    .line 30
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 31
    .line 32
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 33
    .line 34
    cmpl-double v0, v0, v2

    .line 35
    .line 36
    if-lez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 42
    move-result-wide v0

    .line 43
    .line 44
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 45
    .line 46
    cmpg-double v0, v0, v2

    .line 47
    .line 48
    if-gez v0, :cond_2

    .line 49
    :cond_1
    const/4 v0, 0x1

    .line 50
    return v0

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    return v0
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
    const-string/jumbo v0, "stiffness"

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 15
    .line 16
    const-string v0, "damping"

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 20
    move-result-wide v0

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springDamping:D

    .line 23
    .line 24
    const-string v0, "mass"

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 28
    move-result-wide v0

    .line 29
    .line 30
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springMass:D

    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getVelocity()D

    .line 36
    move-result-wide v0

    .line 37
    .line 38
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->initialVelocity:D

    .line 39
    .line 40
    .line 41
    const-string/jumbo v0, "toValue"

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 45
    move-result-wide v0

    .line 46
    .line 47
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 48
    .line 49
    .line 50
    const-string/jumbo v0, "restSpeedThreshold"

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 54
    move-result-wide v0

    .line 55
    .line 56
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->restSpeedThreshold:D

    .line 57
    .line 58
    .line 59
    const-string/jumbo v0, "restDisplacementThreshold"

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 63
    move-result-wide v0

    .line 64
    .line 65
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->displacementFromRestThreshold:D

    .line 66
    .line 67
    const-string v0, "overshootClamping"

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 71
    move-result v0

    .line 72
    .line 73
    iput-boolean v0, p0, Lcom/facebook/react/animated/SpringAnimation;->overshootClampingEnabled:Z

    .line 74
    .line 75
    const-string v0, "iterations"

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 79
    move-result v1

    .line 80
    const/4 v2, 0x1

    .line 81
    .line 82
    if-eqz v1, :cond_0

    .line 83
    .line 84
    .line 85
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 86
    move-result p1

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    move p1, v2

    .line 89
    .line 90
    :goto_0
    iput p1, p0, Lcom/facebook/react/animated/SpringAnimation;->iterations:I

    .line 91
    const/4 v0, 0x0

    .line 92
    .line 93
    if-nez p1, :cond_1

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move v2, v0

    .line 96
    .line 97
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 98
    .line 99
    iput v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 100
    .line 101
    const-wide/16 v1, 0x0

    .line 102
    .line 103
    iput-wide v1, p0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 104
    .line 105
    iput-boolean v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 106
    return-void
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
.end method

.method public runAnimationStep(J)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->animatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 3
    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    .line 7
    const v1, 0xf4240

    .line 8
    int-to-long v1, v1

    .line 9
    div-long/2addr p1, v1

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-wide v3, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 21
    .line 22
    iput-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->originalValue:D

    .line 23
    .line 24
    iput v2, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 27
    .line 28
    iget-wide v3, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v3, v4}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setPosition(D)V

    .line 32
    .line 33
    iget-object v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 37
    move-result-wide v3

    .line 38
    .line 39
    iput-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 40
    .line 41
    iput-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->lastTime:J

    .line 42
    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    iput-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 46
    .line 47
    iput-boolean v2, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 48
    .line 49
    :cond_1
    iget-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->lastTime:J

    .line 50
    .line 51
    sub-long v3, p1, v3

    .line 52
    long-to-double v3, v3

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    const-wide v5, 0x408f400000000000L    # 1000.0

    .line 58
    div-double/2addr v3, v5

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v3, v4}, Lcom/facebook/react/animated/SpringAnimation;->advance(D)V

    .line 62
    .line 63
    iput-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->lastTime:J

    .line 64
    .line 65
    iget-object p1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 69
    move-result-wide p1

    .line 70
    .line 71
    iput-wide p1, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 75
    move-result p1

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    iget p1, p0, Lcom/facebook/react/animated/SpringAnimation;->iterations:I

    .line 80
    const/4 p2, -0x1

    .line 81
    .line 82
    if-eq p1, p2, :cond_3

    .line 83
    .line 84
    iget p2, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 85
    .line 86
    if-ge p2, p1, :cond_2

    .line 87
    goto :goto_0

    .line 88
    .line 89
    :cond_2
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 90
    return-void

    .line 91
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 92
    .line 93
    iput-boolean p1, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 94
    .line 95
    iget-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->originalValue:D

    .line 96
    .line 97
    iput-wide p1, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 98
    .line 99
    iget p1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 100
    add-int/2addr p1, v2

    .line 101
    .line 102
    iput p1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 103
    :cond_4
    return-void

    .line 104
    .line 105
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 106
    .line 107
    const-string p2, "Animated value should not be null"

    .line 108
    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    throw p1
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
.end method
