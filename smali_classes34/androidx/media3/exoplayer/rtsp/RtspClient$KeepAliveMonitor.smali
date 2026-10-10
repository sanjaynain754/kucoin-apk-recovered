.class final Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;
.super Ljava/lang/Object;
.source "RtspClient.java"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/rtsp/RtspClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "KeepAliveMonitor"
.end annotation


# instance fields
.field private final intervalMs:J

.field private isStarted:Z

.field private final keepAliveHandler:Landroid/os/Handler;

.field final synthetic this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtspClient;J)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-wide p2, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->intervalMs:J

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroidx/media3/common/util/Util;->createHandlerForCurrentLooper()Landroid/os/Handler;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->keepAliveHandler:Landroid/os/Handler;

    .line 14
    return-void
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


# virtual methods
.method public close()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->isStarted:Z

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->keepAliveHandler:Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9
    return-void
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

.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1100(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$1300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Landroid/net/Uri;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->this$0:Landroidx/media3/exoplayer/rtsp/RtspClient;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Landroidx/media3/exoplayer/rtsp/RtspClient;->access$300(Landroidx/media3/exoplayer/rtsp/RtspClient;)Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspClient$MessageSender;->sendOptionsRequest(Landroid/net/Uri;Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->keepAliveHandler:Landroid/os/Handler;

    .line 24
    .line 25
    iget-wide v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->intervalMs:J

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    return-void
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

.method public start()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->isStarted:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->isStarted:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->keepAliveHandler:Landroid/os/Handler;

    .line 11
    .line 12
    iget-wide v1, p0, Landroidx/media3/exoplayer/rtsp/RtspClient$KeepAliveMonitor;->intervalMs:J

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    return-void
    .line 17
    .line 18
.end method
