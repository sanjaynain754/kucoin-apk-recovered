.class public Landroidx/camera/camera2/internal/compat/workaround/OverrideAeModeForStillCapture;
.super Ljava/lang/Object;
.source "OverrideAeModeForStillCapture.java"


# instance fields
.field private mAePrecaptureStarted:Z

.field private final mHasAutoFlashUnderExposedQuirk:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/Quirks;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/OverrideAeModeForStillCapture;->mAePrecaptureStarted:Z

    .line 7
    .line 8
    const-class v1, Landroidx/camera/camera2/internal/compat/quirk/AutoFlashUnderExposedQuirk;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroidx/camera/core/impl/Quirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    :cond_0
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/OverrideAeModeForStillCapture;->mHasAutoFlashUnderExposedQuirk:Z

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public onAePrecaptureFinished()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/OverrideAeModeForStillCapture;->mAePrecaptureStarted:Z

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
.end method

.method public onAePrecaptureStarted()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/OverrideAeModeForStillCapture;->mAePrecaptureStarted:Z

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
.end method

.method public shouldSetAeModeAlwaysFlash(I)Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/OverrideAeModeForStillCapture;->mAePrecaptureStarted:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/compat/workaround/OverrideAeModeForStillCapture;->mHasAutoFlashUnderExposedQuirk:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
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
