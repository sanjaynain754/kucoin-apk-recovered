.class public final Landroidx/media3/extractor/Ac4Util;
.super Ljava/lang/Object;
.source "Ac4Util.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/extractor/Ac4Util$Ac4Presentation;,
        Landroidx/media3/extractor/Ac4Util$SyncFrameInfo;
    }
.end annotation


# static fields
.field public static final AC40_SYNCWORD:I = 0xac40

.field public static final AC41_SYNCWORD:I = 0xac41

.field private static final CHANNEL_COUNT_2:I = 0x2

.field private static final CHANNEL_MODE_22_2:I = 0xf

.field private static final CHANNEL_MODE_3_0:I = 0x2

.field private static final CHANNEL_MODE_5_0:I = 0x3

.field private static final CHANNEL_MODE_5_1:I = 0x4

.field private static final CHANNEL_MODE_7_0_322:I = 0x9

.field private static final CHANNEL_MODE_7_0_34:I = 0x5

.field private static final CHANNEL_MODE_7_0_4:I = 0xb

.field private static final CHANNEL_MODE_7_0_52:I = 0x7

.field private static final CHANNEL_MODE_7_1_322:I = 0xa

.field private static final CHANNEL_MODE_7_1_34:I = 0x6

.field private static final CHANNEL_MODE_7_1_4:I = 0xc

.field private static final CHANNEL_MODE_7_1_52:I = 0x8

.field private static final CHANNEL_MODE_9_0_4:I = 0xd

.field private static final CHANNEL_MODE_9_1_4:I = 0xe

.field private static final CHANNEL_MODE_MONO:I = 0x0

.field private static final CHANNEL_MODE_STEREO:I = 0x1

.field private static final CHANNEL_MODE_UNKNOWN:I = -0x1

.field public static final HEADER_SIZE_FOR_PARSER:I = 0x10

.field public static final MAX_RATE_BYTES_PER_SECOND:I = 0x52080

