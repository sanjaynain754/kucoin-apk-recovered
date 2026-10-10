.class public final Lcom/tencent/bugly/proguard/ge;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ge$c;,
        Lcom/tencent/bugly/proguard/ge$b;,
        Lcom/tencent/bugly/proguard/ge$d;,
        Lcom/tencent/bugly/proguard/ge$f;,
        Lcom/tencent/bugly/proguard/ge$e;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "Bugly.PowerHooker"

.field public static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ge$d;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Z

.field public static d:Lcom/tencent/bugly/proguard/ug$b;

.field public static e:Lcom/tencent/bugly/proguard/ug;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/bugly/proguard/ge$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ge$a;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/proguard/ge;->d:Lcom/tencent/bugly/proguard/ug$b;

    .line 15
    .line 16
    new-instance v1, Lcom/tencent/bugly/proguard/ug;

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "power"

    .line 20
    .line 21
    const-string v3, "android.os.IPowerManager"

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2, v3, v0}, Lcom/tencent/bugly/proguard/ug;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/ug$b;)V

    .line 25
    .line 26
    sput-object v1, Lcom/tencent/bugly/proguard/ge;->e:Lcom/tencent/bugly/proguard/ug;

    .line 27
    return-void
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

.method public static a()V
    .locals 3

    .line 5
    sget-boolean v0, Lcom/tencent/bugly/proguard/ge;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/ge;->e:Lcom/tencent/bugly/proguard/ug;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ug;->a()Z

    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Bugly.PowerHooker"

    const-string v2, "checkHook hookRet:%b"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Lcom/tencent/bugly/proguard/ge;->c:Z

    return-void
.end method

.method public static declared-synchronized a(Lcom/tencent/bugly/proguard/ge$d;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/ge;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    .line 2
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    .line 3
    :cond_1
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/ge;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static synthetic a(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ge;->b(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    return-void
.end method

.method public static a([Ljava/lang/Object;)V
    .locals 7

    .line 10
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ge$c;->a([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$b;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 11
    new-array p0, v0, [Ljava/lang/Object;

    const-string v0, "Bugly.PowerHooker"

    const-string v1, "dispatchAcquireWakeLock AcquireWakeLockArgs null"

    invoke-static {v0, v1, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_0
    const-class v1, Lcom/tencent/bugly/proguard/ge;

    monitor-enter v1

    .line 13
    :try_start_0
    new-instance v2, Lcom/tencent/bugly/proguard/gi;

    invoke-direct {v2}, Lcom/tencent/bugly/proguard/gi;-><init>()V

    .line 14
    iget v3, p0, Lcom/tencent/bugly/proguard/ge$b;->b:I

    iput v3, v2, Lcom/tencent/bugly/proguard/gi;->j:I

    .line 15
    iget-object v3, p0, Lcom/tencent/bugly/proguard/ge$b;->c:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/bugly/proguard/gi;->k:Ljava/lang/String;

    .line 16
    iget-object v3, p0, Lcom/tencent/bugly/proguard/ge$b;->a:Landroid/os/IBinder;

    iput-object v3, v2, Lcom/tencent/bugly/proguard/gi;->l:Landroid/os/IBinder;

    .line 17
    :goto_0
    sget-object v3, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 18
    sget-object v3, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/ge$d;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/ge$b;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/tencent/bugly/proguard/ge$b;->e:Landroid/os/WorkSource;

    iget-object v6, p0, Lcom/tencent/bugly/proguard/ge$b;->f:Ljava/lang/String;

    invoke-interface {v3, v2, v4, v5, v6}, Lcom/tencent/bugly/proguard/ge$d;->a(Lcom/tencent/bugly/proguard/gi;Ljava/lang/String;Landroid/os/WorkSource;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 19
    :cond_1
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b()V
    .locals 3

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/ge;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 5
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/ge;->e:Lcom/tencent/bugly/proguard/ug;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ug;->b()Z

    move-result v0

    .line 6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Bugly.PowerHooker"

    const-string v2, "checkUnHook unHookRet:%b"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 7
    sput-boolean v0, Lcom/tencent/bugly/proguard/ge;->c:Z

    return-void
.end method

.method public static declared-synchronized b(Lcom/tencent/bugly/proguard/ge$d;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/ge;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    .line 1
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/ge;->b()V
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

.method public static b(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 2

    .line 8
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "acquireWakeLock"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/ge;->a([Ljava/lang/Object;)V

    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "releaseWakeLock"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 11
    invoke-static {p1}, Lcom/tencent/bugly/proguard/ge;->b([Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static b([Ljava/lang/Object;)V
    .locals 5

    .line 12
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ge$f;->a([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$e;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 13
    new-array p0, v0, [Ljava/lang/Object;

    const-string v0, "Bugly.PowerHooker"

    const-string v1, "dispatchReleaseWakeLock AcquireWakeLockArgs null"

    invoke-static {v0, v1, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 14
    :cond_0
    const-class v1, Lcom/tencent/bugly/proguard/ge;

    monitor-enter v1

    .line 15
    :goto_0
    :try_start_0
    sget-object v2, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 16
    sget-object v2, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/ge$d;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/ge$e;->a:Landroid/os/IBinder;

    iget v4, p0, Lcom/tencent/bugly/proguard/ge$e;->b:I

    invoke-interface {v2, v3, v4}, Lcom/tencent/bugly/proguard/ge$d;->a(Landroid/os/IBinder;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 17
    :cond_1
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static declared-synchronized c()V
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/ge;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/ge;->b:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/ge;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v1
    .line 17
.end method
