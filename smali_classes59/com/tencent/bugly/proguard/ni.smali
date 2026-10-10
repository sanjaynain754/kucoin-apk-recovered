.class public Lcom/tencent/bugly/proguard/ni;
.super Landroid/app/Service;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ni$b;,
        Lcom/tencent/bugly/proguard/ni$e;,
        Lcom/tencent/bugly/proguard/ni$c;,
        Lcom/tencent/bugly/proguard/ni$d;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String; = "Matrix.WarmUpService"

.field public static final d:Ljava/lang/String; = "invoke-args"

.field public static final e:Ljava/lang/String; = "invoke-resp"

.field public static final f:Ljava/lang/String; = "path-of-xlog-so"

.field public static final g:Ljava/lang/String; = "enable-logger"

.field public static final h:Ljava/lang/String; = "saving-path"

.field public static final i:Ljava/lang/String; = "path-of-elf"

.field public static final j:Ljava/lang/String; = "elf-start-offset"

.field public static final k:Ljava/lang/String; = "warm-up-result"

.field public static final l:I = 0x64

.field public static final m:I = 0x0

.field public static final n:I = -0x1

.field public static final o:I = -0x2

.field public static final p:I = -0x3

.field public static volatile q:Z = false

.field public static volatile r:Z = false

.field public static s:Landroid/os/HandlerThread; = null

.field public static t:Landroid/os/Handler; = null

