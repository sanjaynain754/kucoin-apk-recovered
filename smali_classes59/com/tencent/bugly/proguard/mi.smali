.class public Lcom/tencent/bugly/proguard/mi;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/mi$d;,
        Lcom/tencent/bugly/proguard/mi$c;
    }
.end annotation


# static fields
.field public static final h:Ljava/lang/String; = "Matrix.WarmUpScheduler"

.field public static final i:J = 0xbb8L

.field public static final j:J = 0xbb8L

.field public static final k:J = 0xbb8L

.field public static final l:J = 0xbb8L

.field public static final m:I = 0x1

.field public static final n:I = 0x2

.field public static final o:I = 0x3

.field public static final p:I = 0x4


# instance fields
.field public b:Lcom/tencent/bugly/proguard/mi$c;

.field public c:Lcom/tencent/bugly/proguard/ji;

.field public d:Landroid/os/Handler;

.field public e:Landroid/content/Context;

.field public f:Lcom/tencent/bugly/proguard/pi$h;

.field public g:J


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ji;Landroid/content/Context;Lcom/tencent/bugly/proguard/pi$h;J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    .line 8
    .line 9
    iput-object p1, p0, Lcom/tencent/bugly/proguard/mi;->c:Lcom/tencent/bugly/proguard/ji;

    .line 10
    .line 11
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi;->d:Landroid/os/Handler;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    new-instance p1, Landroid/os/Handler;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 23
    .line 24
    iput-object p1, p0, Lcom/tencent/bugly/proguard/mi;->d:Landroid/os/Handler;

    .line 25
    .line 26
    :cond_0
    iput-object p2, p0, Lcom/tencent/bugly/proguard/mi;->e:Landroid/content/Context;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/tencent/bugly/proguard/mi;->f:Lcom/tencent/bugly/proguard/pi$h;

    .line 29
    .line 30
    const-wide/16 p1, 0xbb8

    .line 31
    .line 32
    .line 33
    invoke-static {p4, p5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 34
    move-result-wide p1

    .line 35
    .line 36
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    .line 37
    return-void
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
.method public final declared-synchronized a(Landroid/content/Context;Lcom/tencent/bugly/proguard/mi$d;)V
    .locals 7

    monitor-enter p0

    .line 14
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->b:Lcom/tencent/bugly/proguard/mi$c;

    if-nez v0, :cond_0

    .line 15
    new-instance v1, Lcom/tencent/bugly/proguard/mi$c;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/mi;->d:Landroid/os/Handler;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/mi;->f:Lcom/tencent/bugly/proguard/pi$h;

    iget-wide v5, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/tencent/bugly/proguard/mi$c;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/tencent/bugly/proguard/pi$h;J)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/mi;->b:Lcom/tencent/bugly/proguard/mi$c;

    .line 16
    invoke-virtual {v1, p2}, Lcom/tencent/bugly/proguard/mi$c;->a(Lcom/tencent/bugly/proguard/mi$d;)V

    const/4 p1, 0x0

    .line 17
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "Matrix.WarmUpScheduler"

    const-string v0, "Register idle receiver."

    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    .line 19
    const-string p2, "android.intent.action.SCREEN_ON"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 20
    const-string p2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 21
    const-string p2, "android.intent.action.ACTION_POWER_CONNECTED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 22
    const-string p2, "android.intent.action.ACTION_POWER_DISCONNECTED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 23
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mi;->b:Lcom/tencent/bugly/proguard/mi$c;

    invoke-virtual {v2, p2, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 24
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi;->b:Lcom/tencent/bugly/proguard/mi$c;

    invoke-virtual {p1, v2}, Lcom/tencent/bugly/proguard/mi$c;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    .line 25
    :cond_0
    :try_start_1
    invoke-virtual {v0, p2}, Lcom/tencent/bugly/proguard/mi$c;->a(Lcom/tencent/bugly/proguard/mi$d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final a(Lcom/tencent/bugly/proguard/mi$d;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/mi$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "Matrix.WarmUpScheduler"

    const-wide/16 v1, 0x3e8

    const/4 v3, 0x1

    if-eq p1, v3, :cond_2

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_1

    if-eq p1, v3, :cond_0

    return-void

    .line 2
    :cond_0
    iget-wide v5, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    div-long/2addr v5, v1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Schedule request consuming in %ss"

    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi;->d:Landroid/os/Handler;

    new-instance v0, Landroid/os/CancellationSignal;

    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    .line 4
    invoke-static {p1, v4, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    .line 5
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    .line 6
    :cond_1
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    div-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Schedule clean-up in %ss"

    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi;->d:Landroid/os/Handler;

    new-instance v0, Landroid/os/CancellationSignal;

    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    .line 8
    invoke-static {p1, v3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    .line 9
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    .line 10
    :cond_2
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    div-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Schedule warm-up in %ss"

    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    iget-object p1, p0, Lcom/tencent/bugly/proguard/mi;->d:Landroid/os/Handler;

    new-instance v0, Landroid/os/CancellationSignal;

    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    .line 12
    invoke-static {p1, v3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/mi;->g:J

    .line 13
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final declared-synchronized b(Landroid/content/Context;Lcom/tencent/bugly/proguard/mi$d;)V
    .locals 2

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->b:Lcom/tencent/bugly/proguard/mi$c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p2}, Lcom/tencent/bugly/proguard/mi$c;->b(Lcom/tencent/bugly/proguard/mi$d;)I

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 4
    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "Matrix.WarmUpScheduler"

    const-string v1, "Unregister idle receiver."

    invoke-static {v0, v1, p2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    iget-object p2, p0, Lcom/tencent/bugly/proguard/mi;->b:Lcom/tencent/bugly/proguard/mi$c;

    invoke-virtual {p1, p2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/tencent/bugly/proguard/mi;->b:Lcom/tencent/bugly/proguard/mi$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b(Lcom/tencent/bugly/proguard/mi$d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->d:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/bugly/proguard/mi$a;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/mi$a;-><init>(Lcom/tencent/bugly/proguard/mi;Lcom/tencent/bugly/proguard/mi$d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c(Lcom/tencent/bugly/proguard/mi$d;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/mi$b;->a:[I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/mi;->f:Lcom/tencent/bugly/proguard/pi$h;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v1

    .line 9
    .line 10
    aget v0, v0, v1

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    const/4 v1, 0x3

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->e:Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/mi;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/mi$d;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/mi;->a(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 30
    return-void
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
.end method

.method public d(Lcom/tencent/bugly/proguard/mi$d;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/mi$b;->a:[I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/mi;->f:Lcom/tencent/bugly/proguard/pi$h;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v1

    .line 9
    .line 10
    aget v0, v0, v1

    .line 11
    const/4 v1, 0x2

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    const/4 v1, 0x3

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->e:Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/mi;->b(Landroid/content/Context;Lcom/tencent/bugly/proguard/mi$d;)V

    .line 23
    return-void
    .line 24
    .line 25
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    .line 2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_3

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    const/4 v1, 0x3

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    const/4 v1, 0x4

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Landroid/os/CancellationSignal;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->c:Lcom/tencent/bugly/proguard/ji;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ji;->b(Landroid/os/CancellationSignal;)V

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Landroid/os/CancellationSignal;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->c:Lcom/tencent/bugly/proguard/ji;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ji;->a(Landroid/os/CancellationSignal;)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Landroid/os/CancellationSignal;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->c:Lcom/tencent/bugly/proguard/ji;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ji;->c(Landroid/os/CancellationSignal;)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroid/os/CancellationSignal;

    .line 50
    .line 51
    iget-object v0, p0, Lcom/tencent/bugly/proguard/mi;->c:Lcom/tencent/bugly/proguard/ji;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ji;->d(Landroid/os/CancellationSignal;)V

    .line 55
    :goto_0
    const/4 p1, 0x0

    .line 56
    return p1
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
.end method
