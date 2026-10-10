.class final Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;
.super Ljava/lang/Object;
.source "RtpPacketReorderingQueue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;
    }
.end annotation


# static fields
.field static final MAX_SEQUENCE_LEAP_ALLOWED:I = 0x3e8
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field private static final QUEUE_SIZE_THRESHOLD_FOR_RESET:I = 0x1388


# instance fields
.field private lastDequeuedSequenceNumber:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private lastReceivedSequenceNumber:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final packetQueue:Ljava/util/TreeSet;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "this"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<",
            "Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;",
            ">;"
        }
    .end annotation
.end field

.field private started:Z
    .annotation build Landroidx/annotation/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/TreeSet;

    .line 6
    .line 7
    new-instance v1, Landroidx/media3/exoplayer/rtsp/b;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Landroidx/media3/exoplayer/rtsp/b;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->reset()V

    .line 19
    return-void
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
.end method

.method public static synthetic a(Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;)I
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;->packet:Landroidx/media3/exoplayer/rtsp/RtpPacket;

    .line 3
    .line 4
    iget p0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacket;->sequenceNumber:I

    .line 5
    .line 6
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;->packet:Landroidx/media3/exoplayer/rtsp/RtpPacket;

    .line 7
    .line 8
    iget p1, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->sequenceNumber:I

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->calculateSequenceNumberShift(II)I

    .line 12
    move-result p0

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

.method private declared-synchronized addToQueue(Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p1, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;->packet:Landroidx/media3/exoplayer/rtsp/RtpPacket;

    .line 4
    .line 5
    iget v0, v0, Landroidx/media3/exoplayer/rtsp/RtpPacket;->sequenceNumber:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastReceivedSequenceNumber:I

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static calculateSequenceNumberShift(II)I
    .locals 4

    .line 1
    .line 2
    sub-int v0, p0, p1

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 6
    move-result v1

    .line 7
    .line 8
    const/16 v2, 0x3e8

    .line 9
    .line 10
    if-le v1, v2, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 18
    move-result v3

    .line 19
    sub-int/2addr v1, v3

    .line 20
    .line 21
    .line 22
    const v3, 0xffff

    .line 23
    add-int/2addr v1, v3

    .line 24
    .line 25
    if-ge v1, v2, :cond_1

    .line 26
    .line 27
    if-ge p0, p1, :cond_0

    .line 28
    return v1

    .line 29
    :cond_0
    neg-int p0, v1

    .line 30
    return p0

    .line 31
    :cond_1
    return v0
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


# virtual methods
.method public declared-synchronized offer(Landroidx/media3/exoplayer/rtsp/RtpPacket;J)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    .line 7
    move-result v0

    .line 8
    .line 9
    const/16 v1, 0x1388

    .line 10
    .line 11
    if-ge v0, v1, :cond_3

    .line 12
    .line 13
    iget v0, p1, Landroidx/media3/exoplayer/rtsp/RtpPacket;->sequenceNumber:I

    .line 14
    .line 15
    iget-boolean v1, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->started:Z

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->reset()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getPreviousSequenceNumber(I)I

    .line 25
    move-result v0

    .line 26
    .line 27
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastDequeuedSequenceNumber:I

    .line 28
    .line 29
    iput-boolean v2, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->started:Z

    .line 30
    .line 31
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p1, p2, p3}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;-><init>(Landroidx/media3/exoplayer/rtsp/RtpPacket;J)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->addToQueue(Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit p0

    .line 39
    return v2

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_0
    :try_start_1
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastReceivedSequenceNumber:I

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getNextSequenceNumber(I)I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->calculateSequenceNumberShift(II)I

    .line 51
    move-result v1

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 55
    move-result v1

    .line 56
    .line 57
    const/16 v3, 0x3e8

    .line 58
    .line 59
    if-ge v1, v3, :cond_2

    .line 60
    .line 61
    iget v1, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastDequeuedSequenceNumber:I

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->calculateSequenceNumberShift(II)I

    .line 65
    move-result v0

    .line 66
    .line 67
    if-lez v0, :cond_1

    .line 68
    .line 69
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, p1, p2, p3}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;-><init>(Landroidx/media3/exoplayer/rtsp/RtpPacket;J)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->addToQueue(Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    monitor-exit p0

    .line 77
    return v2

    .line 78
    :cond_1
    monitor-exit p0

    .line 79
    const/4 p1, 0x0

    .line 80
    return p1

    .line 81
    .line 82
    .line 83
    :cond_2
    :try_start_2
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getPreviousSequenceNumber(I)I

    .line 84
    move-result v0

    .line 85
    .line 86
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastDequeuedSequenceNumber:I

    .line 87
    .line 88
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V

    .line 92
    .line 93
    new-instance v0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, p1, p2, p3}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;-><init>(Landroidx/media3/exoplayer/rtsp/RtpPacket;J)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->addToQueue(Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    monitor-exit p0

    .line 101
    return v2

    .line 102
    .line 103
    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    const-string p2, "Queue size limit of 5000 reached."

    .line 106
    .line 107
    .line 108
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    throw p1

    .line 110
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 111
    throw p1
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

.method public declared-synchronized poll(J)Landroidx/media3/exoplayer/rtsp/RtpPacket;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/TreeSet;->isEmpty()Z

    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    monitor-exit p0

    .line 12
    return-object v1

    .line 13
    .line 14
    :cond_0
    :try_start_1
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;

    .line 21
    .line 22
    iget-object v2, v0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;->packet:Landroidx/media3/exoplayer/rtsp/RtpPacket;

    .line 23
    .line 24
    iget v2, v2, Landroidx/media3/exoplayer/rtsp/RtpPacket;->sequenceNumber:I

    .line 25
    .line 26
    iget v3, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastDequeuedSequenceNumber:I

    .line 27
    .line 28
    .line 29
    invoke-static {v3}, Landroidx/media3/exoplayer/rtsp/RtpPacket;->getNextSequenceNumber(I)I

    .line 30
    move-result v3

    .line 31
    .line 32
    if-eq v2, v3, :cond_2

    .line 33
    .line 34
    iget-wide v3, v0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;->receivedTimestampMs:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    cmp-long p1, p1, v3

    .line 37
    .line 38
    if-ltz p1, :cond_1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    monitor-exit p0

    .line 41
    return-object v1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_2
    :goto_0
    :try_start_2
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/TreeSet;->pollFirst()Ljava/lang/Object;

    .line 49
    .line 50
    iput v2, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastDequeuedSequenceNumber:I

    .line 51
    .line 52
    iget-object p1, v0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue$RtpPacketContainer;->packet:Landroidx/media3/exoplayer/rtsp/RtpPacket;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    monitor-exit p0

    .line 54
    return-object p1

    .line 55
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 56
    throw p1
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

.method public declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->packetQueue:Ljava/util/TreeSet;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->started:Z

    .line 10
    const/4 v0, -0x1

    .line 11
    .line 12
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastDequeuedSequenceNumber:I

    .line 13
    .line 14
    iput v0, p0, Landroidx/media3/exoplayer/rtsp/RtpPacketReorderingQueue;->lastReceivedSequenceNumber:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
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
.end method
