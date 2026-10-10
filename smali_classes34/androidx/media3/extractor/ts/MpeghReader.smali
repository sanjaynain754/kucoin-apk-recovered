.class public final Landroidx/media3/extractor/ts/MpeghReader;
.super Ljava/lang/Object;
.source "MpeghReader.java"

# interfaces
.implements Landroidx/media3/extractor/ts/ElementaryStreamReader;


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# static fields
.field private static final MAX_MHAS_PACKET_HEADER_SIZE:I = 0xf

.field private static final MHAS_SYNC_WORD_LENGTH:I = 0x3

.field private static final MIN_MHAS_PACKET_HEADER_SIZE:I = 0x2

.field private static final STATE_FINDING_SYNC:I = 0x0

.field private static final STATE_READING_PACKET_HEADER:I = 0x1

.field private static final STATE_READING_PACKET_PAYLOAD:I = 0x2


# instance fields
.field private configFound:Z

.field private dataPending:Z

.field private final dataScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

.field private flags:I

.field private formatId:Ljava/lang/String;

.field private frameBytes:I

.field private header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

.field private headerDataFinished:Z

.field private final headerScratchBits:Landroidx/media3/common/util/ParsableBitArray;

.field private final headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

.field private mainStreamLabel:J

.field private output:Landroidx/media3/extractor/TrackOutput;

.field private payloadBytesRead:I

.field private rapPending:Z

.field private samplingRate:I

.field private standardFrameLength:I

.field private state:I

.field private syncBytes:I

.field private timeUs:D

.field private timeUsPending:D

