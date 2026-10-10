.class public final Lcom/tencent/bugly/proguard/g7;
.super Lcom/tencent/bugly/proguard/kg;
.source "BUGLY"

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x1a
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/g7$a;
    }
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "RMonitor_FrameMetricsWatcher"


# instance fields
.field public final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Lcom/tencent/bugly/proguard/f7;

.field public final d:Lcom/tencent/bugly/proguard/g7$a;

.field public final e:Landroid/os/Handler;

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/g7$a;Landroid/os/Handler;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/kg;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g7;->b:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/f7;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/f7;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g7;->c:Lcom/tencent/bugly/proguard/f7;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/g7;->f:Z

    .line 21
    .line 22
    iput-object p1, p0, Lcom/tencent/bugly/proguard/g7;->d:Lcom/tencent/bugly/proguard/g7$a;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/tencent/bugly/proguard/g7;->e:Landroid/os/Handler;

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
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g7;->d:Lcom/tencent/bugly/proguard/g7$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/g7;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/g7;->f:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/g7;->f:Z

    .line 4
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->c()Landroid/app/Activity;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/g7;->a(Landroid/app/Activity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 8
    iget-object v1, p0, Lcom/tencent/bugly/proguard/g7;->b:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    iget-object v2, p0, Lcom/tencent/bugly/proguard/g7;->b:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g7;->e:Landroid/os/Handler;

    invoke-virtual {p1, p0, v0}, Landroid/view/Window;->addOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;Landroid/os/Handler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_FrameMetricsWatcher"

    const-string v2, "addListener"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/g7;->f:Z

    if-eqz v0, :cond_2

    .line 2
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g7;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/g7;->c(Landroid/app/Activity;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g7;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/g7;->f:Z

    :cond_2
    return-void
.end method

.method public b(Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g7;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/g7;->b:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g7;->c(Landroid/app/Activity;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 3

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/Window;->removeOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 15
    .line 16
    const-string v1, "RMonitor_FrameMetricsWatcher"

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "removeListenerInner"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    :goto_0
    return-void
    .line 24
    .line 25
.end method

.method public onDestroy(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g7;->b(Landroid/app/Activity;)V

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
.end method

.method public onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 1

    .line 1
    .line 2
    sget-boolean p1, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    if-lez p3, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "onFrameMetricsAvailable dropCount: "

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p3}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 15
    move-result-object p3

    .line 16
    .line 17
    const-string v0, "RMonitor_FrameMetricsWatcher"

    .line 18
    .line 19
    .line 20
    filled-new-array {v0, p3}, [Ljava/lang/String;

    .line 21
    move-result-object p3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p3}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 25
    .line 26
    :cond_0
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/g7;->f:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lcom/tencent/bugly/proguard/g7;->c:Lcom/tencent/bugly/proguard/f7;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/f7;->a(Landroid/view/FrameMetrics;)V

    .line 36
    .line 37
    iget-object p1, p0, Lcom/tencent/bugly/proguard/g7;->d:Lcom/tencent/bugly/proguard/g7$a;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, Lcom/tencent/bugly/proguard/g7;->c:Lcom/tencent/bugly/proguard/f7;

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p2}, Lcom/tencent/bugly/proguard/g7$a;->a(Lcom/tencent/bugly/proguard/f7;)V

    .line 45
    :cond_1
    return-void
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

.method public onStart(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g7;->a(Landroid/app/Activity;)V

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
.end method

.method public onStop(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g7;->b(Landroid/app/Activity;)V

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
.end method
