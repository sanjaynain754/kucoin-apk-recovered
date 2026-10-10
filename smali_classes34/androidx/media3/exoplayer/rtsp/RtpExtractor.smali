.class final Landroidx/media3/exoplayer/rtsp/RtpExtractor;
.super Ljava/lang/Object;
.source "RtpExtractor.java"

# interfaces
.implements Landroidx/media3/extractor/Extractor;


# instance fields
.field private firstPacketRead:Z

.field private volatile firstSequenceNumber:I

.field private volatile firstTimestamp:J

.field private isSeekPending:Z
    .annotation build Landroidx/annotation/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;

.field private nextRtpTimestamp:J
    .annotation build Landroidx/annotation/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private output:Landroidx/media3/extractor/ExtractorOutput;

.field private final payloadReader:Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

.field private playbackStartTimeUs:J
    .annotation build Landroidx/annotation/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private final reorderingQueue:Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;

.field private final rtpPacketDataBuffer:Landroidx/media3/common/util/ParsableByteArray;

.field private final rtpPacketScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

.field private final trackId:I


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->trackId:I

    .line 6
    .line 7
    new-instance p2, Landroidx/media3/exoplayer/rtsp/reader/DefaultRtpPayloadReaderFactory;

    .line 8
    .line 9
    .line 10
    invoke-direct {p2}, Landroidx/media3/exoplayer/rtsp/reader/DefaultRtpPayloadReaderFactory;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/rtsp/reader/DefaultRtpPayloadReaderFactory;->createPayloadReader(Landroidx/media3/exoplayer/rtsp/RtpPayloadFormat;)Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

    .line 21
    .line 22
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->payloadReader:Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

    .line 23
    .line 24
    new-instance p1, Landroidx/media3/common/util/ParsableByteArray;

    .line 25
    .line 26
    .line 27
    const p2, 0xffe3

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, p2}, Landroidx/media3/common/util/ParsableByteArray;-><init>(I)V

    .line 31
    .line 32
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 33
    .line 34
    new-instance p1, Landroidx/media3/common/util/ParsableByteArray;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1}, Landroidx/media3/common/util/ParsableByteArray;-><init>()V

    .line 38
    .line 39
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketDataBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 40
    .line 41
    new-instance p1, Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->lock:Ljava/lang/Object;

    .line 47
    .line 48
    new-instance p1, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;

    .line 49
    .line 50
    .line 51
    invoke-direct {p1}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;-><init>()V

    .line 52
    .line 53
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->reorderingQueue:Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstTimestamp:J

    .line 61
    const/4 v0, -0x1

    .line 62
    .line 63
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstSequenceNumber:I

    .line 64
    .line 65
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->nextRtpTimestamp:J

    .line 66
    .line 67
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->playbackStartTimeUs:J

    .line 68
    return-void
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

.method private static getCutoffTimeMs(J)J
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x1e

    .line 3
    sub-long/2addr p0, v0

    .line 4
    return-wide p0
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


# virtual methods
.method public hasReadFirstRtpPacket()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstPacketRead:Z

    .line 3
    return v0
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
.end method