.field private truncationSamples:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->state:I

    .line 7
    .line 8
    new-instance v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 9
    .line 10
    const/16 v1, 0xf

    .line 11
    .line 12
    new-array v1, v1, [B

    .line 13
    const/4 v2, 0x2

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/media3/common/util/ParsableByteArray;-><init>([BI)V

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 19
    .line 20
    new-instance v0, Landroidx/media3/common/util/ParsableBitArray;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Landroidx/media3/common/util/ParsableBitArray;-><init>()V

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBits:Landroidx/media3/common/util/ParsableBitArray;

    .line 26
    .line 27
    new-instance v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Landroidx/media3/common/util/ParsableByteArray;-><init>()V

    .line 31
    .line 32
    iput-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 33
    .line 34
    new-instance v0, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;-><init>()V

    .line 38
    .line 39
    iput-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 40
    .line 41
    .line 42
    const v0, -0x7fffffff

    .line 43
    .line 44
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->samplingRate:I

    .line 45
    const/4 v0, -0x1

    .line 46
    .line 47
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->standardFrameLength:I

    .line 48
    .line 49
    const-wide/16 v0, -0x1

    .line 50
    .line 51
    iput-wide v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->mainStreamLabel:J

    .line 52
    const/4 v0, 0x1

    .line 53
    .line 54
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->rapPending:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerDataFinished:Z

    .line 57
    .line 58
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 59
    .line 60
    iput-wide v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUs:D

    .line 61
    .line 62
    iput-wide v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUsPending:D

    .line 63
    return-void
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

.method private copyData(Landroidx/media3/common/util/ParsableByteArray;Landroidx/media3/common/util/ParsableByteArray;Z)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 24
    move-result v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v2, v3, v1}, Landroidx/media3/common/util/ParsableByteArray;->readBytes([BII)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v1}, Landroidx/media3/common/util/ParsableByteArray;->skipBytes(I)V

    .line 31
    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 36
    :cond_0
    return-void
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

.method private finalizeFrame()V
    .locals 10

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->configFound:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->rapPending:Z

    .line 8
    const/4 v0, 0x1

    .line 9
    move v5, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v5, v1

    .line 12
    .line 13
    :goto_0
    iget v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->standardFrameLength:I

    .line 14
    .line 15
    iget v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->truncationSamples:I

    .line 16
    sub-int/2addr v0, v2

    .line 17
    int-to-double v2, v0

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide v6, 0x412e848000000000L    # 1000000.0

    .line 23
    mul-double/2addr v2, v6

    .line 24
    .line 25
    iget v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->samplingRate:I

    .line 26
    int-to-double v6, v0

    .line 27
    div-double/2addr v2, v6

    .line 28
    .line 29
    iget-wide v6, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUs:D

    .line 30
    .line 31
    .line 32
    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    .line 33
    move-result-wide v6

    .line 34
    .line 35
    iget-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataPending:Z

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iput-boolean v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataPending:Z

    .line 40
    .line 41
    iget-wide v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUsPending:D

    .line 42
    .line 43
    iput-wide v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUs:D

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    iget-wide v8, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUs:D

    .line 47
    add-double/2addr v8, v2

    .line 48
    .line 49
    iput-wide v8, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUs:D

    .line 50
    .line 51
    :goto_1
    iget-object v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->output:Landroidx/media3/extractor/TrackOutput;

    .line 52
    move-wide v3, v6

    .line 53
    .line 54
    iget v6, p0, Landroidx/media3/extractor/ts/MpeghReader;->frameBytes:I

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    .line 58
    .line 59
    invoke-interface/range {v2 .. v8}, Landroidx/media3/extractor/TrackOutput;->sampleMetadata(JIIILandroidx/media3/extractor/TrackOutput$CryptoData;)V

    .line 60
    .line 61
    iput-boolean v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->configFound:Z

    .line 62
    .line 63
    iput v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->truncationSamples:I

    .line 64
    .line 65
    iput v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->frameBytes:I

    .line 66
    return-void
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

.method private parseConfig(Landroidx/media3/common/util/ParsableBitArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/extractor/ts/MpeghUtil;->parseMpegh3daConfig(Landroidx/media3/common/util/ParsableBitArray;)Landroidx/media3/extractor/ts/MpeghUtil$Mpegh3daConfig;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget v0, p1, Landroidx/media3/extractor/ts/MpeghUtil$Mpegh3daConfig;->samplingFrequency:I

    .line 7
    .line 8
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->samplingRate:I

    .line 9
    .line 10
    iget v0, p1, Landroidx/media3/extractor/ts/MpeghUtil$Mpegh3daConfig;->standardFrameLength:I

    .line 11
    .line 12
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->standardFrameLength:I

    .line 13
    .line 14
    iget-wide v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->mainStreamLabel:J

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 17
    .line 18
    iget-wide v2, v2, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;->packetLabel:J

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iput-wide v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->mainStreamLabel:J

    .line 25
    .line 26
    iget v0, p1, Landroidx/media3/extractor/ts/MpeghUtil$Mpegh3daConfig;->profileLevelIndication:I

    .line 27
    const/4 v1, -0x1

    .line 28
    .line 29
    const-string v2, "mhm1"

    .line 30
    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    iget v1, p1, Landroidx/media3/extractor/ts/MpeghUtil$Mpegh3daConfig;->profileLevelIndication:I

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    const-string v2, ".%02X"

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    :cond_0
    iget-object p1, p1, Landroidx/media3/extractor/ts/MpeghUtil$Mpegh3daConfig;->compatibleProfileLevelSet:[B

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    array-length v0, p1

    .line 68
    .line 69
    if-lez v0, :cond_1

    .line 70
    .line 71
    sget-object v0, Landroidx/media3/common/util/Util;->EMPTY_BYTE_ARRAY:[B

    .line 72
    .line 73
    .line 74
    invoke-static {v0, p1}, Lcom/google/common/collect/ImmutableList;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    .line 75
    move-result-object p1

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 p1, 0x0

    .line 78
    .line 79
    :goto_0
    new-instance v0, Landroidx/media3/common/Format$Builder;

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, Landroidx/media3/common/Format$Builder;-><init>()V

    .line 83
    .line 84
    iget-object v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->formatId:Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroidx/media3/common/Format$Builder;->setId(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    const-string v1, "audio/mhm1"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroidx/media3/common/Format$Builder;->setSampleMimeType(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    iget v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->samplingRate:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroidx/media3/common/Format$Builder;->setSampleRate(I)Landroidx/media3/common/Format$Builder;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2}, Landroidx/media3/common/Format$Builder;->setCodecs(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Landroidx/media3/common/Format$Builder;->setInitializationData(Ljava/util/List;)Landroidx/media3/common/Format$Builder;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->output:Landroidx/media3/extractor/TrackOutput;

    .line 115
    .line 116
    .line 117
    invoke-interface {v0, p1}, Landroidx/media3/extractor/TrackOutput;->format(Landroidx/media3/common/Format;)V

    .line 118
    :cond_2
    const/4 p1, 0x1

    .line 119
    .line 120
    iput-boolean p1, p0, Landroidx/media3/extractor/ts/MpeghReader;->configFound:Z

    .line 121
    return-void
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

.method private parseHeader()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBits:Landroidx/media3/common/util/ParsableBitArray;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2, v0}, Landroidx/media3/common/util/ParsableBitArray;->reset([BI)V

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBits:Landroidx/media3/common/util/ParsableBitArray;

    .line 20
    .line 21
    iget-object v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Landroidx/media3/extractor/ts/MpeghUtil;->parseMhasPacketHeader(Landroidx/media3/common/util/ParsableBitArray;Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    iput v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->payloadBytesRead:I

    .line 31
    .line 32
    iget v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->frameBytes:I

    .line 33
    .line 34
    iget-object v3, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 35
    .line 36
    iget v3, v3, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;->packetLength:I

    .line 37
    add-int/2addr v3, v0

    .line 38
    add-int/2addr v2, v3

    .line 39
    .line 40
    iput v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->frameBytes:I

    .line 41
    :cond_0
    return v1
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

.method private shouldParsePacket(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    :goto_0
    return v0
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

.method private skipToNextSync(Landroidx/media3/common/util/ParsableByteArray;)Z
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->flags:I

    .line 3
    .line 4
    and-int/lit8 v1, v0, 0x2

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 15
    return v2

    .line 16
    .line 17
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 24
    move-result v0

    .line 25
    .line 26
    if-lez v0, :cond_2

    .line 27
    .line 28
    iget v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->syncBytes:I

    .line 29
    .line 30
    shl-int/lit8 v0, v0, 0x8

    .line 31
    .line 32
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->syncBytes:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedByte()I

    .line 36
    move-result v3

    .line 37
    or-int/2addr v0, v3

    .line 38
    .line 39
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->syncBytes:I

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Landroidx/media3/extractor/ts/MpeghUtil;->isSyncWord(I)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->getPosition()I

    .line 49
    move-result v0

    .line 50
    .line 51
    add-int/lit8 v0, v0, -0x3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 55
    .line 56
    iput v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->syncBytes:I

    .line 57
    return v1

    .line 58
    :cond_2
    return v2

    .line 59
    :cond_3
    return v1
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

.method private writeSampleData(Landroidx/media3/common/util/ParsableByteArray;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 7
    .line 8
    iget v1, v1, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;->packetLength:I

    .line 9
    .line 10
    iget v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->payloadBytesRead:I

    .line 11
    sub-int/2addr v1, v2

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->output:Landroidx/media3/extractor/TrackOutput;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, p1, v0}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 21
    .line 22
    iget p1, p0, Landroidx/media3/extractor/ts/MpeghReader;->payloadBytesRead:I

    .line 23
    add-int/2addr p1, v0

    .line 24
    .line 25
    iput p1, p0, Landroidx/media3/extractor/ts/MpeghReader;->payloadBytesRead:I

    .line 26
    return-void
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


# virtual methods
.method public consume(Landroidx/media3/common/util/ParsableByteArray;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/media3/common/ParserException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->output:Landroidx/media3/extractor/TrackOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-lez v0, :cond_a

    .line 12
    .line 13
    iget v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->state:I

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    if-eqz v0, :cond_9

    .line 17
    const/4 v2, 0x2

    .line 18
    .line 19
    if-eq v0, v1, :cond_6

    .line 20
    .line 21
    if-ne v0, v2, :cond_5

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 24
    .line 25
    iget v0, v0, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;->packetType:I

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0}, Landroidx/media3/extractor/ts/MpeghReader;->shouldParsePacket(I)Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, p1, v0, v1}, Landroidx/media3/extractor/ts/MpeghReader;->copyData(Landroidx/media3/common/util/ParsableByteArray;Landroidx/media3/common/util/ParsableByteArray;Z)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-direct {p0, p1}, Landroidx/media3/extractor/ts/MpeghReader;->writeSampleData(Landroidx/media3/common/util/ParsableByteArray;)V

    .line 40
    .line 41
    iget v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->payloadBytesRead:I

    .line 42
    .line 43
    iget-object v3, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 44
    .line 45
    iget v4, v3, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;->packetLength:I

    .line 46
    .line 47
    if-ne v0, v4, :cond_0

    .line 48
    .line 49
    iget v0, v3, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;->packetType:I

    .line 50
    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    new-instance v0, Landroidx/media3/common/util/ParsableBitArray;

    .line 54
    .line 55
    iget-object v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 59
    move-result-object v2

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;-><init>([B)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, v0}, Landroidx/media3/extractor/ts/MpeghReader;->parseConfig(Landroidx/media3/common/util/ParsableBitArray;)V

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_2
    const/16 v3, 0x11

    .line 69
    .line 70
    if-ne v0, v3, :cond_3

    .line 71
    .line 72
    new-instance v0, Landroidx/media3/common/util/ParsableBitArray;

    .line 73
    .line 74
    iget-object v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 78
    move-result-object v2

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v2}, Landroidx/media3/common/util/ParsableBitArray;-><init>([B)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Landroidx/media3/extractor/ts/MpeghUtil;->parseAudioTruncationInfo(Landroidx/media3/common/util/ParsableBitArray;)I

    .line 85
    move-result v0

    .line 86
    .line 87
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->truncationSamples:I

    .line 88
    goto :goto_1

    .line 89
    .line 90
    :cond_3
    if-ne v0, v2, :cond_4

    .line 91
    .line 92
    .line 93
    invoke-direct {p0}, Landroidx/media3/extractor/ts/MpeghReader;->finalizeFrame()V

    .line 94
    .line 95
    :cond_4
    :goto_1
    iput v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->state:I

    .line 96
    goto :goto_0

    .line 97
    .line 98
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    .line 101
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 102
    throw p1

    .line 103
    .line 104
    :cond_6
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 105
    const/4 v3, 0x0

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, p1, v0, v3}, Landroidx/media3/extractor/ts/MpeghReader;->copyData(Landroidx/media3/common/util/ParsableByteArray;Landroidx/media3/common/util/ParsableByteArray;Z)V

    .line 109
    .line 110
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->bytesLeft()I

    .line 114
    move-result v0

    .line 115
    .line 116
    if-nez v0, :cond_8

    .line 117
    .line 118
    .line 119
    invoke-direct {p0}, Landroidx/media3/extractor/ts/MpeghReader;->parseHeader()Z

    .line 120
    move-result v0

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 128
    .line 129
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->output:Landroidx/media3/extractor/TrackOutput;

    .line 130
    .line 131
    iget-object v3, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 135
    move-result v4

    .line 136
    .line 137
    .line 138
    invoke-interface {v0, v3, v4}, Landroidx/media3/extractor/TrackOutput;->sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V

    .line 139
    .line 140
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 144
    .line 145
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 146
    .line 147
    iget-object v3, p0, Landroidx/media3/extractor/ts/MpeghReader;->header:Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;

    .line 148
    .line 149
    iget v3, v3, Landroidx/media3/extractor/ts/MpeghUtil$MhasPacketHeader;->packetLength:I

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v3}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 153
    .line 154
    iput-boolean v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerDataFinished:Z

    .line 155
    .line 156
    iput v2, p0, Landroidx/media3/extractor/ts/MpeghReader;->state:I

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_7
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 164
    move-result v0

    .line 165
    .line 166
    const/16 v2, 0xf

    .line 167
    .line 168
    if-ge v0, v2, :cond_0

    .line 169
    .line 170
    iget-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/media3/common/util/ParsableByteArray;->limit()I

    .line 174
    move-result v2

    .line 175
    add-int/2addr v2, v1

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableByteArray;->setLimit(I)V

    .line 179
    .line 180
    iput-boolean v3, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerDataFinished:Z

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_8
    iput-boolean v3, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerDataFinished:Z

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    .line 189
    :cond_9
    invoke-direct {p0, p1}, Landroidx/media3/extractor/ts/MpeghReader;->skipToNextSync(Landroidx/media3/common/util/ParsableByteArray;)Z

    .line 190
    move-result v0

    .line 191
    .line 192
    if-eqz v0, :cond_0

    .line 193
    .line 194
    iput v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->state:I

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    :cond_a
    return-void
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

.method public createTracks(Landroidx/media3/extractor/ExtractorOutput;Landroidx/media3/extractor/ts/TsPayloadReader$TrackIdGenerator;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/media3/extractor/ts/TsPayloadReader$TrackIdGenerator;->generateNewId()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroidx/media3/extractor/ts/TsPayloadReader$TrackIdGenerator;->getFormatId()Ljava/lang/String;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->formatId:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Landroidx/media3/extractor/ts/TsPayloadReader$TrackIdGenerator;->getTrackId()I

    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p2, v0}, Landroidx/media3/extractor/ExtractorOutput;->track(II)Landroidx/media3/extractor/TrackOutput;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/media3/extractor/ts/MpeghReader;->output:Landroidx/media3/extractor/TrackOutput;

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

.method public packetFinished(Z)V
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
.end method

.method public packetStarted(JI)V
    .locals 2

    .line 1
    .line 2
    iput p3, p0, Landroidx/media3/extractor/ts/MpeghReader;->flags:I

    .line 3
    .line 4
    iget-boolean p3, p0, Landroidx/media3/extractor/ts/MpeghReader;->rapPending:Z

    .line 5
    .line 6
    if-nez p3, :cond_1

    .line 7
    .line 8
    iget p3, p0, Landroidx/media3/extractor/ts/MpeghReader;->frameBytes:I

    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    iget-boolean p3, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerDataFinished:Z

    .line 13
    .line 14
    if-nez p3, :cond_1

    .line 15
    :cond_0
    const/4 p3, 0x1

    .line 16
    .line 17
    iput-boolean p3, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataPending:Z

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    cmp-long p3, p1, v0

    .line 25
    .line 26
    if-eqz p3, :cond_3

    .line 27
    .line 28
    iget-boolean p3, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataPending:Z

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    long-to-double p1, p1

    .line 32
    .line 33
    iput-wide p1, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUsPending:D

    .line 34
    return-void

    .line 35
    :cond_2
    long-to-double p1, p1

    .line 36
    .line 37
    iput-wide p1, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUs:D

    .line 38
    :cond_3
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public seek()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->state:I

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->syncBytes:I

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerScratchBytes:Landroidx/media3/common/util/ParsableByteArray;

    .line 8
    const/4 v2, 0x2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 12
    .line 13
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->payloadBytesRead:I

    .line 14
    .line 15
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->frameBytes:I

    .line 16
    .line 17
    .line 18
    const v1, -0x7fffffff

    .line 19
    .line 20
    iput v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->samplingRate:I

    .line 21
    const/4 v1, -0x1

    .line 22
    .line 23
    iput v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->standardFrameLength:I

    .line 24
    .line 25
    iput v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->truncationSamples:I

    .line 26
    .line 27
    const-wide/16 v1, -0x1

    .line 28
    .line 29
    iput-wide v1, p0, Landroidx/media3/extractor/ts/MpeghReader;->mainStreamLabel:J

    .line 30
    .line 31
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->configFound:Z

    .line 32
    .line 33
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->dataPending:Z

    .line 34
    const/4 v0, 0x1

    .line 35
    .line 36
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->headerDataFinished:Z

    .line 37
    .line 38
    iput-boolean v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->rapPending:Z

    .line 39
    .line 40
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 41
    .line 42
    iput-wide v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUs:D

    .line 43
    .line 44
    iput-wide v0, p0, Landroidx/media3/extractor/ts/MpeghReader;->timeUsPending:D

    .line 45
    return-void
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
