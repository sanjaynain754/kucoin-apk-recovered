.class public final Lcom/tencent/bugly/matrix/memguard/MemGuard;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/matrix/memguard/MemGuard$d;,
        Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;,
        Lcom/tencent/bugly/matrix/memguard/MemGuard$e;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "MemGuard"

.field public static final b:Ljava/lang/String; = "matrix-hookcommon"

.field public static final c:Ljava/lang/String; = "matrix-memguard"

.field public static final d:Ljava/lang/String; = "MemGuard.IssueCB"

.field public static final e:J = 0x1388L

.field public static final f:Ljava/lang/String; = ".txt"

.field public static final g:[Z

.field public static h:Lcom/tencent/bugly/matrix/memguard/MemGuard$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    new-array v0, v0, [Z

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    aput-boolean v1, v0, v1

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/matrix/memguard/MemGuard;->g:[Z

    .line 9
    .line 10
    new-instance v0, Lcom/tencent/bugly/matrix/memguard/MemGuard$a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$a;-><init>()V

    .line 14
    .line 15
    sput-object v0, Lcom/tencent/bugly/matrix/memguard/MemGuard;->h:Lcom/tencent/bugly/matrix/memguard/MemGuard$d;

    .line 16
    return-void
    .line 17
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic a()Lcom/tencent/bugly/matrix/memguard/MemGuard$d;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/matrix/memguard/MemGuard;->h:Lcom/tencent/bugly/matrix/memguard/MemGuard$d;

    return-object v0
.end method

.method public static synthetic a(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;Lcom/tencent/bugly/matrix/memguard/MemGuard$d;)Z
    .locals 8
    .param p0    # Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/tencent/bugly/matrix/memguard/MemGuard$d;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "Install MemGuard successfully with "

    const-string v1, "Install MemGuard failed with "

    const-string v2, "Install MemGuard failed."

    .line 4
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v3, Lcom/tencent/bugly/matrix/memguard/MemGuard;->g:[Z

    monitor-enter v3

    const/4 v4, 0x0

    .line 6
    :try_start_0
    aget-boolean v5, v3, v4

    if-eqz v5, :cond_0

    .line 7
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p1, "MemGuard"

    const-string v0, "Already installed."

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 8
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception p0

    goto :goto_4

    .line 9
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->e()V

    if-eqz p1, :cond_1

    .line 10
    sput-object p1, Lcom/tencent/bugly/matrix/memguard/MemGuard;->h:Lcom/tencent/bugly/matrix/memguard/MemGuard$d;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->nativeInstall(Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    .line 12
    :goto_1
    :try_start_2
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v6, "MemGuard"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v6, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    move p1, v4

    :goto_2
    if-eqz p1, :cond_2

    .line 13
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "MemGuard"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v2, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    goto :goto_3

    .line 14
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "MemGuard"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v2, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 15
    :goto_3
    sget-object p0, Lcom/tencent/bugly/matrix/memguard/MemGuard;->g:[Z

    aput-boolean p1, p0, v4

    .line 16
    monitor-exit v3

    return p1

    .line 17
    :goto_4
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "bugly_asan"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 6
    new-instance p0, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "asan_info_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/matrix/memguard/MemGuard;->g:[Z

    monitor-enter v0

    const/4 v1, 0x0

    .line 2
    :try_start_0
    aget-boolean v1, v0, v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static c(Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    new-instance p0, Lcom/tencent/bugly/matrix/memguard/MemGuard$b;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$b;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    .line 31
    :cond_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 32
    return-object p0
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

.method private static c2jNotifyOnIssueDumped(Ljava/lang/String;)V
    .locals 8
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    .line 2
    const-string v0, "MemGuard"

    .line 3
    .line 4
    new-instance v1, Ljava/lang/Thread;

    .line 5
    .line 6
    new-instance v2, Lcom/tencent/bugly/matrix/memguard/MemGuard$c;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2, p0}, Lcom/tencent/bugly/matrix/memguard/MemGuard$c;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    const-string p0, "MemGuard.IssueCB"

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 22
    .line 23
    const-wide/16 v4, 0x1388

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v1, v4, v5}, Ljava/lang/Thread;->join(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :catch_0
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 30
    .line 31
    const-string v1, "Issue callback was interrupted."

    .line 32
    .line 33
    .line 34
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    move-result-wide v6

    .line 43
    sub-long/2addr v6, v2

    .line 44
    .line 45
    cmp-long p0, v6, v4

    .line 46
    .line 47
    if-lez p0, :cond_0

    .line 48
    .line 49
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 50
    .line 51
    const-string v1, "Timeout when call issue callback."

    .line 52
    .line 53
    .line 54
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 59
    :cond_0
    return-void
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

.method private static native nativeGetIssueDumpFilePath()Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method

.method private static native nativeInstall(Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;)Z
    .param p0    # Lcom/tencent/bugly/matrix/memguard/MemGuard$Options;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public static native stopDumpIssue()V
.end method
