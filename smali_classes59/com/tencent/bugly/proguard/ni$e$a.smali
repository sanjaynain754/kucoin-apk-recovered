.class public Lcom/tencent/bugly/proguard/ni$e$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/ni$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/ni$e;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/ni$e;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

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
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 3
    .line 4
    new-instance v0, Landroid/os/Messenger;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 8
    .line 9
    iput-object v0, p1, Lcom/tencent/bugly/proguard/ni$e;->b:Landroid/os/Messenger;

    .line 10
    .line 11
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    .line 14
    monitor-enter p1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 17
    .line 18
    iget-object p2, p2, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x1

    .line 21
    .line 22
    aput-boolean v1, p2, v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 26
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string p2, "Matrix.WarmUpInvoker"

    .line 33
    .line 34
    const-string v0, "This remote invoker(%s) connected."

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p2

    .line 40
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p2
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
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    iput-object v0, p1, Lcom/tencent/bugly/proguard/ni$e;->b:Landroid/os/Messenger;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    .line 10
    monitor-enter p1

    .line 11
    .line 12
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/tencent/bugly/proguard/ni$e;->f:[Z

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    aput-boolean v2, v1, v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 21
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    .line 23
    .line 24
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    const-string v1, "Matrix.WarmUpInvoker"

    .line 28
    .line 29
    const-string v3, "This remote invoker(%s) disconnected."

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v3, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 35
    .line 36
    iget-object v1, p1, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    .line 37
    monitor-enter v1

    .line 38
    .line 39
    :try_start_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni$e$a;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ni$e;->c:[Landroid/os/Bundle;

    .line 42
    .line 43
    aput-object v0, p1, v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 47
    monitor-exit v1

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    throw v0
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
