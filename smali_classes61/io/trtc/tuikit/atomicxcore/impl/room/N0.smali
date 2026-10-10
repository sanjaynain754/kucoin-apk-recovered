.class public final Lio/trtc/tuikit/atomicxcore/impl/room/N0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchConferenceInfoCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/N0;->a:Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;

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
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "message"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/N0;->a:Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 18
    move-result p1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 22
    :cond_0
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
.end method

.method public final onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "conference"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/N0;->a:Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;->onSuccess(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;)V

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
.end method
