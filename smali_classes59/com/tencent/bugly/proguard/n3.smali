.class public Lcom/tencent/bugly/proguard/n3;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/n3$d;
    }
.end annotation


# static fields
.field public static final a:I = 0x3eb

.field public static final b:I = 0xbb8

.field public static c:Z = false

.field public static d:Z = true

.field public static e:Lcom/tencent/bugly/proguard/u3;

.field public static f:Z

.field public static g:Z

.field public static h:Lcom/tencent/bugly/proguard/zf;

.field public static i:Lcom/tencent/bugly/proguard/qh;

.field public static j:Lcom/tencent/bugly/proguard/n3$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/n3$d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/n3$d;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/n3;->j:Lcom/tencent/bugly/proguard/n3$d;

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

.method public static synthetic a()Lcom/tencent/bugly/proguard/zf;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->h:Lcom/tencent/bugly/proguard/zf;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 67
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "getUserDataValue args context should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    .line 68
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 69
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(I)V
    .locals 1

    .line 126
    :try_start_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->resetLogLevel(I)V

    .line 127
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAndroidLogLevel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 129
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 70
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUserData args context should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 71
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 72
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUserData args key should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 73
    :cond_1
    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 74
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUserData args value should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 75
    :cond_2
    const-string v1, "[a-zA-Z[0-9]_]+"

    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 76
    const-string/jumbo p0, "putUserData args key should match [a-zA-Z[0-9]_]+  {"

    const-string/jumbo p2, "}"

    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 77
    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 78
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v1

    const-string v2, "C03_"

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Lcom/tencent/rmonitor/custom/a;->putUserData(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    .line 79
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v1, p1, p2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "[param] set user ret: %s, data: %s - %s"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 80
    const-string v1, "_userParam_"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0xfa0

    goto :goto_0

    :cond_4
    const/16 v1, 0xc8

    .line 81
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_5

    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 83
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo v4, "user data value length over limit %d , has been cutted!"

    invoke-static {v3, v4, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 84
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 85
    :cond_5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 87
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object v0

    .line 88
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v2, "[param] replace user data: %s - %s"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 89
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/n3;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 90
    :cond_6
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->G()I

    move-result v0

    const/16 v1, 0x1f4

    const/16 v2, 0x32

    if-lt v0, v1, :cond_7

    .line 91
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    .line 92
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo p2, "user data size is over limit %d , will drop this new key %s"

    invoke-static {p1, p2, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 93
    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_8

    .line 94
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    .line 95
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo p2, "user data key length over limit %d , will drop this new key %s"

    invoke-static {p1, p2, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 96
    :cond_8
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object v0

    .line 97
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v2, "[param] set user data: %s - %s"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 98
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/n3;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    invoke-static {}, Lcom/tencent/bugly/proguard/l5;->f()Lcom/tencent/bugly/proguard/l5;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->i()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;J)V
    .locals 7

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->h()V

    move-wide v0, p4

    .line 9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p4

    if-nez p0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    sget-boolean v2, Lcom/tencent/bugly/proguard/n3;->c:Z

    if-eqz v2, :cond_1

    :goto_0
    return-void

    .line 11
    :cond_1
    sget-boolean v2, Lcom/tencent/bugly/proguard/m7;->f:Z

    if-eqz v2, :cond_2

    .line 12
    const-string p0, "eup"

    const-string p1, "init bugly fail for app in standalone mode."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 13
    :cond_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/m7;->b(Ljava/lang/String;)Z

    const/4 v2, 0x1

    .line 14
    sput v2, Lcom/tencent/bugly/proguard/k3;->v:I

    .line 15
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v3

    iput-boolean v2, v3, Lcom/tencent/bugly/proguard/l2;->k0:Z

    .line 16
    sput-boolean v2, Lcom/tencent/bugly/proguard/k3;->o:Z

    const-wide/32 v3, 0x1499700

    .line 17
    sput-wide v3, Lcom/tencent/bugly/proguard/pg;->l:J

    .line 18
    sput-object p3, Lcom/tencent/bugly/proguard/n3;->e:Lcom/tencent/bugly/proguard/u3;

    .line 19
    const-string v3, "eup"

    sput-object v3, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 20
    sget-boolean v3, Lcom/tencent/bugly/proguard/n3;->f:Z

    if-nez v3, :cond_3

    .line 21
    const-string v3, "https://android.rqd.qq.com/analytics/async"

    sput-object v3, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->w:Ljava/lang/String;

    .line 22
    const-string v3, "https://android.rqd.qq.com/analytics/async"

    sput-object v3, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->x:Ljava/lang/String;

    :cond_3
    move-object v3, p3

    .line 23
    new-instance p3, Lcom/tencent/bugly/proguard/b2;

    invoke-direct {p3}, Lcom/tencent/bugly/proguard/b2;-><init>()V

    .line 24
    monitor-enter p3

    .line 25
    :try_start_0
    iput-wide v0, p3, Lcom/tencent/bugly/proguard/b2;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p3

    if-eqz v3, :cond_4

    .line 26
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->c()Lcom/tencent/feedback/eup/CrashHandleListener;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/n3;->a(Lcom/tencent/feedback/eup/CrashHandleListener;)V

    .line 27
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->k()Lcom/tencent/feedback/upload/UploadHandleListener;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/n3;->a(Lcom/tencent/feedback/upload/UploadHandleListener;)V

    .line 28
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->i()I

    move-result v0

    const v1, 0x5265c00

    mul-int/2addr v0, v1

    int-to-long v0, v0

    sput-wide v0, Lcom/tencent/bugly/proguard/k3;->D:J

    .line 29
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->h()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/bugly/proguard/k3;->E:Ljava/lang/String;

    .line 30
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->q()Z

    move-result v0

    sput-boolean v0, Lcom/tencent/bugly/proguard/k3;->F:Z

    .line 31
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->j()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/bugly/proguard/k3;->G:Ljava/lang/String;

    .line 32
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->d()I

    move-result v0

    sput v0, Lcom/tencent/bugly/proguard/k3;->H:I

    .line 33
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->f()I

    move-result v0

    sput v0, Lcom/tencent/bugly/proguard/k3;->x:I

    .line 34
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->g()I

    move-result v0

    sput v0, Lcom/tencent/bugly/proguard/k3;->B:I

    .line 35
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->p()Z

    move-result v0

    sput-boolean v0, Lcom/tencent/bugly/proguard/k3;->w:Z

    .line 36
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->s()Z

    move-result v0

    sput-boolean v0, Lcom/tencent/bugly/proguard/k3;->I:Z

    .line 37
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->l()Z

    move-result v0

    invoke-virtual {p3, v0}, Lcom/tencent/bugly/proguard/b2;->c(Z)Lcom/tencent/bugly/proguard/b2;

    .line 38
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->n()Z

    move-result v0

    invoke-virtual {p3, v0}, Lcom/tencent/bugly/proguard/b2;->e(Z)Lcom/tencent/bugly/proguard/b2;

    .line 39
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->r()Z

    move-result v0

    invoke-virtual {p3, v0}, Lcom/tencent/bugly/proguard/b2;->k(Z)Lcom/tencent/bugly/proguard/b2;

    .line 40
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->d:Z

    invoke-virtual {p3, v0}, Lcom/tencent/bugly/proguard/b2;->g(Z)Lcom/tencent/bugly/proguard/b2;

    .line 41
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->l()Z

    move-result v0

    invoke-virtual {p3, v0}, Lcom/tencent/bugly/proguard/b2;->c(Z)Lcom/tencent/bugly/proguard/b2;

    .line 42
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/u3;->r()Z

    move-result v1

    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/l2;->i:Z

    .line 43
    :cond_4
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->g:Z

    if-nez v0, :cond_7

    .line 44
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 45
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    const/4 v3, 0x0

    move v4, v3

    .line 47
    :goto_1
    array-length v5, v1

    if-ge v3, v5, :cond_6

    .line 48
    aget-char v5, v1, v3

    const/16 v6, 0x2e

    if-ne v5, v6, :cond_5

    add-int/lit8 v4, v4, 0x1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    const/4 v1, 0x3

    if-ge v4, v1, :cond_7

    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->f0:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v1

    iput-object v0, v1, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    .line 51
    const-string/jumbo v1, "rqdp{ RQD version: %s }"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 52
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 53
    :cond_7
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->j:Lcom/tencent/bugly/proguard/n3$d;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/rc;->a(Lcom/tencent/bugly/proguard/c1;)V

    .line 54
    invoke-static/range {p0 .. p5}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/b2;J)V

    .line 55
    new-instance p0, Lcom/tencent/bugly/proguard/n3$c;

    invoke-direct {p0}, Lcom/tencent/bugly/proguard/n3$c;-><init>()V

    invoke-static {p0}, Lcom/tencent/bugly/proguard/wf;->a(Lcom/tencent/bugly/proguard/wf$a;)V

    .line 56
    sput-boolean v2, Lcom/tencent/bugly/proguard/n3;->c:Z

    return-void

    :catchall_0
    move-exception v0

    move-object p0, v0

    monitor-exit p3

    throw p0
.end method

.method public static a(Landroid/content/Context;ZZ)V
    .locals 0

    .line 64
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/l2;->a(ZZ)V

    return-void
.end method

.method public static a(Lcom/tencent/feedback/eup/CrashHandleListener;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/n3$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/n3$a;-><init>(Lcom/tencent/feedback/eup/CrashHandleListener;)V

    sput-object v0, Lcom/tencent/bugly/proguard/n3;->h:Lcom/tencent/bugly/proguard/zf;

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 4
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->h:Lcom/tencent/bugly/proguard/zf;

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k3;->a(Lcom/tencent/bugly/proguard/zf;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Lcom/tencent/feedback/upload/UploadHandleListener;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/n3$b;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/n3$b;-><init>(Lcom/tencent/feedback/upload/UploadHandleListener;)V

    sput-object v0, Lcom/tencent/bugly/proguard/n3;->i:Lcom/tencent/bugly/proguard/qh;

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 7
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->i:Lcom/tencent/bugly/proguard/qh;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/rh;->c:Lcom/tencent/bugly/proguard/qh;

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V
    .locals 1

    .line 130
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->setLogProxy(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 2

    .line 121
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 122
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/u7;->a(Ljava/lang/String;)V

    .line 123
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 124
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setAppHotPatchNum(Ljava/lang/String;)Z

    .line 125
    :cond_1
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v0, "set app hot patch num: %s"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Ljava/lang/String;J)V
    .locals 1

    .line 65
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0, p0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setCrashThreadLocalKey(Ljava/lang/String;J)Z

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 58
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 59
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not post crash caught because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 60
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/n5;->c(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 104
    invoke-static {p0}, Lcom/tencent/bugly/proguard/pi;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static a(ZJ)V
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/sa;->a(ZJ)V

    return-void
.end method

.method public static a(ZZZ)V
    .locals 2

    .line 100
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->c:Z

    if-nez v0, :cond_0

    .line 101
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "NativeCrashReport has not been initialed! pls to call method \'initNativeCrashReport\' first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 102
    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "start to create a native crash for test!"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 103
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcom/tencent/bugly/proguard/k3;->a(ZZZ)V

    return-void
.end method

.method public static a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z
    .locals 8

    .line 61
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move v7, p4

    .line 62
    invoke-virtual/range {v0 .. v7}, Lcom/tencent/bugly/proguard/k3;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BZZ)V

    const/4 p0, 0x1

    return p0

    .line 63
    :cond_0
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not handle catch exception because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0
.end method

.method public static a(Z)Z
    .locals 1

    .line 120
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->c()Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->a(Z)Z

    move-result p0

    return p0
.end method

.method public static a([Ljava/lang/String;)Z
    .locals 7

    .line 105
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    if-eqz p0, :cond_7

    .line 106
    array-length v0, p0

    const/16 v2, 0xa

    if-le v0, v2, :cond_1

    goto :goto_2

    .line 107
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 108
    array-length v2, p0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_4

    aget-object v4, p0, v3

    .line 109
    invoke-static {v4}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 110
    :cond_2
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 112
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 113
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-gtz p0, :cond_5

    .line 114
    new-array p0, v1, [Ljava/lang/Object;

    const-string/jumbo v0, "setAdditionalAttachmentPaths failed for all empty files"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 115
    :cond_5
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 116
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setAdditionalAttachmentPaths(Ljava/util/ArrayList;)Z

    move-result p0

    return p0

    .line 117
    :cond_6
    new-array p0, v1, [Ljava/lang/Object;

    const-string/jumbo v0, "setAdditionalAttachmentPaths failed, NativeCrashHandler is null"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 118
    :cond_7
    :goto_2
    new-array p0, v1, [Ljava/lang/Object;

    const-string/jumbo v0, "setAdditionalAttachmentPaths failed for params check"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 119
    :cond_8
    :goto_3
    new-array p0, v1, [Ljava/lang/Object;

    const-string/jumbo v0, "setAdditionalAttachmentPaths failed."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1
.end method

.method public static synthetic b()Lcom/tencent/bugly/proguard/qh;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/n3;->i:Lcom/tencent/bugly/proguard/qh;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 5
    new-array p0, p0, [Ljava/lang/Object;

    const-string/jumbo p1, "removeUserData args context should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 7
    :cond_1
    const-string v0, "C03_"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/custom/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "[param] remove user data: %s - %s"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/l5;->f()Lcom/tencent/bugly/proguard/l5;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->i()V

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->putKeyValueToNative(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/l2;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->c(Ljava/lang/String;)Z

    return-void
.end method

.method public static b(Z)V
    .locals 0

    .line 13
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->a(Z)V

    return-void
.end method

.method public static c()Ljava/lang/String;
    .locals 2

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Can not get device id, bugly has not been initialized."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    const-string v0, ""

    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    if-nez p0, :cond_0

    .line 11
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setAppChannel args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 12
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->d(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 14
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppChannel(Ljava/lang/String;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->d(Ljava/lang/String;)Z

    return-void
.end method

.method public static c(Z)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    .line 2
    const-string/jumbo p0, "startANRMonitor"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 3
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->x()V

    return-void

    .line 4
    :cond_0
    const-string/jumbo p0, "stopANRMonitor"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_1
    return-void
.end method

.method public static d()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
    .locals 2

    .line 7
    sget-object v0, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->Companion:Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;->getInstance()Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;->getInstance()Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->isInitialize()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;->getInstance()Lcom/tencent/bugly/common/replay/BuglyReplayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/BuglyReplayManager;->getBuglyReplayOptions()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->f(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    const-string v0, "a13"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/fi;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setCaseLabel(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static d(Z)V
    .locals 0

    .line 2
    sput-boolean p0, Lcom/tencent/bugly/proguard/s3;->k:Z

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    invoke-static {p1}, Lcom/tencent/bugly/proguard/m7;->e(Ljava/lang/String;)Z

    .line 7
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->i(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeDeviceId(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    .line 11
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "Can not set RDM UUID if RQD has not been initialized."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 12
    :cond_0
    iput-object p0, v0, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    .line 13
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppBuildNum(Ljava/lang/String;)Z

    :cond_1
    return-void
.end method

.method public static e(Z)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->z()V

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->e()V

    :cond_1
    return-void
.end method

.method public static e()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->c:Z

    return v0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 11
    invoke-static {p1}, Lcom/tencent/bugly/proguard/m7;->f(Ljava/lang/String;)Z

    .line 12
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->j(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 14
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeDeviceModel(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static f(Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 16
    sput-boolean v0, Lcom/tencent/bugly/proguard/n3;->f:Z

    .line 17
    invoke-static {p0}, Lcom/tencent/bugly/proguard/pg;->a(Ljava/lang/String;)V

    .line 18
    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->w:Ljava/lang/String;

    .line 19
    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->x:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "URL is invalid."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static f(Z)V
    .locals 1

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->A()V

    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->f()V

    :cond_1
    return-void
.end method

.method public static f()Z
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->c:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    new-array v0, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "reRegisterHandler failed, please call initCrashReport first"

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 3
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    const-class v0, Lcom/tencent/bugly/proguard/k3;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/k3;->R:Lcom/tencent/bugly/proguard/k3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 6
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/k3;->q()V

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return v1
.end method

.method public static g()V
    .locals 2

    .line 11
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->c:Z

    if-nez v0, :cond_0

    .line 12
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "NativeCrashReport has not been initialed! pls to call method \'initNativeCrashReport\' first!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "start to create a anr crash for test!"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->C()V

    return-void
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "appVersion %s length is over limit %d substring to %s"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object p1, v0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/m7;->g(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lcom/tencent/bugly/proguard/n3;->g:Z

    .line 8
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-object p1, p0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppVersion(Ljava/lang/String;)Z

    :cond_1
    return-void
.end method

.method public static g(Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 16
    const-string v0, "a12"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/fi;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setTestLabel(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static g(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/v1;->a(Z)V

    return-void
.end method

.method public static h()V
    .locals 2

    .line 12
    sget-boolean v0, Lcom/tencent/bugly/proguard/n3;->c:Z

    if-nez v0, :cond_0

    .line 13
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "NativeCrashReport has not been initialed! pls to call method \'initNativeCrashReport\' first!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "This Crash create for Test! You can go to Bugly see more detail!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v1, "userId %s length is over limit %d substring to %s"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object p1, v0

    .line 4
    :cond_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/m7;->h(Ljava/lang/String;)Z

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->n(Ljava/lang/String;)V

    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "[user] set userId : %s"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 8
    sget-boolean p0, Lcom/tencent/bugly/proguard/sa;->d:Z

    if-eqz p0, :cond_4

    .line 9
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeUserId(Ljava/lang/String;)Z

    .line 11
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/sa;->p()V

    :cond_4
    :goto_0
    return-void
.end method

.method public static h(Z)V
    .locals 2

    .line 15
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "update standalone mode: %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 16
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->b(Z)V

    return-void
.end method

.method public static i()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->triggerUserInfoUpload()V

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
