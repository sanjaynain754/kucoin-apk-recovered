.class public abstract Lio/trtc/tuikit/atomicxcore/impl/view/live/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
    .locals 2

    .line 1
    .line 2
    const-string v0, "liveUserInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserName()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 29
    return-object v0
    .line 30
.end method
