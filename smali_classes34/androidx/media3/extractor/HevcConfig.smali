.class public final Landroidx/media3/extractor/HevcConfig;
.super Ljava/lang/Object;
.source "HevcConfig.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# instance fields
.field public final bitdepthChroma:I

.field public final bitdepthLuma:I

.field public final codecs:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final colorRange:I

.field public final colorSpace:I

.field public final colorTransfer:I

.field public final height:I

.field public final initializationData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public final maxNumReorderPics:I

.field public final nalUnitLengthFieldLength:I

.field public final pixelWidthHeightRatio:F

.field public final stereoMode:I

.field public final vpsData:Landroidx/media3/container/NalUnitUtil$H265VpsData;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final width:I


# direct methods
.method private constructor <init>(Ljava/util/List;IIIIIIIIIFILjava/lang/String;Landroidx/media3/container/NalUnitUtil$H265VpsData;)V
    .locals 0
    .param p13    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Landroidx/media3/container/NalUnitUtil$H265VpsData;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;IIIIIIIIIFI",
            "Ljava/lang/String;",
            "Landroidx/media3/container/NalUnitUtil$H265VpsData;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/extractor/HevcConfig;->initializationData:Ljava/util/List;

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/extractor/HevcConfig;->nalUnitLengthFieldLength:I

    .line 8
    .line 9
    iput p3, p0, Landroidx/media3/extractor/HevcConfig;->width:I

    .line 10
    .line 11
    iput p4, p0, Landroidx/media3/extractor/HevcConfig;->height:I

    .line 12
    .line 13
    iput p5, p0, Landroidx/media3/extractor/HevcConfig;->bitdepthLuma:I

    .line 14
    .line 15
    iput p6, p0, Landroidx/media3/extractor/HevcConfig;->bitdepthChroma:I

    .line 16
    .line 17
    iput p7, p0, Landroidx/media3/extractor/HevcConfig;->colorSpace:I

    .line 18
    .line 19
    iput p8, p0, Landroidx/media3/extractor/HevcConfig;->colorRange:I

    .line 20
    .line 21
    iput p9, p0, Landroidx/media3/extractor/HevcConfig;->colorTransfer:I

    .line 22
    .line 23
    iput p10, p0, Landroidx/media3/extractor/HevcConfig;->stereoMode:I

    .line 24
    .line 25
    iput p11, p0, Landroidx/media3/extractor/HevcConfig;->pixelWidthHeightRatio:F

    .line 26
    .line 27
    iput p12, p0, Landroidx/media3/extractor/HevcConfig;->maxNumReorderPics:I

    .line 28
    .line 29
    iput-object p13, p0, Landroidx/media3/extractor/HevcConfig;->codecs:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p14, p0, Landroidx/media3/extractor/HevcConfig;->vpsData:Landroidx/media3/container/NalUnitUtil$H265VpsData;

    .line 32
    return-void
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
.end method

