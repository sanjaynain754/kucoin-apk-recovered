.class public Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;
.super Ljava/lang/Object;
.source "OnEnableDisableSessionDurationCheck.java"


# static fields
.field static final MIN_DURATION_FOR_ENABLE_DISABLE_SESSION:J = 0x64L
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "OnEnableDisableSessionDurationCheck"


# instance fields
.field private final mEnabledMinimumDuration:Z

.field private mOnEnableSessionTimeStamp:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-class v0, Landroidx/camera/extensions/internal/compat/quirk/CrashWhenOnDisableTooSoon;

    invoke-static {v0}, Landroidx/camera/extensions/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->mOnEnableSessionTimeStamp:J

    .line 4
    iput-boolean p1, p0, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->mEnabledMinimumDuration:Z

    return-void
.end method

.method private ensureMinDurationAfterOnEnableSession()V
    .locals 6

    .line 1
    .line 2
    const-string v0, "OnEnableDisableSessionDurationCheck"

    .line 3
    .line 4
    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    iget-wide v3, p0, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->mOnEnableSessionTimeStamp:J

    .line 9
    :goto_0
    sub-long/2addr v1, v3

    .line 10
    .line 11
    const-wide/16 v3, 0x64

    .line 12
    .line 13
    cmp-long v5, v1, v3

    .line 14
    .line 15
    if-gez v5, :cond_0

    .line 16
    sub-long/2addr v3, v1

    .line 17
    .line 18
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string/jumbo v2, "onDisableSession too soon, wait "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, " ms"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 49
    move-result-wide v1

    .line 50
    .line 51
    iget-wide v3, p0, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->mOnEnableSessionTimeStamp:J

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :catch_0
    const-string/jumbo v1, "sleep interrupted"

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :cond_0
    return-void
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
.end method


# virtual methods
.method public onDisableSessionInvoked()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->mEnabledMinimumDuration:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->ensureMinDurationAfterOnEnableSession()V

    .line 8
    :cond_0
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
.end method

.method public onEnableSessionInvoked()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->mEnabledMinimumDuration:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    iput-wide v0, p0, Landroidx/camera/extensions/internal/compat/workaround/OnEnableDisableSessionDurationCheck;->mOnEnableSessionTimeStamp:J

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
