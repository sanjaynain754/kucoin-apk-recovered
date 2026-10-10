.class public Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;
.super Ljava/lang/Object;
.source "SystemInfoAndroid.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::engine::basic"
.end annotation


# instance fields
.field private mCallStateMonitor:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;

.field private mHandler:Landroid/os/Handler;

.field private mIsBackground:Z

.field private mLastCallState:I

.field private mNativeSystemInfo:J


# direct methods
.method public constructor <init>(J)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mLastCallState:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mIsBackground:Z

    .line 9
    .line 10
    new-instance v0, Landroid/os/Handler;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mHandler:Landroid/os/Handler;

    .line 20
    .line 21
    iput-wide p1, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mNativeSystemInfo:J

    .line 22
    .line 23
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/base/f;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcom/tencent/cloud/tuikit/engine/base/f;-><init>(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 30
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor;->getInstance()Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor;

    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor;->setBackgroundStateListener(Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor$BackgroundStateListener;)V

    .line 12
    .line 13
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mCallStateMonitor:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;->destroy()V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic b(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->onAppBackgroundStateChanged(Z)V

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
.end method

.method public static synthetic c(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->onCallStateChanged(I)V

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
.end method

.method public static synthetic d(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor;->getInstance()Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/base/c;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/tencent/cloud/tuikit/engine/base/c;-><init>(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor;->setBackgroundStateListener(Lcom/tencent/cloud/tuikit/engine/base/AppStateMonitor$BackgroundStateListener;)V

    .line 16
    .line 17
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;

    .line 18
    .line 19
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/base/d;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/tencent/cloud/tuikit/engine/base/d;-><init>(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;-><init>(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;)V

    .line 26
    .line 27
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mCallStateMonitor:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;

    .line 28
    return-void
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
.end method

.method public static getModel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getModel()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static getSystemOSVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersion()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method private static native nativeOnAppBackgroundStateChanged(JI)V
.end method

.method private static native nativeOnSystemCallStateChanged(JI)V
.end method

.method private runOnMainThread(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mHandler:Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public destroy()V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mNativeSystemInfo:J

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/base/e;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/base/e;-><init>(Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public onAppBackgroundStateChanged(Z)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mIsBackground:Z

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mIsBackground:Z

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mNativeSystemInfo:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->nativeOnAppBackgroundStateChanged(JI)V

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
.end method

.method public onCallStateChanged(I)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mLastCallState:I

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iput p1, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mLastCallState:I

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->mNativeSystemInfo:J

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/base/SystemInfoAndroid;->nativeOnSystemCallStateChanged(JI)V

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
.end method
