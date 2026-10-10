.class final Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;
.super Ljava/lang/Object;
.source "RtpOpusReader.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;


# static fields
.field private static final MEDIA_CLOCK_FREQUENCY:I = 0xbb80

.field private static final TAG:Ljava/lang/String; = "RtpOpusReader"


# instance fields
.field private firstReceivedTimestamp:J

.field private foundOpusCommentHeader:Z

.field private foundOpusIDHeader:Z

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
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->firstReceivedTimestamp:J

    .line 10
    const/4 p1, -0x1

    .line 11
    .line 12
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->previousSequenceNumber:I

    .line 13
    return-void
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

.method private static validateOpusIdHeader(Landroidx/media3/common/util/ParsableByteArray;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 8
    move-result v1

    .line 9
    .line 10
    const/16 v2, 0x12

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    .line 14
    if-le v1, v2, :cond_0

    .line 15
    move v1, v4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v3

    .line 18
    .line 19
    :goto_0
    const-string v2, "ID Header has insufficient data"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 23
    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroidx/media3/common/util/ParsableByteArray;->readString(I)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    const-string v2, "OpusHead"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    const-string v2, "ID Header missing"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 43
    move-result v1

    .line 44
    .line 45
    if-ne v1, v4, :cond_1

    .line 46
    move v3, v4

    .line 47
    .line 48
    .line 49
    :cond_1
    const-string/jumbo v1, "version number must always be 1"

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v1}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 56
    return-void
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
    move-object/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p4

    .line 7
    .line 8
    iget-object v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 9
    .line 10
    .line 11
    invoke-static {v3}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    iget-boolean v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->foundOpusIDHeader:Z

    .line 14
    const/4 v4, 0x1

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->validateOpusIdHeader(Landroidx/media3/common/util/ParsableByteArray;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Landroidx/media3/extractor/OpusUtil;->buildInitializationData([B)Ljava/util/List;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    iget-object v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 30
    .line 31
    iget-object v3, v3, Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;->format:Landroidx/media3/common/Format;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Landroidx/media3/common/Format;->buildUpon()Landroidx/media3/common/Format$Builder;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v1}, Landroidx/media3/common/Format$Builder;->setInitializationData(Ljava/util/List;)Landroidx/media3/common/Format$Builder;

    .line 39
    .line 40
    iget-object v1, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v3}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

    .line 48
    .line 49
    iput-boolean v4, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->foundOpusIDHeader:Z

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_0
    iget-boolean v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->foundOpusCommentHeader:Z

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 58
    move-result v3

    .line 59
    .line 60
    const/16 v5, 0x8

    .line 61
    .line 62
    if-lt v3, v5, :cond_1

    .line 63
    move v3, v4

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v3, 0x0

    .line 66
    .line 67
    :goto_0
    const-string v6, "Comment Header has insufficient data"

    .line 68
    .line 69
    .line 70
    invoke-static {v3, v6}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v5}, Landroidx/media3/common/util/ParsableByteArray;->readString(I)Ljava/lang/String;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    const-string v3, "OpusTags"

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    move-result v1

    .line 81
    .line 82
    const-string v3, "Comment Header should follow ID Header"

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v3}, Landroidx/media3/common/util/Assertions;->checkArgument(ZLjava/lang/Object;)V

    .line 86
    .line 87
    iput-boolean v4, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->foundOpusCommentHeader:Z

    .line 88
    goto :goto_1

    .line 89
    .line 90
    :cond_2
    iget v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->previousSequenceNumber:I

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getNextSequenceNumber(I)I

    .line 94
    move-result v3

    .line 95
    .line 96
    if-eq v2, v3, :cond_3

    .line 97
    .line 98
    .line 99
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    .line 107
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    const-string v4, "Received RTP packet with unexpected sequence number. Expected: %d; received: %d."

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v3}, Landroidx/media3/common/util/Util;->formatInvariant(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    move-result-object v3

    .line 115
    .line 116
    const-string v4, "RtpOpusReader"

    .line 117
    .line 118
    .line 119
    invoke-static {v4, v3}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 123
    move-result v9

    .line 124
    .line 125
    iget-object v3, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 126
    .line 127
    .line 128
    invoke-interface {v3, v1, v9}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 129
    .line 130
    iget-wide v10, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->startTimeOffsetUs:J

    .line 131
    .line 132
    iget-wide v14, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->firstReceivedTimestamp:J

    .line 133
    .line 134
    .line 135
    const v16, 0xbb80

    .line 136
    .line 137
    move-wide/from16 v12, p2

    .line 138
    .line 139
    .line 140
    invoke-static/range {v10 .. v16}, Landroidx/media3/exoplayer/rtsp/reader/RtpReaderUtils;->toSampleTimeUs(JJJI)J

    .line 141
    move-result-wide v6

    .line 142
    .line 143
    iget-object v5, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 144
    const/4 v10, 0x0

    .line 145
    const/4 v11, 0x0

    .line 146
    const/4 v8, 0x1

    .line 147
    .line 148
    .line 149
    invoke-interface/range {v5 .. v11}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 150
    .line 151
    :goto_1
    iput v2, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->previousSequenceNumber:I

    .line 152
    return-void
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
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->firstReceivedTimestamp:J

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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->firstReceivedTimestamp:J

    .line 3
    .line 4
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpOpusReader;->startTimeOffsetUs:J

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
