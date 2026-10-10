.class public final Lcom/tencent/bugly/proguard/z;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/z$b;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "RMonitor_launch_impl"

.field public static final c:Ljava/lang/String; = "RMonitor_launch_monitor"

.field public static final d:Ljava/lang/String; = "RMonitor_enable_protect"

.field public static final e:I = 0x4

.field public static final f:J = 0x4e20L


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/z$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/z;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 4

    const-string v0, "install fail for application context is null, context: "

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->h()V

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    move-object v1, p0

    .line 3
    :cond_1
    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_2

    .line 4
    check-cast v1, Landroid/app/Application;

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/z$b;->a()Lcom/tencent/bugly/proguard/z;

    move-result-object p0

    .line 6
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/z;->a(Landroid/content/Context;)V

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/z$b;->a()Lcom/tencent/bugly/proguard/z;

    move-result-object p0

    .line 8
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/z;->c(Landroid/app/Application;)V

    return-void

    .line 9
    :cond_2
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "RMonitor_launch_impl"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v2, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static c()Lcom/tencent/bugly/proguard/z;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/z$b;->a()Lcom/tencent/bugly/proguard/z;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .line 11
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->e()Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "launcher_not_safe_count"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public final a(Landroid/app/Application;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_4

    .line 27
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 28
    const-string/jumbo v1, "rmonitor_app_launch_monitor_activity_before_landing"

    .line 29
    const-string v2, "array"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    .line 30
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    const/4 p1, 0x0

    .line 31
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/proguard/b0;->g()Lcom/tencent/bugly/proguard/b0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    array-length v2, p1

    if-lez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v1

    .line 32
    :goto_1
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    .line 33
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/ra;->a(Z)V

    :goto_2
    if-eqz p1, :cond_3

    .line 34
    array-length v0, p1

    if-ge v1, v0, :cond_3

    .line 35
    invoke-static {}, Lcom/tencent/bugly/proguard/b0;->g()Lcom/tencent/bugly/proguard/b0;

    move-result-object v0

    aget-object v2, p1, v1

    .line 36
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    .line 37
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/ra;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 38
    :goto_3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_launch_impl"

    const-string v2, "get rmonitor config fail "

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_4
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/z;->a:Ljava/lang/ref/WeakReference;

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->b()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 14
    :try_start_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 16
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 17
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, "RMonitor_launch_impl"

    invoke-virtual {v2, v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    const-string v2, "createFile"

    invoke-virtual {p0, v2, p1, v1, v0}, Lcom/tencent/bugly/proguard/z;->a(Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Context;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Context;)V
    .locals 11

    const-string/jumbo v0, "not null"

    const-string/jumbo v1, "null"

    if-nez p3, :cond_1

    .line 19
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 20
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v8

    if-nez p4, :cond_0

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object v10, v0

    .line 21
    :goto_0
    const-string v3, "RMonitor_launch_impl"

    const-string v5, ", fileName: "

    const-string v7, ", ret: "

    const-string v9, ", context: "

    move-object v4, p1

    move-object v6, p2

    filled-new-array/range {v3 .. v10}, [Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-virtual {v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-void

    :cond_1
    move-object v4, p1

    move-object v6, p2

    .line 23
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 24
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v8

    if-nez p4, :cond_2

    move-object v10, v1

    goto :goto_1

    :cond_2
    move-object v10, v0

    .line 25
    :goto_1
    const-string v3, "RMonitor_launch_impl"

    const-string v5, ", fileName: "

    const-string v7, ", ret: "

    const-string v9, ", context: "

    filled-new-array/range {v3 .. v10}, [Ljava/lang/String;

    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    const-string v0, "RMonitor_launch_monitor"

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->a(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a()Z
    .locals 4

    const/4 v0, 0x1

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->g()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/z;->a(I)V

    return v2

    :catchall_0
    move-exception v1

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->d()I

    move-result v1

    add-int/2addr v1, v0

    const/4 v3, 0x4

    if-le v1, v3, :cond_1

    move v2, v0

    .line 7
    :cond_1
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/z;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    .line 8
    :goto_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    const-string v3, "isLastLaunchMonitorUnSafe, t: "

    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 10
    const-string v3, "RMonitor_launch_impl"

    filled-new-array {v3, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return v0
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final b(Landroid/app/Application;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_3

    .line 21
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 22
    const-string/jumbo v1, "rmonitor_app_launch_monitor_landing_activity"

    .line 23
    const-string v2, "array"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    .line 24
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz p1, :cond_2

    .line 25
    array-length v1, p1

    if-ge v0, v1, :cond_2

    .line 26
    invoke-static {}, Lcom/tencent/bugly/proguard/b0;->g()Lcom/tencent/bugly/proguard/b0;

    move-result-object v1

    aget-object v2, p1, v0

    .line 27
    iget-object v1, v1, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    .line 28
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/ra;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 29
    :goto_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_launch_impl"

    const-string v2, "get rmonitor config fail "

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->b()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 16
    :try_start_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 18
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 19
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v3, "RMonitor_launch_impl"

    invoke-virtual {v2, v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    const-string v2, "deleteFile"

    invoke-virtual {p0, v2, p1, v1, v0}, Lcom/tencent/bugly/proguard/z;->a(Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Context;)V

    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->e()Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "launcher_is_safe"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public final c(Landroid/app/Application;)V
    .locals 1

    .line 2
    const-string v0, "RMonitor_launch_monitor"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->a(Z)V

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->i()V

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z;->d(Landroid/app/Application;)V

    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 1

    const-string v0, "RMonitor_enable_protect"

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->a(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 4

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->b()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 10
    invoke-static {v2, v3, p1}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-string v2, "isFileExist"

    invoke-virtual {p0, v2, p1, v1, v0}, Lcom/tencent/bugly/proguard/z;->a(Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Context;)V

    return v1
.end method

.method public final d()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->e()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    const-string v2, "launcher_not_safe_count"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method public final d(Landroid/app/Application;)V
    .locals 2

    .line 3
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverJellyBeanMr2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z;->b(Landroid/app/Application;)V

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z;->a(Landroid/app/Application;)V

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/b0;->g()Lcom/tencent/bugly/proguard/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/b0;->a(Landroid/app/Application;)V

    return-void

    .line 7
    :cond_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_launch_impl"

    const-string v1, "installAppLaunchMonitor fail for api level below JellyBeanMr2."

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public final e()Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->b()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v1, "RMonitor_SP"

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return-object v0
    .line 17
.end method

.method public f()Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "RMonitor_launch_monitor"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->c(Ljava/lang/String;)Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public g()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z;->e()Landroid/content/SharedPreferences;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v2, "launcher_is_safe"

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :cond_0
    return v1
    .line 16
    .line 17
.end method

.method public h()Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "RMonitor_enable_protect"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->c(Ljava/lang/String;)Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final i()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "RMonitor_enable_protect"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/z;->c(Ljava/lang/String;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/tencent/bugly/proguard/z$a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/z$a;-><init>(Lcom/tencent/bugly/proguard/z;)V

    .line 14
    .line 15
    const-wide/16 v1, 0x4e20

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
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
