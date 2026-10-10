.class public Lcom/tencent/bugly/proguard/k;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/k$a;,
        Lcom/tencent/bugly/proguard/k$b;
    }
.end annotation


# static fields
.field public static final f:Ljava/lang/String; = "RMonitor_launch_Hacker"


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/k$b;

.field public b:Z

.field public c:J

.field public d:Lcom/tencent/bugly/proguard/k$a;

.field public e:Lcom/tencent/bugly/proguard/a0;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/k$b;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/k;->b:Z

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k;->c:J

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k;->d:Lcom/tencent/bugly/proguard/k$a;

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/bugly/proguard/a0;->b:Lcom/tencent/bugly/proguard/a0;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k;->e:Lcom/tencent/bugly/proguard/a0;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Lcom/tencent/bugly/proguard/k$b;

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/k;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/k;->c:J

    return-wide p1
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/k;Lcom/tencent/bugly/proguard/a0;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/a0;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 8
    const-string v0, "android.app.ActivityThread"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 9
    const-string/jumbo v1, "sCurrentActivityThread"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 12
    const-string v3, "mH"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/Object;)Ljava/lang/reflect/Field;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/os/Handler;

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    .line 6
    :goto_0
    const-string v0, "mCallback"

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object p1
.end method

.method public final a(Lcom/tencent/bugly/proguard/a0;)V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->e:Lcom/tencent/bugly/proguard/a0;

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k;->e:Lcom/tencent/bugly/proguard/a0;

    .line 17
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->a:Lcom/tencent/bugly/proguard/k$b;

    if-eqz v0, :cond_1

    .line 18
    invoke-interface {v0, p1}, Lcom/tencent/bugly/proguard/k$b;->a(Lcom/tencent/bugly/proguard/a0;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k;->c:J

    return-wide v0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/Object;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler$Callback;

    .line 4
    new-instance v2, Lcom/tencent/bugly/proguard/k$a;

    invoke-direct {v2, v1, p0}, Lcom/tencent/bugly/proguard/k$a;-><init>(Landroid/os/Handler$Callback;Lcom/tencent/bugly/proguard/k;)V

    iput-object v2, p0, Lcom/tencent/bugly/proguard/k;->d:Lcom/tencent/bugly/proguard/k$a;

    .line 5
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "replaceHandlerCallback, originalCallback: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hackCallback: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/k;->d:Lcom/tencent/bugly/proguard/k$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RMonitor_launch_Hacker"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/Object;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler$Callback;

    .line 4
    iget-object v2, p0, Lcom/tencent/bugly/proguard/k;->d:Lcom/tencent/bugly/proguard/k$a;

    const-string v3, "RMonitor_launch_Hacker"

    if-eqz v2, :cond_0

    if-ne v2, v1, :cond_0

    .line 5
    iget-object v1, v2, Lcom/tencent/bugly/proguard/k$a;->b:Landroid/os/Handler$Callback;

    .line 6
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "resetHandlerCallback success."

    filled-new-array {v3, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-void

    .line 8
    :cond_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "resetHandlerCallback fail for current Callback is not hack Callback"

    filled-new-array {v3, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/k;->b:Z

    return v0
.end method

.method public d()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "RMonitor_launch_Hacker"

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k;->a()Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/k;->b(Ljava/lang/Object;)V

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/k;->b:Z

    .line 13
    .line 14
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v2, "startTrace success."

    .line 18
    .line 19
    .line 20
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    .line 28
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 29
    .line 30
    .line 31
    const-string/jumbo v3, "startTrace fail."

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0, v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    return-void
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

.method public e()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k;->c()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "stopTrace"

    .line 13
    .line 14
    const-string v2, "RMonitor_launch_Hacker"

    .line 15
    .line 16
    .line 17
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k;->a()Ljava/lang/Object;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k;->c(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    .line 32
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 33
    .line 34
    .line 35
    const-string/jumbo v3, "stopTrace fail."

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2, v3, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    :goto_0
    const/4 v0, 0x0

    .line 40
    .line 41
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/k;->b:Z

    .line 42
    const/4 v0, 0x0

    .line 43
    .line 44
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k;->d:Lcom/tencent/bugly/proguard/k$a;

    .line 45
    return-void
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
