.class public Lcom/tencent/bugly/proguard/h$c;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;
.implements Landroid/view/ViewTreeObserver$OnDrawListener;
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x12
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# static fields
.field public static final f:J = 0x3e8L


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/h$b;

.field public c:J

.field public d:J

.field public final synthetic e:Lcom/tencent/bugly/proguard/h;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/h;Lcom/tencent/bugly/proguard/h$b;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h$c;->e:Lcom/tencent/bugly/proguard/h;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/h$c;->c:J

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/h$c;->d:J

    .line 12
    .line 13
    iput-object p2, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

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
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/h$b;->c:Z

    if-eqz v0, :cond_2

    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/h$c;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 3
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/h$c;->d:J

    :cond_0
    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 5
    :cond_1
    iget-object v2, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

    invoke-virtual {v2, v0, v1}, Lcom/tencent/bugly/proguard/h$b;->a(J)V

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h$c;->e:Lcom/tencent/bugly/proguard/h;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/h;->a(Lcom/tencent/bugly/proguard/h$b;)V

    :cond_2
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 8
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->debug:Z

    if-eqz v0, :cond_0

    .line 9
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", activity: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/h$b;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "RMonitor_launch_ActivityLaunchWatcher"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onDraw()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/h$b;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "onDraw"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/h$c;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/h$b;->d:Z

    .line 18
    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 21
    move-result-wide v0

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/h$c;->d:J

    .line 24
    .line 25
    const-wide/16 v0, 0x3e8

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    .line 29
    :cond_0
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
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/bugly/proguard/h$c;->b:Lcom/tencent/bugly/proguard/h$b;

    .line 5
    .line 6
    iget-boolean p1, p1, Lcom/tencent/bugly/proguard/h$b;->c:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    const-string/jumbo p1, "onWindowFocusChanged"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/h$c;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/h$c;->c:J

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/h$c;->a()V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/tencent/bugly/common/thread/ThreadManager;->cancelFromMainThread(Ljava/lang/Runnable;)V

    .line 27
    :cond_0
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

.method public run()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "run"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/h$c;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/h$c;->a()V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
