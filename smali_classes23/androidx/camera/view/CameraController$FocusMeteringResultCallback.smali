.class Landroidx/camera/view/CameraController$FocusMeteringResultCallback;
.super Ljava/lang/Object;
.source "CameraController.java"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/CameraController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FocusMeteringResultCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback<",
        "Landroidx/camera/core/FocusMeteringResult;",
        ">;"
    }
.end annotation


# instance fields
.field private mIsCanceled:Z

.field private final mLock:Ljava/lang/Object;

.field private final mTapPoint:Landroid/graphics/PointF;

.field private final mTapToFocusInfoState:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Landroidx/camera/view/TapToFocusInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/PointF;Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/PointF;",
            "Landroidx/lifecycle/MutableLiveData<",
            "Landroidx/camera/view/TapToFocusInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mIsCanceled:Z

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mLock:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapPoint:Landroid/graphics/PointF;

    .line 16
    .line 17
    iput-object p2, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapToFocusInfoState:Landroidx/lifecycle/MutableLiveData;

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
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    .line 6
    :try_start_0
    iput-boolean v1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mIsCanceled:Z

    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mIsCanceled:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    instance-of v1, p1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v1, "CameraController"

    .line 18
    .line 19
    const-string v2, "Tap-to-focus canceled"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    iget-object p1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapToFocusInfoState:Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    new-instance v1, Landroidx/camera/view/TapToFocusInfo;

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v3}, Landroidx/camera/view/TapToFocusInfo;-><init>(ILandroid/graphics/PointF;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->close()V

    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    .line 41
    :cond_1
    const-string v1, "CameraController"

    .line 42
    .line 43
    const-string v2, "Tap-to-focus failed."

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapToFocusInfoState:Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    new-instance v1, Landroidx/camera/view/TapToFocusInfo;

    .line 51
    .line 52
    iget-object v2, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapPoint:Landroid/graphics/PointF;

    .line 53
    const/4 v3, 0x4

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v3, v2}, Landroidx/camera/view/TapToFocusInfo;-><init>(ILandroid/graphics/PointF;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    throw p1
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

.method public onSuccess(Landroidx/camera/core/FocusMeteringResult;)V
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mIsCanceled:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_1
    const-string v1, "CameraController"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Tap-to-focus onSuccess: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroidx/camera/core/FocusMeteringResult;->isFocusSuccessful()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapToFocusInfoState:Landroidx/lifecycle/MutableLiveData;

    new-instance v2, Landroidx/camera/view/TapToFocusInfo;

    .line 7
    invoke-virtual {p1}, Landroidx/camera/core/FocusMeteringResult;->isFocusSuccessful()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    goto :goto_0

    :cond_2
    const/4 p1, 0x3

    .line 8
    :goto_0
    iget-object v3, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapPoint:Landroid/graphics/PointF;

    invoke-direct {v2, p1, v3}, Landroidx/camera/view/TapToFocusInfo;-><init>(ILandroid/graphics/PointF;)V

    .line 9
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 10
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/camera/core/FocusMeteringResult;

    invoke-virtual {p0, p1}, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->onSuccess(Landroidx/camera/core/FocusMeteringResult;)V

    return-void
.end method

.method public resetStateAndClose()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mIsCanceled:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    const-string v1, "CameraController"

    .line 14
    .line 15
    const-string v2, "Tap-to-focus reset."

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mTapToFocusInfoState:Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    new-instance v2, Landroidx/camera/view/TapToFocusInfo;

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v3, v4}, Landroidx/camera/view/TapToFocusInfo;-><init>(ILandroid/graphics/PointF;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 31
    const/4 v1, 0x1

    .line 32
    .line 33
    iput-boolean v1, p0, Landroidx/camera/view/CameraController$FocusMeteringResultCallback;->mIsCanceled:Z

    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw v1
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
