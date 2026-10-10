.class final Landroidx/media3/exoplayer/hls/HlsSampleStream;
.super Ljava/lang/Object;
.source "HlsSampleStream.java"

# interfaces
.implements Landroidx/media3/exoplayer/source/SampleStream;


# instance fields
.field private sampleQueueIndex:I

.field private final sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

.field private final trackGroupIndex:I


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->trackGroupIndex:I

    .line 8
    const/4 p1, -0x1

    .line 9
    .line 10
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 11
    return-void
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

.method private hasValidSampleQueueIndex()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    const/4 v1, -0x3

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    const/4 v1, -0x2

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public bindSampleQueue()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 14
    .line 15
    iget v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->trackGroupIndex:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->bindSampleQueueToSampleStream(I)I

    .line 19
    move-result v0

    .line 20
    .line 21
    iput v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 22
    return-void
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

.method public isReady()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 3
    const/4 v1, -0x3

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/HlsSampleStream;->hasValidSampleQueueIndex()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 14
    .line 15
    iget v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->isReady(I)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x1

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

.method public maybeThrowError()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 3
    const/4 v1, -0x2

    .line 4
    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    const/4 v1, -0x1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->maybeThrowError()V

    .line 14
    return-void

    .line 15
    :cond_0
    const/4 v1, -0x3

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->maybeThrowError(I)V

    .line 23
    :cond_1
    return-void

    .line 24
    .line 25
    :cond_2
    new-instance v0, Landroidx/media3/exoplayer/hls/SampleQueueMappingException;

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->getTrackGroups()Landroidx/media3/exoplayer/source/TrackGroupArray;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    iget v2, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->trackGroupIndex:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/source/TrackGroupArray;->get(I)Landroidx/media3/common/TrackGroup;

    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroidx/media3/common/TrackGroup;->getFormat(I)Landroidx/media3/common/Format;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    iget-object v1, v1, Landroidx/media3/common/Format;->sampleMimeType:Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/hls/SampleQueueMappingException;-><init>(Ljava/lang/String;)V

    .line 48
    throw v0
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

.method public readData(Landroidx/media3/exoplayer/FormatHolder;Landroidx/media3/decoder/DecoderInputBuffer;I)I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 3
    const/4 v1, -0x3

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    const/4 p1, 0x4

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p1}, Landroidx/media3/decoder/Buffer;->addFlag(I)V

    .line 10
    const/4 p1, -0x4

    .line 11
    return p1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/HlsSampleStream;->hasValidSampleQueueIndex()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 20
    .line 21
    iget v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, p1, p2, p3}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->readData(ILandroidx/media3/exoplayer/FormatHolder;Landroidx/media3/decoder/DecoderInputBuffer;I)I

    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    return v1
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

.method public skipData(J)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/media3/exoplayer/hls/HlsSampleStream;->hasValidSampleQueueIndex()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 9
    .line 10
    iget v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1, p2}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->skipData(IJ)I

    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public unbindSampleQueue()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleStreamWrapper:Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;

    .line 8
    .line 9
    iget v2, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->trackGroupIndex:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/hls/HlsSampleStreamWrapper;->unbindSampleQueue(I)V

    .line 13
    .line 14
    iput v1, p0, Landroidx/media3/exoplayer/hls/HlsSampleStream;->sampleQueueIndex:I

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
.end method
