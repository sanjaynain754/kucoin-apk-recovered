.class public abstract Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0007\u001a\u00020\u0008H&J\u0008\u0010\t\u001a\u00020\u0008H&J\u001a\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0008\u0010\u0010\u001a\u00020\u0008H&J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0015\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u0019H \u00a2\u0006\u0002\u0008\u001aJ\u0010\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0016H&J\u001a\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0008\u0010\u001f\u001a\u00020\u0008H&J\u0008\u0010 \u001a\u00020\u0008H&J\u0008\u0010!\u001a\u00020\u0008H&J\u0010\u0010\"\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u000cH&J\u0010\u0010#\u001a\u00020\u00082\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020(H&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006*"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;",
        "",
        "()V",
        "deviceState",
        "Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;",
        "getDeviceState",
        "()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;",
        "closeLocalCamera",
        "",
        "closeLocalMicrophone",
        "openLocalCamera",
        "isFront",
        "",
        "completion",
        "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;",
        "openLocalMicrophone",
        "reset",
        "setAudioRoute",
        "audioRoute",
        "Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;",
        "setCaptureVolume",
        "volume",
        "",
        "setFocus",
        "owner",
        "Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;",
        "setFocus$atomicxcore_release",
        "setOutputVolume",
        "startCameraTest",
        "cameraView",
        "Lio/trtc/tuikit/atomicxcore/api/view/CameraView;",
        "startScreenShare",
        "stopCameraTest",
        "stopScreenShare",
        "switchCamera",
        "switchMirror",
        "mirrorType",
        "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;",
        "updateVideoQuality",
        "quality",
        "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;",
        "Companion",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 21
.end method

.method public static final shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method


# virtual methods
.method public abstract closeLocalCamera()V
.end method

.method public abstract closeLocalMicrophone()V
.end method

.method public abstract getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract openLocalCamera(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract openLocalMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract reset()V
.end method

.method public abstract setAudioRoute(Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setCaptureVolume(I)V
.end method

.method public abstract setFocus$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setOutputVolume(I)V
.end method

.method public abstract startCameraTest(Lio/trtc/tuikit/atomicxcore/api/view/CameraView;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/view/CameraView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract startScreenShare()V
.end method

.method public abstract stopCameraTest()V
.end method

.method public abstract stopScreenShare()V
.end method

.method public abstract switchCamera(Z)V
.end method

.method public abstract switchMirror(Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract updateVideoQuality(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)V
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
