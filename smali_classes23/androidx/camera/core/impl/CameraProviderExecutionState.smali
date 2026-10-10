.class public final Landroidx/camera/core/impl/CameraProviderExecutionState;
.super Ljava/lang/Object;
.source "CameraProviderExecutionState.java"

# interfaces
.implements Landroidx/camera/core/RetryPolicy$ExecutionState;


# annotations
.annotation build Landroidx/camera/core/ExperimentalRetryPolicy;
.end annotation


# instance fields
.field private final mAttemptCount:I

.field private final mCause:Ljava/lang/Throwable;

.field private final mStatus:I

.field private final mTaskExecutedTimeInMillis:J


# direct methods
.method public constructor <init>(JILjava/lang/Throwable;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    move-result-wide v0

    .line 8
    sub-long/2addr v0, p1

    .line 9
    .line 10
    iput-wide v0, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mTaskExecutedTimeInMillis:J

    .line 11
    .line 12
    iput p3, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mAttemptCount:I

    .line 13
    .line 14
    instance-of p1, p4, Landroidx/camera/core/impl/CameraValidator$CameraIdListIncorrectException;

    .line 15
    const/4 p2, 0x2

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iput p2, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mStatus:I

    .line 20
    .line 21
    iput-object p4, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mCause:Ljava/lang/Throwable;

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    instance-of p1, p4, Landroidx/camera/core/InitializationException;

    .line 25
    const/4 p3, 0x0

    .line 26
    .line 27
    if-eqz p1, :cond_4

    .line 28
    .line 29
    .line 30
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    move-object p4, p1

    .line 35
    .line 36
    :cond_1
    iput-object p4, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mCause:Ljava/lang/Throwable;

    .line 37
    .line 38
    instance-of p1, p4, Landroidx/camera/core/CameraUnavailableException;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iput p2, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mStatus:I

    .line 43
    return-void

    .line 44
    .line 45
    :cond_2
    instance-of p1, p4, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    const/4 p1, 0x1

    .line 49
    .line 50
    iput p1, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mStatus:I

    .line 51
    return-void

    .line 52
    .line 53
    :cond_3
    iput p3, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mStatus:I

    .line 54
    return-void

    .line 55
    .line 56
    :cond_4
    iput p3, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mStatus:I

    .line 57
    .line 58
    iput-object p4, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mCause:Ljava/lang/Throwable;

    .line 59
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
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mCause:Ljava/lang/Throwable;

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
    .line 18
    .line 19
    .line 20
.end method

.method public getExecutedTimeInMillis()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mTaskExecutedTimeInMillis:J

    .line 3
    return-wide v0
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
.end method

.method public getNumOfAttempts()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mAttemptCount:I

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
    .line 18
    .line 19
    .line 20
.end method

.method public getStatus()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/camera/core/impl/CameraProviderExecutionState;->mStatus:I

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
    .line 18
    .line 19
    .line 20
.end method
