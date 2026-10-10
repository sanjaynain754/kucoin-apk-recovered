.class public Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "FFmpegMediaRetriever"


# instance fields
.field private final mIsUseMediaExtractor:Z

.field private mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

.field private mPath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mIsUseMediaExtractor:Z

    return-void
.end method

.method private getMediaInfoFromMediaExtractor(Ljava/lang/String;)Lcom/tencent/ugc/retriver/VideoMetaData;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/ugc/MediaExtractorWrapper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/MediaExtractorWrapper;->setDataSource(Ljava/lang/String;)Z

    .line 9
    move-result p1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    new-instance p1, Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1}, Lcom/tencent/ugc/retriver/VideoMetaData;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getWidth()I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/retriver/VideoMetaData;->setWidth(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getHeight()I

    .line 29
    move-result v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/retriver/VideoMetaData;->setHeight(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getVideoDuration()J

    .line 36
    move-result-wide v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1, v2}, Lcom/tencent/ugc/retriver/VideoMetaData;->setVideoDuration(J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getAudioDuration()J

    .line 43
    move-result-wide v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1, v2}, Lcom/tencent/ugc/retriver/VideoMetaData;->setAudioDuration(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getVideoFrameRate()I

    .line 50
    move-result v1

    .line 51
    int-to-float v1, v1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/retriver/VideoMetaData;->setFps(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getVideoMimeType()Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/retriver/VideoMetaData;->setVideoMimeType(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getChannelCount()I

    .line 65
    move-result v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/retriver/VideoMetaData;->setChannels(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getSampleRate()I

    .line 72
    move-result v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/retriver/VideoMetaData;->setSampleRate(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getAudioBitrate()I

    .line 79
    move-result v1

    .line 80
    int-to-long v1, v1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v2}, Lcom/tencent/ugc/retriver/VideoMetaData;->setAudioBitrate(J)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->getVideoBitrate()I

    .line 87
    move-result v1

    .line 88
    int-to-long v1, v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v1, v2}, Lcom/tencent/ugc/retriver/VideoMetaData;->setVideoBitrate(J)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/tencent/ugc/MediaExtractorWrapper;->release()V

    .line 95
    return-object p1
.end method

.method private static native nativeGetMediaInfo(Ljava/lang/String;)Lcom/tencent/ugc/retriver/VideoMetaData;
.end method


# virtual methods
.method public getAudioBitrate()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getAudioBitrate()J

    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    return-wide v0
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
.end method

.method public getAudioDurationMs()J
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getAudioDuration()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const-wide/16 v2, 0x3e8

    .line 11
    div-long/2addr v0, v2

    .line 12
    return-wide v0

    .line 13
    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    return-wide v0
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
.end method

.method public getChannels()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getChannels()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public getFPS()F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getFps()F

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public getFileMetaData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getFileMetaData()Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
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
.end method

.method public getRotation()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getRotation()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public getSampleRate()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getSampleRate()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public getVideoBitrate()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getVideoBitrate()J

    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0x0

    .line 12
    return-wide v0
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
.end method

.method public getVideoDurationMs()J
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getVideoDuration()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const-wide/16 v2, 0x3e8

    .line 11
    div-long/2addr v0, v2

    .line 12
    return-wide v0

    .line 13
    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    return-wide v0
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
.end method

.method public getVideoHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getHeight()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public getVideoMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getVideoMimeType()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
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
.end method

.method public getVideoWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/retriver/VideoMetaData;->getWidth()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public setDataSource(Ljava/lang/String;)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    const-string v1, "FFmpegMediaRetriever"

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p1, "path can\'t be null!"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    return v0

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mPath:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    return v3

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-static {p1}, Lcom/tencent/ugc/common/MediaExtractorBuilder;->isContentUri(Ljava/lang/String;)Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lcom/tencent/liteav/base/util/f;->a(Ljava/lang/String;)Z

    .line 31
    move-result v2

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    const-string p1, "file isn\'t exists!"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    return v0

    .line 40
    .line 41
    :cond_2
    iput-object p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mPath:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->nativeGetMediaInfo(Ljava/lang/String;)Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    iput-object p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 48
    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v2, "nativeGetMediaInfo media info = "

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    iget-object v2, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    iget-object p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 69
    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    iget-boolean p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mIsUseMediaExtractor:Z

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    iget-object p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mPath:Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, p1}, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->getMediaInfoFromMediaExtractor(Ljava/lang/String;)Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    iput-object p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 83
    .line 84
    :cond_3
    iget-object p1, p0, Lcom/tencent/ugc/retriver/FFmpegMediaRetriever;->mMediaInfo:Lcom/tencent/ugc/retriver/VideoMetaData;

    .line 85
    .line 86
    if-nez p1, :cond_4

    .line 87
    return v0

    .line 88
    :cond_4
    return v3
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method
