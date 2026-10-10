.class public final Landroidx/camera/core/impl/TimeoutRetryPolicy;
.super Ljava/lang/Object;
.source "TimeoutRetryPolicy.java"

# interfaces
.implements Landroidx/camera/core/RetryPolicy;


# annotations
.annotation build Landroidx/camera/core/ExperimentalRetryPolicy;
.end annotation


# instance fields
.field private final mDelegatePolicy:Landroidx/camera/core/RetryPolicy;

.field private final mTimeoutInMillis:J


# direct methods
.method public constructor <init>(JLandroidx/camera/core/RetryPolicy;)V
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
    cmp-long v0, p1, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    const-string v1, "Timeout must be non-negative."

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 18
    .line 19
    iput-wide p1, p0, Landroidx/camera/core/impl/TimeoutRetryPolicy;->mTimeoutInMillis:J

    .line 20
    .line 21
    iput-object p3, p0, Landroidx/camera/core/impl/TimeoutRetryPolicy;->mDelegatePolicy:Landroidx/camera/core/RetryPolicy;

    .line 22
    return-void
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
.end method


# virtual methods
.method public getTimeoutInMillis()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/camera/core/impl/TimeoutRetryPolicy;->mTimeoutInMillis:J

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

.method public onRetryDecisionRequested(Landroidx/camera/core/RetryPolicy$ExecutionState;)Landroidx/camera/core/RetryPolicy$RetryConfig;
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/TimeoutRetryPolicy;->mDelegatePolicy:Landroidx/camera/core/RetryPolicy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/RetryPolicy;->onRetryDecisionRequested(Landroidx/camera/core/RetryPolicy$ExecutionState;)Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/camera/core/impl/TimeoutRetryPolicy;->getTimeoutInMillis()J

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long v1, v1, v3

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Landroidx/camera/core/RetryPolicy$ExecutionState;->getExecutedTimeInMillis()J

    .line 20
    move-result-wide v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/camera/core/impl/TimeoutRetryPolicy;->getTimeoutInMillis()J

    .line 24
    move-result-wide v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/camera/core/RetryPolicy$RetryConfig;->getRetryDelayInMillis()J

    .line 28
    move-result-wide v5

    .line 29
    sub-long/2addr v3, v5

    .line 30
    .line 31
    cmp-long p1, v1, v3

    .line 32
    .line 33
    if-ltz p1, :cond_0

    .line 34
    .line 35
    sget-object p1, Landroidx/camera/core/RetryPolicy$RetryConfig;->NOT_RETRY:Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 36
    return-object p1

    .line 37
    :cond_0
    return-object v0
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
.end method
