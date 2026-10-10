.class public Lcom/tencent/bugly/proguard/o1;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/o1$f;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String; = "BatteryMonitor"

.field public static final t:I = 0x1

.field public static final u:J = 0xea60L

.field public static final v:J = 0x927c0L

.field public static final w:I = 0x1

.field public static final x:I = 0x2


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/hi;

.field public final c:Lcom/tencent/bugly/proguard/db;

.field public final d:Lcom/tencent/bugly/proguard/p;

.field public e:Lcom/tencent/bugly/proguard/pf;

.field public f:Lcom/tencent/bugly/common/reporter/data/ReportData;

.field public final g:Lcom/tencent/bugly/proguard/g1;

.field public h:I

.field public i:J

.field public final j:Lcom/tencent/bugly/proguard/re;

.field public k:Z

.field public l:Z

.field public m:J

.field public final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final o:Landroid/os/Handler;

.field public final p:Lcom/tencent/bugly/proguard/ge$d;

.field public final q:Lcom/tencent/bugly/proguard/cb$b;

.field public final r:Lcom/tencent/bugly/proguard/o$d;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/pf;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/pf;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/o1;->e:Lcom/tencent/bugly/proguard/pf;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o1;->f:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/g1;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/g1;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    .line 6
    new-instance v1, Lcom/tencent/bugly/proguard/re;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/tencent/bugly/proguard/re;-><init>(Z)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/o1;->j:Lcom/tencent/bugly/proguard/re;

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/o1;->k:Z

    .line 8
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/o1;->l:Z

    .line 9
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v3, p0, Lcom/tencent/bugly/proguard/o1;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    new-instance v2, Lcom/tencent/bugly/proguard/o1$a;

    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/tencent/bugly/proguard/o1$a;-><init>(Lcom/tencent/bugly/proguard/o1;Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/tencent/bugly/proguard/o1;->o:Landroid/os/Handler;

    .line 11
    new-instance v2, Lcom/tencent/bugly/proguard/o1$b;

    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/o1$b;-><init>(Lcom/tencent/bugly/proguard/o1;)V

    iput-object v2, p0, Lcom/tencent/bugly/proguard/o1;->p:Lcom/tencent/bugly/proguard/ge$d;

    .line 12
    new-instance v2, Lcom/tencent/bugly/proguard/o1$c;

    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/o1$c;-><init>(Lcom/tencent/bugly/proguard/o1;)V

    iput-object v2, p0, Lcom/tencent/bugly/proguard/o1;->q:Lcom/tencent/bugly/proguard/cb$b;

    .line 13
    new-instance v2, Lcom/tencent/bugly/proguard/o1$d;

    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/o1$d;-><init>(Lcom/tencent/bugly/proguard/o1;)V

    iput-object v2, p0, Lcom/tencent/bugly/proguard/o1;->r:Lcom/tencent/bugly/proguard/o$d;

    .line 14
    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-static {v2}, Lcom/tencent/rmonitor/common/util/AppInfo;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/bugly/proguard/g1;->b:Ljava/lang/String;

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/bugly/proguard/g1;->c:Ljava/lang/String;

    .line 16
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/tencent/bugly/proguard/ch;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/bugly/proguard/g1;->d:Ljava/lang/String;

    .line 17
    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v2, v2, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    iput-object v2, v0, Lcom/tencent/bugly/proguard/g1;->e:Ljava/lang/String;

    const-wide/16 v2, 0x0

    .line 18
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/g1;->k:J

    .line 19
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/g1;->l:J

    .line 20
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/g1;->m:J

    .line 21
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/bugly/proguard/g1;->n:Ljava/lang/String;

    .line 22
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/rmonitor/custom/a;->g()Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/bugly/proguard/g1;->o:Lorg/json/JSONObject;

    .line 23
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 24
    sget-object v0, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentForeground()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    iput v1, p0, Lcom/tencent/bugly/proguard/o1;->h:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 26
    iput v0, p0, Lcom/tencent/bugly/proguard/o1;->h:I

    .line 27
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/o1;->i:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/o1;->m:J

    .line 28
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    move-result-object v0

    .line 29
    const-string v1, "battery_element"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/j1;

    .line 30
    new-instance v1, Lcom/tencent/bugly/proguard/hi;

    iget-wide v2, v0, Lcom/tencent/bugly/proguard/j1;->q:J

    iget-wide v4, v0, Lcom/tencent/bugly/proguard/j1;->s:J

    iget-wide v6, v0, Lcom/tencent/bugly/proguard/j1;->r:J

    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/proguard/hi;-><init>(JJJ)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    .line 31
    new-instance v2, Lcom/tencent/bugly/proguard/db;

    iget-wide v3, v0, Lcom/tencent/bugly/proguard/j1;->n:J

    iget-wide v5, v0, Lcom/tencent/bugly/proguard/j1;->p:J

    iget-wide v7, v0, Lcom/tencent/bugly/proguard/j1;->o:J

    invoke-direct/range {v2 .. v8}, Lcom/tencent/bugly/proguard/db;-><init>(JJJ)V

    iput-object v2, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    .line 32
    new-instance v1, Lcom/tencent/bugly/proguard/p;

    iget-wide v2, v0, Lcom/tencent/bugly/proguard/j1;->t:J

    iget-wide v4, v0, Lcom/tencent/bugly/proguard/j1;->u:J

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/tencent/bugly/proguard/p;-><init>(JJ)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/o1;->d:Lcom/tencent/bugly/proguard/p;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/o1$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/o1;-><init>()V

    return-void
.end method

.method public static a()Lcom/tencent/bugly/proguard/o1;
    .locals 1

    .line 3
    sget-object v0, Lcom/tencent/bugly/proguard/o1$f;->a:Lcom/tencent/bugly/proguard/o1;

    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/o1;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o1;->d()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/o1;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/o1;->a(J)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/o1;)Lcom/tencent/bugly/proguard/hi;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    return-object p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/o1;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/o1;->f(J)V

    return-void
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/o1;)Lcom/tencent/bugly/proguard/g1;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    return-object p0
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/o1;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/o1;->c(J)V

    return-void
