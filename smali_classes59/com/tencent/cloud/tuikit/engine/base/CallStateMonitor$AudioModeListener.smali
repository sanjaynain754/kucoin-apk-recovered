.class Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;
.super Ljava/lang/Object;
.source "CallStateMonitor.java"

# interfaces
.implements Landroid/media/AudioManager$OnModeChangedListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AudioModeListener"
.end annotation


# instance fields
.field private mInCall:Z

.field private final mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;->mInCall:Z

    .line 7
    .line 8
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;->mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

    .line 9
    return-void
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


# virtual methods
.method public onModeChanged(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    if-eq p1, v1, :cond_1

    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;->mInCall:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;->mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

    .line 13
    const/4 v0, 0x4

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;->onCallStateChanged(I)V

    .line 17
    const/4 p1, 0x0

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;->mInCall:Z

    .line 20
    :cond_0
    return-void

    .line 21
    .line 22
    :cond_1
    iput-boolean v0, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;->mInCall:Z

    .line 23
    .line 24
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$AudioModeListener;->mListener:Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;

    .line 25
    const/4 v0, 0x3

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0}, Lcom/tencent/cloud/tuikit/engine/base/CallStateMonitor$CallStateListener;->onCallStateChanged(I)V

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
