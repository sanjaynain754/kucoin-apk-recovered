.class public Lcom/tencent/bugly/proguard/h;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/h$b;,
        Lcom/tencent/bugly/proguard/h$d;,
        Lcom/tencent/bugly/proguard/h$c;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_launch_ActivityLaunchWatcher"


# instance fields
.field public final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/proguard/h$b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/tencent/bugly/proguard/h$d;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/h$d;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/h;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/tencent/bugly/proguard/h;->b:Lcom/tencent/bugly/proguard/h$d;

    .line 15
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/h;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/h;->a:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/h;Landroid/app/Activity;Lcom/tencent/bugly/proguard/h$b;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/h;->b(Landroid/app/Activity;Lcom/tencent/bugly/proguard/h$b;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/h;Lcom/tencent/bugly/proguard/h$b;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/h;->a(Lcom/tencent/bugly/proguard/h$b;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Lcom/tencent/bugly/proguard/h$b;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/h$b;

    return-object p1
.end method

.method public a()V
    .locals 3

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_launch_ActivityLaunchWatcher"

    const-string v2, "destroy begin"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/h$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/h$a;-><init>(Lcom/tencent/bugly/proguard/h;)V

    const-wide/16 v1, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final a(Landroid/app/Activity;Lcom/tencent/bugly/proguard/h$b;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/proguard/h$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 8
    iget-object v0, p2, Lcom/tencent/bugly/proguard/h$b;->k:Lcom/tencent/bugly/proguard/h$c;

    if-nez v0, :cond_0

    .line 9
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/h$c;

    invoke-direct {v0, p0, p2}, Lcom/tencent/bugly/proguard/h$c;-><init>(Lcom/tencent/bugly/proguard/h;Lcom/tencent/bugly/proguard/h$b;)V

    .line 10
    iput-object v0, p2, Lcom/tencent/bugly/proguard/h$b;->k:Lcom/tencent/bugly/proguard/h$c;

    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 14
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_launch_ActivityLaunchWatcher"

    const-string v1, "addListener"

    invoke-virtual {p2, v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/h$b;)V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h;->b:Lcom/tencent/bugly/proguard/h$d;

    if-eqz v0, :cond_0

    .line 16
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/h$d;->a(Lcom/tencent/bugly/proguard/h$b;)V

    :cond_0
    return-void
.end method

.method public final b(Landroid/app/Activity;)Lcom/tencent/bugly/proguard/h$b;
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/h;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/h$b;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/h$b;

    invoke-direct {v1, p1}, Lcom/tencent/bugly/proguard/h$b;-><init>(Landroid/app/Activity;)V

    .line 4
    iget-object p1, p0, Lcom/tencent/bugly/proguard/h;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public final b(Landroid/app/Activity;Lcom/tencent/bugly/proguard/h$b;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/proguard/h$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 5
    iget-object v0, p2, Lcom/tencent/bugly/proguard/h$b;->k:Lcom/tencent/bugly/proguard/h$c;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 6
    :try_start_0
    iput-object v1, p2, Lcom/tencent/bugly/proguard/h$b;->k:Lcom/tencent/bugly/proguard/h$c;

    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 10
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_launch_ActivityLaunchWatcher"

    const-string/jumbo v1, "removeListener"

    invoke-virtual {p2, v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/h;->b(Landroid/app/Activity;)Lcom/tencent/bugly/proguard/h$b;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    iput-wide v0, p1, Lcom/tencent/bugly/proguard/h$b;->i:J

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    iput-boolean v0, p1, Lcom/tencent/bugly/proguard/h$b;->e:Z

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

.method public d(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/h;->f(Landroid/app/Activity;)Lcom/tencent/bugly/proguard/h$b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/h;->b(Landroid/app/Activity;Lcom/tencent/bugly/proguard/h$b;)V

    .line 10
    :cond_0
    return-void
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

.method public e(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/h;->a(Landroid/app/Activity;)Lcom/tencent/bugly/proguard/h$b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/h$b;->a()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/h;->a(Landroid/app/Activity;Lcom/tencent/bugly/proguard/h$b;)V

    .line 13
    :cond_0
    return-void
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

.method public f(Landroid/app/Activity;)Lcom/tencent/bugly/proguard/h$b;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/h;->a:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/tencent/bugly/proguard/h$b;

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
