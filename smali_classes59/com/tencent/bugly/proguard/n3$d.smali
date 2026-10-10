.class public Lcom/tencent/bugly/proguard/n3$d;
.super Lcom/tencent/bugly/proguard/c1;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/n3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/c1;-><init>()V

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
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SdCardPath"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    .line 2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iput-object p1, v0, Lcom/tencent/bugly/proguard/l2;->O:Ljava/lang/String;

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->getInstance(Landroid/content/Context;)Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->setmHandler(Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;)V

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->A()V

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ZLcom/tencent/bugly/proguard/b2;)V
    .locals 6

    .line 8
    sget-boolean v2, Lcom/tencent/bugly/proguard/rc;->i:Z

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->a()Lcom/tencent/bugly/proguard/zf;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v0, 0x3eb

    move-object v1, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/k3;->a(ILandroid/content/Context;ZLcom/tencent/bugly/proguard/b2$a;Lcom/tencent/bugly/proguard/zf;Ljava/lang/String;)Lcom/tencent/bugly/proguard/k3;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->z()V

    const/4 p2, 0x1

    .line 12
    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/k3;->a(Z)V

    .line 13
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->e:Lcom/tencent/bugly/proguard/u3;

    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u3;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/k3;->a(I)V

    .line 15
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->e:Lcom/tencent/bugly/proguard/u3;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u3;->b()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/k3;->a(Z)V

    .line 16
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->e:Lcom/tencent/bugly/proguard/u3;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u3;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->disableCatchAnrTrace()V

    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->enableCatchAnrTrace()V

    .line 19
    :goto_0
    invoke-static {v1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    sget-object v2, Lcom/tencent/bugly/proguard/n3;->e:Lcom/tencent/bugly/proguard/u3;

    .line 20
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/u3;->o()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/l2;->d(Z)V

    goto :goto_1

    .line 21
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->enableCatchAnrTrace()V

    .line 22
    :goto_1
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->b()V

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    .line 23
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->o()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 24
    :cond_2
    new-array v2, v0, [Ljava/lang/Object;

    const-string v3, "[crash] Closed native crash monitor!"

    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 25
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->f()V

    goto :goto_3

    .line 26
    :cond_3
    :goto_2
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n3$d;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_3
    if-eqz p3, :cond_5

    .line 27
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->m()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    .line 28
    :cond_4
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "[crash] Closed ANR monitor!"

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 29
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->d()V

    goto :goto_5

    .line 30
    :cond_5
    :goto_4
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->x()V

    .line 31
    :goto_5
    invoke-static {v1}, Lcom/tencent/bugly/proguard/n5;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/n5;

    .line 32
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object v0

    .line 33
    sget-object v1, Lcom/tencent/bugly/proguard/n3;->i:Lcom/tencent/bugly/proguard/qh;

    .line 34
    iput-object v1, v0, Lcom/tencent/bugly/proguard/rh;->c:Lcom/tencent/bugly/proguard/qh;

    if-eqz p3, :cond_6

    .line 35
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->c()J

    move-result-wide v0

    goto :goto_6

    :cond_6
    const-wide/16 v0, 0xbb8

    .line 36
    :goto_6
    invoke-virtual {p1, v0, v1, p2}, Lcom/tencent/bugly/proguard/k3;->a(JZ)V

    .line 37
    :try_start_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object p1

    .line 38
    const-string/jumbo p2, "replay_report"

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 39
    instance-of p2, p1, Lcom/tencent/bugly/proguard/kf;

    if-eqz p2, :cond_7

    move-object p2, p1

    check-cast p2, Lcom/tencent/bugly/proguard/kf;

    .line 40
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/kf;->d()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 41
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 42
    new-instance p2, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    invoke-direct {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;-><init>()V

    .line 43
    move-object p3, p1

    check-cast p3, Lcom/tencent/bugly/proguard/kf;

    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/kf;->c()Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->setQuality(Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;)V

    .line 44
    check-cast p1, Lcom/tencent/bugly/proguard/kf;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/kf;->b()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->setFrameRate(I)V

    .line 45
    sget-object p1, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->Companion:Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;->getInstance(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 47
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_7
    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 48
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/k3;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a()[Ljava/lang/String;
    .locals 1

    .line 50
    const-string/jumbo v0, "t_cr"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
