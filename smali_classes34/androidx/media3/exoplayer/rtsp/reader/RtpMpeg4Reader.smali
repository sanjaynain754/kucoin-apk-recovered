.class final Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;
.super Ljava/lang/Object;
.source "RtpMpeg4Reader.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;


# static fields
.field private static final I_VOP:I = 0x0

.field private static final MEDIA_CLOCK_FREQUENCY:I = 0x15f90

.field private static final TAG:Ljava/lang/String; = "RtpMpeg4Reader"


# instance fields
.field private bufferFlags:I

.field private firstReceivedTimestamp:J

.field private final payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

.field private previousSequenceNumber:I

.field private sampleLength:I

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
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->firstReceivedTimestamp:J

    .line 13
    const/4 p1, -0x1

    .line 14
    .line 15
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->previousSequenceNumber:I

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

.method private static getBufferFlagsFromVop(Landroidx/media3/common/util/ParsableByteArray;)I
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x4

    .line 8
    .line 9
    new-array v4, v3, [B

    .line 10
    .line 11
    .line 12
    fill-array-data v4, :array_0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v4}, Lcom/google/common/primitives/Bytes;->indexOf([B[B)I

    .line 16
    move-result v0

    .line 17
    const/4 v4, -0x1

    .line 18
    .line 19
    if-eq v0, v4, :cond_0

    .line 20
    add-int/2addr v0, v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->peekUnsignedByte()I

    .line 27
    move-result p0

    .line 28
    .line 29
    shr-int/lit8 p0, p0, 0x6

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    return v2

    .line 33
    :cond_0
    return v1

    .line 34
    nop

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        -0x4at
    .end array-data
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


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;JIZ)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p4

    .line 5
    .line 6
    iget-object v2, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    iget v2, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->previousSequenceNumber:I

    .line 12
    const/4 v3, -0x1

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getNextSequenceNumber(I)I

    .line 18
    move-result v2

    .line 19
    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    const-string v3, "Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet."

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v2}, Landroidx/media3/common/util/Util;->formatInvariant(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    const-string v3, "RtpMpeg4Reader"

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v2}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 47
    move-result v2

    .line 48
    .line 49
    iget-object v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 50
    .line 51
    move-object/from16 v4, p1

    .line 52
    .line 53
    .line 54
    invoke-interface {v3, v4, v2}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 55
    .line 56
    iget v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->sampleLength:I

    .line 57
    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-static {v4}, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->getBufferFlagsFromVop(Landroidx/media3/common/util/ParsableByteArray;)I

    .line 62
    move-result v3

    .line 63
    .line 64
    iput v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->bufferFlags:I

    .line 65
    .line 66
    :cond_1
    iget v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->sampleLength:I

    .line 67
    add-int/2addr v3, v2

    .line 68
    .line 69
    iput v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->sampleLength:I

    .line 70
    .line 71
    if-eqz p5, :cond_3

    .line 72
    .line 73
    iget-wide v2, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->firstReceivedTimestamp:J

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    cmp-long v2, v2, v4

    .line 81
    .line 82
    move-wide/from16 v5, p2

    .line 83
    .line 84
    if-nez v2, :cond_2

    .line 85
    .line 86
    iput-wide v5, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->firstReceivedTimestamp:J

    .line 87
    .line 88
    :cond_2
    iget-wide v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->startTimeOffsetUs:J

    .line 89
    .line 90
    iget-wide v7, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->firstReceivedTimestamp:J

    .line 91
    .line 92
    .line 93
    const v9, 0x15f90

    .line 94
    .line 95
    .line 96
    invoke-static/range {v3 .. v9}, Landroidx/media3/exoplayer/rtsp/reader/RtpReaderUtils;->toSampleTimeUs(JJJI)J

    .line 97
    move-result-wide v11

    .line 98
    .line 99
    iget-object v10, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 100
    .line 101
    iget v13, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->bufferFlags:I

    .line 102
    .line 103
    iget v14, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->sampleLength:I

    .line 104
    const/4 v15, 0x0

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    .line 109
    invoke-interface/range {v10 .. v16}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 110
    const/4 v2, 0x0

    .line 111
    .line 112
    iput v2, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->sampleLength:I

    .line 113
    .line 114
    :cond_3
    iput v1, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->previousSequenceNumber:I

    .line 115
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
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2, v0}, Landroidx/media3/extractor/ExtractorOutput;->track(II)Landroidx/media3/extractor/TrackOutput;

    .line 5
    move-result-object p1

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

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
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

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
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->firstReceivedTimestamp:J

    .line 3
    .line 4
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->startTimeOffsetUs:J

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpMpeg4Reader;->sampleLength:I

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
