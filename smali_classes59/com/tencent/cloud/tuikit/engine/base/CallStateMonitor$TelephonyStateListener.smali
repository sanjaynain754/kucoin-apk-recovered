.class Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;
.super Landroid/telephony/PhoneStateListener;
.source "CallStateMonitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TelephonyStateListener"
.end annotation


# instance fields
.field private final CALL_END_TIMEOUT_MS:J

.field private mCallEndTimeoutTask:Ljava/lang/Runnable;

.field private final mHandler:Landroid/os/Handler;

.field private final mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

.field final synthetic this$0:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->this$0:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 6
    .line 7
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    const-wide/16 v0, 0x5

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 13
    move-result-wide v0

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->CALL_END_TIMEOUT_MS:J

    .line 16
    .line 17
    new-instance p1, Landroid/os/Handler;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mHandler:Landroid/os/Handler;

    .line 27
    .line 28
    iput-object p2, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic access$100(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->cancelCallEndTimeout()V

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
.end method

.method public static synthetic access$200(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;)Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

    .line 3
    return-object p0
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

.method private cancelCallEndTimeout()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mCallEndTimeoutTask:Ljava/lang/Runnable;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mHandler:Landroid/os/Handler;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mCallEndTimeoutTask:Ljava/lang/Runnable;

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private scheduleCallEndTimeout()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->cancelCallEndTimeout()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener$1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener$1;-><init>(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mCallEndTimeoutTask:Ljava/lang/Runnable;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mHandler:Landroid/os/Handler;

    .line 13
    .line 14
    iget-wide v2, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->CALL_END_TIMEOUT_MS:J

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

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


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onCallStateChanged(ILjava/lang/String;)V

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    const/4 p2, 0x2

    .line 7
    .line 8
    if-eq p1, p2, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

    .line 12
    const/4 p2, 0x3

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p2}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;->onCallStateChanged(I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->scheduleCallEndTimeout()V

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->cancelCallEndTimeout()V

    .line 23
    .line 24
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$TelephonyStateListener;->mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

    .line 25
    const/4 p2, 0x4

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, p2}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;->onCallStateChanged(I)V

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
