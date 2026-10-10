.class public Landroidx/camera/core/internal/compat/workaround/CaptureFailedRetryEnabler;
.super Ljava/lang/Object;
.source "CaptureFailedRetryEnabler.java"


# instance fields
.field private final mCaptureFailedRetryQuirk:Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-class v0, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Landroidx/camera/core/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/camera/core/internal/compat/workaround/CaptureFailedRetryEnabler;->mCaptureFailedRetryQuirk:Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method


# virtual methods
.method public getRetryCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/internal/compat/workaround/CaptureFailedRetryEnabler;->mCaptureFailedRetryQuirk:Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->getRetryCount()I

    .line 10
    move-result v0

    .line 11
    return v0
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
