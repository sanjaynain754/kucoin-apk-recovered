.class public final Lio/trtc/tuikit/atomicxcore/impl/room/s0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

.field public final synthetic b:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/s0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/s0;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/s0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 10
    .line 11
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;->RUNNING:Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lio/trtc/tuikit/atomicxcore/api/room/RoomStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/s0;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;->onCallCancelled(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Lio/trtc/tuikit/atomicxcore/api/room/RoomCall;)V

    .line 25
    .line 26
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
.end method
