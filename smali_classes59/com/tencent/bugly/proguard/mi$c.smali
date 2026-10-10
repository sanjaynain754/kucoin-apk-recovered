.class public final Lcom/tencent/bugly/proguard/mi$c;
.super Landroid/content/BroadcastReceiver;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/mi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/os/CancellationSignal;

.field public b:Landroid/os/Handler;

.field public c:Landroid/content/Context;

.field public final d:Lcom/tencent/bugly/proguard/pi$h;

.field public final e:J

.field public final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/tencent/bugly/proguard/mi$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/tencent/bugly/proguard/pi$h;J)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->f:Ljava/util/Set;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->c:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    .line 15
    .line 16
    iput-object p3, p0, Lcom/tencent/bugly/proguard/mi$c;->d:Lcom/tencent/bugly/proguard/pi$h;

    .line 17
    .line 18
    iput-wide p4, p0, Lcom/tencent/bugly/proguard/mi$c;->e:J

    .line 19
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 4

    monitor-enter p0

    .line 43
    :try_start_0
    const-string/jumbo v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 44
    invoke-virtual {v0}, Landroid/os/PowerManager;->isInteractive()Z

    move-result v0

    .line 45
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 46
    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 47
    const-string/jumbo v2, "status"

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    const/4 v2, 0x5

    if-ne p1, v2, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/mi$c;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Lcom/tencent/bugly/proguard/mi$d;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 2
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized a(ZZ)V
    .locals 10

    monitor-enter p0

    .line 3
    :try_start_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 4
    const-string v1, "Matrix.WarmUpScheduler"

    const-string v2, "Idle status changed: interactive = %s, charging = %s"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->d:Lcom/tencent/bugly/proguard/pi$h;

    sget-object v2, Lcom/tencent/bugly/proguard/pi$h;->b:Lcom/tencent/bugly/proguard/pi$h;

    if-eq p1, v2, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move p1, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    move p1, v0

    :goto_0
    const/4 p2, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eqz p1, :cond_9

    .line 6
    iget-object v4, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    if-nez v4, :cond_9

    .line 7
    new-instance p1, Landroid/os/CancellationSignal;

    invoke-direct {p1}, Landroid/os/CancellationSignal;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->f:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 9
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 10
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/mi$d;

    .line 11
    sget-object v4, Lcom/tencent/bugly/proguard/mi$b;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    const-wide/16 v4, 0x3e8

    if-eq v0, v1, :cond_7

    const-wide/16 v6, 0x3

    const-wide/16 v8, 0xbb8

    if-eq v0, v3, :cond_5

    if-eq v0, v2, :cond_4

    if-eq v0, p2, :cond_2

    goto :goto_1

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/oi;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    .line 14
    invoke-static {v0, p2, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 15
    invoke-virtual {v0, v4, v8, v9}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_2

    .line 16
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 17
    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Matrix.WarmUpScheduler"

    const-string v5, "System idle, trigger disk usage in %s seconds."

    invoke-static {v4, v5, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 18
    :cond_4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    iget-object v6, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    .line 19
    invoke-static {v0, v3, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    iget-wide v7, p0, Lcom/tencent/bugly/proguard/mi$c;->e:J

    .line 20
    invoke-virtual {v0, v6, v7, v8}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 21
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/mi$c;->e:J

    div-long/2addr v6, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Matrix.WarmUpScheduler"

    const-string v5, "System idle, trigger consume requested qut in %s seconds."

    invoke-static {v4, v5, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 22
    :cond_5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/oi;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 23
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    .line 24
    invoke-static {v0, v2, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 25
    invoke-virtual {v0, v4, v8, v9}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_3

    .line 26
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 27
    :goto_3
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Matrix.WarmUpScheduler"

    const-string v5, "System idle, trigger clean up in %s seconds."

    invoke-static {v4, v5, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 28
    :cond_7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->c:Landroid/content/Context;

    .line 29
    invoke-static {v0}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_8

    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    iget-object v6, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    .line 31
    invoke-static {v0, v1, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    iget-wide v7, p0, Lcom/tencent/bugly/proguard/mi$c;->e:J

    .line 32
    invoke-virtual {v0, v6, v7, v8}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 33
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/mi$c;->e:J

    div-long/2addr v6, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Matrix.WarmUpScheduler"

    const-string v5, "System idle, trigger warm up in %s seconds."

    invoke-static {v4, v5, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 34
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_1

    :cond_9
    if-nez p1, :cond_a

    .line 35
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    if-eqz p1, :cond_a

    .line 36
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 37
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    invoke-virtual {p1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 38
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 39
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->b:Landroid/os/Handler;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    .line 40
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    invoke-virtual {p1}, Landroid/os/CancellationSignal;->cancel()V

    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->a:Landroid/os/CancellationSignal;

    .line 42
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "Matrix.WarmUpScheduler"

    const-string v0, "Exit idle state, task cancelled."

    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    monitor-exit p0

    return-void

    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b(Lcom/tencent/bugly/proguard/mi$d;)I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi$c;->f:Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi$c;->f:Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 12
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    return-void

    .line 8
    :cond_0
    monitor-enter p0

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    move-result p2

    .line 13
    .line 14
    .line 15
    const v0, -0x7ed8ea7f

    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    if-eq p2, v0, :cond_4

    .line 21
    .line 22
    .line 23
    const v0, -0x7073f927

    .line 24
    .line 25
    if-eq p2, v0, :cond_3

    .line 26
    .line 27
    .line 28
    const v0, -0x56ac2893

    .line 29
    .line 30
    if-eq p2, v0, :cond_2

    .line 31
    .line 32
    .line 33
    const v0, 0x3cbf870b

    .line 34
    .line 35
    if-eq p2, v0, :cond_1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_1
    const-string p2, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    move p1, v1

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_2
    const-string p2, "android.intent.action.SCREEN_ON"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    move-result p1

    .line 55
    .line 56
    if-eqz p1, :cond_5

    .line 57
    move p1, v3

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_3
    const-string p2, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result p1

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    const/4 p1, 0x3

    .line 68
    goto :goto_1

    .line 69
    .line 70
    :cond_4
    const-string p2, "android.intent.action.SCREEN_OFF"

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    move-result p1

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    move p1, v2

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    :goto_0
    const/4 p1, -0x1

    .line 80
    .line 81
    :goto_1
    if-eqz p1, :cond_8

    .line 82
    .line 83
    if-eq p1, v2, :cond_6

    .line 84
    .line 85
    if-eq p1, v1, :cond_7

    .line 86
    :cond_6
    move v2, v3

    .line 87
    goto :goto_2

    .line 88
    :cond_7
    move v4, v3

    .line 89
    move v3, v2

    .line 90
    move v2, v4

    .line 91
    .line 92
    .line 93
    :cond_8
    :goto_2
    invoke-virtual {p0, v2, v3}, Lcom/tencent/bugly/proguard/mi$c;->a(ZZ)V

    .line 94
    monitor-exit p0

    .line 95
    return-void

    .line 96
    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw p1
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
.end method
