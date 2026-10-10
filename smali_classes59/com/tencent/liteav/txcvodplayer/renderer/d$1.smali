.class public final Lcom/tencent/liteav/txcvodplayer/renderer/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/renderer/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/txcvodplayer/renderer/d;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/renderer/d;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

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
    .line 24
    .line 25
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "VodRenderer"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "uninitialize VodRenderer"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/videoconsumer/renderer/u;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->c(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/videoconsumer/renderer/u;

    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/videoconsumer/renderer/u;->a(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Z)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->d(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/videoconsumer/renderer/u;

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->e(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->a()V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 45
    monitor-enter v0

    .line 46
    .line 47
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->f(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/base/util/CustomHandler;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->f(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/base/util/CustomHandler;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/CustomHandler;->quitLooper()V

    .line 63
    .line 64
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/renderer/d$1;->a:Lcom/tencent/liteav/txcvodplayer/renderer/d;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/renderer/d;->g(Lcom/tencent/liteav/txcvodplayer/renderer/d;)Lcom/tencent/liteav/base/util/CustomHandler;

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    monitor-exit v0

    .line 72
    return-void

    .line 73
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    throw v1
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
.end method
