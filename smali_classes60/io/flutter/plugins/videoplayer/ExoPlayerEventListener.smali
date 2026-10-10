.class public abstract Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;
.super Ljava/lang/Object;
.source "ExoPlayerEventListener.java"

# interfaces
.implements Landroidx/media3/common/Player$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/videoplayer/ExoPlayerEventListener$RotationDegrees;
    }
.end annotation


# instance fields
.field protected final events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

.field protected final exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

.field private isBuffering:Z

.field private isInitialized:Z


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/ExoPlayer;Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;)V
    .locals 1
    .param p1    # Landroidx/media3/exoplayer/ExoPlayer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->isBuffering:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->isInitialized:Z

    .line 9
    .line 10
    iput-object p1, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    .line 11
    .line 12
    iput-object p2, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

    .line 13
    return-void
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
.end method

.method private setBuffering(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->isBuffering:Z

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->isBuffering:Z

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;->onBufferingStart()V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_1
    iget-object p1, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;->onBufferingEnd()V

    .line 21
    return-void
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
.end method


# virtual methods
.method public onIsPlayingChanged(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;->onIsPlayingStateUpdate(Z)V

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
.end method

.method public onPlaybackStateChanged(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    .line 4
    if-eq p1, v1, :cond_2

    .line 5
    const/4 v2, 0x3

    .line 6
    .line 7
    if-eq p1, v2, :cond_1

    .line 8
    const/4 v0, 0x4

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;->onCompleted()V

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_1
    iget-boolean v2, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->isInitialized:Z

    .line 20
    .line 21
    if-nez v2, :cond_3

    .line 22
    .line 23
    iput-boolean v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->isInitialized:Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->sendInitialized()V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-direct {p0, v0}, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->setBuffering(Z)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

    .line 33
    .line 34
    iget-object v2, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    .line 35
    .line 36
    .line 37
    invoke-interface {v2}, Landroidx/media3/common/Player;->getBufferedPosition()J

    .line 38
    move-result-wide v2

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v2, v3}, Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;->onBufferingUpdate(J)V

    .line 42
    .line 43
    :cond_3
    :goto_0
    if-eq p1, v1, :cond_4

    .line 44
    const/4 p1, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->setBuffering(Z)V

    .line 48
    :cond_4
    return-void
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

.method public onPlayerError(Landroidx/media3/common/PlaybackException;)V
    .locals 3
    .param p1    # Landroidx/media3/common/PlaybackException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->setBuffering(Z)V

    .line 5
    .line 6
    iget v0, p1, Landroidx/media3/common/PlaybackException;->errorCode:I

    .line 7
    .line 8
    const/16 v1, 0x3ea

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Landroidx/media3/common/Player;->seekToDefaultPosition()V

    .line 16
    .line 17
    iget-object p1, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->exoPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Landroidx/media3/common/Player;->prepare()V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/ExoPlayerEventListener;->events:Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    const-string v2, "Video player had error "

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    const/4 v1, 0x0

    .line 42
    .line 43
    const-string v2, "VideoError"

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2, p1, v1}, Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;->onError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    return-void
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

.method public abstract sendInitialized()V
.end method
