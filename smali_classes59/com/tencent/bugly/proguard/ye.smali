.class public Lcom/tencent/bugly/proguard/ye;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/bf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ye$a;
    }
.end annotation


# static fields
.field public static final Y:Ljava/lang/String; = "RMonitor_manager_sdk"

.field public static Z:Lcom/tencent/bugly/proguard/h4;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

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

.method public static a(Landroid/app/Activity;)Lcom/tencent/bugly/proguard/h4;
    .locals 0

    .line 20
    invoke-static {p0}, Lcom/tencent/bugly/proguard/i4;->b(Landroid/app/Activity;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 21
    sget-object p0, Lcom/tencent/bugly/proguard/ye;->Z:Lcom/tencent/bugly/proguard/h4;

    if-nez p0, :cond_0

    .line 22
    new-instance p0, Lcom/tencent/bugly/proguard/i4;

    invoke-direct {p0}, Lcom/tencent/bugly/proguard/i4;-><init>()V

    sput-object p0, Lcom/tencent/bugly/proguard/ye;->Z:Lcom/tencent/bugly/proguard/h4;

    .line 23
    :cond_0
    sget-object p0, Lcom/tencent/bugly/proguard/ye;->Z:Lcom/tencent/bugly/proguard/h4;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a()V
    .locals 0

    .line 18
    invoke-static {}, Lcom/tencent/bugly/proguard/ff;->a()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 14
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->b(Ljava/util/List;)V

    return-void
.end method

.method public static a(I)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 16
    invoke-static {p0}, Lcom/tencent/bugly/proguard/de;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ye;->d(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static a(ILjava/lang/Object;)Z
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static a(ILjava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/lang/String;I)Z
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    const-string v1, "RMonitor_manager_sdk"

    if-nez v0, :cond_0

    .line 4
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 5
    const-string v0, "beginScene sceneName["

    const-string v2, "] fail for "

    invoke-static {v0, p0, v2}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->d()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p0, v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "beginScene, sceneName: %s, mode: %s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->b(Ljava/lang/String;)V

    .line 10
    invoke-static {p1}, Lcom/tencent/bugly/proguard/de;->a(I)Ljava/lang/String;

    move-result-object p0

    .line 11
    const-string p1, "looper_metric"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/yh;->c()Lcom/tencent/bugly/proguard/yh;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/tencent/bugly/proguard/yh;->a(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 13
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->b(Ljava/util/List;)V

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/tencent/rmonitor/custom/a;->putUserData(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static a(Z)Z
    .locals 0

    .line 19
    invoke-static {p0}, Lcom/tencent/bugly/proguard/gf;->a(Z)Z

    move-result p0

    return p0
.end method

.method public static b()Lcom/tencent/rmonitor/custom/ICustomDataEditor;
    .locals 1

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->c(Ljava/util/List;)V

    return-void
.end method

.method public static b(I)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 13
    invoke-static {p0}, Lcom/tencent/bugly/proguard/yd;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ye;->e(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static b(ILjava/lang/Object;)Z
    .locals 0

    .line 9
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->b(ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b(Ljava/lang/String;I)Z
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    const-string v1, "RMonitor_manager_sdk"

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    const-string v0, "endScene sceneName["

    const-string v2, "] fail for "

    invoke-static {v0, p0, v2}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->d()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    .line 6
    :cond_0
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    if-eqz v0, :cond_1

    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "endScene, sceneName: %s, mode: %s"

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 8
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/tencent/bugly/proguard/g;->c(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/custom/a;->getUserData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/de;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ye;->f(Ljava/lang/String;)V

    return-void
.end method

.method public static c()Z
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    return v0
.end method

.method public static c(ILjava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->c(ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static d()V
    .locals 4
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    const-string v1, "RMonitor_manager_sdk"

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v2, "stopDisabledPlugins fail for "

    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->d()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v2, "stopDisabledPlugins"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/mb;->b()V

    return-void
.end method

.method public static d(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 8
    invoke-static {p0}, Lcom/tencent/bugly/proguard/de;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ye;->h(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 5
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/mb;->a(Ljava/lang/String;Z)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    move-result-object p0

    .line 6
    instance-of v1, p0, Lcom/tencent/bugly/proguard/df;

    if-eqz v1, :cond_0

    .line 7
    check-cast p0, Lcom/tencent/bugly/proguard/df;

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/df;->isResume()Z

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method public static e(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/de;->b(I)Ljava/util/List;

    move-result-object p0

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->b(Ljava/util/List;)V

    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {p0, v1}, Lcom/tencent/bugly/proguard/mb;->a(Ljava/lang/String;Z)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    move-result-object p0

    .line 3
    instance-of v0, p0, Lcom/tencent/bugly/proguard/df;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Lcom/tencent/bugly/proguard/df;

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/df;->isRunning()Z

    move-result p0

    return p0

    :cond_1
    return v1
.end method

.method public static f(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/de;->b(I)Ljava/util/List;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->c(Ljava/util/List;)V

    return-void
.end method

.method public static f(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/mb;->a(Ljava/lang/String;Z)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    move-result-object p0

    .line 4
    instance-of v0, p0, Lcom/tencent/bugly/proguard/df;

    if-eqz v0, :cond_0

    .line 5
    check-cast p0, Lcom/tencent/bugly/proguard/df;

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/df;->pause()V

    :cond_0
    return-void
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/custom/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static h(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/mb;->a(Ljava/lang/String;Z)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    instance-of v0, p0, Lcom/tencent/bugly/proguard/df;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lcom/tencent/bugly/proguard/df;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/df;->resume()V

    .line 15
    :cond_0
    return-void
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

.method public static i(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->b(Ljava/util/List;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static j(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->c(Ljava/util/List;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
