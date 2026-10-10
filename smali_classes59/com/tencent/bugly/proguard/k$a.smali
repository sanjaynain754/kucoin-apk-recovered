.class public final Lcom/tencent/bugly/proguard/k$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final f:I = 0x64

.field public static final g:I = 0x72

.field public static final h:I = 0x71

.field public static final i:I = 0x9f

.field public static j:I = 0xa


# instance fields
.field public final b:Landroid/os/Handler$Callback;

.field public final c:Lcom/tencent/bugly/proguard/k;

.field public d:Z

.field public e:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method

.method public constructor <init>(Landroid/os/Handler$Callback;Lcom/tencent/bugly/proguard/k;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/k$a;->d:Z

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k$a;->e:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k$a;->b:Landroid/os/Handler$Callback;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/tencent/bugly/proguard/k$a;->c:Lcom/tencent/bugly/proguard/k;

    .line 14
    return-void
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
.end method


# virtual methods
.method public a()Landroid/os/Handler$Callback;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k$a;->b:Landroid/os/Handler$Callback;

    return-object v0
.end method

.method public final a(ZZZ)V
    .locals 0

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 2
    sget-object p1, Lcom/tencent/bugly/proguard/a0;->c:Lcom/tencent/bugly/proguard/a0;

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    .line 3
    sget-object p1, Lcom/tencent/bugly/proguard/a0;->d:Lcom/tencent/bugly/proguard/a0;

    goto :goto_1

    :cond_3
    if-eqz p3, :cond_4

    .line 4
    sget-object p1, Lcom/tencent/bugly/proguard/a0;->e:Lcom/tencent/bugly/proguard/a0;

    goto :goto_1

    .line 5
    :cond_4
    sget-object p1, Lcom/tencent/bugly/proguard/a0;->f:Lcom/tencent/bugly/proguard/a0;

    .line 6
    :goto_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/k$a;->c:Lcom/tencent/bugly/proguard/k;

    .line 7
    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/a0;)V

    return-void
.end method

.method public final a(Landroid/os/Message;)Z
    .locals 3

    .line 8
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverP()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v2, 0x9f

    if-ne v0, v2, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k$a;->b(Landroid/os/Message;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    .line 10
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x64

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final b()V
    .locals 4

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k$a;->e:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/k$a;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 8
    :try_start_0
    const-string v1, "android.app.servertransaction.ClientTransaction"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 9
    const-string v2, "getCallbacks"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/k$a;->e:Ljava/lang/reflect/Method;

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 11
    :catchall_0
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/k$a;->d:Z

    :cond_0
    return-void
.end method

.method public final b(Landroid/os/Message;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k$a;->b()V

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k$a;->e:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, ".LaunchActivityItem"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 6
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "RMonitor_launch_Hacker"

    const-string v3, "isLaunchActivity"

    invoke-virtual {v0, v2, v3, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return v1
.end method

.method public final c(Landroid/os/Message;)Z
    .locals 1

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    .line 4
    const/16 v0, 0x71

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
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

.method public final d(Landroid/os/Message;)Z
    .locals 1

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    .line 4
    const/16 v0, 0x72

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
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

.method public handleMessage(Landroid/os/Message;)Z
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lcom/tencent/bugly/proguard/k$a;->c:Lcom/tencent/bugly/proguard/k;

    .line 7
    .line 8
    iget-boolean v2, v2, Lcom/tencent/bugly/proguard/k;->b:Z

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget-object v2, v0, Lcom/tencent/bugly/proguard/k$a;->b:Landroid/os/Handler$Callback;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v2, v1}, Landroid/os/Handler$Callback;->handleMessage(Landroid/os/Message;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    return v4

    .line 24
    :cond_0
    return v3

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/k$a;->a(Landroid/os/Message;)Z

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/k$a;->d(Landroid/os/Message;)Z

    .line 32
    move-result v5

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/k$a;->c(Landroid/os/Message;)Z

    .line 36
    move-result v6

    .line 37
    .line 38
    sget v7, Lcom/tencent/bugly/proguard/k$a;->j:I

    .line 39
    .line 40
    if-lez v7, :cond_2

    .line 41
    sub-int/2addr v7, v4

    .line 42
    .line 43
    sput v7, Lcom/tencent/bugly/proguard/k$a;->j:I

    .line 44
    .line 45
    sget-object v7, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 46
    .line 47
    iget v8, v1, Landroid/os/Message;->what:I

    .line 48
    .line 49
    .line 50
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 51
    move-result-object v11

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 55
    move-result-object v13

    .line 56
    .line 57
    .line 58
    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 59
    move-result-object v15

    .line 60
    .line 61
    const-string v16, ", isLaunchBroadcastReceiver: "

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 65
    move-result-object v17

    .line 66
    .line 67
    const-string v9, "RMonitor_launch_Hacker"

    .line 68
    .line 69
    const-string v10, "handleMessage, msg.what: "

    .line 70
    .line 71
    const-string v12, ", isLaunchActivity: "

    .line 72
    .line 73
    const-string v14, ", isLaunchService: "

    .line 74
    .line 75
    .line 76
    filled-new-array/range {v9 .. v17}, [Ljava/lang/String;

    .line 77
    move-result-object v8

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v8}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 81
    .line 82
    :cond_2
    if-eqz v2, :cond_3

    .line 83
    .line 84
    iget-object v7, v0, Lcom/tencent/bugly/proguard/k$a;->c:Lcom/tencent/bugly/proguard/k;

    .line 85
    .line 86
    .line 87
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 88
    move-result-wide v8

    .line 89
    .line 90
    iput-wide v8, v7, Lcom/tencent/bugly/proguard/k;->c:J

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {v0, v2, v5, v6}, Lcom/tencent/bugly/proguard/k$a;->a(ZZZ)V

    .line 94
    .line 95
    iget-object v2, v0, Lcom/tencent/bugly/proguard/k$a;->b:Landroid/os/Handler$Callback;

    .line 96
    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-interface {v2, v1}, Landroid/os/Handler$Callback;->handleMessage(Landroid/os/Message;)Z

    .line 101
    move-result v1

    .line 102
    .line 103
    if-eqz v1, :cond_4

    .line 104
    return v4

    .line 105
    :cond_4
    return v3
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
.end method
