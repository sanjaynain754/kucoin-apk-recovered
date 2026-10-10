.class public abstract Lio/trtc/tuikit/atomicxcore/impl/live/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;)Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
    .locals 7

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->userId:Ljava/lang/String;

    const-string/jumbo v2, "userId"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setUserID(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->userName:Ljava/lang/String;

    const-string/jumbo v2, "userName"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setUserName(Ljava/lang/String;)V

    .line 4
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->avatarUrl:Ljava/lang/String;

    const-string v0, "avatarUrl"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->setAvatarURL(Ljava/lang/String;)V

    return-object v1
.end method

.method public static final a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
    .locals 4

    const-string/jumbo v0, "userInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 6
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    const-string/jumbo v2, "userId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    const-string/jumbo v3, "userName"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    const-string v3, "avatarUrl"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {v0, v1, v2, p0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
