.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

.field public final synthetic b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
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
.end method


# virtual methods
.method public final onFailure(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "desc"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 17
    :cond_0
    return-void
    .line 18
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
.end method

.method public final onSuccess()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoreStateProvider$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 9
    .line 10
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->mediaState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;

    .line 11
    .line 12
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$MediaState;->isMicrophoneMuted:Landroidx/lifecycle/LiveData;

    .line 13
    .line 14
    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    .line 20
    .line 21
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y;->b:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onSuccess()V

    .line 32
    :cond_0
    return-void
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
    .line 106
    .line 107
.end method
