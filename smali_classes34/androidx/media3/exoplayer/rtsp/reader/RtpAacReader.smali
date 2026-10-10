.class final Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;
.super Ljava/lang/Object;
.source "RtpAacReader.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;


# static fields
.field private static final AAC_HIGH_BITRATE_MODE:Ljava/lang/String; = "AAC-hbr"

.field private static final AAC_LOW_BITRATE_MODE:Ljava/lang/String; = "AAC-lbr"

.field private static final TAG:Ljava/lang/String; = "RtpAacReader"


# instance fields
.field private final auHeaderScratchBit:Landroidx/media3/common/util/ParsableBitArray;

.field private final auIndexFieldBitSize:I

.field private final auSizeFieldBitSize:I

.field private firstReceivedTimestamp:J

.field private final numBitsInAuHeader:I

.field private final payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

.field private final sampleRate:I

.field private startTimeOffsetUs:J

.field private trackOutput:Landroidx/media3/extractor/TrackOutput;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 6
    .line 7
    new-instance v0, Landroidx/media3/common/util/ParsableBitArray;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/media3/common/util/ParsableBitArray;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auHeaderScratchBit:Landroidx/media3/common/util/ParsableBitArray;

    .line 13
    .line 14
    iget v0, p1, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->clockRate:I

    .line 15
    .line 16
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->sampleRate:I

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->fmtpParameters:Lcom/google/common/collect/ImmutableMap;

    .line 19
    .line 20
    const-string v0, "mode"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Ljava/lang/String;

    .line 33
    .line 34
    const-string v0, "AAC-hbr"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 38
    move-result v0

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    const/16 p1, 0xd

    .line 43
    .line 44
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auSizeFieldBitSize:I

    .line 45
    const/4 p1, 0x3

    .line 46
    .line 47
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auIndexFieldBitSize:I

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    const-string v0, "AAC-lbr"

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Lcom/google/common/base/Ascii;->equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 54
    move-result p1

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    const/4 p1, 0x6

    .line 58
    .line 59
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auSizeFieldBitSize:I

    .line 60
    const/4 p1, 0x2

    .line 61
    .line 62
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auIndexFieldBitSize:I

    .line 63
    .line 64
    :goto_0
    iget p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auIndexFieldBitSize:I

    .line 65
    .line 66
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auSizeFieldBitSize:I

    .line 67
    add-int/2addr p1, v0

    .line 68
    .line 69
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->numBitsInAuHeader:I

    .line 70
    return-void

    .line 71
    .line 72
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 73
    .line 74
    const-string v0, "AAC mode not supported"

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 78
    throw p1
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
.end method

.method private static outputSampleMetadata(Landroidx/media3/extractor/TrackOutput;JI)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v3, 0x1

    .line 4
    move-object v0, p0

    .line 5
    move-wide v1, p1

    .line 6
    move v4, p3

    .line 7
    .line 8
    .line 9
    invoke-interface/range {v0 .. v6}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

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
.end method


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;JIZ)V
    .locals 8

    .line 1
    .line 2
    iget-object p4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {p4}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readShort()S

    .line 9
    move-result p4

    .line 10
    .line 11
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->numBitsInAuHeader:I

    .line 12
    .line 13
    div-int v0, p4, v0

    .line 14
    .line 15
    iget-wide v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->startTimeOffsetUs:J

    .line 16
    .line 17
    iget-wide v5, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->firstReceivedTimestamp:J

    .line 18
    .line 19
    iget v7, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->sampleRate:I

    .line 20
    move-wide v3, p2

    .line 21
    .line 22
    .line 23
    invoke-static/range {v1 .. v7}, Landroidx/media3/exoplayer/rtsp/reader/RtpReaderUtils;->toSampleTimeUs(JJJI)J

    .line 24
    move-result-wide p2

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auHeaderScratchBit:Landroidx/media3/common/util/ParsableBitArray;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroidx/media3/common/util/ParsableBitArray;->reset(Landroidx/media3/common/util/ParsableByteArray;)V

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    iget-object p4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auHeaderScratchBit:Landroidx/media3/common/util/ParsableBitArray;

    .line 35
    .line 36
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auSizeFieldBitSize:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p4, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 40
    move-result p4

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auHeaderScratchBit:Landroidx/media3/common/util/ParsableBitArray;

    .line 43
    .line 44
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auIndexFieldBitSize:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 53
    move-result v1

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, p1, v1}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 57
    .line 58
    if-eqz p5, :cond_1

    .line 59
    .line 60
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p2, p3, p4}, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->outputSampleMetadata(Landroidx/media3/extractor/TrackOutput;JI)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_0
    add-int/lit8 p4, p4, 0x7

    .line 67
    .line 68
    div-int/lit8 p4, p4, 0x8

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p4}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 72
    const/4 p4, 0x0

    .line 73
    .line 74
    :goto_0
    if-ge p4, v0, :cond_1

    .line 75
    .line 76
    iget-object p5, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auHeaderScratchBit:Landroidx/media3/common/util/ParsableBitArray;

    .line 77
    .line 78
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auSizeFieldBitSize:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p5, v1}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 82
    move-result p5

    .line 83
    .line 84
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auHeaderScratchBit:Landroidx/media3/common/util/ParsableBitArray;

    .line 85
    .line 86
    iget v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->auIndexFieldBitSize:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroidx/media3/common/util/ParsableBitArray;->skipBits(I)V

    .line 90
    .line 91
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, p1, p5}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 95
    .line 96
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 97
    .line 98
    .line 99
    invoke-static {v1, p2, p3, p5}, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->outputSampleMetadata(Landroidx/media3/extractor/TrackOutput;JI)V

    .line 100
    int-to-long v2, v0

    .line 101
    .line 102
    iget p5, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->sampleRate:I

    .line 103
    int-to-long v6, p5

    .line 104
    .line 105
    .line 106
    const-wide/32 v4, 0xf4240

    .line 107
    .line 108
    .line 109
    invoke-static/range {v2 .. v7}, Landroidx/media3/common/util/Util;->scaleLargeTimestamp(JJJ)J

    .line 110
    move-result-wide v1

    .line 111
    add-long/2addr p2, v1

    .line 112
    .line 113
    add-int/lit8 p4, p4, 0x1

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    return-void
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
.end method

.method public createTracks(Landroidx/media3/extractor/ExtractorOutput;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2, v0}, Landroidx/media3/extractor/ExtractorOutput;->track(II)Landroidx/media3/extractor/TrackOutput;

    .line 5
    move-result-object p1

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 10
    .line 11
    iget-object p2, p2, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->format:Landroidx/media3/common/Format;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, p2}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

    .line 15
    return-void
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

.method public onReceivingFirstPacket(JI)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->firstReceivedTimestamp:J

    .line 3
    return-void
    .line 4
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
.end method

.method public seek(JJ)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->firstReceivedTimestamp:J

    .line 3
    .line 4
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpAacReader;->startTimeOffsetUs:J

    .line 5
    return-void
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
.end method
