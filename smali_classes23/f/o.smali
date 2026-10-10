.class public abstract Lf/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lg/e;

.field public b:Ljava/util/concurrent/ExecutorService;

.field public c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public e:Landroid/content/Context;

.field public f:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lf/o;->b:Ljava/util/concurrent/ExecutorService;

    .line 10
    const/4 v0, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lf/o;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 23
    .line 24
    iput-object v0, p0, Lf/o;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    iput-object p1, p0, Lf/o;->e:Landroid/content/Context;

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 38
    .line 39
    iput-object p1, p0, Lf/o;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    return-void
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

.method public static synthetic a(Lf/o;Lf/i;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf/o;->e(Lf/i;Ljava/util/concurrent/CountDownLatch;)V

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
.end method

.method public static synthetic b(Lf/o;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf/o;->c()V

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
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public final synthetic c()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lf/o;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    sget-object v0, Laai/telemetry/enums/MonitorType;->MIXED_EVENT:Laai/telemetry/enums/MonitorType;

    .line 9
    .line 10
    iget-object v1, p0, Lf/o;->e:Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lb/f;->h(Laai/telemetry/enums/MonitorType;Landroid/content/Context;)[Ljava/io/File;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    array-length v1, v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lf/o;->m()I

    .line 21
    move-result v2

    .line 22
    .line 23
    if-lt v1, v2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lf/o;->l()Ljava/util/Map;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lf/o;->n()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lf/o;->j()Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    iget-object v4, p0, Lf/o;->e:Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3, v4}, Lb/f;->b(Laai/telemetry/enums/MonitorType;Ljava/util/Map;ZLjava/lang/String;Landroid/content/Context;)V

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lf/o;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

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
.end method

.method public final d()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf/o;->q()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lf/o;->b:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    new-instance v1, Lf/m;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0}, Lf/m;-><init>(Lf/o;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 18
    return-void
    .line 19
    .line 20
.end method

.method public final synthetic e(Lf/i;Ljava/util/concurrent/CountDownLatch;)V
    .locals 26

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    :try_start_0
    new-instance v0, Ll/b;

    .line 5
    .line 6
    iget-object v2, v1, Lf/o;->e:Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v2}, Ll/b;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Lf/i;->c()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Lf/i;->l()Laai/telemetry/enums/PluginPlatform;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Lf/i;->d()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    iget-object v2, v1, Lf/o;->e:Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    invoke-virtual/range {p1 .. p1}, Lf/i;->f()Ljava/lang/String;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    move-result-object v7

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p1 .. p1}, Lf/i;->m()Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    move-result-object v8

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p1 .. p1}, Lf/i;->b()Ljava/lang/String;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    .line 66
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    move-result-object v9

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ll/b;->i()I

    .line 71
    move-result v10

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ll/b;->o()J

    .line 75
    move-result-wide v11

    .line 76
    long-to-double v11, v11

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ll/b;->n()I

    .line 80
    move-result v13

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Lf/i;->o()Z

    .line 84
    move-result v14

    .line 85
    .line 86
    .line 87
    invoke-virtual/range {p1 .. p1}, Lf/i;->g()Ljava/lang/String;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    move-result-object v15

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {p1 .. p1}, Lf/i;->j()Ljava/lang/String;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    move-result-object v16

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {p1 .. p1}, Lf/i;->e()Ljava/lang/String;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    move-result-object v17

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {p1 .. p1}, Lf/i;->k()Ljava/lang/String;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    move-result-object v18

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {p1 .. p1}, Lf/i;->h()Ljava/util/Map;

    .line 120
    move-result-object v2

    .line 121
    .line 122
    .line 123
    invoke-static {v2}, Lk/g;->j(Ljava/util/Map;)Ljava/lang/String;

    .line 124
    move-result-object v19

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {p1 .. p1}, Lf/i;->i()Ljava/util/Map;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, Lk/g;->j(Ljava/util/Map;)Ljava/lang/String;

    .line 132
    move-result-object v20

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ll/b;->c()Ljava/lang/String;

    .line 136
    move-result-object v21

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ll/b;->d()I

    .line 140
    move-result v0

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 144
    move-result-object v22

    .line 145
    .line 146
    .line 147
    invoke-static {}, Lm/d;->e()Lorg/json/JSONObject;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 152
    move-result-object v23

    .line 153
    .line 154
    .line 155
    invoke-static {}, Lh/a;->a()Ljava/lang/String;

    .line 156
    move-result-object v24

    .line 157
    .line 158
    const-string v25, "1.4.5"

    .line 159
    .line 160
    .line 161
    invoke-static/range {v3 .. v25}, Laai/telemetry/AAITelemetryJNI;->ooooooooo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {p2 .. p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 165
    return-void

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {p2 .. p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 170
    throw v0

    .line 171
    .line 172
    .line 173
    :catch_0
    invoke-virtual/range {p2 .. p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 174
    return-void
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
.end method

.method public f(Ljava/io/File;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf/o;->q()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v0, Laai/telemetry/enums/MonitorType;->MIXED_EVENT:Laai/telemetry/enums/MonitorType;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lf/o;->l()Ljava/util/Map;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lf/o;->n()Z

    .line 17
    move-result v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lf/o;->j()Ljava/lang/String;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0, v1, v2, v3}, Lb/f;->c(Ljava/io/File;Laai/telemetry/enums/MonitorType;Ljava/util/Map;ZLjava/lang/String;)V

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

.method public g(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf/o;->q()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lf/o;->d()V

    .line 13
    return-void

    .line 14
    .line 15
    :cond_1
    iget-object p1, p0, Lf/o;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    :goto_0
    return-void

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-virtual {p0}, Lf/o;->d()V

    .line 26
    return-void
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

.method public h()V
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
    .line 18
    .line 19
    .line 20
.end method

.method public i()Landroid/content/Context;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lf/o;->e:Landroid/content/Context;

    .line 3
    return-object v0
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
    .line 18
    .line 19
    .line 20
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public k()Lg/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lf/o;->a:Lg/e;

    .line 3
    return-object v0
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
    .line 18
    .line 19
    .line 20
.end method

.method public abstract l()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract m()I
.end method

.method public abstract n()Z
.end method

.method public o()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf/o;->q()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lf/o;->d()V

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lf/o;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :catch_0
    :goto_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public p(Lf/i;)Lg/e;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lf/i;->a()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    return-object v0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0}, Lf/o;->h()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lf/o;->q()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    new-instance v0, Lg/e;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lf/i;->n()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p1}, Lg/e;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    iput-object v0, p0, Lf/o;->a:Lg/e;

    .line 32
    return-object v0

    .line 33
    .line 34
    :cond_2
    :try_start_0
    iget-object v0, p0, Lf/o;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x1

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    iput-object v0, p0, Lf/o;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 48
    .line 49
    :cond_3
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 53
    .line 54
    iget-object v1, p0, Lf/o;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 55
    .line 56
    new-instance v2, Lf/n;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, p0, p1, v0}, Lf/n;-><init>(Lf/o;Lf/i;Ljava/util/concurrent/CountDownLatch;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 63
    .line 64
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 65
    .line 66
    const-wide/16 v2, 0x5

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 78
    .line 79
    :goto_0
    iget-object v1, p0, Lf/o;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 80
    .line 81
    new-instance v2, Lf/o$a;

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, p0}, Lf/o$a;-><init>(Lf/o;)V

    .line 85
    .line 86
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 87
    .line 88
    const-wide/16 v3, 0x0

    .line 89
    .line 90
    const-wide/16 v5, 0x3

    .line 91
    .line 92
    .line 93
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 94
    .line 95
    :catch_1
    new-instance v0, Lg/e;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lf/i;->n()Ljava/lang/String;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, p1}, Lg/e;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    iput-object v0, p0, Lf/o;->a:Lg/e;

    .line 105
    .line 106
    iget-object p1, p0, Lf/o;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 107
    const/4 v0, 0x0

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 111
    .line 112
    iget-object p1, p0, Lf/o;->a:Lg/e;

    .line 113
    return-object p1
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

.method public q()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
    .line 18
    .line 19
    .line 20
.end method
