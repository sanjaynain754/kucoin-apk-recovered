.class public final Landroidx/camera/core/impl/CameraProviderInitRetryPolicy;
.super Ljava/lang/Object;
.source "CameraProviderInitRetryPolicy.java"

# interfaces
.implements Landroidx/camera/core/impl/RetryPolicyInternal;


# annotations
.annotation build Landroidx/camera/core/ExperimentalRetryPolicy;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/CameraProviderInitRetryPolicy$Legacy;
    }
.end annotation


# instance fields
.field private final mDelegatePolicy:Landroidx/camera/core/RetryPolicy;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroidx/camera/core/impl/TimeoutRetryPolicy;

    .line 6
    .line 7
    new-instance v1, Landroidx/camera/core/impl/CameraProviderInitRetryPolicy$1;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/core/impl/CameraProviderInitRetryPolicy$1;-><init>(Landroidx/camera/core/impl/CameraProviderInitRetryPolicy;J)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1, p2, v1}, Landroidx/camera/core/impl/TimeoutRetryPolicy;-><init>(JLandroidx/camera/core/RetryPolicy;)V

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/camera/core/impl/CameraProviderInitRetryPolicy;->mDelegatePolicy:Landroidx/camera/core/RetryPolicy;

    .line 16
    return-void
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
.method public copy(J)Landroidx/camera/core/RetryPolicy;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/CameraProviderInitRetryPolicy;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Landroidx/camera/core/impl/CameraProviderInitRetryPolicy;-><init>(J)V

    .line 6
    return-object v0
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

.method public getTimeoutInMillis()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/CameraProviderInitRetryPolicy;->mDelegatePolicy:Landroidx/camera/core/RetryPolicy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/camera/core/RetryPolicy;->getTimeoutInMillis()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/CameraProviderInitRetryPolicy;->mDelegatePolicy:Landroidx/camera/core/RetryPolicy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/RetryPolicy;->onRetryDecisionRequested(Landroidx/camera/core/RetryPolicy$ExecutionState;)Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
