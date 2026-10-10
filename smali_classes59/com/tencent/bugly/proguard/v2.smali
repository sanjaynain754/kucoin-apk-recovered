.class public Lcom/tencent/bugly/proguard/v2;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/l8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/v2$b;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_config"


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/tencent/bugly/proguard/l8;",
            ">;"
        }
    .end annotation
.end field

.field public volatile b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/v2;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/v2;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/v2$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/v2;-><init>()V

    return-void
.end method

.method public static c()Lcom/tencent/bugly/proguard/v2;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;
    .locals 3

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v2;->a()V

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v2;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/l8;

    .line 6
    invoke-interface {v1, p1}, Lcom/tencent/bugly/proguard/l8;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_1
    return-object v1
.end method

.method public final a()V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v2;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v2;->b()V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/l8;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v2;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add config creator {"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "}"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "RMonitor_config"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/v2;->a()V

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v2;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/l8;

    .line 3
    invoke-interface {v1, p1}, Lcom/tencent/bugly/proguard/l8;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_1
    return-object v1
.end method

.method public final declared-synchronized b()V
    .locals 4

    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/v2;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 5
    :cond_0
    :try_start_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string v2, "generate creator"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 6
    const-string v1, "com.tencent.rmonitor.base.config.creator.LagConfigCreator"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/l8;

    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 8
    const-string v1, "com.tencent.rmonitor.base.config.creator.MemoryConfigCreator"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/l8;

    move-result-object v1

    .line 9
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 10
    const-string v1, "com.tencent.rmonitor.base.config.creator.ResourceConfigCreator"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/l8;

    move-result-object v1

    .line 11
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 12
    const-string v1, "com.tencent.rmonitor.base.config.creator.DefaultConfigCreator"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/l8;

    move-result-object v1

    .line 13
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 14
    const-string v1, "com.tencent.bugly.crashreport.common.config.CrashConfigCreator"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/l8;

    move-result-object v1

    .line 15
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 16
    new-instance v1, Lcom/tencent/bugly/proguard/n2;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/n2;-><init>()V

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    const/4 v1, 0x1

    .line 17
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/v2;->b:Z

    .line 18
    const-string v1, "RMonitor_config"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "generate creator end {"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/tencent/bugly/proguard/v2;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v3, "}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/l8;
    .locals 3

    .line 2
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/l8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 4
    :catchall_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 5
    const-string/jumbo v1, "new creator fail {"

    const-string/jumbo v2, "}"

    invoke-static {v1, p1, v2}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    const-string v1, "RMonitor_config"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v2;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method
