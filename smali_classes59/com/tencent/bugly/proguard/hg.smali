.class public Lcom/tencent/bugly/proguard/hg;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/hg$d;,
        Lcom/tencent/bugly/proguard/hg$c;
    }
.end annotation


# static fields
.field public static final i:Ljava/lang/String; = "SessionPrefs"

.field public static final j:Ljava/lang/String; = "last_pause_time"

.field public static final k:Ljava/lang/String; = "last_pause_activity_name"

.field public static final l:Ljava/lang/String; = "cur_session_id"

.field public static final m:J = 0x5265c00L

.field public static final n:J = 0x7530L

.field public static final o:Ljava/lang/String; = "bugly_session_id"

.field public static volatile p:Lcom/tencent/bugly/proguard/hg; = null

.field public static final q:Ljava/lang/String; = "RMonitor_SessionManager"


# instance fields
.field public b:J

.field public final c:Landroid/content/SharedPreferences;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/hg$c;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public f:Z

.field public g:Ljava/lang/String;

.field public h:Lcom/tencent/bugly/proguard/hg$d;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x7530

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/hg;->b:J

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hg;->d:Ljava/util/List;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hg;->e:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hg;->f:Z

    .line 20
    .line 21
    const-string v0, ""

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hg;->g:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v0, Lcom/tencent/bugly/proguard/hg$d;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Lcom/tencent/bugly/proguard/hg$d;-><init>(Lcom/tencent/bugly/proguard/hg;Lcom/tencent/bugly/proguard/hg$a;)V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hg;->h:Lcom/tencent/bugly/proguard/hg$d;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/tencent/bugly/proguard/ig;->a()Lcom/tencent/bugly/proguard/ig;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    const-string v2, "SessionPrefs"

    .line 42
    const/4 v3, 0x1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/ig;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    .line 49
    .line 50
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 51
    .line 52
    const-string v1, "RMonitor_SessionManager"

    .line 53
    .line 54
    const-string v2, "create new session manager object"

    .line 55
    .line 56
    .line 57
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 62
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
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/hg;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/hg;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/hg;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/hg;->g:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/hg;Ljava/lang/String;Z)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/hg;->a(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/hg;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/hg;->b:J

    return-wide v0
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/hg;)Landroid/content/SharedPreferences;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method public static c()Lcom/tencent/bugly/proguard/hg;
    .locals 2

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/hg;->p:Lcom/tencent/bugly/proguard/hg;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/tencent/bugly/proguard/hg;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/hg;->p:Lcom/tencent/bugly/proguard/hg;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/bugly/proguard/hg;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/hg;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/hg;->p:Lcom/tencent/bugly/proguard/hg;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/hg;->p:Lcom/tencent/bugly/proguard/hg;

    return-object v0
.end method

.method public static synthetic d(Lcom/tencent/bugly/proguard/hg;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hg;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 15
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/hg;->e:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/hg;->f:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hg;->f:Z

    .line 17
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    const-string v1, "last_pause_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v0, v4, v2

    if-ltz v0, :cond_1

    sub-long v2, v6, v4

    .line 19
    iget-wide v8, p0, Lcom/tencent/bugly/proguard/hg;->b:J

    cmp-long v0, v2, v8

    if-lez v0, :cond_1

    .line 20
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hg;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 21
    invoke-virtual {p0, v0, v2}, Lcom/tencent/bugly/proguard/hg;->a(Ljava/lang/String;Z)V

    .line 22
    iget-object v2, p0, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 23
    invoke-interface {v2, v1, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 24
    const-string v1, "last_pause_activity_name"

    const-string v3, "cold_start"

    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 25
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 26
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cold_start, new session, session_id: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", threshold: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v8, p0, Lcom/tencent/bugly/proguard/hg;->b:J

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", currentTime: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", lastPauseTime: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", lastPauseActName: cold_start"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "RMonitor_SessionManager"

    filled-new-array {v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    const-wide/32 v0, 0x5265c00

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 27
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/hg;->b:J

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/hg$c;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hg;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hg;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hg;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/hg$c;

    .line 5
    invoke-interface {v1, p1, p2}, Lcom/tencent/bugly/proguard/hg$c;->a(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 8
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/hg;->e:Z

    if-eqz p1, :cond_0

    .line 9
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hg;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/hg;->g:Ljava/lang/String;

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/hg;->a(Ljava/lang/String;Z)V

    .line 12
    iget-object p1, p0, Lcom/tencent/bugly/proguard/hg;->h:Lcom/tencent/bugly/proguard/hg$d;

    iget-wide v0, p0, Lcom/tencent/bugly/proguard/hg;->b:J

    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void

    .line 13
    :cond_0
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 14
    iget-object p1, p0, Lcom/tencent/bugly/proguard/hg;->h:Lcom/tencent/bugly/proguard/hg$d;

    invoke-static {p1}, Lcom/tencent/bugly/common/thread/ThreadManager;->cancelFromMonitorThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    const-string v1, "cur_session_id"

    const-string v2, "default_session_id"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/hg;->e:Z

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->a()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/hg;->c:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "cur_session_id"

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 20
    return-object v0
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
.end method

.method public onBackground()V
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

.method public onCreate(Landroid/app/Activity;)V
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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onDestroy(Landroid/app/Activity;)V
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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onForeground()V
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

.method public onPause(Landroid/app/Activity;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/hg$b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/hg$b;-><init>(Lcom/tencent/bugly/proguard/hg;Ljava/lang/String;)V

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onPostCreate(Landroid/app/Activity;)V
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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onResume(Landroid/app/Activity;)V
    .locals 2

    .line 1
    .line 2
    new-instance p1, Lcom/tencent/bugly/proguard/hg$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/hg$a;-><init>(Lcom/tencent/bugly/proguard/hg;)V

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    .line 11
    return-void
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

.method public onStart(Landroid/app/Activity;)V
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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onStop(Landroid/app/Activity;)V
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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
