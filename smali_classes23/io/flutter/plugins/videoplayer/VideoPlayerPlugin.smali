.class public Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;
.super Ljava/lang/Object;
.source "VideoPlayerPlugin.java"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/plugins/videoplayer/Messages$AndroidVideoPlayerApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;,
        Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetFn;,
        Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetAndPackageName;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "VideoPlayerPlugin"


# instance fields
.field private flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

.field private nextPlayerIdentifier:J

.field private final sharedOptions:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

.field private final videoPlayers:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Lio/flutter/plugins/videoplayer/VideoPlayer;",
            ">;"
        }
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
    new-instance v0, Landroid/util/LongSparseArray;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 11
    .line 12
    new-instance v0, Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lio/flutter/plugins/videoplayer/VideoPlayerOptions;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->sharedOptions:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    .line 18
    .line 19
    const-wide/16 v0, 0x1

    .line 20
    .line 21
    iput-wide v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->nextPlayerIdentifier:J

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
    .line 78
    .line 79
    .line 80
.end method

.method private createEventChannel(J)Lio/flutter/plugin/common/EventChannel;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lio/flutter/plugin/common/EventChannel;

    .line 3
    .line 4
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 5
    .line 6
    iget-object v1, v1, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v3, "flutter.io/videoPlayer/videoEvents"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, p1}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 27
    return-object v0
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
.end method

.method private disposeAllPlayers()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lio/flutter/plugins/videoplayer/VideoPlayer;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lio/flutter/plugins/videoplayer/VideoPlayer;->dispose()V

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/util/LongSparseArray;->clear()V

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
    .line 78
    .line 79
    .line 80
.end method

.method public static synthetic g(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lio/flutter/plugins/videoplayer/Messages$VideoPlayerInstanceApi;->setUp(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugins/videoplayer/Messages$VideoPlayerInstanceApi;)V

    .line 5
    return-void
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
.end method

.method private getPlayer(J)Lio/flutter/plugins/videoplayer/VideoPlayer;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lio/flutter/plugins/videoplayer/VideoPlayer;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v1, "No player found with playerId <"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p1, ">"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iget-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/util/LongSparseArray;->size()I

    .line 38
    move-result p2

    .line 39
    .line 40
    if-nez p2, :cond_0

    .line 41
    .line 42
    new-instance p2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string p1, " and no active players created by the plugin."

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    .line 62
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    throw p2

    .line 64
    :cond_1
    return-object v0
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
.end method

.method private registerPlayerInstance(Lio/flutter/plugins/videoplayer/VideoPlayer;J)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 3
    .line 4
    iget-object v0, v0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

    .line 5
    .line 6
    .line 7
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lio/flutter/plugins/videoplayer/Messages$VideoPlayerInstanceApi;->setUp(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugins/videoplayer/Messages$VideoPlayerInstanceApi;)V

    .line 12
    .line 13
    new-instance v2, Lio/flutter/plugins/videoplayer/n;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v0, v1}, Lio/flutter/plugins/videoplayer/n;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v2}, Lio/flutter/plugins/videoplayer/VideoPlayer;->setDisposeHandler(Lio/flutter/plugins/videoplayer/VideoPlayer$DisposeHandler;)V

    .line 20
    .line 21
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2, p3, p1}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 25
    return-void
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
.end method

