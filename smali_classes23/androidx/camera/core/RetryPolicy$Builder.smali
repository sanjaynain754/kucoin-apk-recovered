.class public final Landroidx/camera/core/RetryPolicy$Builder;
.super Ljava/lang/Object;
.source "RetryPolicy.java"


# annotations
.annotation build Landroidx/camera/core/ExperimentalRetryPolicy;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/RetryPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final mBasePolicy:Landroidx/camera/core/RetryPolicy;

.field private mTimeoutInMillis:J


# direct methods
.method public constructor <init>(Landroidx/camera/core/RetryPolicy;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/core/RetryPolicy$Builder;->mBasePolicy:Landroidx/camera/core/RetryPolicy;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/camera/core/RetryPolicy;->getTimeoutInMillis()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iput-wide v0, p0, Landroidx/camera/core/RetryPolicy$Builder;->mTimeoutInMillis:J

    .line 12
    return-void
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
.end method


# virtual methods
.method public build()Landroidx/camera/core/RetryPolicy;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/RetryPolicy$Builder;->mBasePolicy:Landroidx/camera/core/RetryPolicy;

    .line 3
    .line 4
    instance-of v1, v0, Landroidx/camera/core/impl/RetryPolicyInternal;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Landroidx/camera/core/impl/RetryPolicyInternal;

    .line 9
    .line 10
    iget-wide v1, p0, Landroidx/camera/core/RetryPolicy$Builder;->mTimeoutInMillis:J

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/RetryPolicyInternal;->copy(J)Landroidx/camera/core/RetryPolicy;

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Landroidx/camera/core/impl/TimeoutRetryPolicy;

    .line 18
    .line 19
    iget-wide v1, p0, Landroidx/camera/core/RetryPolicy$Builder;->mTimeoutInMillis:J

    .line 20
    .line 21
    iget-object v3, p0, Landroidx/camera/core/RetryPolicy$Builder;->mBasePolicy:Landroidx/camera/core/RetryPolicy;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3}, Landroidx/camera/core/impl/TimeoutRetryPolicy;-><init>(JLandroidx/camera/core/RetryPolicy;)V

    .line 25
    return-object v0
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
.end method

.method public setTimeoutInMillis(J)Landroidx/camera/core/RetryPolicy$Builder;
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Landroidx/camera/core/RetryPolicy$Builder;->mTimeoutInMillis:J

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
.end method
