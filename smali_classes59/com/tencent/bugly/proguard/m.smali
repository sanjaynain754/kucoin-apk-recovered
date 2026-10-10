.class public Lcom/tencent/bugly/proguard/m;
.super Lcom/tencent/bugly/proguard/df;
.source "BUGLY"


# static fields
.field public static volatile d:Lcom/tencent/bugly/proguard/m; = null

.field public static final e:Ljava/lang/String; = "Bugly_Asan_Monitor"

.field public static f:Z


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Lcom/tencent/bugly/proguard/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    const-string/jumbo v0, "rmonitor_base"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "buglybacktrace"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x1

    .line 13
    .line 14
    sput-boolean v0, Lcom/tencent/bugly/proguard/m;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    .line 18
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 19
    .line 20
    const-string v2, "Bugly_Asan_Monitor"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    sput-boolean v0, Lcom/tencent/bugly/proguard/m;->f:Z

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/df;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/m;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static b()Lcom/tencent/bugly/proguard/m;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/m;->d:Lcom/tencent/bugly/proguard/m;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-class v0, Lcom/tencent/bugly/proguard/m;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/m;->d:Lcom/tencent/bugly/proguard/m;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/tencent/bugly/proguard/m;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/m;-><init>()V

    .line 17
    .line 18
    sput-object v1, Lcom/tencent/bugly/proguard/m;->d:Lcom/tencent/bugly/proguard/m;

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    .line 27
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/m;->d:Lcom/tencent/bugly/proguard/m;

    .line 28
    return-object v0
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
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/l0;
    .locals 2

    .line 29
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    move-result-object v0

    .line 30
    const-string v1, "asan"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    move-result-object v0

    .line 31
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    check-cast v0, Lcom/tencent/bugly/proguard/l0;

    return-object v0
.end method

.method public final a(Landroid/content/Context;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/tencent/bugly/proguard/m;->c:Lcom/tencent/bugly/proguard/l0;

    iget v1, p1, Lcom/tencent/bugly/proguard/l0;->n:I

    .line 2
    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b:I

    .line 3
    iget v1, p1, Lcom/tencent/bugly/proguard/l0;->o:I

    .line 4
    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->c:I

    .line 5
    iget v1, p1, Lcom/tencent/bugly/proguard/l0;->p:I

    .line 6
    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->d:I

    .line 7
    iget v1, p1, Lcom/tencent/bugly/proguard/l0;->q:I

    .line 8
    iput v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->e:I

    .line 9
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/l0;->r:Z

    .line 10
    iput-boolean v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->f:Z

    .line 11
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/l0;->s:Z

    .line 12
    iput-boolean v1, v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->g:Z

    .line 13
    iget-object p1, p1, Lcom/tencent/bugly/proguard/l0;->t:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v1, :cond_0

    .line 16
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-array v3, v2, [Ljava/lang/String;

    invoke-virtual {v0, p1, v3}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;

    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {p1, v1, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    new-array v4, v2, [Ljava/lang/String;

    invoke-interface {p1, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 19
    invoke-virtual {v0, v3, p1}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->b(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;

    .line 20
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m;->c:Lcom/tencent/bugly/proguard/l0;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/l0;->u:Ljava/util/List;

    if-eqz p1, :cond_3

    .line 21
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v1, :cond_2

    .line 23
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-array v1, v2, [Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->a(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;

    goto :goto_1

    .line 24
    :cond_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {p1, v1, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 26
    invoke-virtual {v0, v3, p1}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->a(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;

    .line 27
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$Options$a;->a()Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;

    move-result-object p1

    const/4 v0, 0x0

    .line 28
    invoke-static {p1, v0}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->a(Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;Lcom/tencent/bugly/matrix/memguard/MemGuard$d;)Z

    return-void
.end method

.method public final c()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/rb;->a()Lcom/tencent/bugly/proguard/rb;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/rb;->c()Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "Bugly_Asan_Monitor"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "start addressSanitizer failed, couldn\'t support x86 or x86_64 arch"

    .line 19
    .line 20
    .line 21
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 26
    return v1

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/rb;->a()Lcom/tencent/bugly/proguard/rb;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v3, "asan"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lcom/tencent/bugly/proguard/rb;->a(Ljava/lang/String;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 41
    .line 42
    .line 43
    const-string/jumbo v3, "start addressSanitizer failed, couldn\'t open asan with fd or native memory same time."

    .line 44
    .line 45
    .line 46
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 51
    return v1

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/rb;->a()Lcom/tencent/bugly/proguard/rb;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/rb;->d()Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 68
    .line 69
    .line 70
    const-string/jumbo v3, "start addressSanitizer failed, local sample failed!"

    .line 71
    .line 72
    .line 73
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 78
    return v1

    .line 79
    .line 80
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 81
    .line 82
    .line 83
    const-string/jumbo v1, "prepare to start addressSanitizer, local sample success!"

    .line 84
    .line 85
    .line 86
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 91
    const/4 v0, 0x1

    .line 92
    return v0
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

.method public getPluginName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "asan"

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
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/m;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public start()V
    .locals 3

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/m;->f:Z

    .line 3
    .line 4
    const-string v1, "Bugly_Asan_Monitor"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/m;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 17
    .line 18
    const-string v2, "addressSanitizer has already started!"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/m;->c()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 35
    .line 36
    .line 37
    const-string/jumbo v2, "start addressSanitizer failed!"

    .line 38
    .line 39
    .line 40
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 45
    return-void

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/m;->a()Lcom/tencent/bugly/proguard/l0;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, p0, Lcom/tencent/bugly/proguard/m;->c:Lcom/tencent/bugly/proguard/l0;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/m;->a(Landroid/content/Context;)V

    .line 59
    const/4 v0, 0x0

    .line 60
    .line 61
    const-string v2, ""

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0, v2}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 65
    .line 66
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 67
    .line 68
    .line 69
    const-string/jumbo v2, "start addressSanitizer success!"

    .line 70
    .line 71
    .line 72
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 77
    .line 78
    iget-object v0, p0, Lcom/tencent/bugly/proguard/m;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    const/4 v1, 0x1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 83
    return-void

    .line 84
    .line 85
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 86
    .line 87
    .line 88
    const-string/jumbo v2, "start addressSanitizer failed, so load failed!"

    .line 89
    .line 90
    .line 91
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 96
    return-void
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

.method public stop()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/m;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 12
    .line 13
    const-string v1, "Bugly_Asan_Monitor"

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "stop addressSanitizer, only stop dump issue file."

    .line 17
    .line 18
    .line 19
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->stopDumpIssue()V

    .line 27
    .line 28
    const-string v0, ""

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/df;->notifyStopResult(ILjava/lang/String;)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/bugly/proguard/m;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 38
    return-void
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
.end method