.method private videoAssetWithOptions(Lio/flutter/plugins/videoplayer/Messages$CreationOptions;)Lio/flutter/plugins/videoplayer/VideoAsset;
    .locals 4
    .param p1    # Lio/flutter/plugins/videoplayer/Messages$CreationOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->getUri()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "asset:"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lio/flutter/plugins/videoplayer/VideoAsset;->fromAssetUrl(Ljava/lang/String;)Lio/flutter/plugins/videoplayer/VideoAsset;

    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string/jumbo v1, "rtsp:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lio/flutter/plugins/videoplayer/VideoAsset;->fromRtspUrl(Ljava/lang/String;)Lio/flutter/plugins/videoplayer/VideoAsset;

    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    .line 33
    :cond_1
    sget-object v1, Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;->UNKNOWN:Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->getFormatHint()Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    sget-object v3, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$1;->$SwitchMap$io$flutter$plugins$videoplayer$Messages$PlatformVideoFormat:[I

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 45
    move-result v2

    .line 46
    .line 47
    aget v2, v3, v2

    .line 48
    const/4 v3, 0x1

    .line 49
    .line 50
    if-eq v2, v3, :cond_4

    .line 51
    const/4 v3, 0x2

    .line 52
    .line 53
    if-eq v2, v3, :cond_3

    .line 54
    const/4 v3, 0x3

    .line 55
    .line 56
    if-eq v2, v3, :cond_2

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_2
    sget-object v1, Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;->HTTP_LIVE:Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_3
    sget-object v1, Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;->DYNAMIC_ADAPTIVE:Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_4
    sget-object v1, Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;->SMOOTH:Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;

    .line 66
    .line 67
    .line 68
    :cond_5
    :goto_0
    invoke-virtual {p1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->getHttpHeaders()Ljava/util/Map;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->getUserAgent()Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1, v2, p1}, Lio/flutter/plugins/videoplayer/VideoAsset;->fromRemoteUrl(Ljava/lang/String;Lio/flutter/plugins/videoplayer/VideoAsset$StreamingFormat;Ljava/util/Map;Ljava/lang/String;)Lio/flutter/plugins/videoplayer/VideoAsset;

    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method


# virtual methods
.method public createForPlatformView(Lio/flutter/plugins/videoplayer/Messages$CreationOptions;)Ljava/lang/Long;
    .locals 5
    .param p1    # Lio/flutter/plugins/videoplayer/Messages$CreationOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoAssetWithOptions(Lio/flutter/plugins/videoplayer/Messages$CreationOptions;)Lio/flutter/plugins/videoplayer/VideoAsset;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-wide v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->nextPlayerIdentifier:J

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    add-long/2addr v2, v0

    .line 10
    .line 11
    iput-wide v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->nextPlayerIdentifier:J

    .line 12
    .line 13
    iget-object v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 14
    .line 15
    iget-object v2, v2, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->applicationContext:Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->createEventChannel(J)Lio/flutter/plugin/common/EventChannel;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-static {v3}, Lio/flutter/plugins/videoplayer/VideoPlayerEventCallbacks;->bindTo(Lio/flutter/plugin/common/EventChannel;)Lio/flutter/plugins/videoplayer/VideoPlayerEventCallbacks;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    iget-object v4, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->sharedOptions:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3, p1, v4}, Lio/flutter/plugins/videoplayer/platformview/PlatformViewVideoPlayer;->create(Landroid/content/Context;Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;Lio/flutter/plugins/videoplayer/VideoAsset;Lio/flutter/plugins/videoplayer/VideoPlayerOptions;)Lio/flutter/plugins/videoplayer/platformview/PlatformViewVideoPlayer;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p1, v0, v1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->registerPlayerInstance(Lio/flutter/plugins/videoplayer/VideoPlayer;J)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    move-result-object p1

    .line 37
    return-object p1
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
.end method

