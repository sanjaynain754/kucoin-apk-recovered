.class Lcom/tencent/rmonitor/looper/meta/PoolProvider;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final capacity:I

.field private final clz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;",
            ">;"
        }
    .end annotation
.end field

.field private volatile mainThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

.field private volatile otherThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;


# direct methods
.method public constructor <init>(Ljava/lang/Class;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;",
            ">;I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->mainThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->otherThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->clz:Ljava/lang/Class;

    .line 11
    .line 12
    iput p2, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->capacity:I

    .line 13
    return-void
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
.end method

.method private getMainThreadPool()Lcom/tencent/bugly/common/utils/RecyclablePool;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->mainThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->clz:Ljava/lang/Class;

    .line 9
    .line 10
    iget v2, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->capacity:I

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/common/utils/RecyclablePool;-><init>(Ljava/lang/Class;I)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->mainThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->mainThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 18
    return-object v0
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
    .line 82
    .line 83
    .line 84
.end method

.method private getOtherThreadPool()Lcom/tencent/bugly/common/utils/RecyclablePool;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->otherThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->clz:Ljava/lang/Class;

    .line 9
    .line 10
    iget v2, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->capacity:I

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lcom/tencent/bugly/common/utils/RecyclablePool;-><init>(Ljava/lang/Class;I)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->otherThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->otherThreadPool:Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 18
    return-object v0
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
    .line 82
    .line 83
    .line 84
.end method

.method private isMonitoredThreadMainThread()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    if-ne v1, v0, :cond_0

    .line 16
    return v2

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {v0}, Lcom/tencent/bugly/proguard/mg;->a(Ljava/lang/Thread;)Landroid/os/Looper;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    return v2

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0
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
    .line 82
    .line 83
    .line 84
.end method


# virtual methods
.method public getPool()Lcom/tencent/bugly/common/utils/RecyclablePool;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->isMonitoredThreadMainThread()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->getMainThreadPool()Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/meta/PoolProvider;->getOtherThreadPool()Lcom/tencent/bugly/common/utils/RecyclablePool;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
