.class final Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;
.super Ljava/lang/Object;
.source "RtpMp4aReader.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;


# static fields
.field private static final PARAMETER_MP4A_CONFIG:Ljava/lang/String; = "config"

.field private static final TAG:Ljava/lang/String; = "RtpMp4aReader"


# instance fields
.field private firstReceivedTimestamp:J

.field private fragmentedSampleSizeBytes:I

.field private fragmentedSampleTimeUs:J

.field private final numberOfSubframes:I

.field private final payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

.field private previousSequenceNumber:I

.field private startTimeOffsetUs:J

.field private trackOutput:Landroidx/media3/extractor/TrackOutput;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 6
    .line 7
    :try_start_0
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->fmtpParameters:Lcom/google/common/collect/ImmutableMap;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->getNumOfSubframesFromMpeg4AudioConfig(Lcom/google/common/collect/ImmutableMap;)I

    .line 11
    move-result p1

    .line 12
    .line 13
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->numberOfSubframes:I
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->firstReceivedTimestamp:J

    .line 21
    const/4 p1, -0x1

    .line 22
    .line 23
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->previousSequenceNumber:I

    .line 24
    const/4 p1, 0x0

    .line 25
    .line 26
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleSizeBytes:I

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    iput-wide v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->startTimeOffsetUs:J

    .line 31
    .line 32
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleTimeUs:J

    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    .line 36
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 40
    throw v0
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

.method private static getNumOfSubframesFromMpeg4AudioConfig(Lcom/google/common/collect/ImmutableMap;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/ImmutableMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Ljava/lang/String;

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz p0, :cond_4

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 16
    move-result v2

    .line 17
    .line 18
    rem-int/lit8 v2, v2, 0x2

    .line 19
    .line 20
    if-nez v2, :cond_4

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Landroidx/media3/common/util/Util;->getBytesFromHexString(Ljava/lang/String;)[B

    .line 24
    move-result-object p0

    .line 25
    .line 26
    new-instance v2, Landroidx/media3/common/util/ParsableBitArray;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, p0}, Landroidx/media3/common/util/ParsableBitArray;-><init>([B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 33
    move-result p0

    .line 34
    .line 35
    if-nez p0, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 39
    move-result p0

    .line 40
    .line 41
    if-ne p0, v0, :cond_0

    .line 42
    move p0, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move p0, v1

    .line 45
    .line 46
    :goto_0
    const-string v3, "Only supports allStreamsSameTimeFraming."

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v3}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 50
    const/4 p0, 0x6

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p0}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 54
    move-result p0

    .line 55
    const/4 v3, 0x4

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 59
    move-result v3

    .line 60
    .line 61
    if-nez v3, :cond_1

    .line 62
    move v3, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move v3, v1

    .line 65
    .line 66
    :goto_1
    const-string v4, "Only suppors one program."

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v4}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 70
    const/4 v3, 0x3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v3}, Landroidx/media3/common/util/ParsableBitArray;->readBits(I)I

    .line 74
    move-result v2

    .line 75
    .line 76
    if-nez v2, :cond_2

    .line 77
    move v1, v0

    .line 78
    .line 79
    :cond_2
    const-string v2, "Only suppors one layer."

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 83
    move v1, p0

    .line 84
    goto :goto_2

    .line 85
    .line 86
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string/jumbo v1, "unsupported audio mux version: "

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    move-result-object p0

    .line 103
    const/4 v0, 0x0

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v0}, Landroidx/media3/common/ParserException;->createForMalformedDataOfUnknownType(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 107
    move-result-object p0

    .line 108
    throw p0

    .line 109
    :cond_4
    :goto_2
    add-int/2addr v1, v0

    .line 110
    return v1
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

.method private outputSampleMetadataForFragmentedPackets()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    .line 9
    check-cast v1, Landroidx/media3/extractor/TrackOutput;

    .line 10
    .line 11
    iget-wide v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleTimeUs:J

    .line 12
    .line 13
    iget v5, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleSizeBytes:I

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    .line 18
    .line 19
    invoke-interface/range {v1 .. v7}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleSizeBytes:I

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleTimeUs:J

    .line 30
    return-void
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
.end method


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;JIZ)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->previousSequenceNumber:I

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getNextSequenceNumber(I)I

    .line 11
    move-result v0

    .line 12
    .line 13
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleSizeBytes:I

    .line 14
    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    if-ge v0, p4, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->outputSampleMetadataForFragmentedPackets()V

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    move v1, v0

    .line 23
    .line 24
    :goto_0
    iget v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->numberOfSubframes:I

    .line 25
    .line 26
    if-ge v1, v2, :cond_3

    .line 27
    move v2, v0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 31
    move-result v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 35
    move-result v4

    .line 36
    .line 37
    if-ge v3, v4, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 41
    move-result v3

    .line 42
    add-int/2addr v2, v3

    .line 43
    .line 44
    const/16 v4, 0xff

    .line 45
    .line 46
    if-eq v3, v4, :cond_1

    .line 47
    .line 48
    :cond_2
    iget-object v3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 49
    .line 50
    .line 51
    invoke-interface {v3, p1, v2}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 52
    .line 53
    iget v3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleSizeBytes:I

    .line 54
    add-int/2addr v3, v2

    .line 55
    .line 56
    iput v3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleSizeBytes:I

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_3
    iget-wide v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->startTimeOffsetUs:J

    .line 62
    .line 63
    iget-wide v6, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->firstReceivedTimestamp:J

    .line 64
    .line 65
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 66
    .line 67
    iget v8, p1, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->clockRate:I

    .line 68
    move-wide v4, p2

    .line 69
    .line 70
    .line 71
    invoke-static/range {v2 .. v8}, Landroidx/media3/exoplayer/rtsp/reader/RtpReaderUtils;->toSampleTimeUs(JJJI)J

    .line 72
    move-result-wide p1

    .line 73
    .line 74
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleTimeUs:J

    .line 75
    .line 76
    if-eqz p5, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->outputSampleMetadataForFragmentedPackets()V

    .line 80
    .line 81
    :cond_4
    iput p4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->previousSequenceNumber:I

    .line 82
    return-void
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
.end method

.method public createTracks(Landroidx/media3/extractor/ExtractorOutput;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2, v0}, Landroidx/media3/extractor/ExtractorOutput;->track(II)Landroidx/media3/extractor/TrackOutput;

    .line 5
    move-result-object p1

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Landroidx/media3/extractor/TrackOutput;

    .line 14
    .line 15
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 16
    .line 17
    iget-object p2, p2, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->format:Landroidx/media3/common/Format;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, p2}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

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
.end method

.method public onReceivingFirstPacket(JI)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->firstReceivedTimestamp:J

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    cmp-long p3, v0, v2

    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    const/4 p3, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {p3}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 18
    .line 19
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->firstReceivedTimestamp:J

    .line 20
    return-void
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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->firstReceivedTimestamp:J

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->fragmentedSampleSizeBytes:I

    .line 6
    .line 7
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMp4aReader;->startTimeOffsetUs:J

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
.end method