.method public createForTextureView(Lio/flutter/plugins/videoplayer/Messages$CreationOptions;)Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds;
    .locals 6
    .param p1    # Lio/flutter/plugins/videoplayer/Messages$CreationOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoAssetWithOptions(Lio/flutter/plugins/videoplayer/Messages$CreationOptions;)Lio/flutter/plugins/videoplayer/VideoAsset;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-wide v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->nextPlayerIdentifier:J

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    add-long/2addr v2, v0

    .line 10
    .line 11
    iput-wide v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->nextPlayerIdentifier:J

    .line 12
    .line 13
    iget-object v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 14
    .line 15
    iget-object v2, v2, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->textureRegistry:Lio/flutter/view/TextureRegistry;

    .line 16
    .line 17
    .line 18
    invoke-interface {v2}, Lio/flutter/view/TextureRegistry;->createSurfaceProducer()Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    iget-object v3, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 22
    .line 23
    iget-object v3, v3, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->applicationContext:Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0, v1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->createEventChannel(J)Lio/flutter/plugin/common/EventChannel;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {v4}, Lio/flutter/plugins/videoplayer/VideoPlayerEventCallbacks;->bindTo(Lio/flutter/plugin/common/EventChannel;)Lio/flutter/plugins/videoplayer/VideoPlayerEventCallbacks;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    iget-object v5, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->sharedOptions:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4, v2, p1, v5}, Lio/flutter/plugins/videoplayer/texture/TextureVideoPlayer;->create(Landroid/content/Context;Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;Lio/flutter/view/TextureRegistry$SurfaceProducer;Lio/flutter/plugins/videoplayer/VideoAsset;Lio/flutter/plugins/videoplayer/VideoPlayerOptions;)Lio/flutter/plugins/videoplayer/texture/TextureVideoPlayer;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1, v0, v1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->registerPlayerInstance(Lio/flutter/plugins/videoplayer/VideoPlayer;J)V

    .line 41
    .line 42
    new-instance p1, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds$Builder;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1}, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds$Builder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds$Builder;->setPlayerId(Ljava/lang/Long;)Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds$Builder;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-interface {v2}, Lio/flutter/view/TextureRegistry$TextureEntry;->id()J

    .line 57
    move-result-wide v0

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds$Builder;->setTextureId(Ljava/lang/Long;)Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds$Builder;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds$Builder;->build()Lio/flutter/plugins/videoplayer/Messages$TexturePlayerIds;

    .line 69
    move-result-object p1

    .line 70
    return-object p1
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public dispose(Ljava/lang/Long;)V
    .locals 3
    .param p1    # Ljava/lang/Long;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->getPlayer(J)Lio/flutter/plugins/videoplayer/VideoPlayer;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lio/flutter/plugins/videoplayer/VideoPlayer;->dispose()V

    .line 12
    .line 13
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 17
    move-result-wide v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->remove(J)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public getLookupKeyForAsset(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    iget-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 5
    .line 6
    iget-object p2, p2, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->keyForAsset:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetFn;

    .line 7
    .line 8
    .line 9
    invoke-interface {p2, p1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetFn;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 14
    .line 15
    iget-object v0, v0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->keyForAssetAndPackageName:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetAndPackageName;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetAndPackageName;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public initialize()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->disposeAllPlayers()V

    .line 4
    return-void
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
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 7
    .param p1    # Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lio/flutter/FlutterInjector;->instance()Lio/flutter/FlutterInjector;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/FlutterInjector;->flutterLoader()Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    .line 21
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    move-object v5, v4

    .line 23
    .line 24
    new-instance v4, Lio/flutter/plugins/videoplayer/o;

    .line 25
    .line 26
    .line 27
    invoke-direct {v4, v5}, Lio/flutter/plugins/videoplayer/o;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lio/flutter/FlutterInjector;->flutterLoader()Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    new-instance v5, Lio/flutter/plugins/videoplayer/p;

    .line 37
    .line 38
    .line 39
    invoke-direct {v5, v0}, Lio/flutter/plugins/videoplayer/p;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getTextureRegistry()Lio/flutter/view/TextureRegistry;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetFn;Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetAndPackageName;Lio/flutter/view/TextureRegistry;)V

    .line 47
    .line 48
    iput-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p0, v0}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->startListening(Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getPlatformViewRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    new-instance v0, Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory;

    .line 62
    .line 63
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->videoPlayers:Landroid/util/LongSparseArray;

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v2, Lio/flutter/plugins/videoplayer/q;

    .line 69
    .line 70
    .line 71
    invoke-direct {v2, v1}, Lio/flutter/plugins/videoplayer/q;-><init>(Landroid/util/LongSparseArray;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, v2}, Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory;-><init>(Lio/flutter/plugins/videoplayer/platformview/PlatformVideoViewFactory$VideoPlayerProvider;)V

    .line 75
    .line 76
    .line 77
    const-string/jumbo v1, "plugins.flutter.dev/video_player_android"

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v1, v0}, Lio/flutter/plugin/platform/PlatformViewRegistry;->registerViewFactory(Ljava/lang/String;Lio/flutter/plugin/platform/PlatformViewFactory;)Z

    .line 81
    return-void
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
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->disposeAllPlayers()V

    .line 4
    return-void
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
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2
    .param p1    # Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "VideoPlayerPlugin"

    .line 7
    .line 8
    const-string v1, "Detached from the engine before registering to it."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lio/flutter/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->stopListening(Lio/flutter/plugin/common/BinaryMessenger;)V

    .line 21
    const/4 p1, 0x0

    .line 22
    .line 23
    iput-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->flutterState:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->onDestroy()V

    .line 27
    return-void
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
.end method

.method public setMixWithOthers(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;->sharedOptions:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    move-result p1

    .line 7
    .line 8
    iput-boolean p1, v0, Lio/flutter/plugins/videoplayer/VideoPlayerOptions;->mixWithOthers:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
