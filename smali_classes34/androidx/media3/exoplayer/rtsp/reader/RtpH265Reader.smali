.class final Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;
.super Ljava/lang/Object;
.source "RtpH265Reader.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;


# static fields
.field private static final FU_PAYLOAD_OFFSET:I = 0x3

.field private static final MEDIA_CLOCK_FREQUENCY:I = 0x15f90

.field private static final NAL_IDR_N_LP:I = 0x14

.field private static final NAL_IDR_W_RADL:I = 0x13

.field private static final RTP_PACKET_TYPE_AP:I = 0x30

.field private static final RTP_PACKET_TYPE_FU:I = 0x31

.field private static final TAG:Ljava/lang/String; = "RtpH265Reader"


# instance fields
.field private bufferFlags:I

.field private firstReceivedTimestamp:J

.field private fragmentedSampleSizeBytes:I

.field private final fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

.field private final nalStartCodeArray:Landroidx/media3/common/util/ParsableByteArray;

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
    new-instance v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/media3/common/util/ParsableByteArray;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 11
    .line 12
    new-instance v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 13
    .line 14
    sget-object v1, Landroidx/media3/container/NalUnitUtil;->NAL_START_CODE:[B

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;-><init>([B)V

    .line 18
    .line 19
    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->nalStartCodeArray:Landroidx/media3/common/util/ParsableByteArray;

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    iput-wide v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->firstReceivedTimestamp:J

    .line 29
    const/4 p1, -0x1

    .line 30
    .line 31
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->previousSequenceNumber:I

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
.end method

.method private static getBufferFlagsFromNalType(I)I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x13

    .line 3
    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x14

    .line 7
    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
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

.method private processFragmentationUnitPacket(Landroidx/media3/common/util/ParsableByteArray;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    const/4 v1, 0x3

    .line 7
    .line 8
    if-lt v0, v1, :cond_5

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    aget-byte v0, v0, v2

    .line 16
    .line 17
    and-int/lit8 v0, v0, 0x7

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x2

    .line 23
    .line 24
    aget-byte v3, v3, v4

    .line 25
    .line 26
    and-int/lit8 v5, v3, 0x3f

    .line 27
    .line 28
    and-int/lit16 v6, v3, 0x80

    .line 29
    const/4 v7, 0x0

    .line 30
    .line 31
    if-lez v6, :cond_0

    .line 32
    move v6, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v6, v7

    .line 35
    .line 36
    :goto_0
    and-int/lit8 v3, v3, 0x40

    .line 37
    .line 38
    if-lez v3, :cond_1

    .line 39
    move v7, v2

    .line 40
    .line 41
    :cond_1
    if-eqz v6, :cond_2

    .line 42
    .line 43
    iget p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->writeStartCode()I

    .line 47
    move-result v1

    .line 48
    add-int/2addr p2, v1

    .line 49
    .line 50
    iput p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 54
    move-result-object p2

    .line 55
    .line 56
    shl-int/lit8 v1, v5, 0x1

    .line 57
    .line 58
    and-int/lit8 v1, v1, 0x7f

    .line 59
    int-to-byte v1, v1

    .line 60
    .line 61
    aput-byte v1, p2, v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 65
    move-result-object p2

    .line 66
    int-to-byte v0, v0

    .line 67
    .line 68
    aput-byte v0, p2, v4

    .line 69
    .line 70
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, p1}, Landroidx/media3/common/util/ParsableByteArray;->reset([B)V

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :cond_2
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->previousSequenceNumber:I

    .line 86
    add-int/2addr v0, v2

    .line 87
    .line 88
    .line 89
    const v2, 0xffff

    .line 90
    rem-int/2addr v0, v2

    .line 91
    .line 92
    if-eq p2, v0, :cond_3

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    move-result-object p2

    .line 101
    .line 102
    .line 103
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    const-string p2, "Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet."

    .line 107
    .line 108
    .line 109
    invoke-static {p2, p1}, Landroidx/media3/common/util/Util;->formatInvariant(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    const-string p2, "RtpH265Reader"

    .line 113
    .line 114
    .line 115
    invoke-static {p2, p1}, Landroidx/media3/common/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    return-void

    .line 117
    .line 118
    :cond_3
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 122
    move-result-object p1

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, p1}, Landroidx/media3/common/util/ParsableByteArray;->reset([B)V

    .line 126
    .line 127
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v1}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 131
    .line 132
    :goto_1
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 136
    move-result p1

    .line 137
    .line 138
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 139
    .line 140
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fuScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 141
    .line 142
    .line 143
    invoke-interface {p2, v0, p1}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 144
    .line 145
    iget p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 146
    add-int/2addr p2, p1

    .line 147
    .line 148
    iput p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 149
    .line 150
    if-eqz v7, :cond_4

    .line 151
    .line 152
    .line 153
    invoke-static {v5}, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->getBufferFlagsFromNalType(I)I

    .line 154
    move-result p1

    .line 155
    .line 156
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->bufferFlags:I

    .line 157
    :cond_4
    return-void

    .line 158
    .line 159
    :cond_5
    const-string p1, "Malformed FU header."

    .line 160
    const/4 p2, 0x0

    .line 161
    .line 162
    .line 163
    invoke-static {p1, p2}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 164
    move-result-object p1

    .line 165
    throw p1
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

.method private processSingleNalUnitPacket(Landroidx/media3/common/util/ParsableByteArray;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->writeStartCode()I

    .line 10
    move-result v2

    .line 11
    add-int/2addr v1, v2

    .line 12
    .line 13
    iput v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, p1, v0}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 19
    .line 20
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 21
    add-int/2addr v1, v0

    .line 22
    .line 23
    iput v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    aget-byte p1, p1, v0

    .line 31
    .line 32
    shr-int/lit8 p1, p1, 0x1

    .line 33
    .line 34
    and-int/lit8 p1, p1, 0x3f

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->getBufferFlagsFromNalType(I)I

    .line 38
    move-result p1

    .line 39
    .line 40
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->bufferFlags:I

    .line 41
    return-void
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

.method private writeStartCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->nalStartCodeArray:Landroidx/media3/common/util/ParsableByteArray;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->nalStartCodeArray:Landroidx/media3/common/util/ParsableByteArray;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 12
    move-result v0

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Landroidx/media3/extractor/TrackOutput;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->nalStartCodeArray:Landroidx/media3/common/util/ParsableByteArray;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, v2, v0}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 26
    return v0
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
.end method


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;JIZ)V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p4

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 8
    move-result-object v2

    .line 9
    array-length v2, v2

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    if-eqz v2, :cond_5

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 16
    move-result-object v2

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    aget-byte v2, v2, v4

    .line 20
    .line 21
    shr-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    and-int/lit8 v2, v2, 0x3f

    .line 24
    .line 25
    iget-object v5, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 26
    .line 27
    .line 28
    invoke-static {v5}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    const/16 v5, 0x30

    .line 31
    .line 32
    if-ltz v2, :cond_0

    .line 33
    .line 34
    if-ge v2, v5, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {p0 .. p1}, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->processSingleNalUnitPacket(Landroidx/media3/common/util/ParsableByteArray;)V

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    if-eq v2, v5, :cond_4

    .line 41
    .line 42
    const/16 v5, 0x31

    .line 43
    .line 44
    if-ne v2, v5, :cond_3

    .line 45
    .line 46
    move-object/from16 v5, p1

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v5, v1}, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->processFragmentationUnitPacket(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 50
    .line 51
    :goto_0
    if-eqz p5, :cond_2

    .line 52
    .line 53
    iget-wide v2, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->firstReceivedTimestamp:J

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    cmp-long v2, v2, v5

    .line 61
    .line 62
    move-wide/from16 v7, p2

    .line 63
    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    iput-wide v7, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->firstReceivedTimestamp:J

    .line 67
    .line 68
    :cond_1
    iget-wide v5, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->startTimeOffsetUs:J

    .line 69
    .line 70
    iget-wide v9, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->firstReceivedTimestamp:J

    .line 71
    .line 72
    .line 73
    const v11, 0x15f90

    .line 74
    .line 75
    .line 76
    invoke-static/range {v5 .. v11}, Landroidx/media3/exoplayer/rtsp/reader/RtpReaderUtils;->toSampleTimeUs(JJJI)J

    .line 77
    move-result-wide v13

    .line 78
    .line 79
    iget-object v12, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 80
    .line 81
    iget v15, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->bufferFlags:I

    .line 82
    .line 83
    iget v2, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    move/from16 v16, v2

    .line 90
    .line 91
    .line 92
    invoke-interface/range {v12 .. v18}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 93
    .line 94
    iput v4, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 95
    .line 96
    :cond_2
    iput v1, v0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->previousSequenceNumber:I

    .line 97
    return-void

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    .line 104
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    const-string v2, "RTP H265 payload type [%d] not supported."

    .line 108
    .line 109
    .line 110
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v3}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 115
    move-result-object v1

    .line 116
    throw v1

    .line 117
    .line 118
    :cond_4
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 119
    .line 120
    const-string v2, "need to implement processAggregationPacket"

    .line 121
    .line 122
    .line 123
    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 124
    throw v1

    .line 125
    .line 126
    :cond_5
    const-string v1, "Empty RTP data packet."

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v3}, Landroidx/media3/common/ParserException;->createForMalformedManifest(Ljava/lang/String;Ljava/lang/Throwable;)Landroidx/media3/common/ParserException;

    .line 130
    move-result-object v1

    .line 131
    throw v1
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
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->trackOutput:Landroidx/media3/extractor/TrackOutput;

    .line 8
    .line 9
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->payloadFormat:Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;

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
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->firstReceivedTimestamp:J

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->fragmentedSampleSizeBytes:I

    .line 6
    .line 7
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/reader/RtpH265Reader;->startTimeOffsetUs:J

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