.field private static final SAMPLE_COUNT:[I

.field public static final SAMPLE_HEADER_SIZE:I = 0x7


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xe

    .line 3
    .line 4
    new-array v0, v0, [I

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Landroidx/media3/extractor/Ac4Util;->SAMPLE_COUNT:[I

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    :array_0
    .array-data 4
        0x7d2
        0x7d0
        0x780
        0x641
        0x640
        0x3e9
        0x3e8
        0x3c0
        0x320
        0x320
        0x1e0
        0x190
        0x190
        0x800
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static getAc4SampleHeader(ILandroidx/media3/common/util/ParsableByteArray;)V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    const/16 v1, -0x54

    .line 12
    .line 13
    aput-byte v1, p1, v0

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    const/16 v1, 0x40

    .line 17
    .line 18
    aput-byte v1, p1, v0

    .line 19
    const/4 v0, 0x2

    .line 20
    const/4 v1, -0x1

    .line 21
    .line 22
    aput-byte v1, p1, v0

    .line 23
    const/4 v0, 0x3

    .line 24
    .line 25
    aput-byte v1, p1, v0

    .line 26
    .line 27
    shr-int/lit8 v0, p0, 0x10

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    int-to-byte v0, v0

    .line 31
    const/4 v1, 0x4

    .line 32
    .line 33
    aput-byte v0, p1, v1

    .line 34
    .line 35
    shr-int/lit8 v0, p0, 0x8

    .line 36
    .line 37
    and-int/lit16 v0, v0, 0xff

    .line 38
    int-to-byte v0, v0

    .line 39
    const/4 v1, 0x5

    .line 40
    .line 41
    aput-byte v0, p1, v1

    .line 42
    .line 43
    and-int/lit16 p0, p0, 0xff

    .line 44
    int-to-byte p0, p0

    .line 45
    const/4 v0, 0x6

    .line 46
    .line 47
    aput-byte p0, p1, v0

    .line 48
    return-void
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
.end method

.method private static getAdjustedChannelCount(IZI)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/media3/extractor/Ac4Util;->getChannelCountFromChannelMode(I)I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    if-eq p0, v1, :cond_1

    .line 9
    .line 10
    const/16 v1, 0xc

    .line 11
    .line 12
    if-eq p0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0xd

    .line 15
    .line 16
    if-eq p0, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, 0xe

    .line 19
    .line 20
    if-ne p0, v1, :cond_0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v0

    .line 23
    .line 24
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 25
    .line 26
    add-int/lit8 v0, v0, -0x2

    .line 27
    .line 28
    :cond_2
    if-eqz p2, :cond_4

    .line 29
    const/4 p0, 0x1

    .line 30
    .line 31
    if-eq p2, p0, :cond_3

    .line 32
    return v0

    .line 33
    .line 34
    :cond_3
    add-int/lit8 v0, v0, -0x2

    .line 35
    return v0

    .line 36
    .line 37
    :cond_4
    add-int/lit8 v0, v0, -0x4

    .line 38
    return v0
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
.end method

.method private static getChannelCountFromChannelMode(I)I
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    .line 7
    :pswitch_0
    const/16 p0, 0x18

    .line 8
    return p0

    .line 9
    .line 10
    :pswitch_1
    const/16 p0, 0xe

    .line 11
    return p0

    .line 12
    .line 13
    :pswitch_2
    const/16 p0, 0xd

    .line 14
    return p0

    .line 15
    .line 16
    :pswitch_3
    const/16 p0, 0xc

    .line 17
    return p0

    .line 18
    .line 19
    :pswitch_4
    const/16 p0, 0xb

    .line 20
    return p0

    .line 21
    .line 22
    :pswitch_5
    const/16 p0, 0x8

    .line 23
    return p0

    .line 24
    :pswitch_6
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :pswitch_7
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :pswitch_8
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :pswitch_9
    const/4 p0, 0x3

    .line 31
    return p0

    .line 32
    :pswitch_a
    const/4 p0, 0x2

    .line 33
    return p0

    .line 34
    :pswitch_b
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    nop

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseAc4AnnexEFormat(Landroidx/media3/common/util/ParsableByteArray;Ljava/lang/String;Ljava/lang/String;Landroidx/media3/common/DrmInitData;)Landroidx/media3/common/Format;
    .locals 19
    .param p3    # Landroidx/media3/common/DrmInitData;
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
    new-instance v0, Landroidx/media3/common/util/ParsableBitArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/media3/common/util/ParsableBitArray;-><init>()V

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableBitArray;->reset(Landroidx/media3/common/util/ParsableByteArray;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->bitsLeft()I

    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    .line 22
    if-gt v3, v4, :cond_2a

    .line 23
    const/4 v5, 0x7

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v5}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 27
    move-result v6

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 31
    move-result v7

    .line 32
    .line 33
    if-eqz v7, :cond_0

    .line 34
    .line 35
    .line 36
    const v7, 0xbb80

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_0
    const v7, 0xac44

    .line 41
    :goto_0
    const/4 v8, 0x4

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v8}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 45
    .line 46
    const/16 v9, 0x9

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v9}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 50
    move-result v9

    .line 51
    .line 52
    const/16 v10, 0x10

    .line 53
    .line 54
    if-le v6, v4, :cond_2

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 60
    move-result v6

    .line 61
    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v10}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 69
    move-result v6

    .line 70
    .line 71
    if-eqz v6, :cond_2

    .line 72
    .line 73
    const/16 v6, 0x80

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v6}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 77
    goto :goto_1

    .line 78
    .line 79
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    const-string v1, "Invalid AC-4 DSI version: "

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 98
    move-result-object v0

    .line 99
    throw v0

    .line 100
    .line 101
    :cond_2
    :goto_1
    if-ne v3, v4, :cond_4

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Landroidx/media3/extractor/Ac4Util;->skipDsiBitrate(Landroidx/media3/common/util/ParsableBitArray;)Z

    .line 105
    move-result v6

    .line 106
    .line 107
    if-eqz v6, :cond_3

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->byteAlign()V

    .line 111
    goto :goto_2

    .line 112
    .line 113
    :cond_3
    const-string v0, "Invalid AC-4 DSI bitrate."

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 117
    move-result-object v0

    .line 118
    throw v0

    .line 119
    .line 120
    :cond_4
    :goto_2
    new-instance v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;

    .line 121
    const/4 v11, 0x0

    .line 122
    .line 123
    .line 124
    invoke-direct {v6, v11}, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;-><init>(Landroidx/media3/extractor/Ac4Util$1;)V

    .line 125
    const/4 v12, 0x0

    .line 126
    .line 127
    :goto_3
    if-ge v12, v9, :cond_26

    .line 128
    const/4 v13, 0x5

    .line 129
    .line 130
    const/16 v14, 0x8

    .line 131
    const/4 v15, 0x2

    .line 132
    .line 133
    if-nez v3, :cond_5

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 137
    move-result v9

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v13}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 141
    move-result v16

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v13}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 145
    move-result v17

    .line 146
    .line 147
    move/from16 v11, v16

    .line 148
    .line 149
    move/from16 v14, v17

    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v8, 0x0

    .line 152
    const/4 v10, 0x0

    .line 153
    goto :goto_5

    .line 154
    .line 155
    .line 156
    :cond_5
    invoke-virtual {v0, v14}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 157
    move-result v11

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v14}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 161
    move-result v5

    .line 162
    .line 163
    const/16 v8, 0xff

    .line 164
    .line 165
    if-ne v5, v8, :cond_6

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v10}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 169
    move-result v8

    .line 170
    add-int/2addr v5, v8

    .line 171
    .line 172
    :cond_6
    if-le v11, v15, :cond_7

    .line 173
    .line 174
    mul-int/lit8 v5, v5, 0x8

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v5}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 178
    .line 179
    add-int/lit8 v12, v12, 0x1

    .line 180
    const/4 v5, 0x7

    .line 181
    const/4 v8, 0x4

    .line 182
    goto :goto_3

    .line 183
    .line 184
    .line 185
    :cond_7
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->bitsLeft()I

    .line 186
    move-result v8

    .line 187
    .line 188
    sub-int v8, v1, v8

    .line 189
    div-int/2addr v8, v14

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v13}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 193
    move-result v9

    .line 194
    .line 195
    const/16 v10, 0x1f

    .line 196
    .line 197
    if-ne v9, v10, :cond_8

    .line 198
    move v10, v4

    .line 199
    goto :goto_4

    .line 200
    :cond_8
    const/4 v10, 0x0

    .line 201
    :goto_4
    move v14, v11

    .line 202
    move v11, v9

    .line 203
    const/4 v9, 0x0

    .line 204
    .line 205
    :goto_5
    if-nez v9, :cond_9

    .line 206
    .line 207
    if-nez v10, :cond_9

    .line 208
    const/4 v4, 0x6

    .line 209
    .line 210
    if-ne v11, v4, :cond_9

    .line 211
    const/4 v2, 0x1

    .line 212
    .line 213
    goto/16 :goto_f

    .line 214
    .line 215
    .line 216
    :cond_9
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 217
    move-result v4

    .line 218
    .line 219
    iput v4, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->level:I

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 223
    move-result v4

    .line 224
    .line 225
    if-eqz v4, :cond_a

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v13}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 229
    .line 230
    .line 231
    :cond_a
    invoke-virtual {v0, v15}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 232
    const/4 v4, 0x1

    .line 233
    .line 234
    if-ne v3, v4, :cond_c

    .line 235
    .line 236
    if-eq v14, v4, :cond_b

    .line 237
    .line 238
    if-ne v14, v15, :cond_c

    .line 239
    .line 240
    .line 241
    :cond_b
    invoke-virtual {v0, v15}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 242
    .line 243
    .line 244
    :cond_c
    invoke-virtual {v0, v13}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 245
    .line 246
    const/16 v2, 0xa

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 250
    .line 251
    if-ne v3, v4, :cond_14

    .line 252
    .line 253
    if-lez v14, :cond_d

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 257
    move-result v2

    .line 258
    .line 259
    iput-boolean v2, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->isChannelCoded:Z

    .line 260
    .line 261
    :cond_d
    iget-boolean v2, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->isChannelCoded:Z

    .line 262
    .line 263
    if-eqz v2, :cond_11

    .line 264
    .line 265
    if-eq v14, v4, :cond_e

    .line 266
    .line 267
    if-ne v14, v15, :cond_10

    .line 268
    .line 269
    .line 270
    :cond_e
    invoke-virtual {v0, v13}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 271
    move-result v2

    .line 272
    .line 273
    if-ltz v2, :cond_f

    .line 274
    .line 275
    const/16 v4, 0xf

    .line 276
    .line 277
    if-gt v2, v4, :cond_f

    .line 278
    .line 279
    iput v2, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->channelMode:I

    .line 280
    .line 281
    :cond_f
    const/16 v4, 0xb

    .line 282
    .line 283
    if-lt v2, v4, :cond_10

    .line 284
    .line 285
    const/16 v4, 0xe

    .line 286
    .line 287
    if-gt v2, v4, :cond_10

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 291
    move-result v2

    .line 292
    .line 293
    iput-boolean v2, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->hasBackChannels:Z

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v15}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 297
    move-result v2

    .line 298
    .line 299
    iput v2, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->topChannelPairs:I

    .line 300
    .line 301
    :cond_10
    const/16 v2, 0x18

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 305
    const/4 v4, 0x1

    .line 306
    .line 307
    :cond_11
    if-eq v14, v4, :cond_12

    .line 308
    .line 309
    if-ne v14, v15, :cond_14

    .line 310
    .line 311
    .line 312
    :cond_12
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 313
    move-result v2

    .line 314
    .line 315
    if-eqz v2, :cond_13

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 319
    move-result v2

    .line 320
    .line 321
    if-eqz v2, :cond_13

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v15}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 325
    .line 326
    .line 327
    :cond_13
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 328
    move-result v2

    .line 329
    .line 330
    if-eqz v2, :cond_14

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBit()V

    .line 334
    .line 335
    const/16 v2, 0x8

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 339
    move-result v4

    .line 340
    const/4 v13, 0x0

    .line 341
    .line 342
    :goto_6
    if-ge v13, v4, :cond_14

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 346
    .line 347
    add-int/lit8 v13, v13, 0x1

    .line 348
    .line 349
    const/16 v2, 0x8

    .line 350
    goto :goto_6

    .line 351
    .line 352
    :cond_14
    if-nez v9, :cond_1c

    .line 353
    .line 354
    if-eqz v10, :cond_15

    .line 355
    .line 356
    goto/16 :goto_d

    .line 357
    .line 358
    .line 359
    :cond_15
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBit()V

    .line 360
    .line 361
    if-eqz v11, :cond_1a

    .line 362
    const/4 v4, 0x1

    .line 363
    .line 364
    if-eq v11, v4, :cond_1a

    .line 365
    .line 366
    if-eq v11, v15, :cond_1a

    .line 367
    const/4 v2, 0x3

    .line 368
    .line 369
    if-eq v11, v2, :cond_18

    .line 370
    const/4 v2, 0x4

    .line 371
    .line 372
    if-eq v11, v2, :cond_18

    .line 373
    const/4 v2, 0x5

    .line 374
    .line 375
    if-eq v11, v2, :cond_16

    .line 376
    const/4 v2, 0x7

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 380
    move-result v4

    .line 381
    const/4 v2, 0x0

    .line 382
    .line 383
    :goto_7
    if-ge v2, v4, :cond_1e

    .line 384
    .line 385
    const/16 v9, 0x8

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v9}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 389
    .line 390
    add-int/lit8 v2, v2, 0x1

    .line 391
    goto :goto_7

    .line 392
    .line 393
    :cond_16
    if-nez v14, :cond_17

    .line 394
    .line 395
    .line 396
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstream(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 397
    goto :goto_e

    .line 398
    :cond_17
    const/4 v2, 0x3

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 402
    move-result v4

    .line 403
    const/4 v2, 0x0

    .line 404
    .line 405
    :goto_8
    add-int/lit8 v9, v4, 0x2

    .line 406
    .line 407
    if-ge v2, v9, :cond_1e

    .line 408
    .line 409
    .line 410
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstreamGroup(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 411
    .line 412
    add-int/lit8 v2, v2, 0x1

    .line 413
    goto :goto_8

    .line 414
    .line 415
    :cond_18
    if-nez v14, :cond_19

    .line 416
    const/4 v2, 0x3

    .line 417
    const/4 v4, 0x0

    .line 418
    .line 419
    :goto_9
    if-ge v4, v2, :cond_1e

    .line 420
    .line 421
    .line 422
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstream(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 423
    .line 424
    add-int/lit8 v4, v4, 0x1

    .line 425
    goto :goto_9

    .line 426
    :cond_19
    const/4 v4, 0x0

    .line 427
    :goto_a
    const/4 v2, 0x3

    .line 428
    .line 429
    if-ge v4, v2, :cond_1e

    .line 430
    .line 431
    .line 432
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstreamGroup(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 433
    .line 434
    add-int/lit8 v4, v4, 0x1

    .line 435
    goto :goto_a

    .line 436
    .line 437
    :cond_1a
    if-nez v14, :cond_1b

    .line 438
    const/4 v2, 0x0

    .line 439
    .line 440
    :goto_b
    if-ge v2, v15, :cond_1e

    .line 441
    .line 442
    .line 443
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstream(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 444
    .line 445
    add-int/lit8 v2, v2, 0x1

    .line 446
    goto :goto_b

    .line 447
    :cond_1b
    const/4 v2, 0x0

    .line 448
    .line 449
    :goto_c
    if-ge v2, v15, :cond_1e

    .line 450
    .line 451
    .line 452
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstreamGroup(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 453
    .line 454
    add-int/lit8 v2, v2, 0x1

    .line 455
    goto :goto_c

    .line 456
    .line 457
    :cond_1c
    :goto_d
    if-nez v14, :cond_1d

    .line 458
    .line 459
    .line 460
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstream(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 461
    goto :goto_e

    .line 462
    .line 463
    .line 464
    :cond_1d
    invoke-static {v0, v6}, Landroidx/media3/extractor/Ac4Util;->parseDsiSubstreamGroup(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V

    .line 465
    .line 466
    .line 467
    :cond_1e
    :goto_e
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBit()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 471
    move-result v2

    .line 472
    .line 473
    :goto_f
    if-eqz v2, :cond_1f

    .line 474
    const/4 v2, 0x7

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 478
    move-result v2

    .line 479
    const/4 v4, 0x0

    .line 480
    .line 481
    :goto_10
    if-ge v4, v2, :cond_1f

    .line 482
    .line 483
    const/16 v9, 0xf

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0, v9}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 487
    .line 488
    add-int/lit8 v4, v4, 0x1

    .line 489
    goto :goto_10

    .line 490
    .line 491
    :cond_1f
    if-lez v14, :cond_22

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 495
    move-result v2

    .line 496
    .line 497
    if-eqz v2, :cond_21

    .line 498
    .line 499
    .line 500
    invoke-static {v0}, Landroidx/media3/extractor/Ac4Util;->skipDsiBitrate(Landroidx/media3/common/util/ParsableBitArray;)Z

    .line 501
    move-result v2

    .line 502
    .line 503
    if-eqz v2, :cond_20

    .line 504
    goto :goto_11

    .line 505
    .line 506
    :cond_20
    const-string v0, "Can\'t parse bitrate DSI."

    .line 507
    .line 508
    .line 509
    invoke-static {v0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 510
    move-result-object v0

    .line 511
    throw v0

    .line 512
    .line 513
    .line 514
    :cond_21
    :goto_11
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 515
    move-result v2

    .line 516
    .line 517
    if-eqz v2, :cond_22

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->byteAlign()V

    .line 521
    .line 522
    const/16 v2, 0x10

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 526
    move-result v2

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->skipBytes(I)V

    .line 530
    const/4 v2, 0x5

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 534
    move-result v2

    .line 535
    const/4 v11, 0x0

    .line 536
    .line 537
    :goto_12
    if-ge v11, v2, :cond_22

    .line 538
    const/4 v4, 0x3

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v4}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 542
    .line 543
    const/16 v9, 0x8

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v9}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 547
    .line 548
    add-int/lit8 v11, v11, 0x1

    .line 549
    goto :goto_12

    .line 550
    .line 551
    :cond_22
    const/16 v9, 0x8

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->byteAlign()V

    .line 555
    const/4 v4, 0x1

    .line 556
    .line 557
    if-ne v3, v4, :cond_24

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableBitArray;->bitsLeft()I

    .line 561
    move-result v2

    .line 562
    sub-int/2addr v1, v2

    .line 563
    div-int/2addr v1, v9

    .line 564
    sub-int/2addr v1, v8

    .line 565
    .line 566
    if-lt v5, v1, :cond_23

    .line 567
    sub-int/2addr v5, v1

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0, v5}, Landroidx/media3/common/util/ParsableBitArray;->skipBytes(I)V

    .line 571
    goto :goto_13

    .line 572
    .line 573
    .line 574
    :cond_23
    const-string/jumbo v0, "pres_bytes is smaller than presentation bytes read."

    .line 575
    .line 576
    .line 577
    invoke-static {v0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 578
    move-result-object v0

    .line 579
    throw v0

    .line 580
    .line 581
    :cond_24
    :goto_13
    iget-boolean v0, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->isChannelCoded:Z

    .line 582
    .line 583
    if-eqz v0, :cond_26

    .line 584
    .line 585
    iget v0, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->channelMode:I

    .line 586
    const/4 v1, -0x1

    .line 587
    .line 588
    if-eq v0, v1, :cond_25

    .line 589
    goto :goto_14

    .line 590
    .line 591
    :cond_25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 595
    .line 596
    const-string v1, "Can\'t determine channel mode of presentation "

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    move-result-object v0

    .line 607
    .line 608
    .line 609
    invoke-static {v0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 610
    move-result-object v0

    .line 611
    throw v0

    .line 612
    .line 613
    :cond_26
    :goto_14
    iget-boolean v0, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->isChannelCoded:Z

    .line 614
    .line 615
    if-eqz v0, :cond_27

    .line 616
    .line 617
    iget v0, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->channelMode:I

    .line 618
    .line 619
    iget-boolean v1, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->hasBackChannels:Z

    .line 620
    .line 621
    iget v2, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->topChannelPairs:I

    .line 622
    .line 623
    .line 624
    invoke-static {v0, v1, v2}, Landroidx/media3/extractor/Ac4Util;->getAdjustedChannelCount(IZI)I

    .line 625
    move-result v0

    .line 626
    goto :goto_15

    .line 627
    .line 628
    :cond_27
    iget v0, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->numOfUmxObjects:I

    .line 629
    .line 630
    const/16 v18, 0x1

    .line 631
    .line 632
    add-int/lit8 v0, v0, 0x1

    .line 633
    .line 634
    iget v1, v6, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->level:I

    .line 635
    const/4 v2, 0x4

    .line 636
    .line 637
    if-ne v1, v2, :cond_28

    .line 638
    .line 639
    const/16 v1, 0x11

    .line 640
    .line 641
    if-ne v0, v1, :cond_28

    .line 642
    .line 643
    const/16 v0, 0x15

    .line 644
    .line 645
    :cond_28
    :goto_15
    if-lez v0, :cond_29

    .line 646
    .line 647
    new-instance v1, Landroidx/media3/common/Format$Builder;

    .line 648
    .line 649
    .line 650
    invoke-direct {v1}, Landroidx/media3/common/Format$Builder;-><init>()V

    .line 651
    .line 652
    move-object/from16 v2, p1

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setId(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 656
    move-result-object v1

    .line 657
    .line 658
    const-string v2, "audio/ac4"

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setSampleMimeType(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 662
    move-result-object v1

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1, v0}, Landroidx/media3/common/Format$Builder;->setChannelCount(I)Landroidx/media3/common/Format$Builder;

    .line 666
    move-result-object v0

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v7}, Landroidx/media3/common/Format$Builder;->setSampleRate(I)Landroidx/media3/common/Format$Builder;

    .line 670
    move-result-object v0

    .line 671
    .line 672
    move-object/from16 v1, p3

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0, v1}, Landroidx/media3/common/Format$Builder;->setDrmInitData(Landroidx/media3/common/DrmInitData;)Landroidx/media3/common/Format$Builder;

    .line 676
    move-result-object v0

    .line 677
    .line 678
    move-object/from16 v1, p2

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0, v1}, Landroidx/media3/common/Format$Builder;->setLanguage(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 682
    move-result-object v0

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 686
    move-result-object v0

    .line 687
    return-object v0

    .line 688
    .line 689
    :cond_29
    const-string v0, "Can\'t determine channel count of presentation."

    .line 690
    .line 691
    .line 692
    invoke-static {v0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 693
    move-result-object v0

    .line 694
    throw v0

    .line 695
    .line 696
    :cond_2a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 700
    .line 701
    const-string v1, "Unsupported AC-4 DSI version: "

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    move-result-object v0

    .line 712
    .line 713
    .line 714
    invoke-static {v0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 715
    move-result-object v0

    .line 716
    throw v0
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
.end method

.method public static parseAc4SyncframeAudioSampleCount(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    .line 16
    new-instance p0, Landroidx/media3/common/util/ParsableBitArray;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;-><init>([B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/media3/extractor/Ac4Util;->parseAc4SyncframeInfo(Landroidx/media3/common/util/ParsableBitArray;)Landroidx/media3/extractor/Ac4Util$SyncFrameInfo;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    iget p0, p0, Landroidx/media3/extractor/Ac4Util$SyncFrameInfo;->sampleCount:I

    .line 26
    return p0
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
.end method

.method public static parseAc4SyncframeInfo(Landroidx/media3/common/util/ParsableBitArray;)Landroidx/media3/extractor/Ac4Util$SyncFrameInfo;
    .locals 11

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    const v2, 0xffff

    .line 14
    const/4 v3, 0x4

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x18

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x7

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v3

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    .line 28
    .line 29
    const v2, 0xac41

    .line 30
    .line 31
    if-ne v1, v2, :cond_1

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x2

    .line 34
    :cond_1
    move v8, v0

    .line 35
    const/4 v0, 0x2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x3

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v0}, Landroidx/media3/extractor/Ac4Util;->readVariableBits(Landroidx/media3/common/util/ParsableBitArray;I)I

    .line 46
    move-result v4

    .line 47
    add-int/2addr v1, v4

    .line 48
    :cond_2
    move v5, v1

    .line 49
    .line 50
    const/16 v1, 0xa

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 58
    move-result v4

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 64
    move-result v4

    .line 65
    .line 66
    if-lez v4, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 73
    move-result v4

    .line 74
    .line 75
    .line 76
    const v6, 0xac44

    .line 77
    .line 78
    .line 79
    const v7, 0xbb80

    .line 80
    .line 81
    if-eqz v4, :cond_4

    .line 82
    move v4, v7

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v4, v7

    .line 85
    move v7, v6

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {p0, v3}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 89
    move-result p0

    .line 90
    .line 91
    if-ne v7, v6, :cond_5

    .line 92
    .line 93
    const/16 v6, 0xd

    .line 94
    .line 95
    if-ne p0, v6, :cond_5

    .line 96
    .line 97
    sget-object v0, Landroidx/media3/extractor/Ac4Util;->SAMPLE_COUNT:[I

    .line 98
    .line 99
    aget p0, v0, p0

    .line 100
    :goto_2
    move v9, p0

    .line 101
    goto :goto_5

    .line 102
    .line 103
    :cond_5
    if-ne v7, v4, :cond_b

    .line 104
    .line 105
    sget-object v4, Landroidx/media3/extractor/Ac4Util;->SAMPLE_COUNT:[I

    .line 106
    array-length v6, v4

    .line 107
    .line 108
    if-ge p0, v6, :cond_b

    .line 109
    .line 110
    aget v4, v4, p0

    .line 111
    .line 112
    rem-int/lit8 v1, v1, 0x5

    .line 113
    .line 114
    const/16 v6, 0x8

    .line 115
    const/4 v9, 0x1

    .line 116
    .line 117
    if-eq v1, v9, :cond_9

    .line 118
    .line 119
    const/16 v9, 0xb

    .line 120
    .line 121
    if-eq v1, v0, :cond_8

    .line 122
    .line 123
    if-eq v1, v2, :cond_9

    .line 124
    .line 125
    if-eq v1, v3, :cond_6

    .line 126
    goto :goto_4

    .line 127
    .line 128
    :cond_6
    if-eq p0, v2, :cond_7

    .line 129
    .line 130
    if-eq p0, v6, :cond_7

    .line 131
    .line 132
    if-ne p0, v9, :cond_a

    .line 133
    .line 134
    :cond_7
    :goto_3
    add-int/lit8 p0, v4, 0x1

    .line 135
    goto :goto_2

    .line 136
    .line 137
    :cond_8
    if-eq p0, v6, :cond_7

    .line 138
    .line 139
    if-ne p0, v9, :cond_a

    .line 140
    goto :goto_3

    .line 141
    .line 142
    :cond_9
    if-eq p0, v2, :cond_7

    .line 143
    .line 144
    if-ne p0, v6, :cond_a

    .line 145
    goto :goto_3

    .line 146
    :cond_a
    :goto_4
    move v9, v4

    .line 147
    goto :goto_5

    .line 148
    :cond_b
    const/4 p0, 0x0

    .line 149
    goto :goto_2

    .line 150
    .line 151
    :goto_5
    new-instance v4, Landroidx/media3/extractor/Ac4Util$SyncFrameInfo;

    .line 152
    const/4 v6, 0x2

    .line 153
    const/4 v10, 0x0

    .line 154
    .line 155
    .line 156
    invoke-direct/range {v4 .. v10}, Landroidx/media3/extractor/Ac4Util$SyncFrameInfo;-><init>(IIIIILandroidx/media3/extractor/Ac4Util$1;)V

    .line 157
    return-object v4
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

.method public static parseAc4SyncframeSize([BI)I
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x7

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    .line 9
    aget-byte v0, p0, v0

    .line 10
    .line 11
    and-int/lit16 v0, v0, 0xff

    .line 12
    .line 13
    shl-int/lit8 v0, v0, 0x8

    .line 14
    const/4 v2, 0x3

    .line 15
    .line 16
    aget-byte v2, p0, v2

    .line 17
    .line 18
    and-int/lit16 v2, v2, 0xff

    .line 19
    or-int/2addr v0, v2

    .line 20
    .line 21
    .line 22
    const v2, 0xffff

    .line 23
    const/4 v3, 0x4

    .line 24
    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    aget-byte v0, p0, v3

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    .line 31
    shl-int/lit8 v0, v0, 0x10

    .line 32
    const/4 v2, 0x5

    .line 33
    .line 34
    aget-byte v2, p0, v2

    .line 35
    .line 36
    and-int/lit16 v2, v2, 0xff

    .line 37
    .line 38
    shl-int/lit8 v2, v2, 0x8

    .line 39
    or-int/2addr v0, v2

    .line 40
    const/4 v2, 0x6

    .line 41
    .line 42
    aget-byte p0, p0, v2

    .line 43
    .line 44
    and-int/lit16 p0, p0, 0xff

    .line 45
    or-int/2addr v0, p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v1, v3

    .line 48
    .line 49
    .line 50
    :goto_0
    const p0, 0xac41

    .line 51
    .line 52
    if-ne p1, p0, :cond_2

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x2

    .line 55
    :cond_2
    add-int/2addr v0, v1

    .line 56
    return v0
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
.end method

.method private static parseDsiSubstream(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 19
    :cond_0
    const/4 v0, 0x7

    .line 20
    .line 21
    if-lt v1, v0, :cond_1

    .line 22
    .line 23
    const/16 v0, 0xa

    .line 24
    .line 25
    if-gt v1, v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->skipBit()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    const/4 v0, 0x3

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 39
    move-result v0

    .line 40
    .line 41
    iget v2, p1, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->channelMode:I

    .line 42
    const/4 v3, -0x1

    .line 43
    .line 44
    if-ne v2, v3, :cond_3

    .line 45
    .line 46
    if-ltz v1, :cond_3

    .line 47
    .line 48
    const/16 v2, 0xf

    .line 49
    .line 50
    if-gt v1, v2, :cond_3

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    const/4 v2, 0x1

    .line 54
    .line 55
    if-ne v0, v2, :cond_3

    .line 56
    .line 57
    :cond_2
    iput v1, p1, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->channelMode:I

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 61
    move-result p1

    .line 62
    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Landroidx/media3/extractor/Ac4Util;->skipDsiLanguage(Landroidx/media3/common/util/ParsableBitArray;)V

    .line 67
    :cond_4
    return-void
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
.end method

.method private static parseDsiSubstreamGroup(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/Ac4Util$Ac4Presentation;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    :goto_0
    if-ge v3, v2, :cond_4

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 24
    move-result v4

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    const/4 v4, 0x5

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v4}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 31
    .line 32
    :cond_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/16 v4, 0x18

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v4}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x4

    .line 44
    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 49
    move-result v4

    .line 50
    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v5}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 55
    :cond_2
    const/4 v4, 0x6

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v4}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 59
    move-result v4

    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    iput v4, p1, Landroidx/media3/extractor/Ac4Util$Ac4Presentation;->numOfUmxObjects:I

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {p0, v5}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 67
    .line 68
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 69
    goto :goto_0

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 73
    move-result p1

    .line 74
    .line 75
    if-eqz p1, :cond_5

    .line 76
    const/4 p1, 0x3

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 83
    move-result p1

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Landroidx/media3/extractor/Ac4Util;->skipDsiLanguage(Landroidx/media3/common/util/ParsableBitArray;)V

    .line 89
    :cond_5
    return-void
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
.end method

.method private static readVariableBits(Landroidx/media3/common/util/ParsableBitArray;I)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 5
    move-result v1

    .line 6
    add-int/2addr v0, v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->readBit()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    return v0

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    shl-int/2addr v0, p1

    .line 17
    goto :goto_0
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

.method private static skipDsiBitrate(Landroidx/media3/common/util/ParsableBitArray;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableBitArray;->bitsLeft()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x42

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 14
    const/4 p0, 0x1

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static skipDsiLanguage(Landroidx/media3/common/util/ParsableBitArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x6

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const/16 v1, 0x2a

    .line 11
    .line 12
    if-gt v0, v1, :cond_0

    .line 13
    .line 14
    mul-int/lit8 v0, v0, 0x8

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    .line 25
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    const-string v0, "Invalid language tag bytes number: %d. Must be between 2 and 42."

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Landroidx/media3/common/ParserException;->createForUnsupportedContainerFeature(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 36
    move-result-object p0

    .line 37
    throw p0
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
.end method