.method public static parse(Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/extractor/HevcConfig;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Landroidx/media3/extractor/HevcConfig;->parseImpl(Landroidx/media3/common/util/ParsableByteArray;ZLandroidx/media3/container/NalUnitUtil$H265VpsData;)Landroidx/media3/extractor/HevcConfig;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method private static parseImpl(Landroidx/media3/common/util/ParsableByteArray;ZLandroidx/media3/container/NalUnitUtil$H265VpsData;)Landroidx/media3/extractor/HevcConfig;
    .locals 35
    .param p2    # Landroidx/media3/container/NalUnitUtil$H265VpsData;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    .line 12
    goto/16 :goto_9

    .line 13
    .line 14
    :cond_0
    const/16 v2, 0x15

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 21
    move-result v2

    .line 22
    .line 23
    and-int/lit8 v2, v2, 0x3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 27
    move-result v3

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    move v7, v6

    .line 35
    :goto_1
    const/4 v8, 0x1

    .line 36
    .line 37
    if-ge v6, v3, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v8}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 44
    move-result v8

    .line 45
    move v9, v5

    .line 46
    .line 47
    :goto_2
    if-ge v9, v8, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 51
    move-result v10

    .line 52
    .line 53
    add-int/lit8 v11, v10, 0x4

    .line 54
    add-int/2addr v7, v11

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v10}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 58
    .line 59
    add-int/lit8 v9, v9, 0x1

    .line 60
    goto :goto_2

    .line 61
    .line 62
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 63
    goto :goto_1

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {v0, v4}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 67
    .line 68
    new-array v4, v7, [B

    .line 69
    const/4 v6, -0x1

    .line 70
    .line 71
    const/high16 v9, 0x3f800000    # 1.0f

    .line 72
    const/4 v10, 0x0

    .line 73
    .line 74
    move-object/from16 v25, p2

    .line 75
    move v14, v6

    .line 76
    move v15, v14

    .line 77
    .line 78
    move/from16 v16, v15

    .line 79
    .line 80
    move/from16 v17, v16

    .line 81
    .line 82
    move/from16 v18, v17

    .line 83
    .line 84
    move/from16 v19, v18

    .line 85
    .line 86
    move/from16 v20, v19

    .line 87
    .line 88
    move/from16 v21, v20

    .line 89
    .line 90
    move/from16 v23, v21

    .line 91
    .line 92
    move/from16 v22, v9

    .line 93
    .line 94
    move-object/from16 v24, v10

    .line 95
    move v6, v5

    .line 96
    move v9, v6

    .line 97
    .line 98
    :goto_3
    if-ge v6, v3, :cond_9

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 102
    move-result v10

    .line 103
    .line 104
    and-int/lit8 v10, v10, 0x3f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 108
    move-result v11

    .line 109
    move v13, v5

    .line 110
    .line 111
    move-object/from16 v12, v25

    .line 112
    .line 113
    :goto_4
    if-ge v13, v11, :cond_8

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 117
    move-result v1

    .line 118
    .line 119
    move/from16 v26, v8

    .line 120
    .line 121
    sget-object v8, Landroidx/media3/container/NalUnitUtil;->NAL_START_CODE:[B

    .line 122
    .line 123
    move/from16 v27, v2

    .line 124
    array-length v2, v8

    .line 125
    .line 126
    .line 127
    invoke-static {v8, v5, v4, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 128
    array-length v2, v8

    .line 129
    add-int/2addr v9, v2

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 133
    move-result-object v2

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 137
    move-result v8

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v8, v4, v9, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    .line 142
    const/16 v2, 0x20

    .line 143
    .line 144
    if-ne v10, v2, :cond_3

    .line 145
    .line 146
    if-nez v13, :cond_3

    .line 147
    .line 148
    add-int v2, v9, v1

    .line 149
    .line 150
    .line 151
    invoke-static {v4, v9, v2}, Landroidx/media3/container/NalUnitUtil;->parseH265VpsNalUnit([BII)Landroidx/media3/container/NalUnitUtil$H265VpsData;

    .line 152
    move-result-object v12

    .line 153
    .line 154
    move/from16 v28, v3

    .line 155
    .line 156
    goto/16 :goto_6

    .line 157
    .line 158
    :cond_3
    const/16 v2, 0x21

    .line 159
    .line 160
    if-ne v10, v2, :cond_5

    .line 161
    .line 162
    if-nez v13, :cond_5

    .line 163
    .line 164
    add-int v2, v9, v1

    .line 165
    .line 166
    .line 167
    invoke-static {v4, v9, v2, v12}, Landroidx/media3/container/NalUnitUtil;->parseH265SpsNalUnit([BIILandroidx/media3/container/NalUnitUtil$H265VpsData;)Landroidx/media3/container/NalUnitUtil$H265SpsData;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    iget v14, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->width:I

    .line 171
    .line 172
    iget v15, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->height:I

    .line 173
    .line 174
    iget v8, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->bitDepthLumaMinus8:I

    .line 175
    .line 176
    add-int/lit8 v16, v8, 0x8

    .line 177
    .line 178
    iget v8, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->bitDepthChromaMinus8:I

    .line 179
    .line 180
    add-int/lit8 v17, v8, 0x8

    .line 181
    .line 182
    iget v8, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->colorSpace:I

    .line 183
    .line 184
    iget v5, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->colorRange:I

    .line 185
    .line 186
    move/from16 v28, v3

    .line 187
    .line 188
    iget v3, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->colorTransfer:I

    .line 189
    .line 190
    move/from16 v18, v3

    .line 191
    .line 192
    iget v3, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->pixelWidthHeightRatio:F

    .line 193
    .line 194
    move/from16 v19, v3

    .line 195
    .line 196
    iget v3, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->maxNumReorderPics:I

    .line 197
    .line 198
    iget-object v2, v2, Landroidx/media3/container/NalUnitUtil$H265SpsData;->profileTierLevel:Landroidx/media3/container/NalUnitUtil$H265ProfileTierLevel;

    .line 199
    .line 200
    if-eqz v2, :cond_4

    .line 201
    .line 202
    move/from16 v20, v3

    .line 203
    .line 204
    iget v3, v2, Landroidx/media3/container/NalUnitUtil$H265ProfileTierLevel;->generalProfileSpace:I

    .line 205
    .line 206
    move/from16 v29, v3

    .line 207
    .line 208
    iget-boolean v3, v2, Landroidx/media3/container/NalUnitUtil$H265ProfileTierLevel;->generalTierFlag:Z

    .line 209
    .line 210
    move/from16 v30, v3

    .line 211
    .line 212
    iget v3, v2, Landroidx/media3/container/NalUnitUtil$H265ProfileTierLevel;->generalProfileIdc:I

    .line 213
    .line 214
    move/from16 v31, v3

    .line 215
    .line 216
    iget v3, v2, Landroidx/media3/container/NalUnitUtil$H265ProfileTierLevel;->generalProfileCompatibilityFlags:I

    .line 217
    .line 218
    move/from16 v32, v3

    .line 219
    .line 220
    iget-object v3, v2, Landroidx/media3/container/NalUnitUtil$H265ProfileTierLevel;->constraintBytes:[I

    .line 221
    .line 222
    iget v2, v2, Landroidx/media3/container/NalUnitUtil$H265ProfileTierLevel;->generalLevelIdc:I

    .line 223
    .line 224
    move/from16 v34, v2

    .line 225
    .line 226
    move-object/from16 v33, v3

    .line 227
    .line 228
    .line 229
    invoke-static/range {v29 .. v34}, Landroidx/media3/common/util/CodecSpecificDataUtil;->buildHevcCodecString(IZII[II)Ljava/lang/String;

    .line 230
    move-result-object v24

    .line 231
    goto :goto_5

    .line 232
    .line 233
    :cond_4
    move/from16 v20, v3

    .line 234
    .line 235
    :goto_5
    move/from16 v22, v19

    .line 236
    .line 237
    move/from16 v23, v20

    .line 238
    .line 239
    move/from16 v19, v5

    .line 240
    .line 241
    move/from16 v20, v18

    .line 242
    const/4 v5, 0x0

    .line 243
    .line 244
    move/from16 v18, v8

    .line 245
    goto :goto_6

    .line 246
    .line 247
    :cond_5
    move/from16 v28, v3

    .line 248
    .line 249
    const/16 v2, 0x27

    .line 250
    .line 251
    if-ne v10, v2, :cond_7

    .line 252
    .line 253
    if-nez v13, :cond_7

    .line 254
    .line 255
    add-int v2, v9, v1

    .line 256
    .line 257
    .line 258
    invoke-static {v4, v9, v2}, Landroidx/media3/container/NalUnitUtil;->parseH265Sei3dRefDisplayInfo([BII)Landroidx/media3/container/NalUnitUtil$H265Sei3dRefDisplayInfoData;

    .line 259
    move-result-object v2

    .line 260
    .line 261
    if-eqz v2, :cond_7

    .line 262
    .line 263
    if-eqz v12, :cond_7

    .line 264
    .line 265
    iget v2, v2, Landroidx/media3/container/NalUnitUtil$H265Sei3dRefDisplayInfoData;->leftViewId:I

    .line 266
    .line 267
    iget-object v3, v12, Landroidx/media3/container/NalUnitUtil$H265VpsData;->layerInfos:Lcom/google/common/collect/ImmutableList;

    .line 268
    const/4 v5, 0x0

    .line 269
    .line 270
    .line 271
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    move-result-object v3

    .line 273
    .line 274
    check-cast v3, Landroidx/media3/container/NalUnitUtil$H265LayerInfo;

    .line 275
    .line 276
    iget v3, v3, Landroidx/media3/container/NalUnitUtil$H265LayerInfo;->viewId:I

    .line 277
    .line 278
    if-ne v2, v3, :cond_6

    .line 279
    .line 280
    const/16 v21, 0x4

    .line 281
    goto :goto_6

    .line 282
    :cond_6
    const/4 v2, 0x5

    .line 283
    .line 284
    move/from16 v21, v2

    .line 285
    goto :goto_6

    .line 286
    :cond_7
    const/4 v5, 0x0

    .line 287
    :goto_6
    add-int/2addr v9, v1

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 291
    .line 292
    add-int/lit8 v13, v13, 0x1

    .line 293
    .line 294
    move/from16 v8, v26

    .line 295
    .line 296
    move/from16 v2, v27

    .line 297
    .line 298
    move/from16 v3, v28

    .line 299
    const/4 v1, 0x4

    .line 300
    .line 301
    goto/16 :goto_4

    .line 302
    .line 303
    :cond_8
    move/from16 v27, v2

    .line 304
    .line 305
    move/from16 v28, v3

    .line 306
    .line 307
    move/from16 v26, v8

    .line 308
    .line 309
    add-int/lit8 v6, v6, 0x1

    .line 310
    .line 311
    move-object/from16 v25, v12

    .line 312
    const/4 v1, 0x4

    .line 313
    .line 314
    goto/16 :goto_3

    .line 315
    .line 316
    :cond_9
    move/from16 v27, v2

    .line 317
    .line 318
    move/from16 v26, v8

    .line 319
    .line 320
    if-nez v7, :cond_a

    .line 321
    .line 322
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 323
    :goto_7
    move-object v12, v0

    .line 324
    goto :goto_8

    .line 325
    .line 326
    .line 327
    :cond_a
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 328
    move-result-object v0

    .line 329
    goto :goto_7

    .line 330
    .line 331
    :goto_8
    new-instance v11, Landroidx/media3/extractor/HevcConfig;

    .line 332
    .line 333
    add-int/lit8 v13, v27, 0x1

    .line 334
    .line 335
    .line 336
    invoke-direct/range {v11 .. v25}, Landroidx/media3/extractor/HevcConfig;-><init>(Ljava/util/List;IIIIIIIIIFILjava/lang/String;Landroidx/media3/container/NalUnitUtil$H265VpsData;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 337
    return-object v11

    .line 338
    .line 339
    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 343
    .line 344
    const-string v2, "Error parsing"

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    if-eqz p1, :cond_b

    .line 350
    .line 351
    const-string v2, "L-HEVC config"

    .line 352
    goto :goto_a

    .line 353
    .line 354
    :cond_b
    const-string v2, "HEVC config"

    .line 355
    .line 356
    .line 357
    :goto_a
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    move-result-object v1

    .line 362
    .line 363
    .line 364
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->createForMalformedContainer(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 365
    move-result-object v0

    .line 366
    throw v0
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
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
.end method

.method public static parseLayered(Landroidx/media3/common/util/ParsableByteArray;Landroidx/media3/container/NalUnitUtil$H265VpsData;)Landroidx/media3/extractor/HevcConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0, p1}, Landroidx/media3/extractor/HevcConfig;->parseImpl(Landroidx/media3/common/util/ParsableByteArray;ZLandroidx/media3/container/NalUnitUtil$H265VpsData;)Landroidx/media3/extractor/HevcConfig;

    .line 5
    move-result-object p0

    .line 6
    return-object p0
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
.end method
