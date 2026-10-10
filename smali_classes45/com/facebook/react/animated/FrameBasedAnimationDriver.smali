.class public final Lcom/facebook/react/animated/FrameBasedAnimationDriver;
.super Lcom/facebook/react/animated/AnimationDriver;
.source "FrameBasedAnimationDriver.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/FrameBasedAnimationDriver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/facebook/react/animated/FrameBasedAnimationDriver;",
        "Lcom/facebook/react/animated/AnimationDriver;",
        "config",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "startFrameTimeNanos",
        "",
        "frames",
        "",
        "toValue",
        "",
        "fromValue",
        "iterations",
        "",
        "currentLoop",
        "logCount",
        "resetConfig",
        "",
        "runAnimationStep",
        "frameTimeNanos",
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
        "SMAP\nFrameBasedAnimationDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameBasedAnimationDriver.kt\ncom/facebook/react/animated/FrameBasedAnimationDriver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/animated/FrameBasedAnimationDriver$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FRAME_TIME_MILLIS:D = 16.666666666666668


# instance fields
.field private currentLoop:I

.field private frames:[D
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private fromValue:D

.field private iterations:I

.field private logCount:I

.field private startFrameTimeNanos:J

.field private toValue:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/animated/FrameBasedAnimationDriver$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/animated/FrameBasedAnimationDriver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->Companion:Lcom/facebook/react/animated/FrameBasedAnimationDriver$Companion;

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
    iput-wide v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->startFrameTimeNanos:J

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    new-array v0, v0, [D

    .line 16
    .line 17
    iput-object v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->frames:[D

    .line 18
    const/4 v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->iterations:I

    .line 21
    .line 22
    iput v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->currentLoop:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V

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
.end method


# virtual methods
.method public resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 7
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
    const-string v0, "frames"

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 18
    move-result v2

    .line 19
    .line 20
    iget-object v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->frames:[D

    .line 21
    array-length v3, v3

    .line 22
    .line 23
    if-eq v3, v2, :cond_1

    .line 24
    .line 25
    new-array v3, v2, [D

    .line 26
    move v4, v1

    .line 27
    .line 28
    :goto_0
    if-ge v4, v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 32
    move-result-wide v5

    .line 33
    .line 34
    aput-wide v5, v3, v4

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    iput-object v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->frames:[D

    .line 40
    .line 41
    .line 42
    :cond_1
    const-string/jumbo v0, "toValue"

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 46
    move-result v2

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 55
    .line 56
    if-ne v2, v3, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 60
    move-result-wide v2

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_2
    const-wide/16 v2, 0x0

    .line 64
    .line 65
    :goto_1
    iput-wide v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->toValue:D

    .line 66
    .line 67
    const-string v0, "iterations"

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 71
    move-result v2

    .line 72
    const/4 v3, 0x1

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    sget-object v4, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 81
    .line 82
    if-ne v2, v4, :cond_3

    .line 83
    .line 84
    .line 85
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 86
    move-result p1

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move p1, v3

    .line 89
    .line 90
    :goto_2
    iput p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->iterations:I

    .line 91
    .line 92
    iput v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->currentLoop:I

    .line 93
    .line 94
    if-nez p1, :cond_4

    .line 95
    move v1, v3

    .line 96
    .line 97
    :cond_4
    iput-boolean v1, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 98
    .line 99
    const-wide/16 v0, -0x1

    .line 100
    .line 101
    iput-wide v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->startFrameTimeNanos:J

    .line 102
    return-void
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
.end method

.method public runAnimationStep(J)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->animatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 3
    .line 4
    if-eqz v0, :cond_8

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->startFrameTimeNanos:J

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    if-gez v1, :cond_0

    .line 14
    .line 15
    iput-wide p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->startFrameTimeNanos:J

    .line 16
    .line 17
    iget v1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->currentLoop:I

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    iget-wide v3, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 22
    .line 23
    iput-wide v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->fromValue:D

    .line 24
    .line 25
    :cond_0
    iget-wide v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->startFrameTimeNanos:J

    .line 26
    .line 27
    sub-long v3, p1, v3

    .line 28
    .line 29
    .line 30
    const v1, 0xf4240

    .line 31
    int-to-long v5, v1

    .line 32
    div-long/2addr v3, v5

    .line 33
    long-to-double v3, v3

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide v5, 0x4030aaaaaaaaaaabL    # 16.666666666666668

    .line 39
    div-double/2addr v3, v5

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 43
    move-result-wide v3

    .line 44
    long-to-int v1, v3

    .line 45
    .line 46
    if-gez v1, :cond_2

    .line 47
    .line 48
    iget-wide v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->startFrameTimeNanos:J

    .line 49
    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    const-string v4, "Calculated frame index should never be lower than 0. Called with frameTimeNanos "

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string p1, " and mStartFrameTimeNanos "

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    sget-boolean p2, Lcom/facebook/react/common/build/ReactBuildConfig;->DEBUG:Z

    .line 76
    .line 77
    if-nez p2, :cond_1

    .line 78
    .line 79
    iget p2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->logCount:I

    .line 80
    .line 81
    const/16 v0, 0x64

    .line 82
    .line 83
    if-ge p2, v0, :cond_3

    .line 84
    .line 85
    const-string p2, "ReactNative"

    .line 86
    .line 87
    .line 88
    invoke-static {p2, p1}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    iget p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->logCount:I

    .line 91
    add-int/2addr p1, v2

    .line 92
    .line 93
    iput p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->logCount:I

    .line 94
    return-void

    .line 95
    .line 96
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    .line 103
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    throw p2

    .line 105
    .line 106
    :cond_2
    iget-boolean p1, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 107
    .line 108
    if-eqz p1, :cond_4

    .line 109
    :cond_3
    return-void

    .line 110
    .line 111
    :cond_4
    iget-object p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->frames:[D

    .line 112
    array-length p2, p1

    .line 113
    sub-int/2addr p2, v2

    .line 114
    .line 115
    if-lt v1, p2, :cond_7

    .line 116
    .line 117
    iget p2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->iterations:I

    .line 118
    const/4 v1, -0x1

    .line 119
    .line 120
    if-eq p2, v1, :cond_6

    .line 121
    .line 122
    iget v1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->currentLoop:I

    .line 123
    .line 124
    if-ge v1, p2, :cond_5

    .line 125
    goto :goto_0

    .line 126
    .line 127
    :cond_5
    iget-wide p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->toValue:D

    .line 128
    .line 129
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 130
    goto :goto_1

    .line 131
    .line 132
    :cond_6
    :goto_0
    iget-wide v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->fromValue:D

    .line 133
    array-length p2, p1

    .line 134
    sub-int/2addr p2, v2

    .line 135
    .line 136
    aget-wide v5, p1, p2

    .line 137
    .line 138
    iget-wide p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->toValue:D

    .line 139
    sub-double/2addr p1, v3

    .line 140
    mul-double/2addr v5, p1

    .line 141
    .line 142
    add-double p1, v3, v5

    .line 143
    .line 144
    const-wide/16 v3, -0x1

    .line 145
    .line 146
    iput-wide v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->startFrameTimeNanos:J

    .line 147
    .line 148
    iget v1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->currentLoop:I

    .line 149
    add-int/2addr v1, v2

    .line 150
    .line 151
    iput v1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->currentLoop:I

    .line 152
    goto :goto_1

    .line 153
    .line 154
    :cond_7
    iget-wide v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->fromValue:D

    .line 155
    .line 156
    aget-wide v4, p1, v1

    .line 157
    .line 158
    iget-wide p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->toValue:D

    .line 159
    sub-double/2addr p1, v2

    .line 160
    mul-double/2addr v4, p1

    .line 161
    .line 162
    add-double p1, v2, v4

    .line 163
    .line 164
    :goto_1
    iput-wide p1, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 165
    return-void

    .line 166
    .line 167
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    const-string p2, "Animated value should not be null"

    .line 170
    .line 171
    .line 172
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    throw p1
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
