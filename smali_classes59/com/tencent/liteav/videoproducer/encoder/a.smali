.class public final Lcom/tencent/liteav/videoproducer/encoder/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field private final c:Landroid/media/MediaCodec;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

.field private f:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec;Ljava/lang/String;Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->a:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->b:Z

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->c:Landroid/media/MediaCodec;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 15
    .line 16
    iput-object p4, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->f:Ljava/lang/Boolean;

    .line 17
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
.end method

.method private a(II)Landroid/media/MediaCodecInfo$VideoCapabilities;
    .locals 3

    .line 104
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    const/16 v1, 0x15

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    .line 106
    invoke-static {v0, p1, p2}, Landroid/media/MediaCodecInfo$CodecCapabilities;->createFromProfileLevel(Ljava/lang/String;II)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v2

    .line 107
    :cond_1
    invoke-virtual {p1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object p1

    return-object p1
.end method

.method private a(Landroid/media/MediaFormat;II)V
    .locals 17

    move-object/from16 v0, p1

    if-nez v0, :cond_0

    move-object/from16 v1, p0

    goto/16 :goto_2

    :cond_0
    move-object/from16 v1, p0

    move/from16 v2, p2

    move/from16 v3, p3

    .line 81
    invoke-direct {v1, v2, v3}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(II)Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 82
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedWidths()Landroid/util/Range;

    move-result-object v4

    .line 83
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedHeights()Landroid/util/Range;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    move-object v4, v2

    .line 84
    :goto_0
    invoke-direct {v1}, Lcom/tencent/liteav/videoproducer/encoder/a;->c()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 85
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedWidths()Landroid/util/Range;

    move-result-object v3

    .line 86
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedHeights()Landroid/util/Range;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v3

    :goto_1
    const v6, 0x7fffffff

    .line 87
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 88
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v4, :cond_3

    if-eqz v2, :cond_3

    .line 89
    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    .line 90
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    :cond_3
    if-eqz v3, :cond_4

    if-eqz v5, :cond_4

    .line 91
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v3}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 92
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v5}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 93
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const-string v10, "MediaFormatBuilder"

    if-eq v9, v6, :cond_b

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v6, :cond_5

    goto/16 :goto_4

    .line 94
    :cond_5
    const-string/jumbo v6, "width"

    invoke-virtual {v0, v6}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v9

    .line 95
    const-string v11, "height"

    invoke-virtual {v0, v11}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v12

    if-le v9, v12, :cond_6

    .line 96
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-lt v13, v14, :cond_7

    :cond_6
    if-ge v9, v12, :cond_8

    .line 97
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-le v13, v14, :cond_8

    :cond_7
    move-object/from16 v16, v8

    move-object v8, v7

    move-object/from16 v7, v16

    .line 98
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-lt v13, v9, :cond_a

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ge v13, v12, :cond_9

    goto :goto_3

    :cond_9
    :goto_2
    return-void

    .line 99
    :cond_a
    :goto_3
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    int-to-float v7, v7

    int-to-float v13, v9

    const/high16 v14, 0x3f800000    # 1.0f

    mul-float v15, v13, v14

    div-float/2addr v7, v15

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    int-to-float v8, v8

    int-to-float v15, v12

    mul-float/2addr v14, v15

    div-float/2addr v8, v14

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    mul-float/2addr v13, v7

    float-to-int v8, v13

    .line 100
    invoke-virtual {v0, v6, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    mul-float/2addr v15, v7

    float-to-int v6, v15

    .line 101
    invoke-virtual {v0, v11, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v6, "updateMediaFormatToUpperSize:srcWidth="

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", srcHeight="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", scale: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v6, ", supportedWidthsByProfile= "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", supportedHeightsByProfile="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", supportedWidthsByType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", supportedHeightsByType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 103
    :cond_b
    :goto_4
    const-string v0, "get supported size failed"

    invoke-static {v10, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(ILandroid/media/MediaCodecInfo$EncoderCapabilities;)Z
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->f:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 73
    :cond_0
    invoke-virtual {p2, p1}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->isBitrateModeSupported(I)Z

    move-result p1

    return p1
.end method

.method private static b(Landroid/media/MediaFormat;)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/MediaFormat;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 8
    const-string v0, "MediaFormatBuilder"

    const/4 v1, 0x0

    .line 9
    :try_start_0
    const-string/jumbo v2, "profile"

    invoke-virtual {p0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 10
    const-string v3, "get profile fail."

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v3, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move v2, v1

    .line 11
    :goto_0
    :try_start_1
    const-string v3, "level"

    invoke-virtual {p0, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    .line 12
    const-string v3, "get level fail."

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v3, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    :goto_1
    new-instance p0, Landroid/util/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private b(Landroid/media/MediaFormat;II)V
    .locals 7

    if-nez p1, :cond_0

    goto/16 :goto_0

    .line 14
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(II)Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object p2

    if-nez p2, :cond_1

    goto/16 :goto_0

    .line 15
    :cond_1
    invoke-virtual {p2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedWidths()Landroid/util/Range;

    move-result-object p3

    .line 16
    invoke-virtual {p2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedHeights()Landroid/util/Range;

    move-result-object p2

    if-eqz p3, :cond_6

    if-nez p2, :cond_2

    goto/16 :goto_0

    .line 17
    :cond_2
    invoke-virtual {p3}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    .line 18
    invoke-virtual {p2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    .line 19
    invoke-direct {p0}, Lcom/tencent/liteav/videoproducer/encoder/a;->c()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 20
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedWidths()Landroid/util/Range;

    move-result-object v1

    .line 21
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedHeights()Landroid/util/Range;

    move-result-object v0

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    .line 22
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 23
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 24
    :cond_3
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_4

    goto :goto_0

    .line 25
    :cond_4
    const-string/jumbo v0, "width"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    .line 26
    const-string v2, "height"

    invoke-virtual {p1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    .line 27
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gt v4, v1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v4, v3, :cond_6

    .line 28
    :cond_5
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    int-to-float v1, v1

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float v6, v1, v5

    div-float/2addr v4, v6

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    int-to-float v6, v6

    int-to-float v3, v3

    mul-float/2addr v5, v3

    div-float/2addr v6, v5

    invoke-static {v4, v6}, Ljava/lang/Math;->max(FF)F

    move-result v4

    mul-float/2addr v1, v4

    float-to-int v1, v1

    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    mul-float/2addr v4, v3

    float-to-int v0, v4

    .line 30
    invoke-virtual {p1, v2, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 31
    const-string/jumbo p1, "updateMediaFormatToLowerSize:lowerW=%d,lowerH=%d"

    filled-new-array {p3, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "MediaFormatBuilder"

    invoke-static {p3, p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    :goto_0
    return-void
.end method

.method private c()Landroid/media/MediaCodecInfo$VideoCapabilities;
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->c:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 15
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_1

    return-object v1

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->c:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v0

    .line 17
    iget-object v2, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    .line 18
    :cond_2
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroid/media/MediaFormat;II)V
    .locals 17

    move-object/from16 v0, p1

    if-nez v0, :cond_0

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_0
    move-object/from16 v1, p0

    move/from16 v2, p2

    move/from16 v3, p3

    .line 1
    invoke-direct {v1, v2, v3}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(II)Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    move-result v3

    .line 3
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    move-result v2

    .line 4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "MediaFormatBuilder"

    const-string/jumbo v6, "widthAlignment=%d,heightAlignment=%d"

    invoke-static {v5, v6, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v4, 0x2

    if-lt v3, v4, :cond_4

    if-lt v2, v4, :cond_4

    .line 5
    rem-int/lit8 v4, v3, 0x2

    if-nez v4, :cond_4

    rem-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    const-string/jumbo v4, "width"

    invoke-virtual {v0, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v6

    .line 7
    const-string v7, "height"

    invoke-virtual {v0, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v8

    .line 8
    div-int v9, v6, v3

    mul-int/2addr v9, v3

    .line 9
    div-int v10, v8, v2

    mul-int/2addr v10, v2

    if-ne v6, v9, :cond_3

    if-eq v8, v10, :cond_4

    .line 10
    :cond_3
    invoke-virtual {v0, v4, v9}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 11
    invoke-virtual {v0, v7, v10}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 12
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    filled-new-array/range {v11 .. v16}, [Ljava/lang/Object;

    move-result-object v0

    .line 13
    const-string/jumbo v2, "updateMediaFormatWithAlignment,srcSize=(%d x %d),fixSize=(%d x %d),widthAlignment=%d,heightAlignment=%d"

    invoke-static {v5, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Landroid/media/MediaFormat;
    .locals 16

    move-object/from16 v1, p0

    .line 1
    const-string/jumbo v2, "value"

    const-string v3, "key"

    invoke-virtual {v1}, Lcom/tencent/liteav/videoproducer/encoder/a;->b()Landroid/media/MediaFormat;

    move-result-object v4

    const/4 v0, 0x0

    if-nez v4, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_3

    .line 3
    invoke-static {v7}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v8

    .line 4
    invoke-virtual {v8}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 5
    invoke-virtual {v8}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v9

    .line 6
    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_2

    aget-object v12, v9, v11

    .line 7
    iget-object v13, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 8
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    invoke-virtual {v8, v5}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v5

    goto :goto_2

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    move-object v5, v0

    :goto_2
    const/16 v7, 0x17

    const/16 v8, 0x15

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v5, :cond_15

    .line 9
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v11

    if-lt v11, v8, :cond_15

    .line 10
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getEncoderCapabilities()Landroid/media/MediaCodecInfo$EncoderCapabilities;

    move-result-object v11

    if-eqz v11, :cond_4

    .line 11
    invoke-virtual {v11}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->getComplexityRange()Landroid/util/Range;

    move-result-object v11

    if-eqz v11, :cond_4

    .line 12
    invoke-virtual {v11}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    const-string v12, "complexity"

    invoke-virtual {v4, v12, v11}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 13
    :cond_4
    iget-boolean v11, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->b:Z

    if-eqz v11, :cond_d

    .line 14
    iget-object v11, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v12, v11, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    iget-object v11, v11, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->codecType:Lcom/tencent/liteav/videobase/common/CodecType;

    sget-object v13, Lcom/tencent/liteav/videobase/common/CodecType;->c:Lcom/tencent/liteav/videobase/common/CodecType;

    if-ne v11, v13, :cond_5

    .line 15
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v11

    if-lt v11, v8, :cond_5

    :goto_3
    move v11, v10

    goto :goto_4

    :cond_5
    if-nez v12, :cond_6

    goto :goto_3

    .line 16
    :cond_6
    sget-object v11, Lcom/tencent/liteav/videoproducer/encoder/a$1;->b:[I

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v11, v11, v12

    if-eq v11, v10, :cond_8

    if-eq v11, v9, :cond_7

    goto :goto_3

    :cond_7
    const/16 v11, 0x8

    goto :goto_4

    :cond_8
    move v11, v9

    .line 17
    :goto_4
    iget-object v12, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    const-string/jumbo v13, "video/avc"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x100

    const v13, 0x8000

    goto :goto_5

    :cond_9
    const/high16 v12, -0x80000000

    const v13, 0x7fffffff

    .line 18
    :goto_5
    iget-object v14, v5, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    array-length v15, v14

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_6
    if-ge v0, v15, :cond_c

    aget-object v9, v14, v0

    .line 19
    iget v10, v9, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    if-lt v10, v12, :cond_b

    iget v9, v9, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    if-gt v9, v11, :cond_b

    if-gt v9, v6, :cond_a

    if-ne v9, v6, :cond_b

    if-le v10, v8, :cond_b

    .line 20
    :cond_a
    invoke-static {v10, v13}, Ljava/lang/Math;->min(II)I

    move-result v8

    move v6, v9

    :cond_b
    add-int/lit8 v0, v0, 0x1

    const/4 v9, 0x2

    const/4 v10, 0x1

    goto :goto_6

    .line 21
    :cond_c
    const-string/jumbo v0, "profile"

    invoke-virtual {v4, v0, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 22
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    if-lt v0, v7, :cond_d

    .line 23
    const-string v0, "level"

    invoke-virtual {v4, v0, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 24
    :cond_d
    iget-boolean v0, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->a:Z

    if-eqz v0, :cond_15

    .line 25
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrateMode:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;

    if-nez v0, :cond_f

    :cond_e
    :goto_7
    const/4 v0, 0x2

    goto :goto_8

    .line 26
    :cond_f
    sget-object v6, Lcom/tencent/liteav/videoproducer/encoder/a$1;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v6, v0

    const/4 v6, 0x1

    if-eq v0, v6, :cond_e

    const/4 v6, 0x2

    if-eq v0, v6, :cond_11

    const/4 v6, 0x3

    if-eq v0, v6, :cond_10

    goto :goto_7

    :cond_10
    const/4 v0, 0x0

    goto :goto_8

    :cond_11
    const/4 v0, 0x1

    .line 27
    :goto_8
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getEncoderCapabilities()Landroid/media/MediaCodecInfo$EncoderCapabilities;

    move-result-object v6

    if-eqz v6, :cond_15

    .line 28
    invoke-direct {v1, v0, v6}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(ILandroid/media/MediaCodecInfo$EncoderCapabilities;)Z

    move-result v8

    const-string v9, "bitrate-mode"

    if-eqz v8, :cond_12

    .line 29
    invoke-virtual {v4, v9, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_9

    .line 30
    :cond_12
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-boolean v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fullIFrame:Z

    if-eqz v0, :cond_14

    const/4 v0, 0x1

    .line 31
    invoke-direct {v1, v0, v6}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(ILandroid/media/MediaCodecInfo$EncoderCapabilities;)Z

    move-result v8

    if-eqz v8, :cond_13

    .line 32
    invoke-virtual {v4, v9, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_9

    :cond_13
    const/4 v0, 0x2

    .line 33
    invoke-direct {v1, v0, v6}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(ILandroid/media/MediaCodecInfo$EncoderCapabilities;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 34
    invoke-virtual {v4, v9, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_9

    :cond_14
    const/4 v0, 0x2

    .line 35
    invoke-direct {v1, v0, v6}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(ILandroid/media/MediaCodecInfo$EncoderCapabilities;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 36
    invoke-virtual {v4, v9, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 37
    :cond_15
    :goto_9
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    if-ge v0, v7, :cond_16

    const/4 v0, 0x0

    goto :goto_a

    .line 38
    :cond_16
    invoke-static {v4}, Lcom/tencent/liteav/videoproducer/encoder/a;->b(Landroid/media/MediaFormat;)Landroid/util/Pair;

    move-result-object v0

    .line 39
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 40
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 41
    iget-object v7, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    invoke-static {v7, v6, v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->createFromProfileLevel(Ljava/lang/String;II)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v0

    :goto_a
    if-eqz v0, :cond_17

    move-object v5, v0

    .line 42
    :cond_17
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v6, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->colorRange:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    iget-object v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->colorSpace:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    .line 43
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v7

    const/16 v8, 0x18

    if-lt v7, v8, :cond_1b

    .line 44
    sget-object v7, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->c:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    const-string v8, "color-range"

    if-ne v6, v7, :cond_18

    const/4 v7, 0x1

    .line 45
    invoke-virtual {v4, v8, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_b

    :cond_18
    const/4 v7, 0x1

    .line 46
    sget-object v9, Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;->b:Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    if-ne v6, v9, :cond_19

    const/4 v6, 0x2

    .line 47
    invoke-virtual {v4, v8, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 48
    :cond_19
    :goto_b
    sget-object v6, Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;->c:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    const-string v8, "color-standard"

    if-ne v0, v6, :cond_1a

    .line 49
    invoke-virtual {v4, v8, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_c

    .line 50
    :cond_1a
    sget-object v6, Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;->b:Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    if-ne v0, v6, :cond_1b

    const/4 v0, 0x4

    .line 51
    invoke-virtual {v4, v8, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 52
    :cond_1b
    :goto_c
    const-string v6, "MediaFormatBuilder"

    if-eqz v5, :cond_1c

    .line 53
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    const/16 v7, 0x15

    if-lt v0, v7, :cond_1c

    .line 54
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v0

    if-eqz v0, :cond_1c

    .line 55
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    move-result-object v0

    .line 56
    const-string v5, "bitrate"

    invoke-virtual {v4, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v7

    .line 57
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 58
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v10

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v10, v0, v11, v8}, [Ljava/lang/Object;

    move-result-object v0

    .line 59
    const-string v8, "bitrateRange=(%d, %d),bitrate=%d,clampBitrate=%d"

    invoke-static {v6, v8, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eq v7, v9, :cond_1c

    .line 60
    invoke-virtual {v4, v5, v9}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 61
    :cond_1c
    invoke-virtual {v1, v4}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(Landroid/media/MediaFormat;)V

    .line 62
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    if-eqz v0, :cond_1d

    const/4 v5, 0x0

    .line 63
    :goto_d
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1d

    .line 64
    :try_start_0
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    .line 65
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 66
    const-string/jumbo v7, "setDeviceRelatedParams,index=%d,key=%s,value=%d"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 67
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v8, v9, v10}, [Ljava/lang/Object;

    move-result-object v8

    .line 68
    invoke-static {v6, v7, v8}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v7, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_e

    :catchall_0
    move-exception v0

    .line 70
    const-string/jumbo v7, "set mediaCodec device related params failed,index="

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_1d
    return-object v4
.end method

.method public final a(Landroid/media/MediaFormat;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    :goto_0
    return-void

    .line 75
    :cond_1
    invoke-static {p1}, Lcom/tencent/liteav/videoproducer/encoder/a;->b(Landroid/media/MediaFormat;)Landroid/util/Pair;

    move-result-object v0

    .line 76
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 77
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 78
    invoke-direct {p0, p1, v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/a;->a(Landroid/media/MediaFormat;II)V

    .line 79
    invoke-direct {p0, p1, v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/a;->b(Landroid/media/MediaFormat;II)V

    .line 80
    invoke-direct {p0, p1, v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/a;->c(Landroid/media/MediaFormat;II)V

    return-void
.end method

.method public final b()Landroid/media/MediaFormat;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget v1, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->width:I

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget v3, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->height:I

    if-eqz v3, :cond_3

    iget v4, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrate:I

    if-eqz v4, :cond_3

    iget v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fps:I

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->d:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget v1, v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrate:I

    mul-int/lit16 v1, v1, 0x400

    const-string v2, "bitrate"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget v1, v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fps:I

    const-string v2, "frame-rate"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 5
    const-string v1, "color-format"

    const v2, 0x7f000789

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/a;->e:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-boolean v2, v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fullIFrame:Z

    if-eqz v2, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    iget v1, v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->gop:I

    .line 7
    :goto_0
    const-string v2, "i-frame-interval"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-object v0

    :cond_3
    :goto_1
    return-object v2
.end method
