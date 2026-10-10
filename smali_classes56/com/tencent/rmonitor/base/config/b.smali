.class public Lcom/tencent/rmonitor/base/config/b;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/base/config/b$c;
    }
.end annotation


# static fields
.field public static final h:Ljava/lang/String; = "RMonitor_config_fetcher"


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/af;

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

.field public final e:Lcom/tencent/bugly/proguard/l4;

.field public f:Landroid/os/Handler;

.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/af;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/af;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->d:Lcom/tencent/rmonitor/base/config/c;

    .line 14
    .line 15
    new-instance v1, Lcom/tencent/bugly/proguard/l4;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/l4;-><init>()V

    .line 19
    .line 20
    iput-object v1, p0, Lcom/tencent/rmonitor/base/config/b;->e:Lcom/tencent/bugly/proguard/l4;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->f:Landroid/os/Handler;

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/b;->g:Z

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 33
    return-void
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
    .line 82
    .line 83
    .line 84
.end method

.method public static synthetic a(Lcom/tencent/rmonitor/base/config/b;Lcom/tencent/rmonitor/base/config/c$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/base/config/b;->b(Lcom/tencent/rmonitor/base/config/c$a;)V

    return-void
.end method

.method public static d()Lcom/tencent/rmonitor/base/config/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->e()V

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/af;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object p1

    return-object p1
.end method

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

    .line 23
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->e()V

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/af;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 4

    .line 4
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->c()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/rmonitor/base/config/b$a;

    invoke-direct {v1, p0}, Lcom/tencent/rmonitor/base/config/b$a;-><init>(Lcom/tencent/rmonitor/base/config/b;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public a(Landroid/os/Looper;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->f:Landroid/os/Handler;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    if-eq v0, p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 3
    :cond_2
    :goto_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->f:Landroid/os/Handler;

    return-void
.end method

.method public a(Lcom/tencent/bugly/common/meta/UserMeta;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 7
    iget-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/proguard/d2;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/appconfig/v7/config/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    .line 9
    const-string v2, "/"

    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/tencent/rmonitor/base/config/b;->e:Lcom/tencent/bugly/proguard/l4;

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/l4;->a(Ljava/lang/String;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->e:Lcom/tencent/bugly/proguard/l4;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/l4;->a(Lcom/tencent/bugly/common/meta/UserMeta;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/m8;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/rmonitor/base/config/c$a;)V
    .locals 4

    .line 13
    new-instance v0, Lcom/tencent/rmonitor/base/config/b$b;

    invoke-direct {v0, p0, p1}, Lcom/tencent/rmonitor/base/config/b$b;-><init>(Lcom/tencent/rmonitor/base/config/b;Lcom/tencent/rmonitor/base/config/c$a;)V

    .line 14
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->c()Landroid/os/Handler;

    move-result-object p1

    const-string v1, "RMonitor_config_fetcher"

    if-eqz p1, :cond_1

    .line 15
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, "load config in specified thread."

    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 18
    :cond_1
    :goto_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "load config in current thread."

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 19
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/b$b;->run()V

    return-void
.end method

.method public a(Lcom/tencent/rmonitor/base/config/c;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/tencent/rmonitor/base/config/b;->d:Lcom/tencent/rmonitor/base/config/c;

    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->e()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/af;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/tencent/rmonitor/base/config/c;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->d:Lcom/tencent/rmonitor/base/config/c;

    if-eqz v0, :cond_0

    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->e:Lcom/tencent/bugly/proguard/l4;

    return-object v0
.end method

.method public b(Lcom/tencent/bugly/proguard/m8;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b(Lcom/tencent/rmonitor/base/config/c$a;)V
    .locals 4

    .line 5
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/config/b;->b()Lcom/tencent/rmonitor/base/config/c;

    move-result-object v0

    const-string v1, "RMonitor_config_fetcher"

    if-nez v0, :cond_0

    .line 6
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "load config fail for loader is null"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, "load config now."

    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    invoke-interface {v0, v2, p1}, Lcom/tencent/rmonitor/base/config/c;->a(Lcom/tencent/bugly/proguard/af;Lcom/tencent/rmonitor/base/config/c$a;)V

    .line 9
    iget-object p1, p0, Lcom/tencent/rmonitor/base/config/b;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/m8;

    .line 10
    iget-object v2, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    invoke-interface {v0, v2}, Lcom/tencent/bugly/proguard/m8;->a(Lcom/tencent/bugly/proguard/af;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 11
    :cond_1
    const-string p1, "load config"

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/base/config/b;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 12
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->f:Landroid/os/Handler;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/config/b;->g:Z

    const-string v1, "RMonitor_config_fetcher"

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/v2;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/config/b;->g:Z

    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " success."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 8
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->debug:Z

    if-eqz v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/af;->a(Ljava/lang/String;)V

    :cond_1
    return-void

    .line 10
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " fail for creator not ready yet."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/config/b;->g:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/tencent/rmonitor/base/config/b;->e:Lcom/tencent/bugly/proguard/l4;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/rmonitor/base/config/b;->b:Lcom/tencent/bugly/proguard/af;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/l4;->a(Lcom/tencent/bugly/proguard/af;)V

    .line 13
    .line 14
    const-string v0, "load config from local"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/base/config/b;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    .line 21
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 22
    .line 23
    const-string v2, "RMonitor_config_fetcher"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    :goto_0
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
    .line 82
    .line 83
    .line 84
.end method

.method public final f()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/config/b;->g:Z

    .line 3
    .line 4
    xor-int/lit8 v0, v0, 0x1

    .line 5
    return v0
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
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 0
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
