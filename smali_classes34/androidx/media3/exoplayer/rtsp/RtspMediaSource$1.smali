.class Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;
.super Ljava/lang/Object;
.source "RtspMediaSource.java"

# interfaces
.implements Landroidx/media3/exoplayer/rtsp/RtspMediaPeriod$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->createPeriod(Landroidx/media3/exoplayer/source/MediaSource$MediaPeriodId;Landroidx/media3/exoplayer/upstream/Allocator;J)Landroidx/media3/exoplayer/source/MediaPeriod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onSeekingUnsupported()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->access$102(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;Z)Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->access$400(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public onSourceInfoRefreshed(Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->getDurationMs()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Landroidx/media3/common/util/Util;->msToUs(J)J

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->access$002(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;J)J

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->isLive()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    xor-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->access$102(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;Z)Z

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/media3/exoplayer/rtsp/RtspSessionTiming;->isLive()Z

    .line 30
    move-result p1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->access$202(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;Z)Z

    .line 34
    .line 35
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 36
    const/4 v0, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->access$302(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;Z)Z

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$1;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMediaSource;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource;->access$400(Landroidx/media3/exoplayer/rtsp/RtspMediaSource;)V

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
.end method
