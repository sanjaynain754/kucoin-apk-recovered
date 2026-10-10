.class final Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;
.super Ljava/lang/Object;
.source "RtpH263Reader.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;


# static fields
.field private static final I_VOP:I = 0x0

.field private static final MEDIA_CLOCK_FREQUENCY:I = 0x15f90

.field private static final PICTURE_START_CODE:I = 0x80

.field private static final TAG:Ljava/lang/String; = "RtpH263Reader"


# instance fields
.field private firstReceivedTimestamp:J

.field private fragmentedSampleSizeBytes:I

.field private fragmentedSampleTimeUs:J

.field private gotFirstPacketOfH263Frame:Z

.field private height:I

.field private isKeyFrame:Z

.field private isOutputFormatSet:Z

.field private final payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

.field private previousSequenceNumber:I

.field private startTimeOffsetUs:J

.field private trackOutput:Landroidx/media3/extractor/TrackOutput;

.field private width:I


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->firstReceivedTimestamp:J

    .line 13
    const/4 p1, -0x1

    .line 14
    .line 15
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->previousSequenceNumber:I

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private outputSampleMetadataForFragmentedPackets()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

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
    iget-wide v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleTimeUs:J

    .line 12
    .line 13
    iget-boolean v4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isKeyFrame:Z

    .line 14
    .line 15
    iget v5, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleSizeBytes:I

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    .line 19
    .line 20
    invoke-interface/range {v1 .. v7}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleSizeBytes:I

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    iput-wide v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleTimeUs:J

    .line 31
    .line 32
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isKeyFrame:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->gotFirstPacketOfH263Frame:Z

    .line 35
    return-void
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

