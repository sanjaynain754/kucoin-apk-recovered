.class public Lcom/tencent/bugly/proguard/i4;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/h4;


# static fields
.field public static final b:Ljava/lang/String; = "RMonitor_debug"

.field public static c:Z


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/x2;


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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/y2;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/y2;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/i4;->a:Lcom/tencent/bugly/proguard/x2;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static a()Z
    .locals 1

    .line 10
    sget-boolean v0, Lcom/tencent/bugly/proguard/i4;->c:Z

    return v0
.end method

.method public static b(Landroid/app/Activity;)Z
    .locals 3

    if-eqz p0, :cond_0

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/i4;->c(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_debug"

    const-string/jumbo v2, "showDebugTip fail"

    invoke-virtual {v0, v1, v2, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Landroid/app/Activity;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/i4$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i4$a;-><init>(Landroid/app/Activity;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    if-ne p0, v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/i4$a;->run()V

    .line 23
    return-void

    .line 24
    .line 25
    :cond_0
    const-wide/16 v1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    .line 29
    return-void
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
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 0

    .line 6
    invoke-static {p1}, Lcom/tencent/bugly/proguard/i4;->b(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-boolean p1, Lcom/tencent/bugly/proguard/i4;->c:Z

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/proguard/i4;->a:Lcom/tencent/bugly/proguard/x2;

    invoke-interface {p1}, Lcom/tencent/bugly/proguard/x2;->a()V

    :cond_0
    return-void
.end method

.method public a(Landroid/app/Activity;Lcom/tencent/bugly/proguard/p8;)V
    .locals 0

    .line 8
    invoke-static {p1}, Lcom/tencent/bugly/proguard/i4;->b(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-boolean p1, Lcom/tencent/bugly/proguard/i4;->c:Z

    if-eqz p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/tencent/bugly/proguard/i4;->a:Lcom/tencent/bugly/proguard/x2;

    invoke-interface {p1, p2}, Lcom/tencent/bugly/proguard/x2;->a(Lcom/tencent/bugly/proguard/p8;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/i4;->b(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    sput-boolean p2, Lcom/tencent/bugly/proguard/i4;->c:Z

    .line 3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/i4;->a:Lcom/tencent/bugly/proguard/x2;

    invoke-interface {p1, p2}, Lcom/tencent/bugly/proguard/x2;->a(Z)V

    .line 4
    sget-object p1, Lcom/tencent/bugly/proguard/g4;->c:Lcom/tencent/bugly/proguard/g4;

    .line 5
    iput-boolean p2, p1, Lcom/tencent/bugly/proguard/g4;->b:Z

    :cond_0
    return-void
.end method

.method public b(Landroid/app/Activity;Lcom/tencent/bugly/proguard/p8;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/i4;->b(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-boolean p1, Lcom/tencent/bugly/proguard/i4;->c:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/i4;->a:Lcom/tencent/bugly/proguard/x2;

    invoke-interface {p1, p2}, Lcom/tencent/bugly/proguard/x2;->b(Lcom/tencent/bugly/proguard/p8;)V

    :cond_0
    return-void
.end method
