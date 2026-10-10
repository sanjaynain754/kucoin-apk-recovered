.class final Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannelFactory;
.super Ljava/lang/Object;
.source "UdpDataSourceRtpDataChannelFactory.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/RtpDataChannel$Factory;


# instance fields
.field private final socketTimeoutMs:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannelFactory;->socketTimeoutMs:J

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public createAndOpenDataChannel(I)Landroidx/media3/exoplayer/rtsp/RtpDataChannel;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance p1, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;

    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannelFactory;->socketTimeoutMs:J

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, v1}, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;-><init>(J)V

    .line 8
    .line 9
    new-instance v0, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;

    .line 10
    .line 11
    iget-wide v1, p0, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannelFactory;->socketTimeoutMs:J

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;-><init>(J)V

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtpUtils;->getIncomingRtpDataSpec(I)Landroidx/media3/datasource/DataSpec;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v2}, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;->open(Landroidx/media3/datasource/DataSpec;)J

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;->getLocalPort()I

    .line 26
    move-result v2

    .line 27
    .line 28
    rem-int/lit8 v3, v2, 0x2

    .line 29
    const/4 v4, 0x1

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    move v1, v4

    .line 33
    .line 34
    :cond_0
    if-eqz v1, :cond_1

    .line 35
    add-int/2addr v2, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    sub-int/2addr v2, v4

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v2}, Landroidx/media3/exoplayer/rtsp/RtpUtils;->getIncomingRtpDataSpec(I)Landroidx/media3/datasource/DataSpec;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;->open(Landroidx/media3/datasource/DataSpec;)J

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;->setRtcpChannel(Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;)V

    .line 50
    return-object p1

    .line 51
    :catch_0
    move-exception v1

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;->setRtcpChannel(Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    return-object v0

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-static {p1}, Landroidx/media3/datasource/DataSourceUtil;->closeQuietly(Landroidx/media3/datasource/DataSource;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Landroidx/media3/datasource/DataSourceUtil;->closeQuietly(Landroidx/media3/datasource/DataSource;)V

    .line 63
    throw v1
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

.method public createFallbackDataChannelFactory()Landroidx/media3/exoplayer/rtsp/RtpDataChannel$Factory;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroidx/media3/exoplayer/rtsp/TransferRtpDataChannelFactory;

    .line 3
    .line 4
    iget-wide v1, p0, Landroidx/media3/exoplayer/rtsp/UdpDataSourceRtpDataChannelFactory;->socketTimeoutMs:J

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/rtsp/TransferRtpDataChannelFactory;-><init>(J)V

    .line 8
    return-object v0
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
