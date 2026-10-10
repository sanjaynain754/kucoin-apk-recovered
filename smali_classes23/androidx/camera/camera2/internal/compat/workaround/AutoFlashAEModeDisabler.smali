.class public Landroidx/camera/camera2/internal/compat/workaround/AutoFlashAEModeDisabler;
.super Ljava/lang/Object;
.source "AutoFlashAEModeDisabler.java"


# instance fields
.field private final mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled:Z

.field private final mIsImageCaptureFailWithAutoFlashQuirkEnabled:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/Quirks;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/ImageCaptureFailWithAutoFlashQuirk;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/Quirks;->contains(Ljava/lang/Class;)Z

    .line 9
    move-result p1

    .line 10
    .line 11
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/compat/workaround/AutoFlashAEModeDisabler;->mIsImageCaptureFailWithAutoFlashQuirkEnabled:Z

    .line 12
    .line 13
    const-class p1, Landroidx/camera/camera2/internal/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroidx/camera/camera2/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    .line 24
    :goto_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/compat/workaround/AutoFlashAEModeDisabler;->mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled:Z

    .line 25
    return-void
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
.end method


# virtual methods
.method public getCorrectedAeMode(I)I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/AutoFlashAEModeDisabler;->mIsImageCaptureFailWithAutoFlashQuirkEnabled:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/AutoFlashAEModeDisabler;->mIsCrashWhenTakingPhotoWithAutoFlashAEModeQuirkEnabled:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    :cond_0
    const/4 v0, 0x2

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    const/4 p1, 0x1

    .line 13
    :cond_1
    return p1
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