.method private parseVopHeader(Landroidx/media3/common/util/ParsableByteArray;Z)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedInt()J

    .line 8
    move-result-wide v1

    .line 9
    .line 10
    const/16 v3, 0xa

    .line 11
    shr-long/2addr v1, v3

    .line 12
    .line 13
    const-wide/16 v3, 0x3f

    .line 14
    and-long/2addr v1, v3

    .line 15
    .line 16
    const-wide/16 v3, 0x20

    .line 17
    .line 18
    cmp-long v1, v1, v3

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->peekUnsignedByte()I

    .line 25
    move-result v1

    .line 26
    .line 27
    shr-int/lit8 v3, v1, 0x1

    .line 28
    const/4 v4, 0x1

    .line 29
    and-int/2addr v3, v4

    .line 30
    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    shr-int/lit8 p2, v1, 0x2

    .line 36
    .line 37
    and-int/lit8 p2, p2, 0x7

    .line 38
    .line 39
    if-ne p2, v4, :cond_0

    .line 40
    .line 41
    const/16 p2, 0x80

    .line 42
    .line 43
    iput p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->width:I

    .line 44
    .line 45
    const/16 p2, 0x60

    .line 46
    .line 47
    iput p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->height:I

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    add-int/lit8 p2, p2, -0x2

    .line 51
    .line 52
    const/16 v1, 0xb0

    .line 53
    shl-int/2addr v1, p2

    .line 54
    .line 55
    iput v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->width:I

    .line 56
    .line 57
    const/16 v1, 0x90

    .line 58
    .line 59
    shl-int p2, v1, p2

    .line 60
    .line 61
    iput p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->height:I

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 65
    .line 66
    if-nez v3, :cond_2

    .line 67
    move v2, v4

    .line 68
    .line 69
    :cond_2
    iput-boolean v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isKeyFrame:Z

    .line 70
    return-void

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 74
    .line 75
    iput-boolean v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isKeyFrame:Z

    .line 76
    return-void
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


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;JIZ)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 13
    move-result v1

    .line 14
    .line 15
    and-int/lit16 v2, v1, 0x400

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    .line 19
    if-lez v2, :cond_0

    .line 20
    move v2, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v3

    .line 23
    .line 24
    :goto_0
    and-int/lit16 v5, v1, 0x200

    .line 25
    .line 26
    const-string v6, "RtpH263Reader"

    .line 27
    .line 28
    if-nez v5, :cond_b

    .line 29
    .line 30
    and-int/lit16 v5, v1, 0x1f8

    .line 31
    .line 32
    if-nez v5, :cond_b

    .line 33
    .line 34
    and-int/lit8 v1, v1, 0x7

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_1
    if-eqz v2, :cond_4

    .line 41
    .line 42
    iget-boolean v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->gotFirstPacketOfH263Frame:Z

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleSizeBytes:I

    .line 47
    .line 48
    if-lez v1, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->outputSampleMetadataForFragmentedPackets()V

    .line 52
    .line 53
    :cond_2
    iput-boolean v4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->gotFirstPacketOfH263Frame:Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->peekUnsignedByte()I

    .line 57
    move-result v1

    .line 58
    .line 59
    and-int/lit16 v1, v1, 0xfc

    .line 60
    .line 61
    const/16 v2, 0x80

    .line 62
    .line 63
    if-ge v1, v2, :cond_3

    .line 64
    .line 65
    const-string p1, "Picture start Code (PSC) missing, dropping packet."

    .line 66
    .line 67
    .line 68
    invoke-static {v6, p1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    return-void

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 73
    move-result-object v1

    .line 74
    .line 75
    aput-byte v3, v1, v0

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 79
    move-result-object v1

    .line 80
    .line 81
    add-int/lit8 v2, v0, 0x1

    .line 82
    .line 83
    aput-byte v3, v1, v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->gotFirstPacketOfH263Frame:Z

    .line 90
    .line 91
    if-eqz v0, :cond_a

    .line 92
    .line 93
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->previousSequenceNumber:I

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getNextSequenceNumber(I)I

    .line 97
    move-result v0

    .line 98
    .line 99
    if-ge p4, v0, :cond_5

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    .line 106
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    move-result-object p2

    .line 108
    .line 109
    .line 110
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    const-string p2, "Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet."

    .line 114
    .line 115
    .line 116
    invoke-static {p2, p1}, Landroidx/media3/common/util/Util;->formatInvariant(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-static {v6, p1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-void

    .line 122
    .line 123
    :cond_5
    :goto_1
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleSizeBytes:I

    .line 124
    .line 125
    if-nez v0, :cond_8

    .line 126
    .line 127
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isOutputFormatSet:Z

    .line 128
    .line 129
    .line 130
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->parseVopHeader(Landroidx/media3/common/util/ParsableByteArray;Z)V

    .line 131
    .line 132
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isOutputFormatSet:Z

    .line 133
    .line 134
    if-nez v0, :cond_8

    .line 135
    .line 136
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isKeyFrame:Z

    .line 137
    .line 138
    if-eqz v0, :cond_8

    .line 139
    .line 140
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->width:I

    .line 141
    .line 142
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 143
    .line 144
    iget-object v1, v1, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->format:Landroidx/media3/common/Format;

    .line 145
    .line 146
    iget v2, v1, Landroidx/media3/common/Format;->width:I

    .line 147
    .line 148
    if-ne v0, v2, :cond_6

    .line 149
    .line 150
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->height:I

    .line 151
    .line 152
    iget v2, v1, Landroidx/media3/common/Format;->height:I

    .line 153
    .line 154
    if-eq v0, v2, :cond_7

    .line 155
    .line 156
    :cond_6
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Landroidx/media3/common/Format;->buildUpon()Landroidx/media3/common/Format$Builder;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    iget v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->width:I

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setWidth(I)Landroidx/media3/common/Format$Builder;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    iget v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->height:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setHeight(I)Landroidx/media3/common/Format$Builder;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    .line 179
    invoke-interface {v0, v1}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

    .line 180
    .line 181
    :cond_7
    iput-boolean v4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->isOutputFormatSet:Z

    .line 182
    .line 183
    .line 184
    :cond_8
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 185
    move-result v0

    .line 186
    .line 187
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 188
    .line 189
    .line 190
    invoke-interface {v1, p1, v0}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 191
    .line 192
    iget p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleSizeBytes:I

    .line 193
    add-int/2addr p1, v0

    .line 194
    .line 195
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleSizeBytes:I

    .line 196
    .line 197
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->startTimeOffsetUs:J

    .line 198
    .line 199
    iget-wide v4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->firstReceivedTimestamp:J

    .line 200
    .line 201
    .line 202
    const v6, 0x15f90

    .line 203
    move-wide v2, p2

    .line 204
    .line 205
    .line 206
    invoke-static/range {v0 .. v6}, Landroidx/media3/exoplayer/rtsp/reader/RtpReaderUtils;->toSampleTimeUs(JJJI)J

    .line 207
    move-result-wide p1

    .line 208
    .line 209
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleTimeUs:J

    .line 210
    .line 211
    if-eqz p5, :cond_9

    .line 212
    .line 213
    .line 214
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->outputSampleMetadataForFragmentedPackets()V

    .line 215
    .line 216
    :cond_9
    iput p4, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->previousSequenceNumber:I

    .line 217
    return-void

    .line 218
    .line 219
    :cond_a
    const-string p1, "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet."

    .line 220
    .line 221
    .line 222
    invoke-static {v6, p1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    return-void

    .line 224
    .line 225
    :cond_b
    :goto_2
    const-string p1, "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero"

    .line 226
    .line 227
    .line 228
    invoke-static {v6, p1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    return-void
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
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

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
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->firstReceivedTimestamp:J

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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->firstReceivedTimestamp:J

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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->firstReceivedTimestamp:J

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->fragmentedSampleSizeBytes:I

    .line 6
    .line 7
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH263Reader;->startTimeOffsetUs:J

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
