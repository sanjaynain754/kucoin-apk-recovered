.class final Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;
.super Ljava/lang/Object;
.source "RtpVp8Reader.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;


# static fields
.field private static final MEDIA_CLOCK_FREQUENCY:I = 0x15f90

.field private static final TAG:Ljava/lang/String; = "RtpVP8Reader"


# instance fields
.field private firstReceivedTimestamp:J

.field private fragmentedSampleSizeBytes:I

.field private fragmentedSampleTimeUs:J

.field private gotFirstPacketOfVp8Frame:Z

.field private isKeyFrame:Z

.field private isOutputFormatSet:Z

.field private final payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

.field private previousSequenceNumber:I

.field private startTimeOffsetUs:J

.field private trackOutput:Landroidx/media3/extractor/TrackOutput;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->firstReceivedTimestamp:J

    .line 13
    const/4 p1, -0x1

    .line 14
    .line 15
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->previousSequenceNumber:I

    .line 16
    .line 17
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 18
    .line 19
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleTimeUs:J

    .line 20
    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->startTimeOffsetUs:J

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
.end method

.method private outputSampleMetadataForFragmentedPackets()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

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
    iget-wide v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleTimeUs:J

    .line 12
    .line 13
    iget-boolean v4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->isKeyFrame:Z

    .line 14
    .line 15
    iget v5, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    .line 19
    .line 20
    invoke-interface/range {v1 .. v7}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 21
    const/4 v0, -0x1

    .line 22
    .line 23
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleTimeUs:J

    .line 31
    const/4 v0, 0x0

    .line 32
    .line 33
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->gotFirstPacketOfVp8Frame:Z

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
.end method

.method private validateVp8Descriptor(Landroidx/media3/common/util/ParsableByteArray;I)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 4
    move-result v0

    .line 5
    .line 6
    and-int/lit8 v1, v0, 0x10

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    const/16 v3, 0x10

    .line 10
    .line 11
    if-ne v1, v3, :cond_1

    .line 12
    .line 13
    and-int/lit8 v1, v0, 0x7

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-boolean p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->gotFirstPacketOfVp8Frame:Z

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 22
    .line 23
    if-lez p2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->outputSampleMetadataForFragmentedPackets()V

    .line 27
    .line 28
    :cond_0
    iput-boolean v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->gotFirstPacketOfVp8Frame:Z

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    iget-boolean v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->gotFirstPacketOfVp8Frame:Z

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    const-string v5, "RtpVP8Reader"

    .line 35
    .line 36
    if-eqz v1, :cond_7

    .line 37
    .line 38
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->previousSequenceNumber:I

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getNextSequenceNumber(I)I

    .line 42
    move-result v1

    .line 43
    .line 44
    if-ge p2, v1, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object p2

    .line 53
    .line 54
    .line 55
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    const-string p2, "Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet."

    .line 59
    .line 60
    .line 61
    invoke-static {p2, p1}, Landroidx/media3/common/util/Util;->formatInvariant(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-static {v5, p1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    return v4

    .line 67
    .line 68
    :cond_2
    :goto_0
    and-int/lit16 p2, v0, 0x80

    .line 69
    .line 70
    if-eqz p2, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 74
    move-result p2

    .line 75
    .line 76
    and-int/lit16 v0, p2, 0x80

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 82
    move-result v0

    .line 83
    .line 84
    and-int/lit16 v0, v0, 0x80

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 90
    .line 91
    :cond_3
    and-int/lit8 v0, p2, 0x40

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v2}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 97
    .line 98
    :cond_4
    and-int/lit8 v0, p2, 0x20

    .line 99
    .line 100
    if-nez v0, :cond_5

    .line 101
    and-int/2addr p2, v3

    .line 102
    .line 103
    if-eqz p2, :cond_6

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {p1, v2}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 107
    :cond_6
    return v2

    .line 108
    .line 109
    :cond_7
    const-string p1, "RTP packet is not the start of a new VP8 partition, skipping."

    .line 110
    .line 111
    .line 112
    invoke-static {v5, p1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    return v4
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


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;JIZ)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p4}, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->validateVp8Descriptor(Landroidx/media3/common/util/ParsableByteArray;I)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 14
    const/4 v1, -0x1

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->gotFirstPacketOfVp8Frame:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->peekUnsignedByte()I

    .line 25
    move-result v0

    .line 26
    and-int/2addr v0, v2

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    .line 33
    :goto_0
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->isKeyFrame:Z

    .line 34
    .line 35
    :cond_1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->isOutputFormatSet:Z

    .line 36
    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 41
    move-result v0

    .line 42
    .line 43
    add-int/lit8 v3, v0, 0x6

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v3}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianUnsignedShort()I

    .line 50
    move-result v3

    .line 51
    .line 52
    and-int/lit16 v3, v3, 0x3fff

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readLittleEndianUnsignedShort()I

    .line 56
    move-result v4

    .line 57
    .line 58
    and-int/lit16 v4, v4, 0x3fff

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 62
    .line 63
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 64
    .line 65
    iget-object v0, v0, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->format:Landroidx/media3/common/Format;

    .line 66
    .line 67
    iget v5, v0, Landroidx/media3/common/Format;->width:I

    .line 68
    .line 69
    if-ne v3, v5, :cond_2

    .line 70
    .line 71
    iget v5, v0, Landroidx/media3/common/Format;->height:I

    .line 72
    .line 73
    if-eq v4, v5, :cond_3

    .line 74
    .line 75
    :cond_2
    iget-object v5, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroidx/media3/common/Format;->buildUpon()Landroidx/media3/common/Format$Builder;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Landroidx/media3/common/Format$Builder;->setWidth(I)Landroidx/media3/common/Format$Builder;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v4}, Landroidx/media3/common/Format$Builder;->setHeight(I)Landroidx/media3/common/Format$Builder;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    .line 94
    invoke-interface {v5, v0}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

    .line 95
    .line 96
    :cond_3
    iput-boolean v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->isOutputFormatSet:Z

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 100
    move-result v0

    .line 101
    .line 102
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 103
    .line 104
    .line 105
    invoke-interface {v2, p1, v0}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 106
    .line 107
    iget p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 108
    .line 109
    if-ne p1, v1, :cond_5

    .line 110
    .line 111
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 112
    goto :goto_1

    .line 113
    :cond_5
    add-int/2addr p1, v0

    .line 114
    .line 115
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 116
    .line 117
    :goto_1
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->startTimeOffsetUs:J

    .line 118
    .line 119
    iget-wide v4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->firstReceivedTimestamp:J

    .line 120
    .line 121
    .line 122
    const v6, 0x15f90

    .line 123
    move-wide v2, p2

    .line 124
    .line 125
    .line 126
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/rtsp/reader/RtpReaderUtils;->toSampleTimeUs(JJJI)J

    .line 127
    move-result-wide p1

    .line 128
    .line 129
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleTimeUs:J

    .line 130
    .line 131
    if-eqz p5, :cond_6

    .line 132
    .line 133
    .line 134
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->outputSampleMetadataForFragmentedPackets()V

    .line 135
    .line 136
    :cond_6
    iput p4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->previousSequenceNumber:I

    .line 137
    :cond_7
    return-void
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
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

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
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->firstReceivedTimestamp:J

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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->firstReceivedTimestamp:J

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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->firstReceivedTimestamp:J

    .line 3
    const/4 p1, -0x1

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->fragmentedSampleSizeBytes:I

    .line 6
    .line 7
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpVp8Reader;->startTimeOffsetUs:J

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
