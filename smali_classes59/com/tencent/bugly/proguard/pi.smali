.class public Lcom/tencent/bugly/proguard/pi;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/pi$c;,
        Lcom/tencent/bugly/proguard/pi$f;,
        Lcom/tencent/bugly/proguard/pi$h;,
        Lcom/tencent/bugly/proguard/pi$g;,
        Lcom/tencent/bugly/proguard/pi$e;,
        Lcom/tencent/bugly/proguard/pi$d;
    }
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "Matrix.Backtrace"

.field public static final h:Ljava/lang/String; = "/apex/com.android.runtime/lib/"

.field public static final i:Ljava/lang/String; = "/apex/com.android.runtime/lib64/"

.field public static final j:Ljava/lang/String; = "/system/lib/"

.field public static final k:Ljava/lang/String; = "/system/lib64/"

.field public static final l:Ljava/lang/String; = "/system/framework/arm/"

.field public static final m:Ljava/lang/String; = "/system/framework/arm64/"

.field public static final n:Ljava/lang/String; = ":backtrace__"

.field public static o:Z = false

.field public static p:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:Ljava/lang/String; = "buglybacktrace"

.field public static r:Z


# instance fields
.field public volatile a:Z

.field public volatile b:Z

.field public volatile c:Lcom/tencent/bugly/proguard/pi$c;

.field public final d:Lcom/tencent/bugly/proguard/ji;

.field public final e:Landroid/os/Handler;

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/pi;->p:Ljava/util/ArrayList;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    sput-boolean v0, Lcom/tencent/bugly/proguard/pi;->r:Z

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/ji;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ji;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pi;->d:Lcom/tencent/bugly/proguard/ji;

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pi;->e:Landroid/os/Handler;

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pi;->f:Z

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
.end method

.method public static a(Lcom/tencent/bugly/proguard/li;)V
    .locals 0

    .line 5
    sput-object p0, Lcom/tencent/bugly/proguard/ji;->o:Lcom/tencent/bugly/proguard/li;

    return-void
.end method

