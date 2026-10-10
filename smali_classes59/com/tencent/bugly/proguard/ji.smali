.class public Lcom/tencent/bugly/proguard/ji;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ji$g;,
        Lcom/tencent/bugly/proguard/ji$f;,
        Lcom/tencent/bugly/proguard/ji$e;,
        Lcom/tencent/bugly/proguard/ji$h;
    }
.end annotation


# static fields
.field public static final h:Ljava/lang/String; = "Matrix.WarmUpDelegate"

.field public static final i:Ljava/lang/String; = "action.backtrace.warmed-up"

.field public static final j:Ljava/lang/String; = ".backtrace.warmed_up"

.field public static final k:Ljava/lang/String; = "warm-up"

.field public static final l:Ljava/lang/String; = "clean-up"

.field public static final m:Ljava/lang/String; = "consuming-up"

.field public static final n:Ljava/lang/String; = "compute-disk-usage"

.field public static volatile o:Lcom/tencent/bugly/proguard/li;


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Lcom/tencent/bugly/proguard/ji$h;

.field public d:Lcom/tencent/bugly/proguard/ji$g;

.field public e:Lcom/tencent/bugly/proguard/mi;

.field public f:Lcom/tencent/bugly/proguard/pi$c;

.field public final g:[Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ji;->a:Z

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    new-array v1, v1, [Z

    .line 10
    .line 11
    aput-boolean v0, v1, v0

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/bugly/proguard/ji;->g:[Z

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ji;)Lcom/tencent/bugly/proguard/pi$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ji;Landroid/content/Context;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ji;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ji;Lcom/tencent/bugly/proguard/ki;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ji;->a(Lcom/tencent/bugly/proguard/ki;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/pi$f;)V
    .locals 0

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ji;->b(Lcom/tencent/bugly/proguard/pi$f;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ji;Ljava/lang/String;I)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/ji;->a(Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/lang/String;IZ)Z
    .locals 0

    .line 29
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->warmUp(Ljava/lang/String;IZ)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/ji;)Lcom/tencent/bugly/proguard/mi;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    return-object p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/ji;Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/ji;->b(Ljava/lang/String;I)V

    return-void
.end method

.method public static b(Lcom/tencent/bugly/proguard/pi$f;)V
    .locals 1

    .line 8
    sget-object v0, Lcom/tencent/bugly/proguard/pi$f;->f:Lcom/tencent/bugly/proguard/pi$f;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/tencent/bugly/proguard/pi$f;->g:Lcom/tencent/bugly/proguard/pi$f;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/pi$f;->d:Lcom/tencent/bugly/proguard/pi$f;

    iget p0, p0, Lcom/tencent/bugly/proguard/pi$f;->b:I

    invoke-static {p0}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->setBacktraceMode(I)V

    return-void
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/ji;)Lcom/tencent/bugly/proguard/ki;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ji;->a()Lcom/tencent/bugly/proguard/ki;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/tencent/bugly/proguard/ki;
    .locals 4

    .line 30
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/ji;->a:Z

    if-eqz v0, :cond_1

    .line 31
    new-instance v0, Lcom/tencent/bugly/proguard/ji$f;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/ji$f;-><init>(Ljava/lang/String;)V

    .line 32
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 33
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    iget-boolean v2, v2, Lcom/tencent/bugly/proguard/pi$c;->n:Z

    const-string v3, "enable-logger"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 34
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    iget-object v2, v2, Lcom/tencent/bugly/proguard/pi$c;->o:Ljava/lang/String;

    const-string/jumbo v3, "path-of-xlog-so"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    iget-object v2, v2, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/ji$f;->a(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 36
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/ji$e;

    .line 37
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ji$e;-><init>()V

    return-object v0
.end method

.method public final a(Landroid/content/Context;)V
    .locals 5

    const-string v0, "Matrix.WarmUpDelegate"

    const/4 v1, 0x0

    .line 59
    :try_start_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/oi;->a(Ljava/io/File;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 62
    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, ""

    invoke-static {v0, v2, v4, v3}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 v2, 0x1

    .line 63
    invoke-static {v2}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->setWarmedUp(Z)V

    .line 64
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    iget-object v2, v2, Lcom/tencent/bugly/proguard/pi$c;->d:Lcom/tencent/bugly/proguard/pi$f;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/ji;->b(Lcom/tencent/bugly/proguard/pi$f;)V

    .line 65
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Broadcast warmed up message to other processes."

    invoke-static {v0, v3, v2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    new-instance v0, Landroid/content/Intent;

    const-string v2, "action.backtrace.warmed-up"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 67
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    const-string/jumbo v3, "pid"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 68
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".backtrace.warmed_up"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 69
    sget-object p1, Lcom/tencent/bugly/proguard/ji;->o:Lcom/tencent/bugly/proguard/li;

    if-eqz p1, :cond_0

    .line 70
    sget-object v0, Lcom/tencent/bugly/proguard/li$a;->b:Lcom/tencent/bugly/proguard/li$a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lcom/tencent/bugly/proguard/li;->a(Lcom/tencent/bugly/proguard/li$a;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/os/CancellationSignal;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->d:Lcom/tencent/bugly/proguard/ji$g;

    new-instance v1, Lcom/tencent/bugly/proguard/ji$b;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/ji$b;-><init>(Lcom/tencent/bugly/proguard/ji;Landroid/os/CancellationSignal;)V

    const-string p1, "clean-up"

    invoke-virtual {v0, v1, p1}, Lcom/tencent/bugly/proguard/ji$g;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/ki;)V
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/ji;->a:Z

    if-eqz v0, :cond_0

    .line 39
    check-cast p1, Lcom/tencent/bugly/proguard/ji$f;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 40
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ji$f;->a:Lcom/tencent/bugly/proguard/ni$e;

    .line 41
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/ni$e;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/pi$c;)V
    .locals 9

    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ji;->g:[Z

    monitor-enter v1

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->g:[Z

    const/4 v2, 0x0

    aget-boolean v3, v0, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_0

    .line 8
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v4, p0

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    .line 9
    :try_start_2
    aput-boolean v3, v0, v2

    .line 10
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 11
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    .line 12
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/pi$c;->j:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ji;->a:Z

    .line 13
    new-instance v0, Lcom/tencent/bugly/proguard/ji$g;

    const-string v1, "WeChatBacktraceTask"

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/ji$g;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/ji;->d:Lcom/tencent/bugly/proguard/ji$g;

    .line 14
    new-instance v3, Lcom/tencent/bugly/proguard/mi;

    iget-object v5, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    iget-object v6, p1, Lcom/tencent/bugly/proguard/pi$c;->k:Lcom/tencent/bugly/proguard/pi$h;

    iget-wide v7, p1, Lcom/tencent/bugly/proguard/pi$c;->l:J

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/tencent/bugly/proguard/mi;-><init>(Lcom/tencent/bugly/proguard/ji;Landroid/content/Context;Lcom/tencent/bugly/proguard/pi$h;J)V

    iput-object v3, v4, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    .line 15
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/pi$c;->i:Z

    if-eqz v0, :cond_3

    .line 16
    iget-object p1, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 17
    invoke-static {p1}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 18
    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "Matrix.WarmUpDelegate"

    const-string v3, "Has not been warmed up"

    invoke-static {v1, v3, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    iget-object v0, v4, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    sget-object v1, Lcom/tencent/bugly/proguard/mi$d;->b:Lcom/tencent/bugly/proguard/mi$d;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/mi;->b(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 20
    :cond_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/oi;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "Matrix.WarmUpDelegate"

    const-string v3, "Need clean up"

    invoke-static {v1, v3, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    iget-object v0, v4, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    sget-object v1, Lcom/tencent/bugly/proguard/mi$d;->c:Lcom/tencent/bugly/proguard/mi$d;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/mi;->b(Lcom/tencent/bugly/proguard/mi$d;)V

    .line 23
    :cond_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/oi;->h(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 24
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Matrix.WarmUpDelegate"

    const-string v1, "Should schedule disk usage task."

    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    iget-object p1, v4, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    sget-object v0, Lcom/tencent/bugly/proguard/mi$d;->e:Lcom/tencent/bugly/proguard/mi$d;

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/mi;->b(Lcom/tencent/bugly/proguard/mi$d;)V

    :cond_3
    return-void

    :catchall_1
    move-exception v0

    move-object v4, p0

    :goto_0
    move-object p1, v0

    .line 26
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    :catchall_2
    move-exception v0

    goto :goto_0
.end method

.method public declared-synchronized a(Lcom/tencent/bugly/proguard/pi$c;Lcom/tencent/bugly/proguard/pi$f;)V
    .locals 9

    monitor-enter p0

    .line 42
    :try_start_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 43
    invoke-static {v0}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 44
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->c:Lcom/tencent/bugly/proguard/ji$h;

    if-nez v0, :cond_2

    .line 45
    new-instance v0, Lcom/tencent/bugly/proguard/ji$h;

    invoke-direct {v0, p2}, Lcom/tencent/bugly/proguard/ji$h;-><init>(Lcom/tencent/bugly/proguard/pi$f;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/ji;->c:Lcom/tencent/bugly/proguard/ji$h;

    const/4 p2, 0x0

    .line 46
    new-array v0, p2, [Ljava/lang/Object;

    const-string v1, "Matrix.WarmUpDelegate"

    const-string v2, "Register warm-up receiver."

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    :try_start_2
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 48
    const-string v0, "action.backtrace.warmed-up"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 49
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOver34()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 50
    const-class v0, Landroid/content/Context;

    const-string v2, "RECEIVER_NOT_EXPORTED"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v8

    .line 52
    iget-object v3, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/ji;->c:Lcom/tencent/bugly/proguard/ji$h;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".backtrace.warmed_up"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    .line 54
    invoke-static/range {v3 .. v8}, Lcom/tencent/bugly/proguard/dj;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    .line 55
    :cond_1
    iget-object v0, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/ji;->c:Lcom/tencent/bugly/proguard/ji$h;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".backtrace.warmed_up"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 57
    invoke-virtual {v0, v2, v5, p1, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 58
    :goto_0
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "failed to register warmed up receiver."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "Matrix.WarmUpDelegate"

    invoke-static {v0, p1, p2}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_2
    monitor-exit p0

    return-void

    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ji;->b:Ljava/lang/String;

    .line 28
    invoke-static {p1}, Lcom/tencent/bugly/matrix/backtrace/WeChatBacktraceNative;->setSavingPath(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;I)Z
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/tencent/bugly/proguard/oi$a;->a(Landroid/content/Context;Ljava/lang/String;I)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    if-nez v0, :cond_0

    .line 73
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Matrix.WarmUpDelegate"

    const-string v0, "Elf file %s:%s has blocked and will not do warm-up."

    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return v1
.end method

.method public b(Landroid/os/CancellationSignal;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->d:Lcom/tencent/bugly/proguard/ji$g;

    new-instance v1, Lcom/tencent/bugly/proguard/ji$d;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/ji$d;-><init>(Lcom/tencent/bugly/proguard/ji;Landroid/os/CancellationSignal;)V

    const-string p1, "compute-disk-usage"

    invoke-virtual {v0, v1, p1}, Lcom/tencent/bugly/proguard/ji$g;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;I)V
    .locals 2

    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/ji;->o:Lcom/tencent/bugly/proguard/li;

    if-eqz v0, :cond_0

    .line 7
    sget-object v1, Lcom/tencent/bugly/proguard/li$a;->e:Lcom/tencent/bugly/proguard/li$a;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/tencent/bugly/proguard/li;->a(Lcom/tencent/bugly/proguard/li$a;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->d:Lcom/tencent/bugly/proguard/ji$g;

    if-eqz v0, :cond_0

    .line 4
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/ji$g;->g:Z

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->f:Lcom/tencent/bugly/proguard/pi$c;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/pi$c;->a:Landroid/content/Context;

    .line 3
    invoke-static {v0}, Lcom/tencent/bugly/proguard/oi;->j(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->e:Lcom/tencent/bugly/proguard/mi;

    sget-object v1, Lcom/tencent/bugly/proguard/mi$d;->d:Lcom/tencent/bugly/proguard/mi$d;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/mi;->b(Lcom/tencent/bugly/proguard/mi$d;)V

    return-void
.end method

.method public c(Landroid/os/CancellationSignal;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->d:Lcom/tencent/bugly/proguard/ji$g;

    new-instance v1, Lcom/tencent/bugly/proguard/ji$c;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/ji$c;-><init>(Lcom/tencent/bugly/proguard/ji;Landroid/os/CancellationSignal;)V

    const-string p1, "consuming-up"

    invoke-virtual {v0, v1, p1}, Lcom/tencent/bugly/proguard/ji$g;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public d(Landroid/os/CancellationSignal;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ji;->d:Lcom/tencent/bugly/proguard/ji$g;

    .line 3
    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/ji$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/ji$a;-><init>(Lcom/tencent/bugly/proguard/ji;Landroid/os/CancellationSignal;)V

    .line 8
    .line 9
    .line 10
    const-string/jumbo p1, "warm-up"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lcom/tencent/bugly/proguard/ji$g;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

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
.end method
