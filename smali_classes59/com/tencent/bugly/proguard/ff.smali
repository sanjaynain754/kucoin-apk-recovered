.class public Lcom/tencent/bugly/proguard/ff;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/bf;


# static fields
.field public static final Y:Ljava/lang/String; = "RMonitor_manager_sdk"


# direct methods
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
    .locals 4

    .line 7
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "abolish fail for "

    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RMonitor_manager_sdk"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 9
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/yh;->c()Lcom/tencent/bugly/proguard/yh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/yh;->a()V

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/mb;->a()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 7

    .line 20
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    if-nez p2, :cond_0

    .line 21
    const-string/jumbo p1, "null"

    :goto_0
    move-object v6, p1

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :goto_1
    const-string v1, "RMonitor_manager_sdk"

    const-string v3, ", invalid property, key = "

    const-string v5, ", value = "

    move-object v2, p0

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/Object;Z)V
    .locals 9

    .line 23
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    if-nez p2, :cond_0

    .line 25
    const-string/jumbo p1, "null"

    :goto_0
    move-object v6, p1

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :goto_1
    const-string v7, ", ret = "

    .line 26
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v8

    const-string v1, "RMonitor_manager_sdk"

    const-string v3, ", key = "

    const-string v5, ", value = "

    move-object v2, p0

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object p0

    .line 27
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public static a(ILjava/lang/Object;)Z
    .locals 2

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/te;->a()Lcom/tencent/bugly/proguard/te;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/te;->b(I)Lcom/tencent/bugly/proguard/w9;

    move-result-object v0

    const-string v1, "addProperty"

    if-eqz v0, :cond_0

    .line 15
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/w9;->a(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v1, p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v1, p0, p1, v0}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;Z)V

    .line 18
    invoke-static {}, Lcom/tencent/rmonitor/sla/b$c;->a()Lcom/tencent/rmonitor/sla/b;

    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/b;->b()V

    return v0
.end method

.method public static a(ILjava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/te;->a()Lcom/tencent/bugly/proguard/te;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/te;->c(I)Lcom/tencent/bugly/proguard/z9;

    move-result-object v0

    const-string/jumbo v1, "setProperty"

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/z9;->a(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v1, p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-static {v1, p0, p1, v0}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;Z)V

    .line 5
    invoke-static {}, Lcom/tencent/rmonitor/sla/b$c;->a()Lcom/tencent/rmonitor/sla/b;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/b;->b()V

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/tencent/rmonitor/custom/a;->putUserData(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->INSTANCE:Lcom/tencent/rmonitor/manager/RMonitorLauncher;

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->checkAllDesiredPluginStarted(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static b()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/sla/b$c;->a()Lcom/tencent/rmonitor/sla/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/tencent/rmonitor/sla/b;->g()V

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->h()V

    .line 4
    sget-boolean v0, Lcom/tencent/bugly/proguard/m7;->f:Z

    const-string v1, "RMonitor_manager_sdk"

    if-eqz v0, :cond_0

    .line 5
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "start monitors fail for app in standalone mode."

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p0, :cond_3

    .line 6
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "start monitor fail for "

    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->d()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 9
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/yh;->c()Lcom/tencent/bugly/proguard/yh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/tencent/bugly/proguard/yh;->a(Ljava/util/List;Z)V

    .line 10
    invoke-static {p0}, Lcom/tencent/bugly/proguard/mb;->a(Ljava/util/List;)V

    return-void

    .line 11
    :cond_3
    :goto_0
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "start monitor fail for list is null or empty."

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public static b(ILjava/lang/Object;)Z
    .locals 2

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/te;->a()Lcom/tencent/bugly/proguard/te;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/te;->b(I)Lcom/tencent/bugly/proguard/w9;

    move-result-object v0

    const-string/jumbo v1, "removeProperty"

    if-eqz v0, :cond_0

    .line 14
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/w9;->b(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v1, p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-static {v1, p0, p1, v0}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;Z)V

    return v0
.end method

.method public static c()Lcom/tencent/rmonitor/custom/ICustomDataEditor;
    .locals 1

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/custom/a;->getUserData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "RMonitor_manager_sdk"

    if-eqz p0, :cond_2

    .line 7
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 9
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "stop monitor fail for "

    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->d()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 10
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/yh;->c()Lcom/tencent/bugly/proguard/yh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/tencent/bugly/proguard/yh;->a(Ljava/util/List;Z)V

    .line 11
    invoke-static {p0}, Lcom/tencent/bugly/proguard/mb;->b(Ljava/util/List;)V

    return-void

    .line 12
    :cond_2
    :goto_0
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "stop monitor fail for list is null or empty."

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public static c(ILjava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/te;->a()Lcom/tencent/bugly/proguard/te;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/te;->a(I)Lcom/tencent/bugly/proguard/v9;

    move-result-object v0

    const-string/jumbo v1, "setProperty"

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/v9;->a(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v1, p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-static {v1, p0, p1, v0}, Lcom/tencent/bugly/proguard/ff;->a(Ljava/lang/String;ILjava/lang/Object;Z)V

    .line 5
    invoke-static {}, Lcom/tencent/rmonitor/sla/b$c;->a()Lcom/tencent/rmonitor/sla/b;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/b;->b()V

    return v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/custom/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    return v0
.end method

.method public static e(Ljava/lang/String;)V
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

.method public static f(Ljava/lang/String;)V
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