.method public static a(Lcom/tencent/bugly/proguard/pi$e;)V
    .locals 4

    .line 12
    sget-boolean v0, Lcom/tencent/bugly/proguard/pi;->r:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "buglybacktrace"

    if-nez p0, :cond_1

    .line 13
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_1
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Matrix.Backtrace"

    const-string v3, "Using custom library loader: %s."

    invoke-static {v2, v3, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    invoke-interface {p0, v0}, Lcom/tencent/bugly/proguard/pi$e;->a(Ljava/lang/String;)V

    :goto_0
    const/4 p0, 0x1

    .line 16
    sput-boolean p0, Lcom/tencent/bugly/proguard/pi;->r:Z

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/pi;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pi;->j()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/pi;Lcom/tencent/bugly/proguard/pi$c;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pi;->a(Lcom/tencent/bugly/proguard/pi$c;)V

    return-void
.end method

.method public static a(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/tencent/bugly/proguard/pi;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 17
    invoke-static {p0}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->enableLogger(Z)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/pi;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi;->f:Z

    return p1
.end method

.method public static a(Ljava/lang/String;)[I
    .locals 0

    .line 52
    invoke-static {p0}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->statistic(Ljava/lang/String;)[I

    move-result-object p0

    return-object p0
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "/system/framework/arm/"

    return-object v0

    :cond_0
    const-string v0, "/system/framework/arm64/"

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "arm"

    goto :goto_0

    :cond_0
    const-string v0, "arm64"

    .line 4
    :goto_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/io/File;

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p0

    .line 7
    const-string v2, "/oat/"

    const-string v3, "/base.odex"

    invoke-static {v2, v0, v3}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/pi;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pi;->k()V

    return-void
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "/apex/com.android.runtime/lib/"

    return-object v0

    :cond_0
    const-string v0, "/apex/com.android.runtime/lib64/"

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 0

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->g()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "/system/lib/"

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    const-string v0, "/system/lib64/"

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static e()V
    .locals 4

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/pi;->o:Z

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    sput-boolean v0, Lcom/tencent/bugly/proguard/pi;->o:Z

    .line 8
    .line 9
    sget-object v0, Lcom/tencent/bugly/proguard/pi$g;->a:Lcom/tencent/bugly/proguard/pi;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/pi;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/pi$c;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lcom/tencent/bugly/proguard/pi$f;->d:Lcom/tencent/bugly/proguard/pi$f;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/pi$c;->a(Lcom/tencent/bugly/proguard/pi$f;)Lcom/tencent/bugly/proguard/pi$c;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    sget-object v1, Lcom/tencent/bugly/proguard/pi$h;->d:Lcom/tencent/bugly/proguard/pi$h;

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/pi$c;->a(Lcom/tencent/bugly/proguard/pi$h;J)Lcom/tencent/bugly/proguard/pi$c;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    sget-object v1, Lcom/tencent/bugly/proguard/pi;->p:Ljava/util/ArrayList;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 39
    move-result v1

    .line 40
    .line 41
    if-lez v1, :cond_1

    .line 42
    .line 43
    sget-object v1, Lcom/tencent/bugly/proguard/pi;->p:Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    check-cast v2, Ljava/lang/String;

    .line 60
    .line 61
    new-instance v3, Ljava/io/File;

    .line 62
    .line 63
    .line 64
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 68
    move-result v3

    .line 69
    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/pi$c;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/pi$c;

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    const/4 v1, 0x0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/pi$c;->f(Z)Lcom/tencent/bugly/proguard/pi$c;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pi$c;->b()V

    .line 83
    :cond_2
    return-void
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

.method public static f()Lcom/tencent/bugly/proguard/pi;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/pi$g;->a:Lcom/tencent/bugly/proguard/pi;

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

.method public static g()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "arm64-v8a"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "x86_64"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    .line 22
    const-string/jumbo v1, "mips64"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0

    .line 32
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 33
    return v0
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

.method public static i()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "buglybacktrace"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/pi$c;
    .locals 1

    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi;->c:Lcom/tencent/bugly/proguard/pi$c;

    if-eqz v0, :cond_0

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/proguard/pi;->c:Lcom/tencent/bugly/proguard/pi$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 8
    :cond_0
    :try_start_1
    new-instance v0, Lcom/tencent/bugly/proguard/pi$c;

    invoke-direct {v0, p1, p0}, Lcom/tencent/bugly/proguard/pi$c;-><init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/pi;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/pi;->c:Lcom/tencent/bugly/proguard/pi$c;

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi;->a:Z

    .line 10
    iget-object p1, p0, Lcom/tencent/bugly/proguard/pi;->c:Lcom/tencent/bugly/proguard/pi$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi;->d:Lcom/tencent/bugly/proguard/ji;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/ji;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Lcom/tencent/bugly/proguard/pi$c;)V
    .locals 6

    .line 18
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pi;->c(Lcom/tencent/bugly/proguard/pi$c;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Matrix.Backtrace"

    if-eqz v0, :cond_0

    .line 19
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "Isolate process does not need any configuration."

    invoke-static {v2, v0, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 20
    :cond_0
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/pi$c;->j:Z

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->e:Lcom/tencent/bugly/proguard/pi$e;

    if-nez v0, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/pi$d;

    const-string v0, "Custom library loader is not supported in isolate process warm-up mode."

    invoke-direct {p1, v0}, Lcom/tencent/bugly/proguard/pi$d;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_2
    :goto_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->e:Lcom/tencent/bugly/proguard/pi$e;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/pi;->a(Lcom/tencent/bugly/proguard/pi$e;)V

    .line 23
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/matrix/xlog/XLogNative;->a(Ljava/lang/String;)V

    .line 24
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/pi$c;->m:Z

    .line 25
    invoke-static {v0}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->enableLogger(Z)V

    .line 26
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/pi$c;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    sget-object v1, Lcom/tencent/bugly/proguard/pi$f;->c:Lcom/tencent/bugly/proguard/pi$f;

    if-eq v0, v1, :cond_3

    sget-object v3, Lcom/tencent/bugly/proguard/pi$f;->e:Lcom/tencent/bugly/proguard/pi$f;

    if-ne v0, v3, :cond_4

    .line 28
    :cond_3
    iget v0, v0, Lcom/tencent/bugly/proguard/pi$f;->b:I

    invoke-static {v0}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->setBacktraceMode(I)V

    .line 29
    :cond_4
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    sget-object v3, Lcom/tencent/bugly/proguard/pi$f;->d:Lcom/tencent/bugly/proguard/pi$f;

    if-eq v0, v3, :cond_5

    sget-object v4, Lcom/tencent/bugly/proguard/pi$f;->f:Lcom/tencent/bugly/proguard/pi$f;

    if-eq v0, v4, :cond_5

    sget-object v4, Lcom/tencent/bugly/proguard/pi$f;->g:Lcom/tencent/bugly/proguard/pi$f;

    if-eq v0, v4, :cond_5

    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/pi$c;->g:Z

    if-eqz v0, :cond_b

    .line 30
    :cond_5
    invoke-static {p1}, Lcom/tencent/bugly/proguard/oi;->c(Lcom/tencent/bugly/proguard/pi$c;)Ljava/lang/String;

    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Set saving path: %s"

    invoke-static {v2, v5, v4}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 34
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    :cond_6
    iget-object v4, p0, Lcom/tencent/bugly/proguard/pi;->d:Lcom/tencent/bugly/proguard/ji;

    invoke-virtual {v4, v0}, Lcom/tencent/bugly/proguard/ji;->a(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pi;->b(Lcom/tencent/bugly/proguard/pi$c;)V

    .line 38
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi;->d:Lcom/tencent/bugly/proguard/ji;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/pi$c;)V

    .line 39
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 40
    invoke-static {v0}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    .line 41
    iget-object v4, p1, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    if-eq v4, v3, :cond_7

    iget-boolean v5, p1, Lcom/tencent/bugly/proguard/pi$c;->g:Z

    if-nez v5, :cond_a

    :cond_7
    if-nez v0, :cond_9

    .line 42
    sget-object v5, Lcom/tencent/bugly/proguard/pi$f;->f:Lcom/tencent/bugly/proguard/pi$f;

    if-ne v4, v5, :cond_8

    goto :goto_1

    .line 43
    :cond_8
    sget-object v1, Lcom/tencent/bugly/proguard/pi$f;->g:Lcom/tencent/bugly/proguard/pi$f;

    if-ne v4, v1, :cond_9

    .line 44
    sget-object v1, Lcom/tencent/bugly/proguard/pi$f;->e:Lcom/tencent/bugly/proguard/pi$f;

    goto :goto_1

    :cond_9
    move-object v1, v3

    .line 45
    :goto_1
    iget v1, v1, Lcom/tencent/bugly/proguard/pi$f;->b:I

    invoke-static {v1}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->setBacktraceMode(I)V

    .line 46
    :cond_a
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "Has warmed up: %s"

    invoke-static {v2, v3, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-static {v0}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->setWarmedUp(Z)V

    .line 48
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pi;->k()V

    .line 49
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/pi$c;->i:Z

    if-nez v0, :cond_b

    .line 50
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi;->d:Lcom/tencent/bugly/proguard/ji;

    iget-object v1, p1, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    invoke-virtual {v0, p1, v1}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/pi$c;Lcom/tencent/bugly/proguard/pi$f;)V

    :cond_b
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pi;->b:Z

    return-void
.end method

.method public final b(Lcom/tencent/bugly/proguard/pi$c;)V
    .locals 5

    .line 10
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/pi$c;->i:Z

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 12
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/pi$c;->h:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x1000

    .line 13
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/oi;->a(Ljava/io/File;I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 14
    iput-boolean v2, p1, Lcom/tencent/bugly/proguard/pi$c;->f:Z

    goto :goto_0

    .line 15
    :cond_0
    const-string v3, "\n"

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    aget-object v1, v1, v3

    .line 16
    iget-object v4, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 17
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 18
    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 19
    new-array v1, v3, [Ljava/lang/Object;

    const-string v3, "Matrix.Backtrace"

    const-string v4, "Apk updated, remove warmed-up file."

    invoke-static {v3, v4, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    iput-boolean v2, p1, Lcom/tencent/bugly/proguard/pi$c;->f:Z

    .line 21
    :cond_1
    :goto_0
    iget-boolean v1, p1, Lcom/tencent/bugly/proguard/pi$c;->f:Z

    if-eqz v1, :cond_2

    .line 22
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 23
    iget-object p1, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/tencent/bugly/proguard/oi;->i(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_2
    return-void
.end method

.method public final c(Lcom/tencent/bugly/proguard/pi$c;)Z
    .locals 1

    .line 2
    iget-object p1, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/tencent/bugly/common/utils/ProcessUtil;->getCurrentProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    const-string v0, ":backtrace__"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public h()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi;->d:Lcom/tencent/bugly/proguard/ji;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ji;->b()Z

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

.method public final j()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi;->a:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi;->d:Lcom/tencent/bugly/proguard/ji;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ji;->c()V

    .line 15
    :cond_1
    :goto_0
    return-void
    .line 16
    .line 17
.end method

.method public final k()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pi;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pi;->f:Z

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi;->e:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/bugly/proguard/pi$a;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/pi$a;-><init>(Lcom/tencent/bugly/proguard/pi;)V

    .line 16
    .line 17
    .line 18
    const-wide/32 v2, 0x1499700

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 22
    return-void
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
