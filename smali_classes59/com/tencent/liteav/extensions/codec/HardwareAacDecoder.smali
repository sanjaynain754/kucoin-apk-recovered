.class public Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 6
    .line 7
    sget v1, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper$a;->b:I

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;-><init>(I)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;->a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public decode(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;->a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;->processFrame(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public getCacheSize()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;->a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;->b:I

    .line 5
    return v0
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
.end method

.method public getOutputChannelCount()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;->a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;->a:Landroid/media/MediaFormat;

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    :cond_0
    :try_start_0
    const-string v2, "channel-count"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return v0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v2, "getOutputChannelCount failed. "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    new-array v2, v2, [Ljava/lang/Object;

    .line 30
    .line 31
    const-string v3, "HardwareAacDecoder"

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return v1
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
.end method

.method public getOutputSampleRate()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;->a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;->a:Landroid/media/MediaFormat;

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    :try_start_0
    const-string/jumbo v2, "sample-rate"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 15
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return v0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v2, "getOutputSampleRate failed. "

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    new-array v2, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    const-string v3, "HardwareAacDecoder"

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    return v1
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
.end method

.method public init(IILjava/nio/ByteBuffer;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "audio/mp4a-latm"

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1, p2}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    const-string/jumbo p2, "mime"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string p2, "csd-0"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2, p3}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 18
    .line 19
    iget-object p2, p0, Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;->a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;->a(Landroid/media/MediaFormat;)Z

    .line 23
    move-result p1

    .line 24
    return p1
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
.end method

.method public unInit()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/extensions/codec/HardwareAacDecoder;->a:Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/extensions/codec/AacMediaCodecWrapper;->a()V

    .line 6
    return-void
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
.end method
