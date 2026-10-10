.class Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav"
.end annotation


# instance fields
.field private mNativePlatformDispatcherTask:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->mNativePlatformDispatcherTask:J

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

.method private destroyTask(J)V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->nativeDestroyTask(J)V

    .line 10
    :cond_0
    return-void
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

.method public static getMainHandler()Landroid/os/Handler;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static native nativeDestroyTask(J)V
.end method

.method private static native nativeOnTaskFineshed(JLcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;)V
.end method

.method private static native nativeRunTask(J)V
.end method


# virtual methods
.method public finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->mNativePlatformDispatcherTask:J

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->destroyTask(J)V

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->mNativePlatformDispatcherTask:J

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public resetTask(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->mNativePlatformDispatcherTask:J

    .line 3
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public run()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->mNativePlatformDispatcherTask:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->mNativePlatformDispatcherTask:J

    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->nativeRunTask(J)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p0}, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->nativeOnTaskFineshed(JLcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/base/dispatcher/PlatformDispatcherTask;->destroyTask(J)V

    .line 20
    :cond_0
    return-void
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
