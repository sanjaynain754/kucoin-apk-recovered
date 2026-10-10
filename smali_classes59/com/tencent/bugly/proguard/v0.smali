.class public abstract Lcom/tencent/bugly/proguard/v0;
.super Lcom/tencent/bugly/proguard/d1;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_MemoryLeak_BaseActivityWatcher"


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/bc;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/d1;-><init>(Lcom/tencent/bugly/proguard/bc;)V

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


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/rmonitor/memory/leakdetect/ActivityLeakSolution;->fixInputMethodManagerLeak(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/tencent/rmonitor/memory/leakdetect/ActivityLeakSolution;->fixAudioManagerLeak(Landroid/content/Context;)V

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d1;->b:Lcom/tencent/bugly/proguard/bc;

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, v1}, Lcom/tencent/bugly/proguard/bc;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    .line 17
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 18
    .line 19
    const-string v1, "RMonitor_MemoryLeak_BaseActivityWatcher"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    return-void
    .line 24
    .line 25
.end method
