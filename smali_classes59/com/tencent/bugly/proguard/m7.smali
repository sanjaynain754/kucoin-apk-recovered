.class public Lcom/tencent/bugly/proguard/m7;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "Unknown"

.field public static final b:Ljava/lang/String; = "Debug"

.field public static final c:Ljava/lang/String; = "Gray"

.field public static final d:Ljava/lang/String; = "Release"

.field public static final e:Ljava/lang/String; = "RMonitor_meta"

.field public static f:Z

.field public static final g:Lcom/tencent/bugly/common/meta/UserMeta;

.field public static h:Z

.field public static volatile i:J

.field public static volatile j:J

.field public static k:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/meta/UserMeta;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/common/meta/UserMeta;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    sput-boolean v0, Lcom/tencent/bugly/proguard/m7;->h:Z

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    sput-wide v0, Lcom/tencent/bugly/proguard/m7;->i:J

    .line 15
    .line 16
    sput-wide v0, Lcom/tencent/bugly/proguard/m7;->j:J

    .line 17
    .line 18
    .line 19
    const-wide/32 v0, 0x1b7740

    .line 20
    .line 21
    sput-wide v0, Lcom/tencent/bugly/proguard/m7;->k:J

    .line 22
    return-void
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

.method public static a()J
    .locals 2

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->h()V

    .line 12
    sget-wide v0, Lcom/tencent/bugly/proguard/m7;->i:J

    return-wide v0
.end method

.method public static a(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    return-void

    .line 13
    :cond_0
    sput-wide p0, Lcom/tencent/bugly/proguard/m7;->k:J

    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "setCacheDataInterval, interval: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "RMonitor_meta"

    filled-new-array {p1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 2
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v1

    .line 3
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/base/config/b;->a(Lcom/tencent/bugly/common/meta/UserMeta;)V

    .line 4
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/config/b;->a(Landroid/os/Looper;)V

    .line 5
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "init ConfigFetcher, from: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", userMeta: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "RMonitor_meta"

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/tencent/rmonitor/base/config/c$a;)V
    .locals 0

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->a(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/base/config/b;->a(Lcom/tencent/rmonitor/base/config/c$a;)V

    return-void
.end method

.method public static a(Z)V
    .locals 3

    .line 9
    sput-boolean p0, Lcom/tencent/bugly/proguard/m7;->h:Z

    .line 10
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "enable sub process fetch config from server: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "RMonitor_meta"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public static b()J
    .locals 6

    .line 7
    sget-wide v0, Lcom/tencent/bugly/proguard/m7;->j:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sget-wide v4, Lcom/tencent/bugly/proguard/m7;->j:J

    sub-long/2addr v0, v4

    goto :goto_0

    :cond_0
    move-wide v0, v2

    :goto_0
    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    return-wide v2

    :cond_1
    return-wide v0
.end method

.method public static b(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/tencent/bugly/proguard/m7;->f:Z

    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 2

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 3
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    iput-object p0, v0, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 5
    const-string/jumbo v1, "setAppID, appID: "

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 6
    const-string v1, "RMonitor_meta"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static c()J
    .locals 2

    .line 6
    sget-wide v0, Lcom/tencent/bugly/proguard/m7;->k:J

    return-wide v0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 2
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    iput-object p0, v0, Lcom/tencent/bugly/common/meta/UserMeta;->appKey:Ljava/lang/String;

    .line 3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 4
    const-string/jumbo v1, "setAppKey, appKey: "

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 5
    const-string v1, "RMonitor_meta"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static d()Landroid/content/SharedPreferences;
    .locals 4

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 9
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/ig;->a()Lcom/tencent/bugly/proguard/ig;

    move-result-object v1

    const-string v2, "BUGLY_COMMON_VALUES"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/bugly/proguard/ig;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-string v0, "Gray"

    const-string v1, "Release"

    const-string v2, "Unknown"

    const-string v3, "Debug"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_1

    .line 2
    aget-object v3, v0, v2

    .line 3
    invoke-static {v3, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/meta/UserMeta;->setAppVersionMode(Ljava/lang/String;)V

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_1
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 6
    const-string/jumbo v2, "setAppVersionMode, appVersionMode: "

    invoke-static {v2, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 7
    const-string v2, "RMonitor_meta"

    filled-new-array {v2, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return v1
.end method

.method public static e()Lcom/tencent/bugly/common/meta/UserMeta;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {v0}, Lcom/tencent/bugly/common/meta/UserMeta;->getUserSetUniqueID()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/meta/UserMeta;->setUniqueID(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 5
    const-string/jumbo v1, "setDeviceID, deviceID: "

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 6
    const-string v1, "RMonitor_meta"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static f()Z
    .locals 1

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/common/utils/ProcessUtil;->isMainProcess(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 8
    :cond_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/m7;->h:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {v0}, Lcom/tencent/bugly/common/meta/UserMeta;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/meta/UserMeta;->setModel(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/ie;->k()Lcom/tencent/bugly/proguard/ie;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/ie;->b(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 5
    const-string/jumbo v1, "setDeviceModel, deviceModel: "

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 6
    const-string v1, "RMonitor_meta"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static g(Ljava/lang/String;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    if-nez p0, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    iput-object v1, v0, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    .line 3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 4
    const-string/jumbo v1, "setProductVersion, productVersion: "

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 5
    const-string v1, "RMonitor_meta"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void
.end method

.method public static g()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/m7;->f:Z

    return v0
.end method

.method public static h()V
    .locals 4

    .line 5
    sget-wide v0, Lcom/tencent/bugly/proguard/m7;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/bugly/proguard/m7;->i:J

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/bugly/proguard/m7;->j:J

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_meta"

    const-string v2, "markAppLaunch"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 2

    if-nez p0, :cond_0

    .line 1
    const-string p0, ""

    .line 2
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/m7;->g:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, v0, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x0

    return p0

    .line 3
    :cond_1
    iput-object p0, v0, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "setUserID, userID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "RMonitor_meta"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method