.field public static final u:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final v:[B

.field public static final w:I = 0x1

.field public static final x:J = 0xea60L


# instance fields
.field public final a:Landroid/os/Messenger;

.field public final b:Lcom/tencent/bugly/proguard/ji;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/proguard/ni;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    new-array v0, v1, [B

    .line 11
    .line 12
    sput-object v0, Lcom/tencent/bugly/proguard/ni;->v:[B

    .line 13
    return-void
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
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/os/Messenger;

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/bugly/proguard/ni$a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/ni$a;-><init>(Lcom/tencent/bugly/proguard/ni;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ni;->a:Landroid/os/Messenger;

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/bugly/proguard/ji;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ji;-><init>()V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ni;->b:Lcom/tencent/bugly/proguard/ji;

    .line 23
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/ni;ILandroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/ni;->a(ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized a()V
    .locals 5

    const-class v0, Lcom/tencent/bugly/proguard/ni;

    monitor-enter v0

    .line 12
    :try_start_0
    sget-boolean v1, Lcom/tencent/bugly/proguard/ni;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 13
    :cond_0
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/proguard/ni;->v:[B

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    :try_start_2
    sget-object v2, Lcom/tencent/bugly/proguard/ni;->s:Landroid/os/HandlerThread;

    if-nez v2, :cond_1

    .line 15
    new-instance v2, Landroid/os/HandlerThread;

    const-string v3, "backtrace-recycler"

    invoke-direct {v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v2, Lcom/tencent/bugly/proguard/ni;->s:Landroid/os/HandlerThread;

    .line 16
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 17
    new-instance v2, Landroid/os/Handler;

    sget-object v3, Lcom/tencent/bugly/proguard/ni;->s:Landroid/os/HandlerThread;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    new-instance v4, Lcom/tencent/bugly/proguard/ni$b;

    .line 18
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/ni$b;-><init>()V

    .line 19
    invoke-direct {v2, v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v2, Lcom/tencent/bugly/proguard/ni;->t:Landroid/os/Handler;

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x1

    .line 21
    :try_start_3
    invoke-static {v1}, Lcom/tencent/bugly/proguard/ni;->a(Z)V

    .line 22
    sput-boolean v1, Lcom/tencent/bugly/proguard/ni;->q:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    goto :goto_2

    .line 23
    :goto_1
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v2

    .line 24
    :goto_2
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method public static declared-synchronized a(Landroid/content/Intent;)V
    .locals 5

    const-class v0, Lcom/tencent/bugly/proguard/ni;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-boolean v1, Lcom/tencent/bugly/proguard/ni;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 3
    :try_start_1
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Matrix.WarmUpService"

    const-string v4, "Init called."

    invoke-static {v3, v4, v2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/pi;->i()V

    .line 5
    const-string v2, "enable-logger"

    invoke-virtual {p0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    .line 6
    const-string/jumbo v2, "path-of-xlog-so"

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Matrix.WarmUpService"

    const-string v4, "Enable logger: %s"

    invoke-static {v3, v4, v2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Matrix.WarmUpService"

    const-string v4, "Path of XLog: %s"

    invoke-static {v3, v4, v2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    invoke-static {p0}, Lcom/tencent/bugly/matrix/xlog/XLogNative;->a(Ljava/lang/String;)V

    .line 10
    invoke-static {v1}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->enableLogger(Z)V

    const/4 p0, 0x1

    .line 11
    sput-boolean p0, Lcom/tencent/bugly/proguard/ni;->r:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static a(Z)V
    .locals 4

    const/4 v0, 0x0

    .line 26
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Matrix.WarmUpService"

    const-string v2, "Schedule suicide"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    sget-object v0, Lcom/tencent/bugly/proguard/ni;->v:[B

    monitor-enter v0

    const-wide/32 v1, 0xea60

    const/4 v3, 0x1

    if-eqz p0, :cond_0

    .line 28
    :try_start_0
    sget-object p0, Lcom/tencent/bugly/proguard/ni;->t:Landroid/os/Handler;

    invoke-virtual {p0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 29
    :cond_0
    sget-object p0, Lcom/tencent/bugly/proguard/ni;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p0

    if-nez p0, :cond_1

    .line 30
    sget-object p0, Lcom/tencent/bugly/proguard/ni;->t:Landroid/os/Handler;

    invoke-virtual {p0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 31
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final declared-synchronized a(ILandroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7

    monitor-enter p0

    .line 32
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ni;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 33
    :try_start_1
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 34
    const-string/jumbo v2, "warm-up-result"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    if-nez p2, :cond_0

    .line 35
    const-string p1, "Matrix.WarmUpService"

    const-string p2, "Args is null."

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    :try_start_2
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ni;->a(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catchall_1
    move-exception p1

    goto/16 :goto_2

    .line 37
    :cond_0
    :try_start_3
    const-string/jumbo v2, "saving-path"

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 38
    const-string v4, "Matrix.WarmUpService"

    const-string v5, "Invoke from client with savingPath: %s."

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/ni;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 40
    const-string p1, "Matrix.WarmUpService"

    const-string p2, "Saving path is empty."

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 41
    :try_start_4
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ni;->a(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v1

    .line 42
    :cond_1
    :try_start_5
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ni;->b:Lcom/tencent/bugly/proguard/ji;

    invoke-virtual {v4, v2}, Lcom/tencent/bugly/proguard/ji;->a(Ljava/lang/String;)V

    const/16 v2, 0x64

    if-ne p1, v2, :cond_6

    .line 43
    const-string/jumbo p1, "path-of-elf"

    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ni;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 45
    const-string p1, "Matrix.WarmUpService"

    const-string p2, "Warm-up so path is empty."

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 46
    :try_start_6
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ni;->a(Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-object v1

    .line 47
    :cond_2
    :try_start_7
    const-string v2, "elf-start-offset"

    invoke-virtual {p2, v2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p2

    .line 48
    const-string v2, "Matrix.WarmUpService"

    const-string v3, "Warm up so path %s offset %s."

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {p1, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/oi$a;->b(Landroid/content/Context;Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 p1, -0x3

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    .line 50
    invoke-static {p1, p2, v2}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->warmUp(Ljava/lang/String;IZ)Z

    move-result v2

    .line 51
    invoke-static {p1, p2}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->testLoadQut(Ljava/lang/String;I)Z

    move-result v3

    if-nez v3, :cond_4

    .line 52
    const-string v2, "Matrix.WarmUpService"

    const-string v3, "Warm up elf %s:%s success, but test load qut failed!"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {p1, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move v2, v0

    .line 53
    :cond_4
    invoke-static {p0, p1, p2, v2}, Lcom/tencent/bugly/proguard/oi$a;->a(Landroid/content/Context;Ljava/lang/String;IZ)V

    if-eqz v2, :cond_5

    move p1, v0

    goto :goto_0

    :cond_5
    const/4 p1, -0x2

    .line 54
    :goto_0
    const-string/jumbo p2, "warm-up-result"

    invoke-virtual {v1, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    .line 55
    :cond_6
    const-string p2, "Matrix.WarmUpService"

    const-string v2, "Unknown cmd: %s"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v2, p1}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 56
    :goto_1
    :try_start_8
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ni;->a(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    monitor-exit p0

    return-object v1

    :goto_2
    :try_start_9
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ni;->a(Z)V

    .line 57
    throw p1

    :goto_3
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 0

    if-eqz p1, :cond_1

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "Matrix.WarmUpService"

    .line 6
    .line 7
    const-string v2, "Remove scheduled suicide"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    sget-object v0, Lcom/tencent/bugly/proguard/ni;->v:[B

    .line 13
    monitor-enter v0

    .line 14
    .line 15
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/ni;->t:Landroid/os/Handler;

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 20
    .line 21
    sget-object v1, Lcom/tencent/bugly/proguard/ni;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v1
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

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/ni;->r:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/tencent/bugly/proguard/ni;->a(Landroid/content/Intent;)V

    .line 8
    .line 9
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ni;->a:Landroid/os/Messenger;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public onCreate()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 4
    .line 5
    sget-boolean v0, Lcom/tencent/bugly/proguard/ni;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/ni;->a()V

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