.method public init(Landroidx/media3/extractor/ExtractorOutput;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->payloadReader:Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

    .line 3
    .line 4
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->trackId:I

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, v1}, Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;->createTracks(Landroidx/media3/extractor/ExtractorOutput;I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Landroidx/media3/extractor/ExtractorOutput;->endTracks()V

    .line 11
    .line 12
    new-instance v0, Landroidx/media3/extractor/SeekMap$Unseekable;

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Landroidx/media3/extractor/SeekMap$Unseekable;-><init>(J)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Landroidx/media3/extractor/ExtractorOutput;->seekMap(Landroidx/media3/extractor/SeekMap;)V

    .line 24
    .line 25
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->output:Landroidx/media3/extractor/ExtractorOutput;

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

.method public preSeek()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->lock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    .line 6
    :try_start_0
    iput-boolean v1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->isSeekPending:Z

    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public read(Landroidx/media3/extractor/ExtractorInput;Landroidx/media3/extractor/PositionHolder;)I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->output:Landroidx/media3/extractor/ExtractorOutput;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    const v0, 0xffe3

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p2, v1, v0}, Landroidx/media3/extractor/ExtractorInput;->read([BII)I

    .line 19
    move-result p1

    .line 20
    const/4 p2, -0x1

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    return p2

    .line 24
    .line 25
    :cond_0
    if-nez p1, :cond_1

    .line 26
    return v1

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroidx/media3/common/util/ParsableByteArray;->setLimit(I)V

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketScratchBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->parse(Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/exoplayer/rtsp/RtpPacket;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    return v1

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 49
    move-result-wide v2

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->getCutoffTimeMs(J)J

    .line 53
    move-result-wide v4

    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->reorderingQueue:Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1, v2, v3}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->offer(Landroidx/media3/exoplayer/rtsp/RtpPacket;J)Z

    .line 59
    .line 60
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->reorderingQueue:Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v4, v5}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->poll(J)Landroidx/media3/exoplayer/rtsp/RtpPacket;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    if-nez p1, :cond_3

    .line 67
    return v1

    .line 68
    .line 69
    :cond_3
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstPacketRead:Z

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    iget-wide v6, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstTimestamp:J

    .line 79
    .line 80
    cmp-long v0, v6, v2

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    iget-wide v6, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->timestamp:J

    .line 85
    .line 86
    iput-wide v6, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstTimestamp:J

    .line 87
    .line 88
    :cond_4
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstSequenceNumber:I

    .line 89
    .line 90
    if-ne v0, p2, :cond_5

    .line 91
    .line 92
    iget p2, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->sequenceNumber:I

    .line 93
    .line 94
    iput p2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstSequenceNumber:I

    .line 95
    .line 96
    :cond_5
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->payloadReader:Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

    .line 97
    .line 98
    iget-wide v6, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstTimestamp:J

    .line 99
    .line 100
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstSequenceNumber:I

    .line 101
    .line 102
    .line 103
    invoke-interface {p2, v6, v7, v0}, Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;->onReceivingFirstPacket(JI)V

    .line 104
    const/4 p2, 0x1

    .line 105
    .line 106
    iput-boolean p2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstPacketRead:Z

    .line 107
    .line 108
    :cond_6
    iget-object p2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->lock:Ljava/lang/Object;

    .line 109
    monitor-enter p2

    .line 110
    .line 111
    :try_start_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->isSeekPending:Z

    .line 112
    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    iget-wide v4, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->nextRtpTimestamp:J

    .line 116
    .line 117
    cmp-long p1, v4, v2

    .line 118
    .line 119
    if-eqz p1, :cond_8

    .line 120
    .line 121
    iget-wide v4, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->playbackStartTimeUs:J

    .line 122
    .line 123
    cmp-long p1, v4, v2

    .line 124
    .line 125
    if-eqz p1, :cond_8

    .line 126
    .line 127
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->reorderingQueue:Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->reset()V

    .line 131
    .line 132
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->payloadReader:Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

    .line 133
    .line 134
    iget-wide v4, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->nextRtpTimestamp:J

    .line 135
    .line 136
    iget-wide v6, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->playbackStartTimeUs:J

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v4, v5, v6, v7}, Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;->seek(JJ)V

    .line 140
    .line 141
    iput-boolean v1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->isSeekPending:Z

    .line 142
    .line 143
    iput-wide v2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->nextRtpTimestamp:J

    .line 144
    .line 145
    iput-wide v2, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->playbackStartTimeUs:J

    .line 146
    goto :goto_0

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    move-object p1, v0

    .line 149
    goto :goto_1

    .line 150
    .line 151
    :cond_7
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketDataBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 152
    .line 153
    iget-object v2, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->payloadData:[B

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2}, Landroidx/media3/common/util/ParsableByteArray;->reset([B)V

    .line 157
    .line 158
    iget-object v6, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->payloadReader:Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;

    .line 159
    .line 160
    iget-object v7, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->rtpPacketDataBuffer:Landroidx/media3/common/util/ParsableByteArray;

    .line 161
    .line 162
    iget-wide v8, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->timestamp:J

    .line 163
    .line 164
    iget v10, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->sequenceNumber:I

    .line 165
    .line 166
    iget-boolean v11, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->marker:Z

    .line 167
    .line 168
    .line 169
    invoke-interface/range {v6 .. v11}, Landroidx/media3/exoplayer/rtsp/reader/RtpPayloadReader;->consume(Landroidx/media3/common/util/ParsableByteArray;JIZ)V

    .line 170
    .line 171
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->reorderingQueue:Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v4, v5}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->poll(J)Landroidx/media3/exoplayer/rtsp/RtpPacket;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    if-nez p1, :cond_7

    .line 178
    :cond_8
    :goto_0
    monitor-exit p2

    .line 179
    return v1

    .line 180
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    throw p1
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method public release()V
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
.end method

.method public seek(JJ)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->lock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->isSeekPending:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    iput-boolean v1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->isSeekPending:Z

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->nextRtpTimestamp:J

    .line 16
    .line 17
    iput-wide p3, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->playbackStartTimeUs:J

    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
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

.method public setFirstSequenceNumber(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstSequenceNumber:I

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
.end method

.method public setFirstTimestamp(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/RtpExtractor;->firstTimestamp:J

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
.end method

.method public sniff(Landroidx/media3/extractor/ExtractorInput;)Z
    .locals 1

    .line 1
    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 3
    .line 4
    const-string v0, "RTP packets are transmitted in a packet stream do not support sniffing."

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 8
    throw p1
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
