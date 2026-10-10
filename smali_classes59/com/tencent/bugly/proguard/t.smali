.class public Lcom/tencent/bugly/proguard/t;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static c:Lcom/tencent/bugly/proguard/t;

.field public static d:Ljava/lang/Object;


# instance fields
.field public a:Lcom/tencent/bugly/proguard/sc;

.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/t;->d:Ljava/lang/Object;

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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/sc;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/sc;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t;->a:Lcom/tencent/bugly/proguard/sc;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/t;->b:Z

    .line 18
    return-void
    .line 19
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

.method public static a()Lcom/tencent/bugly/proguard/t;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/t;->c:Lcom/tencent/bugly/proguard/t;

    if-nez v0, :cond_1

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/t;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/t;->c:Lcom/tencent/bugly/proguard/t;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/t;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/t;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/t;->c:Lcom/tencent/bugly/proguard/t;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/t;->c:Lcom/tencent/bugly/proguard/t;

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 7
    sget-object p1, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher;->Companion:Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;

    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/t;->a:Lcom/tencent/bugly/proguard/sc;

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;->register(Landroid/os/Looper;Lcom/tencent/bugly/common/looper/ILooperDispatchListener;)V

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/t;->b:Z

    return-void

    .line 10
    :cond_0
    sget-object p1, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher;->Companion:Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;

    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/t;->a:Lcom/tencent/bugly/proguard/sc;

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;->unregister(Landroid/os/Looper;Lcom/tencent/bugly/common/looper/ILooperDispatchListener;)V

    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/t;->b:Z

    return-void
.end method

.method public b()Lcom/tencent/bugly/proguard/sc;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/t;->a:Lcom/tencent/bugly/proguard/sc;

    .line 3
    return-object v0
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

.method public c()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/t;->b:Z

    .line 3
    return v0
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
