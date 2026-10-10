.class public Lcom/tencent/bugly/proguard/rc;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = ""

.field public static final b:Ljava/lang/String; = "4.4.7.8"

.field public static c:Z = true

.field public static d:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/c1;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:I = 0x64

.field public static final f:I = 0x64

.field public static final g:I = 0x64

.field public static final h:I = 0x64

.field public static i:Z

.field public static j:Lcom/tencent/bugly/proguard/e4;

.field public static k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    .line 8
    return-void
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
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method public static a()V
    .locals 2

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/fi;->d()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 13
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setAppVersionLabel(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/u7;->a(Landroid/content/Context;)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setAppHotPatchNum(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;J)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/rc;

    monitor-enter v0

    const/4 v1, 0x0

    .line 14
    :try_start_0
    invoke-static {p0, v1, p1, p2}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;J)V
    .locals 8

    const-class v1, Lcom/tencent/bugly/proguard/rc;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->k:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 16
    new-array p0, v2, [Ljava/lang/Object;

    const-string p1, "[init] initial Multi-times, ignore this."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    .line 17
    :try_start_1
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "[init] context of init() is null, check it."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-void

    .line 18
    :cond_1
    :try_start_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    const/4 v3, 0x1

    .line 19
    sput-boolean v3, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 20
    invoke-static {v0}, Lcom/tencent/bugly/proguard/rc;->a(Lcom/tencent/bugly/proguard/l2;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 21
    sput-boolean v2, Lcom/tencent/bugly/proguard/rc;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    return-void

    .line 22
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    .line 23
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v1

    return-void

    .line 24
    :cond_3
    :try_start_4
    iget-boolean v4, v0, Lcom/tencent/bugly/proguard/l2;->d0:Z

    move-object v2, p0

    move-object v5, p1

    move-wide v6, p2

    invoke-static/range {v2 .. v7}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/b2;J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v1

    return-void

    :goto_0
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 104
    invoke-static {}, Lcom/tencent/bugly/proguard/ce;->b()Lcom/tencent/bugly/proguard/ce;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ce;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 105
    new-array p0, v1, [Ljava/lang/Object;

    const-string p1, "init linkage before."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 106
    :cond_0
    :try_start_0
    const-class v0, Lcom/tencent/bugly/proguard/xa;

    .line 107
    const-string v2, "initLinkage"

    const-class v3, Landroid/content/Context;

    const-class v4, Ljava/lang/String;

    filled-new-array {v3, v4}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 109
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const-string p0, "init linkage success."

    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 111
    :cond_1
    const-string p0, "init linkage fail for method is null."

    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "init linkage fail for %s."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/b2;J)V
    .locals 7

    const-class v0, Lcom/tencent/bugly/proguard/rc;

    monitor-enter v0

    .line 25
    :try_start_0
    sget-boolean v1, Lcom/tencent/bugly/proguard/rc;->k:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 26
    new-array p0, v2, [Ljava/lang/Object;

    const-string p1, "[init] initial Multi-times, ignore this."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_0
    if-nez p0, :cond_1

    .line 27
    :try_start_1
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "[init] context is null, check it."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    if-nez p1, :cond_2

    .line 28
    :try_start_2
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "init arg \'crashReportAppID\' should not be null!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :cond_2
    const/4 v1, 0x1

    .line 29
    :try_start_3
    sput-boolean v1, Lcom/tencent/bugly/proguard/rc;->k:Z

    if-eqz p2, :cond_3

    .line 30
    sput-boolean v1, Lcom/tencent/bugly/proguard/rc;->i:Z

    .line 31
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/common/logger/Logger;->setLogLevel(Lcom/tencent/rmonitor/common/logger/LogState;)V

    .line 32
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Bugly debug\u6a21\u5f0f\u5f00\u542f\uff0c\u8bf7\u5728\u53d1\u5e03\u65f6\u628aisDebug\u5173\u95ed\u3002 -- Running in debug model for \'isDebug\' is enabled. Please disable it when you release."

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 33
    const-string v3, "--------------------------------------------------------------------------------------------"

    new-array v4, v2, [Ljava/lang/Object;

    .line 34
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 35
    const-string v3, "Bugly debug\u6a21\u5f0f\u5c06\u6709\u4ee5\u4e0b\u884c\u4e3a\u7279\u6027 -- The following list shows the behaviour of debug model: "

    new-array v4, v2, [Ljava/lang/Object;

    .line 36
    sget-object v6, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v6, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 37
    const-string v3, "[1] \u8f93\u51fa\u8be6\u7ec6\u7684Bugly SDK\u7684Log -- More detailed log of Bugly SDK will be output to logcat;"

    new-array v4, v2, [Ljava/lang/Object;

    .line 38
    invoke-static {v6, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 39
    const-string v3, "[2] \u6bcf\u4e00\u6761Crash\u90fd\u4f1a\u88ab\u7acb\u5373\u4e0a\u62a5 -- Every crash caught by Bugly will be uploaded immediately."

    new-array v4, v2, [Ljava/lang/Object;

    .line 40
    invoke-static {v6, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 41
    const-string v3, "[3] \u81ea\u5b9a\u4e49\u65e5\u5fd7\u5c06\u4f1a\u5728Logcat\u4e2d\u8f93\u51fa -- Custom log will be output to logcat."

    new-array v4, v2, [Ljava/lang/Object;

    .line 42
    invoke-static {v6, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 43
    const-string v3, "--------------------------------------------------------------------------------------------"

    new-array v4, v2, [Ljava/lang/Object;

    .line 44
    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 45
    const-string v3, "[init] Open debug mode of Bugly."

    new-array v4, v2, [Ljava/lang/Object;

    .line 46
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_3
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "--------------------------------------------------------------------------------------------"

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 48
    const-string v3, "Bugly \u521d\u59cb\u5316\u4e2d\u3002 -- Bugly is starting init."

    new-array v4, v2, [Ljava/lang/Object;

    .line 49
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 50
    const-string v3, "Bugly Release\u7248\u672c\u652f\u6301\u6253\u5370\u65e5\u5fd7\uff0c\u5982\u9700\u5173\u95ed\u65e5\u5fd7\uff0c\u53ef\u901a\u8fc7\u63a5\u53e3\u8c03\u6574\u65e5\u5fd7\u7ea7\u522b\u3002 \n-- Bugly Release version supports printing logs. \n-- If you need to turn off the logs, you can adjust the log level through the interface."

    new-array v4, v2, [Ljava/lang/Object;

    .line 51
    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 52
    const-string v3, "--------------------------------------------------------------------------------------------"

    new-array v4, v2, [Ljava/lang/Object;

    .line 53
    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 54
    :goto_0
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, " crash report start initializing..."

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 55
    const-string v3, "[init] Bugly start initializing..."

    new-array v4, v2, [Ljava/lang/Object;

    .line 56
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 57
    const-string v3, "[init] Bugly complete version: v%s"

    const-string v4, "4.4.7.8"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 58
    invoke-static {v5, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 59
    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 60
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v3

    .line 61
    invoke-static {p0}, Lcom/tencent/bugly/proguard/h3;->a(Landroid/content/Context;)V

    .line 62
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->Q()Ljava/lang/String;

    .line 63
    invoke-static {p0}, Lcom/tencent/bugly/proguard/eb;->a(Landroid/content/Context;)V

    .line 64
    sget-object v4, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    invoke-static {p0, v4}, Lcom/tencent/bugly/proguard/e4;->a(Landroid/content/Context;Ljava/util/List;)Lcom/tencent/bugly/proguard/e4;

    move-result-object v4

    sput-object v4, Lcom/tencent/bugly/proguard/rc;->j:Lcom/tencent/bugly/proguard/e4;

    .line 65
    invoke-static {p0}, Lcom/tencent/bugly/proguard/rh;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/rh;

    .line 66
    sget-object v4, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    invoke-static {p0, v4}, Lcom/tencent/bugly/proguard/pg;->a(Landroid/content/Context;Ljava/util/List;)Lcom/tencent/bugly/proguard/pg;

    .line 67
    invoke-static {p0}, Lcom/tencent/bugly/proguard/q3;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/q3;

    move-result-object v4

    .line 68
    sput-boolean v1, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 69
    invoke-static {v3}, Lcom/tencent/bugly/proguard/rc;->a(Lcom/tencent/bugly/proguard/l2;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 70
    sput-boolean v2, Lcom/tencent/bugly/proguard/rc;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    .line 71
    :cond_4
    :try_start_4
    invoke-virtual {v3, p1}, Lcom/tencent/bugly/proguard/l2;->e(Ljava/lang/String;)V

    .line 72
    const-string v1, "[param] Set APP ID:%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v6

    .line 73
    invoke-static {v5, v1, v6}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 74
    invoke-static {p3, v3}, Lcom/tencent/bugly/proguard/rc;->a(Lcom/tencent/bugly/proguard/b2;Lcom/tencent/bugly/proguard/l2;)V

    .line 75
    sget-object v1, Lcom/tencent/bugly/common/network/NetworkWatcher;->INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;

    invoke-virtual {v1}, Lcom/tencent/bugly/common/network/NetworkWatcher;->init()V

    move v1, v2

    .line 76
    :goto_1
    sget-object v5, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ge v1, v5, :cond_6

    .line 77
    :try_start_5
    sget-object v5, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/c1;

    iget v5, v5, Lcom/tencent/bugly/proguard/c1;->a:I

    invoke-virtual {v4, v5}, Lcom/tencent/bugly/proguard/q3;->a(I)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 78
    sget-object v5, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/c1;

    invoke-virtual {v5, p0, p2, p3}, Lcom/tencent/bugly/proguard/c1;->a(Landroid/content/Context;ZLcom/tencent/bugly/proguard/b2;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v5

    .line 79
    :try_start_6
    sget-object v6, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v6, v5}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 80
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 81
    :cond_6
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object p2

    .line 82
    iget-object v1, p2, Lcom/tencent/bugly/proguard/l2;->O:Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v4, v1, 0x1

    .line 83
    const-string v5, "Bugly_Native"

    .line 84
    iget-object p2, p2, Lcom/tencent/bugly/proguard/l2;->O:Ljava/lang/String;

    if-eqz v1, :cond_7

    move-object p2, v5

    .line 85
    :cond_7
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v1

    invoke-virtual {v1, p2, v4}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->tryLoadSo(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_8

    .line 86
    const-string p2, "Failed to load so: %s"

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v1

    .line 87
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, p2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_3

    .line 88
    :cond_8
    const-string p2, "Success to load so: %s"

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v1

    .line 89
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, p2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 90
    :goto_3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/h2;->b(Landroid/content/Context;)V

    .line 91
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->J()V

    .line 92
    invoke-static {p0}, Lcom/tencent/bugly/proguard/se;->a(Landroid/content/Context;)V

    .line 93
    invoke-static {}, Lcom/tencent/bugly/proguard/l5;->f()Lcom/tencent/bugly/proguard/l5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l5;->b()V

    .line 94
    invoke-static {p0}, Lcom/tencent/bugly/proguard/rc;->b(Landroid/content/Context;)V

    .line 95
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 96
    invoke-static {p0, p3}, Lcom/tencent/bugly/proguard/sa;->b(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;)V

    if-eqz p3, :cond_9

    .line 97
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/b2;->c()J

    move-result-wide p0

    goto :goto_4

    :cond_9
    const-wide/16 p0, 0x0

    .line 98
    :goto_4
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Lcom/tencent/bugly/proguard/pg;->a(J)V

    .line 99
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p0

    new-instance p1, Lcom/tencent/bugly/proguard/rc$a;

    invoke-direct {p1}, Lcom/tencent/bugly/proguard/rc$a;-><init>()V

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    .line 100
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p0

    .line 101
    invoke-static {p4, p5, p0, p1, v2}, Lcom/tencent/bugly/proguard/ta;->a(JJZ)V

    .line 102
    const-string p0, "[init] Bugly initialization finished."

    new-array p1, v2, [Ljava/lang/Object;

    .line 103
    sget-object p2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p2, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit v0

    return-void

    :goto_5
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p0
.end method

.method public static a(Lcom/tencent/bugly/proguard/b2;Lcom/tencent/bugly/proguard/l2;)V
    .locals 10

    if-nez p0, :cond_0

    return-void

    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->d()Ljava/lang/String;

    move-result-object v0

    .line 114
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x64

    if-nez v1, :cond_2

    .line 115
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_1

    .line 116
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 117
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v4, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 118
    const-string v4, "appVersion %s length is over limit %d substring to %s"

    invoke-static {v4, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object v0, v1

    .line 119
    :cond_1
    iput-object v0, p1, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    .line 120
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->d()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[param] Set App version: %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 121
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->s()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 122
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->a()Ljava/lang/String;

    move-result-object v0

    .line 123
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 124
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_3

    .line 125
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 126
    const-string v4, "appChannel %s length is over limit %d substring to %s"

    .line 127
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v0, v5, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 128
    invoke-static {v4, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    .line 129
    :cond_3
    :goto_0
    sget-object v4, Lcom/tencent/bugly/proguard/rc;->j:Lcom/tencent/bugly/proguard/e4;

    const-string v6, "app_channel"

    .line 130
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v5, 0x22c

    .line 131
    invoke-virtual/range {v4 .. v9}, Lcom/tencent/bugly/proguard/e4;->a(ILjava/lang/String;[BLcom/tencent/bugly/proguard/d4;Z)Z

    .line 132
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/l2;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 133
    :cond_4
    sget-object v0, Lcom/tencent/bugly/proguard/rc;->j:Lcom/tencent/bugly/proguard/e4;

    const/4 v1, 0x0

    const/4 v4, 0x1

    const/16 v5, 0x22c

    .line 134
    invoke-virtual {v0, v5, v1, v4}, Lcom/tencent/bugly/proguard/e4;->a(ILcom/tencent/bugly/proguard/d4;Z)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 135
    const-string v1, "app_channel"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_5

    .line 136
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p1, v1}, Lcom/tencent/bugly/proguard/l2;->d(Ljava/lang/String;)V

    .line 137
    :cond_5
    :goto_1
    const-string v0, "[param] Set App channel: %s"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 138
    :goto_2
    sget-boolean v1, Lcom/tencent/bugly/proguard/rc;->i:Z

    if-eqz v1, :cond_6

    .line 139
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    :cond_6
    :goto_3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->b()Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_7

    .line 143
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 144
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v4, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 145
    const-string v4, "appPackageName %s length is over limit %d substring to %s"

    invoke-static {v4, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object v0, v1

    .line 146
    :cond_7
    iput-object v0, p1, Lcom/tencent/bugly/proguard/l2;->e:Ljava/lang/String;

    .line 147
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->b()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[param] Set App package: %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 148
    :cond_8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 149
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_9

    .line 150
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v2, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 152
    const-string v2, "deviceId %s length is over limit %d substring to %s"

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object v0, v1

    .line 153
    :cond_9
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/l2;->i(Ljava/lang/String;)V

    .line 154
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[param] Set device ID: %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 155
    :cond_a
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 156
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/l2;->j(Ljava/lang/String;)V

    .line 157
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[param] Set device model: %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 158
    :cond_b
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->t()Z

    move-result v0

    iput-boolean v0, p1, Lcom/tencent/bugly/proguard/l2;->i:Z

    .line 159
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b2;->l()Z

    move-result p0

    .line 160
    sput-boolean p0, Lcom/tencent/bugly/proguard/eb;->i:Z

    return-void
.end method

.method public static declared-synchronized a(Lcom/tencent/bugly/proguard/c1;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/rc;

    monitor-enter v0

    .line 161
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    sget-object v1, Lcom/tencent/bugly/proguard/rc;->d:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static a(Lcom/tencent/bugly/proguard/l2;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/l2;->S:Ljava/util/List;

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    .line 2
    const-string v1, "bugly"

    invoke-interface {p0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object p0

    .line 4
    const-string v1, "crash_report"

    invoke-virtual {p0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object p0

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 5
    instance-of v2, p0, Lcom/tencent/bugly/proguard/s3;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/tencent/bugly/proguard/s3;

    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/s3;->b()Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_1

    .line 7
    new-array p0, v1, [Ljava/lang/Object;

    const-string v1, "crash report is disabled, please modify your project\'s setting"

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    :cond_1
    return v1
.end method

.method public static b(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/rc;->a()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setStage(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/tencent/bugly/proguard/fi;->c()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setTestLabel(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/bugly/proguard/fi;->a()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setCaseLabel(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    .line 37
    move-result-object p0

    .line 38
    .line 39
    new-instance v0, Lcom/tencent/bugly/proguard/ed;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ed;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/g;->a(Lcom/tencent/bugly/proguard/y9;)V

    .line 46
    return-void
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
