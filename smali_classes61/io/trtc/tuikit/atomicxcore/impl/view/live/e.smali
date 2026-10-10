.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfoCallback;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/e;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/e;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 8
    :cond_0
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

.method public final onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/e;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;->onSuccess(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;)V

    .line 14
    :cond_1
    return-void
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
.end method
