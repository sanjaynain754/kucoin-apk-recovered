.class public final Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;
.super Landroid/os/Handler;
.source "RealTimeReporter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/log/realtime/RealTimeReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;",
        "Landroid/os/Handler;",
        "Landroid/os/Looper;",
        "looper",
        "<init>",
        "(Landroid/os/Looper;)V",
        "Landroid/os/Message;",
        "msg",
        "",
        "handleMessage",
        "(Landroid/os/Message;)V",
        "Logger-realtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 1
    .param p1    # Landroid/os/Looper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "looper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

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
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1    # Landroid/os/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "Logger::RealTimeReporter"

    .line 3
    .line 4
    const-string v1, "msg"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    :try_start_0
    iget v1, p1, Landroid/os/Message;->what:I

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    if-eq v1, v2, :cond_3

    .line 13
    const/4 v2, 0x2

    .line 14
    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    const/4 v3, 0x3

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    const/4 v2, 0x4

    .line 20
    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_0
    const-string v1, "\u6e05\u7a7a\u7f13\u5b58"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->b()Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->h()V

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_1
    const-string v1, "\u505c\u6b62\u4e0a\u62a5\u65e5\u5fd7,\u6e05\u7a7a\u7f13\u5b58"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->e()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->b()Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->l()V

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c()Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 67
    return-void

    .line 68
    .line 69
    :cond_2
    sget-object v1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->a:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->f(Lcom/kubi/sdk/log/realtime/RealTimeReporter;)V

    .line 73
    return-void

    .line 74
    .line 75
    :cond_3
    sget-object v1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->a:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 76
    .line 77
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 78
    .line 79
    const-string v3, "null cannot be cast to non-null type com.kubi.sdk.log.realtime.cache.LogCache.CacheDataWrapper"

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    check-cast v2, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->g(Lcom/kubi/sdk/log/realtime/RealTimeReporter;Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    return-void

    .line 89
    .line 90
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    const-string v3, "handleMessage exception, msg="

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    iget p1, p1, Landroid/os/Message;->what:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string p1, ": "

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-static {v0, p1}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    sget-object p1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->a:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->h(Lcom/kubi/sdk/log/realtime/RealTimeReporter;)V

    .line 124
    :cond_4
    :goto_1
    return-void
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
.end method
