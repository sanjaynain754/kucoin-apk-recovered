.class public final Lio/trtc/tuikit/atomicxcore/impl/room/z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/z;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->CAMERA:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    .line 10
    .line 11
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/z;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->fromUser:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 14
    .line 15
    const-string v2, "fromUser"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;->onParticipantDeviceClosed(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;)V

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p1
    .line 29
    .line 30
.end method
