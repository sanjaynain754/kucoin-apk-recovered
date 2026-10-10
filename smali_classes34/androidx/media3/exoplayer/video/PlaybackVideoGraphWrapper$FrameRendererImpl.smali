.class final Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;
.super Ljava/lang/Object;
.source "PlaybackVideoGraphWrapper.java"

# interfaces
.implements Landroidx/media3/exoplayer/video/VideoFrameRenderControl$FrameRenderer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "FrameRendererImpl"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;-><init>(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V

    return-void
.end method


# virtual methods
.method public dropFrame()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;->onFrameDropped(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/PreviewingVideoGraph;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    check-cast v0, Landroidx/media3/common/PreviewingVideoGraph;

    .line 41
    .line 42
    const-wide/16 v1, -0x2

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1, v2}, Landroidx/media3/common/PreviewingVideoGraph;->renderOutputFrame(J)V

    .line 46
    return-void
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

.method public onVideoSizeChanged(Landroidx/media3/common/VideoSize;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 3
    .line 4
    new-instance v1, Landroidx/media3/common/Format$Builder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Landroidx/media3/common/Format$Builder;-><init>()V

    .line 8
    .line 9
    iget v2, p1, Landroidx/media3/common/VideoSize;->width:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setWidth(I)Landroidx/media3/common/Format$Builder;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    iget v2, p1, Landroidx/media3/common/VideoSize;->height:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setHeight(I)Landroidx/media3/common/Format$Builder;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    const-string/jumbo v2, "video/raw"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroidx/media3/common/Format$Builder;->setSampleMimeType(Ljava/lang/String;)Landroidx/media3/common/Format$Builder;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2102(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/Format;)Landroidx/media3/common/Format;

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    move-result v1

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    check-cast v1, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;

    .line 56
    .line 57
    iget-object v2, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v2, p1}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;->onVideoSizeChanged(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;Landroidx/media3/common/VideoSize;)V

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-void
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

.method public renderFrame(JJJZ)V
    .locals 7

    .line 1
    .line 2
    if-eqz p7, :cond_0

    .line 3
    .line 4
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 5
    .line 6
    .line 7
    invoke-static {p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2300(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroid/util/Pair;

    .line 8
    move-result-object p5

    .line 9
    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 13
    .line 14
    .line 15
    invoke-static {p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2200(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 16
    move-result-object p5

    .line 17
    .line 18
    .line 19
    invoke-virtual {p5}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object p5

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result p6

    .line 25
    .line 26
    if-eqz p6, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object p6

    .line 31
    .line 32
    check-cast p6, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;

    .line 33
    .line 34
    iget-object p7, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 35
    .line 36
    .line 37
    invoke-interface {p6, p7}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$Listener;->onFirstFrameRendered(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)V

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 41
    .line 42
    .line 43
    invoke-static {p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 44
    move-result-object p5

    .line 45
    .line 46
    if-eqz p5, :cond_2

    .line 47
    .line 48
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 49
    .line 50
    .line 51
    invoke-static {p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2100(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/Format;

    .line 52
    move-result-object p5

    .line 53
    .line 54
    if-nez p5, :cond_1

    .line 55
    .line 56
    new-instance p5, Landroidx/media3/common/Format$Builder;

    .line 57
    .line 58
    .line 59
    invoke-direct {p5}, Landroidx/media3/common/Format$Builder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p5}, Landroidx/media3/common/Format$Builder;->build()Landroidx/media3/common/Format;

    .line 63
    move-result-object p5

    .line 64
    :goto_1
    move-object v5, p5

    .line 65
    goto :goto_2

    .line 66
    .line 67
    :cond_1
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 68
    .line 69
    .line 70
    invoke-static {p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2100(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/Format;

    .line 71
    move-result-object p5

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :goto_2
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 75
    .line 76
    .line 77
    invoke-static {p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2400(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    iget-object p5, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 81
    .line 82
    .line 83
    invoke-static {p5}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2500(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/util/Clock;

    .line 84
    move-result-object p5

    .line 85
    .line 86
    .line 87
    invoke-interface {p5}, Landroidx/media3/common/util/Clock;->nanoTime()J

    .line 88
    move-result-wide v3

    .line 89
    const/4 v6, 0x0

    .line 90
    move-wide v1, p3

    .line 91
    .line 92
    .line 93
    invoke-interface/range {v0 .. v6}, Landroidx/media3/exoplayer/video/VideoFrameMetadataListener;->onVideoFrameAboutToBeRendered(JJLandroidx/media3/common/Format;Landroid/media/MediaFormat;)V

    .line 94
    .line 95
    :cond_2
    iget-object p3, p0, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper$FrameRendererImpl;->this$0:Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;

    .line 96
    .line 97
    .line 98
    invoke-static {p3}, Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;->access$2600(Landroidx/media3/exoplayer/video/PlaybackVideoGraphWrapper;)Landroidx/media3/common/PreviewingVideoGraph;

    .line 99
    move-result-object p3

    .line 100
    .line 101
    .line 102
    invoke-static {p3}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    move-result-object p3

    .line 104
    .line 105
    check-cast p3, Landroidx/media3/common/PreviewingVideoGraph;

    .line 106
    .line 107
    .line 108
    invoke-interface {p3, p1, p2}, Landroidx/media3/common/PreviewingVideoGraph;->renderOutputFrame(J)V

    .line 109
    return-void
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
.end method
