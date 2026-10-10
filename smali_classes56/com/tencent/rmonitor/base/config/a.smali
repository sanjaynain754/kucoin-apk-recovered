.class public Lcom/tencent/rmonitor/base/config/a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/m8;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/base/config/a$c;
    }
.end annotation


# static fields
.field public static final h:Ljava/lang/String; = "RMonitor_config"


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/tencent/bugly/proguard/p8;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/tencent/bugly/proguard/m8;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/tencent/rmonitor/base/config/c;

.field public e:Z

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->a:Ljava/util/Set;

    .line 13
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->b:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->d:Lcom/tencent/rmonitor/base/config/c;

    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->e:Z

    .line 16
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->f:Z

    .line 17
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->g:Z

    .line 18
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 19
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->c()V

    return-void
.end method

.method public constructor <init>(Lcom/tencent/rmonitor/base/config/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->a:Ljava/util/Set;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->b:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->d:Lcom/tencent/rmonitor/base/config/c;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->e:Z

    .line 6
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->f:Z

    .line 7
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->g:Z

    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 9
    iput-object p1, p0, Lcom/tencent/rmonitor/base/config/a;->d:Lcom/tencent/rmonitor/base/config/c;

    .line 10
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->c()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/rmonitor/base/config/a;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->e()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/rmonitor/base/config/a;Lcom/tencent/rmonitor/base/config/c$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/base/config/a;->a(Lcom/tencent/rmonitor/base/config/c$a;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 7
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->d()V

    .line 8
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final a()V
    .locals 6

    .line 29
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string v2, "apply config"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 31
    sget-object v1, Lcom/tencent/bugly/proguard/ee;->z:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 32
    invoke-virtual {v0, v4}, Lcom/tencent/rmonitor/base/config/b;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v5

    .line 33
    invoke-virtual {p0, v5, v4}, Lcom/tencent/rmonitor/base/config/a;->a(Lcom/tencent/bugly/proguard/hf;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0, v4}, Lcom/tencent/rmonitor/base/config/a;->d(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    move-result-object v4

    if-eqz v5, :cond_0

    if-eqz v4, :cond_0

    .line 35
    iput-object v5, v4, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 36
    :cond_1
    const-string v1, "safe_mode"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v1

    .line 37
    instance-of v2, v1, Lcom/tencent/bugly/proguard/fg;

    if-eqz v2, :cond_2

    .line 38
    check-cast v1, Lcom/tencent/bugly/proguard/fg;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/fg;->f:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/m3;->a(Ljava/util/List;)V

    .line 39
    :cond_2
    const-string v1, "atta"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v1

    .line 40
    instance-of v2, v1, Lcom/tencent/bugly/proguard/n0;

    if-eqz v2, :cond_3

    .line 41
    invoke-static {}, Lcom/tencent/bugly/proguard/q0$a;->a()Lcom/tencent/bugly/proguard/q0;

    move-result-object v2

    .line 42
    check-cast v1, Lcom/tencent/bugly/proguard/n0;

    invoke-virtual {v2, v1}, Lcom/tencent/bugly/proguard/q0;->a(Lcom/tencent/bugly/proguard/n0;)V

    .line 43
    :cond_3
    const-string v1, "launch_metric"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v0

    .line 44
    instance-of v1, v0, Lcom/tencent/bugly/proguard/c0;

    if-eqz v1, :cond_4

    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-static {v1}, Lcom/tencent/bugly/common/utils/ProcessUtil;->isMainProcess(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 45
    check-cast v0, Lcom/tencent/bugly/proguard/c0;

    .line 46
    new-instance v1, Lcom/tencent/bugly/proguard/f0;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/f0;-><init>()V

    .line 47
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/f0;->a(Lcom/tencent/bugly/proguard/c0;)V

    :cond_4
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/af;)V
    .locals 2

    .line 15
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->f()V

    .line 16
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->a()V

    .line 17
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/m8;

    .line 18
    invoke-interface {v1, p1}, Lcom/tencent/bugly/proguard/m8;->a(Lcom/tencent/bugly/proguard/af;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/hf;Ljava/lang/String;)V
    .locals 3

    .line 24
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/p8;

    .line 26
    invoke-virtual {p0, p2}, Lcom/tencent/rmonitor/base/config/a;->f(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {v1, p1}, Lcom/tencent/bugly/proguard/p8;->a(Lcom/tencent/bugly/proguard/hf;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 28
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_config"

    invoke-virtual {p2, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/m8;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/p8;)V
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final a(Lcom/tencent/rmonitor/base/config/c$a;)V
    .locals 3

    .line 10
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string v2, "load config"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 11
    new-instance v0, Lcom/tencent/rmonitor/base/config/a$b;

    invoke-direct {v0, p0, p1}, Lcom/tencent/rmonitor/base/config/a$b;-><init>(Lcom/tencent/rmonitor/base/config/a;Lcom/tencent/rmonitor/base/config/c$a;)V

    .line 12
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->inMonitorThread()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/a$b;->run()V

    return-void

    :cond_0
    const-wide/16 v1, 0x0

    .line 14
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 1

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->b:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 3
    iput-boolean p1, p0, Lcom/tencent/rmonitor/base/config/a;->f:Z

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 2

    .line 19
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 20
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    .line 21
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/tencent/bugly/proguard/m8;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public b(Lcom/tencent/bugly/proguard/p8;)V
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 6
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->f:Z

    return v0
.end method

.method public c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->d()V

    .line 4
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/base/config/a;->d(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->b:Ljava/util/HashMap;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "JVM_TI_OPEN"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/a;->b:Ljava/util/HashMap;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "CONFIG_USE_V7"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;
    .locals 3

    .line 7
    sget-object v0, Lcom/tencent/rmonitor/base/config/PluginCombination;->Companion:Lcom/tencent/rmonitor/base/config/PluginCombination$Companion;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/PluginCombination$Companion;->getAllPlugin()Ljava/util/List;

    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 9
    iget-object v2, v1, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->pluginName:Ljava/lang/String;

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->g:Z

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string v2, "init config"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->g:Z

    .line 4
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/a;->a()V

    .line 5
    new-instance v0, Lcom/tencent/rmonitor/base/config/a$a;

    invoke-direct {v0, p0}, Lcom/tencent/rmonitor/base/config/a$a;-><init>(Lcom/tencent/rmonitor/base/config/a;)V

    const-wide/16 v1, 0xc8

    .line 6
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/base/config/b;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object p1

    return-object p1
.end method

.method public final e()V
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->e:Z

    .line 5
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->resetReportNum()V

    .line 6
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/tencent/rmonitor/base/config/a;->d:Lcom/tencent/rmonitor/base/config/c;

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Lcom/tencent/rmonitor/base/config/c;)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Landroid/os/Looper;)V

    goto :goto_0

    .line 10
    :cond_1
    const-string v1, "RMonitorModule"

    invoke-static {v1}, Lcom/tencent/bugly/proguard/m7;->a(Ljava/lang/String;)V

    .line 11
    :goto_0
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/base/config/b;->a(Lcom/tencent/bugly/proguard/m8;)V

    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string v2, "merge list_metric"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 3
    const-string v1, "looper_metric"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v1

    .line 5
    const-string v2, "list_metric"

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/config/b;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v1

    .line 6
    instance-of v2, v1, Lcom/tencent/bugly/proguard/hb;

    if-eqz v2, :cond_0

    instance-of v2, v0, Lcom/tencent/bugly/proguard/hb;

    if-eqz v2, :cond_0

    .line 7
    check-cast v1, Lcom/tencent/bugly/proguard/hb;

    .line 8
    check-cast v0, Lcom/tencent/bugly/proguard/hb;

    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/hb;->a(Lcom/tencent/bugly/proguard/hb;)V

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 5

    .line 10
    sget-object v0, Lcom/tencent/bugly/proguard/ee;->A:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 11
    invoke-static {v4, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public g()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/config/a;->g:Z

    .line 3
    .line 4
    const-string v1, "RMonitor_config"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    const-string v2, "refresh config"

    .line 11
    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Lcom/tencent/bugly/common/meta/UserMeta;)V

    .line 27
    .line 28
    sget-object v0, Lcom/tencent/rmonitor/base/config/c$a;->d:Lcom/tencent/rmonitor/base/config/c$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/base/config/a;->a(Lcom/tencent/rmonitor/base/config/c$a;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 35
    .line 36
    const-string v2, "refresh config fail for not init yet."

    .line 37
    .line 38
    .line 39
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 44
    return-void
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
    .line 82
    .line 83
    .line 84
.end method
