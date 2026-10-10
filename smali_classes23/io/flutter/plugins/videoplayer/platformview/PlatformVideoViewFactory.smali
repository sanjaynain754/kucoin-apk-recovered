.class public Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory;
.super Lio/flutter/plugin/platform/PlatformViewFactory;
.source "PlatformVideoViewFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;
    }
.end annotation


# instance fields
.field private final videoPlayerProvider:Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;)V
    .locals 1
    .param p1    # Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lio/flutter/plugins/videoplayer/Messages$AndroidVideoPlayerApi;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/PlatformViewFactory;-><init>(Lio/flutter/plugin/common/MessageCodec;)V

    .line 8
    .line 9
    iput-object p1, p0, Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory;->videoPlayerProvider:Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;

    .line 10
    return-void
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
.end method


# virtual methods
.method public create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/PlatformView;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    check-cast p3, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoViewCreationParams;

    .line 3
    .line 4
    .line 5
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Lio/flutter/plugins/videoplayer/Messages$PlatformVideoViewCreationParams;->getPlayerId()Ljava/lang/Long;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    iget-object p3, p0, Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory;->videoPlayerProvider:Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;

    .line 12
    .line 13
    .line 14
    invoke-interface {p3, p2}, Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;->getVideoPlayer(Ljava/lang/Long;)Lio/flutter/plugins/videoplayer/VideoPlayer;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lio/flutter/plugins/videoplayer/VideoPlayer;->getExoPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    new-instance p3, Lio/flutter/plugins/videoplayer/platformview/PlatformVideoView;

    .line 22
    .line 23
    .line 24
    invoke-direct {p3, p1, p2}, Lio/flutter/plugins/videoplayer/platformview/PlatformVideoView;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/ExoPlayer;)V

    .line 25
    return-object p3
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