.end method

.method public static synthetic d(Lcom/tencent/bugly/proguard/o1;)Lcom/tencent/bugly/proguard/db;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    return-object p0
.end method

.method public static synthetic e(Lcom/tencent/bugly/proguard/o1;)Lcom/tencent/bugly/proguard/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/o1;->d:Lcom/tencent/bugly/proguard/p;

    return-object p0
.end method

.method public static synthetic f(Lcom/tencent/bugly/proguard/o1;)Lcom/tencent/bugly/proguard/re;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/o1;->j:Lcom/tencent/bugly/proguard/re;

    return-object p0
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->b(J)V

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->b(J)V

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->d:Lcom/tencent/bugly/proguard/p;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/p;->a(J)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/o1;->l:Z

    return-void
.end method

.method public b()V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "BatteryMonitor"

    const-string v3, "BatteryMonitor start"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->p:Lcom/tencent/bugly/proguard/ge$d;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ge;->a(Lcom/tencent/bugly/proguard/ge$d;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->q:Lcom/tencent/bugly/proguard/cb$b;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/cb;->a(Lcom/tencent/bugly/proguard/cb$b;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->r:Lcom/tencent/bugly/proguard/o$d;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/o;->a(Lcom/tencent/bugly/proguard/o$d;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->j:Lcom/tencent/bugly/proguard/re;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/re;->o()V

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->j:Lcom/tencent/bugly/proguard/re;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/re;->r()V

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->o:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/o1;->o:Landroid/os/Handler;

    const-wide/32 v2, 0xea60

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public final b(J)V
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->d:Lcom/tencent/bugly/proguard/p;

    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/p;->c(J)Ljava/util/ArrayList;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/tencent/bugly/proguard/o1;->d:Lcom/tencent/bugly/proguard/p;

    .line 17
    invoke-virtual {v1, p1, p2}, Lcom/tencent/bugly/proguard/p;->b(J)Ljava/util/ArrayList;

    move-result-object v1

    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 20
    :cond_1
    :goto_0
    invoke-static {v1, v0, p1, p2}, Lcom/tencent/bugly/proguard/k1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;J)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 13
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/o1;->k:Z

    return-void
.end method

.method public c()V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/o1;->l:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/o1;->k:Z

    if-nez v0, :cond_0

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "BatteryMonitor"

    const-string v2, "BatteryMonitor stop"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->p:Lcom/tencent/bugly/proguard/ge$d;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ge;->b(Lcom/tencent/bugly/proguard/ge$d;)V

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->q:Lcom/tencent/bugly/proguard/cb$b;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/cb;->b(Lcom/tencent/bugly/proguard/cb$b;)V

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->r:Lcom/tencent/bugly/proguard/o$d;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/o;->b(Lcom/tencent/bugly/proguard/o$d;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->o:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    return-void
.end method

.method public final c(J)V
    .locals 4

    .line 10
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/o1;->l:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/o1;->m:J

    sub-long v0, p1, v0

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :goto_0
    return-void

    .line 12
    :cond_1
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/o1;->m:J

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/o1;->e(J)V

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/o1;->d(J)V

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/o1;->b(J)V

    return-void
.end method

.method public final d()V
    .locals 9

    .line 12
    const-string v0, "element"

    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/o1;->k:Z

    if-eqz v1, :cond_1

    .line 13
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/o1;->f:Lcom/tencent/bugly/common/reporter/data/ReportData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "Body"

    if-nez v1, :cond_0

    .line 14
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 15
    const-string v3, "last_process_name"

    iget-object v4, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-object v4, v4, Lcom/tencent/bugly/proguard/g1;->b:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    const-string v3, "last_launch_id"

    iget-object v4, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-object v4, v4, Lcom/tencent/bugly/proguard/g1;->d:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    const-string v3, "last_process_launch_id"

    iget-object v4, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-object v4, v4, Lcom/tencent/bugly/proguard/g1;->c:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    sget-object v3, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v3}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 19
    const-string/jumbo v4, "user_custom"

    iget-object v5, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-object v5, v5, Lcom/tencent/bugly/proguard/g1;->o:Lorg/json/JSONObject;

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    const-string/jumbo v4, "toolyrx"

    iget-object v5, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-object v5, v5, Lcom/tencent/bugly/proguard/g1;->n:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    const-string/jumbo v5, "resource"

    const-string v6, "battery_ele_metric"

    sget-object v7, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {v4, v5, v6, v7}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object v4

    .line 22
    const-string v5, "Attributes"

    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    new-instance v1, Lcom/tencent/bugly/common/reporter/data/ReportData;

    iget-object v3, v7, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    const-string v5, "Battery"

    const/4 v6, 0x1

    invoke-direct {v1, v3, v6, v5, v4}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    iput-object v1, p0, Lcom/tencent/bugly/proguard/o1;->f:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 25
    iget-object v3, p0, Lcom/tencent/bugly/proguard/o1;->e:Lcom/tencent/bugly/proguard/pf;

    invoke-virtual {v3, v1}, Lcom/tencent/bugly/proguard/pf;->d(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    .line 26
    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 27
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 28
    const-string/jumbo v5, "wake_lock_frequency"

    iget-object v6, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget v6, v6, Lcom/tencent/bugly/proguard/g1;->g:I

    invoke-virtual {v1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 29
    const-string/jumbo v5, "wake_lock_duration_in_ms"

    iget-object v6, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    .line 30
    invoke-virtual {v6, v3, v4}, Lcom/tencent/bugly/proguard/d;->a(J)J

    move-result-wide v6

    .line 31
    invoke-virtual {v1, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 32
    const-string/jumbo v5, "wake_lock"

    invoke-virtual {v1, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 34
    const-string v6, "location_frequency"

    iget-object v7, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget v7, v7, Lcom/tencent/bugly/proguard/g1;->f:I

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 35
    const-string v6, "location_duration_in_ms"

    iget-object v7, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    .line 36
    invoke-virtual {v7, v3, v4}, Lcom/tencent/bugly/proguard/d;->a(J)J

    move-result-wide v3

    .line 37
    invoke-virtual {v5, v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 38
    const-string v3, "location"

    invoke-virtual {v5, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 40
    const-string v4, "alarm_frequency"

    iget-object v6, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget v6, v6, Lcom/tencent/bugly/proguard/g1;->h:I

    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 41
    const-string v4, "alarm_wake_up_frequency"

    iget-object v6, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget v6, v6, Lcom/tencent/bugly/proguard/g1;->i:I

    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    const-string v4, "alarm_other_frequency"

    iget-object v6, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget v6, v6, Lcom/tencent/bugly/proguard/g1;->j:I

    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 43
    const-string v4, "alarm"

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 45
    const-string/jumbo v6, "process_alive_duration_in_ms"

    iget-object v7, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-wide v7, v7, Lcom/tencent/bugly/proguard/g1;->k:J

    invoke-virtual {v4, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 46
    const-string v6, "foreground_duration_in_ms"

    iget-object v7, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-wide v7, v7, Lcom/tencent/bugly/proguard/g1;->l:J

    invoke-virtual {v4, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 47
    const-string v6, "background_duration_in_ms"

    iget-object v7, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-wide v7, v7, Lcom/tencent/bugly/proguard/g1;->m:J

    invoke-virtual {v4, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 48
    const-string/jumbo v6, "process"

    invoke-virtual {v4, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 50
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 51
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 52
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 53
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 54
    iget-object v1, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/g1;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 55
    iget-object v1, p0, Lcom/tencent/bugly/proguard/o1;->f:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getParams()Lorg/json/JSONObject;

    move-result-object v1

    .line 56
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 57
    const-string v3, "elements"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->f:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setParams(Lorg/json/JSONObject;)V

    .line 59
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->e:Lcom/tencent/bugly/proguard/pf;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/o1;->f:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/pf;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 60
    :goto_1
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "BatteryMonitor"

    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final d(J)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->d(J)Ljava/util/ArrayList;

    move-result-object v1

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->e(J)Ljava/util/ArrayList;

    move-result-object v2

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->c(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->c:Lcom/tencent/bugly/proguard/db;

    iget-wide v6, v0, Lcom/tencent/bugly/proguard/d;->g:J

    move-wide v4, p1

    invoke-static/range {v1 .. v7}, Lcom/tencent/bugly/proguard/k1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;JJ)V

    return-void
.end method

.method public final e(J)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->d(J)Ljava/util/ArrayList;

    move-result-object v1

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->e(J)Ljava/util/ArrayList;

    move-result-object v2

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d;->c(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 8
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->b:Lcom/tencent/bugly/proguard/hi;

    iget-wide v6, v0, Lcom/tencent/bugly/proguard/d;->g:J

    move-wide v4, p1

    invoke-static/range {v1 .. v7}, Lcom/tencent/bugly/proguard/k1;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;JJ)V

    return-void
.end method

.method public final f(J)V
    .locals 5

    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/o1;->i:J

    sub-long v0, p1, v0

    .line 3
    iget v2, p0, Lcom/tencent/bugly/proguard/o1;->h:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 4
    iget-object v2, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-wide v3, v2, Lcom/tencent/bugly/proguard/g1;->m:J

    add-long/2addr v3, v0

    iput-wide v3, v2, Lcom/tencent/bugly/proguard/g1;->m:J

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-wide v3, v2, Lcom/tencent/bugly/proguard/g1;->l:J

    add-long/2addr v3, v0

    iput-wide v3, v2, Lcom/tencent/bugly/proguard/g1;->l:J

    .line 6
    :goto_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    iget-wide v3, v2, Lcom/tencent/bugly/proguard/g1;->k:J

    add-long/2addr v3, v0

    iput-wide v3, v2, Lcom/tencent/bugly/proguard/g1;->k:J

    .line 7
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/o1;->i:J

    return-void
.end method

.method public onBackground()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/o1;->f(J)V

    .line 8
    const/4 v0, 0x2

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/bugly/proguard/o1;->h:I

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public onCreate(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onDestroy(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onForeground()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/o1;->f(J)V

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/bugly/proguard/o1;->h:I

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public onPause(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onPostCreate(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onResume(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onStart(Landroid/app/Activity;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

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
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/o1;->k:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1;->o:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/bugly/proguard/o1$e;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/o1$e;-><init>(Lcom/tencent/bugly/proguard/o1;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
